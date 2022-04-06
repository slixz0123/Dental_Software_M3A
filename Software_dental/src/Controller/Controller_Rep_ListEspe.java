/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Model_Especialista;

import View.MenuPrincipal;
import View.Vista_Rep_ListEspe;

/**
 *
 * @author slix0
 */
public class Controller_Rep_ListEspe {
    
     private Model_Especialista modelo;
    private Vista_Rep_ListEspe vista;
    private MenuPrincipal vistamenu ;
    

    public Controller_Rep_ListEspe(Model_Especialista modelo, Vista_Rep_ListEspe vista, MenuPrincipal vistamenu) {
        this.modelo = modelo;
        this.vista = vista;
        this.vistamenu = vistamenu;
        vista.setVisible(true);
        
    }
    
    
    
    
}
