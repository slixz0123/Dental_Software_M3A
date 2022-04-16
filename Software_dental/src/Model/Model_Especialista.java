/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.awt.Image;
import java.io.ByteArrayInputStream;
import java.io.IOException;
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
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Model_Especialista extends Doctor{
    ConexionPg cpg=new ConexionPg();
    
    public Model_Especialista() {
    }

    public Model_Especialista(String id_doctor, String id_usuario, String especialidad, String cargo, String cedula_doc) {
        super(id_doctor, id_usuario, especialidad, cargo, cedula_doc);
    }

    public Model_Especialista(String id_doctor, String id_usuario, String especialidad, String cargo, String cedula_doc, String cedula, String nombres, String apellidos, String celular, String telefono, String direccion, String correo, String provincia, String ciudad, String genero, byte[] foto) {
        super(id_doctor, id_usuario, especialidad, cargo, cedula_doc, cedula, nombres, apellidos, celular, telefono, direccion, correo, provincia, ciudad, genero, foto);
    }

    

  

    public  List<Doctor> listarDoctores (){
        List<Doctor> milista = new ArrayList<Doctor>();
        try {
            String sql = "select p.cedula,p.nombres,p.apellidos,p.celular,p.telefono,p.direccion,p.correo,p.provincia,p.ciudad,p.genero,p.fotos,d.id_doctor,d.id_usuario,d.especialidad,d.cargo from persona p,doctor d where p.cedula=d.cedula_doc" ;
            ResultSet rs = cpg.consulta(sql) ;
            // barremos el resulset
            byte[]bytea;
           while(rs.next()){
               
            //agregamos lo que nos llegue del resulset al array de persona   
               Doctor esp1 = new Doctor();
               // getstring = colocar el nombre de la columnas de la tabla 
               esp1.setCedula(rs.getString(1));
               esp1.setNombres(rs.getString(2));
               esp1.setApellidos(rs.getString(3));
               esp1.setCelular(rs.getString(4));
               esp1.setTelefono(rs.getString(5));
               esp1.setDireccion(rs.getString(6));
               esp1.setCorreo(rs.getString(7));
               esp1.setProvincia(rs.getString(8));
               esp1.setCiudad(rs.getString(9));
               esp1.setGenero(rs.getString(10));
               esp1.setFoto(rs.getBytes(11));
               esp1.setId_doctor(rs.getString(12));
               esp1.setId_usuario(rs.getString(13));
               esp1.setEspecialidad(rs.getString(14));
               esp1.setCargo(rs.getString(15));
                            
//                      //proceso de conversion del formato de la base a formato Image 
//                      
//                      //bytea = Bytes Array
//                      bytea=rs.getBytes("foto");
//                      if (bytea!=null){
//                      //decodificando el formato de la base (base64)
////                      bytea=Base64.decode(bytea,0,bytea.length);
//                try {
//                    esp1.setFoto(obtenerImagen(bytea));
//                } catch (IOException ex) {
//                    Logger.getLogger(Model_Especialista.class.getName()).log(Level.SEVERE, null, ex);
//                }}
                 milista.add(esp1);
           }
           rs.close();
          // cpg.desconectar();
           return milista;
        } catch (SQLException ex) {
            Logger.getLogger(Model_Especialista.class.getName()).log(Level.SEVERE, null, ex);
        return null;
        }
    }
    
    public List<Doctor> tablamostrarbusqueda ( String buscar){
    List<Doctor> milistadoc = new ArrayList<Doctor>();
    String sql3;
     if(buscar.equals(null)){
   sql3 = "select p.cedula , p.nombres ,p. apellidos , p.celular, p.direccion , p.ciudad ,p.genero , p.fotos , d.id_doctor , d.especialidad   from  persona p , doctor d  WHERE p.cedula = d.cedula_doc  " ;
    } else {
     sql3 = "select p.cedula , p.nombres ,p. apellidos , p.celular, p.direccion , p.ciudad ,p.genero , p.fotos , d.id_doctor , d.especialidad   from  persona p , doctor d"

            + " WHERE UPPER(p.nombres) LIKE UPPER('%" + buscar + "%') AND p.cedula = d.cedula_doc OR ";
            sql3+="UPPER(p.apellidos) LIKE UPPER('%" + buscar + "%') AND p.cedula = d.cedula_doc OR ";
            sql3 += " UPPER(p.cedula) LIKE UPPER('%" + buscar + "%') AND ";
            sql3 += " p.cedula = d.cedula_doc";    
     try {
            ResultSet rs = cpg.consulta(sql3) ;
            
            // barremos el resulset
            while(rs.next()){
                Doctor esp = new Doctor();
                esp.setCedula(rs.getString(1));
                esp.setNombres(rs.getString(2));
                esp.setApellidos(rs.getString(3));
                esp.setCelular(rs.getString(4));
                esp.setDireccion(rs.getString(5));
                esp.setCiudad(rs.getString(6));
                esp.setGenero(rs.getString(7));
                esp.setFoto(rs.getBytes(8));
               
                esp.setId_doctor(rs.getString(9));
                esp.setEspecialidad(rs.getString(10));
                
                milistadoc.add(esp);

            }
           rs.close();
          // cpg.desconectar();
        } catch (SQLException ex) {
            System.out.println(ex);
            Logger.getLogger(Model_Paciente.class.getName()).log(Level.SEVERE, null, ex);
        return null;
        }
 
   
    }
     return milistadoc;
    }
    
    public boolean crearPersonasByte(){
        try{
        String sql;
        
        sql="INSERT INTO persona (cedula,nombres,apellidos,celular,telefono,direccion,correo,provincia,ciudad,genero,fotos)";
            sql+="VALUES(?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps=cpg.Con().prepareStatement(sql);
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
            
            System.out.println("persona creada");
        String sql2;    
        sql2="INSERT INTO public.doctor (id_doctor,id_usuario,especialidad,cargo,cedula_doc)";
        sql2+="VALUES(?,?,?,?,(SELECT cedula FROM public.PERSONA WHERE cedula = ?  ))";
        PreparedStatement ps2  =cpg.Con().prepareStatement(sql2);
        ps2.setString(1, getId_doctor());
         ps2.setString(2, getId_usuario());
         ps2.setString(3,getEspecialidad());
        ps2.setString(4,getCargo());
        ps2.setString(5,getCedula_doc());
               
        ps2.executeUpdate();
        System.out.println("GUARDADO CON EXITO");
        //cpg.desconectar();
        JOptionPane.showMessageDialog(null, "Especialista creadoado con exito"); 
        return true;
            
        }
        
        catch (SQLException ex) {
            System.out.println(ex);
            Logger.getLogger(Model_Especialista.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "No se ha podido crear el especialista");
            return false;
        }
       
    }
    
    public String NumId() {
        String sql = "SELECT MAX (CAST (id_doctor AS INTEGER)) FROM doctor ";
        String serie = "";
        try {
            ResultSet rs = cpg.consulta(sql);
            while (rs.next()) {
                serie = rs.getString(1);
            }
            rs.close();
        } catch (SQLException e) {
          JOptionPane.showMessageDialog(null,"ERROR GENERAR ID");

        }
        return serie;
    }
    
//    public boolean modificarPersonasbyte(){
//        String sql2 = "UPDATE persona SET\n"
//                +"nombres='"+getNombres()+"', apellidos= '"+getApellidos()+"', celular= '"+getCelular()+"', telefono= '"+getTelefono()+"', direccion= '"+getDireccion()+"', correo= '"+getCorreo()+"', provincia= '"+getProvincia()+"', ciudad= '"+getCiudad()+"', genero= '"+getGenero()+"'"+"WHERE cedula= '"+getCedula()+"'";
//        JOptionPane.showMessageDialog(null, "Especialista modificado correctamente");        
//        return cpg.accion(sql2);
//    }
//    
//
//    public boolean modificarEspecialista(){
//        String sql2 = "UPDATE doctor SET\n"
//                +"especialidad='"+getEspecialidad()+"', cargo= '"+getCargo()+"' WHERE cedula_doc= '"+getCedula()+"'";  
//        JOptionPane.showMessageDialog(null, "Especialista modificado especialidad"); 
//        return cpg.accion(sql2);
//    }

    public boolean modificarPersonasbyte(){
        try {
    String sql;
    sql="Update persona SET nombres=?, apellidos=?, celular=?,telefono=?, direccion=?, correo=?, provincia=?, ciudad=?, genero=?, fotos=? WHERE cedula=?";
    PreparedStatement actp= cpg.Con().prepareStatement(sql);
    actp.setString(1, getNombres());
    actp.setString(2, getApellidos());
    actp.setString(3, getCelular());
    actp.setString(4, getTelefono());
    actp.setString(5, getDireccion());
    actp.setString(6, getCorreo());
    actp.setString(7, getProvincia());
    actp.setString(8, getCiudad());
    actp.setString(9, getGenero());
    actp.setBytes(10, getFoto());
    actp.setString(11, getCedula());
    actp.executeUpdate();
    actp.close();
    String sql2;
            sql2="Update doctor SET especialidad=?, cargo=? where cedula_doc=?";

            PreparedStatement ps2=cpg.Con().prepareStatement(sql2);
            
            ps2.setString(1, getEspecialidad());
            ps2.setString(2, getCargo());
            ps2.setString(3, getCedula());
            ps2.executeUpdate();
            ps2.close();
           // cpg.desconectar();
    return true;
        } catch (SQLException ex) {
            Logger.getLogger(Model_Especialista.class.getName()).log(Level.SEVERE, null, ex);
        }
    return false;
    }
    

    public boolean modificarEspecialista(){
        try {
    String sql2;
            sql2="Update doctor SET especialidad=?, cargo=? where cedula_doc=?";

            PreparedStatement ps2=cpg.Con().prepareStatement(sql2);
            
            ps2.setString(1, getEspecialidad());
            ps2.setString(2, getCargo());
            ps2.setString(3, getCedula());
            ps2.executeUpdate();
            ps2.close();
           // cpg.desconectar();
    return true;
        } catch (SQLException ex) {
            Logger.getLogger(Model_Especialista.class.getName()).log(Level.SEVERE, null, ex);
        }
    return false;
    }

    
    
    public boolean removerPersonas(String ced){
        String sql3 = "DELETE FROM doctor WHERE cedula_doc= '"+ced+"'";
        
        return cpg.accion(sql3);
    }
    
    public List<Doctor> cargartxtsobrantes ( String cedula){
    List<Doctor> milistaesp = new ArrayList<Doctor>();
    String sql3;
    
        try {
            sql3 = "select p.telefono,p.correo,p.provincia,e.id_usuario,e.cargo from  persona p,doctor e   WHERE cedula=cedula_doc AND cedula = '"+cedula+"'  " ;
            ResultSet rs = cpg.consulta(sql3) ;
            
            // barremos el resulset
            while(rs.next()){
                Doctor esp = new Doctor();
                esp.setCedula(cedula);
                esp.setTelefono(rs.getString("telefono"));
                esp.setCorreo(rs.getString("correo"));
                esp.setProvincia(rs.getString("provincia"));
                esp.setId_usuario(rs.getString("id_usuario"));
                esp.setCargo(rs.getString("cargo"));
                
                milistaesp.add(esp);
               
                
            }
            rs.close();
           // cpg.desconectar();
            return milistaesp;
        } catch (SQLException ex) {
            System.out.println(ex);
            Logger.getLogger(Model_Paciente.class.getName()).log(Level.SEVERE, null, ex);
        return null;
        }

   
    }
    
    public ArrayList<Doctor> cargardocscombo(){
         ArrayList<Doctor> milistaespc = new ArrayList<>();
    String sql3;
    
        try {
            sql3 = "select p.cedula , p.nombres, p.apellidos , d.id_doctor  from  persona p , doctor d  WHERE cedula= cedula_doc   " ;
            ResultSet rs = cpg.consulta(sql3) ;
            
            // barremos el resulset
            while(rs.next()){
                Doctor esp = new Doctor();
                esp.setCedula_doc(rs.getString("cedula"));
                esp.setNombres(rs.getString("nombres"));
                esp.setApellidos(rs.getString("apellidos"));
                esp.setId_doctor(rs.getString("id_doctor"));
                milistaespc.add(esp);   
            }
            rs.close();
            return  milistaespc;
            
        } catch (SQLException ex) {
            System.out.println(ex);
            Logger.getLogger(Model_Paciente.class.getName()).log(Level.SEVERE, null, ex);
        return null;
        }
    }
}
