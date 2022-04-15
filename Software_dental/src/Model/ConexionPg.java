/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.DataSource;

/**
 *
 * @author LENOVO
 */
public class ConexionPg {
    
//    private static final String DB_USERNAME="db.username";
//	private static final String DB_PASSWORD="db.password";
//	private static final String DB_URL ="db.url";
//	private static final String DB_DRIVER_CLASS="driver.class.name";
//	
//	private static Properties properties = null;
//	private static HikariDataSource dataSource;
//        private PreparedStatement stmt;
//        private ResultSet rs;
//	static{
//		try {
//			properties = new Properties();
//			properties.load(new FileInputStream("src/database.properties"));
//			
//			dataSource = new HikariDataSource();
//			dataSource.setDriverClassName(properties.getProperty(DB_DRIVER_CLASS));
//			
//			dataSource.setJdbcUrl(properties.getProperty(DB_URL));
//			dataSource.setUsername(properties.getProperty(DB_USERNAME));
//			dataSource.setPassword(properties.getProperty(DB_PASSWORD));
//			
//			dataSource.setMinimumIdle(100);
//			dataSource.setMaximumPoolSize(2000);//The maximum number of connections, idle or busy, that can be present in the pool.
//			dataSource.setAutoCommit(false);
//			dataSource.setLoginTimeout(3);
//                        dataSource.addDataSourceProperty("allowMultiQueries", "true");
//                        dataSource.addDataSourceProperty("useServerPrepStmts", "true");
//			                 System.out.println("conectado");
//		} catch (IOException | SQLException e) {
//			e.printStackTrace();
//		}
//	}
//	
//	public static DataSource getDataSource(){
//		return dataSource;
//	}
//    
//     public Connection getConnection() { // reportes  getcon
//        try {
//            return dataSource.getConnection();
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//            return null;
//        }
//    }
//     //-------------------------------------------------------------------------------------------------
//        public ResultSet consulta(String sql) { // consultar  
//        Connection conn = getConnection();
//        try {
//            stmt = conn.prepareStatement(sql);
//            rs = stmt.executeQuery();
//        } catch (SQLException e) {
//            Logger.getLogger(ConexionPg.class.getName()).log(Level.SEVERE, null, e);
//            return null;
//        }
//        return rs;
//    }
//    //-------------------------------------------------------------------------------------------------
//          public boolean accion(String sql) { // metodo  accion  se le cambia a boolean
//
//        Connection conn = getConnection();
//        try {
//
//            stmt = conn.prepareStatement(sql);
//
//            stmt.executeUpdate();
//            return true;
//        } catch (SQLException e) {
//            Logger.getLogger(ConexionPg.class.getName()).log(Level.SEVERE, null, e);
//            close(conn);
//            return false;
//        } finally {
//            closeStmt().close(conn);
//        }
//    }
//    public ConexionPg closeStmt() {
//        try {
//            stmt.close();
//        } catch (SQLException ex) {
//            Logger.getLogger(ConexionPg.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return this;
//    }
//
//    //-------------------------------------------------------------------------------------------------
//       
//     public ConexionPg close(Connection conn) {
//        try {
//            if (conn != null) {
//                conn.close();
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(ConexionPg.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return this;
//    }
    //-------------------------------------------------------------------------------------------------
    
    
    
    
    
    
    
    //----------------------------------------------------------------------------------------------------------------------------
    
    
    
    
    
     Connection con ;

    String cadenaConexion = "jdbc:postgresql://localhost:5432/Dental";
    String usuario = "postgres";
//    String contrasena = "159753";

  


    //String contrasena = "159753";


   String contrasena = "17112002Diana";

   // String contrasena = "1234";






  




    public Connection getConnection() {

   return con;
    }
   
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
             System.out.println("Conexion exitosa");
         } catch (SQLException ex) {
             Logger.getLogger(ConexionPg.class.getName()).log(Level.SEVERE, null, ex);
               System.out.println(ex + "conexion");
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
    

    
    
    
    
    public void cerrar(){
         try {
             con.close();
             System.out.println("conexion cerrada");
         } catch (SQLException ex) {
             Logger.getLogger(ConexionPg.class.getName()).log(Level.SEVERE, null, ex);
         
         }
       
    }
 
    
    
}