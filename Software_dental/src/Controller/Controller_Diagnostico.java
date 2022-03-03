/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Model_Diagnostico;
import View.Vista_Diagnostico;

/**
 *
 * @author Usuario
 */
public class Controller_Diagnostico {
    private Model_Diagnostico model;
    private Vista_Diagnostico vista;

    public Controller_Diagnostico(Model_Diagnostico model, Vista_Diagnostico vista) {
        this.model = model;
        this.vista = vista;
        vista.setVisible(true);
    }
    
    
}
