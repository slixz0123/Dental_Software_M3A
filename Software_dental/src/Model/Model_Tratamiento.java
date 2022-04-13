package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Model_Tratamiento extends Tratamiento {

    ConexionPg con = new ConexionPg();

    public Model_Tratamiento() {
    }

    public Model_Tratamiento(String id_tratamiento, String id_receta, String nombre_trat, String descripcion_trat, String material, Double precio_trat, Double precio_des) {
        super(id_tratamiento, id_receta, nombre_trat, descripcion_trat, material, precio_trat, precio_des);
    }
    
        public Tratamiento listaTrat(String buscar) {
            Tratamiento lt = new Tratamiento();
        try {
            String sql = "select id_tratamiento, nombre_trat, descripcion_trat, precio_trat, tipo_materia from tratamiento where id_tratamiento= '"+buscar+"'";

            ResultSet rs = con.consulta(sql);

            while (rs.next()) {
                lt.setId_tratamiento(rs.getString("id_tratamiento"));
                lt.setNombre_trat(rs.getString("nombre_trat"));
                lt.setDescripcion_trat(rs.getString("descripcion_trat"));
                lt.setPrecio_trat(rs.getDouble("precio_trat"));
                lt.setMaterial(rs.getString("tipo_materia"));
            }
            rs.close();
            return lt;
        } catch (SQLException e) {
            System.out.println("Error listar tratamiento " + e);
            return null;
        }
    }

    public List<Tratamiento> listaTratamiento(String buscar) {
        List<Tratamiento> lt = new ArrayList<>();
        try {
            String sql = "select id_tratamiento, nombre_trat, descripcion_trat, precio_trat, tipo_materia from tratamiento";
            sql += " where upper(nombre_trat) like upper('%" + buscar + "%') OR ";
            sql += " upper(id_tratamiento) like upper('%" + buscar + "%') order by (cast(id_tratamiento as integer))";

            ResultSet rs = con.consulta(sql);

            while (rs.next()) {
                Tratamiento trat = new Tratamiento();
                trat.setId_tratamiento(rs.getString("id_tratamiento"));
                trat.setNombre_trat(rs.getString("nombre_trat"));
                trat.setDescripcion_trat(rs.getString("descripcion_trat"));
                trat.setPrecio_trat(rs.getDouble("precio_trat"));
                trat.setMaterial(rs.getString("tipo_materia"));
                lt.add(trat);

            }
            rs.close();
            return lt;
        } catch (SQLException e) {
            System.out.println("Error listar tratamiento " + e);
            return null;
        }
    }

    public boolean grabar() {
        try {
            String sql;
            sql = "INSERT INTO tratamiento(id_tratamiento,nombre_trat,descripcion_trat,precio_trat,tipo_materia) ";
            sql += " VALUES(?,?,?,?,?)";

            PreparedStatement ps = con.Con().prepareStatement(sql);
            ps.setString(1, getId_tratamiento());
            ps.setString(2, getNombre_trat());
            ps.setString(3, getDescripcion_trat());
            ps.setDouble(4, getPrecio_trat());
            ps.setString(5, getMaterial());

            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println("ERROR AL GRABAR" + ex);
            return false;
        }

    }

    public boolean modificar() {

        try {
            String sqla = "UPDATE tratamiento SET id_tratamiento=? ,nombre_trat=? ,descripcion_trat=? ,precio_trat=? ,tipo_materia=? WHERE id_tratamiento ='" + getId_tratamiento() + "'";

            PreparedStatement psm = con.Con().prepareStatement(sqla);
            psm.setString(1, getId_tratamiento());
            psm.setString(2, getNombre_trat());
            psm.setString(3, getDescripcion_trat());
            psm.setDouble(4, getPrecio_trat());
            psm.setString(5, getMaterial());
            psm.executeUpdate();

            System.out.println("Se modifico correctamente");
            return true;

        } catch (SQLException ex) {
            System.out.println("Error! Modelo modificar " + ex);
            return false;
        }
    }

    public boolean eliminar(String idtratamiento) {
        String sqle = "DELETE FROM tratamiento WHERE id_tratamiento='" + idtratamiento + "'";
        return con.accion(sqle);
    }

    public String NumId() {
        String sql = "SELECT MAX (CAST (id_tratamiento AS INTEGER)) FROM tratamiento ";
        String serie = "";
        try {
            ResultSet rs = con.consulta(sql);
            while (rs.next()) {
                serie = rs.getString(1);
            }
        } catch (SQLException e) {
            System.out.println("ERROR GENERAR ID");

        }
        return serie;
    }

}
