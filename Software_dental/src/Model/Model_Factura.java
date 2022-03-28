package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Model_Factura extends Factura {

    ConexionPg conVentas = new ConexionPg();

    public Model_Factura() {
    }

    public Model_Factura(String serieFac, String nombres, String direccion, String tratamiento, Date fecha, int cantidad, double total) {
        super(serieFac, nombres, direccion, tratamiento, fecha, cantidad, total);
    }

    public String NumSerie() {
        String sql = "SELECT MAX(serie) FROM factura";
        String serie = "";
        try {
            ResultSet rs = conVentas.consulta(sql);
            while (rs.next()) {
                serie = rs.getString(1);
            }
        } catch (SQLException e) {
            System.out.println("ERROR GENERAR SERIE");

        }
        return serie;
    }

    public boolean GuardarFactura(Factura fac) {
        try {
            System.out.println("INGRESA GUARDAR FACTURA");
            String sql = "INSERT INTO factura(serie,paciente,direccion,tratamiento,fecha,cantidad,total) ";
            sql += " VALUES(?,?,?,?,?,?,?) ";

            PreparedStatement ps = conVentas.GetCon().prepareStatement(sql);
            ps.setString(1, fac.getSerieFac());
            ps.setString(2, fac.getNombres());
            ps.setString(3, fac.getDireccion());
            ps.setString(4, fac.getTratamiento());
            ps.setDate(5, fac.getFecha());
            ps.setInt(6, fac.getCantidad());
            ps.setDouble(7, fac.getTotal());
            ps.executeUpdate();
            System.out.println("EJECUTA GUARDAR FACTURA");
            return true;

        } catch (SQLException e) {
            System.out.println("NO SE PUEDE EJECUTAR GUARDAR FACTURA " + e);
            return false;

        }
    }

    public List<Paciente> cargartxtsobrantes(String cedula) {
        List<Paciente> milistapaci = new ArrayList<Paciente>();
        String sql3;

        try {
            sql3 = "select p.nombres , p.apellidos , p.direccion , pac.id_paciente from  persona p , paciente pac  WHERE   pac.cedula_pac = p.cedula AND pac.cedula_pac = '" + cedula + "'  ";
            ResultSet rs = conVentas.consulta(sql3);

            // barremos el resulset
            while (rs.next()) {
                Paciente pac = new Paciente();

                pac.setNombres(rs.getString("nombres"));
                pac.setApellidos(rs.getString("apellidos"));
                pac.setDireccion(rs.getString("direccion"));
                pac.setId_paciente(rs.getString("id_paciente"));
                milistapaci.add(pac);

            }
            return milistapaci;
        } catch (SQLException ex) {
            System.out.println(ex);
            Logger.getLogger(Model_Paciente.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }
}
