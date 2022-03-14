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
public class historia_clinica {
    private String id_historia_cli;
    private Date fecha_his;
    private String id_pac_his;
    private String alergias_his;
    private String motivo_his;
    private String observaciones_his;
    private String enfermedades_his;
    private String medicacion_his;
    private String id_odoto;

    public historia_clinica() {
    }

    public historia_clinica(String id_historia_cli, Date fecha_his, String id_pac_his, String alergias_his, String motivo_his, String observaciones_his, String enfermedades_his, String medicacion_his, String id_odoto) {
        this.id_historia_cli = id_historia_cli;
        this.fecha_his = fecha_his;
        this.id_pac_his = id_pac_his;
        this.alergias_his = alergias_his;
        this.motivo_his = motivo_his;
        this.observaciones_his = observaciones_his;
        this.enfermedades_his = enfermedades_his;
        this.medicacion_his = medicacion_his;
        this.id_odoto = id_odoto;
    }

    public String getId_historia_cli() {
        return id_historia_cli;
    }

    public void setId_historia_cli(String id_historia_cli) {
        this.id_historia_cli = id_historia_cli;
    }

    public Date getFecha_his() {
        return fecha_his;
    }

    public void setFecha_his(Date fecha_his) {
        this.fecha_his = fecha_his;
    }

    public String getId_pac_his() {
        return id_pac_his;
    }

    public void setId_pac_his(String id_pac_his) {
        this.id_pac_his = id_pac_his;
    }

    public String getAlergias_his() {
        return alergias_his;
    }

    public void setAlergias_his(String alergias_his) {
        this.alergias_his = alergias_his;
    }

    public String getMotivo_his() {
        return motivo_his;
    }

    public void setMotivo_his(String motivo_his) {
        this.motivo_his = motivo_his;
    }

    public String getObservaciones_his() {
        return observaciones_his;
    }

    public void setObservaciones_his(String observaciones_his) {
        this.observaciones_his = observaciones_his;
    }

    public String getEnfermedades_his() {
        return enfermedades_his;
    }

    public void setEnfermedades_his(String enfermedades_his) {
        this.enfermedades_his = enfermedades_his;
    }

    public String getMedicacion_his() {
        return medicacion_his;
    }

    public void setMedicacion_his(String medicacion_his) {
        this.medicacion_his = medicacion_his;
    }

    public String getId_odoto() {
        return id_odoto;
    }

    public void setId_odoto(String id_odoto) {
        this.id_odoto = id_odoto;
    }
    
}
