/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author slix0
 */
public class Model_AgendaCitas  extends Citas{
    
    ConexionPg con= new ConexionPg();
    
     public Model_AgendaCitas() {
    }

    public Model_AgendaCitas(String id_cita, String id_paciente, Date fecha_cita, String hora_cita, String motivo, String id_doctor) {
        super(id_cita, id_paciente, fecha_cita, hora_cita, motivo, id_doctor);
    }
    
    
    
    
     public  List<Citas> listarCitas (String fecha,String Hora){
         String sql ;
        List<Citas> milista = new ArrayList<Citas>();
        try {
         
            sql = "Select doc.nombres ||' '||doc.apellidos as nomdoc ,doc.cedula as ceddoc, p.nombres ||' '|| p.apellidos as  nompa, \n" +
   
    " c.fecha_cita, c.hora_cita, c.motivo from persona p, persona doc, citas c, paciente pac, doctor d \n" +
    " where c.id_doctor_c=d.id_doctor \n" +
    " and doc.cedula = d.cedula_doc and p.cedula = pac.cedula_pac and c.id_paciente = pac.id_paciente And c.fecha_cita = '"+fecha+"' and  c.hora_cita =  '"+Hora+"'" ;
     //} 
            ResultSet rs = con.consulta(sql) ;
        
           
            // barremos el resulset
           while(rs.next()){
               
              Citas micita=new Citas();
               // micita.setId_cita(rs.getString("id_cita"));
               // micita.setId_paciente(rs.getString("id_paciente"));
              
               micita.setNombres(rs.getString("nompa"));
           
              
                micita.setHora_cita(rs.getString("hora_cita"));
                micita.setMotivo(rs.getString("motivo"));
               micita.setNombresdoc(rs.getString("nomdoc"));
               // micita.setId_doctor(rs.getString("id_doctor_c"));
                milista.add(micita); 
           }
            rs.close();
           // con.desconectar();
            return milista;
        } catch (SQLException ex) {
            Logger.getLogger(Model_Cie10.class.getName()).log(Level.SEVERE, null, ex);
        return null;
        }
    }
    
    
    
    
    
}
