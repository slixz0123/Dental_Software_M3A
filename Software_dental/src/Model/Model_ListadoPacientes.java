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
    
    
    
    
     private Image ImageObtener (byte[] bytes)  {
        try {
            ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
            Iterator it =ImageIO.getImageReadersByFormatName("png");
            ImageReader reader = (ImageReader)it.next();
            Object source = bis;
            ImageInputStream iis = ImageIO.createImageInputStream(source);
            reader.setInput(iis,true);
            ImageReadParam param = reader.getDefaultReadParam();
            param.setSourceSubsampling(1, 1, 0, 0);
            return reader.read(0,param);
        } catch (IOException ex) {
           
            try {
                ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
                Iterator it =ImageIO.getImageReadersByFormatName("jpg");
                ImageReader reader = (ImageReader)it.next();
                Object source = bis;
                ImageInputStream iis = ImageIO.createImageInputStream(source);
                reader.setInput(iis,true);
                ImageReadParam param = reader.getDefaultReadParam();
                param.setSourceSubsampling(1, 1, 0, 0);
                return reader.read(0,param);
            } catch (IOException ex1) {
                try {
                    ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
                    Iterator it =ImageIO.getImageReadersByFormatName("JPEG");
                    ImageReader reader = (ImageReader)it.next();
                    Object source = bis;
                    ImageInputStream iis = ImageIO.createImageInputStream(source);
                    reader.setInput(iis,true);
                    ImageReadParam param = reader.getDefaultReadParam();
                    param.setSourceSubsampling(1, 1, 0, 0);
                    return reader.read(0,param);
                   
                    
                } catch (IOException ex2) {
                  
               return null;
                }
            
            }
   
        }
    }
    
//    public  List<Paciente> listarpaciente (){
//       
//        List<Paciente> milista = new ArrayList<Paciente>();
//         byte[] bytea2;
//         try {
//            String sql = "select p.cedula , p.nombres ,p. apellidos , p.celular, p.direccion , p.ciudad ,p.genero , p.foto , pac.fecha_nac , pac.tipo_sang   from  persona p , paciente pac  WHERE p.cedula = pac.cedula_pac " ;
//           ResultSet rs = con.consulta(sql) ;
//          
//            // barremos el resulset
//           while(rs.next()){
//               Paciente pac = new Paciente();
//               pac.setCedula("cedula");
//               pac.setNombres("nombres");
//               pac.setApellidos("apellidos");
//               pac.setCelular("celular");
//               pac.setDireccion("direccion");
//               pac.setCiudad("ciudad");
//               pac.setGenero("genero");
//                 bytea2 = rs.getBytes("foto");
//               
//                   if (bytea2 != null){
//                         // bytea = Base64.decode(bytea,0,bytea.length);
//                         pac.setFoto(ImageObtener(bytea2)) ;
//                     }
//               pac.setFecha_nac("fecha_nac");
//               pac.setTipo_sang("tipo_sang");
//               
//               pac.setFecha_nac("fecha_nac");
//              
//               
//                
//                milista.add(micie);
//                   
//           }
//            rs.close();
//            return milista;
//        } catch (SQLException ex) {
//            Logger.getLogger(Model_Cie10.class.getName()).log(Level.SEVERE, null, ex);
//        return null;
//        }
//    }
        
        //Crear
  
}
