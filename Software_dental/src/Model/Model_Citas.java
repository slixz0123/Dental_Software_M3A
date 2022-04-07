/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

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

    //liastar citas
    public  List<Citas> listarCitas (String id){
        List<Citas> milista = new ArrayList<Citas>();
        try {
            String sql = "select * from citas where id_paciente='"+id+"'" ;
           ResultSet rs = con.consulta(sql) ;
          
            // barremos el resulset
           while(rs.next()){
               
              Citas micita=new Citas();
                micita.setId_cita(rs.getString("id_cita"));
                micita.setId_paciente(rs.getString("id_paciente"));
                micita.setFecha_cita(rs.getDate("fecha_cita"));
                micita.setHora_cita(rs.getString("hora_cita"));
                micita.setMotivo(rs.getString("motivo"));
                micita.setId_doctor(rs.getString("id_doctor_c"));
                milista.add(micita); 
           }
            rs.close();
            return milista;
        } catch (SQLException ex) {
            Logger.getLogger(Model_Cie10.class.getName()).log(Level.SEVERE, null, ex);
        return null;
        }
    }
    
    public String idPac(String ced){
    String id ="";
        String sql="Select id_paciente from paciente where cedula_pac ='"+ced+"'";
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{    
                ps = con.Con().prepareStatement(sql);
                rs = ps.executeQuery();
                while(rs.next()){
                    id = rs.getString(1);
                }
        }catch(SQLException ex){
            id = "";
        }
    return id;
 }
    
    
    //Listar y buscar
    public List<Citas> buscarcita (String busc){
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
                micita.setId_doctor(rs.getString("id_doctor_c"));
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
    sql="Insert into citas (id_cita, id_paciente, fecha_cita, hora_cita, motivo,id_doctor_c)";
    sql+="values(?,?,?,?,?,?)";
        
    PreparedStatement ps= con.Con().prepareStatement(sql);
    ps.setString(1, getId_cita());
    ps.setString(2, getId_paciente());
    ps.setDate(3, getFecha_cita());
    ps.setString(4, getHora_cita());
    ps.setString(5, getMotivo());
    ps.setString(6, getId_doctor() );
    ps.executeUpdate();
    return true;
        } catch (SQLException ex) {
            Logger.getLogger(Model_Citas.class.getName()).log(Level.SEVERE, null, ex);
        }
    return false;
    }
    //Actualizar
public boolean actualizarCitas(){
    
    
    try {
    String sql3;
    sql3="UPDATE citas SET " ;
        sql3 +=  "id_paciente=?, fecha_cita= ?,hora_cita=?,motivo=?,id_doctor_c=? WHERE id_cita=?";
        
    PreparedStatement ps= con.Con().prepareStatement(sql3);
    
    ps.setString(1, getId_paciente());
    ps.setDate(2, getFecha_cita());
    ps.setString(3, getHora_cita());
    ps.setString(4, getMotivo());
    ps.setString(5, getId_doctor() );
    ps.setString(6, getId_cita());
    ps.executeUpdate();
        System.out.println("CITAS  GUARDADO");
    return true;
        } catch (SQLException ex) {
            System.out.println(ex);
            Logger.getLogger(Model_Citas.class.getName()).log(Level.SEVERE, null, ex);
        return false;
        }
    
    }
    
    
    //Eliminar
    public boolean eliminarcita(){
    String sql;
    sql="Delete from citas where id_cita='"+getId_cita()+"'";
    return con.accion(sql);
    }
    
    
   
    //PERSONA
public List<Persona> listarPersonas(String busc){
    List<Persona> lista = new ArrayList<Persona>();
    try {
       String sql="select * from persona p join paciente pa on p.cedula=pa.cedula_pac where p.cedula like '%"+busc+"%'";
       ResultSet rs=con.consulta(sql);
       while(rs.next()){
        Persona p=new Persona();
        p.setCedula(rs.getString("cedula"));
        p.setNombres(rs.getString("nombres"));
        p.setApellidos(rs.getString("apellidos"));
        p.setCelular(rs.getString("celular"));
        p.setTelefono(rs.getString("telefono"));
        p.setDireccion(rs.getString("direccion"));
        p.setCorreo(rs.getString("correo"));
        p.setProvincia(rs.getString("provincia"));
        p.setCiudad(rs.getString("ciudad"));
        p.setGenero(rs.getString("genero"));
        p.setFoto(rs.getBytes("foto"));
        lista.add(p);
    }
    rs.close();
    return lista;
    } catch (SQLException ex) {
      Logger.getLogger(Model_Citas.class.getName()).log(Level.SEVERE, null, ex);
    return null;
   }
}
    
    //codigo
