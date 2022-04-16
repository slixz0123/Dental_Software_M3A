package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Model_Factura extends Factura {

    ConexionPg conVentas = new ConexionPg();

    public Model_Factura() {
    }

    public Model_Factura(int idDetalle, double totalprod, double preciounit, String serieFac, String nombres, String direccion, String tratamiento, String fecha, int cantidad, double total) {
        super(idDetalle, totalprod, preciounit, serieFac, nombres, direccion, tratamiento, fecha, cantidad, total);
    }
    

    public String NumSerie() {
        String sql = "SELECT MAX(serie) FROM factura";
        String serie = "";
        try {
            ResultSet rs = conVentas.consulta(sql);
            while (rs.next()) {
                serie = rs.getString(1);
            }
            rs.close();
        } catch (SQLException e) {
            System.out.println("ERROR GENERAR SERIE");

        }
        return serie;
    }

    public int IdFactura() {
        int idf = 0;
        String sql = "SELECT MAX(iddetalle) FROM detalle_factura";
        try {
            ResultSet rs = conVentas.consulta(sql);
            while (rs.next()) {
                idf = rs.getInt(1) + 1;
            }
            rs.close();
        } catch (SQLException e) {
            System.out.println("Error idfactura " + e);

        }
        return idf;

    }

    public boolean Actualizarprecio(double precio, String serie) {
        String sql = "UPDATE factura SET total ='" + precio + "' WHERE serie ='" + serie + "'";
        return conVentas.accion(sql);

    }

    public boolean eliminarTratamiento(String nomtrat, String idfact) {
        String sqle = "DELETE FROM detalle_factura WHERE tratamiento='" + nomtrat + "' AND idfactura = '"+idfact+"'";
        return conVentas.accion(sqle);
    }

    public boolean GuardarFactura(Factura fac) {
        try {
            System.out.println("INGRESA GUARDAR FACTURA");
            String sql = "INSERT INTO factura(serie,paciente,direccion,fecha,total) ";
            sql += " VALUES(?,?,?,?,?) ";

            PreparedStatement ps = conVentas.Con().prepareStatement(sql);
            ps.setString(1, fac.getSerieFac());
            ps.setString(2, fac.getNombres());
            ps.setString(3, fac.getDireccion());
            ps.setString(4, fac.getFecha());
            ps.setDouble(5, fac.getTotal());
            ps.executeUpdate();
            conVentas.desconectar();
            System.out.println("EJECUTA GUARDAR FACTURA");
            return true;

        } catch (SQLException e) {
            System.out.println("NO SE PUEDE EJECUTAR GUARDAR FACTURA " + e);
            return false;

        }
    }

    public boolean GuardarDetalleFactura(Factura fac) {
        try {
            System.out.println("INGRESA GUARDAR FACTURA");
            String sql = "INSERT INTO detalle_factura(iddetalle,idfactura,tratamiento,cantidad,preciounit,total) VALUES(?,?,?,?,?,?) ";
            PreparedStatement ps = conVentas.Con().prepareStatement(sql);
            ps.setInt(1, fac.getIdDetalle());
            ps.setString(2, fac.getSerieFac());
            ps.setString(3, fac.getTratamiento());
            ps.setInt(4, fac.getCantidad());
            ps.setDouble(5, fac.getPreciounit());
            ps.setDouble(6, fac.getTotalprod());
            ps.executeUpdate();
            conVentas.desconectar();
            System.out.println("EJECUTA GUARDAR DETALLEFACTURA");
            return true;

        } catch (SQLException e) {
            System.out.println("NO SE PUEDE EJECUTAR GUARDAR DETALLEFACTURA " + e);
            return false;

        }
    }

    public List<Paciente> cargartxtsobrantes(String cedula) {
        List<Paciente> milistapaci = new ArrayList<Paciente>();
        String sql3;

        try {
            sql3 = "select p.nombres , p.apellidos, p.direccion , p.celular, pac.id_paciente from  persona p , paciente pac  WHERE   pac.cedula_pac = p.cedula AND pac.cedula_pac = '" + cedula + "'  ";
            ResultSet rs = conVentas.consulta(sql3);

            // barremos el resulset
            while (rs.next()) {
                Paciente pac = new Paciente();
                pac.setNombres(rs.getString("nombres"));
                pac.setApellidos(rs.getString("apellidos"));
                pac.setDireccion(rs.getString("direccion"));
                pac.setId_paciente(rs.getString("id_paciente"));
                pac.setCelular(rs.getString("celular"));
                milistapaci.add(pac);

            }
            rs.close();
            return milistapaci;
        } catch (SQLException ex) {
            System.out.println(ex);
            Logger.getLogger(Model_Paciente.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }
}
