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
public class inventario {
    private String id_inventario;
    private String id_articulo_inv;
    private String inv_nombre_art;
    private String inv_marca_art;
    private int cantidad_inicial;
    private int stock;
    private String inv_lote;
    private String inv_registro;
    private Date inv_fecha;

    public inventario() {
    }

    public inventario(String id_inventario, String id_articulo_inv, String inv_nombre_art, String inv_marca_art, int cantidad_inicial, int stock, String inv_lote, String inv_registro, Date inv_fecha) {
        this.id_inventario = id_inventario;
        this.id_articulo_inv = id_articulo_inv;
        this.inv_nombre_art = inv_nombre_art;
        this.inv_marca_art = inv_marca_art;
        this.cantidad_inicial = cantidad_inicial;
        this.stock = stock;
        this.inv_lote = inv_lote;
        this.inv_registro = inv_registro;
        this.inv_fecha = inv_fecha;
    }

    public String getId_inventario() {
        return id_inventario;
    }

    public void setId_inventario(String id_inventario) {
        this.id_inventario = id_inventario;
    }

    public String getId_articulo_inv() {
        return id_articulo_inv;
    }

    public void setId_articulo_inv(String id_articulo_inv) {
        this.id_articulo_inv = id_articulo_inv;
    }

    public String getInv_nombre_art() {
        return inv_nombre_art;
    }

    public void setInv_nombre_art(String inv_nombre_art) {
        this.inv_nombre_art = inv_nombre_art;
    }

    public String getInv_marca_art() {
        return inv_marca_art;
    }

    public void setInv_marca_art(String inv_marca_art) {
        this.inv_marca_art = inv_marca_art;
    }

    public int getCantidad_inicial() {
        return cantidad_inicial;
    }

    public void setCantidad_inicial(int cantidad_inicial) {
        this.cantidad_inicial = cantidad_inicial;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getInv_lote() {
        return inv_lote;
    }

    public void setInv_lote(String inv_lote) {
        this.inv_lote = inv_lote;
    }

    public String getInv_registro() {
        return inv_registro;
    }

    public void setInv_registro(String inv_registro) {
        this.inv_registro = inv_registro;
    }

    public Date getInv_fecha() {
        return inv_fecha;
    }

    public void setInv_fecha(Date inv_fecha) {
        this.inv_fecha = inv_fecha;
    }
    
}
