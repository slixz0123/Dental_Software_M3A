/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Citas;
import Model.Model_AgendaCitas;
import View.Vista_AgendaCitas;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.xml.ws.Holder;

/**
 *
 * @author slix0
 */
public class Controller_AgendaCitas {
    
         private Model_AgendaCitas modelo;
    private Vista_AgendaCitas vista;

    public Controller_AgendaCitas(Model_AgendaCitas modelo, Vista_AgendaCitas vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setVisible(true);
        iniciocontrol();
        
    }
    
    public void iniciocontrol(){
        
        vista.getBtnseleccionar().addActionListener(l->btnseleccionar() );
        vista.getBtnsiguiente().addActionListener(l-> siguientedia());
       vista.getBtnanterior().addActionListener(l-> anteriordia());
        
        
        
    }
    
     public void btnseleccionar(){
         Calendar fechaActual = GregorianCalendar.getInstance();
        Calendar c1=vista.getJdcSeleccionDia().getCalendar();
        if (c1.compareTo(fechaActual)>=0 || (c1.get(Calendar.DAY_OF_MONTH)==fechaActual.get(Calendar.DAY_OF_MONTH) && c1.get(Calendar.MONTH)==fechaActual.get(Calendar.MONTH) && c1.get(Calendar.YEAR)==fechaActual.get(Calendar.YEAR))){
            vista.getLabelfecha().setText(Integer.toString(c1.get(Calendar.YEAR))+"-"+Integer.toString(c1.get(Calendar.MONTH)+1)+"-"+Integer.toString(c1.get(Calendar.DAY_OF_MONTH)));

        }else{
            JOptionPane.showMessageDialog(null, "ERROR!\nLa agenda esta personalizada para eventos futuros!");
        }
        cargarcitas7am();
        cargarcitas8am();
        cargarcitas9am();
        cargarcitas10am();
        cargarcitas11am();
        cargarcitas12();
        cargarcitas13();
        cargarcitas14();
        cargarcitas15();
        cargarcitas16();
        cargarcitas17();
        cargarcitas18();
        cargarcitas19();
        cargarcitas20();
        cargarcitas21();
        cargarcitas22();
     }
    
    public void siguientedia(){
           String fecha = vista.getLabelfecha().getText();
        String[] fechArray = fecha.split("-");
        int anio = Integer.valueOf(fechArray[0]);
        
        int mes = Integer.valueOf(fechArray[1]) - 1;
        int dia = Integer.valueOf(fechArray[2]);
        Calendar c1 = new GregorianCalendar(anio, mes, dia);
        c1.add(Calendar.DAY_OF_MONTH, +1);
        vista.getLabelfecha().setText(Integer.toString(c1.get(Calendar.YEAR))+"-"+Integer.toString(c1.get(Calendar.MONTH)+1)+"-"+Integer.toString(c1.get(Calendar.DAY_OF_MONTH)));
        cargarcitas7am();
        cargarcitas8am();
        cargarcitas9am();
        cargarcitas10am();
        cargarcitas11am();
        cargarcitas12();
        cargarcitas13();
        cargarcitas14();
        cargarcitas15();
        cargarcitas16();
        cargarcitas17();
        cargarcitas18();
        cargarcitas19();
        cargarcitas20();
        cargarcitas21();
        cargarcitas22();
    }
     public void anteriordia(){
         
         String fecha =vista.getLabelfecha().getText();
       String[] fechArray = fecha.split("-");
        int anio = Integer.valueOf(fechArray[0]);
        
        int mes = Integer.valueOf(fechArray[1]) - 1;
        int dia = Integer.valueOf(fechArray[2]);
        Calendar c1 = new GregorianCalendar(anio, mes, dia);
        c1.add(Calendar.DAY_OF_MONTH, -1);
        Calendar fechaActual = GregorianCalendar.getInstance();
        if (c1.compareTo(fechaActual)>=0 || (c1.get(Calendar.YEAR)==fechaActual.get(Calendar.YEAR)) && c1.get(Calendar.MONTH)==fechaActual.get(Calendar.MONTH) &&c1.get(Calendar.DAY_OF_MONTH)==fechaActual.get(Calendar.DAY_OF_MONTH)){
            vista.getLabelfecha().setText(Integer.toString(c1.get(Calendar.YEAR))+"-"+Integer.toString(c1.get(Calendar.MONTH)+1)+"-"+Integer.toString(c1.get(Calendar.DAY_OF_MONTH)));
            
        }    
        else{
            JOptionPane.showMessageDialog(null, "ERROR!\nLa agenda esta personalizada para eventos futuros!");
        }
        cargarcitas7am();
        cargarcitas8am();
        cargarcitas9am();
        cargarcitas10am();
        cargarcitas11am();
        cargarcitas12();
        cargarcitas13();
        cargarcitas14();
        cargarcitas15();
        cargarcitas16();
        cargarcitas17();
        cargarcitas18();
        cargarcitas19();
        cargarcitas20();
        cargarcitas21();
        cargarcitas22();
    }
    
