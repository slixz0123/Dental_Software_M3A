/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Doctor;
import Model.Hist_Medico;
import Model.Model_HistorialMedico;
import Model.Paciente;
import Model.Persona;
import View.Vista_Crud_HistorialMedico;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.xml.ws.Holder;

/**
 *
 * @author slix0
 */
public class Controller_HistorialMedico {
    private Model_HistorialMedico modelo;
    private Vista_Crud_HistorialMedico vista;
    private String accion = "guardar";

    public Controller_HistorialMedico(Model_HistorialMedico modelo, Vista_Crud_HistorialMedico vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setVisible(true);
        iniciar();
    }
    public void iniciar(){
        
        cargartablahistorial();
        eventos();
        eventotblmed(vista.getTbldoctor());
        eventotblpac(vista.getTblpaciente());
    }
    
    //
    private void cargartablahistorial(){
    DefaultTableModel tblModel;
    tblModel=(DefaultTableModel)vista.getTablahistorial().getModel();
    tblModel.setNumRows(0);
    if(vista.getCalendariobuscar().getDate()!=null){
    SimpleDateFormat fechacon = new SimpleDateFormat("yyyy-MM-dd");
    String fecha = fechacon.format(vista.getCalendariobuscar().getDate());
    List<Hist_Medico> listap= modelo.listarbuscarhist(fecha);
    Holder<Integer> i = new Holder<>(0);

    listap.stream().forEach(pe->{
    tblModel.addRow(new Object[3]);   
    vista.getTablahistorial().setValueAt(pe.getId_his_med(), i.value, 0);
    vista.getTablahistorial().setValueAt(pe.getFecha_his(), i.value, 1);
    vista.getTablahistorial().setValueAt(pe.getHora_his(), i.value, 2);
    i.value++;
    });
    } else {
    List<Hist_Medico> listap= modelo.listarbuscarhist("");
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
        vista.getBtnguardar().setText("Editar");
        } else {JOptionPane.showMessageDialog(null, "No se pudo guardar");
      }
     } else if(accion.equals("editar")){
     actualizar_hist();
     }
    }
    //
     //Actualizar historial medico
    private void actualizar_hist(){
    Model_HistorialMedico act_his= new Model_HistorialMedico();
    act_his.setId_his_med(id_his_med());
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
        } else {
        JOptionPane.showMessageDialog(null, "No se pudo actualizar");
      }
    }
    //Eventos
    private void eventos(){
    
    KeyListener buscarpac=new KeyListener() {
        @Override
        public void keyTyped(KeyEvent e) {}

        @Override
        public void keyPressed(KeyEvent e) {}

        @Override
        public void keyReleased(KeyEvent e) {
            buscarPaciente();
        }
    };
   
    
   
    KeyListener buscarmed=new KeyListener() {
        @Override
        public void keyTyped(KeyEvent e) {}

        @Override
        public void keyPressed(KeyEvent e) {}

        @Override
        public void keyReleased(KeyEvent e) {
         buscarMedico();
        }
    };
    vista.getTxtbuscarpac().addKeyListener(buscarpac);
    vista.getTxtbuscardoc().addKeyListener(buscarmed);
    }
    //
    //eventos tabla
    private void eventotblmed(JTable tbl){
    tbl.addMouseListener(new java.awt.event.MouseAdapter() {
    @Override
    public void mouseClicked(MouseEvent e){
        cargardatosmed(e);
    }
    });
    }  
//
    private void eventotblpac(JTable tbl){
    tbl.addMouseListener(new java.awt.event.MouseAdapter() {
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
        String ced_pac=(String) vista.getTbldoctor().getValueAt(filasel, 0);
        List<Paciente> listaper=modelo.listarPacientes(ced_pac);
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
        }
      }
    }
    //
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
    //Cargar datos en ttxt
    private void llenarDatos(java.awt.event.MouseEvent e){
    int filasel = vista.getTablahistorial().getSelectedRow();
    //vista.getTxtcedula_pac().setText((String) vista.getTblpac().getValueAt(filasel, 0));
    }
     //limpiar
    private void limpiar(){
    accion="guardar";
    vista.getBtnguardar().setText("Guardar");
    vista.getTxtcedulamed().setText("");
    vista.getTxtcedulapac().setText("");
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
}