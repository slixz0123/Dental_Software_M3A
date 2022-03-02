/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author LENOVO
 */
public class Usuario {
     private String id_usuario;
     private String clave_usuario;
     private String permiso;

    public Usuario() {
    }

    public Usuario(String id_usuario, String clave_usuario, String permiso) {
        this.id_usuario = id_usuario;
        this.clave_usuario = clave_usuario;
        this.permiso = permiso;
    }

    public String getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(String id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getClave_usuario() {
        return clave_usuario;
    }

    public void setClave_usuario(String clave_usuario) {
        this.clave_usuario = clave_usuario;
    }

    public String getPermiso() {
        return permiso;
    }

    public void setPermiso(String permiso) {
        this.permiso = permiso;
    }
     
     
}
