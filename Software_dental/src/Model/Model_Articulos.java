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
public class Model_Articulos extends Articulos {
    ConexionPg con= new ConexionPg();

    public Model_Articulos() {
    }

    public Model_Articulos(String id_articulo, String id_usuario, String nombre_art, String marca_art, int cantidad_art, double precio) {
        super(id_articulo, id_usuario, nombre_art, marca_art, cantidad_art, precio);
    }
    //Listar y buscar
    public List<Articulos> listbusart (String busc){
    List<Articulos> mostrar = new ArrayList<Articulos>();
    String sql="";
    if(busc.equals("")){
    sql="select * from articulos";
    } else {
    sql="select * from articulos where id_articulo like'%"+busc+"%' or nombre_arti like '%"+busc+"%'";}
       try {  
            ResultSet rs=con.consulta(sql);
            while(rs.next()){
                Articulos arti=new Articulos();
                arti.setId_articulo(rs.getString("id_articulo"));
                arti.setId_usuario(rs.getString("id_usuario"));
                arti.setNombre_art(rs.getString("nombre_arti"));
                arti.setMarca_art(rs.getString("marca_arti"));
                arti.setCantidad_art(rs.getInt("cantidad_arti"));
                arti.setPrecio(rs.getDouble("precio_arti"));
                mostrar.add(arti);
            }
            rs.close();
            return mostrar;
        } catch (SQLException ex) {
            Logger.getLogger(Model_Articulos.class.getName()).log(Level.SEVERE, null, ex);
        return null;
        }
    }
    //Crear
    public boolean crearArticulo(){
    try {
    String sql;
    sql="Insert into articulos (id_articulo, id_usuario,nombre_arti,marca_arti,cantidad_arti,precio_arti)";
    sql+="values(?,?,?,?,?,?)";   
    PreparedStatement ps= con.Con().prepareStatement(sql);
    ps.setString(1, getId_articulo());
    ps.setString(2, getId_usuario());
    ps.setString(3, getNombre_art());
    ps.setString(4, getMarca_art());
    ps.setInt(5, getCantidad_art());
    ps.setDouble(6, getPrecio());
    ps.executeUpdate();
    return true;
        } catch (SQLException ex) {
            Logger.getLogger(Model_Articulos.class.getName()).log(Level.SEVERE, null, ex);
        }
    return false;
    }
    //Actualizar
    public boolean actualizarArticulo(){
    try {
    String sql;
    sql="Update articulo SET id_usuario=?, nombre_arti=?, marca_arti=?, cantidad_arti=?, precio_arti=? WHERE id_articulo=?";
    PreparedStatement arti= con.Con().prepareStatement(sql);
    arti.setString(1, getId_usuario());
    arti.setString(2, getNombre_art());
    arti.setString(3, getMarca_art());
    arti.setInt(4, getCantidad_art());
    arti.setDouble(5, getPrecio());
    arti.setString(6, getId_articulo());
    arti.executeUpdate();
    return true;
        } catch (SQLException ex) {
            Logger.getLogger(Model_Articulos.class.getName()).log(Level.SEVERE, null, ex);
        }
    return false;
    }
    //Eliminar
    public boolean eliminarArticulo(){
    String sql;
    sql="Delete from articulos where id_anamnesis='"+getId_articulo()+"'";
    return con.accion(sql);
    }
}
