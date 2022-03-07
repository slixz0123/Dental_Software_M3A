/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Model_HistorialMedico;
import View.Vista_Crud_HistorialMedico;

/**
 *
 * @author slix0
 */
public class Contoller_HistorialMedico {
       private Model_HistorialMedico modelo;
    private Vista_Crud_HistorialMedico vista;

    public Contoller_HistorialMedico(Model_HistorialMedico modelo, Vista_Crud_HistorialMedico vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setVisible(true);
    }
    
    
    
}
