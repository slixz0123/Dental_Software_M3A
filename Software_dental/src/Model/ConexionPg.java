/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LENOVO
 */
public class ConexionPg {
     Connection con ;
    String cadenaConexion = "jdbc:postgresql://localhost:5432/Dental";
    String usuario = "postgres";
    String contrasena = "123";

    public Connection Con() {
        return con;
    }
    
    
    
    public ConexionPg(){
        
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexionPg.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex + "driver");
        }
         try {
             con = DriverManager.getConnection(cadenaConexion , usuario , contrasena);
             System.out.println("Conexcion exitosa");
         } catch (SQLException ex) {
             Logger.getLogger(ConexionPg.class.getName()).log(Level.SEVERE, null, ex);
               System.out.println(ex + "coneccion");
         }
        
    }
    
    public ResultSet consulta (String sql) {
        
 
         try {
           Statement  st = con.createStatement();
             return  st.executeQuery(sql);
         } catch (SQLException ex) {
             Logger.getLogger(ConexionPg.class.getName()).log(Level.SEVERE, null, ex);
             return null ; 
         }
      
    }
    
    public boolean accion (String Sql) {
        boolean correcto ; 
         try {
             //  prepara la sentencia
             Statement st = con.createStatement();
             // ejecuta la sentencia
             st.execute(Sql);
             
             st.close();
         } catch (SQLException ex) {
             Logger.getLogger(ConexionPg.class.getName()).log(Level.SEVERE, null, ex);
             correcto = false ;
             System.out.println("hola");
             System.out.println(ex);
         }
        
        
        return correcto = true ; 
        
        
    }
    
    
    
    
}
