/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Model_Farmacos;

import View.MenuPrincipal;
import View.Vista_Rep_ListFarm;

/**
 *
 * @author slix0
 */
public class Controller_Rep_ListFarm {
     private Model_Farmacos modelo;
    private Vista_Rep_ListFarm vista;
    private MenuPrincipal vistamenu ;
    

    public Controller_Rep_ListFarm(Model_Farmacos modelo, Vista_Rep_ListFarm vista, MenuPrincipal vistamenu) {
        this.modelo = modelo;
        this.vista = vista;
        this.vistamenu = vistamenu;
        vista.setVisible(true);
        
    }
    
}
