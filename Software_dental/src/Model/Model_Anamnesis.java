
package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

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
//
    public List<Anamnesis> listaran (String id_an){
        List<Anamnesis> mostrar = new ArrayList<Anamnesis>();
    String sql="";
    if(id_an.equals("")){
    sql="select * from anamnesis where id_paciente_ana ='"+id_an+"'";
    } else {
     sql="select a.id_anamnesis,a.id_doctor_an, a.id_paciente_ana, p.nombres ||' '|| p.apellidos as nombres from anamnesis a join doctor d on a.id_doctor_an=d.id_doctor"
             + " join persona p on p.cedula=d.cedula_doc where id_paciente_ana ='"+id_an+"'";
    }
     try {
         PreparedStatement ps = null;
        ResultSet rs = null;
         ps = con.getConnection().prepareStatement(sql);
         rs = ps.executeQuery();
  //      ResultSet rs=con.consulta(sql);
        while(rs.next()){
          Anamnesis anam=new Anamnesis();
          anam.setId_anamnesis(rs.getString(1));
          anam.setId_doctor(rs.getString(2));
          anam.setId_paciente(rs.getString(3));
          anam.setEmbarazo(rs.getString(4));
          mostrar.add(anam);
         }
        rs.close();
        return mostrar;
//        String sql="Select id_paciente from paciente where cedula_pac ='"+ced+"'";
//        PreparedStatement ps = null;
//        ResultSet rs = null;
//        try{    
//                ps = con.Con().prepareStatement(sql);
//                rs = ps.executeQuery();
//                while(rs.next()){
//                    id = rs.getString(1);
//                }
//        }catch(SQLException ex){
//            id = "";
//        }
//    return id;
//            }
        } catch (SQLException e) {
            System.out.println(e);

        }
        return null;
    }
    //Listar y buscar
    public List<Anamnesis> listarbuscar (String busc, String id_an){
    List<Anamnesis> mostrar = new ArrayList<Anamnesis>();
    String sql="";
    if(id_an.equals("")){
    sql="select * from anamnesis where id_paciente_ana ='"+busc+"'";
    } else {
     sql="select * from anamnesis where id_paciente_ana ='"+busc+"' and id_anamnesis='"+id_an+"'";
    }
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
public List<Paciente> listarPersonas(String busc){
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
                ps = con.getConnection().prepareStatement(sql);
                rs = ps.executeQuery();
                while(rs.next()){
                    id = rs.getString(1);
                }
        }catch(SQLException ex){
            id = "";
        }
    return id;
 }
//cedula paciente
    public String cedulaPac(String id){
    String cedula ="";
        String sql="Select cedula_pac from paciente where id_paciente ='"+id+"'";
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{    
            ps = con.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
             cedula = rs.getString(1);
           }
        }catch(SQLException ex){
            cedula = "";
        }
    return cedula;
 }
//medico id
    public String idMed(String ced){
    String id ="";
        String sql="Select id_doctor from doctor where cedula_doc ='"+ced+"'";
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{    
                ps = con.getConnection().prepareStatement(sql);
                rs = ps.executeQuery();
                while(rs.next()){
                    id = rs.getString(1);
                }
        }catch(SQLException ex){
            id = "";
        }
    return id;
 }
  //medico cedula
    public String cedulaMed(String idmed){
    String cedmed ="";
        String sql="Select cedula_doc from doctor where id_doctor ='"+idmed+"'";
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{    
                ps = con.getConnection().prepareStatement(sql);
                rs = ps.executeQuery();
                while(rs.next()){
                    cedmed = rs.getString(1);
                }
        }catch(SQLException ex){
            cedmed = "";
        }
    return cedmed;
 }   
     //Listar medico
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
     //especialidad
     public String especialidad_Med(String ced){
    String espec ="";
        String sql="Select especialidad from doctor where cedula_doc ='"+ced+"'";
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{    
            ps = con.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
              espec = rs.getString(1);
            }
        }catch(SQLException ex){
            espec = "";
        }
    return espec;
 }
     //Cargar doctores tabla
