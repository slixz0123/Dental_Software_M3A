/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Model_AgendaCitas;
import View.Vista_AgendaCitas;
import java.awt.event.MouseEvent;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

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
            vista.getLabelfecha().setText(Integer.toString(c1.get(Calendar.DAY_OF_MONTH))+"/"+Integer.toString(c1.get(Calendar.MONTH)+1)+"/"+Integer.toString(c1.get(Calendar.YEAR)));

        }else
        JOptionPane.showMessageDialog(null, "ERROR!\nLa agenda esta personalizada para eventos futuros!");
     }
    
    public void siguientedia(){
           String fecha = vista.getLabelfecha().getText();
        String[] fechArray = fecha.split("/");
        int dia = Integer.valueOf(fechArray[0]);
        int mes = Integer.valueOf(fechArray[1]) - 1;
        int anio = Integer.valueOf(fechArray[2]);
        Calendar c1 = new GregorianCalendar(anio, mes, dia);
        c1.add(Calendar.DAY_OF_MONTH, +1);
        vista.getLabelfecha().setText(Integer.toString(c1.get(Calendar.DAY_OF_MONTH))+"/"+Integer.toString(c1.get(Calendar.MONTH)+1)+"/"+Integer.toString(c1.get(Calendar.YEAR)));

    }
}
