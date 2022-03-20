/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

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
       

    }
    
    
    
    public void cargardatosexternosconcedula(){
       
        
         String id2 = vistamenu.getLblCedulapac().getText();
           // pac.cargartxtsobrantes(id2);
 
            List<Paciente> milistapaci =  model.cargartxtsobrantes(id2);
         for(int i = 0 ; i < milistapaci.size() ; i++){
              
            vista.getTxtnombrespac().setText(milistapaci.get(i).getNombres());
            vista.getTxtapellidospac().setText(milistapaci.get(i).getApellidos());
            vista.getTxtgeneropac().setText(milistapaci.get(i).getGenero());
            
            vista.getTxtdomicilio().setText(milistapaci.get(i).getDireccion());
            vista.getTxttelefono().setText(milistapaci.get(i).getTelefono()) ;
            vista.getJdtfechanac().setDate(milistapaci.get(i).getFecha_nac()) ;
              calcu_edad();
              
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
