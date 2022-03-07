/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Date;

/**
 *
 * @author jose illescas
 */
public class receta {
    private String id_receta;
    private Date fecha_receta;
    private String id_farmaco_rec;
    private String indicaciones;

    public receta() {
    }

    public receta(String id_receta, Date fecha_receta, String id_farmaco_rec, String indicaciones) {
        this.id_receta = id_receta;
        this.fecha_receta = fecha_receta;
        this.id_farmaco_rec = id_farmaco_rec;
        this.indicaciones = indicaciones;
    }

    public String getId_receta() {
        return id_receta;
    }

    public void setId_receta(String id_receta) {
        this.id_receta = id_receta;
    }

    public Date getFecha_receta() {
        return fecha_receta;
    }

    public void setFecha_receta(Date fecha_receta) {
        this.fecha_receta = fecha_receta;
    }

    public String getId_farmaco_rec() {
        return id_farmaco_rec;
    }

    public void setId_farmaco_rec(String id_farmaco_rec) {
        this.id_farmaco_rec = id_farmaco_rec;
    }

    public String getIndicaciones() {
        return indicaciones;
    }

    public void setIndicaciones(String indicaciones) {
        this.indicaciones = indicaciones;
    }
    
}
