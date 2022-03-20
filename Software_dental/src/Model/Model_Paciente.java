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
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author slix0
 */
public class Model_Paciente extends Paciente {
ConexionPg con= new ConexionPg();
   
    public Model_Paciente() 
    {
        
    }
public String NumSerie() {
      //  String sql = "SELECT MAX(id_paciente) FROM paciente";
         String sql = "SELECT MAX (CAST (id_paciente AS INTEGER)) FROM paciente ";
        String serie = "";
        try {
            ResultSet rs = con.consulta(sql);
            while (rs.next()) {
                serie = rs.getString(1);
            }
        } catch (SQLException e) {
            System.out.println("ERROR GENERAR SERIE");

        }
        return serie;
    }

       
        public boolean crearPersonaByte(){
         try {
            String sql;
            sql="INSERT INTO persona (cedula,nombres,apellidos,celular,telefono,direccion,correo,provincia,ciudad,genero,fotos)";
            //        sql+="VALUES('" + getIdPersona() + "','"+ getNombre() +"','"+ getApellido()+"','"+ getFecha() +"','"+ getTelefono() +"','"+ getSexo() +"','"+ getSueldo() +"','"+ getCupo() +"','"+getFoto()+"')";
            sql+="VALUES(?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps=con.GetCon().prepareStatement(sql);
            ps.setString(1, getCedula());
            ps.setString(2, getNombres());
            ps.setString(3,getApellidos());
            ps.setString(4,getCelular());
            ps.setString(5,getTelefono());
            ps.setString(6,getDireccion());
            ps.setString(7,getCorreo());
            ps.setString(8,getProvincia());
            ps.setString(9,getCiudad());
            ps.setString(10,getGenero());
            ps.setBytes(11,getFoto());
            ps.executeUpdate();
            
            String sql2;
            sql2="INSERT INTO paciente (id_paciente,cedula_pac,fecha_nac,tipo_sang)";
            sql2+="VALUES(?,(SELECT cedula FROM public.PERSONA WHERE cedula = ?),?,?)";
            PreparedStatement ps2=con.GetCon().prepareStatement(sql2);
            ps2.setString(1, getId_paciente());
            ps2.setString(2, getCedula_pac());
            ps2.setDate(3, getFecha_nac());
            ps2.setString(4, getTipo_sang());
            
            ps2.executeUpdate();
             JOptionPane.showMessageDialog(null, "Paciente Guardado Con exito");
            
            return true;
        } catch (SQLException ex) {
            System.out.println(ex);
            Logger.getLogger(Model_ListadoPacientes.class.getName()).log(Level.SEVERE, null, ex);
        return false;
        }
        }
        
         public List<Paciente> listarbuscarcita (String busc){
    List<Paciente> milista = new ArrayList<Paciente>();
    String sql="";
    if(busc.equals("")){
    sql="select p.cedula , p.nombres ,p.apellidos , p.celular, p.direccion , p.ciudad ,p.genero , p.fotos , pac.fecha_nac , pac.tipo_sang   from  persona p , paciente pac  WHERE p.cedula = pac.cedula_pac";
    } else {
        try {
            sql = "select p.cedula , p.nombres ,p. apellidos , p.celular, p.direccion , p.ciudad ,p.genero , p.fotos , pac.fecha_nac , pac.tipo_sang   from  persona p , paciente pac  WHERE p.cedula = pac.cedula_pac " ;
            ResultSet rs = con.consulta(sql) ;
            
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
                milista.add(pac);
                rs.close();
                return milista;
               
            }
        } catch (SQLException ex) {
            System.out.println(ex);
            Logger.getLogger(Model_Paciente.class.getName()).log(Level.SEVERE, null, ex);
        return null;
        }
    }
    return null;
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
        
        
        
        
        
        
  
 public boolean ActualizarPersonas ()  {
        String Sql ;
        Sql="UPDATE persona SET\n" ;
        Sql +=  "nombres= '" +getNombres()+"', apellidos= '"+getApellidos()+ "', celular= '"+getCelular() +  "', telefono= '"+getTelefono()+"', direccion= '"+getDireccion() +"', correo= '"+getCorreo()+"', provinvia= '"   +getProvincia()+"', ciudad= '"   +getProvincia()+"', genero= '"   +getProvincia()+"', foto= '"   +getFoto()+"'";
      
        Sql +=  "WHERE cedula = '" +getCedula()+ "';";
    
        return con.accion(Sql);
  }
 
 public boolean borrarPersona( String Cedulaborrar)  {
        String Sql ;
        Sql="DELETE FROM paciente WHERE cedula_pac ='" +Cedulaborrar+ "'";
        return con.accion(Sql);
  }
 

         
    
           public List<Paciente> cargartxtsobrantes ( String cedula){
    List<Paciente> milistapaci = new ArrayList<Paciente>();
    String sql3;
    
        try {
            sql3 = "select * from  persona   WHERE cedula = '"+cedula+"'  " ;
            ResultSet rs = con.consulta(sql3) ;
            
            // barremos el resulset
            while(rs.next()){
                Paciente pac = new Paciente();
                pac.setCedula(cedula);
                pac.setTelefono(rs.getString("telefono"));
                pac.setCorreo(rs.getString("correo"));
                pac.setProvincia(rs.getString("provincia"));
                
                milistapaci.add(pac);
                System.out.println(rs.getString("telefono"));
                System.out.println(rs.getString("correo"));
                System.out.println(rs.getString("provincia"));
                
            }
            return milistapaci;
        } catch (SQLException ex) {
            System.out.println(ex);
            Logger.getLogger(Model_Paciente.class.getName()).log(Level.SEVERE, null, ex);
        return null;
        }

   
    }
        
        
        
        
    }
    
    
   
    
    

