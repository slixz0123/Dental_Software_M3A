/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author LENOVO
 */
public class Tratamiento {
     private String id_tratamiento;
     private String id_receta;
     private String nombre_trat;
     private String descripcion_trat;
     private Double precio_trat;
     private Double precio_des;

    public Tratamiento() {
    }

    public Tratamiento(String id_tratamiento, String id_receta, String nombre_trat, String descripcion_trat, Double precio_trat, Double precio_des) {
        this.id_tratamiento = id_tratamiento;
        this.id_receta = id_receta;
        this.nombre_trat = nombre_trat;
        this.descripcion_trat = descripcion_trat;
        this.precio_trat = precio_trat;
        this.precio_des = precio_des;
    }

    public String getId_tratamiento() {
        return id_tratamiento;
    }

    public void setId_tratamiento(String id_tratamiento) {
        this.id_tratamiento = id_tratamiento;
    }

    public String getId_receta() {
        return id_receta;
    }

    public void setId_receta(String id_receta) {
        this.id_receta = id_receta;
    }

    public String getNombre_trat() {
        return nombre_trat;
    }

    public void setNombre_trat(String nombre_trat) {
        this.nombre_trat = nombre_trat;
    }

    public String getDescripcion_trat() {
        return descripcion_trat;
    }

    public void setDescripcion_trat(String descripcion_trat) {
        this.descripcion_trat = descripcion_trat;
    }

    public Double getPrecio_trat() {
        return precio_trat;
    }

    public void setPrecio_trat(Double precio_trat) {
        this.precio_trat = precio_trat;
    }

    public Double getPrecio_des() {
        return precio_des;
    }

    public void setPrecio_des(Double precio_des) {
        this.precio_des = precio_des;
    }
      
     
}
