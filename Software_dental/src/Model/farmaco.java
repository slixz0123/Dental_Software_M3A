/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author jose illescas
 */
public class farmaco {
    private String id_farmaco;
    private String nombre_farmaco;
    private String descripcion_far;
    private String material;
    private String miligramos;

    public farmaco() {
    }

    public farmaco(String id_farmaco, String nombre_farmaco, String descripcion_far,String material,String miligramos) {
        this.id_farmaco = id_farmaco;
        this.nombre_farmaco = nombre_farmaco;
        this.descripcion_far = descripcion_far;
        this.material = material;
        this.miligramos = miligramos;
    }

    public String getId_farmaco() {
        return id_farmaco;
    }

    public void setId_farmaco(String id_farmaco) {
        this.id_farmaco = id_farmaco;
    }

    public String getNombre_farmaco() {
        return nombre_farmaco;
    }

    public void setNombre_farmaco(String nombre_farmaco) {
        this.nombre_farmaco = nombre_farmaco;
    }

    public String getDescripcion_far() {
        return descripcion_far;
    }

    public void setDescripcion_far(String descripcion_far) {
        this.descripcion_far = descripcion_far;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMiligramos() {
        return miligramos;
    }

    public void setMiligramos(String miligramos) {
        this.miligramos = miligramos;
    }
    
    
}
