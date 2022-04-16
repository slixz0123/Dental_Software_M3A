package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Model_Proforma extends Proforma {

    ConexionPg conProf = new ConexionPg();

    public Model_Proforma() {
    }

    public Model_Proforma(int idDetProf, double totalprod, double preciounit, String serieProf, String cedula, String tratamiento, String fecha, int cantidad, double total, String formaPago, String observaciones, double saldo, double cuotaini, int mesecredit, double valorcuotamen) {
        super(idDetProf, totalprod, preciounit, serieProf, cedula, tratamiento, fecha, cantidad, total, formaPago, observaciones, saldo, cuotaini, mesecredit, valorcuotamen);
    }

    public String NumSerie() {
        String sql = "SELECT MAX(id) FROM proforma";
        String serie = "";
        try {
            ResultSet rs = conProf.consulta(sql);
            while (rs.next()) {
                serie = rs.getString(1);
            }
            rs.close();
        } catch (SQLException e) {
            System.out.println("ERROR GENERAR SERIE");

        }
        return serie;
    }

    public int IdProforma() {
        int idf = 0;
        String sql = "SELECT MAX(iddetalle) FROM detalle_proforma";
        try {
            ResultSet rs = conProf.consulta(sql);
            while (rs.next()) {
                idf = rs.getInt(1) + 1;
            }
            rs.close();
        } catch (SQLException e) {
            System.out.println("Error idproforma " + e);

        }
 
        return idf;

    }

    public boolean Actualizarprecio(double precio, String id) {
        String sql = "UPDATE proforma SET total ='" + precio + "' WHERE id ='" + id + "'";
        return conProf.accion(sql);

    }

    public boolean eliminarTratamiento(String nomtrat, String iddet) {
        String sqle = "DELETE FROM detalle_proforma WHERE tratamiento='" + nomtrat + "' AND iddetalle = '" + iddet + "'";
        return conProf.accion(sqle);
    }

    public boolean GuardarProforma(Proforma pro) {
        try {
            System.out.println("INGRESA GUARDAR PROFORMA");
            String sql = "INSERT INTO proforma(id,cedulapac,total,fecha,observaciones,formapago,cuotainicial,saldo,mesescred,valorcuotamensual) ";
            sql += " VALUES(?,?,?,?,?,?,?,?,?,?) ";

            PreparedStatement ps = conProf.Con().prepareStatement(sql);
            ps.setString(1, pro.getSerieProf());
            ps.setString(2, pro.getCedula());
            ps.setDouble(3, pro.getTotal());
            ps.setString(4, pro.getFecha());
            ps.setString(5, pro.getObservaciones());
            ps.setString(6, pro.getFormaPago());
            ps.setDouble(7, pro.getCuotaini());
            ps.setDouble(8, pro.getSaldo());
            ps.setInt(9, pro.getMesecredit());
            ps.setDouble(10, pro.getValorcuotamen());
            ps.executeUpdate();
            System.out.println("EJECUTA GUARDAR PROFORMA");
            conProf.desconectar();
            return true;

        } catch (SQLException e) {
            System.out.println("NO SE PUEDE EJECUTAR GUARDAR PROFORMA " + e);
            return false;

        }
    }

    public boolean GuardarDetalleProforma(Proforma pro) {
        try {
            System.out.println("INGRESA GUARDAR DETALLEPROFORMA");
            String sql = "INSERT INTO detalle_proforma(iddetalle,idproforma,tratamiento,cantidad,preciounit,preciototal) VALUES(?,?,?,?,?,?) ";
            PreparedStatement ps = conProf.Con().prepareStatement(sql);
            ps.setInt(1, pro.getIdDetProf());
            ps.setString(2, pro.getSerieProf());
            ps.setString(3, pro.getTratamiento());
            ps.setInt(4, pro.getCantidad());
            ps.setDouble(5, pro.getPreciounit());
            ps.setDouble(6, pro.getTotal());
            ps.executeUpdate();
            conProf.desconectar();
            System.out.println("EJECUTA GUARDAR DETALLEFACTURA");
            return true;

        } catch (SQLException e) {
            System.out.println("NO SE PUEDE EJECUTAR GUARDAR DETALLEPROFORMA " + e);
            return false;

        }
    }

}
