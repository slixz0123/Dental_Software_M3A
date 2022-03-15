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
public class Hist_clinico {
    private String id_historia;
    private Date fecha_his;
    private String id_pac;
    private String alergia;
    private String motivo;
    private String observacion;
    private String enfermedad;
    private String medicacion;
    private String id_odonto;

    public Hist_clinico() {
    }

    public Hist_clinico(String id_historia, Date fecha_his, String id_pac, String alergia, String motivo, String observacion, String enfermedad, String medicacion, String id_odonto) {
        this.id_historia = id_historia;
        this.fecha_his = fecha_his;
        this.id_pac = id_pac;
        this.alergia = alergia;
        this.motivo = motivo;
        this.observacion = observacion;
        this.enfermedad = enfermedad;
        this.medicacion = medicacion;
        this.id_odonto = id_odonto;
    }

    public String getId_historia() {
        return id_historia;
    }

    public void setId_historia(String id_historia) {
        this.id_historia = id_historia;
    }

    public Date getFecha_his() {
        return fecha_his;
    }

    public void setFecha_his(Date fecha_his) {
        this.fecha_his = fecha_his;
    }

    public String getId_pac() {
        return id_pac;
    }

    public void setId_pac(String id_pac) {
        this.id_pac = id_pac;
    }

    public String getAlergia() {
        return alergia;
    }

    public void setAlergia(String alergia) {
        this.alergia = alergia;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    public String getMedicacion() {
        return medicacion;
    }

    public void setMedicacion(String medicacion) {
        this.medicacion = medicacion;
    }

    public String getId_odonto() {
        return id_odonto;
    }

    public void setId_odonto(String id_odonto) {
        this.id_odonto = id_odonto;
    }
    
}
