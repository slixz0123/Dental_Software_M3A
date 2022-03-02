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
public class Cie_10 {
    private String id_cie;
    private String id_tratamiento;
    private String titulo;
    private String patologia;
    

    public Cie_10() {
    }

    public Cie_10(String id_cie, String id_tratamiento, String titulo, String patologia) {
        this.id_cie = id_cie;
        this.id_tratamiento = id_tratamiento;
        this.titulo = titulo;
        this.patologia = patologia;
    }

    public String getId_cie() {
        return id_cie;
    }

    public void setId_cie(String id_cie) {
        this.id_cie = id_cie;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPatologia() {
        return patologia;
    }

    public void setPatologia(String patologia) {
        this.patologia = patologia;
    }

    public String getId_tratamiento() {
        return id_tratamiento;
    }

    public void setId_tratamiento(String id_tratamiento) {
        this.id_tratamiento = id_tratamiento;
    }
    
}