  //-----------------------------------------------------------------------------------------------------------------------------
     private void  cargarcitas7am(){
        
      
      
        DefaultTableModel tbmodel ; 

        tbmodel = (DefaultTableModel) vista.getTb7am().getModel() ; 
  
        tbmodel.setNumRows(0);

         
        List<Citas> milistaci = modelo.listarCitas(vista.getLabelfecha().getText() ,vista.getLb7am().getText() );
     
        Holder<Integer> i = new Holder<>(0);
        milistaci.stream().forEach( ci -> {

      tbmodel.addRow( new Object[4]);// creo una fila vacia
       //dibujar elementos de la tabla 
      // vista.getTb7am().setValueAt(ci.getCedula(), i.value, 0);
       vista.getTb7am().setValueAt(ci.getNombres(), i.value, 0);
       vista.getTb7am().setValueAt(ci.getHora_cita(), i.value, 1);
       vista.getTb7am().setValueAt(ci.getMotivo(), i.value, 2);
        vista.getTb7am().setValueAt(ci.getNombresdoc(), i.value, 3);
        
        i.value++;

      
        });
        
                
    }
//---------------------------------------------------------------------------------------------------------------------------------
 
//-----------------------------------------------------------------------------------------------------------------------------
     private void  cargarcitas8am(){
        
      
      
        DefaultTableModel tbmodel ; 

        tbmodel = (DefaultTableModel) vista.getTb8am().getModel() ; 
  
        tbmodel.setNumRows(0);

         
        List<Citas> milistaci = modelo.listarCitas(vista.getLabelfecha().getText() ,vista.getLb8().getText() );
     
        Holder<Integer> i = new Holder<>(0);
        milistaci.stream().forEach( ci -> {

      tbmodel.addRow( new Object[4]);// creo una fila vacia
       //dibujar elementos de la tabla 
      // vista.getTb7am().setValueAt(ci.getCedula(), i.value, 0);
       vista.getTb8am().setValueAt(ci.getNombres(), i.value, 0);
       vista.getTb8am().setValueAt(ci.getHora_cita(), i.value, 1);
       vista.getTb8am().setValueAt(ci.getMotivo(), i.value, 2);
        vista.getTb8am().setValueAt(ci.getNombresdoc(), i.value, 3);
        
        i.value++;

      
        });
        
                
    }
     //-----------------------------------------------------------------------------------------------------------------------------
     private void  cargarcitas9am(){
        
      
      
        DefaultTableModel tbmodel ; 

        tbmodel = (DefaultTableModel) vista.getTb9am().getModel() ; 
  
        tbmodel.setNumRows(0);

         
        List<Citas> milistaci = modelo.listarCitas(vista.getLabelfecha().getText() ,vista.getLb9().getText() );
     
        Holder<Integer> i = new Holder<>(0);
        milistaci.stream().forEach( ci -> {

      tbmodel.addRow( new Object[4]);// creo una fila vacia
       //dibujar elementos de la tabla 
      // vista.getTb7am().setValueAt(ci.getCedula(), i.value, 0);
       vista.getTb9am().setValueAt(ci.getNombres(), i.value, 0);
       vista.getTb9am().setValueAt(ci.getHora_cita(), i.value, 1);
       vista.getTb9am().setValueAt(ci.getMotivo(), i.value, 2);
        vista.getTb9am().setValueAt(ci.getNombresdoc(), i.value, 3);
        
        i.value++;

      
        });
        
                
    }
     //-----------------------------------------------------------------------------------------------------------------------------
     private void  cargarcitas10am(){
        
      
      
        DefaultTableModel tbmodel ; 

        tbmodel = (DefaultTableModel) vista.getTb10am().getModel() ; 
  
        tbmodel.setNumRows(0);

         
        List<Citas> milistaci = modelo.listarCitas(vista.getLabelfecha().getText() ,vista.getLb10().getText() );
     
        Holder<Integer> i = new Holder<>(0);
        milistaci.stream().forEach( ci -> {

      tbmodel.addRow( new Object[4]);// creo una fila vacia
       //dibujar elementos de la tabla 
      // vista.getTb7am().setValueAt(ci.getCedula(), i.value, 0);
       vista.getTb10am().setValueAt(ci.getNombres(), i.value, 0);
       vista.getTb10am().setValueAt(ci.getHora_cita(), i.value, 1);
       vista.getTb10am().setValueAt(ci.getMotivo(), i.value, 2);
        vista.getTb10am().setValueAt(ci.getNombresdoc(), i.value, 3);
        
        i.value++;

      
        });
        
                
    }
     //-----------------------------------------------------------------------------------------------------------------------------
     private void  cargarcitas11am(){
        
      
      
        DefaultTableModel tbmodel ; 

        tbmodel = (DefaultTableModel) vista.getTb11am().getModel() ; 
        tbmodel.setNumRows(0);

        
        List<Citas> milistaci = modelo.listarCitas(vista.getLabelfecha().getText() ,vista.getLb11().getText() );
     
        Holder<Integer> i = new Holder<>(0);
        milistaci.stream().forEach( ci -> { 

      tbmodel.addRow( new Object[4]);// creo una fila vacia
       //dibujar elementos de la tabla 
      // vista.getTb7am().setValueAt(ci.getCedula(), i.value, 0);
       vista.getTb11am().setValueAt(ci.getNombres(), i.value, 0);
       vista.getTb11am().setValueAt(ci.getHora_cita(), i.value, 1);
       vista.getTb11am().setValueAt(ci.getMotivo(), i.value, 2);
        vista.getTb11am().setValueAt(ci.getNombresdoc(), i.value, 3);
        
        i.value++;

      
        });
        
                
    }
     
