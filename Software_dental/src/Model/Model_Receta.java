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
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jose illescas
 */
public class Model_Receta extends receta{
    ConexionPg con = new ConexionPg();

    public Model_Receta() {
    }

    public Model_Receta(String id_receta, String cedula_pac, String nombre, String apellido, String sexo, String edad, Date fecha, String farmaco, String miligramos, String cantidad, String dosis, String frecuencia, String observaciones, String alergias) {
        super(id_receta, cedula_pac, nombre, apellido, sexo, edad, fecha, farmaco, miligramos, cantidad, dosis, frecuencia, observaciones, alergias);
    }

    
    
    public String id_receta(){
        String sql = "SELECT MAX (CAST (id_receta AS INTEGER)) FROM receta ";
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
    
    public boolean crearReceta(){
    try {
    String sql;
    sql="INSERT INTO receta (id_receta, cedula, nombres, sexo, edad, fecha, farmaco_mg, cantidad, dosis, frecuencia, observaciones, alergias)";
    sql+="VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";    
        PreparedStatement ps= con.Con().prepareStatement(sql);
        ps.setString(1, getId_receta());
        ps.setString(2, getCedula_pac());
        ps.setString(3, getNombre()+" "+getApellido());
        ps.setString(4, getSexo());
        ps.setString(5, getEdad());
        ps.setDate(6, getFecha());
        ps.setString(7, getFarmaco()+" "+getMiligramos()+"mg");
        ps.setString(8, getCantidad());
        ps.setString(9, getDosis());
        ps.setString(10, getFrecuencia());
        ps.setString(11, getObservaciones());
        ps.setString(12, getAlergias());
        ps.executeUpdate();
    return true;
        } catch (SQLException ex) {
            Logger.getLogger(Model_Receta.class.getName()).log(Level.SEVERE, null, ex);
        }
    return false;
    }
    
    public List<Paciente> cargartxtsobrantes ( String cedula){
    List<Paciente> milistapaci = new ArrayList<Paciente>();
    String sql3;
    
        try {
            sql3 = "select p.cedula, p.nombres , p.apellidos ,p.genero , pac.fecha_nac from  persona p , paciente pac WHERE   pac.cedula_pac = p.cedula AND pac.cedula_pac = '"+cedula+"' " ;
            ResultSet rs = con.consulta(sql3) ;
            
            // barremos el resulset
            while(rs.next()){
                Paciente pac = new Paciente();
//                historia_clinica hc=new historia_clinica();
               
                pac.setCedula(rs.getString("cedula"));
                pac.setNombres(rs.getString("nombres"));
                pac.setApellidos(rs.getString("apellidos"));
                pac.setGenero(rs.getString("genero"));
                pac.setFecha_nac(rs.getDate("fecha_nac"));
//                hc.setAlergias_his(rs.getString("alergias_his"));
                
                milistapaci.add(pac);
       
                
                
            }
            return milistapaci;
        } catch (SQLException ex) {
            System.out.println(ex);
            Logger.getLogger(Model_Receta.class.getName()).log(Level.SEVERE, null, ex);
        return null;
        }
    }   
    
    public String alergia(String cedula){
        String sql = "select hc.alergias_his from historia_clinica hc join paciente pac on pac.id_paciente=hc.id_pac_his join persona per on per.cedula=pac.cedula_pac where per.cedula='"+cedula+"' ";
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

    
    public List<historia_clinica> cargarAlergia ( String cedula){
    List<historia_clinica> alergia = new ArrayList<historia_clinica>();
    
    String sql3;
    
        try {
            sql3 = "select hc.alergias_his from historia_clinica hc join paciente pac on pac.id_paciente=hc.id_pac_his join persona per on per.cedula=pac.cedula_pac where per.cedula='"+cedula+"' " ;
            ResultSet rs = con.consulta(sql3) ;
            
            // barremos el resulset
            while(rs.next()){
                historia_clinica hc=new historia_clinica();
               
                
                hc.setAlergias_his(rs.getString("alergias_his"));
                
                alergia.add(hc);
       
                System.out.println(rs.getString("alergias_his")+"");
                
            }
            return alergia;
        } catch (SQLException ex) {
            System.out.println(ex);
            Logger.getLogger(Model_Receta.class.getName()).log(Level.SEVERE, null, ex);
        return null;
        }
    }
    
    public List<farmaco> mostrarFarmaco ( ){
    List<farmaco> milistafar = new ArrayList<farmaco>();
    String sql3;
    
        try {
            sql3 = "select nombre_farmaco, mg from  farmaco" ;
            ResultSet rs = con.consulta(sql3) ;
            
            // barremos el resulset
            while(rs.next()){
                farmaco far = new farmaco();
//                far.setId_farmaco(rs.getString(1));
                far.setNombre_farmaco(rs.getString(1));
                far.setMiligramos(rs.getString(2));
                
                milistafar.add(far);
                
                
            }
            return milistafar;
        } catch (SQLException ex) {
            System.out.println(ex);
            Logger.getLogger(Model_Receta.class.getName()).log(Level.SEVERE, null, ex);
        return null;
        }

   
    }
    
    public List<Cie_10> mostrarCIE10 ( ){
    List<Cie_10> milistacie = new ArrayList<Cie_10>();
    String sql3;
    
        try {
            sql3 = "select id_cie, categoria, titulo from  cie_10" ;
            ResultSet rs = con.consulta(sql3) ;
            
            // barremos el resulset
            while(rs.next()){
                Cie_10 cie = new Cie_10();
                cie.setId_cie(rs.getString(1));
                cie.setCategoria(rs.getString(2));
                cie.setTitulo(rs.getString(3));
                
                milistacie.add(cie);
                
                
            }
            return milistacie;
        } catch (SQLException ex) {
            System.out.println(ex);
            Logger.getLogger(Model_Receta.class.getName()).log(Level.SEVERE, null, ex);
        return null;
        }
    }
    
    public List<farmaco> buscarFarmacos ( String buscar){
    List<farmaco> milistafar = new ArrayList<farmaco>();
    String sql3;
     if(buscar.equals(null)){
   sql3 = "select nombre_farmaco, mg  from  farmaco" ;
    } else {
     sql3 = "select  nombre_farmaco, mg from  farmaco ";
            sql3 += " WHERE UPPER(nombre_farmaco) LIKE UPPER('%" + buscar + "%')";    
     try {
            ResultSet rs = con.consulta(sql3) ;
            
            // barremos el resulset
            while(rs.next()){
                farmaco far = new farmaco();
//                far.setId_farmaco(rs.getString(1));
                far.setNombre_farmaco(rs.getString(1));
                far.setMiligramos(rs.getString(2));
                
                milistafar.add(far);

            }
           
        } catch (SQLException ex) {
            System.out.println(ex);
            Logger.getLogger(Model_Receta.class.getName()).log(Level.SEVERE, null, ex);
        return null;
        }
 
   
    }
     return milistafar;
         }
    
    public List<Cie_10> buscarCIE10 ( String buscar){
    List<Cie_10> milistacie = new ArrayList<Cie_10>();
    String sql3;
     if(buscar.equals(null)){
   sql3 = "select id_cie, categoria, titulo from  cie_10" ;
            } else {
     sql3 = "select id_cie, categoria, titulo from  cie_10 "

            + " WHERE UPPER(id_cie) LIKE UPPER('%" + buscar + "%') OR ";
            sql3 += "UPPER(categoria) LIKE UPPER('%" + buscar + "%') OR ";
            sql3 += " UPPER(titulo) LIKE UPPER('%" + buscar + "%')";    
     try {
            ResultSet rs = con.consulta(sql3) ;
            
            // barremos el resulset
            while(rs.next()){
                Cie_10 cie = new Cie_10();
                cie.setId_cie(rs.getString(1));
                cie.setCategoria(rs.getString(2));
                cie.setTitulo(rs.getString(3));
                
                milistacie.add(cie);

            }
           
        } catch (SQLException ex) {
            System.out.println(ex);
            Logger.getLogger(Model_Receta.class.getName()).log(Level.SEVERE, null, ex);
        return null;
        }
 
   
    }
     return milistacie;
         }
}
