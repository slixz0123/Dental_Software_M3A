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
import javax.swing.JOptionPane;

/**
 *
 * @author Saul
 */
public class Model_Hist_clinico extends Hist_clinico{
    ConexionPg con= new ConexionPg();
    public Model_Hist_clinico() {
    }

    public Model_Hist_clinico(String id_historia, Date fecha_his, String id_pac, String alergia, String motivo, String observacion, String enfermedad, String medicacion, String id_odonto) {
        super(id_historia, fecha_his, id_pac, alergia, motivo, observacion, enfermedad, medicacion, id_odonto);
    }
     //Listar y buscar
    public List<Hist_clinico> listbusdiag (String busc){
    List<Hist_clinico> mostrar = new ArrayList<Hist_clinico>();
    String sql="";
    if(busc.equals("")){
    sql="select * from historia_clinica";
    } else {
    sql="select * from historia_clinica where id_historia_cli like'%"+busc+"%' or id_pac_his like '%"+busc+"%'";}
       try {  
            ResultSet rs=con.consulta(sql);
            while(rs.next()){
                Hist_clinico his_cli=new Hist_clinico();
                his_cli.setId_historia(rs.getString("id_historia_cli"));
                his_cli.setFecha_his(rs.getDate("fecha_his"));
                his_cli.setId_pac(rs.getString("id_pac_his"));
                his_cli.setAlergia(rs.getString("alergias_his"));
                his_cli.setMotivo(rs.getString("motivo_his"));
                his_cli.setObservacion(rs.getString("observaciones_his"));
                his_cli.setEnfermedad(rs.getString("enfermedades_his"));
                his_cli.setMedicacion(rs.getString("medicacion_his"));
                his_cli.setId_odonto(rs.getString("id_odotc"));
                mostrar.add(his_cli);
                
            }
            rs.close();
            
            return mostrar;
        } catch (SQLException ex) {
            Logger.getLogger(Model_Hist_clinico.class.getName()).log(Level.SEVERE, null, ex);
        return null;
        }
    }
    
    public String NumSerie() {
      //  String sql = "SELECT MAX(id_paciente) FROM paciente";
         String sql = "SELECT MAX (CAST (id_historia_cli AS INTEGER)) FROM historia_clinica ";
        String serie = "";
        try {
            ResultSet rs = con.consulta(sql);
            while (rs.next()) {
                serie = rs.getString(1);
            }
            rs.close();
        } catch (SQLException e) {
            System.out.println("ERROR GENERAR SERIE");

        }
        return serie;
    }
    
    
    
    
    
    
    
    //Crear
    public boolean crearHistoriaCli(){
    try {
        
    String sql;
    sql="Insert into historia_clinica (id_historia_cli, fecha_his, id_pac_his, alergias_his, motivo_his,"
            + "observaciones_his, enfermedades_his, medicacion_his, id_doc)";
    sql+="values(?,?,?,?,?,?,?,?,?)";   
    PreparedStatement ps= con.Con().prepareStatement(sql);
    ps.setString(1, getId_historia());
    ps.setDate(2, getFecha_his());
    ps.setString(3, getId_pac());
    ps.setString(4, getAlergia());
    ps.setString(5, getMotivo());
    ps.setString(6, getObservacion());
    ps.setString(7, getEnfermedad());
    ps.setString(8, getMedicacion());
    ps.setString(9, getId_odonto());
    ps.executeUpdate();
  //  con.desconectar();
    JOptionPane.showMessageDialog(null,"guardado con exito");
    return true;
    
        } catch (SQLException ex) {
            Logger.getLogger(Model_Hist_clinico.class.getName()).log(Level.SEVERE, null, ex);
        }
    return false;
    }
    //Actualizar
    public boolean actualizarHistoriaCli(){
    try {
    String sql;
    sql="Update historia_clinica SET fecha_his=?, id_pac_his=?, alergias_his=?, motivo_his=?,"
            + "observaciones_his=?, enfermedades_his=?, medicacion_his=?, id_odoto=? WHERE id_historia_cli=?";
    PreparedStatement his_cli= con.Con().prepareStatement(sql);
    his_cli.setDate(1, getFecha_his());
    his_cli.setString(2, getId_pac());
    his_cli.setString(3, getAlergia());
    his_cli.setString(4, getMotivo());
    his_cli.setString(5, getObservacion());
    his_cli.setString(6, getEnfermedad());
    his_cli.setString(7, getMedicacion());
    his_cli.setString(8, getId_odonto());
    his_cli.setString(9, getId_historia());
    his_cli.executeUpdate();
   // con.desconectar();
    return true;
        } catch (SQLException ex) {
            Logger.getLogger(Model_Hist_clinico.class.getName()).log(Level.SEVERE, null, ex);
        }
    return false;
    }
    //Eliminar
    public boolean eliminarHistoriaCli(){
    String sql;
    sql="Delete from historia_clinica where id_historia_cli='"+getId_historia()+"'";
    return con.accion(sql);
    }
    
