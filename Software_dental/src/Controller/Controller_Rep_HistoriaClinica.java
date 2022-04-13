/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;


import Model.ConexionPg;
import Model.Hist_clinico;
import Model.Model_Hist_clinico;
import Model.Paciente;
import View.MenuPrincipal;
import View.View_Rep_HistoriaClinica;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author slix0
 */
public class Controller_Rep_HistoriaClinica {
    private Model_Hist_clinico model;
    private View_Rep_HistoriaClinica vista;
    private MenuPrincipal vistamenu ;
   

    public Controller_Rep_HistoriaClinica(Model_Hist_clinico model, View_Rep_HistoriaClinica vista , MenuPrincipal vistamenu) {
        this.model = model;
        this.vista = vista;
        this.vistamenu = vistamenu;
        vista.setVisible(true);
        inicioControl();
        
    }
    public void inicioControl(){
        vista.getBtncargardts().addActionListener(l-> cargardatosexternosconcedula());
        vista.getBtnimprimir().addActionListener(l-> imprimirHistoriaClinica());
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
         //   vista.getLblid().setText(milistapa.get(i).getId_paciente()) ;
              calcu_edad();
              cargardatosexternos();
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
    
     public void cargardatosexternos(){
       
        
         String id2 = vistamenu.getLblCedulapac().getText();
         List<Hist_clinico> milistapa =  model.cargarRepHisclini(id2);
         for(int i = 0 ; i < milistapa.size() ; i++){
              
            vista.getTxtAobservaciones().setText(milistapa.get(i).getObservacion());
            vista.getTxtApatologiass().setText(milistapa.get(i).getEnfermedad());
            vista.getTxtAmedicacion().setText(milistapa.get(i).getMedicacion());
            
            vista.getTxtAalergias().setText(milistapa.get(i).getAlergia());
            vista.getTxtAmotivoocnsul().setText(milistapa.get(i).getMedicacion()) ;
            
         //   vista.getLblid().setText(milistapa.get(i).getId_paciente()) ;
           
              
            }
     
         
        
        
    }
     
       private void imprimirHistoriaClinica(){
        ConexionPg con =new ConexionPg();
          try {
              JasperReport listado = (JasperReport) JRLoader.loadObject(getClass().getResource("/Reportes/HistoriaClinica.jasper"));
               Map<String, Object> parametros = new HashMap<String, Object>();
            parametros.put("cedula", vistamenu.getLblCedulapac().getText());
              JasperPrint jp = JasperFillManager.fillReport(listado, parametros, con.getConnection());//cargando el reporte con los datos de la base
          
              JasperViewer jv = new JasperViewer(jp,false);
              jv.setVisible(true);
          } catch (JRException ex) {
              Logger.getLogger(Controller_Rep_Citas.class.getName()).log(Level.SEVERE, null, ex);
          }
    } 
    
    
    
}
