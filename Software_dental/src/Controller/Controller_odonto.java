/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.model_Odontograma;
import View.MenuPrincipal;
import View.vista_Odontograma;
//import View.vista_Odontograma;

/**
 *
 * @author slix0
 */
public class Controller_odonto {
      private model_Odontograma modelo;
    private vista_Odontograma vista;
    private MenuPrincipal vistaMenu ;
    public Controller_odonto(model_Odontograma modelo , vista_Odontograma vista , MenuPrincipal vistaMenu) {
        this.modelo = modelo;
        this.vista = vista;
       this.vistaMenu = vistaMenu;
        vista.setVisible(true);
        
        
    }
}
