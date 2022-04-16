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
public class Model_Diagnostico extends Diagnostico{
    ConexionPg con= new ConexionPg();

    public Model_Diagnostico() {
    }

    public Model_Diagnostico(String id_diagnostico, String id_tratamiento, String protesis_sup, String protesis_inf, String diagnostico, Double precio_trat) {
        super(id_diagnostico, id_tratamiento, protesis_sup, protesis_inf, diagnostico, precio_trat);
    }

     //Listar y buscar
    public List<Diagnostico> listbusdiag (String busc){
    List<Diagnostico> mostrar = new ArrayList<Diagnostico>();
    String sql="";
    if(busc.equals("")){
    sql="select * from diagnostico";
    } else {
    sql="select * from diagnostico where id_diagnostico like'%"+busc+"%' or diag_descrip like '%"+busc+"%'";}
       try {  
            ResultSet rs=con.consulta(sql);
            while(rs.next()){
                Diagnostico diag=new Diagnostico();
                diag.setId_diagnostico(rs.getString("id_diagnostico"));
                diag.setProtesis_sup(rs.getString("protesis_sup"));
                diag.setProtesis_inf(rs.getString("protesis_infe"));
                diag.setDiagnostico(rs.getString("diag_descrip"));
                diag.setId_tratamiento(rs.getString("id_tratamiento_diag"));
                diag.setPrecio_trat(rs.getDouble("precio_final"));
                mostrar.add(diag);
            }
            rs.close();
            con.desconectar();
            return mostrar;
        } catch (SQLException ex) {
            Logger.getLogger(Model_Diagnostico.class.getName()).log(Level.SEVERE, null, ex);
        return null;
        }
    }
    //Crear
    public boolean crearDiagnostico(){
    try {
        
    String sql;
    sql="Insert into diagnostico (id_diagnostico, protesis_sup,protesis_infe,diag_descrip,id_tratamiento_diag,precio_final)";
    sql+="values(?,?,?,?,?,?)";   
    PreparedStatement ps= con.Con().prepareStatement(sql);
    ps.setString(1, getId_diagnostico());
    ps.setString(2, getProtesis_sup());
    ps.setString(3, getProtesis_inf());
    ps.setString(4, getDiagnostico());
    ps.setString(5, getId_tratamiento());
    ps.setDouble(6, getPrecio_trat());
    ps.executeUpdate();
    ps.close();
    con.desconectar();
    return true;
    
        } catch (SQLException ex) {
            Logger.getLogger(Model_Diagnostico.class.getName()).log(Level.SEVERE, null, ex);
        }
    return false;
    }
    //Actualizar
    public boolean actualizarDiagnostico(){
    try {
    String sql;
    sql="Update diagnostico SET protesis_sup=?, protesis_infe=?, diag_descrip=?, id_tratamiento_diag=?, precio_final=? WHERE id_diagnostico=?";
    PreparedStatement arti= con.Con().prepareStatement(sql);
    arti.setString(1, getProtesis_sup());
    arti.setString(2, getProtesis_inf());
    arti.setString(3, getDiagnostico());
    arti.setString(4, getId_tratamiento());
    arti.setDouble(5, getPrecio_trat());
    arti.setString(6, getId_diagnostico());
    arti.executeUpdate();
    arti.close();
    con.desconectar();
    return true;
        } catch (SQLException ex) {
            Logger.getLogger(Model_Diagnostico.class.getName()).log(Level.SEVERE, null, ex);
        }
    return false;
    }
    //Eliminar
    public boolean eliminarDiagnostico(){
    String sql;
    sql="Delete from diagnostico where id_diagnostico='"+getId_diagnostico()+"'";
    return con.accion(sql);
    }
}
