
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Model_ListadoPacientes;
import View.Vista_ListadoPacientes;

/**
 *
 * @author slix0
 */
public class Contoller_ListadoPaciente {
    
     private Model_ListadoPacientes modelo;
    private Vista_ListadoPacientes vista;

    public Contoller_ListadoPaciente(Model_ListadoPacientes modelo, Vista_ListadoPacientes vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setVisible(true);
    }
    
    
    
}
