/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author jose illescas
 */
public class receta {
    private String id_receta;
    private String cedula_pac;
    private String nombre;
    private String apellido;
    private String sexo;
    private String edad;
    private String fecha;
    private String farmaco;
    private String miligramos;
    private String cantidad;
    private String frecuencia;
    private String observaciones;
    private String alergias;
    private String id_titulo;
    private String categoria;
    private String id_rec_cie;
    private String id_rec_far;

    public receta() {
    }

    public receta(String id_receta, String cedula_pac, String nombre, String apellido, String sexo, String edad, String fecha, String farmaco, String miligramos, String cantidad, String frecuencia, String observaciones, String alergias, String id_titulo, String categoria) {
        this.id_receta = id_receta;
        this.cedula_pac = cedula_pac;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.edad = edad;
        this.fecha = fecha;
        this.farmaco = farmaco;
        this.miligramos = miligramos;
        this.cantidad = cantidad;
        this.frecuencia = frecuencia;
        this.observaciones = observaciones;
        this.alergias = alergias;
        this.id_titulo = id_titulo;
        this.categoria = categoria;
    }

    public receta(String id_receta, String farmaco, String miligramos, String cantidad, String frecuencia, String id_rec_far) {
        this.id_receta = id_receta;
        this.farmaco = farmaco;
        this.miligramos = miligramos;
        this.cantidad = cantidad;
        this.frecuencia = frecuencia;
        this.id_rec_far = id_rec_far;
    }

    

    public receta(String farmaco, String miligramos, String cantidad, String frecuencia) {
        this.farmaco = farmaco;
        this.miligramos = miligramos;
        this.cantidad = cantidad;
        this.frecuencia = frecuencia;
    }

    public receta(String id_titulo, String categoria) {
        this.id_titulo = id_titulo;
        this.categoria = categoria;
    }

    public receta(String id_receta, String cedula_pac, String nombre, String apellido, String sexo, String edad, String fecha, String observaciones, String alergias) {
        this.id_receta = id_receta;
        this.cedula_pac = cedula_pac;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.edad = edad;
        this.fecha = fecha;
        this.observaciones = observaciones;
        this.alergias = alergias;
    }

    
    public String getId_receta() {
        return id_receta;
    }

    public void setId_receta(String id_receta) {
        this.id_receta = id_receta;
    }

    public String getCedula_pac() {
        return cedula_pac;
    }

    public void setCedula_pac(String cedula_pac) {
        this.cedula_pac = cedula_pac;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getFarmaco() {
        return farmaco;
    }

    public void setFarmaco(String farmaco) {
        this.farmaco = farmaco;
    }

    public String getMiligramos() {
        return miligramos;
    }

    public void setMiligramos(String miligramos) {
        this.miligramos = miligramos;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(String frecuencia) {
        this.frecuencia = frecuencia;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getId_titulo() {
        return id_titulo;
    }

    public void setId_titulo(String id_titulo) {
        this.id_titulo = id_titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getId_rec_cie() {
        return id_rec_cie;
    }

    public void setId_rec_cie(String id_rec_cie) {
        this.id_rec_cie = id_rec_cie;
    }

    public String getId_rec_far() {
        return id_rec_far;
    }

    public void setId_rec_far(String id_rec_far) {
        this.id_rec_far = id_rec_far;
    }
    
}
