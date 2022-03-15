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

    public  List<Persona> listarPersonas (){
        List<Persona> milista = new ArrayList<Persona>();
        try {
            String sql = "select p.cedula,p.nombres,p.apellidos,p.celular,p.telefono,p.direccion,p.correo,p.provincia,p.ciudad,p.genero,p.foto,d.id_doctor,d.id_usuario,d.especialidad,d.cargo from persona p,doctor d where p.cedula=d.cedula_doc" ;
            ResultSet rs = cpg.consulta(sql) ;
            // barremos el resulset
            byte[]bytea;
           while(rs.next()){
               
            //agregamos lo que nos llegue del resulset al array de persona   
               Doctor esp1 = new Doctor();
               // getstring = colocar el nombre de la columnas de la tabla 
               esp1.setCedula(rs.getString("cedula"));
                esp1.setNombres(rs.getString("nombres"));
                 esp1.setApellidos(rs.getString("apellidos"));
                  esp1.setCelular(rs.getString("celular"));
                   esp1.setTelefono(rs.getString("telefono"));
                    esp1.setDireccion(rs.getString("direccion"));
                     esp1.setCorreo(rs.getString("correo"));
                      esp1.setProvincia(rs.getString("provincia"));
                       esp1.setCiudad(rs.getString("ciudad"));
                        esp1.setGenero(rs.getString("genero"));
                         esp1.setId_doctor(rs.getString("id doctor"));
                          esp1.setId_usuario(rs.getString("id usuario"));
                           esp1.setEspecialidad(rs.getString("especialidad"));
                            esp1.setCargo(rs.getString("cargo"));
                             //esp1.setCedula_doc(rs.getString("cedula doctor"));
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
           return milista;
        } catch (SQLException ex) {
            Logger.getLogger(Model_Especialista.class.getName()).log(Level.SEVERE, null, ex);
        return null;
        }
    }
    
    private Image obtenerImagen(byte[] bytes) throws IOException{
        ByteArrayInputStream bis=new ByteArrayInputStream(bytes);
        Iterator it= ImageIO.getImageReadersByFormatName("jpeg");
        ImageReader reader=(ImageReader)it.next();
        Object source=bis;
        ImageInputStream iis=ImageIO.createImageInputStream(source);
        reader.setInput(iis,true);
        ImageReadParam param= reader.getDefaultReadParam();
        param.setSourceSubsampling(1, 1, 0, 0);
        return reader.read(0,param);
    }
    
    public  List<Persona> buscarPersonas (String buscar){
        List<Persona> milista = new ArrayList<Persona>();
        String sql="";
        String datos = buscar;
        if(buscar.equalsIgnoreCase("")){
             sql = "select * from doctor" ;
        }else{
            if(datos.equalsIgnoreCase(buscar)){
                 sql = "SELECT * FROM persona WHERE cedula='"+buscar+"' OR nombres='"+buscar+"' OR apellidos='"+buscar+"'";
            }
        }
        try {
            ResultSet rs = cpg.consulta(sql) ;
            // barremos el resulset
           while(rs.next()){
               
            //agregamos lo que nos llegue del resulset al array de persona   
               Doctor esp1 = new Doctor();
               // getstring = colocar el nombre de la columnas de la tabla 
               esp1.setCedula(rs.getString("cedula"));
                esp1.setNombres(rs.getString("nombres"));
                 esp1.setApellidos(rs.getString("apellidos"));
                  esp1.setCelular(rs.getString("celular"));
                   esp1.setTelefono(rs.getString("telefono"));
                    esp1.setDireccion(rs.getString("direccion"));
                     esp1.setCorreo(rs.getString("correo"));
                      esp1.setProvincia(rs.getString("provincia"));
                       esp1.setCiudad(rs.getString("ciudad"));
                        esp1.setGenero(rs.getString("genero"));
                         esp1.setId_doctor(rs.getString("id doctor"));
                          esp1.setId_usuario(rs.getString("id usuario"));
                           esp1.setEspecialidad(rs.getString("especialidad"));
                            esp1.setCargo(rs.getString("cargo"));
                             esp1.setCedula_doc(rs.getString("cedula doctor"));
                 milista.add(esp1);
           }
           rs.close();
           return milista;
        } catch (SQLException ex) {
            Logger.getLogger(Model_Especialista.class.getName()).log(Level.SEVERE, null, ex);
        return null;
        }
        }
    
    
    public boolean crearPersona(){
        String sql;
        
        sql="INSERT INTO persona (cedula,nombres,apellidos,celular,telefono,direccion,correo,provincia,ciudad,genero)";
        sql+="VALUES('" + getCedula() + "','"+ getNombres() +"','"+ getApellidos()+"','"+ getCelular() +"','"+ getTelefono() +"','"+ getDireccion() +"','"+ getCorreo() +"','"+ getProvincia() +"','"+ getCiudad() +"','"+ getGenero() +"')";
        
        return cpg.accion(sql);
        
    }
    
    public boolean crearPersonasByte(){
        try{
        String sql;
        
        sql="INSERT INTO persona (cedula,nombres,apellidos,celular,telefono,direccion,correo,provincia,ciudad,genero,foto)";
//        sql+="VALUES('" + getIdPersona() + "','"+ getNombre() +"','"+ getApellido()+"','"+ getFecha() +"','"+ getTelefono() +"','"+ getSexo() +"','"+ getSueldo() +"','"+ getCupo() +"','"+getFoto()+"')";
        sql+="VALUES(?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps=cpg.GetCon().prepareStatement(sql);
        ps.setString(1, getCedula());
        ps.setString(2, getNombres());
        ps.setString(3,getApellidos());
        ps.setString(4,getCelular());
        ps.setString(5,getTelefono());
        ps.setString(6,getDireccion());
        ps.setString(7,getCorreo());
        ps.setString(8,getProvincia());
//        ps.setBinaryStream(9,getImage(),getLargo());
        ps.executeUpdate();
        return true;
        } catch (SQLException ex) {
            Logger.getLogger(Model_Especialista.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public boolean modificarPersonas(){
        String sql2 = "UPDATE persona SET\n"
                +"nombres='"+getNombres()+"', apellidos= '"+getApellidos()+"', celular= '"+getCelular()+"', telefono= '"+getTelefono()+"', direccion= '"+getDireccion()+"', correo= '"+getCorreo()+"', provincia= '"+getProvincia()+"', ciudad= '"+getCiudad()+"', genero= '"+getGenero()+"'"+"WHERE cedula= '"+getCedula()+"'";
        
        return cpg.accion(sql2);
    }
    
//    public boolean modificarPersonasByte(){
////        try{
//        String sql2 = "UPDATE persona SET\n"
//                +"nombres='"+getNombres()+"', apellidos= '"+getApellidos()+"', celular= '"+getCelular()+"', telefono= '"+getTelefono()+"', direccion= '"+getDireccion()+"', correo= '"+getCorreo()+"', provincia= '"+getProvincia()+"', ciudad= '"+getCiudad()+"', genero= '"+getGenero()+"', foto= '"+getFoto()+"'"+"WHERE cedula= '"+getCedula()+"'";
//
//        return cpg.accion(sql2);
//    }
    
    
    public boolean removerPersonas(String ced){
        String sql3 = "DELETE FROM persona WHERE cedula= '"+ced+"'";
        
        return cpg.accion(sql3);
    }
}
