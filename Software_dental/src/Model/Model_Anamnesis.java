
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

    public Model_Anamnesis(String id_anamnesis, String id_paciente, String embarazo, String proble_rad, String motiv_consul, String proble_act, String nomb_repre, String ape_repre, String ced_repre, String ficha_fis, String contrato, String foto_anam) {
        super(id_anamnesis, id_paciente, embarazo, proble_rad, motiv_consul, proble_act, nomb_repre, ape_repre, ced_repre, ficha_fis, contrato, foto_anam);
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
                anam.setProble_rad(rs.getString("pro_radiant"));
                anam.setMotiv_consul(rs.getString("motiv_consul"));
                anam.setProble_act(rs.getString("pro_actual"));
                anam.setNomb_repre(rs.getString("nom_repre"));
                anam.setApe_repre(rs.getString("ape_repre"));
                anam.setCed_repre(rs.getString("ced_repre"));
                anam.setFicha_fis(rs.getString("ficha_fisica"));
                anam.setContrato(rs.getString("contrato"));
                mostrar.add(anam);
            }
            rs.close();
            return mostrar;
        } catch (SQLException ex) {
            Logger.getLogger(Model_Anamnesis.class.getName()).log(Level.SEVERE, null, ex);
        return null;
        }
    }
    //Crear
    public boolean crearAnamnesis(){
    try {
    String sql;
    sql="Insert into anamnesis (id_anamnesis, id_paciente_ana,embarazo,pro_radiant,motivo_consul,pro_actual,nom_repre,ape_repre,ced_repre, ficha_fisica,contrato)";
    sql+="values(?,?,?,?,?,?,?,?,?,?,?)";
        
    PreparedStatement ps= con.Con().prepareStatement(sql);
    ps.setString(1, getId_anamnesis());
    ps.setString(2, getId_paciente());
    ps.setString(3, getEmbarazo());
    ps.setString(4, getProble_rad());
    ps.setString(5, getMotiv_consul());
    ps.setString(6, getProble_act());
    ps.setString(7, getNomb_repre());
    ps.setString(8, getApe_repre());
    ps.setString(9, getCed_repre());
    ps.setString(10, getFicha_fis());
    ps.setString(11, getContrato());
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
    sql="Update anamnesis SET embarazo=?,pro_radiant=?,motivo_consul=?,pro_actual=?,nom_repre=?,ape_repre=?,ced_repre=?, ficha_fisica=?,contrato=? WHERE id_anamnesis=?";
    PreparedStatement act_an= con.Con().prepareStatement(sql);
    
    act_an.setString(1, getEmbarazo());
    act_an.setString(2, getProble_rad());
    act_an.setString(3, getMotiv_consul());
    act_an.setString(4, getProble_act());
    act_an.setString(5, getNomb_repre());
    act_an.setString(6, getApe_repre());
    act_an.setString(7, getCed_repre());
    act_an.setString(8, getFicha_fis());
    act_an.setString(9, getContrato());
    act_an.setString(10, getId_anamnesis());
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
