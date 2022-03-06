/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Saul
 */
public class Articulos {
    private String id_articulo;
    private String id_usuario;
    private String nombre_art;
    private String marca_art;
    private int cantidad_art;
    private double precio;

    public Articulos() {
    }

    public Articulos(String id_articulo, String id_usuario, String nombre_art, String marca_art, int cantidad_art, double precio) {
        this.id_articulo = id_articulo;
        this.id_usuario = id_usuario;
        this.nombre_art = nombre_art;
        this.marca_art = marca_art;
        this.cantidad_art = cantidad_art;
        this.precio = precio;
    }

    public String getId_articulo() {
        return id_articulo;
    }

    public void setId_articulo(String id_articulo) {
        this.id_articulo = id_articulo;
    }

    public String getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(String id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre_art() {
        return nombre_art;
    }

    public void setNombre_art(String nombre_art) {
        this.nombre_art = nombre_art;
    }

    public String getMarca_art() {
        return marca_art;
    }

    public void setMarca_art(String marca_art) {
        this.marca_art = marca_art;
    }

    public int getCantidad_art() {
        return cantidad_art;
    }

    public void setCantidad_art(int cantidad_art) {
        this.cantidad_art = cantidad_art;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}
