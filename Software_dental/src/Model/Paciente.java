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
    private String tipo_sang;

    public Paciente() {
    }

    public Paciente(String id_paciente, String cedula_pac, Date fecha_nac, String tipo_sang, String cedula, String nombres, String apellidos, String celular, String telefono, String direccion, String correo, String provincia, String ciudad, String genero, byte[] foto) {
        super(cedula, nombres, apellidos, celular, telefono, direccion, correo, provincia, ciudad, genero, foto);
        this.id_paciente = id_paciente;
        this.cedula_pac = cedula_pac;
        this.fecha_nac = fecha_nac;
        this.tipo_sang = tipo_sang;
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

    public String getTipo_sang() {
        return tipo_sang;
    }

    public void setTipo_sang(String tipo_sang) {
        this.tipo_sang = tipo_sang;
    }
      
}
