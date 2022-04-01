/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Model_Rep_ListTrat;
import View.MenuPrincipal;
import View.Vista_Rep_ListTrat;

/**
 *
 * @author slix0
 */
public class Controller_Rep_ListTrat {
     private Model_Rep_ListTrat modelo;
    private Vista_Rep_ListTrat vista;
    private MenuPrincipal vistamenu ;
    

    public Controller_Rep_ListTrat(Model_Rep_ListTrat modelo, Vista_Rep_ListTrat vista, MenuPrincipal vistamenu) {
        this.modelo = modelo;
        this.vista = vista;
        this.vistamenu = vistamenu;
        vista.setVisible(true);
        
    }
    
    
}
