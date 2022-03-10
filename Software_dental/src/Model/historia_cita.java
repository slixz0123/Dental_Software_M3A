/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author jose illescas
 */
public class historia_cita {
    private String his_id;
    private String his_id_pac;
    private String his_id_cita;
    private String his_asistencia;
    private String his_descripcion;
    private String his_id_trata;
    private Double his_totalpago;
    private Double his_abono;
    private Double his_saldopend;

    public historia_cita() {
    }

    public historia_cita(String his_id, String his_id_pac, String his_id_cita, String his_asistencia, String his_descripcion, String his_id_trata, Double his_totalpago, Double his_abono, Double his_saldopend) {
        this.his_id = his_id;
        this.his_id_pac = his_id_pac;
        this.his_id_cita = his_id_cita;
        this.his_asistencia = his_asistencia;
        this.his_descripcion = his_descripcion;
        this.his_id_trata = his_id_trata;
        this.his_totalpago = his_totalpago;
        this.his_abono = his_abono;
        this.his_saldopend = his_saldopend;
    }

    public String getHis_id() {
        return his_id;
    }

    public void setHis_id(String his_id) {
        this.his_id = his_id;
    }

    public String getHis_id_pac() {
        return his_id_pac;
    }

    public void setHis_id_pac(String his_id_pac) {
        this.his_id_pac = his_id_pac;
    }

    public String getHis_id_cita() {
        return his_id_cita;
    }

    public void setHis_id_cita(String his_id_cita) {
        this.his_id_cita = his_id_cita;
    }

    public String getHis_asistencia() {
        return his_asistencia;
    }

    public void setHis_asistencia(String his_asistencia) {
        this.his_asistencia = his_asistencia;
    }

    public String getHis_descripcion() {
        return his_descripcion;
    }

    public void setHis_descripcion(String his_descripcion) {
        this.his_descripcion = his_descripcion;
    }

    public String getHis_id_trata() {
        return his_id_trata;
    }

    public void setHis_id_trata(String his_id_trata) {
        this.his_id_trata = his_id_trata;
    }

    public Double getHis_totalpago() {
        return his_totalpago;
    }

    public void setHis_totalpago(Double his_totalpago) {
        this.his_totalpago = his_totalpago;
    }

    public Double getHis_abono() {
        return his_abono;
    }

    public void setHis_abono(Double his_abono) {
        this.his_abono = his_abono;
    }

    public Double getHis_saldopend() {
        return his_saldopend;
    }

    public void setHis_saldopend(Double his_saldopend) {
        this.his_saldopend = his_saldopend;
    }
    
}
