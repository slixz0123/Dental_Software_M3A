/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Date;
/**
 *
 * @author LENOVO
 */
public class Paciente extends Persona{
    private String id_paciente;
    private String cedula_pac;
    private Date fecha_nac;
    private String contraindicaciones;
    private String enfermedad;
    private String ocupacion;
    private String estado_civil;

    public Paciente() {
    }

    public Paciente(String id_paciente, String cedula_pac, Date fecha_nac, String contraindicaciones, String enfermedad, String ocupacion, String estado_civil) {
        this.id_paciente = id_paciente;
        this.cedula_pac = cedula_pac;
        this.fecha_nac = fecha_nac;
        this.contraindicaciones = contraindicaciones;
        this.enfermedad = enfermedad;
        this.ocupacion = ocupacion;
        this.estado_civil = estado_civil;
    }

    public Paciente(String cedula, String primernombre, String segundonombre, String primerapellido, String segundoapellido, String telefono, String direccion, String correo, String provincia, String ciudad, String genero, byte[] foto) {
        super(cedula, primernombre, segundonombre, primerapellido, segundoapellido, telefono, direccion, correo, provincia, ciudad, genero, foto);
    }

    
    
    public String getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(String id_paciente) {
        this.id_paciente = id_paciente;
    }

    public String getCedula_pac() {
        return cedula_pac;
    }

    public void setCedula_pac(String cedula_pac) {
        this.cedula_pac = cedula_pac;
    }

    public Date getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(Date fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public String getContraindicaciones() {
        return contraindicaciones;
    }

    public void setContraindicaciones(String contraindicaciones) {
        this.contraindicaciones = contraindicaciones;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    
    
}
