/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.awt.Image;

/**
 *
 * @author LENOVO
 */
public class Doctor extends Persona {
    private String id_doctor;
    private String id_usuario;
    private String especialidad;
    private String cargo;
    private String cedula_doc;

    public Doctor() {
    }

    public Doctor(String id_doctor, String id_usuario, String especialidad, String cargo, String cedula_doc) {
        this.id_doctor = id_doctor;
        this.id_usuario = id_usuario;
        this.especialidad = especialidad;
        this.cargo = cargo;
        this.cedula_doc = cedula_doc;
    }

    public Doctor(String id_doctor, String id_usuario, String especialidad, String cargo, String cedula_doc, String cedula, String nombres, String apellidos, String celular, String telefono, String direccion, String correo, String provincia, String ciudad, String genero) {
        super(cedula, nombres, apellidos, celular, telefono, direccion, correo, provincia, ciudad, genero);
        this.id_doctor = id_doctor;
        this.id_usuario = id_usuario;
        this.especialidad = especialidad;
        this.cargo = cargo;
        this.cedula_doc = cedula_doc;
    }

    

    
    public String getId_doctor() {
        return id_doctor;
    }

    public void setId_doctor(String id_doctor) {
        this.id_doctor = id_doctor;
    }

    public String getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(String id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCedula_doc() {
        return cedula_doc;
    }

    public void setCedula_doc(String cedula_doc) {
        this.cedula_doc = cedula_doc;
    }
    
    
    
    
}
