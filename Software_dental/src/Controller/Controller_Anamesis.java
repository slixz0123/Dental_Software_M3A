/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.model_Anamesis;
import View.Vista_Anamesis;

/**
 *
 * @author slix0
 */
public class Controller_Anamesis {
        private model_Anamesis modelo;
    private Vista_Anamesis vista;

    public Controller_Anamesis(model_Anamesis modelo, Vista_Anamesis vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setVisible(true);
    }
}
