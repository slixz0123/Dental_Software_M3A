/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.ConexionPg;
import Model.Doctor;
import Model.Hist_Medico;
import Model.Model_HistorialMedico;
import Model.Paciente;
import View.MenuPrincipal;
import View.Vista_Crud_HistorialMedico;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.xml.ws.Holder;
import jtextfieldround.JTextFieldRound;
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
public class Controller_HistorialMedico {
    private Model_HistorialMedico modelo;
    private Vista_Crud_HistorialMedico vista;
    private MenuPrincipal vistaMenu ;
    private String accion = "guardar";
    private String cambio = "nuevo";

    public Controller_HistorialMedico(Model_HistorialMedico modelo, Vista_Crud_HistorialMedico vista, MenuPrincipal vistaMenu) {
        this.modelo = modelo;
        this.vista = vista;
        this.vistaMenu = vistaMenu;
        vista.setVisible(true);
        iniciar();
    }
    public void iniciar(){
        vista.getBtnguardar().addActionListener(l->guardarEditar_Hist());
        vista.getBtnlimpiar().addActionListener(l->limpiar());
        vista.getBtnbuscarpac().addActionListener(l->abrir_dialog(1));
        vista.getBtnbuscarmed().addActionListener(l->abrir_dialog(2));
        vista.getBtncargardatmenu().addActionListener(l->cargardesdeMenu());
        vista.getBtnimprimir().addActionListener(l->imprimir());
        evtcalendario(vista.getCalendariobuscar());
        buscarMedico();
        buscarPaciente();
        eventos();
        eventotblmed(vista.getTbldoctor());
        eventotblpac(vista.getTblpaciente());
        eventocargar(vista.getTablahistorial());
        pintarbtnguardar(vista.getBtnguardar());
        pintarbtnimprimir(vista.getBtnimprimir());
        pintarbtnmed(vista.getBtnbuscarmed());
        pintarbtnpac(vista.getBtnbuscarpac());
        pintarbtnnuevo(vista.getBtnlimpiar());

    }
    //
    private void pintarbtnpac(JButton bt){
    bt.addMouseListener(new java.awt.event.MouseAdapter() {
    @Override
    public void mouseEntered(MouseEvent e){
     vista.getBtnbuscarpac().setBackground(new Color (90, 10, 160));
     vista.getBtnbuscarpac().setForeground(Color.WHITE);
    }
    @Override
    public void mouseExited(MouseEvent e){
     vista.getBtnbuscarpac().setBackground(new Color (240, 240, 240));
     vista.getBtnbuscarpac().setForeground(Color.BLACK);
    }
    });
    }
    //
    private void pintarbtnmed(JButton bt){
    bt.addMouseListener(new java.awt.event.MouseAdapter() {
    @Override
    public void mouseEntered(MouseEvent e){
     vista.getBtnbuscarmed().setBackground(new Color (3, 100, 80));
     vista.getBtnbuscarmed().setForeground(Color.WHITE);
    }
    @Override
    public void mouseExited(MouseEvent e){
     vista.getBtnbuscarmed().setBackground(new Color (240, 240, 240));
     vista.getBtnbuscarmed().setForeground(Color.BLACK);
    }
    });
    }
    //
    private void pintarbtnguardar(JButton bt){
    bt.addMouseListener(new java.awt.event.MouseAdapter() {
    @Override
    public void mouseEntered(MouseEvent e){
     vista.getBtnguardar().setBackground(new Color (3, 100, 80));
     vista.getBtnguardar().setForeground(Color.WHITE);
    }
    @Override
    public void mouseExited(MouseEvent e){
     vista.getBtnguardar().setBackground(new Color (240, 240, 240));
     vista.getBtnguardar().setForeground(Color.BLACK);
    }
    });
    }
    //
    private void pintarbtnnuevo(JButton bt){
    bt.addMouseListener(new java.awt.event.MouseAdapter() {
    @Override
    public void mouseEntered(MouseEvent e){
     vista.getBtnlimpiar().setBackground(new Color (3, 100, 80));
     vista.getBtnlimpiar().setForeground(Color.WHITE);
    }
    @Override
    public void mouseExited(MouseEvent e){
     vista.getBtnlimpiar().setBackground(new Color (240, 240, 240));
     vista.getBtnlimpiar().setForeground(Color.BLACK);
    }
    });
    }
    //
    private void pintarbtnimprimir(JButton bt){
    bt.addMouseListener(new java.awt.event.MouseAdapter() {
    @Override
    public void mouseEntered(MouseEvent e){
     vista.getBtnimprimir().setBackground(new Color (3, 100, 80));
     vista.getBtnimprimir().setForeground(Color.WHITE);
    }
    @Override
    public void mouseExited(MouseEvent e){
     vista.getBtnimprimir().setBackground(new Color (240, 240, 240));
     vista.getBtnimprimir().setForeground(Color.BLACK);
    }
    });
    }

