package Model;

public class Proforma {

    private int idDetProf;
    private double totalprod;
    private double preciounit;
    private String serieProf;
    private String cedula;
    private String tratamiento;
    private String fecha;
    private int cantidad;
    private double total;
    private String formaPago;
    private String observaciones;
    private double saldo;
    private double cuotaini;
    private int mesecredit;
    private double valorcuotamen;

    public Proforma() {
    }

    public Proforma(int idDetProf, double totalprod, double preciounit, String serieProf, String cedula, String tratamiento, String fecha, int cantidad, double total, String formaPago, String observaciones, double saldo, double cuotaini, int mesecredit, double valorcuotamen) {
        this.idDetProf = idDetProf;
        this.totalprod = totalprod;
        this.preciounit = preciounit;
        this.serieProf = serieProf;
        this.cedula = cedula;
        this.tratamiento = tratamiento;
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.total = total;
        this.formaPago = formaPago;
        this.observaciones = observaciones;
        this.saldo = saldo;
        this.cuotaini = cuotaini;
        this.mesecredit = mesecredit;
        this.valorcuotamen = valorcuotamen;
    }

    public int getIdDetProf() {
        return idDetProf;
    }

    public void setIdDetProf(int idDetProf) {
        this.idDetProf = idDetProf;
    }

    public double getTotalprod() {
        return totalprod;
    }

    public void setTotalprod(double totalprod) {
        this.totalprod = totalprod;
    }

    public double getPreciounit() {
        return preciounit;
    }

    public void setPreciounit(double preciounit) {
        this.preciounit = preciounit;
    }

    public String getSerieProf() {
        return serieProf;
    }

    public void setSerieProf(String serieProf) {
        this.serieProf = serieProf;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
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

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getCuotaini() {
        return cuotaini;
    }

    public void setCuotaini(double cuotaini) {
        this.cuotaini = cuotaini;
    }

    public int getMesecredit() {
        return mesecredit;
    }

    public void setMesecredit(int mesecredit) {
        this.mesecredit = mesecredit;
    }

    public double getValorcuotamen() {
        return valorcuotamen;
    }

    public void setValorcuotamen(double valorcuotamen) {
        this.valorcuotamen = valorcuotamen;
    }
    
    
}
