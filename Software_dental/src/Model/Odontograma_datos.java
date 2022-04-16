/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Date;

/**
 *
 * @author Saul
 */
public class Odontograma_datos {
    private int id_odontograma;
    private String id_pacien_odont;
    private String od_descri;
    private Date fecha;
    private byte[] imagenodontograma;

    public Odontograma_datos() {
    }

    public Odontograma_datos(int id_odontograma, String id_pacien_odont, String od_descri, Date fecha, byte[] imagenodontograma) {
        this.id_odontograma = id_odontograma;
        this.id_pacien_odont = id_pacien_odont;
        this.od_descri = od_descri;
        this.fecha = fecha;
        this.imagenodontograma = imagenodontograma;
    }

    public int getId_odontograma() {
        return id_odontograma;
    }

    public void setId_odontograma(int id_odontograma) {
        this.id_odontograma = id_odontograma;
    }

    public String getId_pacien_odont() {
        return id_pacien_odont;
    }

    public void setId_pacien_odont(String id_pacien_odont) {
        this.id_pacien_odont = id_pacien_odont;
    }

    public String getOd_descri() {
        return od_descri;
    }

    public void setOd_descri(String od_descri) {
        this.od_descri = od_descri;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public byte[] getImagenodontograma() {
        return imagenodontograma;
    }

    public void setImagenodontograma(byte[] imagenodontograma) {
        this.imagenodontograma = imagenodontograma;
    }
    
}
