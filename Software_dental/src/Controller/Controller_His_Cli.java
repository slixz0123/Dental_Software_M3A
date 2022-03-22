/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Doctor;
import Model.Model_Hist_clinico;
import Model.Model_HistorialMedico;
import Model.Paciente;
import View.MenuPrincipal;
import View.Vista_HistorialClinico;
import View.Vista_InicioProceso;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

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

    }
    
    public void registrarHistorialMedico(){
        
        
        
        
        
        
        
        
        
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
           // pac.cargartxtsobrantes(id2);
           System.out.println(id2+"-----");
 
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