    //
    private void evtcalendario(Container container){

   for (Component component:container.getComponents()){
     if (component instanceof Container)
        evtcalendario((Container) component); 
   }

   container.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            cargartablahistorial();
        }
    });

}
    //Abrir dialog
    private void abrir_dialog(int op){
        if(op==1){
      vista.getDialog_pac().setVisible(true);
      vista.getDialog_pac().setTitle("Buscar paciente");
      vista.getDialog_pac().setLocationRelativeTo(null);
      vista.getDialog_pac().setSize(550, 350);
        } else if(op==2){
        vista.getDialog_doc().setVisible(true);
        vista.getDialog_doc().setLocationRelativeTo(null);
        vista.getDialog_doc().setTitle("Buscar medico");
        vista.getDialog_doc().setSize(550, 350);
        }
     }
    //
    private void cargartablahistorial(){
    vista.getBtnlimpiar().setText("Nuevo");
    cambio="nuevo";
    DefaultTableModel tblModel;
    tblModel=(DefaultTableModel)vista.getTablahistorial().getModel();
    tblModel.setNumRows(0);
    if(vista.getCalendariobuscar().getDate()!=null){
    SimpleDateFormat fechacon = new SimpleDateFormat("yyyy-MM-dd");
    String fecha = fechacon.format(vista.getCalendariobuscar().getDate());
    List<Hist_Medico> listap= modelo.listarbuscarhist(fecha,modelo.idPac(vista.getTxtcedulapac().getText()));
    Holder<Integer> i = new Holder<>(0);

    listap.stream().forEach(pe->{
    tblModel.addRow(new Object[3]);   
    vista.getTablahistorial().setValueAt(pe.getId_his_med(), i.value, 0);
    vista.getTablahistorial().setValueAt(pe.getFecha_his(), i.value, 1);
    vista.getTablahistorial().setValueAt(pe.getHora_his(), i.value, 2);
    i.value++;
    });
    } else {
    List<Hist_Medico> listap= modelo.listarbuscarhist("",modelo.idPac(vista.getTxtcedulapac().getText()));
    Holder<Integer> i = new Holder<>(0);

    listap.stream().forEach(pe->{
    tblModel.addRow(new Object[3]);   
    vista.getTablahistorial().setValueAt(pe.getId_his_med(), i.value, 0);
    vista.getTablahistorial().setValueAt(pe.getFecha_his(), i.value, 1);
    vista.getTablahistorial().setValueAt(pe.getHora_his(), i.value, 2);
    i.value++;
    });
    }
    }
    //guardar historial medico
    private void guardarEditar_Hist(){
    Model_HistorialMedico crear_his= new Model_HistorialMedico();
    crear_his.setId_his_med(id_his_med());
    crear_his.setId_medico_his(modelo.idMed(vista.getTxtcedulamed().getText()));
    crear_his.setId_paciente_his(modelo.idPac(vista.getTxtcedulapac().getText()));
    crear_his.setEnfermedad_act(vista.getTxtenfermedad().getText());
    crear_his.setAnt_fam(vista.getTxtantecedentes().getText());
    crear_his.setTrat_med(vista.getTxttratamiento().getText());
    crear_his.setAler_med(vista.getTxtalergia().getText());
    crear_his.setMed_hab(vista.getTxtmedicamento().getText());
    crear_his.setFum_b(vista.getTxtfumbebe().getText());
    crear_his.setPro_card(vista.getTxtproblemascar().getText());
    crear_his.setUlc_gas(vista.getTxtulcera().getText());
    crear_his.setPresion(vista.getTxtpresion().getText());
    crear_his.setHepat(vista.getTxthepatitis().getText());
    crear_his.setDiabetes(vista.getTxtdiabetes().getText());
    crear_his.setEpilepsia(vista.getTxtepilepsia().getText());
    crear_his.setDo_cab(vista.getTxtdolorescab().getText());
    crear_his.setAl_endo(vista.getTxtaltend().getText());
    crear_his.setVih(vista.getTxtvih().getText());
    crear_his.setPro_coagu(vista.getTxtprobcoag().getText());
    crear_his.setFre_res(vista.getTxtfrecres().getText());
    crear_his.setFre_car(vista.getTxtfreccar().getText());
    crear_his.setPre_art(vista.getTxtpresart().getText());
    crear_his.setTem(vista.getTxttemp().getText());
    crear_his.setOxim(vista.getTxtoxi().getText());
    crear_his.setFecha_his(fecha_his_Med());
    crear_his.setHora_his(hora_His_Med());
    if(accion.equals("guardar")){  
    if(crear_his.crearHistorial_med()){
        JOptionPane.showMessageDialog(null, "Datos guardados con exito");
        accion="editar";
        cambio="limpio";
        vista.getBtnlimpiar().setText("Limpiar");
        vista.getBtnguardar().setText("Editar");
        limpiar();
        cargartablahistorial();
        } else {JOptionPane.showMessageDialog(null, "No se pudo guardar");
      }
     } else if(accion.equals("editar")){
         actualizar_hist();
         cargartablahistorial();
     }
    }
    //
     //Actualizar historial medico
    private void actualizar_hist(){
    Model_HistorialMedico act_his= new Model_HistorialMedico();
    int filasel = vista.getTablahistorial().getSelectedRow();
    String id=(String) vista.getTablahistorial().getValueAt(filasel, 0);
    act_his.setId_his_med(id);
    act_his.setId_medico_his(modelo.idMed(vista.getTxtcedulamed().getText()));
    act_his.setId_paciente_his(modelo.idPac(vista.getTxtcedulapac().getText()));
    act_his.setEnfermedad_act(vista.getTxtenfermedad().getText());
    act_his.setAnt_fam(vista.getTxtantecedentes().getText());
    act_his.setTrat_med(vista.getTxttratamiento().getText());
    act_his.setAler_med(vista.getTxtalergia().getText());
    act_his.setMed_hab(vista.getTxtmedicamento().getText());
    act_his.setFum_b(vista.getTxtfumbebe().getText());
    act_his.setPro_card(vista.getTxtproblemascar().getText());
    act_his.setUlc_gas(vista.getTxtulcera().getText());
    act_his.setPresion(vista.getTxtpresion().getText());
    act_his.setHepat(vista.getTxthepatitis().getText());
    act_his.setDiabetes(vista.getTxtdiabetes().getText());
    act_his.setEpilepsia(vista.getTxtepilepsia().getText());
    act_his.setDo_cab(vista.getTxtdolorescab().getText());
    act_his.setAl_endo(vista.getTxtaltend().getText());
    act_his.setVih(vista.getTxtvih().getText());
    act_his.setPro_coagu(vista.getTxtprobcoag().getText());
    act_his.setFre_res(vista.getTxtfrecres().getText());
    act_his.setFre_car(vista.getTxtfreccar().getText());
    act_his.setPre_art(vista.getTxtpresart().getText());
    act_his.setTem(vista.getTxttemp().getText());
    act_his.setOxim(vista.getTxtoxi().getText());
    act_his.setFecha_his(fecha_his_Med());
    act_his.setHora_his(hora_His_Med());
    if(act_his.actualizarHistorial_med()){
        JOptionPane.showMessageDialog(null, "Datos actualizados con exito");
        accion="guardar";
        vista.getBtnguardar().setText("Guardar");
        vista.getBtnlimpiar().setText("Nuevo");
        cambio="nuevo";
        limpiar();
        } else {
        JOptionPane.showMessageDialog(null, "No se pudo actualizar");
      }
    }
    //Eventos
    private void eventos(){
    
    KeyListener buscarpac=new KeyListener() {
        @Override
        public void keyTyped(KeyEvent e) {
        if(vista.getTxtbuscarpac().getText().length()>30) e.consume();
        }
        
        @Override
        public void keyPressed(KeyEvent e) {}

        @Override
        public void keyReleased(KeyEvent e) {
            buscarPaciente();
        }
    };
    KeyListener buscarmed=new KeyListener() {
        @Override
        public void keyTyped(KeyEvent e) {
        if(vista.getTxtbuscardoc().getText().length()>30) e.consume();
        }

        @Override
        public void keyPressed(KeyEvent e) {}

        @Override
        public void keyReleased(KeyEvent e) {
         buscarMedico();
        }
    };
    eventoenfer(vista.getTxtenfermedad());
    eventoante(vista.getTxtantecedentes());
    eventotrat(vista.getTxttratamiento());
    eventoaler(vista.getTxtalergia());
    eventomedicamento(vista.getTxtmedicamento());
    eventofuma(vista.getTxtfumbebe());
    eventoprobcar(vista.getTxtproblemascar());
    eventoulc(vista.getTxtulcera());
    eventopresion(vista.getTxtpresion());
    eventohepat(vista.getTxthepatitis());
    eventodiab(vista.getTxtdiabetes());
    eventoepi(vista.getTxtepilepsia());
    eventodolcab(vista.getTxtdolorescab());
    eventoalteend(vista.getTxtaltend());
    eventovih(vista.getTxtvih());
    eventoprocoag(vista.getTxtprobcoag());
    eventofrecres(vista.getTxtfrecres());
    eventofreccar(vista.getTxtfreccar());
    eventopresart(vista.getTxtpresart());
    eventotemp(vista.getTxttemp());
    eventooxi(vista.getTxtoxi());
    vista.getTxtbuscarpac().addKeyListener(buscarpac);
    vista.getTxtbuscardoc().addKeyListener(buscarmed);
    }
    //
    //Eventos teclas
    private void eventoenfer(JTextFieldRound txt){
    txt.addKeyListener(new KeyAdapter() {
        @Override
        public void keyPressed(KeyEvent e) {
            if(e.getKeyCode()== KeyEvent.VK_DOWN || e.getKeyCode()== KeyEvent.VK_ENTER){
               vista.getTxtantecedentes().requestFocus();}
           if(vista.getTxtenfermedad().getText().equals("")){
            if(e.getKeyCode()== KeyEvent.VK_LEFT ){
               vista.getTxtfrecres().requestFocus();}}
        }
        @Override
        public void keyTyped(KeyEvent e) {
            if(vista.getTxtenfermedad().getText().length()>=500) e.consume();
            char car = e.getKeyChar();
            if((car<'a' || car>'z') && (car<'A' || car>'Z') && (car!=(char)KeyEvent.VK_SPACE)){
            e.consume();
            }
        }
    });}
    private void eventoante(JTextFieldRound txt){
    txt.addKeyListener(new KeyAdapter() {
        @Override
        public void keyPressed(KeyEvent e) {
            
            if(e.getKeyCode()== KeyEvent.VK_DOWN || e.getKeyCode()== KeyEvent.VK_ENTER){
               vista.getTxttratamiento().requestFocus();}
            if(vista.getTxtantecedentes().getText().equals("")){
            if(e.getKeyCode()== KeyEvent.VK_LEFT ){
               vista.getTxtfrecres().requestFocus();}}
            if(e.getKeyCode()== KeyEvent.VK_UP ){
               vista.getTxtenfermedad().requestFocus();}
        }
         @Override
        public void keyTyped(KeyEvent e) {
            if(vista.getTxtantecedentes().getText().length()>=500) e.consume();
            char car = e.getKeyChar();
            if((car<'a' || car>'z') && (car<'A' || car>'Z') && (car!=(char)KeyEvent.VK_SPACE)){
            e.consume();
            }
        }
    });}
    private void eventotrat(JTextFieldRound txt){
    txt.addKeyListener(new KeyAdapter() {
        @Override
        public void keyPressed(KeyEvent e) {
            if(e.getKeyCode()== KeyEvent.VK_DOWN || e.getKeyCode()== KeyEvent.VK_ENTER){
               vista.getTxtalergia().requestFocus();}
            if(vista.getTxttratamiento().getText().equals("")){
            if(e.getKeyCode()== KeyEvent.VK_LEFT ){
               vista.getTxtfrecres().requestFocus();}}
            if(e.getKeyCode()== KeyEvent.VK_UP ){
               vista.getTxtantecedentes().requestFocus();}
        }
         @Override
        public void keyTyped(KeyEvent e) {
            if(vista.getTxttratamiento().getText().length()>=500) e.consume();
            char car = e.getKeyChar();
            if((car<'a' || car>'z') && (car<'A' || car>'Z') && (car!=(char)KeyEvent.VK_SPACE)){
            e.consume();
            }
        }
    });}
    private void eventoaler(JTextFieldRound txt){
    txt.addKeyListener(new KeyAdapter() {
        @Override
        public void keyPressed(KeyEvent e) {
            if(e.getKeyCode()== KeyEvent.VK_DOWN || e.getKeyCode()== KeyEvent.VK_ENTER){
               vista.getTxtmedicamento().requestFocus();}
            if(vista.getTxtalergia().getText().equals("")){
            if(e.getKeyCode()== KeyEvent.VK_LEFT ){
               vista.getTxtfrecres().requestFocus();}}
            if(e.getKeyCode()== KeyEvent.VK_UP ){
               vista.getTxttratamiento().requestFocus();}
        }
         @Override
        public void keyTyped(KeyEvent e) {
            if(vista.getTxtalergia().getText().length()>=500) e.consume();
            char car = e.getKeyChar();
            if((car<'a' || car>'z') && (car<'A' || car>'Z') && (car!=(char)KeyEvent.VK_SPACE)){
            e.consume();
            }
        }
    });}
    private void eventomedicamento(JTextFieldRound txt){
    txt.addKeyListener(new KeyAdapter() {
        @Override
        public void keyPressed(KeyEvent e) {
            if(e.getKeyCode()== KeyEvent.VK_DOWN || e.getKeyCode()== KeyEvent.VK_ENTER){
               vista.getTxtfumbebe().requestFocus();}
            if(vista.getTxtmedicamento().getText().equals("")){
            if(e.getKeyCode()== KeyEvent.VK_LEFT ){
               vista.getTxtfrecres().requestFocus();}}
            if(e.getKeyCode()== KeyEvent.VK_UP ){
               vista.getTxtalergia().requestFocus();}
        }
         @Override
        public void keyTyped(KeyEvent e) {
            if(vista.getTxtmedicamento().getText().length()>=500) e.consume();
        }
    });}
    private void eventofuma(JTextFieldRound txt){
    txt.addKeyListener(new KeyAdapter() {
        @Override
        public void keyPressed(KeyEvent e) {
            if(e.getKeyCode()== KeyEvent.VK_DOWN || e.getKeyCode()== KeyEvent.VK_ENTER){
               vista.getTxtproblemascar().requestFocus();}
            if(vista.getTxtfumbebe().getText().equals("")){
            if(e.getKeyCode()== KeyEvent.VK_LEFT ){
               vista.getTxtfrecres().requestFocus();}}
            if(e.getKeyCode()== KeyEvent.VK_UP ){
               vista.getTxtmedicamento().requestFocus();}
        }
         @Override
        public void keyTyped(KeyEvent e) {
            if(vista.getTxtfumbebe().getText().length()>=50) e.consume();
            char car = e.getKeyChar();
            if((car<'a' || car>'z') && (car<'A' || car>'Z') && (car!=(char)KeyEvent.VK_SPACE)){
            e.consume();
            }
        }
    });}
    private void eventoprobcar(JTextFieldRound txt){
    txt.addKeyListener(new KeyAdapter() {
        @Override
        public void keyPressed(KeyEvent e) {
            if(e.getKeyCode()== KeyEvent.VK_DOWN || e.getKeyCode()== KeyEvent.VK_ENTER){
               vista.getTxtulcera().requestFocus();}
            if(vista.getTxtproblemascar().getText().equals("")){
            if(e.getKeyCode()== KeyEvent.VK_LEFT ){
               vista.getTxtfrecres().requestFocus();}}
            if(e.getKeyCode()== KeyEvent.VK_UP ){
               vista.getTxtfumbebe().requestFocus();}
        }
         @Override
        public void keyTyped(KeyEvent e) {
            if(vista.getTxtproblemascar().getText().length()>=150) e.consume();
        }
    });}
    private void eventoulc(JTextFieldRound txt){
    txt.addKeyListener(new KeyAdapter() {
        @Override
        public void keyPressed(KeyEvent e) {
            if(e.getKeyCode()== KeyEvent.VK_DOWN || e.getKeyCode()== KeyEvent.VK_ENTER){
               vista.getTxtpresion().requestFocus();}
            if(vista.getTxtulcera().getText().equals("")){
            if(e.getKeyCode()== KeyEvent.VK_LEFT ){
               vista.getTxtfrecres().requestFocus();}}
            if(e.getKeyCode()== KeyEvent.VK_UP ){
               vista.getTxtproblemascar().requestFocus();}
        }
         @Override
        public void keyTyped(KeyEvent e) {
            if(vista.getTxtulcera().getText().length()>=150) e.consume();
        }
    });}
    private void eventopresion(JTextFieldRound txt){
    txt.addKeyListener(new KeyAdapter() {
        @Override
        public void keyPressed(KeyEvent e) {
            if(e.getKeyCode()== KeyEvent.VK_DOWN || e.getKeyCode()== KeyEvent.VK_ENTER){
               vista.getTxthepatitis().requestFocus();}
            if(vista.getTxtpresion().getText().equals("")){
            if(e.getKeyCode()== KeyEvent.VK_LEFT ){
               vista.getTxtfrecres().requestFocus();}}
            if(e.getKeyCode()== KeyEvent.VK_UP ){
               vista.getTxtulcera().requestFocus();}
        }
         @Override
        public void keyTyped(KeyEvent e) {
            if(vista.getTxtpresion().getText().length()>=50) e.consume();
        }
    });}
    private void eventohepat(JTextFieldRound txt){
    txt.addKeyListener(new KeyAdapter() {
        @Override
        public void keyPressed(KeyEvent e) {
            if(e.getKeyCode()== KeyEvent.VK_DOWN || e.getKeyCode()== KeyEvent.VK_ENTER){
               vista.getTxtdiabetes().requestFocus();}
            if(vista.getTxthepatitis().getText().equals("")){
            if(e.getKeyCode()== KeyEvent.VK_LEFT ){
               vista.getTxtfrecres().requestFocus();}}
            if(e.getKeyCode()== KeyEvent.VK_UP ){
               vista.getTxtpresion().requestFocus();}
        }
         @Override
        public void keyTyped(KeyEvent e) {
            if(vista.getTxthepatitis().getText().length()>=50) e.consume();
            char car = e.getKeyChar();
            if((car<'a' || car>'z') && (car<'A' || car>'Z') && (car!=(char)KeyEvent.VK_SPACE)){
            e.consume();
            }
        }
    });}
    private void eventodiab(JTextFieldRound txt){
    txt.addKeyListener(new KeyAdapter() {
        @Override
        public void keyPressed(KeyEvent e) {
            if(e.getKeyCode()== KeyEvent.VK_DOWN || e.getKeyCode()== KeyEvent.VK_ENTER){
               vista.getTxtepilepsia().requestFocus();}
            if(vista.getTxtdiabetes().getText().equals("")){
            if(e.getKeyCode()== KeyEvent.VK_LEFT ){
               vista.getTxtfrecres().requestFocus();}}
            if(e.getKeyCode()== KeyEvent.VK_UP ){
               vista.getTxthepatitis().requestFocus();}
        }
         @Override
        public void keyTyped(KeyEvent e) {
            if(vista.getTxtdiabetes().getText().length()>=50) e.consume();
            char car = e.getKeyChar();
            if((car<'a' || car>'z') && (car<'A' || car>'Z') && (car!=(char)KeyEvent.VK_SPACE)){
            e.consume();
            }
        }
    });}
    private void eventoepi(JTextFieldRound txt){
    txt.addKeyListener(new KeyAdapter() {
        @Override
        public void keyPressed(KeyEvent e) {
            if(e.getKeyCode()== KeyEvent.VK_DOWN || e.getKeyCode()== KeyEvent.VK_ENTER){
               vista.getTxtdolorescab().requestFocus();}
            if(vista.getTxtepilepsia().getText().equals("")){
            if(e.getKeyCode()== KeyEvent.VK_LEFT ){
               vista.getTxtfrecres().requestFocus();}}
            if(e.getKeyCode()== KeyEvent.VK_UP ){
               vista.getTxtdiabetes().requestFocus();}
        }
         @Override
        public void keyTyped(KeyEvent e) {
            if(vista.getTxtepilepsia().getText().length()>=50) e.consume();
            char car = e.getKeyChar();
            if((car<'a' || car>'z') && (car<'A' || car>'Z') && (car!=(char)KeyEvent.VK_SPACE)){
            e.consume();
            }
        }
    });}
    private void eventodolcab(JTextFieldRound txt){
    txt.addKeyListener(new KeyAdapter() {
        @Override
        public void keyPressed(KeyEvent e) {
            if(e.getKeyCode()== KeyEvent.VK_DOWN || e.getKeyCode()== KeyEvent.VK_ENTER){
               vista.getTxtaltend().requestFocus();}
            if(vista.getTxtdolorescab().getText().equals("")){
            if(e.getKeyCode()== KeyEvent.VK_LEFT){
               vista.getTxtfrecres().requestFocus();}}
            if(e.getKeyCode()== KeyEvent.VK_UP ){
               vista.getTxtepilepsia().requestFocus();}
        }
         @Override
        public void keyTyped(KeyEvent e) {
            if(vista.getTxtdolorescab().getText().length()>=50) e.consume();
            char car = e.getKeyChar();
            if((car<'a' || car>'z') && (car<'A' || car>'Z') && (car!=(char)KeyEvent.VK_SPACE)){
            e.consume();
            }
        }
    });}
    private void eventoalteend(JTextFieldRound txt){
    txt.addKeyListener(new KeyAdapter() {
        @Override
        public void keyPressed(KeyEvent e) {
            if(e.getKeyCode()== KeyEvent.VK_DOWN || e.getKeyCode()== KeyEvent.VK_ENTER){
               vista.getTxtvih().requestFocus();}
            if(vista.getTxtaltend().getText().equals("")){
            if(e.getKeyCode()== KeyEvent.VK_LEFT ){
               vista.getTxtfrecres().requestFocus();}}
            if(e.getKeyCode()== KeyEvent.VK_UP ){
               vista.getTxtdolorescab().requestFocus();}
        }
         @Override
        public void keyTyped(KeyEvent e) {
            if(vista.getTxtaltend().getText().length()>=100) e.consume();
        }
    });}
    private void eventovih(JTextFieldRound txt){
    txt.addKeyListener(new KeyAdapter() {
        @Override
        public void keyPressed(KeyEvent e) {
            if(e.getKeyCode()== KeyEvent.VK_DOWN || e.getKeyCode()== KeyEvent.VK_ENTER){
               vista.getTxtprobcoag().requestFocus();}
            if(vista.getTxtvih().getText().equals("")){
            if(e.getKeyCode()== KeyEvent.VK_LEFT ){
               vista.getTxtfrecres().requestFocus();}}
            if(e.getKeyCode()== KeyEvent.VK_UP ){
               vista.getTxtaltend().requestFocus();}
        }
         @Override
        public void keyTyped(KeyEvent e) {
            if(vista.getTxtvih().getText().length()>=50) e.consume();
        }
    });}
    private void eventoprocoag(JTextFieldRound txt){
    txt.addKeyListener(new KeyAdapter() {
        @Override
        public void keyPressed(KeyEvent e) {
            if(e.getKeyCode()== KeyEvent.VK_DOWN || e.getKeyCode()== KeyEvent.VK_ENTER){
               vista.getTxtfrecres().requestFocus();}
            if(vista.getTxtproblemascar().getText().equals("")){
            if(e.getKeyCode()== KeyEvent.VK_LEFT ){
               vista.getTxtfrecres().requestFocus();}}
            if(e.getKeyCode()== KeyEvent.VK_UP ){
               vista.getTxtvih().requestFocus();}
        }
         @Override
        public void keyTyped(KeyEvent e) {
            if(vista.getTxtprobcoag().getText().length()>=100) e.consume();
        }
    });}
    private void eventofrecres(JTextFieldRound txt){
    txt.addKeyListener(new KeyAdapter() {
        @Override
        public void keyPressed(KeyEvent e) {
            if(vista.getTxtfreccar().getText().equals("")){
            if(e.getKeyCode()== KeyEvent.VK_RIGHT ){
               vista.getTxtfreccar().requestFocus();}}
            if(e.getKeyCode()== KeyEvent.VK_UP ){
               vista.getTxtprobcoag().requestFocus();}
        }
         @Override
        public void keyTyped(KeyEvent e) {
            if(vista.getTxtfrecres().getText().length()>=50) e.consume();
        }
    });}
    private void eventofreccar(JTextFieldRound txt){
    txt.addKeyListener(new KeyAdapter() {
        @Override
        public void keyPressed(KeyEvent e) {
            if(e.getKeyCode()== KeyEvent.VK_LEFT ){
               vista.getTxtfrecres().requestFocus();}
            if(e.getKeyCode()== KeyEvent.VK_RIGHT ){
               vista.getTxtpresart().requestFocus();}
            if(e.getKeyCode()== KeyEvent.VK_UP ){
               vista.getTxtprobcoag().requestFocus();}
        }
                 @Override
        public void keyTyped(KeyEvent e) {
            if(vista.getTxtfreccar().getText().length()>=50) e.consume();
        }
    });}
    private void eventopresart(JTextFieldRound txt){
    txt.addKeyListener(new KeyAdapter() {
        @Override
        public void keyPressed(KeyEvent e) {
            if(e.getKeyCode()== KeyEvent.VK_LEFT ){
               vista.getTxtfreccar().requestFocus();}
            if(e.getKeyCode()== KeyEvent.VK_RIGHT ){
               vista.getTxttemp().requestFocus();}
            if(e.getKeyCode()== KeyEvent.VK_UP ){
               vista.getTxtprobcoag().requestFocus();}
        }
                 @Override
        public void keyTyped(KeyEvent e) {
            if(vista.getTxtpresart().getText().length()>=50) e.consume();
        }
    });}
    private void eventotemp(JTextFieldRound txt){
    txt.addKeyListener(new KeyAdapter() {
        @Override
        public void keyPressed(KeyEvent e) {
            if(e.getKeyCode()== KeyEvent.VK_LEFT ){
               vista.getTxtpresart().requestFocus();}
            if(e.getKeyCode()== KeyEvent.VK_RIGHT ){
               vista.getTxtoxi().requestFocus();}
            if(e.getKeyCode()== KeyEvent.VK_UP ){
               vista.getTxtprobcoag().requestFocus();}
        }
                 @Override
        public void keyTyped(KeyEvent e) {
            if(vista.getTxttemp().getText().length()>=50) e.consume();
        }
    });}
    private void eventooxi(JTextFieldRound txt){
    txt.addKeyListener(new KeyAdapter() {
        @Override
        public void keyPressed(KeyEvent e) {
            if(e.getKeyCode()== KeyEvent.VK_LEFT ){
               vista.getTxttemp().requestFocus();}
            if(e.getKeyCode()== KeyEvent.VK_UP ){
               vista.getTxtprobcoag().requestFocus();}
        }
                 @Override
        public void keyTyped(KeyEvent e) {
            if(vista.getTxtoxi().getText().length()>=50) e.consume();
        }
    });}
    //eventos tabla
    private void eventotblmed(JTable tbl){
    tbl.addMouseListener(new java.awt.event.MouseAdapter() {
    @Override
    public void mouseClicked(MouseEvent e){
        cargardatosmed(e);
        vista.getBtnlimpiar().setText("Limpiar");
        cambio="limpio";
    }
    });
    }  
