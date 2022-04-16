/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Doctor;
import Model.Model_Hist_clinico;
import Model.Paciente;
import View.MenuPrincipal;
import View.Vista_HistorialClinico;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Saul
 */
public class Controller_His_Cli {
     private Model_Hist_clinico model;
    private Vista_HistorialClinico vista;
    private MenuPrincipal vistamenu ;
   

    public Controller_His_Cli(Model_Hist_clinico model, Vista_HistorialClinico vista , MenuPrincipal vistamenu) {
        this.model = model;
        this.vista = vista;
        this.vistamenu = vistamenu;
        vista.setVisible(true);
        iniciocontrol();
    }
    
    
    public void iniciocontrol(){
      
        // cargardatosexternosconcedula();
        
       vista.getBtncargardatos().addActionListener(l-> cargardatosexternosconcedula());
      //vista.getBtncargardatos().addActionListener(l-> cargardatosexternosIdmed());
      generarSerie();
      vista.getBtnguardar().addActionListener(l-> registrarHistorialMedico());
    
    }
    
    public void registrarHistorialMedico(){
        
        String medicacion ; 
        String motivo;
        String patologias; 
        String alergias ; 
        String observaciones;
        String id ; 
        String iddoc ; 
        String idhist ; 
        Date fecha_nac  ;
        medicacion = vista.getTxtAmedicacion().getText();
        motivo =  vista.getTxtAmotivoocnsul().getText();
        patologias = vista.getTxtApatologiass().getText();
        alergias  = vista.getTxtAalergias().getText();
        observaciones = vista.getTxtAobservaciones().getText();
         SimpleDateFormat dateFormat = new SimpleDateFormat ("yyy-MM-dd");
     java.util.Date date= vista.getJdtfechanac().getDate();
     long d = date.getTime();
     String fechael=dateFormat.format(d);
     java.sql.Date fecha = new java.sql.Date (d);
        idhist = vista.getLblCodHist().getText();
        id = vista.getLblid().getText();
        iddoc = vista.getLabelIddoc().getText();
        
        
        
        
        Model_Hist_clinico histo = new Model_Hist_clinico();
        histo.setId_historia(idhist);
        histo.setFecha_his( fecha);
        histo.setId_pac(id);
        histo.setAlergia(alergias);
        histo.setMotivo(motivo);  
    
        histo.setObservacion(observaciones);
        histo.setEnfermedad(patologias);
         histo.setMedicacion(medicacion);
         histo.setId_odonto(iddoc);
         histo.crearHistoriaCli();
        
        
        generarSerie();
        
        limpiartxt();
    }
    
    
     public void limpiartxt(){
    vista.getLabelIddoc().setText("");
    vista.getLblid().setText("");
    vista.getTxtnombrespac().setText("");
    vista.getTxtgeneropac().setText("");
    vista.getTxttelefono().setText("");
    vista.getTxtapellidospac().setText("");
    vista.getTxtdomicilio().setText("");
    vista.getTxtedad().setText("");
    vista.getTxtAmedicacion().setText("");
    vista.getTxtAmotivoocnsul().setText("");
    vista.getTxtApatologiass().setText("");
    vista.getTxtAalergias().setText("");
    vista.getTxtAobservaciones().setText("");
    vista.getJdtfechanac().setDate(null);
  
    }
       private void generarSerie() {
      String   serie = model.NumSerie();
        if (serie == null) {
            vista.getLblCodHist().setText("1");
        } else {
            int inc = Integer.parseInt(serie);
            inc++;
            vista.getLblCodHist().setText("" + inc);

        }
    }
      
    
    
    
    
    public void cargardatosexternosconcedula(){
       
        
         String id2 = vistamenu.getLblCedulapac().getText();
         List<Paciente> milistapa =  model.cargartxtsobrantes(id2);
         for(int i = 0 ; i < milistapa.size() ; i++){
              
            vista.getTxtnombrespac().setText(milistapa.get(i).getNombres());
            vista.getTxtapellidospac().setText(milistapa.get(i).getApellidos());
            vista.getTxtgeneropac().setText(milistapa.get(i).getGenero());
            
            vista.getTxtdomicilio().setText(milistapa.get(i).getDireccion());
            vista.getTxttelefono().setText(milistapa.get(i).getTelefono()) ;
            vista.getJdtfechanac().setDate(milistapa.get(i).getFecha_nac()) ;
            vista.getLblid().setText(milistapa.get(i).getId_paciente()) ;
              calcu_edad();
              
            }
        cargardatosexternosIdmed();
        
        
    }
     public void cargardatosexternosIdmed(){
       
        String iddoc =(String) vistamenu.getJcbDocs().getSelectedItem().toString().subSequence(0, 10);
       // vistamenu.getLblIdpac().setText(id); 
           // pac.cargartxtsobrantes(id2);
           System.out.println("holas"+iddoc);
 
            List<Doctor> milistapaci =  model.cargaridDoc(iddoc);
         for(int i = 0 ; i < milistapaci.size() ; i++){
              
            vista.getLabelIddoc().setText(milistapaci.get(i).getId_doctor());
            
             
              
            }
        
        
        
    }
    
    private void calcu_edad(){
        SimpleDateFormat dateFormat = new SimpleDateFormat ("yyyy-MM-dd");
        Date dato=vista.getJdtfechanac().getDate();
        String fechael=dateFormat.format(dato);  
        LocalDate hoy = LocalDate.now();
        System.out.println(fechael);
        LocalDate fechanac = LocalDate.parse(fechael);
      Period p = Period.between(fechanac, hoy);   
      double Anio = p.getYears(); 
    
      vista.getTxtedad().setText("" + Anio + " años"  );
      
        
    }
    
    
    
}
