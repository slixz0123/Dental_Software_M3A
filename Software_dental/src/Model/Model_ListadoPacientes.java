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
public class Model_ListadoPacientes  extends Paciente{

    ConexionPg con = new ConexionPg();
    public Model_ListadoPacientes() {
    }

    public Model_ListadoPacientes(String id_paciente, String cedula_pac, Date fecha_nac, String tipo_sang, String cedula, String nombres, String apellidos, String celular, String telefono, String direccion, String correo, String provincia, String ciudad, String genero, byte[] foto) {
        super(id_paciente, cedula_pac, fecha_nac, tipo_sang, cedula, nombres, apellidos, celular, telefono, direccion, correo, provincia, ciudad, genero, foto);
    }
    
     public List<Paciente> listarpac ( ){
    List<Paciente> milistapac = new ArrayList<Paciente>();
    String sql3;
    
        try {
            sql3 = "select p.cedula , p.nombres ,p. apellidos , p.celular, p.direccion , p.ciudad ,p.genero , p.fotos , pac.fecha_nac , pac.tipo_sang   from  persona p , paciente pac  WHERE p.cedula = pac.cedula_pac  " ;
            ResultSet rs = con.consulta(sql3) ;
            
            // barremos el resulset
            while(rs.next()){
                Paciente pac = new Paciente();
                pac.setCedula(rs.getString(1));
                pac.setNombres(rs.getString(2));
                pac.setApellidos(rs.getString(3));
                pac.setCelular(rs.getString(4));
                pac.setDireccion(rs.getString(5));
                pac.setCiudad(rs.getString(6));
                pac.setGenero(rs.getString(7));
                pac.setFoto(rs.getBytes(8));
               
                pac.setFecha_nac(rs.getDate(9));
                pac.setTipo_sang(rs.getString(10));
                
                milistapac.add(pac);
                
                
            }
            return milistapac;
        } catch (SQLException ex) {
            System.out.println(ex);
            Logger.getLogger(Model_Paciente.class.getName()).log(Level.SEVERE, null, ex);
        return null;
        }

   
    }
 
         
         public List<Paciente> listarpacbuscar ( String buscar){
    List<Paciente> milistapac = new ArrayList<Paciente>();
    String sql3;
     if(buscar.equals(null)){
   sql3 = "select p.cedula , p.nombres ,p. apellidos , p.celular, p.direccion , p.ciudad ,p.genero , p.fotos , pac.fecha_nac , pac.tipo_sang   from  persona p , paciente pac  WHERE p.cedula = pac.cedula_pac  " ;
    } else {
     sql3 = "select p.cedula , p.nombres ,p. apellidos , p.celular, p.direccion , p.ciudad ,p.genero , p.fotos , pac.fecha_nac , pac.tipo_sang   from  persona p , paciente pac "

            + " WHERE UPPER(p.nombres) LIKE UPPER('%" + buscar + "%') AND p.cedula = pac.cedula_pac OR ";
            sql3 += " UPPER(p.cedula) LIKE UPPER('%" + buscar + "%') AND ";
            sql3 += " p.cedula = pac.cedula_pac";    
     try {
            ResultSet rs = con.consulta(sql3) ;
            
            // barremos el resulset
            while(rs.next()){
                Paciente pac = new Paciente();
                pac.setCedula(rs.getString(1));
                pac.setNombres(rs.getString(2));
                pac.setApellidos(rs.getString(3));
                pac.setCelular(rs.getString(4));
                pac.setDireccion(rs.getString(5));
                pac.setCiudad(rs.getString(6));
                pac.setGenero(rs.getString(7));
                pac.setFoto(rs.getBytes(8));
               
                pac.setFecha_nac(rs.getDate(9));
                pac.setTipo_sang(rs.getString(10));
                
                milistapac.add(pac);

            }
           
        } catch (SQLException ex) {
            System.out.println(ex);
            Logger.getLogger(Model_Paciente.class.getName()).log(Level.SEVERE, null, ex);
        return null;
        }
 
   
    }
     return milistapac;
         }
        
        
  
    
     
}
