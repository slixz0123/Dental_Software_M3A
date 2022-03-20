/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Model_Receta;
import View.Vista_Receta;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author jose illescas
 */
public class Controller_Receta {
    private Model_Receta modelo;
    private Vista_Receta vista;

    public Controller_Receta(Model_Receta modelo, Vista_Receta vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setVisible(true);
        iniciarcontrol();
    }
    
    public void iniciarcontrol (){
        generarSerie();
    }
    
    private void generarSerie() {
      String   serie = modelo.id_receta();
        if (serie == null) {
            vista.getTxtIDreceta().setText("1");
        } else {
            int inc = Integer.parseInt(serie);
            inc++;
            vista.getTxtIDreceta().setText("0" + inc);

        }
    }
    
    public void crearReceta(){
        
        
    String id_receta = vista.getTxtIDreceta().getText();
    Date fecha = (Date) vista.getJdcFechareceta().getDate();
    String id_farmaco = vista.getTxtIdfamaco().getText();
    String indicaciones = vista.getTxtIndicaciones().getText();
     
          Model_Receta rec = new Model_Receta();
           rec.setId_receta(id_receta);
           rec.setFecha_receta(fecha);
           rec.setId_farmaco_rec(id_farmaco);
           rec.setIndicaciones(indicaciones);
           
            rec.crearReceta();
            generarSerie();
            fecha();
//            cargarPersonas ();
//            limpiartxt();
          
      }
    
    Calendar fechaactual=new GregorianCalendar();
    public void fecha(){
        Vista_Receta rec=new Vista_Receta();
        rec.jdcFechareceta.setCalendar(fechaactual);
        rec.jdcFechareceta2.setCalendar(fechaactual);
    }
    
    public void limpiartxt(){
    vista.getTxtCie().setText("");
    vista.getTxtIDreceta().setText("");
    }
    
    
}
