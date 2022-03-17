/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package software_dental;

import Controller.CONTROLADOR_MENUPRINCIPAL;
import Controller.Controller_InicioSesion;
import Model.Model_InicioSesion;
import View.Vista_InicioSesion;


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
           
        
        
        Vista_InicioSesion vistaini = new Vista_InicioSesion();
        Model_InicioSesion model = new Model_InicioSesion();
        Controller.Controller_InicioSesion controlini = new Controller_InicioSesion(model, vistaini);
        controlini.iniciocontrol();
        
        
    }
    
}
