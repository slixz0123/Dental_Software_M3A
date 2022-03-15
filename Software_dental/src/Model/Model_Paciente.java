/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.awt.Image;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.imageio.ImageReadParam;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;

/**
 *
 * @author slix0
 */
public class Model_Paciente extends Paciente {
ConexionPg con= new ConexionPg();
   
    public Model_Paciente() 
    {
    }

      public  List<Persona> listarPersona ()
      {
        List<Persona> milista = new ArrayList<Persona>();
        try {
            String sql = "select * from persona" ;
            ResultSet rs = con.consulta(sql) ;
            byte[] bytea;
            // barremos el resulset
        while(rs.next()){
                  
               Persona persona = new Persona(); 
               //persona.setIdPersona(rs.getString("idpersona"));
               persona.setCedula(rs.getString("cedula"));
               persona.setNombres(rs.getString("nombres"));
               persona.setApellidos(rs.getString("apellidos"));
               persona.setCelular(rs.getString("cedular"));
               persona.setTelefono(rs.getString("telefono"));
               persona.setCorreo(rs.getString("correo"));
               persona.setProvincia(rs.getString("provincia"));
               persona.setCiudad(rs.getString("ciudad"));
               persona.setGenero(rs.getString("genero"));
               persona.setFoto(rs.getBytes("foto"));
               milista.add(persona);
           }
        rs.close();
        return milista;
        
        } catch (SQLException ex) {
            Logger.getLogger(Model_Paciente.class.getName()).log(Level.SEVERE, null, ex);
        return null;
        }
      }
    
     
    //busqueda persona
        public  List<Persona> listarPersonaBusqueda (String busqueda){
        List<Persona> milista = new ArrayList<Persona>();
        String sql = "" ;
        String palabra = busqueda ;
            if (busqueda.equalsIgnoreCase("")){
                sql = "select * from persona" ;
            }else if (palabra.equalsIgnoreCase(busqueda)) {
          sql = "select * from persona WHERE  id_paciente ='" +busqueda+ "'  OR  nombres = '" +busqueda+ "'" ;
            }
        try {
            
           ResultSet rs = con.consulta(sql) ;
           while(rs.next()){
              
               Persona persona = new Persona();
               
               persona.setCedula(rs.getString("cedula"));
               persona.setNombres(rs.getString("nombres"));
               persona.setApellidos(rs.getString("apellidos"));
               persona.setCelular(rs.getString("cedular"));
               persona.setTelefono(rs.getString("telefono"));
               persona.setCorreo(rs.getString("correo"));
               persona.setProvincia(rs.getString("provincia"));
               persona.setCiudad(rs.getString("ciudad"));
               persona.setGenero(rs.getString("genero"));
               persona.setFoto(rs.getBytes("foto"));
               
               milista.add(persona);
           
          
            }
           rs.close();
           return milista;
        } catch (SQLException ex) {
            Logger.getLogger(Model_Paciente.class.getName()).log(Level.SEVERE, null, ex);
        return null;
        }
    }
        public boolean crearPersonaByte(){
        try {
            String Sql;
            Sql= "INSERT INTO persona (cedula,nombres,apellidos,celular,telefono,direccion,correo,provincia,ciudad,genero,foto)" ;
            Sql+="VALUES (?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = con.Con().prepareStatement(Sql);
            ps.setString(1,getCedula());
            ps.setString(2,getNombres());
            ps.setString(3,getApellidos());
            ps.setString(4,getCelular());
            ps.setString(5,getTelefono());
            ps.setString(6,getDireccion());
            ps.setString(7,getCorreo());
            ps.setString(8,getProvincia());
            ps.setString(9,getCiudad());
            ps.setString(10,getGenero());
            ps.setBytes(11, getFoto());
            ps.executeUpdate();
        return true;
            

        } catch (SQLException ex) {
            Logger.getLogger(Model_Paciente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
  }
  
 public boolean ActualizarPersonas (){
        String Sql ;
        Sql="UPDATE persona SET\n" ;
        Sql +=  "nombres= '" +getNombres()+"', apellidos= '"+getApellidos()+ "', celular= '"+getCelular() +  "', telefono= '"+getTelefono()+"', direccion= '"+getDireccion() +"', correo= '"+getCorreo()+"', provinvia= '"   +getProvincia()+"', ciudad= '"   +getProvincia()+"', genero= '"   +getProvincia()+"', foto= '"+getFoto()+"'";
        Sql +=  "WHERE cedula = '" +getCedula()+ "';";
        return con.accion(Sql);
  }
 
 public boolean borrarPersona()  {
        String Sql ;
        Sql="DELETE FROM persona WHERE cedula ='" +getCedula()+ "'";
        return con.accion(Sql);
  }
        
    }
    
    
   
    
    

