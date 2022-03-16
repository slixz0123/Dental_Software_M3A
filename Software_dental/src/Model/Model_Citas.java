/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Diana
 */
public class Model_Citas extends Citas{
    ConexionPg con= new ConexionPg();

    public Model_Citas() {
    }

    public Model_Citas(String id_cita, String id_paciente, Date fecha_cita, String hora_cita, String motivo, String id_doctor) {
        super(id_cita, id_paciente, fecha_cita, hora_cita, motivo, id_doctor);
    }

   
    
    
    //Listar y buscar
    public List<Citas> listarbuscarcita (String busc){
    List<Citas> mostrar = new ArrayList<Citas>();
    String sql="";
    if(busc.equals("")){
    sql="select * from citas";
    } else {
        sql="select * from citas where id_cita like'%"+busc+"%' or id_paciente like '%"+busc+"%'";}
        try {
            
            ResultSet rs=con.consulta(sql);
            while(rs.next()){
                Citas micita=new Citas();
                micita.setId_cita(rs.getString("id_cita"));
                micita.setId_paciente(rs.getString("id_paciente"));
                micita.setFecha_cita(rs.getDate("fecha_cita"));
                micita.setHora_cita(rs.getString("hora_cita"));
                micita.setMotivo(rs.getString("motivo"));
                mostrar.add(micita);
            }
            rs.close();
            return mostrar;
        } catch (SQLException ex) {
            Logger.getLogger(Model_Citas.class.getName()).log(Level.SEVERE, null, ex);
        return null;
        }
    }
    //Crear
    public boolean crearCita(){
    try {
    String sql;
    sql="Insert into citas (id_cita, id_paciente, fecha_cita, hora_cita, motivo,id_octor_c)";
    sql+="values(?,?,?,?,?,?)";
        
    PreparedStatement ps= con.Con().prepareStatement(sql);
    ps.setString(1, getId_cita());
    ps.setString(2, getId_paciente());
    ps.setDate(3, getFecha_cita());
    ps.setString(4, getHora_cita());
    ps.setString(5, getMotivo());
    ps.executeUpdate();
    return true;
        } catch (SQLException ex) {
            Logger.getLogger(Model_Citas.class.getName()).log(Level.SEVERE, null, ex);
        }
    return false;
    }
    //Actualizar
    public boolean actualizarCita(){
    try {
    String sql;
    sql="Update citas SET id_paciente=?, fecha_cita=?, hora_cita=?, motivo=? WHERE id_cita=?";
    PreparedStatement cita= con.Con().prepareStatement(sql);
    cita.setString(1, getId_paciente());
    cita.setDate(2, getFecha_cita());
    cita.setString(3, getHora_cita());
    cita.setString(4, getMotivo());
    cita.setString(5, getId_cita());
    cita.executeUpdate();
    return true;
        } catch (SQLException ex) {
            Logger.getLogger(Model_Citas.class.getName()).log(Level.SEVERE, null, ex);
        }
    return false;
    }
    //Eliminar
    public boolean eliminarcita(){
    String sql;
    sql="Delete from citas where id_cita='"+getId_cita()+"'";
    return con.accion(sql);
    }
}
