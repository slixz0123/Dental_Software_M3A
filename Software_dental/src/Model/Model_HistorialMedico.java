/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import View.Vista_Crud_HistorialMedico;
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
 * @author saul
 */
public class Model_HistorialMedico extends Hist_Medico {

    ConexionPg con= new ConexionPg();
    
    public Model_HistorialMedico() {
    }

    public Model_HistorialMedico(String id_his_med, String id_medico_his, String id_paciente_his, String enfermedad_act, String ant_fam, String trat_med, String aler_med, String med_hab, String fum_b, String pro_card, String ulc_gas, String presion, String hepat, String diabetes, String epilepsia, String do_cab, String al_endo, String vih, String pro_coagu, String fre_res, String fre_car, String pre_art, String tem, String oxim, Date fecha_his, String hora_his) {
        super(id_his_med, id_medico_his, id_paciente_his, enfermedad_act, ant_fam, trat_med, aler_med, med_hab, fum_b, pro_card, ulc_gas, presion, hepat, diabetes, epilepsia, do_cab, al_endo, vih, pro_coagu, fre_res, fre_car, pre_art, tem, oxim, fecha_his, hora_his);
    }

       //Listar y buscar
    public List<Hist_Medico> listarbuscarhist (String busc, String id){
    List<Hist_Medico> mostrar = new ArrayList<Hist_Medico>();
    String sql="";
    if(busc.equals("")){
    sql="select * from historial_medico where id_paciente_his='"+id+"'";
    } else {
     sql="select * from historial_medico where fecha_his ='"+busc+"' and id_paciente_his='"+id+"'";}
     try {       
        ResultSet rs=con.consulta(sql);
        while(rs.next()){
          Hist_Medico his_m=new Hist_Medico();
          his_m.setId_his_med(rs.getString("id_his_med"));
          his_m.setId_medico_his(rs.getString("id_medico_his"));
          his_m.setId_paciente_his(rs.getString("id_paciente_his"));
          his_m.setEnfermedad_act(rs.getString("enfermedad_act"));
          his_m.setAnt_fam(rs.getString("ant_fam"));
          his_m.setTrat_med(rs.getString("trat_med"));
          his_m.setAler_med(rs.getString("aler_med"));
          his_m.setMed_hab(rs.getString("med_hab"));
          his_m.setFum_b(rs.getString("fum_b"));
          his_m.setPro_card(rs.getString("pro_card"));
          his_m.setUlc_gas(rs.getString("ulc_gas"));
          his_m.setPresion(rs.getString("presion"));
          his_m.setHepat(rs.getString("epat"));
          his_m.setDiabetes(rs.getString("diabetes"));
          his_m.setEpilepsia(rs.getString("epilepsia"));
          his_m.setDo_cab(rs.getString("do_cab"));
          his_m.setAl_endo(rs.getString("al_endo"));
          his_m.setVih(rs.getString("vih"));
          his_m.setPro_coagu(rs.getString("pro_coagu"));
          his_m.setFre_res(rs.getString("fre_res"));
          his_m.setFre_car(rs.getString("fre_car"));
          his_m.setPre_art(rs.getString("pre_art"));
          his_m.setTem(rs.getString("tem"));
          his_m.setOxim(rs.getString("oxim"));
          his_m.setFecha_his(rs.getDate("fecha_his"));
          his_m.setHora_his(rs.getString("hora_his"));
          mostrar.add(his_m);
         }
        rs.close();
        return mostrar;
        } catch (SQLException ex) {
        Logger.getLogger(Model_HistorialMedico.class.getName()).log(Level.SEVERE, null, ex);
       return null;
     }
    }
    //
     public List<Hist_Medico> listarbuscarhisttabla (String busc, String id){
    List<Hist_Medico> mostrar = new ArrayList<Hist_Medico>();
    String sql="";
//    if(id.equals("")){
//    sql="select * from historial_medico";
//    } else {
     sql="select * from historial_medico where fecha_his ='"+busc+"' and id_his_med='"+id+"'";
//     }
     try {       
        ResultSet rs=con.consulta(sql);
        while(rs.next()){
          Hist_Medico his_m=new Hist_Medico();
          his_m.setId_his_med(rs.getString("id_his_med"));
          his_m.setId_medico_his(rs.getString("id_medico_his"));
          his_m.setId_paciente_his(rs.getString("id_paciente_his"));
          his_m.setEnfermedad_act(rs.getString("enfermedad_act"));
          his_m.setAnt_fam(rs.getString("ant_fam"));
          his_m.setTrat_med(rs.getString("trat_med"));
          his_m.setAler_med(rs.getString("aler_med"));
          his_m.setMed_hab(rs.getString("med_hab"));
          his_m.setFum_b(rs.getString("fum_b"));
          his_m.setPro_card(rs.getString("pro_card"));
          his_m.setUlc_gas(rs.getString("ulc_gas"));
          his_m.setPresion(rs.getString("presion"));
          his_m.setHepat(rs.getString("epat"));
          his_m.setDiabetes(rs.getString("diabetes"));
          his_m.setEpilepsia(rs.getString("epilepsia"));
          his_m.setDo_cab(rs.getString("do_cab"));
          his_m.setAl_endo(rs.getString("al_endo"));
          his_m.setVih(rs.getString("vih"));
          his_m.setPro_coagu(rs.getString("pro_coagu"));
          his_m.setFre_res(rs.getString("fre_res"));
          his_m.setFre_car(rs.getString("fre_car"));
          his_m.setPre_art(rs.getString("pre_art"));
          his_m.setTem(rs.getString("tem"));
          his_m.setOxim(rs.getString("oxim"));
          his_m.setFecha_his(rs.getDate("fecha_his"));
          his_m.setHora_his(rs.getString("hora_his"));
          mostrar.add(his_m);
         }
        rs.close();
        return mostrar;
        } catch (SQLException ex) {
        Logger.getLogger(Model_HistorialMedico.class.getName()).log(Level.SEVERE, null, ex);
       return null;
     }
    }
     //Listar pacientes
    public List<Paciente> listarPacientes(String busc){
    List<Paciente> lista = new ArrayList<Paciente>();
    try {
       String sql="select * from persona p join paciente pa on p.cedula=pa.cedula_pac where p.cedula like '%"+busc+"%' or upper(p.nombres) like upper('%"+busc+"%') or upper(p.apellidos) like upper('%"+busc+"%')";
       ResultSet rs=con.consulta(sql);
       while(rs.next()){
        Paciente p=new Paciente();
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
        p.setFoto(rs.getBytes("fotos"));
        p.setFecha_nac(rs.getDate("fecha_nac"));
        lista.add(p);
    }
    rs.close();
    return lista;
    } catch (SQLException ex) {
      Logger.getLogger(Model_HistorialMedico.class.getName()).log(Level.SEVERE, null, ex);
    return null;
   }
 }
//
     //Listar pacientes para cargar datos
    public List<Paciente> cargarPacientes(String busc){
    List<Paciente> lista = new ArrayList<Paciente>();
    try {
       String sql="select * from persona p join paciente pa on p.cedula=pa.cedula_pac join historial_medico h on"
               + "h.id_paciente_his=pa.id_paciente where h.id_his_med ='"+busc+"'";
       ResultSet rs=con.consulta(sql);
       while(rs.next()){
        Paciente p=new Paciente();
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
        p.setFoto(rs.getBytes("fotos"));
        lista.add(p);
    }
    rs.close();
    return lista;
    } catch (SQLException ex) {
      Logger.getLogger(Model_HistorialMedico.class.getName()).log(Level.SEVERE, null, ex);
    return null;
   }
 }
    ////Listar medico
     public List<Doctor> listarMedico(String ced){
        List<Doctor> lista = new ArrayList<Doctor>();
        try {
            String sql="select * from persona p join doctor d on d.cedula_doc=p.cedula where p.cedula like '%"+ced+"%' or upper(p.nombres) like upper('%"+ced+"%') or upper (p.apellidos) like upper('%"+ced+"%')";
             ResultSet rs=con.consulta(sql);
       while(rs.next()){
            Doctor p=new Doctor();
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
            p.setFoto(rs.getBytes("fotos"));
            lista.add(p);
            }
            rs.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(Model_Anamnesis.class.getName()).log(Level.SEVERE, null, ex);
        return null;
        }
    }
     ////Listar medico
     public List<Doctor> cargarMedico(String id){
        List<Doctor> lista = new ArrayList<Doctor>();
        try {
            String sql="select * from persona p join doctor d on d.cedula_doc=p.cedula join historial_medico h on "
                    + "h.id_medico_his=d.id_doctor where h.id_his_med='"+id+"'";
             ResultSet rs=con.consulta(sql);
       while(rs.next()){
            Doctor p=new Doctor();
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
            p.setFoto(rs.getBytes("fotos"));
            lista.add(p);
            }
            rs.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(Model_Anamnesis.class.getName()).log(Level.SEVERE, null, ex);
        return null;
        }
    }
//generar id historial medico
     public String id_his_med(){
        String sql = "SELECT MAX (CAST (id_his_med AS INTEGER)) FROM historial_medico";
        String serie = "";
        try {
            ResultSet rs = con.consulta(sql);
            while (rs.next()) {
                serie = rs.getString(1);
            }
        } catch (SQLException e) {
            System.out.println(e);

        }
        return serie;
    }
    
