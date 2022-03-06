
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
public class Model_Cie10 extends Cie_10{
    ConexionPg con= new ConexionPg();
    
    public Model_Cie10() {
    }

    public Model_Cie10(String id_cie, String id_tratamiento, String titulo, String patologia) {
        super(id_cie, id_tratamiento, titulo, patologia);
    }
    //Listar y buscar
    public List<Cie_10> listarbuscarcie (String busc){
    List<Cie_10> mostrar = new ArrayList<Cie_10>();
    String sql="";
    if(busc.equals("")){
    sql="select * from cie_10";
    } else {
        sql="select * from cie_10 where id_cie like'%"+busc+"%' or titulo like '%"+busc+"%'";}
        try {
            
            ResultSet rs=con.consulta(sql);
            while(rs.next()){
                Cie_10 micie=new Cie_10();
                micie.setId_cie(rs.getString("id_cie"));
                micie.setTitulo(rs.getString("titulo"));
                micie.setPatologia(rs.getString("tipo_patolog"));
                micie.setId_tratamiento(rs.getString("id_tratamiento_cie"));
                mostrar.add(micie);
            }
            rs.close();
            return mostrar;
        } catch (SQLException ex) {
            Logger.getLogger(Model_Cie10.class.getName()).log(Level.SEVERE, null, ex);
        return null;
        }
    }
    //Crear
    public boolean crearCie(){
    try {
    String sql;
    sql="Insert into cie_10 (id_cie, titulo,tipo_patolog,id_tratamiento_cie)";
    sql+="values(?,?,?,?)";
        
    PreparedStatement ps= con.Con().prepareStatement(sql);
    ps.setString(1, getId_cie());
    ps.setString(2, getTitulo());
    ps.setString(3, getPatologia());
    ps.setString(4, getId_tratamiento());
    ps.executeUpdate();
    return true;
        } catch (SQLException ex) {
            Logger.getLogger(Model_Cie10.class.getName()).log(Level.SEVERE, null, ex);
        }
    return false;
    }
    //Actualizar
    public boolean actualizarCie(){
    try {
    String sql;
    sql="Update cie_10 SET titulo=?,tipo_patolog=?,id_tratamiento_cie=? WHERE id_cie=?";
    PreparedStatement act_an= con.Con().prepareStatement(sql);
    
    act_an.setString(1, getTitulo());
    act_an.setString(2, getPatologia());
    act_an.setString(3, getId_tratamiento());
    act_an.setString(4, getId_cie());
    act_an.executeUpdate();
    return true;
        } catch (SQLException ex) {
            Logger.getLogger(Model_Cie10.class.getName()).log(Level.SEVERE, null, ex);
        }
    return false;
    }
    //Eliminar
    public boolean eliminarCie(){
    String sql;
    sql="Delete from cie_10 where id_cie='"+getId_cie()+"'";
    return con.accion(sql);
    }
    
}
