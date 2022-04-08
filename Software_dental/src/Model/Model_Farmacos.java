/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Model_Farmacos extends farmaco {

    ConexionPg con = new ConexionPg();

    public Model_Farmacos() {
    }

    public Model_Farmacos(String id_farmaco, String nombre_farmaco, String descripcion_far, String material, String miligramos) {
        super(id_farmaco, nombre_farmaco, descripcion_far, material, miligramos);
    }

    public String NumId() {
        String sql = "SELECT MAX (CAST (id_farmaco AS INTEGER)) FROM farmaco ";
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
    
    public farmaco listarId(String id) {
        farmaco far = new farmaco();
        String sql = "SELECT * FROM farmaco WHERE id_farmaco ='" + id + "'";
        try {
            ResultSet rs = con.consulta(sql);
            while (rs.next()) {
                far.setId_farmaco(rs.getString("id_farmaco"));
                far.setNombre_farmaco(rs.getString("nombre_farmaco"));
                far.setDescripcion_far(rs.getString("descripcion_far"));
                far.setMaterial(rs.getString("material"));
                far.setMiligramos(rs.getString("mg"));
            }

            rs.close();
        } catch (Exception e) {
        }
        return far;
    }

    public List<farmaco> listafarmaco(String aguja) {//Pongo como parametro que voy a buscar. Me ayuda a buscar
        List<farmaco> lf = new ArrayList<farmaco>();
        try {
            String sql = "select * from farmaco";
            sql += " WHERE UPPER(nombre_farmaco) LIKE UPPER('%" + aguja + "%') OR ";
            sql += " UPPER(id_farmaco) LIKE UPPER('%" + aguja + "%') ORDER BY (CAST (id_farmaco AS INTEGER))";
            //Guarda elementos de la tabla persona
            ResultSet rs = con.consulta(sql);

            //Barremos la taba persona
            while (rs.next()) {//Lee el archivo .next es un booleano que nos da true mientras halla datos 
                farmaco far = new farmaco();
                far.setId_farmaco(rs.getString("id_farmaco"));
                far.setNombre_farmaco(rs.getString("nombre_farmaco"));
                far.setDescripcion_far(rs.getString("descripcion_far"));
                far.setMaterial(rs.getString("material"));
                far.setMiligramos(rs.getString("mg"));
                //Agregamos a la lista
                lf.add(far);
            }

            //Cerramos la base de datos
            rs.close();
            return lf;//Retornamos la lista de personas
        } catch (SQLException ex) {
            System.out.println("ERROR listar: " + ex);
            return null; //En caso de un error
        }

    }

    
    public boolean grabar() {
        try {
            String sql;
            sql = "INSERT INTO farmaco(id_farmaco,nombre_farmaco,descripcion_far,material,mg) ";
            sql += " VALUES(?,?,?,?,?)";

            PreparedStatement ps = con.getConnection().prepareStatement(sql);
            ps.setString(1, getId_farmaco());
            ps.setString(2, getNombre_farmaco());
            ps.setString(3, getDescripcion_far());
            ps.setString(4, getMaterial());
            ps.setString(5, getMiligramos());

            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println("ERROR AL GRABAR" + ex);
            return false;
        }

    }

    
    public boolean eliminar(String idfarmaco) {
        String sqle = "DELETE FROM farmaco WHERE id_farmaco='" + idfarmaco + "'";
        return con.accion(sqle);
    }

    
    public boolean modificar() {

        try {
            String sqla = "UPDATE farmaco SET id_farmaco=? ,nombre_farmaco=? ,descripcion_far=? ,material=? ,mg=? WHERE id_farmaco ='" + getId_farmaco() + "'";

            PreparedStatement psm = con.getConnection().prepareStatement(sqla);
            psm.setString(1, getId_farmaco());
            psm.setString(2, getNombre_farmaco());
            psm.setString(3, getDescripcion_far());
            psm.setString(4, getMaterial());
            psm.setString(5, getMiligramos());
            psm.executeUpdate();
            
            
            System.out.println("Se modifico correctamente");
            return true;

        } catch (SQLException ex) {
            System.out.println("Error! Modelo modificar " + ex);
            return false;
        }
    }

}
