/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jose illescas
 */
public class Model_Receta extends receta{
    ConexionPg con = new ConexionPg();

    public Model_Receta() {
    }

    public Model_Receta(String id_receta, Date fecha_receta, String id_farmaco_rec, String indicaciones) {
        super(id_receta, fecha_receta, id_farmaco_rec, indicaciones);
    }
    
    public String id_receta(){
        String sql = "SELECT MAX (CAST (id_receta AS INTEGER)) FROM receta ";
        String serie = "";
        try {
            ResultSet rs = con.consulta(sql);
            while (rs.next()) {
                serie = rs.getString(1);
            }
        } catch (SQLException e) {
            System.out.println(e);

        }
        return serie;
    }
    
    public boolean crearReceta(){
    try {
    String sql;
    sql="INSERT INTO receta (id_receta, fecha_receta, id_farmaco_rec, indicaciones)";
    sql+="VALUES(?,?,?,?)";    
        PreparedStatement ps= con.Con().prepareStatement(sql);
        ps.setString(1, getId_receta());
        ps.setDate(2, getFecha_receta());
        ps.setString(3, getId_farmaco_rec());
        ps.setString(4, getIndicaciones());
        ps.executeUpdate();
    return true;
        } catch (SQLException ex) {
            Logger.getLogger(Model_Receta.class.getName()).log(Level.SEVERE, null, ex);
        }
    return false;
    }
    
    
}