//     public void cargar_doctorestabla(JTable tbl1, String valor){
//   
//        String[] columnas ={"Cedula","Nombre","Apellido","Especialidad","Telefono"};
//        
//       DefaultTableModel tabla = new DefaultTableModel(null,columnas){
//        @Override
//        public boolean isCellEditable(int filas, int columnas){
//        if(columnas==5){
//        return true;
//        } else{
//            return false;
//        }
//        };
//        };
//        String sql;
//        tbl1.setModel(tabla);
//        String [] datos = new String [5];
//        if(valor.equals("")){
//       
//    sql="SELECT p.cedula, p.nombres, p.apellidos, d.especialidad, p.telefono from persona p join doctor d on p.cedula=cedula_doc";
//        } else {
//        sql="SELECT p.cedula, p.nombres, p.apellidos, d.especialidad, p.telefono from persona p join doctor d on p.cedula=cedula_doc"
//                + "WHERE p.cedula  LIKE '%"+valor+"%' or p.nombres LIKE '%"+valor+"%' or p.apellidos like '%"+valor+"%'";
//
//        }
//        try {
//           ResultSet rs=con.consulta(sql);
//           while(rs.next()){
//           datos[0]=rs.getString(1);
//           datos[1]=rs.getString(2);
//           datos[2]=rs.getString(3);
//           datos[3]=rs.getString(4);
//           datos[4]=rs.getString(5);
//           tabla.addRow(datos);
//           }
//           tbl1.setModel(tabla);
//        } catch (SQLException e) {
//               JOptionPane.showMessageDialog(null, "Error: SQLException ","Error", JOptionPane.PLAIN_MESSAGE);
//            System.out.println(e);
//            
//        }
//    }
////Cargar doctores tabla
//     public void cargar_pacientestabla(JTable tbl1, String busc){
//   
//        String[] columnas ={"Cedula","Nombres","Apellidos","Direccion","Telefono","Correo"};
//        
//       DefaultTableModel tabla = new DefaultTableModel(null,columnas){
//        @Override
//        public boolean isCellEditable(int filas, int columnas){
//        if(columnas==6){
//        return true;
//        } else{
//            return false;
//        }
//        };
//        };
//        String sql;
//        tbl1.setModel(tabla);
//        String [] datos = new String [6];
//        if(busc.equals("")){
//       
//    sql="SELECT p.cedula, p.nombres, p.apellidos, p.direccion, p.telefono, p.correo from persona p join paciente pac on p.cedula=cedula_pac";
//        } else {
//        sql="SELECT p.cedula, p.nombres, p.apellidos, p.direccion, p.telefono, p.correo from persona p join paciente pac on p.cedula=cedula_pac"
//                + "WHERE p.cedula  LIKE '%"+busc+"%' or p.nombre LIKE '%"+busc+"%' or p.apellido like '%"+busc+"%'";
//
//        }
//        try {
//           ResultSet rs=con.consulta(sql);
//           while(rs.next()){
//           datos[0]=rs.getString(1);
//           datos[1]=rs.getString(2);
//           datos[2]=rs.getString(3);
//           datos[3]=rs.getString(4);
//           datos[4]=rs.getString(5);
//           datos[5]=rs.getString(6);
//           tabla.addRow(datos);
//           }
//           tbl1.setModel(tabla);
//        } catch (SQLException e) {
//               JOptionPane.showMessageDialog(null, "Error: SQLException ","Error", JOptionPane.PLAIN_MESSAGE);
//            System.out.println(e);
//            
//        }
//    }
//generar id anamnesis
     public String id_anam(){
        String sql = "SELECT MAX (CAST (id_anamnesis AS INTEGER)) FROM anamnesis ";
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
     //
     public String id_act_anam(){
        String sql = "SELECT MAX (CAST (id_anamnesis AS INTEGER)) FROM anamnesis ";
        String id = "";
        try {
            ResultSet rs = con.consulta(sql);
            while (rs.next()) {
            id = rs.getString(1);
            }
        } catch (SQLException e) {
            System.out.println(e);

        }
        return id;
    }
    //Crear
    public boolean crearAnamnesis(){
    try {
    String sql;
    sql="Insert into anamnesis (id_anamnesis, id_paciente_ana, embarazo, motiv_consul, pro_actual, id_doctor_an)";
    sql+="values(?,?,?,?,?,?)";    
        PreparedStatement ps= con.getConnection().prepareStatement(sql);
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
    PreparedStatement act_an= con.getConnection().prepareStatement(sql);
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
