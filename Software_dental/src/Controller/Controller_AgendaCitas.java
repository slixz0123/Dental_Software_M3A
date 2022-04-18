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

    }
    
    
     private void  cargarcitas7am(){
        
      
      
        DefaultTableModel tbmodel ; 

        tbmodel = (DefaultTableModel) vista.getTb7am().getModel() ; 
  
        tbmodel.setNumRows(0);

         System.out.println(vista.getLb7am().getText().subSequence(1, 5).toString());
        List<Citas> milistaci = modelo.listarCitas(vista.getLabelfecha().getText() ,vista.getLb7am().getText() );
     
        Holder<Integer> i = new Holder<>(0);
        milistaci.stream().forEach( ci -> {

      tbmodel.addRow( new Object[7]);// creo una fila vacia
       //dibujar elementos de la tabla 
      // vista.getTb7am().setValueAt(ci.getCedula(), i.value, 0);
       vista.getTb7am().setValueAt(ci.getNombres(), i.value, 0);
       vista.getTb7am().setValueAt(ci.getHora_cita(), i.value, 1);
       vista.getTb7am().setValueAt(ci.getMotivo(), i.value, 2);
        vista.getTb7am().setValueAt(ci.getNombresdoc(), i.value, 3);
        
        i.value++;

      
        });
        
                
    }

 }
    
    
    
    
    

