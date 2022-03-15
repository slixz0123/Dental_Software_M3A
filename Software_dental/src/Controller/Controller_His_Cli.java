/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Model_Hist_clinico;
import View.Vista_HistorialClinico;

/**
 *
 * @author Saul
 */
public class Controller_His_Cli {
     private Model_Hist_clinico model;
    private Vista_HistorialClinico vista;

    public Controller_His_Cli(Model_Hist_clinico model, Vista_HistorialClinico vista) {
        this.model = model;
        this.vista = vista;
        vista.setVisible(true);
    }
    
}
