/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class Model_Consentimiento extends Consentimiento {
    ConexionPg con= new ConexionPg();

    public Model_Consentimiento() {
    }

    public Model_Consentimiento(String id_consentimiento, String id_historia, String id_pac, String nombre_pac, String nombre_doc) {
        super(id_consentimiento, id_historia, id_pac, nombre_pac, nombre_doc);
    }
    //Listar y buscar
    public List<Consentimiento> listbuscConsentimientos (String busc){
    List<Consentimiento> mostrar = new ArrayList<Consentimiento>();
    String sql="";
    if(busc.equals("")){
    sql="select * from consentimiento";
    } else {
    sql="select * from consentimiento where id_consent like'%"+busc+"%' or nom_paci_cons like '%"+busc+"%'";}
       try {  
            ResultSet rs=con.consulta(sql);
            while(rs.next()){
                Consentimiento cons=new Consentimiento();
                cons.setId_consentimiento(rs.getString("id_consent"));
                cons.setId_historia(rs.getString("id_historia_cli_con"));
                cons.setId_pac(rs.getString("id_paciente_cons"));
                cons.setNombre_pac(rs.getString("nom_paci_cons"));
                cons.setNombre_doc(rs.getString("nom_doc_cons"));
                mostrar.add(cons);
            }
            rs.close();
            return mostrar;
        } catch (SQLException ex) {
            Logger.getLogger(Model_Consentimiento.class.getName()).log(Level.SEVERE, null, ex);
        return null;
        }
    }
    //Crear
    public boolean crearConsentimiento(){
    try {
    String sql;
    sql="Insert into consentimiento (id_consent, id_historia_cli_con,id_paciente_cons,nom_paci_cons,nom_doc_cons)";
    sql+="values(?,?,?,?,?)";   
    PreparedStatement ps= con.Con().prepareStatement(sql);
    ps.setString(1, getId_consentimiento());
    ps.setString(2, getId_historia());
    ps.setString(3, getId_pac());
    ps.setString(4, getNombre_pac());
    ps.setString(5, getNombre_doc());
    ps.executeUpdate();
    return true;
        } catch (SQLException ex) {
            Logger.getLogger(Model_Consentimiento.class.getName()).log(Level.SEVERE, null, ex);
        }
    return false;
    }
    //Actualizar
    public boolean actualizarConsentimiento(){
    try {
    String sql;
    sql="Update consentimiento SET id_historia_cli_con=?, id_paciente_cons=?, nom_paci_cons=?, nom_doc_cons=? WHERE id_consent=?";
    PreparedStatement act_an= con.Con().prepareStatement(sql);
    act_an.setString(1, getId_historia());
    act_an.setString(2, getId_pac());
    act_an.setString(3, getNombre_pac());
    act_an.setString(4, getNombre_doc());
    act_an.setString(5, getId_consentimiento());
    act_an.executeUpdate();
    return true;
        } catch (SQLException ex) {
            Logger.getLogger(Model_Consentimiento.class.getName()).log(Level.SEVERE, null, ex);
        }
    return false;
    }
    //Eliminar
    public boolean eliminarConsentimiento(){
    String sql;
    sql="Delete from consentimiento where id_consent='"+getId_consentimiento()+"'";
    return con.accion(sql);
    }
}
