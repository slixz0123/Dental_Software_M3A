/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Model_Rep_HistorialOdontologico;
import View.MenuPrincipal;
import View.Vista_Rep_HistorialOdontologico;

/**
 *
 * @author slix0
 */
public class Controller_Rep_HistorialOdontologico {
      private Model_Rep_HistorialOdontologico model;
    private Vista_Rep_HistorialOdontologico vista;
    private MenuPrincipal vistamenu ;
   

    public Controller_Rep_HistorialOdontologico (Model_Rep_HistorialOdontologico model, Vista_Rep_HistorialOdontologico vista , MenuPrincipal vistamenu) {
        this.model = model;
        this.vista = vista;
        this.vistamenu = vistamenu;
        vista.setVisible(true);
       
    }
}
