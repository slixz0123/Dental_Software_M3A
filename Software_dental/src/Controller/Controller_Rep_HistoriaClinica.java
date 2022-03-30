/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Model_Rep_HistoriaClinica;
import View.MenuPrincipal;
import View.View_Rep_HistoriaClinica;

/**
 *
 * @author slix0
 */
public class Controller_Rep_HistoriaClinica {
    private Model_Rep_HistoriaClinica model;
    private View_Rep_HistoriaClinica vista;
    private MenuPrincipal vistamenu ;
   

    public Controller_Rep_HistoriaClinica(Model_Rep_HistoriaClinica model, View_Rep_HistoriaClinica vista , MenuPrincipal vistamenu) {
        this.model = model;
        this.vista = vista;
        this.vistamenu = vistamenu;
        vista.setVisible(true);
        
    }
}
