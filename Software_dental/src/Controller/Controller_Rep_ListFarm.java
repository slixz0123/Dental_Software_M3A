/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Model_Rep_ListFarm;
import View.MenuPrincipal;
import View.Vista_Rep_ListFarm;

/**
 *
 * @author slix0
 */
public class Controller_Rep_ListFarm {
     private Model_Rep_ListFarm modelo;
    private Vista_Rep_ListFarm vista;
    private MenuPrincipal vistamenu ;
    

    public Controller_Rep_ListFarm(Model_Rep_ListFarm modelo, Vista_Rep_ListFarm vista, MenuPrincipal vistamenu) {
        this.modelo = modelo;
        this.vista = vista;
        this.vistamenu = vistamenu;
        vista.setVisible(true);
        
    }
    
}
