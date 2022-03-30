/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Model_InicioSesion;
import View.MenuPrincipal;
import View.Vista_InicioSesion;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import jtextfieldround.JPasswordFieldRound;
import jtextfieldround.JTextFieldRound;

/**
 *
 * @author Usuario
 */
public class Controller_InicioSesion {

    private Model_InicioSesion model;
    private Vista_InicioSesion vista;

    public Controller_InicioSesion(Model_InicioSesion model, Vista_InicioSesion vista) {
        this.model = model;
        this.vista = vista;
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);

    }

    public void iniciocontrol() {
        vista.getBtnAceptar().addActionListener(l -> registrar());
        setEventoMouseClickedSalir(vista.getLblSalir());
        eventoenter(vista.getTxtContrasena());
        eventofoco(vista.getTxtUsuario());
    }

   private void eventoenter(JPasswordFieldRound txt){
    txt.addKeyListener(new KeyAdapter() {
        @Override
        public void keyPressed(KeyEvent e) {
            if(e.getKeyCode()== KeyEvent.VK_ENTER){
               registrar();
            }
        }

    });
    }
private void eventofoco(JTextFieldRound txt){
    txt.addKeyListener(new KeyAdapter() {
        @Override
        public void keyPressed(KeyEvent e) {
            if(e.getKeyCode()== KeyEvent.VK_ENTER){
               vista.getTxtContrasena().requestFocus();
            }
        }

    });
    }
    public void registrar() {
        char clave[] = vista.getTxtContrasena().getPassword();
        String clavedef = new String(clave);

        if (vista.getTxtUsuario().getText().equals("Admin") && clavedef.equals("12345")) {
            vista.dispose();
            MenuPrincipal menuv = new MenuPrincipal();
            Controller.CONTROLADOR_MENUPRINCIPAL controlador = new CONTROLADOR_MENUPRINCIPAL(menuv);
            controlador.iniciarControlMenu();
 
        }else{
            JOptionPane.showMessageDialog(null, "Acceso denegado:\n"
          + "Por favor ingrese un usuario y/o contraseña correctos",  
          "Acceso denegado", JOptionPane.ERROR_MESSAGE);
        }

    }
    
    public void salir(java.awt.event.MouseEvent evt){
        System.exit(0);
    }
    
      private void setEventoMouseClickedSalir(JLabel lab) {
        lab.addMouseListener(new java.awt.event.MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {

                salir(e);

            }
        });
    }


}
