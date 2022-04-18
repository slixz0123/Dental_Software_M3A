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
import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
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
     icono();
     vista.getBtnimprimir().addActionListener(l->imprimir());
     vista.getBtncargar().addActionListener(l->cargarDatos());
     vista.getBtnnuevo().addActionListener(l->nuevo());
         pintarbtnimprimir(vista.getBtnimprimir());
         pintarbtnnuevo(vista.getBtnnuevo());
     }
     private void icono(){
     ImageIcon imgIcon = new ImageIcon(getClass().getResource("/View/icons/17367208-E431-476A-9D1D-31B94C22615A-PhotoRoom.png"));
                   Image imgEscalada = imgIcon.getImage().getScaledInstance(vista.getLbllogo().getWidth(),
                   vista.getLbllogo().getHeight(), Image.SCALE_SMOOTH);
                   Icon iconoEscalado = new ImageIcon(imgEscalada);
                   vista.getLbllogo().setIcon(iconoEscalado);
     }
     private void eventos(){
     KeyListener dia=new KeyListener() {
        @Override
        public void keyTyped(KeyEvent e) {
        char num = e.getKeyChar();
        if(vista.getTxtdia().getText().length()>1) e.consume();
        if(num<'0' || num>'9') e.consume(); 
        }
        @Override
        public void keyPressed(KeyEvent e) {}
        @Override
        public void keyReleased(KeyEvent e) {}
    };
     
     KeyListener mes=new KeyListener() {
        @Override
        public void keyTyped(KeyEvent e) {
        char num = e.getKeyChar();
        if(vista.getTxtmes().getText().length()>1) e.consume();
        if(num<'0' || num>'9') e.consume(); 
        }
        @Override
        public void keyPressed(KeyEvent e) {}
        @Override
        public void keyReleased(KeyEvent e) {}
    };
     
     KeyListener reposo=new KeyListener() {
        @Override
        public void keyTyped(KeyEvent e) {
        char num = e.getKeyChar();
        if(vista.getTxtdiasreposo().getText().length()>1) e.consume();
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
        if(vista.getTxtdia().getText().length()>14) e.consume();
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
        if(vista.getTxtanio().getText().length()>3) e.consume();
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
     vista.getTxtdia().addKeyListener(dia);
     vista.getTxtmes().addKeyListener(mes);
     vista.getTxtanio().addKeyListener(anio);
     vista.getTxtpersona().addKeyListener(nombre);
     vista.getTxtoperac().addKeyListener(texto);
     vista.getTxtrecomendaciones().addKeyListener(texto);
     vista.getTxtdiasreposo().addKeyListener(reposo);
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
            if(ced.isEmpty()||dia.isEmpty()||mes.isEmpty()||anio.isEmpty()||rec.isEmpty()||diarep.isEmpty()||cel.isEmpty()){
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos");
            }else{
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
            ver.setVisible(true);}
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
    vista.getTxtpersona().requestFocus();
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
     
     private void nuevo(){
     vista.getTxtpersona().setText("");
     vista.getTxtpaciente().setText("");
     vista.getTxtcedula().setText("");
     vista.getTxtoperac().setText("");
     vista.getTxtrecomendaciones().setText("");
     vista.getTxtdiasreposo().setText("");
     vista.getTxtcelular().setText("");
     }

    private void pintarbtnnuevo(JButton bt){
    bt.addMouseListener(new java.awt.event.MouseAdapter() {
    @Override
    public void mouseEntered(MouseEvent e){
     vista.getBtnnuevo().setBackground(new Color (90, 10, 160));
     vista.getBtnnuevo().setForeground(Color.WHITE);
    }
    @Override
    public void mouseExited(MouseEvent e){
     vista.getBtnnuevo().setBackground(new Color (240, 240, 240));
     vista.getBtnnuevo().setForeground(Color.BLACK);
    }
    });
    }
    
    private void pintarbtnimprimir(JButton bt){
    bt.addMouseListener(new java.awt.event.MouseAdapter() {
    @Override
    public void mouseEntered(MouseEvent e){
     vista.getBtnimprimir().setBackground(new Color (90, 10, 160));
     vista.getBtnimprimir().setForeground(Color.WHITE);
    }
    @Override
    public void mouseExited(MouseEvent e){
     vista.getBtnimprimir().setBackground(new Color (240, 240, 240));
     vista.getBtnimprimir().setForeground(Color.BLACK);
    }
    });
    }
}
