/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Model_Cie10;
import Model.Model_CitasTratamiento;
import Model.Model_Diagnostico;
import Model.Model_Especialista;
import Model.Model_HistorialMedico;
import Model.Model_NuevaEndodoncia;
import Model.Model_Paciente;
import Model.Model_Tratamiento;
import View.Crud_Paciente;
import View.MenuPrincipal;
import View.Vista_Citas_Tratamiento;
import View.Vista_Crud_Cie10;
import View.Vista_Crud_HistorialMedico;
import View.Vista_NuevaEndodoncia;
import View.Vista_crud_Tratamiento;
import View.Vista_crud_especalista;

import desplazable.Desface;

import java.awt.Frame;


import java.awt.event.MouseEvent;
import javax.swing.JLabel;


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
        iniciarControlMenu();
    }

    public void iniciarControlMenu() {
//        setEventoMouseClicked(vista.getLabelini());
//        setEventoMouseClicked3(vista.getLblCrud_Paciente());
//        setEventoMouseClicked4(vista.getLbl_Agendarcitas());
//        setEventoMouseClicked5(vista.getLbl_Certificado());
//        setEventoMouseClicked6(vista.getLbl_Contabilidad());
//        setEventoMouseClicked7(vista.getLbl_Cotizacion());
//        setEventoMouseClicked8(vista.getLbl_CrudCie());
//        setEventoMouseClicked9(vista.getLbl_CrudFarmacos());
//        setEventoMouseClicked10(vista.getLbl_CrudTratamiento());
//        setEventoMouseClicked10(vista.getLbl_CrudCie());
//        setEventoMouseClicked11(vista.getLbl_historialCliniico());
//        setEventoMouseClicked12(vista.getLblNuevoEsp());
//        formComponentResized(vista.getMenuDesplegable());
        setEventoMouseClicked2(vista.getLblCrud_Paciente());
        setEventoMouseClickeda(vista.getLblNuevoEsp());
        setEventoMouseClickede(vista.getLbl_CrudTratamiento());
        setEventoMouseClickeCie10(vista.getLbl_CrudCie());
        setEventoMouseClickNuevaE(vista.getLbl_NuevaEndodoncia()); 
        setEventoMouseClickCitasTrat(vista.getLbl_CitasTratamientos());
        setEventoMouseClickHistorial(vista.getLbl_historialCliniico());

    }

    //------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//    private void formComponentResized(Component paneldes) {
