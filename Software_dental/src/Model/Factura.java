package Model;

import java.sql.Date;


public class Factura {
    private String serieFac;
    private String nombres;
    private String direccion;
    private String tratamiento;
    private Date fecha;
    private int cantidad;
    private double total;

    public Factura() {
    }

    public Factura(String serieFac, String nombres, String direccion, String tratamiento, Date fecha, int cantidad, double total) {
        this.serieFac = serieFac;
        this.nombres = nombres;
        this.direccion = direccion;
        this.tratamiento = tratamiento;
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.total = total;
    }

    public String getSerieFac() {
        return serieFac;
    }

    public void setSerieFac(String serieFac) {
        this.serieFac = serieFac;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    
}
