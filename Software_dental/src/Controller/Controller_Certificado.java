/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.ConexionPg;
import Model.Model_Paciente;
import Model.Paciente;
import View.MenuPrincipal;
import View.View_certificado;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Saul
 */
public class Controller_Certificado {
    private Model_Paciente modelo ;
    private View_certificado vista;
    private MenuPrincipal vistamenu;

    public Controller_Certificado(Model_Paciente modelo, View_certificado vista, MenuPrincipal vistamenu) {
        this.modelo = modelo;
        this.vista = vista;
        this.vistamenu = vistamenu;
        vista.setVisible(true); 
        iniciar();
    }
     public void iniciar(){
     fecha();
     eventos();
     vista.getBtnimprimir().addActionListener(l->imprimir());
     vista.getBtncargar().addActionListener(l->cargarDatos());
     }
     private void eventos(){
     KeyListener numero=new KeyListener() {
        @Override
        public void keyTyped(KeyEvent e) {
        char num = e.getKeyChar();
        if(vista.getTxtdia().getText().length()>2) e.consume();
        if(num<'0' || num>'9') e.consume(); 
        }
        @Override
        public void keyPressed(KeyEvent e) {}
        @Override
        public void keyReleased(KeyEvent e) {}
    };
      KeyListener cel=new KeyListener() {
        @Override
        public void keyTyped(KeyEvent e) {
        char num = e.getKeyChar();
        if(vista.getTxtdia().getText().length()>15) e.consume();
        if(num<'0' || num>'9') e.consume(); 
        }
        @Override
        public void keyPressed(KeyEvent e) {}
        @Override
        public void keyReleased(KeyEvent e) {}
    };
     KeyListener anio=new KeyListener() {
        @Override
        public void keyTyped(KeyEvent e) {
        char num = e.getKeyChar();
        if(vista.getTxtdia().getText().length()>4) e.consume();
        if(num<'0' || num>'9') e.consume(); 
        }
        @Override
        public void keyPressed(KeyEvent e) {}
        @Override
        public void keyReleased(KeyEvent e) {}
    };
     KeyListener nombre=new KeyListener() {
        @Override
        public void keyTyped(KeyEvent e) {
            char car = e.getKeyChar();
        if((car<'a' || car>'z') && (car<'A' || car>'Z') && (car!=(char)KeyEvent.VK_SPACE)){
            e.consume();
            }
        }
        @Override
        public void keyPressed(KeyEvent e) {}
        @Override
        public void keyReleased(KeyEvent e) {
        String str = vista.getTxtpersona().getText();
        StringBuffer convert = new StringBuffer();
        Matcher match = Pattern.compile("([a-z])([a-z]*)", Pattern.CASE_INSENSITIVE).matcher(str);
        while(match.find()) {
         match.appendReplacement(convert, match.group(1).toUpperCase() + match.group(2).toLowerCase());
      }
      vista.getTxtpersona().setText(match.appendTail(convert).toString()); 
        }
    };
     KeyListener texto=new KeyListener() {
        @Override
        public void keyTyped(KeyEvent e) {
            char car = e.getKeyChar();
        if((car<'a' || car>'z') && (car<'A' || car>'Z') && (car!=(char)KeyEvent.VK_SPACE)){
            e.consume();
            }
        }
        @Override
        public void keyPressed(KeyEvent e) {}
        @Override
        public void keyReleased(KeyEvent e) { } };
     vista.getTxtdia().addKeyListener(numero);
     vista.getTxtmes().addKeyListener(numero);
     vista.getTxtanio().addKeyListener(anio);
     vista.getTxtpersona().addKeyListener(nombre);
     vista.getTxtoperac().addKeyListener(texto);
     vista.getTxtrecomendaciones().addKeyListener(texto);
     vista.getTxtdiasreposo().addKeyListener(numero);
     vista.getTxtcelular().addKeyListener(cel);     
     }
     
     private void imprimir(){
     ConexionPg con= new ConexionPg();
        try {
            String dia=vista.getTxtdia().getText();
            String mes=vista.getTxtmes().getText();
            String anio=vista.getTxtanio().getText();
            String dir=vista.getTxtpersona().getText();
            String nompac=vista.getTxtpaciente().getText();
            String ced=vista.getTxtcedula().getText();
            String opera=vista.getTxtoperac().getText();
            String rec=vista.getTxtrecomendaciones().getText();
            String diarep=vista.getTxtdiasreposo().getText();
            String cel=vista.getTxtcelular().getText();
            JasperReport listado = (JasperReport) JRLoader.loadObject(getClass().getResource("/Reportes/Certificado.jasper"));
            Map<String, Object> par= new HashMap<String, Object>();
            par.put("diain", dia);
            par.put("mesin", mes);
            par.put("anioin", anio);
            par.put("dirin", dir);
            par.put("nompacin", nompac);
            par.put("cedin", ced);
            par.put("operain", opera);
            par.put("recin", rec);
            par.put("diarepin", diarep);
            par.put("celin", cel);
            JasperPrint impr= JasperFillManager.fillReport(listado, par, con.Con());
            JasperViewer ver= new JasperViewer(impr, false);
            ver.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(Controller_Certificado.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
     
     private void cargarDatos(){
     String cedu=vistamenu.getLblCedulapac().getText();
     if(cedu.equals("...")){JOptionPane.showMessageDialog(vistamenu, "Debe tener cargado un paciente en la parte superior");} else{
     vista.getTxtcedula().setText(cedu);
     llenarpaciente();
     }
     }
     
     private void llenarpaciente(){
    List<Paciente> listaper=modelo.listarpacbuscar(vista.getTxtcedula().getText());
    vista.getTxtdia().requestFocus();
     for (int a = 0; a < listaper.size(); a++) {
        if (listaper.get(a).getCedula().equals(vista.getTxtcedula().getText())) {
           //vista.getTxtcedula().setText(listaper.get(a).getCedula());
           vista.getTxtpaciente().setText(listaper.get(a).getNombres()+" "+listaper.get(a).getApellidos());
        }
      }
    }
     
     private void fecha() {
        Calendar calendar = new GregorianCalendar();
        int año, mes, dia;
        año = calendar.get(Calendar.YEAR);
        mes = calendar.get(Calendar.MONTH) + 1;
        dia = calendar.get(Calendar.DATE);
        if (mes < 10) {
            vista.getTxtdia().setText(""+dia);
            vista.getTxtmes().setText("0"+ mes);
            vista.getTxtanio().setText(""+año);
        }
        if (dia < 10) {
            vista.getTxtdia().setText("0"+dia);
            vista.getTxtmes().setText(""+ mes);
            vista.getTxtanio().setText(""+año);
        }
        if (dia > 10 && mes > 10) {
            vista.getTxtdia().setText(""+dia);
            vista.getTxtmes().setText(""+ mes);
            vista.getTxtanio().setText(""+año);
        } else if (dia < 10 && mes < 10) {
            vista.getTxtdia().setText("0"+dia);
            vista.getTxtmes().setText("0"+ mes);
            vista.getTxtanio().setText(""+año);
        }

    }

}