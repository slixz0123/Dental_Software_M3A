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
import Model.model_Odontograma;
import View.Crud_Paciente;
import View.MenuPrincipal;
import View.Odontograma;
import View.VISTA_PROFORMA;
import View.View_Rep_HistoriaClinica;
import View.View_certificado;
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
import View.Vista_Rep_ListFarm;
import View.Vista_Rep_ListTrat;
import View.Vista_Reportes;
import View.Vista_crud_Tratamiento;
import View.Vista_crud_especalista;
//import View.vista_Odontograma;
import desplazable.Desface;
import java.awt.Frame;
//import java.awt.Image;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;

/**
 *
 * @author slix0
 */
public class CONTROLADOR_MENUPRINCIPAL {

    MenuPrincipal vista;
    Desface desplace;
    Vista_InicioProceso vistaProceso; 
    Vista_Reportes reportes ;
    Crud_Paciente crudpaciente ;
    Vista_crud_especalista vistaesp ;
    Vista_crud_Tratamiento vistatrat ;
    Vista_Crud_Cie10 vistacie10 ;
    Vista_Farmacos vistafarma ;
    VISTA_PROFORMA vistaProforma ;
    Vista_AgendaCitas vistaAgendarcitas ;
    Vista_ListadoPacientes vistaListPac ;
    Odontograma vistaod ;
      View_certificado vist_cert ;

    public CONTROLADOR_MENUPRINCIPAL(MenuPrincipal vista) {
        this.vista = vista;
        vista.setVisible(true);
        vista.setExtendedState(Frame.MAXIMIZED_BOTH);
        desplace = new Desface();
        iniciarControlMenu();
        vista.setIconImage(new ImageIcon(getClass().getResource("/View/icons/odontologia.png")).getImage() );
        
    }

    public void iniciarControlMenu() {
        //labels
        procesos(vista.getLabelini()); // proceso
        crudpaciente(vista.getLblCrud_Paciente());
        crudEspe(vista.getLblNuevoEsp());
        crudTratamiento(vista.getLbl_CrudTratamiento());
        crudFamr(vista.getLbl_CrudFarmacos());
        crudCie10(vista.getLbl_CrudCie());
        proforma(vista.getLbl_Cotizacion());
        reportes(vista.getLbl_CitasTratamientos());
        EventoCertificado(vista.getLbl_Certificado());
        // botones
        vista.getBtnagendaCitas().addActionListener(l -> agendacitas());
        vista.getBtnOdontograma().addActionListener(l -> Odontograma());
        vista.getJbtnListPac().addActionListener(l -> ListadoPacbtn());
       
        cargarcboxMedico();
        vista.getBtnrefrescar().addActionListener(l-> cargarcboxMedico());
        fecha();
      
    }

    //--------------------------------------------------------------------------------------------------------------------------------------------------------
    
