/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Model_Rep_Citas;
import View.MenuPrincipal;
import View.Vista_Rep_Citas;

/**
 *
 * @author slix0
 */
public class Controller_Rep_Citas {
     private Model_Rep_Citas modelo;
    private Vista_Rep_Citas vista;
 private MenuPrincipal vistamenu ;

      
    public Controller_Rep_Citas(Model_Rep_Citas modelo, Vista_Rep_Citas vista, MenuPrincipal vistamenu) {
        this.modelo = modelo;
        this.vista = vista;
         this.vistamenu = vistamenu;
        vista.setVisible(true);
      
    }
}