       public List<Paciente> cargartxtsobrantes ( String cedula){
    List<Paciente> milistapaci = new ArrayList<Paciente>();
    String sql3;
    
        try {
            sql3 = "select p.nombres , p.apellidos ,p.ciudad , p.direccion , p.celular , pac.fecha_nac  , pac.id_paciente from  persona p , paciente pac  WHERE   pac.cedula_pac = p.cedula AND pac.cedula_pac = '"+cedula+"'  " ;
            ResultSet rs = con.consulta(sql3) ;
            
            // barremos el resulset
            while(rs.next()){
                Paciente pac = new Paciente();
               
                pac.setNombres(rs.getString("nombres"));
                pac.setApellidos(rs.getString("apellidos"));
                pac.setGenero(rs.getString("ciudad"));
                pac.setDireccion(rs.getString("direccion"));
                pac.setTelefono(rs.getString("celular"));
                pac.setFecha_nac(rs.getDate("fecha_nac"));
                pac.setId_paciente(rs.getString("id_paciente"));
                
                milistapaci.add(pac);
       
                
                
            }
            rs.close();
            return milistapaci;
        } catch (SQLException ex) {
            System.out.println(ex);
            Logger.getLogger(Model_Paciente.class.getName()).log(Level.SEVERE, null, ex);
        return null;
        }
    
    
    
    
    
}
       
      public List<Hist_clinico> cargarRepHisclini( String cedula){
    List<Hist_clinico> milistaHis = new ArrayList<Hist_clinico>();
    String sql3;
    
        try {
            sql3 = "SELECT " +

"	historia_clinica.observaciones_his,\n" +
"	historia_clinica.enfermedades_his,\n" +
"	historia_clinica.medicacion_his,\n" +
"	historia_clinica.alergias_his,\n" +
"	historia_clinica.motivo_his\n" +
"	\n" +
"      FROM historia_clinica\n" +
"	INNER JOIN paciente ON \n" +
"	 historia_clinica.id_pac_his = paciente.id_paciente \n" +
"	INNER JOIN persona ON \n" +
"	 paciente.cedula_pac = persona.cedula\n" +
"	 WHERE paciente.cedula_pac =   '"+cedula+"'   " ;
            ResultSet rs = con.consulta(sql3) ;
            
            // barremos el resulset
            while(rs.next()){
                Hist_clinico pac = new Hist_clinico();
               
                pac.setObservacion(rs.getString("observaciones_his"));
                pac.setEnfermedad(rs.getString("enfermedades_his"));
                pac.setMedicacion(rs.getString("medicacion_his"));
                pac.setAlergia(rs.getString("alergias_his"));
                pac.setMotivo(rs.getString("motivo_his"));
                
                
                milistaHis.add(pac);
       
                
                
            }
            rs.close();
            return milistaHis;
        } catch (SQLException ex) {
            System.out.println(ex);
            Logger.getLogger(Model_Paciente.class.getName()).log(Level.SEVERE, null, ex);
        return null;
        }
    
    
    
    
    
}
          
       
       
        public List<Doctor> cargaridDoc ( String cedula){
    List<Doctor> milistado = new ArrayList<Doctor>();
    String sql3;
    
        try {
            sql3 = "select doc.id_doctor  from  persona p , doctor doc  WHERE doc.cedula_doc = '"+cedula+"'  " ;
            ResultSet rs = con.consulta(sql3) ;
            
            // barremos el resulset
            while(rs.next()){
                Doctor doc = new Doctor();
               
                doc.setId_doctor(rs.getString("id_doctor"));
                
                
                milistado.add(doc);
       
                
                
            }
            rs.close();
            return milistado;

        } catch (SQLException ex) {
            System.out.println(ex);
            Logger.getLogger(Model_Paciente.class.getName()).log(Level.SEVERE, null, ex);
        return null;
        }
    }


        
        
}
