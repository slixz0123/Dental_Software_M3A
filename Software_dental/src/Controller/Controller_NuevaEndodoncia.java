/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Model_NuevaEndodoncia;
import View.Vista_NuevaEndodoncia;

/**
 *
 * @author Usuario
 */
public class Controller_NuevaEndodoncia {
    private Model_NuevaEndodoncia modelo;
    private Vista_NuevaEndodoncia vista;

    public Controller_NuevaEndodoncia(Model_NuevaEndodoncia modelo, Vista_NuevaEndodoncia vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setVisible(true);
    }
    
}
