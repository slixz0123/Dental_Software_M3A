/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Model_Farmacos;
import View.Vista_Farmacos;

/**
 *
 * @author Usuario
 */
public class Controller_Farmacos {
    private Model_Farmacos model;
    private Vista_Farmacos vista;

    public Controller_Farmacos(Model_Farmacos model, Vista_Farmacos vista) {
        this.model = model;
        this.vista = vista;
        vista.setVisible(true);
    }
    
    
}
