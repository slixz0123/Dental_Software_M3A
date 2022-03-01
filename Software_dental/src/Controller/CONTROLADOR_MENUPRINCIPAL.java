/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Model_Cie10;
import Model.Model_Especialista;
import Model.Model_Paciente;
import Model.Model_Tratamiento;
import View.Crud_Paciente;
import View.MenuPrincipal;
import View.Vista_Crud_Cie10;
import View.Vista_crud_Tratamiento;
import View.Vista_crud_especalista;

import desplazable.Desface;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Toolkit;
import java.awt.event.ComponentListener;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JTable;

/**
 *
 * @author slix0
 */
public class CONTROLADOR_MENUPRINCIPAL {

    MenuPrincipal vista;
    Desface desplace;

    public CONTROLADOR_MENUPRINCIPAL(MenuPrincipal vista) {
        this.vista = vista;
        vista.setVisible(true);
        vista.setExtendedState(Frame.MAXIMIZED_BOTH);
        desplace = new Desface();

    }

    public void iniciarControlMenu() {
        setEventoMouseClicked(vista.getLabelini());
        setEventoMouseClicked3(vista.getLblCrud_Paciente());

        setEventoMouseClicked4(vista.getLbl_Agendarcitas());
        setEventoMouseClicked5(vista.getLbl_Certificado());
        setEventoMouseClicked6(vista.getLbl_Contabilidad());
        setEventoMouseClicked7(vista.getLbl_Cotizacion());
        setEventoMouseClicked8(vista.getLbl_CrudCie());
        setEventoMouseClicked9(vista.getLbl_CrudFarmacos());
        setEventoMouseClicked10(vista.getLbl_CrudTratamiento());
        setEventoMouseClicked11(vista.getLbl_historialCliniico());
          setEventoMouseClicked12(vista.getLblNuevoEsp());
        formComponentResized(vista.getMenuDesplegable());
        setEventoMouseClicked2(vista.getLblCrud_Paciente());
        setEventoMouseClickeda(vista.getLblNuevoEsp());
        setEventoMouseClickede(vista.getLbl_CrudTratamiento());
           setEventoMouseClicked10(vista.getLbl_CrudCie());

    }

    //------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    private void setEventoMouseClicked(JLabel lab) {
        lab.addMouseListener(new java.awt.event.MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                eventomouse(e);

            }
        });
    }

    private void setEventoMouseClicked3(JLabel lab) {
        lab.addMouseListener(new java.awt.event.MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                eventomouse(e);

            }
        });
    }

    private void setEventoMouseClicked4(JLabel lab) {
        lab.addMouseListener(new java.awt.event.MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                eventomouse(e);

            }
        });
    }

    private void setEventoMouseClicked5(JLabel lab) {
        lab.addMouseListener(new java.awt.event.MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                eventomouse(e);

            }
        });
    }

    private void setEventoMouseClicked6(JLabel lab) {
        lab.addMouseListener(new java.awt.event.MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                eventomouse(e);

            }
        });
    }

    private void setEventoMouseClicked7(JLabel lab) {
        lab.addMouseListener(new java.awt.event.MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                eventomouse(e);

            }
        });
    }

    private void setEventoMouseClicked8(JLabel lab) {
        lab.addMouseListener(new java.awt.event.MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                eventomouse(e);

            }
        });
    }

    private void setEventoMouseClicked9(JLabel lab) {
        lab.addMouseListener(new java.awt.event.MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                eventomouse(e);

            }
        });
    }

    private void setEventoMouseClicked10(JLabel lab) {
        lab.addMouseListener(new java.awt.event.MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                eventomouse(e);

            }
        });
    }

    private void setEventoMouseClicked11(JLabel lab) {
        lab.addMouseListener(new java.awt.event.MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                eventomouse(e);

            }
        });
    }
    private void setEventoMouseClicked12(JLabel lab) {
        lab.addMouseListener(new java.awt.event.MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                eventomouse(e);

            }
        });
    }

    private void setEventoMouseClicked2(JLabel lab) {
        lab.addMouseListener(new java.awt.event.MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
               
                    CrudProducto(e);
                
                

            }
        });
    }
     private void setEventoMouseClickeda(JLabel lab) {
        lab.addMouseListener(new java.awt.event.MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
               
                    CrudEspecialista(e);
                
                

            }
        });
    }
     
       private void setEventoMouseClickede(JLabel lab) {
        lab.addMouseListener(new java.awt.event.MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
               
                    CrudTratamiento(e);
                
                

            }
        });
    }
       private void setEventoMouseClickeCie10(JLabel lab) {
        lab.addMouseListener(new java.awt.event.MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
               
                    CrudCie10(e);
                
                

            }
        });
    }
    

    private void formComponentResized(Component paneldes) {
        paneldes.addComponentListener(new java.awt.event.ComponentAdapter() {

            public void mouseClicked(MouseEvent e) {
                formComponentResized(e);
            }
        });
    }

    private void eventomouse(java.awt.event.MouseEvent evt) {
        if (vista.getMenuDesplegable().getX() == 0) {
            System.out.println("hola jlabel dos mauclicked");
            desplace.desplazarIzquierda(vista.getMenuDesplegable(), vista.getMenuDesplegable().getX(), -120, 10, 10);
        } else if (vista.getMenuDesplegable().getX() == -120) {
            desplace.desplazarDerecha(vista.getMenuDesplegable(), vista.getMenuDesplegable().getX(), 0, 10, 10);
        }

    }

    private void formComponentResized(java.awt.event.ComponentEvent evt) {

        vista.getMenuDesplegable().setSize(new Dimension(vista.getMenuDesplegable().getWidth(), 200));
    }

    //------------------------------------------------------------------------------------------------------------------------------------------------------------------------     
    private void CrudProducto(java.awt.event.MouseEvent evt) {
        Model_Paciente modelpaciente = new Model_Paciente();
        Crud_Paciente crudpaciente = new Crud_Paciente();
        // agremgamos nuestra jdialog al deskopt pane 
        vista.getDkpPrincipal().add(crudpaciente);
        crudpaciente.setBorder(null);
        Controller.Controller_CrudPaciente controlador = new Controller_CrudPaciente(modelpaciente, crudpaciente);

    }
    
    private void CrudEspecialista(java.awt.event.MouseEvent evt){
        Model_Especialista modelesp = new Model_Especialista();
        Vista_crud_especalista vistaesp = new Vista_crud_especalista();
        vista.getDkpPrincipal().add(vistaesp);
        vistaesp.setBorder(null);
        Controller.Controller_CrudEspecialista contEsp = new Controller_CrudEspecialista(modelesp, vistaesp);
    }
    
    private void CrudTratamiento(java.awt.event.MouseEvent evt){
        Model_Tratamiento modeltrat = new Model_Tratamiento();
        Vista_crud_Tratamiento vistatrat = new Vista_crud_Tratamiento();
        vista.getDkpPrincipal().add(vistatrat);
        vistatrat.setBorder(null);
        Controller.Controller_CrudTratamiento contTrat = new Controller_CrudTratamiento(modeltrat, vistatrat);
    }
 private void CrudCie10(java.awt.event.MouseEvent evt){
        Model_Cie10 modelcie = new Model_Cie10();
        Vista_Crud_Cie10 vistacie10 = new Vista_Crud_Cie10();
        vista.getDkpPrincipal().add(vistacie10);
        vistacie10.setBorder(null);
        Controller.Controller_CrudCie10 controlcie = new Controller_CrudCie10(modelcie, vistacie10);
    }
}
