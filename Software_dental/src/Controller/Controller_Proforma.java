/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Model_Proforma;
import View.VISTA_PROFORMA;

/**
 *
 * @author slix0
 */
public class Controller_Proforma {
    
    
     private Model_Proforma modelo;
    private VISTA_PROFORMA vista;

    public Controller_Proforma(Model_Proforma modelo, VISTA_PROFORMA vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setVisible(true);
    }
    
    
}
