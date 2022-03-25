package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;


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
    

}
