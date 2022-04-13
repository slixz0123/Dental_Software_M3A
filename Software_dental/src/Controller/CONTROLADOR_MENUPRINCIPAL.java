/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Doctor;
import Model.Model_AgendaCitas;
import Model.Model_Anamnesis;
import Model.Model_Cie10;
import Model.Model_Citas;
import Model.Model_Especialista;
import Model.Model_Factura;
import Model.Model_Farmacos;
import Model.Model_HistorialMedico;
import Model.Model_ListadoPacientes;
import Model.Model_Paciente;
import Model.Model_Proforma;
import Model.Model_Tratamiento;
import Model.Model_Hist_clinico;
import Model.Model_ListadoEspecialistas;
import Model.Model_Receta;
import Model.Persona;
import Model.model_Odontograma;
import View.Crud_Paciente;
import View.MenuPrincipal;
import View.VISTA_PROFORMA;
import View.View_Rep_HistoriaClinica;
import View.Vista_AgendaCitas;
import View.Vista_Anamesis;
import View.Vista_Citas_Tratamiento;
import View.Vista_Crud_Cie10;
import View.Vista_Crud_HistorialMedico;
import View.Vista_Farmacos;
import View.Vista_HistorialClinico;
import View.Vista_InicioProceso;
import View.Vista_ListadoEspecialista;
import View.Vista_ListadoPacientes;
import View.Vista_crud_Factura;
import View.Vista_Receta;
import View.Vista_Rep_Citas;
import View.Vista_Rep_HistorialOdontologico;
import View.Vista_Rep_ListEspe;
import View.Vista_Rep_ListFarm;
import View.Vista_Rep_ListTrat;
import View.Vista_Reportes;
import View.Vista_crud_Tratamiento;
import View.Vista_crud_especalista;
//import View.vista_Odontograma;
import desplazable.Desface;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
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
        setEventoMouseClicked2(vista.getLblCrud_Paciente());
        setEventoMouseClickeda(vista.getLblNuevoEsp());
        setEventoMouseClickede(vista.getLbl_CrudTratamiento());
        setEventoMouseClickeCie10(vista.getLbl_CrudCie());

      
        

  
        
        setEventoMouseClickCitasTrat(vista.getLbl_CitasTratamientos());
   
        setEventoMouseClickProgreso(vista.getLabelini());
        setEventoMouseClickProforma(vista.getLbl_Cotizacion());
        vista.getBtnagendaCitas().addActionListener(l -> agendacitas());
        setEventoMouseClickFarmacos(vista.getLbl_CrudFarmacos());
        setEventoMouseClickFarmacos(vista.getLbl_CrudFarmacos());
        
        
        vista.getJbtnListPac().addActionListener(l-> ListadoPacbtn());
       // vista.getBtnOdontograma().addActionListener(l-> odontogramabtn());
        cargarcboxMedico();
        fecha();
 

    }

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

   
    private void setEventoMouseClickCitasTrat(JLabel laba) {

        laba.addMouseListener(new java.awt.event.MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {

                Reportes(e);

            }
        });
    }

  

    

    private void setEventoMouseClickFarmacos(JLabel laba) {
        laba.addMouseListener(new java.awt.event.MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {

                CrudFarmacos(e);

            }
        });
    }

    private void setEventoMouseClickProgreso(JLabel laba) {
        laba.addMouseListener(new java.awt.event.MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {

                Proceso(e);

            }
        });
    }

    private void setEventoMouseClickProforma(JLabel laba) {
        laba.addMouseListener(new java.awt.event.MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {

                proforma(e);

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
        //vistaesp.setBorder(null);
        Controller.Controller_CrudEspecialista contEsp = new Controller_CrudEspecialista(modelesp, vistaesp);

    }

    private void CrudTratamiento(java.awt.event.MouseEvent evt) {
        Model_Tratamiento modeltrat = new Model_Tratamiento();
        Vista_crud_Tratamiento vistatrat = new Vista_crud_Tratamiento();
        vista.getDkpPrincipal().add(vistatrat);
        vistatrat.setBorder(null);
        Controller.Controller_CrudTratamiento contTrat = new Controller_CrudTratamiento(modeltrat, vistatrat);
//        contTrat.iniciaControl();
    }

    private void CrudCie10(java.awt.event.MouseEvent evt) {
        Model_Cie10 modelcie = new Model_Cie10();
        Vista_Crud_Cie10 vistacie10 = new Vista_Crud_Cie10();
        vista.getDkpPrincipal().add(vistacie10);
        vistacie10.setBorder(null);
        Controller.Controller_CrudCie10 controlcie = new Controller_CrudCie10(modelcie, vistacie10);
    }



   
    
    
    
     private void agendacitas() {
        Model_AgendaCitas modelagendacitas = new Model_AgendaCitas();
        Vista_AgendaCitas vistaAgendarcitas = new Vista_AgendaCitas();
        vista.getDkpPrincipal().add(vistaAgendarcitas);
        vistaAgendarcitas.setBorder(null);
        Controller.Controller_AgendaCitas controlerAgendaCitas = new Controller_AgendaCitas(modelagendacitas, vistaAgendarcitas);
    }

    private void proforma(java.awt.event.MouseEvent evt) {
        Model_Proforma modelProforma = new Model_Proforma();
        VISTA_PROFORMA vistaProforma = new VISTA_PROFORMA();
        vista.getDkpPrincipal().add(vistaProforma);
        vistaProforma.setBorder(null);
        Controller.Controller_Proforma controlerproforma = new Controller_Proforma(modelProforma, vistaProforma);
    }


    private void HistorialReporteOdontologico(java.awt.event.MouseEvent evt) {
        //Controller historial medico
        Model_HistorialMedico modHistor = new Model_HistorialMedico();
        Vista_Rep_HistorialOdontologico vistaHistorialod = new Vista_Rep_HistorialOdontologico ();
        vista.getDkpPrincipal().add(vistaHistorialod);
        vistaHistorialod.setBorder(null);
        Controller.Controller_Rep_His_Med controllerHist_od = new Controller_Rep_His_Med (modHistor, vistaHistorialod , vista);
    }
//        Model_Rep_HistorialOdontologico modHistoRep = new Model_Rep_HistorialOdontologico();
//        Vista_Rep_HistorialOdontologico vistaHistorialrepmed = new Vista_Rep_HistorialOdontologico();
//        vista.getDkpPrincipal().add(vistaHistorialrepmed);
//        vistaHistorialrepmed.setBorder(null);
//
//          Controller.Controller_Rep_HistorialOdontologico controllerRep = new Controller_Rep_HistorialOdontologico (modHistoRep, vistaHistorialrepmed, vista);



    private void ListadoPacbtn() {
    
         Model_ListadoPacientes modellisttPac = new Model_ListadoPacientes();
        Vista_ListadoPacientes vistaListPac= new Vista_ListadoPacientes();
        vista.getDkpPrincipal().add(vistaListPac);
        vistaListPac.setBorder(null);
        Controller.Contoller_ListadoPaciente controlListpac = new Contoller_ListadoPaciente(modellisttPac, vistaListPac, vista);
        
        
    }
   

    private void CitasTratamiento(java.awt.event.MouseEvent evt) {
        Model_Citas modelRepCitas = new Model_Citas();
        Vista_Rep_Citas vistaRepCits = new Vista_Rep_Citas();
        vista.getDkpPrincipal().add(vistaRepCits);
        vistaRepCits.setBorder(null);
        Controller.Controller_Rep_Citas controlRepCitas = new Controller_Rep_Citas(modelRepCitas, vistaRepCits, vista);
    }

   

    private void CrudFarmacos(java.awt.event.MouseEvent evt) {
        Model_Farmacos modelfarma = new Model_Farmacos();
        Vista_Farmacos vistafarma = new Vista_Farmacos();
        vista.getDkpPrincipal().add(vistafarma);
        vistafarma.setBorder(null);
        Controller.Controller_Farmacos controlfarma = new Controller_Farmacos(modelfarma, vistafarma);
//        controlfarma.iniciaControl();
    }
        
        
        
        
        
        
        private void Proceso(java.awt.event.MouseEvent evt) {
       
          Vista_InicioProceso vista_InicioProceso = new Vista_InicioProceso();

        vista.getDkpPrincipal().add(vista_InicioProceso);
        vista_InicioProceso.setVisible(true);
        vista_InicioProceso.setBorder(null);
        
        //historial medico
        Model_HistorialMedico modHisto = new Model_HistorialMedico();
        Vista_Crud_HistorialMedico vistaHistorialMedico = new Vista_Crud_HistorialMedico();
        vista_InicioProceso.getPnHistorial().add(vistaHistorialMedico);
        vistaHistorialMedico.setBorder(null);

        Controller.Controller_HistorialMedico controllerHisto = new Controller_HistorialMedico (modHisto, vistaHistorialMedico, vista);


        
       
         //listado de pacientes
        Model_ListadoPacientes modlistado = new Model_ListadoPacientes();
        Vista_ListadoPacientes vistaLista = new Vista_ListadoPacientes();
        vista_InicioProceso.getPnListadoPac().add(vistaLista);
        vistaLista.setBorder(null);

        Controller.Contoller_ListadoPaciente controllerlistado = new Contoller_ListadoPaciente(modlistado, vistaLista,vista);

   
        //anamesis
        Model_Anamnesis modAne = new Model_Anamnesis();
        Vista_Anamesis vistaana = new Vista_Anamesis();
        vista_InicioProceso.getPnAnamesis().add(vistaana);
        vistaana.setBorder(null);

        Controller.Controller_Anamnesis controllerAnamesis = new Controller_Anamnesis(modAne, vistaana,vista);


          // historial clicica
           Model_Hist_clinico modeldiag = new Model_Hist_clinico();

        Vista_HistorialClinico vistadiag = new Vista_HistorialClinico();
        vista_InicioProceso.getPnHistorialClinico().add(vistadiag);
        vistadiag.setBorder(null);
        Controller.Controller_His_Cli controllerdiag = new Controller_His_Cli(modeldiag, vistadiag,vista);
        // CITAS


         // CITAS
         Model_Citas modelcitastrat = new Model_Citas();
        Vista_Citas_Tratamiento vistacitastrat = new Vista_Citas_Tratamiento();
        vista_InicioProceso.getPnCitas().add(vistacitastrat);
        vistacitastrat.setBorder(null);
        Controller.Controller_CitasTratamiento controlcitastrat = new Controller_CitasTratamiento(modelcitastrat, vistacitastrat, vista);
//recetas
Model_Receta modelrec = new Model_Receta();
        Vista_Receta vistarec = new Vista_Receta();
        vista_InicioProceso.getPnreceta().add(vistarec);
        vistarec.setBorder(null);
        Controller.Controller_Receta controlrece = new Controller_Receta(modelrec, vistarec, vista); 


        


        //Facturacion 
        Model_Factura modelfac = new Model_Factura();
        Vista_crud_Factura vistafac = new Vista_crud_Factura();
        vista_InicioProceso.getPnFacturacion().add(vistafac);
        vistafac.setBorder(null);
        Controller.Controller_Factura controlfac = new Controller_Factura(modelfac, vistafac,vista);
//        controlfac.iniciarControl();
     
        
    }
    
        private void cargarcboxMedico(){
           
           Model_Especialista modelesp = new Model_Especialista();
            ArrayList<Doctor> listadocs  = modelesp.cargardocscombo();
            vista.getJcbDocs().removeAllItems();
            for (int i = 0; i < listadocs.size(); i++) {

                vista.getJcbDocs().addItem( new Doctor(listadocs.get(i).getCedula_doc(), listadocs.get(i).getNombres() , listadocs.get(i).getApellidos()));
          //   String ced=    vista.getJcbDocs().getItemAt(vista.getJcbDocs().getSelectedIndex()).getCedula();
         
            }
           
            
            
           // lblMsj.setText(comboBox.getSelectedItem().toString());

         } 
      private void fecha() {
        Calendar calendar = new GregorianCalendar();
        int año, mes, dia;
        año = calendar.get(Calendar.YEAR);
        mes = calendar.get(Calendar.MONTH) + 1;
        dia = calendar.get(Calendar.DATE);
        if (mes < 10) {
            vista.getLblfecha().setText(año + "/0" + mes + "/" + dia);
        }
        if (dia < 10) {
            vista.getLblfecha().setText(año + "/" + mes + "/0" + dia);
        }
        if (dia > 10 && mes > 10) {
            vista.getLblfecha().setText(año + "/" + mes + "/" + dia);
        } else if (dia < 10 && mes < 10) {
            vista.getLblfecha().setText(año + "/0" + mes + "/0" + dia);
        }

    }
        
        private void Reportes(java.awt.event.MouseEvent evt) {
       
          Vista_Reportes reportes = new Vista_Reportes();

        vista.getDkpPrincipal().add(reportes);
        reportes.setVisible(true);
        reportes.setBorder(null);
        //historial medico
        Model_ListadoPacientes modellisttPac = new Model_ListadoPacientes();
        Vista_ListadoPacientes vistaListPac= new Vista_ListadoPacientes();
       reportes.getPnListPac().add(vistaListPac);
        vistaListPac.setBorder(null);
        Controller.Contoller_ListadoPaciente controlListpac = new Contoller_ListadoPaciente(modellisttPac, vistaListPac, vista);
        
       Model_ListadoEspecialistas modelisEspe = new Model_ListadoEspecialistas();
       Vista_ListadoEspecialista vistaListEspe= new Vista_ListadoEspecialista();
       reportes.getPnListEsp().add(vistaListEspe);
       vistaListEspe.setBorder(null);
       Controller.Contoller_ListadoEspecialista controlListEsp = new Contoller_ListadoEspecialista(modelisEspe, vistaListEspe, vista);
        
       Model_Farmacos modelisFarm = new Model_Farmacos();
       Vista_Rep_ListFarm vistaFarm= new Vista_Rep_ListFarm();
       reportes.getPnListfarm().add(vistaFarm);
       vistaFarm.setBorder(null);
       Controller.Controller_Rep_ListFarm controlListFamr = new Controller_Rep_ListFarm(modelisFarm, vistaFarm, vista);
        
        Model_Tratamiento modelTrat = new Model_Tratamiento();
       Vista_Rep_ListTrat vistaRepTrata= new Vista_Rep_ListTrat();
       reportes.getPnListTrat().add(vistaRepTrata);
       vistaRepTrata.setBorder(null);
       Controller.Controller_Rep_ListTrat controlListTrat = new Controller_Rep_ListTrat(modelTrat, vistaRepTrata, vista);
        
        Model_Citas modelRepCitas = new Model_Citas();
        Vista_Rep_Citas vistaRepCits = new Vista_Rep_Citas();
        reportes.getOnCitas().add(vistaRepCits);
        vistaRepCits.setBorder(null);
        Controller.Controller_Rep_Citas controlRepCitas = new Controller_Rep_Citas(modelRepCitas, vistaRepCits, vista);
    
       
  Model_HistorialMedico modHistor = new Model_HistorialMedico();
        Vista_Rep_HistorialOdontologico vistaHistorialod = new Vista_Rep_HistorialOdontologico ();
        reportes.getPnHistOdonto().add(vistaHistorialod);
        vistaHistorialod.setBorder(null);
        Controller.Controller_Rep_His_Med controllerHist_od = new Controller_Rep_His_Med (modHistor, vistaHistorialod , vista);

        Model_Hist_clinico modelreporteHistClinica = new Model_Hist_clinico();
        View_Rep_HistoriaClinica vistaReporteHistoClinica = new View_Rep_HistoriaClinica();
        reportes.getPnHistClinica().add(vistaReporteHistoClinica);
        vistaReporteHistoClinica.setBorder(null);
        Controller.Controller_Rep_HistoriaClinica controllerRepHistCli = new Controller_Rep_HistoriaClinica(modelreporteHistClinica, vistaReporteHistoClinica,vista);
       
        
      
        }
         
        
            
            
        
        
       
        

}
