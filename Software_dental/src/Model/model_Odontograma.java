/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Saul
 */
public class model_Odontograma extends Odontograma_datos {
    ConexionPg con= new ConexionPg();

    public model_Odontograma() {
    }

    public model_Odontograma(int id_odontograma, String id_pacien_odont, String od_descri, Date fecha, byte[] imagenodontograma) {
        super(id_odontograma, id_pacien_odont, od_descri, fecha, imagenodontograma);
    }

    public List<Odontograma_datos> listarodon (String id_od){
        List<Odontograma_datos> mostrar = new ArrayList<Odontograma_datos>();
    String sql="select * from odontograma where id_paciente ='"+id_od+"'";
    
     try {
         PreparedStatement ps = null;
        ResultSet rs = null;
         ps = con.getConnection().prepareStatement(sql);
         rs = ps.executeQuery();
        while(rs.next()){
          Odontograma_datos odon=new Odontograma_datos();
          odon.setId_odontograma(rs.getInt(1));
          odon.setId_pacien_odont(rs.getString(2));
          odon.setOd_descri(rs.getString(3));
          odon.setFecha(rs.getDate(4));
          odon.setImagenodontograma(rs.getBytes(5));
          mostrar.add(odon);
         }
        rs.close();
        return mostrar;
        } catch (SQLException e) {
            System.out.println(e);

        }
        return null;
    }
    //
    public List<Odontograma_datos> listarodontograma (int id_od){
        List<Odontograma_datos> mostrar = new ArrayList<Odontograma_datos>();
    String sql="select * from odontograma where id_odontograma ='"+id_od+"'";
    
     try {
         PreparedStatement ps = null;
        ResultSet rs = null;
         ps = con.getConnection().prepareStatement(sql);
         rs = ps.executeQuery();
        while(rs.next()){
          Odontograma_datos odon=new Odontograma_datos();
          odon.setId_odontograma(rs.getInt(1));
          odon.setId_pacien_odont(rs.getString(2));
          odon.setOd_descri(rs.getString(3));
          odon.setFecha(rs.getDate(4));
          odon.setImagenodontograma(rs.getBytes(5));
          mostrar.add(odon);
         }
        rs.close();
        return mostrar;
        } catch (SQLException e) {
            System.out.println(e);

        }
        return null;
    }
    //paciente id
public String idPac(String ced){
    String id ="";
        String sql="Select id_paciente from paciente where cedula_pac ='"+ced+"'";
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{    
                ps = con.getConnection().prepareStatement(sql);
                rs = ps.executeQuery();
                while(rs.next()){
                    id = rs.getString(1);
                }
        }catch(SQLException ex){
            id = "";
        }
    return id;
 }
//
    public int id_odontograma(String sql){
        int id = 1;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{    
                ps = con.getConnection().prepareStatement(sql);
                rs = ps.executeQuery();
                while(rs.next()){
                    id = rs.getInt(1)+1;
                }
        }catch(SQLException ex){
            System.out.println("idmaximo"+ex.getMessage());
            id = 1;
        }
        return id;
    }

 //Crear
    public boolean crearOdontograma(){
    try {
    String sql;
    sql="Insert into odontograma (id_odontograma, id_paciente, descripcion, fecha, imagen)";
    sql+="values(?,?,?,?,?)";    
        PreparedStatement ps= con.getConnection().prepareStatement(sql);
        ps.setInt(1, getId_odontograma());
        ps.setString(2, getId_pacien_odont());
        ps.setString(3, getOd_descri());
        ps.setDate(4, getFecha());
        ps.setBytes(5, getImagenodontograma());
 
        ps.executeUpdate();
    return true;
        } catch (SQLException ex) {
            Logger.getLogger(model_Odontograma.class.getName()).log(Level.SEVERE, null, ex);
        }
    return false;
    }
    
    //Eliminar
    public boolean eliminarAnamnesis(){
    String sql;
    sql="Delete from odontograma where id_odontograma='"+getId_odontograma()+"'";
    return con.accion(sql);
   }
}
