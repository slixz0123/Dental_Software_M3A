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
public class Diagnostico {
    private String id_diagnostico;
    private String id_tratamiento;
    private String protesis_sup;
    private String protesis_inf;
    private String diagnostico;
    private Double precio_trat;

    public Diagnostico() {
    }

    public Diagnostico(String id_diagnostico, String id_tratamiento, String protesis_sup, String protesis_inf, String diagnostico, Double precio_trat) {
        this.id_diagnostico = id_diagnostico;
        this.id_tratamiento = id_tratamiento;
        this.protesis_sup = protesis_sup;
        this.protesis_inf = protesis_inf;
        this.diagnostico = diagnostico;
        this.precio_trat = precio_trat;
    }

    public String getId_diagnostico() {
        return id_diagnostico;
    }

    public void setId_diagnostico(String id_diagnostico) {
        this.id_diagnostico = id_diagnostico;
    }

    public String getId_tratamiento() {
        return id_tratamiento;
    }

    public void setId_tratamiento(String id_tratamiento) {
        this.id_tratamiento = id_tratamiento;
    }

    public String getProtesis_sup() {
        return protesis_sup;
    }

    public void setProtesis_sup(String protesis_sup) {
        this.protesis_sup = protesis_sup;
    }

    public String getProtesis_inf() {
        return protesis_inf;
    }

    public void setProtesis_inf(String protesis_inf) {
        this.protesis_inf = protesis_inf;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public Double getPrecio_trat() {
        return precio_trat;
    }

    public void setPrecio_trat(Double precio_trat) {
        this.precio_trat = precio_trat;
    }
    
}
