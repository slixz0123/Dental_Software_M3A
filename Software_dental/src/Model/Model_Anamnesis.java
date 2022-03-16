
package Model;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Saul
 */
public class Model_Anamnesis extends Anamnesis{
    ConexionPg con= new ConexionPg();

    public Model_Anamnesis() {
    }

    public Model_Anamnesis(String id_anamnesis, String id_paciente, String embarazo, String motiv_consul, String proble_act, String id_doctor) {
        super(id_anamnesis, id_paciente, embarazo, motiv_consul, proble_act, id_doctor);
    }

    //Listar y buscar
    public List<Anamnesis> listarbuscar (String busc){
    List<Anamnesis> mostrar = new ArrayList<Anamnesis>();
    String sql="";
    if(busc.equals("")){
    sql="select * from anamnesis";
    } else {
     sql="select * from anamnesis where id_anamnesis like'%"+busc+"%' or id_paciente_ana like '%"+busc+"%'";}
     try {       
        ResultSet rs=con.consulta(sql);
        while(rs.next()){
          Anamnesis anam=new Anamnesis();
          anam.setId_anamnesis(rs.getString("id_anamnesis"));
          anam.setId_paciente(rs.getString("id_paciente_ana"));
          anam.setEmbarazo(rs.getString("embarazo"));
          anam.setMotiv_consul(rs.getString("motiv_consul"));
          anam.setProble_act(rs.getString("pro_actual"));
          anam.setId_doctor(rs.getString("id_doctor_an"));
          mostrar.add(anam);
         }
        rs.close();
        return mostrar;
      } catch (SQLException ex) {
        Logger.getLogger(Model_Anamnesis.class.getName()).log(Level.SEVERE, null, ex);
       return null;
    }
 }
    //Listar pacientes
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
      Logger.getLogger(Model_Anamnesis.class.getName()).log(Level.SEVERE, null, ex);
    return null;
   }
 }
//paciente id
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
     //extraer fecha nacimiento
     public Date fecha_nac(String id){
     Date fecha =null;
        String sql="Select fecha_nac from paciente where id_paciente ='"+id+"'";
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{    
                ps = con.Con().prepareStatement(sql);
                rs = ps.executeQuery();
                while(rs.next()){
                    fecha = rs.getDate(3);
                }
        }catch(SQLException ex){
            fecha = null;
        }
        return fecha;
     }
     //Listar medico
     public List<Doctor> listarMedico(String id){
        List<Doctor> lista = new ArrayList<Doctor>();
        try {
            String sql="select * from doctor where id_doctor='"+id+"'";
            ResultSet rs=con.consulta(sql);
            while(rs.next()){
                Doctor doc=new Doctor();
                doc.setId_doctor(rs.getString("id_doctor"));
                doc.setId_usuario(rs.getString("id_usuario"));
                doc.setEspecialidad(rs.getString("especialidad"));
                doc.setCargo(rs.getString("cargo"));
                doc.setCedula_doc(rs.getString("cedula_doc"));
                lista.add(doc);
            }
            rs.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(Model_Anamnesis.class.getName()).log(Level.SEVERE, null, ex);
        return null;
        }
    }
     //extraer nombres completos doctor
     public void cargar_doc(JComboBox cb_doc){    
        String sql = "SELECT d.id_doctor, p.nombres, p.apellidos FROM persona p join doctor d on p.cedula=d.cedula_doc";
        PreparedStatement ps = null;
        ResultSet res = null;
        try {  
        ps = con.Con().prepareStatement(sql);
        res = ps.executeQuery();
        //LLenamos nuestro ComboBox
        cb_doc.addItem("Seleccione el medico");
   
        while(res.next()){
          cb_doc.addItem(res.getString("id_doctor").concat(" ").concat(res.getString("nombres")).concat(" ").concat(res.getString("apellidos")));
         }
      } catch (SQLException e) {
    JOptionPane.showMessageDialog(null, e);
    }
   } 
//extraer id combobox
     public List<Integer> extraerNumeros(String dat) {
      List<Integer> num = new ArrayList<Integer>();
      Matcher encon = Pattern.compile("\\d+").matcher(dat);
      while (encon.find()) { 
        num.add(Integer.parseInt(encon.group()));
      } 
      return num;
 }
//generar id anamnesis
     public String id_anam(String sql){
        String id = "1";
        int valor;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{    
                ps = con.Con().prepareStatement(sql);
                rs = ps.executeQuery();
                while(rs.next()){
                    id = rs.getString(1);
                    valor=Integer.parseInt(id)+1;
                    id=String.valueOf(valor);
                }
        }catch(SQLException ex){
            System.out.println("idmaximo"+ex.getMessage());
            id = "1";
        }
        return id;
    }
    //Crear
    public boolean crearAnamnesis(){
    try {
    String sql;
    sql="Insert into anamnesis (id_anamnesis, id_paciente_ana, embarazo, motiv_consul, pro_actual, id_doctor_an)";
    sql+="values(?,?,?,?,?,?)";    
        PreparedStatement ps= con.Con().prepareStatement(sql);
        ps.setString(1, getId_anamnesis());
        ps.setString(2, getId_paciente());
        ps.setString(3, getEmbarazo());
        ps.setString(4, getMotiv_consul());
        ps.setString(5, getProble_act());
        ps.setString(6, getId_doctor());
        ps.executeUpdate();
    return true;
        } catch (SQLException ex) {
            Logger.getLogger(Model_Anamnesis.class.getName()).log(Level.SEVERE, null, ex);
        }
    return false;
    }
    //Actualizar
    public boolean actualizarAnamnesis(){
    try {
    String sql;
    sql="Update anamnesis SET id_paciente_ana=?, embarazo=?, motiv_consul=?,pro_actual=?, id_doctor_an=? WHERE id_anamnesis=?";
    PreparedStatement act_an= con.Con().prepareStatement(sql);
    act_an.setString(1, getId_paciente());
    act_an.setString(2, getEmbarazo());
    act_an.setString(3, getMotiv_consul());
    act_an.setString(4, getProble_act());
    act_an.setString(5, getId_doctor());
    act_an.setString(6, getId_anamnesis());
    act_an.executeUpdate();
    return true;
        } catch (SQLException ex) {
            Logger.getLogger(Model_Anamnesis.class.getName()).log(Level.SEVERE, null, ex);
        }
    return false;
   }
    //Eliminar
    public boolean eliminarAnamnesis(){
    String sql;
    sql="Delete from anamnesis where id_anamnesis='"+getId_anamnesis()+"'";
    return con.accion(sql);
   }
}