//        paneldes.addComponentListener(new java.awt.event.ComponentAdapter() {
//
//            public void mouseClicked(MouseEvent e) {
//                formComponentResized(e);
//            }
//        });
//    }
//
//    private void eventomouse(java.awt.event.MouseEvent evt) {
//        if (vista.getMenuDesplegable().getX() == 0) {
//            System.out.println("hola jlabel dos mauclicked");
//            desplace.desplazarIzquierda(vista.getMenuDesplegable(), vista.getMenuDesplegable().getX(), -120, 10, 10);
//        } else if (vista.getMenuDesplegable().getX() == -120) {
//            desplace.desplazarDerecha(vista.getMenuDesplegable(), vista.getMenuDesplegable().getX(), 0, 10, 10);
//        }
//
//    }
//
//    private void formComponentResized(java.awt.event.ComponentEvent evt) {
//
//        vista.getMenuDesplegable().setSize(new Dimension(vista.getMenuDesplegable().getWidth(), 200));
//    }
//    private void setEventoMouseClicked(JLabel lab) {
//        lab.addMouseListener(new java.awt.event.MouseAdapter() {
//
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                eventomouse(e);
//
//            }
//        });
//    }
//
//    private void setEventoMouseClicked3(JLabel lab) {
//        lab.addMouseListener(new java.awt.event.MouseAdapter() {
//
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                eventomouse(e);
//
//            }
//        });
//    }
//
//    private void setEventoMouseClicked4(JLabel lab) {
//        lab.addMouseListener(new java.awt.event.MouseAdapter() {
//
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                eventomouse(e);
//
//            }
//        });
//    }
//
//    private void setEventoMouseClicked5(JLabel lab) {
//        lab.addMouseListener(new java.awt.event.MouseAdapter() {
//
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                eventomouse(e);
//
//            }
//        });
//    }
//
//    private void setEventoMouseClicked6(JLabel lab) {
//        lab.addMouseListener(new java.awt.event.MouseAdapter() {
//
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                eventomouse(e);
//
//            }
//        });
//    }
//
//    private void setEventoMouseClicked7(JLabel lab) {
//        lab.addMouseListener(new java.awt.event.MouseAdapter() {
//
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                eventomouse(e);
//
//            }
//        });
//    }
//
//    private void setEventoMouseClicked8(JLabel lab) {
//        lab.addMouseListener(new java.awt.event.MouseAdapter() {
//
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                eventomouse(e);
//
//            }
//        });
//    }
//
//    private void setEventoMouseClicked9(JLabel lab) {
//        lab.addMouseListener(new java.awt.event.MouseAdapter() {
//
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                eventomouse(e);
//
//            }
//        });
//    }
//
//    private void setEventoMouseClicked10(JLabel lab) {
//        lab.addMouseListener(new java.awt.event.MouseAdapter() {
//
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                eventomouse(e);
//
//            }
//        });
//    }
//
//    private void setEventoMouseClicked11(JLabel lab) {
//        lab.addMouseListener(new java.awt.event.MouseAdapter() {
//
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                eventomouse(e);
//
//            }
//        });
//    }
//    private void setEventoMouseClicked12(JLabel lab) {
//        lab.addMouseListener(new java.awt.event.MouseAdapter() {
//
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                eventomouse(e);
//
//            }
//        });
//    }
    //--------------------------------------------------------------------------------------------------------------------------------------------------------
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

    private void setEventoMouseClickeCie10(JLabel laba) {
        laba.addMouseListener(new java.awt.event.MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {

                CrudCie10(e);

            }
        });
    }

   

    private void setEventoMouseClickNuevaE(JLabel laba) {
        laba.addMouseListener(new java.awt.event.MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {

                CrudNuevaE(e);

            }
        });
    }
    
    private void setEventoMouseClickCitasTrat(JLabel laba) {
        laba.addMouseListener(new java.awt.event.MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {

                CitasTratamiento(e);

            }
        });
    }
     private void setEventoMouseClickHistorial(JLabel laba) {
        laba.addMouseListener(new java.awt.event.MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {

                HistorialMedico(e);

            }
        });
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

    private void CrudEspecialista(java.awt.event.MouseEvent evt) {
        Model_Especialista modelesp = new Model_Especialista();
        Vista_crud_especalista vistaesp = new Vista_crud_especalista();
        vista.getDkpPrincipal().add(vistaesp);
        vistaesp.setBorder(null);
        Controller.Controller_CrudEspecialista contEsp = new Controller_CrudEspecialista(modelesp, vistaesp);
        contEsp.iniciar();
    }

    private void CrudTratamiento(java.awt.event.MouseEvent evt) {
        Model_Tratamiento modeltrat = new Model_Tratamiento();
        Vista_crud_Tratamiento vistatrat = new Vista_crud_Tratamiento();
        vista.getDkpPrincipal().add(vistatrat);
        vistatrat.setBorder(null);
        Controller.Controller_CrudTratamiento contTrat = new Controller_CrudTratamiento(modeltrat, vistatrat);
    }

    private void CrudCie10(java.awt.event.MouseEvent evt) {
        Model_Cie10 modelcie = new Model_Cie10();
        Vista_Crud_Cie10 vistacie10 = new Vista_Crud_Cie10();
        vista.getDkpPrincipal().add(vistacie10);
        vistacie10.setBorder(null);
        Controller.Controller_CrudCie10 controlcie = new Controller_CrudCie10(modelcie, vistacie10);
    }

    /*private void CrudDiag(java.awt.event.MouseEvent evt) {
        Model_Diagnostico modeldiag = new Model_Diagnostico();
        Vista_Diagnostico vistadiag = new Vista_Diagnostico();
        vista.getDkpPrincipal().add(vistadiag);
        vistadiag.setBorder(null);
        Controller.Controller_Diagnostico controllerdiag = new Controller_Diagnostico(modeldiag, vistadiag);
    }*/
    private void HistorialMedico(java.awt.event.MouseEvent evt) {
         Model_HistorialMedico modHisto = new Model_HistorialMedico();
        Vista_Crud_HistorialMedico vistaHistorialMedico = new Vista_Crud_HistorialMedico();
        vista.getDkpPrincipal().add(vistaHistorialMedico);
        vistaHistorialMedico.setBorder(null);
          Controller.Contoller_HistorialMedico controllerHisto = new Contoller_HistorialMedico (modHisto, vistaHistorialMedico);
    }
    private void CrudNuevaE(java.awt.event.MouseEvent evt) {
        Model_NuevaEndodoncia modelnuevae = new Model_NuevaEndodoncia();
        Vista_NuevaEndodoncia vistanuevae = new Vista_NuevaEndodoncia();
        vista.getDkpPrincipal().add(vistanuevae);
        vistanuevae.setBorder(null);
        Controller.Controller_NuevaEndodoncia controllernueva = new Controller_NuevaEndodoncia(modelnuevae, vistanuevae);
    }
    private void CitasTratamiento(java.awt.event.MouseEvent evt) {
        Model_CitasTratamiento modelcitastrat = new Model_CitasTratamiento();
        Vista_Citas_Tratamiento vistacitastrat = new Vista_Citas_Tratamiento();
        vista.getDkpPrincipal().add(vistacitastrat);
        vistacitastrat.setBorder(null);
        Controller.Controller_CitasTratamiento controlcitastrat = new Controller_CitasTratamiento(modelcitastrat, vistacitastrat);
    }
     
}
