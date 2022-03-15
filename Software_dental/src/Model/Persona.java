/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.awt.Image;
import java.io.FileInputStream;

/**
 *
 * @author LENOVO
 */
public class Persona {
    private String cedula;
    private String nombres;
    private String apellidos;
    private String celular;
    private String telefono;
    private String direccion;
    private String correo;
    private String provincia;
    private String ciudad;
    private String genero;

    
    //foto

    private byte[] foto;
    
//    public Image getFoto() {
//        return foto;
//    }

//    public void setFoto(Image foto) {
//        this.foto = foto;
//    }
//    
//    private FileInputStream image;
//    private int largo;

    
    public Persona() {
    }

    public Persona(String cedula, String nombres, String apellidos, String celular, String telefono, String direccion, String correo, String provincia, String ciudad, String genero, byte[] foto) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.celular = celular;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
        this.provincia = provincia;
        this.ciudad = ciudad;
        this.genero = genero;
        this.foto = foto;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
//    public FileInputStream getImage() {
//        return image;
//    }
//
//    public void setImage(FileInputStream image) {
//        this.image = image;
//    }
//
//    public int getLargo() {
//        return largo;
//    }
//
//    public void setLargo(int largo) {
//        this.largo = largo;
//    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }
    
    }