public String NumSerie() {
      //  String sql = "SELECT MAX(id_paciente) FROM paciente";
         String sql = "SELECT MAX (CAST (id_cita AS INTEGER)) FROM citas";
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
       public List<Paciente> cargartxtsobrantespa ( String cedula){
    List<Paciente> milistapaci = new ArrayList<Paciente>();
    String sql3;
    
        try {
            sql3 = "select p.cedula,p.nombres,p.apellidos from  persona p,paciente pa  "
                    + " WHERE cedula=cedula_pac and pa.cedula_pac=''"+cedula+"'";
            
            ResultSet rs = con.consulta(sql3) ;
            
            // barremos el resulset
            while(rs.next()){
                Paciente pac = new Paciente();
                pac.setCedula(rs.getString("cedula"));
                pac.setNombres(rs.getString("nombres"));
                pac.setApellidos(rs.getString("apellidos"));
                
                milistapaci.add(pac);
                
                System.out.println(rs.getString("nombres"));
                System.out.println(rs.getString("apellidos"));
                
            }
            return milistapaci;
        } catch (SQLException ex) {
            System.out.println(ex);
            Logger.getLogger(Model_Citas.class.getName()).log(Level.SEVERE, null, ex);
        return null;
        }

   
    }
        public List<Paciente> cargaridPac ( String cedula){
    List<Paciente> milista = new ArrayList<Paciente>();
    String sql3;
    
        try {
            sql3 = "select pac.id_paciente  from  persona p , paciente pac  WHERE pac.cedula_pac = '"+cedula+"'  " ;
            ResultSet rs = con.consulta(sql3) ;
            
            // barremos el resulset
            while(rs.next()){
                Paciente pa = new Paciente();
               
                pa.setId_paciente(rs.getString("id_paciente"));
                
                milista.add(pa);
       
            }
            return milista;
        } catch (SQLException ex) {
            System.out.println(ex);
            Logger.getLogger(Model_Citas.class.getName()).log(Level.SEVERE, null, ex);
        return null;
        }
    }
       
       
       
       
      
    public List<Doctor> cargartxtsobrantesdoc ( String cedula){
        List<Doctor> milistadoc = new ArrayList<Doctor>();
        String sql3;
    
        try {
            sql3 = "select p.cedula,p.nombres,p.apellidos from  persona p,doctor d   WHERE cedula=cedula_doc " ;
            ResultSet rs = con.consulta(sql3) ;
            
            // barremos el resulset
            while(rs.next()){
                Doctor doc = new Doctor();
                doc.setCedula(cedula);
                doc.setNombres(rs.getString("nombres"));
                doc.setApellidos(rs.getString("apellidos"));
                
                milistadoc.add(doc);
                
                System.out.println(rs.getString("nombres"));
                System.out.println(rs.getString("apellidos"));
                
            }
            return milistadoc;
        } catch (SQLException ex) {
            System.out.println(ex);
            Logger.getLogger(Model_Citas.class.getName()).log(Level.SEVERE, null, ex);
        return null;
        }
    }
        
         public List<Doctor> cargaridDoc ( String cedula){
    List<Doctor> milistado = new ArrayList<Doctor>();
    String sql3;
    
        try {
            sql3 = "select doc.id_doctor  from  persona p , doctor doc  WHERE doc.cedula_doc = '"+cedula+"'" ;
            ResultSet rs = con.consulta(sql3) ;
            
            // barremos el resulset
            while(rs.next()){
                Doctor doc = new Doctor();
               
                doc.setId_doctor(rs.getString("id_doctor"));
                
                milistado.add(doc);
       
            }
            return milistado;
        } catch (SQLException ex) {
            System.out.println(ex);
            Logger.getLogger(Model_Citas.class.getName()).log(Level.SEVERE, null, ex);
        return null;
        }
    }
         
   //paciente id
public String idPaci(String ced){
    String id ="";
        String sql="Select id_paciente from paciente where cedula_pac ='"+ced+"'";
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{    
                ps = con.Con().prepareStatement(sql);
                rs = ps.executeQuery();
                while(rs.next()){
                    id = rs.getString(1);
                }
        }catch(SQLException ex){
            id = "";
        }
    return id;
 }
//
//medico id
public String idMed(String ced){
    String id ="";
        String sql="Select id_doctor from doctor where cedula_doc ='"+ced+"'";
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{    
                ps = con.Con().prepareStatement(sql);
                rs = ps.executeQuery();
                while(rs.next()){
                    id = rs.getString(1);
                }
        }catch(SQLException ex){
            id = "";
        }
    return id;
 }
   
   public List<Paciente> cargarpacientes ( String idci){
    List<Paciente> milistapaci = new ArrayList<Paciente>();
    String sql3;
    
        try {
            sql3 = "select p.cedula,p.nombres , p.apellidos  from  persona p Join paciente pac on  pac.cedula_pac = p.cedula Join citas c on c.id_paciente=pac.id_paciente Where id_cita= '"+idci+"'  " ;
            ResultSet rs = con.consulta(sql3) ;
            
            // barremos el resulset
            while(rs.next()){
                Paciente pac = new Paciente();
               
                pac.setCedula_pac(rs.getString("cedula"));
                pac.setNombres(rs.getString("nombres"));
                pac.setApellidos(rs.getString("apellidos"));
                
                milistapaci.add(pac);
       
                
                
            }
            return milistapaci;
        } catch (SQLException ex) {
            System.out.println(ex);
            Logger.getLogger(Model_Citas.class.getName()).log(Level.SEVERE, null, ex);
        return null;
        }


   }
   
    public List<Doctor> cargardoctores ( String idci){
    List<Doctor> milistapaci = new ArrayList<Doctor>();
    String sql3;
    
        try {
            sql3 = " select doc.cedula_doc ,p.nombres , p.apellidos  from persona p Join doctor doc on  doc.cedula_doc = p.cedula Join citas c on c.id_doctor_c=doc.id_doctor Where id_cita='"+idci+"'  " ;
            ResultSet rs = con.consulta(sql3) ;
            
            // barremos el resulset
            while(rs.next()){
                Doctor doc = new Doctor();
               
                doc.setCedula_doc(rs.getString("cedula_doc"));
                doc.setNombres(rs.getString("nombres"));
                doc.setApellidos(rs.getString("apellidos"));
                
                milistapaci.add(doc);
       
                
                
            }
            return milistapaci;
        } catch (SQLException ex) {
            System.out.println(ex);
            Logger.getLogger(Model_Citas.class.getName()).log(Level.SEVERE, null, ex);
        return null;
        }


   }
   public String cedPaciente(String id2){
    String id ="";
        String sql="Select pac.cedula_pac from paciente pac Join citas ci on ci.id_paciente = pac.id_paciente where ci.id_cita ='"+id2+"'";
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{    
                ps = con.Con().prepareStatement(sql);
                rs = ps.executeQuery();
                while(rs.next()){
                    id = rs.getString(1);
                }
        }catch(SQLException ex){
            id = "";
        }
    return id;
 }
   
   public String cedDoctor(String ced){
    String id ="";
        String sql="Select doc.cedula_doc from doctor doc Join citas ci on ci.id_doctor_c = doc.id_doctor where ci.id_cita ='"+ced+"'";
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{    
                ps = con.Con().prepareStatement(sql);
                rs = ps.executeQuery();
                while(rs.next()){
                    id = rs.getString(1);
                }
        }catch(SQLException ex){
            id = "";
        }
    return id;
 }
   /*Select doc.nombres as nomdoc, doc.apellidos as apdoc, p.nombres, p.apellidos, 
 c.fecha_cita, c.hora_cita, c.motivo from persona p, persona doc, citas c, paciente pac, doctor d 
 where c.id_doctor_c=d.id_doctor 
 and doc.cedula = d.cedula_doc and p.cedula = pac.cedula_pac and c.id_paciente = pac.id_paciente*/
     
}


