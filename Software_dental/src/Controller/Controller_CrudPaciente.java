/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Model_Paciente;
import View.Crud_Paciente;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author slix0
 */
public class Controller_CrudPaciente {
    private Model_Paciente modelo ; 
 JFileChooser jfc = new JFileChooser();
 private Crud_Paciente vista ; 
 private FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivo de Imagen","jpg","png");

    
      public Controller_CrudPaciente(Model_Paciente modelo, Crud_Paciente vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setVisible(true);
          
       // vista.getjDialog1().setLocationRelativeTo(null);
       
   
    }
    
    
    
    
}
