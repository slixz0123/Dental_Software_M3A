/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Model_Anamnesis;
import Model.Persona;
import View.MenuPrincipal;
import View.Vista_Anamesis;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Saul
 */
public class Controller_Anamnesis {
    private Model_Anamnesis modelo;
    private Vista_Anamesis vista;
    private MenuPrincipal vistamenu;
    public Controller_Anamnesis(Model_Anamnesis modelo, Vista_Anamesis vista) {
      this.modelo = modelo;
      this.vista = vista;
      vista.setVisible(true);    
    }
    public void iniciarControl(){
    
    }
    //Cargar datos paciente
    private void cargardatospac(java.awt.event.KeyEvent e){
    List<Persona> listaprod=modelo.listarPersonas(vistamenu.getLblCedulapac().getText());
     for (int a = 0; a < listaprod.size(); a++) {
        if (listaprod.get(a).getCedula().equals(vistamenu.getLblCedulapac().getText())) {
           vista.getTxtcedula_pac().setText(listaprod.get(a).getCedula());
           vista.getTxtnombrespac().setText(listaprod.get(a).getNombres());
           vista.getTxtapellidopac().setText(listaprod.get(a).getApellidos());
           if(listaprod.get(a).getGenero().equals("M")){
           vista.getTxtgeneropac().setText("Masculino");
           } else {
               vista.getTxtgeneropac().setText("Femenino");
           }
           vista.getTxtdireccion().setText(listaprod.get(a).getDireccion());
           vista.getTxttelefonopac().setText(listaprod.get(a).getTelefono());
           vista.getTxtcorreo().setText(listaprod.get(a).getCorreo());
           vista.getTxtprovincia().setText(listaprod.get(a).getProvincia());
           vista.getTxtciudad().setText(listaprod.get(a).getCiudad());
           vista.getDateFechanacEsp().setDate(modelo.fecha_nac(vista.getTxtcedula_pac().getText()));
        } else {
            JOptionPane.showMessageDialog(vista, "No existe un paciente con numero de cedula "+vista.getTxtcedula_pac().getText());
        } 
      }
    }
}