    private void procesos(JLabel laba4) {
        laba4.addMouseListener(new java.awt.event.MouseAdapter() {

            @Override
            public void mousePressed(MouseEvent ex2) {
 
        if(estacerrado(vistaProceso)) {
            
        vistaProceso = new Vista_InicioProceso();
        vista.getDkpPrincipal().add(vistaProceso);
            
        vistaProceso.setVisible(true);
        vistaProceso.setBorder(null);
         //historial medico
        Model_HistorialMedico modHisto = new Model_HistorialMedico();
        Vista_Crud_HistorialMedico vistaHistorialMedico = new Vista_Crud_HistorialMedico();
        vistaProceso.getPnHistorial().add(vistaHistorialMedico);
        vistaHistorialMedico.setBorder(null);

        Controller.Controller_HistorialMedico controllerHisto = new Controller_HistorialMedico(modHisto, vistaHistorialMedico, vista);

        //listado de pacientes
        Model_ListadoPacientes modlistado = new Model_ListadoPacientes();
        Vista_ListadoPacientes vistaLista = new Vista_ListadoPacientes();
        vistaProceso.getPnListadoPac().add(vistaLista);
        vistaLista.setBorder(null);

        Controller.Contoller_ListadoPaciente controllerlistado = new Contoller_ListadoPaciente(modlistado, vistaLista, vista);

        //anamesis
        Model_Anamnesis modAne = new Model_Anamnesis();
        Vista_Anamesis vistaana = new Vista_Anamesis();
        vistaProceso.getPnAnamesis().add(vistaana);
        vistaana.setBorder(null);

        Controller.Controller_Anamnesis controllerAnamesis = new Controller_Anamnesis(modAne, vistaana, vista);

        // historial clicica
        Model_Hist_clinico modeldiag = new Model_Hist_clinico();

        Vista_HistorialClinico vistadiag = new Vista_HistorialClinico();
        vistaProceso.getPnHistorialClinico().add(vistadiag);
        vistadiag.setBorder(null);
        Controller.Controller_His_Cli controllerdiag = new Controller_His_Cli(modeldiag, vistadiag, vista);
        // CITAS

        // CITAS
        Model_Citas modelcitastrat = new Model_Citas();
        Vista_Citas_Tratamiento vistacitastrat = new Vista_Citas_Tratamiento();
        vistaProceso.getPnCitas().add(vistacitastrat);
        vistacitastrat.setBorder(null);
        Controller.Controller_CitasTratamiento controlcitastrat = new Controller_CitasTratamiento(modelcitastrat, vistacitastrat, vista);
        //recetas
        Model_Receta modelrec = new Model_Receta();
        Vista_Receta vistarec = new Vista_Receta();
        vistaProceso.getPnreceta().add(vistarec);
        vistarec.setBorder(null);
        Controller.Controller_Receta controlrece = new Controller_Receta(modelrec, vistarec, vista);

        //Facturacion 
        Model_Factura modelfac = new Model_Factura();
        Vista_crud_Factura vistafac = new Vista_crud_Factura();
        vistaProceso.getPnFacturacion().add(vistafac);
        vistafac.setBorder(null);
        Controller.Controller_Factura controlfac = new Controller_Factura(modelfac, vistafac, vista);

            }
            else
            {
            //JOptionPane.showMessageDialog(null,"LA VENTANA MOVILIDADES YA ESTA ABIERTA");
            }
            }
        });
    }
    
   
  //-------------------------------------------------------------------------------------------------------------------------------------------------  
    private void crudpaciente(JLabel lab) {
        lab.addMouseListener(new java.awt.event.MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent ex8) {

            if(estacerradoCrudPac(crudpaciente)) {
            
            crudpaciente = new Crud_Paciente();
            Model_Paciente modelpaciente = new Model_Paciente();
        
            // agremgamos nuestra jdialog al deskopt pane 
            vista.getDkpPrincipal().add(crudpaciente);
            crudpaciente.setBorder(null);
            Controller.Controller_CrudPaciente controlador = new Controller_CrudPaciente(modelpaciente, crudpaciente);
            } else{
              
            }

            }
        });
    }
//-------------------------------------------------------------------------------------------------------------------------------------------------
    private void crudEspe(JLabel l) {
        l.addMouseListener(new java.awt.event.MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent ex7) {

            if(estacerradoCrudEspe(vistaesp)) {
            
            vistaesp = new Vista_crud_especalista();
            Model_Especialista modelesp = new Model_Especialista();
            vista.getDkpPrincipal().add(vistaesp);
            vistaesp.setBorder(null);
            Controller.Controller_CrudEspecialista contEsp = new Controller_CrudEspecialista(modelesp, vistaesp);
            }else{
            
            }

            }
        });
    }
//-------------------------------------------------------------------------------------------------------------------------------------------------
    private void crudTratamiento(JLabel le) {
        le.addMouseListener(new java.awt.event.MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent ex6) {

            if(estacerradoCrudTrat(vistatrat)) {
            
            vistatrat = new Vista_crud_Tratamiento();
            Model_Tratamiento modeltrat = new Model_Tratamiento();
            vista.getDkpPrincipal().add(vistatrat);
            vistatrat.setBorder(null);
            Controller.Controller_CrudTratamiento contTrat = new Controller_CrudTratamiento(modeltrat, vistatrat);
            }else{
              
            }

            }
        });
    }
  //-------------------------------------------------------------------------------------------------------------------------------------------------
 private void crudFamr(JLabel laba3) {
        laba3.addMouseListener(new java.awt.event.MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent ex3) {

            if(estacerradoFarmacos(vistafarma)) {
            
            vistafarma = new Vista_Farmacos ();
            Model_Farmacos modelfarma = new Model_Farmacos();
            vista.getDkpPrincipal().add(vistafarma);
            vistafarma.setBorder(null);
            Controller.Controller_Farmacos controlfarma = new Controller_Farmacos(modelfarma, vistafarma);
            }else{
     
            }

            }
        });
    }
 //-------------------------------------------------------------------------------------------------------------------------------------------------
    private void crudCie10(JLabel laba1) {
        laba1.addMouseListener(new java.awt.event.MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent ex5) {

            if(estacerradoCrudCie10(vistacie10)) {
            
            vistacie10 = new Vista_Crud_Cie10 ();
            Model_Cie10 modelcie = new Model_Cie10();
            vista.getDkpPrincipal().add(vistacie10);
            vistacie10.setBorder(null);
            Controller.Controller_CrudCie10 controlcie = new Controller_CrudCie10(modelcie, vistacie10);
            }else{
           
            }

            }
        });
    }
