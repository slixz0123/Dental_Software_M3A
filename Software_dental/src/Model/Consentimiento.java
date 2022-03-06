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
public class Consentimiento {
    private String id_consentimiento;
    private String id_historia;
    private String id_pac;
    private String nombre_pac;
    private String nombre_doc;

    public Consentimiento() {
    }

    public Consentimiento(String id_consentimiento, String id_historia, String id_pac, String nombre_pac, String nombre_doc) {
        this.id_consentimiento = id_consentimiento;
        this.id_historia = id_historia;
        this.id_pac = id_pac;
        this.nombre_pac = nombre_pac;
        this.nombre_doc = nombre_doc;
    }

    public String getId_consentimiento() {
        return id_consentimiento;
    }

    public void setId_consentimiento(String id_consentimiento) {
        this.id_consentimiento = id_consentimiento;
    }

    public String getId_historia() {
        return id_historia;
    }

    public void setId_historia(String id_historia) {
        this.id_historia = id_historia;
    }

    public String getId_pac() {
        return id_pac;
    }

    public void setId_pac(String id_pac) {
        this.id_pac = id_pac;
    }

    public String getNombre_pac() {
        return nombre_pac;
    }

    public void setNombre_pac(String nombre_pac) {
        this.nombre_pac = nombre_pac;
    }

    public String getNombre_doc() {
        return nombre_doc;
    }

    public void setNombre_doc(String nombre_doc) {
        this.nombre_doc = nombre_doc;
    }
    
}
