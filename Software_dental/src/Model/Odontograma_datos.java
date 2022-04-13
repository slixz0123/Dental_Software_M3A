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
public class Odontograma_datos {
    private String id_odontograma;
    private String id_pacien_odont;
    private String od_descri;
    private byte[] odontograma;

    public Odontograma_datos() {
    }

    public Odontograma_datos(String id_odontograma, String id_pacien_odont, String od_descri, byte[] odontograma) {
        this.id_odontograma = id_odontograma;
        this.id_pacien_odont = id_pacien_odont;
        this.od_descri = od_descri;
        this.odontograma = odontograma;
    }

    public String getId_odontograma() {
        return id_odontograma;
    }

    public void setId_odontograma(String id_odontograma) {
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

    public byte[] getOdontograma() {
        return odontograma;
    }

    public void setOdontograma(byte[] odontograma) {
        this.odontograma = odontograma;
    }
    
}