//-------------------------------------------------------------------------------------------------------------------------------------------------
     private void proforma(JLabel laba5) {
        laba5.addMouseListener(new java.awt.event.MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent ex) {

            if(estacerradoProforma(vistaProforma)) {
            vistaProforma = new VISTA_PROFORMA ();
            Model_Proforma modelProforma = new Model_Proforma();
            vista.getDkpPrincipal().add(vistaProforma);
            vistaProforma.setBorder(null);
            Controller.Controller_Proforma controlerproforma = new Controller_Proforma(modelProforma, vistaProforma);
            }else{
             
            }

            }
        });
    }
     
     
     private void EventoCertificado(JLabel lbl) {

        lbl.addMouseListener(new java.awt.event.MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
         
                
         if(estacerradoCertificadp(vist_cert)) {
        vist_cert = new View_certificado ();
        Model_Paciente model_cert = new Model_Paciente();
        View_certificado vist_cert = new View_certificado();
        vista.getDkpPrincipal().add(vist_cert);
        vist_cert.setBorder(null);
        Controller.Controller_Certificado controlRepCitas = new Controller_Certificado(model_cert, vist_cert, vista);
            } else{
             
            }

            }
             
        });
            
        }

    
     
     
     
     
     
     
     
     
     
     
     
     
 //-------------------------------------------------------------------------------------------------------------------------------------------------   
 
    private void reportes(JLabel laba2) {

        laba2.addMouseListener(new java.awt.event.MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent ex4) {

                // mitIngresarCompraActionPerformed(ex2);
            if(estacerradorep(reportes)) {
            
            reportes = new Vista_Reportes();

        vista.getDkpPrincipal().add(reportes);
        reportes.setVisible(true);
        reportes.setBorder(null);
        //historial medico
        Model_ListadoPacientes modellisttPac = new Model_ListadoPacientes();
        Vista_ListadoPacientes vistaListPac = new Vista_ListadoPacientes();
        reportes.getPnListPac().add(vistaListPac);
        vistaListPac.setBorder(null);
        Controller.Contoller_ListadoPaciente controlListpac = new Contoller_ListadoPaciente(modellisttPac, vistaListPac, vista);

        Model_ListadoEspecialistas modelisEspe = new Model_ListadoEspecialistas();
        Vista_ListadoEspecialista vistaListEspe = new Vista_ListadoEspecialista();
        reportes.getPnListEsp().add(vistaListEspe);
        vistaListEspe.setBorder(null);
        Controller.Contoller_ListadoEspecialista controlListEsp = new Contoller_ListadoEspecialista(modelisEspe, vistaListEspe, vista);

        Model_Farmacos modelisFarm = new Model_Farmacos();
        Vista_Rep_ListFarm vistaFarm = new Vista_Rep_ListFarm();
        reportes.getPnListfarm().add(vistaFarm);
        vistaFarm.setBorder(null);
        Controller.Controller_Rep_ListFarm controlListFamr = new Controller_Rep_ListFarm(modelisFarm, vistaFarm, vista);

        Model_Tratamiento modelTrat = new Model_Tratamiento();
        Vista_Rep_ListTrat vistaRepTrata = new Vista_Rep_ListTrat();
        reportes.getPnListTrat().add(vistaRepTrata);
        vistaRepTrata.setBorder(null);
        Controller.Controller_Rep_ListTrat controlListTrat = new Controller_Rep_ListTrat(modelTrat, vistaRepTrata, vista);

        Model_Citas modelRepCitas = new Model_Citas();
        Vista_Rep_Citas vistaRepCits = new Vista_Rep_Citas();
        reportes.getOnCitas().add(vistaRepCits);
        vistaRepCits.setBorder(null);
        Controller.Controller_Rep_Citas controlRepCitas = new Controller_Rep_Citas(modelRepCitas, vistaRepCits, vista);

        Model_HistorialMedico modHistor = new Model_HistorialMedico();
        Vista_Rep_HistorialOdontologico vistaHistorialod = new Vista_Rep_HistorialOdontologico();
        reportes.getPnHistOdonto().add(vistaHistorialod);
        vistaHistorialod.setBorder(null);
        Controller.Controller_Rep_His_Med controllerHist_od = new Controller_Rep_His_Med(modHistor, vistaHistorialod, vista);

        Model_Hist_clinico modelreporteHistClinica = new Model_Hist_clinico();
        View_Rep_HistoriaClinica vistaReporteHistoClinica = new View_Rep_HistoriaClinica();
        reportes.getPnHistClinica().add(vistaReporteHistoClinica);
        vistaReporteHistoClinica.setBorder(null);
        Controller.Controller_Rep_HistoriaClinica controllerRepHistCli = new Controller_Rep_HistoriaClinica(modelreporteHistClinica, vistaReporteHistoClinica, vista);


            }
            else
            {
            //JOptionPane.showMessageDialog(null,"LA VENTANA MOVILIDADES YA ESTA ABIERTA");
            }

            }
        });
    }
  
    //------------------------------------------------------------------------------------------------------------------------------------------------------------------------     




    private void agendacitas() {
        
        if(estacerradoAgenda(vistaAgendarcitas)) {
            
        vistaAgendarcitas = new Vista_AgendaCitas();
        Model_AgendaCitas modelagendacitas = new Model_AgendaCitas();
        vista.getDkpPrincipal().add(vistaAgendarcitas);
        vistaAgendarcitas.setBorder(null);
        Controller.Controller_AgendaCitas controlerAgendaCitas = new Controller_AgendaCitas(modelagendacitas, vistaAgendarcitas);
        }else {
          
         }

    }
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------     

    private void ListadoPacbtn() {

         if(estacerradoListadobtn(vistaListPac)) {
            
        vistaListPac = new Vista_ListadoPacientes();
        Model_ListadoPacientes modellisttPac = new Model_ListadoPacientes();
        vista.getDkpPrincipal().add(vistaListPac);
        vistaListPac.setBorder(null);
        Controller.Contoller_ListadoPaciente controlListpac = new Contoller_ListadoPaciente(modellisttPac, vistaListPac, vista);
        }else{
               
         }

    }
 //------------------------------------------------------------------------------------------------------------------------------------------------------------------------     

    private void Odontograma() {
       
        
         if(estacerradoOdontogramaBtn(vistaod)) {
            
        vistaod= new Odontograma();
        model_Odontograma model = new model_Odontograma();
        vista.getDkpPrincipal().add(vistaod);
        vistaod.setBorder(null);
        Controller_odonto cont = new Controller_odonto(model, vistaod, vista);
        }else {
           
        }
 
    }

    //-------------------------------------------------------------------------------------------------------------------------------------

    private void cargarcboxMedico() {

        Model_Especialista modelesp = new Model_Especialista();
        ArrayList<Doctor> listadocs = modelesp.cargardocscombo();
        vista.getJcbDocs().removeAllItems();
        for (int i = 0; i < listadocs.size(); i++) {
        vista.getJcbDocs().addItem(new Doctor(listadocs.get(i).getCedula_doc(), listadocs.get(i).getNombres(), listadocs.get(i).getApellidos()));
        }

       
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

  //------------------------------------------------------------------------------------------------------------------------------------------------
    // metodo para no dupllicar las ventanas
    
       public  boolean estacerrado( Vista_InicioProceso vistaProceso) {
     JInternalFrame[] activos= vista.getDkpPrincipal().getAllFrames();
     boolean cerrado=true;
     int i=0;
     while (i<activos.length && cerrado){
     if(activos[i]==vistaProceso){
     cerrado=false;
     vistaProceso.toFront();
     }
     i++;
     }
     return cerrado;
     }
       public  boolean estacerradorep( Vista_Reportes reportes ){
     JInternalFrame[] activos= vista.getDkpPrincipal().getAllFrames();
     boolean cerrado=true;
     int i=0;
     while (i<activos.length && cerrado){
     if(activos[i]==reportes){
     cerrado=false;
     reportes.toFront();
     }
     i++;
     }
     return cerrado;
     }
     public  boolean estacerradoCrudPac( Crud_Paciente crudpaciente ){
     JInternalFrame[] activos= vista.getDkpPrincipal().getAllFrames();
     boolean cerrado=true;
     int i=0;
     while (i<activos.length && cerrado){
     if(activos[i]==crudpaciente){
     cerrado=false;
     crudpaciente.toFront();
     }
     i++;
     }
     return cerrado;
     }
      public  boolean estacerradoCrudEspe(Vista_crud_especalista vistaesp  ){
     JInternalFrame[] activos= vista.getDkpPrincipal().getAllFrames();
     boolean cerrado=true;
     int i=0;
     while (i<activos.length && cerrado){
     if(activos[i]==vistaesp){
     cerrado=false;
     vistaesp.toFront();
     }
     i++;
     }
     return cerrado;
     }
    
   // Vista_crud_Tratamiento vistatrat
     public  boolean estacerradoCrudTrat(Vista_crud_Tratamiento vistatrat  ){
     JInternalFrame[] activos= vista.getDkpPrincipal().getAllFrames();
     boolean cerrado=true;
     int i=0;
     while (i<activos.length && cerrado){
     if(activos[i]==vistatrat){
     cerrado=false;
     vistatrat.toFront();
     }
     i++;
     }
     return cerrado;
     }
     // Vista_Crud_Cie10 vistacie10
     public  boolean estacerradoCrudCie10(Vista_Crud_Cie10 vistacie10  ){
     JInternalFrame[] activos= vista.getDkpPrincipal().getAllFrames();
     boolean cerrado=true;
     int i=0;
     while (i<activos.length && cerrado){
     if(activos[i]==vistacie10){
     cerrado=false;
     vistacie10.toFront();
     }
     i++;
     }
     return cerrado;
     }
     //Vista_Farmacos vistafarma
      public  boolean estacerradoFarmacos(Vista_Farmacos vistafarma  ){
     JInternalFrame[] activos= vista.getDkpPrincipal().getAllFrames();
     boolean cerrado=true;
     int i=0;
     while (i<activos.length && cerrado){
     if(activos[i]==vistafarma){
     cerrado=false;
     vistafarma.toFront();
     }
     i++;
     }
     return cerrado;
     }
     //  VISTA_PROFORMA vistaProforma
      public  boolean estacerradoProforma(VISTA_PROFORMA vistaProforma  ){
     JInternalFrame[] activos= vista.getDkpPrincipal().getAllFrames();
     boolean cerrado=true;
     int i=0;
     while (i<activos.length && cerrado){
     if(activos[i]==vistaProforma){
     cerrado=false;
     vistaProforma.toFront();
     }
     i++;
     }
     return cerrado;
     }
      
       //  VISTA_PROFORMA vistaProforma
      public  boolean estacerradoAgenda(Vista_AgendaCitas vistaAgendarcitas ){
     JInternalFrame[] activos= vista.getDkpPrincipal().getAllFrames();
     boolean cerrado=true;
     int i=0;
     while (i<activos.length && cerrado){
     if(activos[i]==vistaAgendarcitas){
     cerrado=false;
     vistaAgendarcitas.toFront();
     }
     i++;
     }
     return cerrado;
     }
      
      //Vista_ListadoPacientes vistaListPac  
      public  boolean estacerradoListadobtn(Vista_ListadoPacientes vistaListPac ){
     JInternalFrame[] activos= vista.getDkpPrincipal().getAllFrames();
     boolean cerrado=true;
     int i=0;
     while (i<activos.length && cerrado){
     if(activos[i]==vistaListPac){
     cerrado=false;
     vistaListPac.toFront();
     }
     i++;
     }
     return cerrado;
     }
      
    // Odontograma vistaod
    public  boolean estacerradoOdontogramaBtn(Odontograma vistaod){
     JInternalFrame[] activos= vista.getDkpPrincipal().getAllFrames();
     boolean cerrado=true;
     int i=0;
     while (i<activos.length && cerrado){
     if(activos[i]==vistaod){
     cerrado=false;
     vistaod.toFront();
     }
     i++;
     }
     return cerrado;
     }

//  View_certificado vist_cert
public  boolean estacerradoCertificadp(View_certificado vist_cert){
     JInternalFrame[] activos= vista.getDkpPrincipal().getAllFrames();
     boolean cerrado=true;
     int i=0;
     while (i<activos.length && cerrado){
     if(activos[i]==vistaod){
     cerrado=false;
     vistaod.toFront();
     }
     i++;
     }
     return cerrado;
     }

}
