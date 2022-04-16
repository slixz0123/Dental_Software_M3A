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
public class Model_ListadoEspecialistas extends Doctor {

    ConexionPg con = new ConexionPg();

    public Model_ListadoEspecialistas() {
    }

    public Model_ListadoEspecialistas(String id_doctor, String id_usuario, String especialidad, String cargo, String cedula_doc) {
        super(id_doctor, id_usuario, especialidad, cargo, cedula_doc);
    }

    public Model_ListadoEspecialistas(String id_doctor, String id_usuario, String especialidad, String cargo, String cedula_doc, String cedula, String nombres, String apellidos, String celular, String telefono, String direccion, String correo, String provincia, String ciudad, String genero, byte[] foto) {
        super(id_doctor, id_usuario, especialidad, cargo, cedula_doc, cedula, nombres, apellidos, celular, telefono, direccion, correo, provincia, ciudad, genero, foto);
    }

    public Model_ListadoEspecialistas(String cedula, String nombres, String apellidos) {
        super(cedula, nombres, apellidos);
    }

    public Doctor listarEspecialista(String buscar) {
        
        Doctor esp = new Doctor();
        String sql = "SELECT * FROM doctor WHERE id_doctor ='"+buscar+"'";
       
        try {
            
            ResultSet rs = con.consulta(sql);

            // barremos el resulset
            while (rs.next()) {
                esp.setId_doctor(rs.getString(1));
                esp.setId_usuario(rs.getString(2));
                esp.setEspecialidad(rs.getString(3));
                esp.setCargo(rs.getString(4));
                

            }
            rs.close();
           // con.desconectar();
            return esp;
        } catch (SQLException ex) {
            System.out.println(ex);
            Logger.getLogger(Model_Especialista.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    public List<Doctor> listarEspecialista() {
        List<Doctor> milistaesp = new ArrayList<Doctor>();
        String sql3;

        try {
            sql3 = "select p.cedula , p.nombres ,p. apellidos , p.celular, p.direccion , p.ciudad ,p.genero , doc.especialidad , doc.cargo , p.fotos  from  persona p , doctor doc  WHERE p.cedula = doc.cedula_doc  ";
            ResultSet rs = con.consulta(sql3);

            // barremos el resulset
            while (rs.next()) {
                Doctor esp = new Doctor();
                esp.setCedula(rs.getString(1));
                esp.setNombres(rs.getString(2));
                esp.setApellidos(rs.getString(3));
                esp.setCelular(rs.getString(4));
                esp.setDireccion(rs.getString(5));
                esp.setCiudad(rs.getString(6));
                esp.setGenero(rs.getString(7));
                esp.setEspecialidad(rs.getString(8));
                esp.setCargo(rs.getString(9));
                esp.setFoto(rs.getBytes(10));

                milistaesp.add(esp);

            }
            rs.close();
           // con.desconectar();
            return milistaesp;
        } catch (SQLException ex) {
            System.out.println(ex);
            Logger.getLogger(Model_Especialista.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    public List<Doctor> listarEspbuscar(String buscar) {
        List<Doctor> milistaesp = new ArrayList<Doctor>();
        String sql3;
        if (buscar.equals(null)) {
            sql3 = "select p.cedula , p.nombres ,p. apellidos , p.celular, p.direccion , p.ciudad ,p.genero , doc.especialidad , doc.cargo ,p.fotos  from  persona p , doctor doc  WHERE p.cedula = doc.cedula_doc  ";
        } else {
            sql3 = "select p.cedula , p.nombres ,p. apellidos , p.celular, p.direccion , p.ciudad ,p.genero , doc.especialidad , doc.cargo ,p.fotos  from  persona p , doctor doc "
                    + " WHERE UPPER(p.nombres) LIKE UPPER('%" + buscar + "%') AND p.cedula = doc.cedula_doc OR ";
            sql3 += " UPPER(p.cedula) LIKE UPPER('%" + buscar + "%') AND ";
            sql3 += " p.cedula = doc.cedula_doc";
            try {
                ResultSet rs = con.consulta(sql3);

                // barremos el resulset
                while (rs.next()) {
                    Doctor esp = new Doctor();
                    esp.setCedula(rs.getString(1));
                    esp.setNombres(rs.getString(2));
                    esp.setApellidos(rs.getString(3));
                    esp.setCelular(rs.getString(4));
                    esp.setDireccion(rs.getString(5));
                    esp.setCiudad(rs.getString(6));
                    esp.setGenero(rs.getString(7));
                    esp.setEspecialidad(rs.getString(8));
                    esp.setCargo(rs.getString(9));
                    esp.setFoto(rs.getBytes(10));

                    milistaesp.add(esp);

                }
                rs.close();
             //   con.desconectar();
            } catch (SQLException ex) {
                System.out.println(ex);
                Logger.getLogger(Model_Especialista.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }

        }
        return milistaesp;
    }

}