     //Extraer paciente id
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
// //Extraer paciente id
public String cedulaPac(String id){
    String ced ="";
        String sql="Select p.cedula_pac from paciente p join historial_medico h on h.id_paciente_his = p.id_paciente where h.id_his_med ='"+id+"'";
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{    
                ps = con.Con().prepareStatement(sql);
                rs = ps.executeQuery();
                while(rs.next()){
                    ced = rs.getString(1);
                }
        }catch(SQLException ex){
            ced = "";
        }
    return ced;
 }
//Extraer paciente id
public String cedulaMed(String id){
    String ced ="";
        String sql="Select d.cedula_doc from doctor d join historial_medico h on h.id_medico_his = d.id_doctor where h.id_his_med ='"+id+"'";
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{    
                ps = con.Con().prepareStatement(sql);
                rs = ps.executeQuery();
                while(rs.next()){
                    ced = rs.getString(1);
                }
        }catch(SQLException ex){
            ced = "";
        }
    return ced;
 }
//Extraer medico id
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
//
 //Crear historial medico
    public boolean crearHistorial_med(){
    try {
    String sql;
    sql="Insert into historial_medico (id_his_med, id_medico_his, id_paciente_his, enfermedad_act, ant_fam, trat_med, aler_med, med_hab,"
            + "fum_b, pro_card, ulc_gas, presion, epat, diabetes, epilepsia, do_cab, al_endo, vih, pro_coagu, fre_res, fre_car, pre_art,"
            + "tem, oxim, fecha_his, hora_his) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";    
        PreparedStatement ps= con.Con().prepareStatement(sql);
        ps.setString(1, getId_his_med());
        ps.setString(2, getId_medico_his());
        ps.setString(3, getId_paciente_his());
        ps.setString(4, getEnfermedad_act());
        ps.setString(5, getAnt_fam());
        ps.setString(6, getTrat_med());
        ps.setString(7, getAler_med());
        ps.setString(8, getMed_hab());
        ps.setString(9, getFum_b());
        ps.setString(10, getPro_card());
        ps.setString(11, getUlc_gas());
        ps.setString(12, getPresion());
        ps.setString(13, getHepat());
        ps.setString(14, getDiabetes());
        ps.setString(15, getEpilepsia());
        ps.setString(16, getDo_cab());
        ps.setString(17, getAl_endo());
        ps.setString(18, getVih());
        ps.setString(19, getPro_coagu());
        ps.setString(20, getFre_res());
        ps.setString(21, getFre_car());
        ps.setString(22, getPre_art());
        ps.setString(23, getTem());
        ps.setString(24, getOxim());
        ps.setDate(25, getFecha_his());
        ps.setString(26, getHora_his());
        ps.executeUpdate();
    return true;
        } catch (SQLException ex) {
            Logger.getLogger(Model_HistorialMedico.class.getName()).log(Level.SEVERE, null, ex);
        }
    return false;
    }
    //Actualizar historial medico
    public boolean actualizarHistorial_med(){
    try {
    String sql="Update historial_medico SET id_medico_his=?, id_paciente_his=?, enfermedad_act=?, ant_fam=?, trat_med=?, aler_med=?,"
            + "med_hab=?, fum_b=?, pro_card=?, ulc_gas=?, presion=?, epat=?, diabetes=?, epilepsia=?, do_cab=?, al_endo=?, vih=?, "
            + "pro_coagu=?, fre_res=?, fre_car=?, pre_art=?, tem=?, oxim=?, fecha_his=?, hora_his=? where id_his_med=?"; 
    PreparedStatement act_his= con.Con().prepareStatement(sql);
        
        act_his.setString(1, getId_medico_his());
        act_his.setString(2, getId_paciente_his());
        act_his.setString(3, getEnfermedad_act());
        act_his.setString(4, getAnt_fam());
        act_his.setString(5, getTrat_med());
        act_his.setString(6, getAler_med());
        act_his.setString(7, getMed_hab());
        act_his.setString(8, getFum_b());
        act_his.setString(9, getPro_card());
        act_his.setString(10, getUlc_gas());
        act_his.setString(11, getPresion());
        act_his.setString(12, getHepat());
        act_his.setString(13, getDiabetes());
        act_his.setString(14, getEpilepsia());
        act_his.setString(15, getDo_cab());
        act_his.setString(16, getAl_endo());
        act_his.setString(17, getVih());
        act_his.setString(18, getPro_coagu());
        act_his.setString(19, getFre_res());
        act_his.setString(20, getFre_car());
        act_his.setString(21, getPre_art());
        act_his.setString(22, getTem());
        act_his.setString(23, getOxim());
        act_his.setDate(24, getFecha_his());
        act_his.setString(25, getHora_his());
        act_his.setString(26, getId_his_med());   
        act_his.executeUpdate();
    return true;
        } catch (SQLException ex) {
            Logger.getLogger(Model_HistorialMedico.class.getName()).log(Level.SEVERE, null, ex);
           System.out.println(ex);
        }
    return false;
   }
}