//
    private void eventocargar(JTable tbl){
    tbl.addMouseListener(new java.awt.event.MouseAdapter() {
    @Override
    public void mouseClicked(MouseEvent e){
        llenardatoshistorial(e);
    }
    });
    } 
    //
    private void eventotblpac(JTable tbl2){
    tbl2.addMouseListener(new java.awt.event.MouseAdapter() {
    @Override
    public void mouseClicked(MouseEvent e){
        cargardatospaciente(e);
    }
    });
    }
    //Buscar paciente
    private void buscarPaciente(){
    DefaultTableModel tblModel;
    tblModel=(DefaultTableModel)vista.getTblpaciente().getModel();
    tblModel.setNumRows(0);
    List<Paciente> listap= modelo.listarPacientes(vista.getTxtbuscarpac().getText());
    Holder<Integer> i = new Holder<>(0);

    listap.stream().forEach(pe->{
    tblModel.addRow(new Object[6]);   
    vista.getTblpaciente().setValueAt(pe.getCedula(), i.value, 0);
    vista.getTblpaciente().setValueAt(pe.getNombres(), i.value, 1);
    vista.getTblpaciente().setValueAt(pe.getApellidos(), i.value, 2);
    vista.getTblpaciente().setValueAt(pe.getDireccion(), i.value, 3);
    vista.getTblpaciente().setValueAt(pe.getCorreo(), i.value, 4);
    vista.getTblpaciente().setValueAt(pe.getTelefono(), i.value, 5);
    i.value++;
    });
    }
    //
     //
    private void buscarMedico(){
    DefaultTableModel tblModel;
    tblModel=(DefaultTableModel)vista.getTbldoctor().getModel();
    tblModel.setNumRows(0);
    List<Doctor> listamed= modelo.listarMedico(vista.getTxtbuscardoc().getText());
    Holder<Integer> i = new Holder<>(0);

    listamed.stream().forEach(pe->{
    tblModel.addRow(new Object[6]);   
    vista.getTbldoctor().setValueAt(pe.getCedula(), i.value, 0);
    vista.getTbldoctor().setValueAt(pe.getNombres(), i.value, 1);
    vista.getTbldoctor().setValueAt(pe.getApellidos(), i.value, 2);
    vista.getTbldoctor().setValueAt(pe.getDireccion(), i.value, 3);
    vista.getTbldoctor().setValueAt(pe.getEspecialidad(), i.value, 4);
    vista.getTbldoctor().setValueAt(pe.getTelefono(), i.value, 5);
    i.value++;
    });
    }
    //Llenar datos paciente
    private void cargardatospaciente(java.awt.event.MouseEvent e){
        int filasel = vista.getTblpaciente().getSelectedRow();
        String ced_pac=(String) vista.getTblpaciente().getValueAt(filasel, 0);
        List<Paciente> listaper=modelo.listarPacientes(ced_pac);
        vista.getTxtenfermedad().requestFocus();
        for (int a = 0; a < listaper.size(); a++) {
        if (listaper.get(a).getCedula().equals(ced_pac)) {
           vista.getTxtcedulapac().setText(listaper.get(a).getCedula());
           vista.getTxtnombrespac().setText(listaper.get(a).getNombres());
           vista.getTxtapellidospac().setText(listaper.get(a).getApellidos());
           if(listaper.get(a).getGenero().equalsIgnoreCase("M")){
           vista.getTxtgeneropac().setText("Masculino");
           } else {
               vista.getTxtgeneropac().setText("Femenino");
           }
           vista.getTxtdireccionpac().setText(listaper.get(a).getDireccion());
           vista.getTxttelefonopac().setText(listaper.get(a).getTelefono());
           vista.getTxtcorreopac().setText(listaper.get(a).getCorreo());
           vista.getTxtprovinciapac().setText(listaper.get(a).getProvincia());
           vista.getTxtciudadpac().setText(listaper.get(a).getCiudad());
           vista.getCalendario().setDate(listaper.get(a).getFecha_nac());
           cargartablahistorial();
        }
      }
    }
    //
    //Llenar datos paciente
    private void llenardatoshistorial(java.awt.event.MouseEvent e){
        int filasel = vista.getTablahistorial().getSelectedRow();
        String id=(String) vista.getTablahistorial().getValueAt(filasel, 0);
        vista.getId_his().setText(id);
        java.sql.Date fecha=(Date) vista.getTablahistorial().getValueAt(filasel, 1);
        SimpleDateFormat fechacon = new SimpleDateFormat("yyyy-MM-dd");
        String fecha1 = fechacon.format(fecha);
        List<Hist_Medico> list_h=modelo.listarbuscarhisttabla(fecha1, id);
        for (int a = 0; a < list_h.size(); a++) {
        if (list_h.get(a).getId_his_med().equals(id)) {
           vista.getTxtcedulamed().setText(modelo.cedulaMed(id));
           vista.getTxtcedulapac().setText(modelo.cedulaPac(id));
           vista.getTxtenfermedad().setText(list_h.get(a).getEnfermedad_act());
           vista.getTxtantecedentes().setText(list_h.get(a).getAnt_fam());
           vista.getTxttratamiento().setText(list_h.get(a).getTrat_med());
           vista.getTxtalergia().setText(list_h.get(a).getAler_med());
           vista.getTxtmedicamento().setText(list_h.get(a).getMed_hab());
           vista.getTxtfumbebe().setText(list_h.get(a).getFum_b());
           vista.getTxtproblemascar().setText(list_h.get(a).getPro_card());
           vista.getTxtulcera().setText(list_h.get(a).getUlc_gas());
           vista.getTxtpresion().setText(list_h.get(a).getPresion());
           vista.getTxthepatitis().setText(list_h.get(a).getHepat());
           vista.getTxtdiabetes().setText(list_h.get(a).getDiabetes());
           vista.getTxtepilepsia().setText(list_h.get(a).getEpilepsia());
           vista.getTxtdolorescab().setText(list_h.get(a).getDo_cab());
           vista.getTxtaltend().setText(list_h.get(a).getAl_endo());
           vista.getTxtvih().setText(list_h.get(a).getVih());
           vista.getTxtprobcoag().setText(list_h.get(a).getPro_coagu());
           vista.getTxtfrecres().setText(list_h.get(a).getFre_res());
           vista.getTxtfreccar().setText(list_h.get(a).getFre_car());
           vista.getTxtpresart().setText(list_h.get(a).getPre_art());
           vista.getTxttemp().setText(list_h.get(a).getTem());
           vista.getTxtoxi().setText(list_h.get(a).getOxim());
           vista.getCalendariobuscar().setDate(list_h.get(a).getFecha_his());
                   vista.getBtnlimpiar().setText("Nuevo");
        cambio="nuevo";
        vista.getBtnguardar().setText("Editar");
        accion="editar";
        if(fecha.before(fecha_his_Med())){
        vista.getBtnguardar().setEnabled(false);
        } else {
            vista.getBtnguardar().setEnabled(true);
        }
           cargarmed();
           cargarpaciente();
        }
      }
    }
     //evento tabla
    private void cargardatosmed(java.awt.event.MouseEvent e){
        int filasel = vista.getTbldoctor().getSelectedRow();
        String cedmed=(String) vista.getTbldoctor().getValueAt(filasel, 0);
        List<Doctor> listaper=modelo.listarMedico(cedmed);
        for (int a = 0; a < listaper.size(); a++) {
        if (listaper.get(a).getCedula().equals(cedmed)) {
           vista.getTxtcedulamed().setText(listaper.get(a).getCedula());
           vista.getTxtnombresmed().setText(listaper.get(a).getNombres());
           vista.getTxtapellidosmed().setText(listaper.get(a).getApellidos());
        }
      }
    }
   //cargar metodos
     private void cargarmed(){
        String cedmed=vista.getTxtcedulamed().getText();
        List<Doctor> listaper=modelo.listarMedico(cedmed);
        for (int a = 0; a < listaper.size(); a++) {
        if (listaper.get(a).getCedula().equals(cedmed)) {
           vista.getTxtnombresmed().setText(listaper.get(a).getNombres());
           vista.getTxtapellidosmed().setText(listaper.get(a).getApellidos());
        }
      }
    }
     //
     private void cargardesdeMenu(){
     String cedu=vistaMenu.getLblCedulapac().getText();
     vista.getTxtenfermedad().requestFocus();
     if(cedu.equals("...")){JOptionPane.showMessageDialog(vistaMenu, "Debe tener cargado un paciente en la parte superior");} else{
     vista.getTxtcedulapac().setText(cedu);
     cargarpaciente();
     cambio="nuevo";
     limpiar();
     }
     }
      private void cargarpaciente(){
        String ced_pac=vista.getTxtcedulapac().getText();
        List<Paciente> listaper=modelo.listarPacientes(ced_pac);
        for (int a = 0; a < listaper.size(); a++) {
        if (listaper.get(a).getCedula().equals(ced_pac)) {
           vista.getTxtnombrespac().setText(listaper.get(a).getNombres());
           vista.getTxtapellidospac().setText(listaper.get(a).getApellidos());
           if(listaper.get(a).getGenero().equalsIgnoreCase("M")){
           vista.getTxtgeneropac().setText("Masculino");
           } else {
               vista.getTxtgeneropac().setText("Femenino");
           }
           vista.getTxtdireccionpac().setText(listaper.get(a).getDireccion());
           vista.getTxttelefonopac().setText(listaper.get(a).getTelefono());
           vista.getTxtcorreopac().setText(listaper.get(a).getCorreo());
           vista.getTxtprovinciapac().setText(listaper.get(a).getProvincia());
           vista.getTxtciudadpac().setText(listaper.get(a).getCiudad());
           vista.getCalendario().setDate(listaper.get(a).getFecha_nac());
           cargartablahistorial();
        }
      }
    }
     //limpiar
    private void limpiar(){
    
    accion="guardar";
    vista.getBtnguardar().setText("Guardar");
    if(cambio.equals("limpio")){
    vista.getTxtenfermedad().setText("");
    vista.getTxtantecedentes().setText("");
    vista.getTxttratamiento().setText("");
    vista.getTxtalergia().setText("");
    vista.getTxtmedicamento().setText("");
    vista.getTxtfumbebe().setText("");
    vista.getTxtproblemascar().setText("");
    vista.getTxtulcera().setText("");
    vista.getTxtpresion().setText("");
    vista.getTxthepatitis().setText("");
    vista.getTxtdiabetes().setText("");
    vista.getTxtepilepsia().setText("");
    vista.getTxtdolorescab().setText("");
    vista.getTxtaltend().setText("");
    vista.getTxtvih().setText("");
    vista.getTxtprobcoag().setText("");
    vista.getTxtfrecres().setText("");
    vista.getTxtfreccar().setText("");
    vista.getTxtpresart().setText("");
    vista.getTxttemp().setText("");
    vista.getTxtoxi().setText("");
    vista.getCalendariobuscar().setDate(null);
    cargartablahistorial();
    vista.getBtnguardar().setEnabled(true);
    cambio="nuevo";
    vista.getBtnlimpiar().setText("Nuevo");
    } else if (cambio.equals("nuevo")){
    vista.getBtnguardar().setEnabled(true);
    vista.getTxtcedulamed().setText("");
    vista.getTxtnombresmed().setText("");
    vista.getTxtapellidosmed().setText("");
    vista.getCalendariobuscar().setDate(null);
//    vista.getTxtcedulapac().setText("");
//    vista.getTxtnombrespac().setText("");
//    vista.getTxtapellidospac().setText("");
//    vista.getTxtgeneropac().setText("");
//    vista.getTxtdireccionpac().setText("");
//    vista.getTxtdireccionpac().setText("");
//    vista.getTxttelefonopac().setText("");
//    vista.getTxtcorreopac().setText("");
//    vista.getTxtprovinciapac().setText("");
//    vista.getTxtciudadpac().setText("");
//    vista.getCalendario().setDate(null);
    vista.getTxtenfermedad().setText("");
    vista.getTxtantecedentes().setText("");
    vista.getTxttratamiento().setText("");
    vista.getTxtalergia().setText("");
    vista.getTxtmedicamento().setText("");
    vista.getTxtfumbebe().setText("");
    vista.getTxtproblemascar().setText("");
    vista.getTxtulcera().setText("");
    vista.getTxtpresion().setText("");
    vista.getTxthepatitis().setText("");
    vista.getTxtdiabetes().setText("");
    vista.getTxtepilepsia().setText("");
    vista.getTxtdolorescab().setText("");
    vista.getTxtaltend().setText("");
    vista.getTxtvih().setText("");
    vista.getTxtprobcoag().setText("");
    vista.getTxtfrecres().setText("");
    vista.getTxtfreccar().setText("");
    vista.getTxtpresart().setText("");
    vista.getTxttemp().setText("");
    vista.getTxtoxi().setText("");
    vista.getCalendariobuscar().setDate(null);}
    }
    //
    private String id_his_med() {
        String id=modelo.id_his_med();
        if (id == null) {
            id="1";
        } else {
            int id_his = Integer.parseInt(id);
            id_his++;
            id=String.valueOf(id_his);
        }
        return id;
    }
    //Extraer hora
     private String hora_His_Med() {
        DateTimeFormatter hora_act = DateTimeFormatter.ofPattern("hh:mm");
        String hora = hora_act.format(LocalDateTime.now());
        return hora;
    }
    //Extraer fecha
    private Date fecha_his_Med() {
        LocalDate fecha = LocalDate.now();
        Date d = Date.valueOf(fecha);
        return d;
    }
    
    //
    private void imprimir(){
    ConexionPg con= new ConexionPg();
    
    String num=vista.getId_his().getText();
        try {
            JasperReport listado = (JasperReport) JRLoader.loadObject(getClass().getResource("/Reportes/Reporte Hist Odontologico.jasper"));
            
            Map parametros = new HashMap();
            parametros.put("reporteid", num);
            JasperPrint impr= JasperFillManager.fillReport(listado, parametros, con.Con());
            JasperViewer ver= new JasperViewer(impr,false);
            ver.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(Controller_Rep_His_Med.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