     private void  cargarcitas12(){
        
      
      
        DefaultTableModel tbmodel ; 

        tbmodel = (DefaultTableModel) vista.getTb12().getModel() ; 
  
        tbmodel.setNumRows(0);

      
        List<Citas> milistaci = modelo.listarCitas(vista.getLabelfecha().getText() ,vista.getLb12().getText() );
        
        Holder<Integer> i = new Holder<>(0);
        milistaci.stream().forEach( ci -> {

        tbmodel.addRow( new Object[4]);// creo una fila vacia
        //dibujar elementos de la tabla 
        // vista.getTb7am().setValueAt(ci.getCedula(), i.value, 0);
       vista.getTb12().setValueAt(ci.getNombres(), i.value, 0);
       vista.getTb12().setValueAt(ci.getHora_cita(), i.value, 1);
       vista.getTb12().setValueAt(ci.getMotivo(), i.value, 2);
        vista.getTb12().setValueAt(ci.getNombresdoc(), i.value, 3);
        
        i.value++;

      
        });
        
                
    }
     
     
     
     
     
     
     //-----------------------------------------------------------------------------------------------------------------------------
     private void  cargarcitas13(){
        
      
      
        DefaultTableModel tbmodel ; 

        tbmodel = (DefaultTableModel) vista.getTb13().getModel() ; 
  
        tbmodel.setNumRows(0);

      
        List<Citas> milistaci = modelo.listarCitas(vista.getLabelfecha().getText() ,vista.getLb13().getText() );
        
        Holder<Integer> i = new Holder<>(0);
        milistaci.stream().forEach( ci -> {

        tbmodel.addRow( new Object[4]);// creo una fila vacia
        //dibujar elementos de la tabla 
        // vista.getTb7am().setValueAt(ci.getCedula(), i.value, 0);
       vista.getTb13().setValueAt(ci.getNombres(), i.value, 0);
       vista.getTb13().setValueAt(ci.getHora_cita(), i.value, 1);
       vista.getTb13().setValueAt(ci.getMotivo(), i.value, 2);
        vista.getTb13().setValueAt(ci.getNombresdoc(), i.value, 3);
        
        i.value++;

      
        });
        
                
    }
     //-----------------------------------------------------------------------------------------------------------------------------
     private void  cargarcitas14(){
        
      
      
        DefaultTableModel tbmodel ; 

        tbmodel = (DefaultTableModel) vista.getTb14().getModel() ; 
  
        tbmodel.setNumRows(0);

        
        List<Citas> milistaci = modelo.listarCitas(vista.getLabelfecha().getText() ,vista.getLb14().getText() );
     
        Holder<Integer> i = new Holder<>(0);
        milistaci.stream().forEach( ci -> {

      tbmodel.addRow( new Object[4]);// creo una fila vacia
      //dibujar elementos de la tabla 
     // vista.getTb7am().setValueAt(ci.getCedula(), i.value, 0);
       vista.getTb14().setValueAt(ci.getNombres(), i.value, 0);
       vista.getTb14().setValueAt(ci.getHora_cita(), i.value, 1);
       vista.getTb14().setValueAt(ci.getMotivo(), i.value, 2);
       vista.getTb14().setValueAt(ci.getNombresdoc(), i.value, 3);
        
        i.value++;

      
        });
        
                
    }//-----------------------------------------------------------------------------------------------------------------------------
     private void  cargarcitas15(){
        
      
      
        DefaultTableModel tbmodel ; 

        tbmodel = (DefaultTableModel) vista.getTb15().getModel() ; 
  
        tbmodel.setNumRows(0);


        List<Citas> milistaci = modelo.listarCitas(vista.getLabelfecha().getText() ,vista.getLb15().getText() );
     
        Holder<Integer> i = new Holder<>(0);
        milistaci.stream().forEach( ci -> {

      tbmodel.addRow( new Object[4]);// creo una fila vacia
       //dibujar elementos de la tabla 
      // vista.getTb7am().setValueAt(ci.getCedula(), i.value, 0);
       vista.getTb15().setValueAt(ci.getNombres(), i.value, 0);
       vista.getTb15().setValueAt(ci.getHora_cita(), i.value, 1);
       vista.getTb15().setValueAt(ci.getMotivo(), i.value, 2);
        vista.getTb15().setValueAt(ci.getNombresdoc(), i.value, 3);
        
        i.value++;

      
        });
        
                
    }//-----------------------------------------------------------------------------------------------------------------------------
     private void  cargarcitas16(){
        
      
      
        DefaultTableModel tbmodel ; 

        tbmodel = (DefaultTableModel) vista.getTb16().getModel() ; 
  
        tbmodel.setNumRows(0);

      
        List<Citas> milistaci = modelo.listarCitas(vista.getLabelfecha().getText() ,vista.getLb16().getText() );
     
        Holder<Integer> i = new Holder<>(0);
        milistaci.stream().forEach( ci -> {

      tbmodel.addRow( new Object[4]);// creo una fila vacia
       //dibujar elementos de la tabla 
      // vista.getTb7am().setValueAt(ci.getCedula(), i.value, 0);
       vista.getTb16().setValueAt(ci.getNombres(), i.value, 0);
       vista.getTb16().setValueAt(ci.getHora_cita(), i.value, 1);
       vista.getTb16().setValueAt(ci.getMotivo(), i.value, 2);
        vista.getTb16().setValueAt(ci.getNombresdoc(), i.value, 3);
        
        i.value++;

      
        });
        
                
    }//-----------------------------------------------------------------------------------------------------------------------------
     private void  cargarcitas17(){
        
      
      
        DefaultTableModel tbmodel ; 

        tbmodel = (DefaultTableModel) vista.getTb17().getModel() ; 
  
        tbmodel.setNumRows(0);

     
        List<Citas> milistaci = modelo.listarCitas(vista.getLabelfecha().getText() ,vista.getLb17().getText() );
     
        Holder<Integer> i = new Holder<>(0);
        milistaci.stream().forEach( ci -> {

      tbmodel.addRow( new Object[4]);// creo una fila vacia
       //dibujar elementos de la tabla 
      // vista.getTb7am().setValueAt(ci.getCedula(), i.value, 0);
       vista.getTb17().setValueAt(ci.getNombres(), i.value, 0);
       vista.getTb17().setValueAt(ci.getHora_cita(), i.value, 1);
       vista.getTb17().setValueAt(ci.getMotivo(), i.value, 2);
        vista.getTb17().setValueAt(ci.getNombresdoc(), i.value, 3);
        
        i.value++;

      
        });
        
                
    }
     //-----------------------------------------------------------------------------------------------------------------------------
     private void  cargarcitas18(){
        
      
      
        DefaultTableModel tbmodel ; 

        tbmodel = (DefaultTableModel) vista.getTb18().getModel() ; 
  
        tbmodel.setNumRows(0);

         
        List<Citas> milistaci = modelo.listarCitas(vista.getLabelfecha().getText() ,vista.getLb18().getText() );
     
        Holder<Integer> i = new Holder<>(0);
        milistaci.stream().forEach( ci -> {

      tbmodel.addRow( new Object[7]);// creo una fila vacia
       //dibujar elementos de la tabla 
      // vista.getTb7am().setValueAt(ci.getCedula(), i.value, 0);
       vista.getTb18().setValueAt(ci.getNombres(), i.value, 0);
       vista.getTb18().setValueAt(ci.getHora_cita(), i.value, 1);
       vista.getTb18().setValueAt(ci.getMotivo(), i.value, 2);
        vista.getTb18().setValueAt(ci.getNombresdoc(), i.value, 3);
        
        i.value++;

      
        });
        
                
    }
     //-----------------------------------------------------------------------------------------------------------------------------
     private void  cargarcitas19(){
        
      
      
        DefaultTableModel tbmodel ; 

        tbmodel = (DefaultTableModel) vista.getTb19().getModel() ; 
  
        tbmodel.setNumRows(0);

        
        List<Citas> milistaci = modelo.listarCitas(vista.getLabelfecha().getText() ,vista.getLb19().getText() );
     
        Holder<Integer> i = new Holder<>(0);
        milistaci.stream().forEach( ci -> {

      tbmodel.addRow( new Object[4]);// creo una fila vacia
       //dibujar elementos de la tabla 
      // vista.getTb7am().setValueAt(ci.getCedula(), i.value, 0);
       vista.getTb19().setValueAt(ci.getNombres(), i.value, 0);
       vista.getTb19().setValueAt(ci.getHora_cita(), i.value, 1);
       vista.getTb19().setValueAt(ci.getMotivo(), i.value, 2);
        vista.getTb19().setValueAt(ci.getNombresdoc(), i.value, 3);
        
        i.value++;

      
        });
        
                
    }
     //-----------------------------------------------------------------------------------------------------------------------------
     private void  cargarcitas20(){
        
      
      
        DefaultTableModel tbmodel ; 

        tbmodel = (DefaultTableModel) vista.getTb20().getModel() ; 
  
        tbmodel.setNumRows(0);

        
        List<Citas> milistaci = modelo.listarCitas(vista.getLabelfecha().getText() ,vista.getLb20().getText() );
     
        Holder<Integer> i = new Holder<>(0);
        milistaci.stream().forEach( ci -> {

      tbmodel.addRow( new Object[4]);// creo una fila vacia
       //dibujar elementos de la tabla 
      // vista.getTb7am().setValueAt(ci.getCedula(), i.value, 0);
       vista.getTb20().setValueAt(ci.getNombres(), i.value, 0);
       vista.getTb20().setValueAt(ci.getHora_cita(), i.value, 1);
       vista.getTb20().setValueAt(ci.getMotivo(), i.value, 2);
        vista.getTb20().setValueAt(ci.getNombresdoc(), i.value, 3);
        
        i.value++;

      
        });
        
                
    }
     //-----------------------------------------------------------------------------------------------------------------------------
     private void  cargarcitas21(){
        
      
      
        DefaultTableModel tbmodel ; 

        tbmodel = (DefaultTableModel) vista.getTb21().getModel() ; 
  
        tbmodel.setNumRows(0);

        List<Citas> milistaci = modelo.listarCitas(vista.getLabelfecha().getText() ,vista.getLb21().getText() );
     
        Holder<Integer> i = new Holder<>(0);
        milistaci.stream().forEach( ci -> {

      tbmodel.addRow( new Object[7]);// creo una fila vacia
       //dibujar elementos de la tabla 
      // vista.getTb7am().setValueAt(ci.getCedula(), i.value, 0);
       vista.getTb21().setValueAt(ci.getNombres(), i.value, 0);
       vista.getTb21().setValueAt(ci.getHora_cita(), i.value, 1);
       vista.getTb21().setValueAt(ci.getMotivo(), i.value, 2);
        vista.getTb21().setValueAt(ci.getNombresdoc(), i.value, 3);
        
        i.value++;

      
        });
        
                
    }
     //-----------------------------------------------------------------------------------------------------------------------------
     private void  cargarcitas22(){
        
      
      
        DefaultTableModel tbmodel ; 

        tbmodel = (DefaultTableModel) vista.getTb22().getModel() ; 
  
        tbmodel.setNumRows(0);


        List<Citas> milistaci = modelo.listarCitas(vista.getLabelfecha().getText() ,vista.getLb22().getText() );
     
        Holder<Integer> i = new Holder<>(0);
        milistaci.stream().forEach( ci -> {

      tbmodel.addRow( new Object[7]);// creo una fila vacia
       //dibujar elementos de la tabla 
      // vista.getTb7am().setValueAt(ci.getCedula(), i.value, 0);
       vista.getTb22().setValueAt(ci.getNombres(), i.value, 0);
       vista.getTb22().setValueAt(ci.getHora_cita(), i.value, 1);
       vista.getTb22().setValueAt(ci.getMotivo(), i.value, 2);
        vista.getTb22().setValueAt(ci.getNombresdoc(), i.value, 3);
        
        i.value++;

      
        });
        
                
    }
     //-----------------------------------------------------------------------------------------------------------------------------
     
    


}
    
    
    
    
    

