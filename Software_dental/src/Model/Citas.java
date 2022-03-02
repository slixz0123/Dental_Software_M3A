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
public class Citas {
    private String id_cita;
    private String id_paciente;
    private Date fecha_cita;
    private String hora_cita;
    private String motivo;

    public Citas() {
    }

    public Citas(String id_cita, String id_paciente, Date fecha_cita, String hora_cita, String motivo) {
        this.id_cita = id_cita;
        this.id_paciente = id_paciente;
        this.fecha_cita = fecha_cita;
        this.hora_cita = hora_cita;
        this.motivo = motivo;
    }

    public String getId_cita() {
        return id_cita;
    }

    public void setId_cita(String id_cita) {
        this.id_cita = id_cita;
    }

    public String getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(String id_paciente) {
        this.id_paciente = id_paciente;
    }

    public Date getFecha_cita() {
        return fecha_cita;
    }

    public void setFecha_cita(Date fecha_cita) {
        this.fecha_cita = fecha_cita;
    }

    public String getHora_cita() {
        return hora_cita;
    }

    public void setHora_cita(String hora_cita) {
        this.hora_cita = hora_cita;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
    
}
