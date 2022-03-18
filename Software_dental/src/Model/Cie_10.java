/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Saul
 */
public class Cie_10 {
    private String id_cie;
    private String categoria;
    private String titulo;

    public Cie_10() {
    }

    public Cie_10(String id_cie, String categoria, String titulo) {
        this.id_cie = id_cie;
        this.categoria = categoria;
        this.titulo = titulo;
    }

    public String getId_cie() {
        return id_cie;
    }

    public void setId_cie(String id_cie) {
        this.id_cie = id_cie;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    


   
    
}
