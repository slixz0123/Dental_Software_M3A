package Model;

public class Factura {

    private int idDetalle;
    private double totalprod;
    private double preciounit;
    private String serieFac;
    private String nombres;
    private String direccion;
    private String tratamiento;
    private String fecha;
    private int cantidad;
    private double total;

    public Factura() {
    }

    public Factura(int idDetalle, double totalprod, double preciounit, String serieFac, String nombres, String direccion, String tratamiento, String fecha, int cantidad, double total) {
        this.idDetalle = idDetalle;
        this.totalprod = totalprod;
        this.preciounit = preciounit;
        this.serieFac = serieFac;
        this.nombres = nombres;
        this.direccion = direccion;
        this.tratamiento = tratamiento;
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.total = total;
    }

    public double getPreciounit() {
        return preciounit;
    }

    public void setPreciounit(double preciounit) {
        this.preciounit = preciounit;
    }

    public int getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }

    public double getTotalprod() {
        return totalprod;
    }

    public void setTotalprod(double totalprod) {
        this.totalprod = totalprod;
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

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
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
