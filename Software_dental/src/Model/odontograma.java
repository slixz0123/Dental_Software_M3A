/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author jose illescas
 */
public class odontograma {
    private String id_odontograma;
    private String id_pacien_odont;
    private int od_num_diente;
    private String od_descri;

    public odontograma() {
    }

    public odontograma(String id_odontograma, String id_pacien_odont, int od_num_diente, String od_descri) {
        this.id_odontograma = id_odontograma;
        this.id_pacien_odont = id_pacien_odont;
        this.od_num_diente = od_num_diente;
        this.od_descri = od_descri;
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

    public int getOd_num_diente() {
        return od_num_diente;
    }

    public void setOd_num_diente(int od_num_diente) {
        this.od_num_diente = od_num_diente;
    }

    public String getOd_descri() {
        return od_descri;
    }

    public void setOd_descri(String od_descri) {
        this.od_descri = od_descri;
    }
    
}
