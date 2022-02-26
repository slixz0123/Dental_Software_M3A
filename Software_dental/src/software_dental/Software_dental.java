/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package software_dental;

import Controller.CONTROLADOR_MENUPRINCIPAL;
import Model.ConexionPg;
import View.MenuPrincipal;

/**
 *
 * @author slix0
 */
public class Software_dental {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           
        MenuPrincipal menuv = new MenuPrincipal();
        
        Controller.CONTROLADOR_MENUPRINCIPAL controlador = new CONTROLADOR_MENUPRINCIPAL( menuv); 
        
        controlador.iniciarControlMenu();// EMPEZAMOS LAS ESCUCHA DE LOS EVENTOS DE LA VISTA 
        //ConexionPg conexionPg = new ConexionPg();
       // conexionPg.Con();
        
        
        
    }
    
}
