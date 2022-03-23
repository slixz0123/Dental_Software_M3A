/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Anamnesis;
import Model.ConexionPg;
import Model.Doctor;
import Model.Model_Anamnesis;
import Model.Paciente;
import View.MenuPrincipal;
import View.Vista_Anamesis;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.xml.ws.Holder;

/**
 *
 * @author Saul
 */
public class Controller_Anamnesis {
    private Model_Anamnesis modelo;
    private Vista_Anamesis vista;
    private String accion = "guardar";
    private MenuPrincipal vistame;
    public Controller_Anamnesis(Model_Anamnesis modelo, Vista_Anamesis vista ,MenuPrincipal vistame) {
      this.modelo = modelo;
      this.vista = vista;
      vista.setVisible(true); 
      iniciarControl();
    }
    public void iniciarControl(){

        vista.getBtnguardar().addActionListener(l->crearEditarAnamnesis());
        vista.getBtnimprimir().addActionListener(l->imprimir());
        vista.getBtnnuevo().addActionListener(l->limpiar());
        vista.getBtnbuscardoc().addActionListener(l->abrir_dialog(1));
        vista.getBtnbuscarpac().addActionListener(l->abrir_dialog(2));
        vista.getDialogbuscar().setLocationRelativeTo(null);
        setEventMouseClicked(vista.getTbldoctor());
        cargarPaciente();
        cargarMedico();
        eventos();
        cargarAnamnesis();
        setEventMouseClicked2(vista.getTblpac());
        cargpaci(vista.getTxtcedula_pac());
        cargaranam(vista.getTabla_anam());
    }
    
    
    //eventos tabla
    private void setEventMouseClicked(JTable tbl){
    tbl.addMouseListener(new java.awt.event.MouseAdapter() {
    @Override
    public void mouseClicked(MouseEvent e){
     seleccionardatosmed(e);
    }
    });
    }  
//
    private void setEventMouseClicked2(JTable tbl){
    tbl.addMouseListener(new java.awt.event.MouseAdapter() {
    @Override
    public void mouseClicked(MouseEvent e){
     selec_pac_datos(e);
     cargarAnamnesis();
    }
    });
    }
//
    private void cargaranam(JTable tbl){
    tbl.addMouseListener(new java.awt.event.MouseAdapter() {
    @Override
    public void mouseClicked(MouseEvent e){
        selec_anam(e);
        accion="editar";
        vista.getBtnguardar().setText("Editar");
    }
    });
    }
//Eventos busqueda
    private void eventos(){
    
    KeyListener buscarpac=new KeyListener() {
        @Override
        public void keyTyped(KeyEvent e) {}

        @Override
        public void keyPressed(KeyEvent e) {}

        @Override
        public void keyReleased(KeyEvent e) {
            cargarPaciente();
        }
    };
   
    
   
    KeyListener buscarmed=new KeyListener() {
        @Override
        public void keyTyped(KeyEvent e) {}

        @Override
        public void keyPressed(KeyEvent e) {}

        @Override
        public void keyReleased(KeyEvent e) {
         cargarMedico();
        }
    };
    vista.getTxtbuscarpac().addKeyListener(buscarpac);
    vista.getTxtbuscardoc().addKeyListener(buscarmed);
    }
    private void cargpaci(JTextField ced){
         ced.addKeyListener(new java.awt.event.KeyListener() {
             @Override
             public void keyTyped(KeyEvent e) {
             char num = e.getKeyChar();
            if(vista.getTxtcedula_pac().getText().length()>9) e.consume();
            if((num<'0' || num>'9')) e.consume(); }
             @Override
             public void keyPressed(KeyEvent e) {}
             @Override
             public void keyReleased(KeyEvent e) {
                 buscarpac(e);
             }
         });
     }
    
    //Abrir dialog
    private void abrir_dialog(int op){
        if(op==1){
      vista.getDialogbuscar().setVisible(true);
      vista.getDialogbuscar().setTitle("Buscar medico");
      vista.getDialogbuscar().setSize(550, 350);
        } else {
        vista.getDialogpac().setVisible(true);
        vista.getDialogpac().setLocationRelativeTo(null);
        vista.getDialogpac().setTitle("Buscar paciente");
        vista.getDialogpac().setSize(550, 350);
        }
     }
    //
    private void cargarPaciente(){
    DefaultTableModel tblModel;
    tblModel=(DefaultTableModel)vista.getTblpac().getModel();
    tblModel.setNumRows(0);
    List<Paciente> listap= modelo.listarPersonas(vista.getTxtbuscarpac().getText());
    Holder<Integer> i = new Holder<>(0);

    listap.stream().forEach(pe->{
    tblModel.addRow(new Object[6]);   
    vista.getTblpac().setValueAt(pe.getCedula(), i.value, 0);//Fila 1 para que inicie despues de los titulos
    vista.getTblpac().setValueAt(pe.getNombres(), i.value, 1);
    vista.getTblpac().setValueAt(pe.getApellidos(), i.value, 2);
    vista.getTblpac().setValueAt(pe.getDireccion(), i.value, 3);
    vista.getTblpac().setValueAt(pe.getCorreo(), i.value, 4);
    vista.getTblpac().setValueAt(pe.getTelefono(), i.value, 5);
    i.value++;
    });
    }
    //
    private void cargarMedico(){
    DefaultTableModel tblModel;
    tblModel=(DefaultTableModel)vista.getTbldoctor().getModel();
    tblModel.setNumRows(0);
    List<Doctor> listamed= modelo.listarMedico(vista.getTxtbuscardoc().getText());
    Holder<Integer> i = new Holder<>(0);

    listamed.stream().forEach(med->{
    tblModel.addRow(new Object[6]);   
    vista.getTbldoctor().setValueAt(med.getCedula(), i.value, 0);
    vista.getTbldoctor().setValueAt(med.getNombres(), i.value, 1);
    vista.getTbldoctor().setValueAt(med.getApellidos(), i.value, 2);
    vista.getTbldoctor().setValueAt(med.getDireccion(), i.value, 3);
    vista.getTbldoctor().setValueAt(med.getEspecialidad(), i.value, 4);
    vista.getTbldoctor().setValueAt(med.getTelefono(), i.value, 5);
    i.value++;
    });
    }
    //Cargar tabla anamnesis
    private void cargarAnamnesis(){
    DefaultTableModel tblModel;
    tblModel=(DefaultTableModel)vista.getTabla_anam().getModel();
    tblModel.setNumRows(0);
    String idPac=modelo.idPac(vista.getTxtcedula_pac().getText());
//    List<Anamnesis> listaan= modelo.listarbuscar(idPac, "");
    List<Anamnesis> listaan= modelo.listaran(idPac);
    Holder<Integer> i = new Holder<>(0);

    listaan.stream().forEach(an->{
    tblModel.addRow(new Object[3]);   
    vista.getTabla_anam().setValueAt(an.getId_anamnesis(), i.value, 0);//Fila 1 para que inicie despues de los titulos
    vista.getTabla_anam().setValueAt(an.getId_doctor(), i.value, 1);
    vista.getTabla_anam().setValueAt(an.getId_paciente(), i.value, 2);
    vista.getTabla_anam().setValueAt(an.getEmbarazo(), i.value, 3);
    i.value++;
    });
    }
     //evento tabla
    private void seleccionardatosmed(java.awt.event.MouseEvent e){
        int filasel = vista.getTbldoctor().getSelectedRow();
        String cedmed=(String) vista.getTbldoctor().getValueAt(filasel, 0);
        List<Doctor> listaper=modelo.listarMedico(cedmed);
     for (int a = 0; a < listaper.size(); a++) {
        if (listaper.get(a).getCedula().equals(cedmed)) {
           vista.getTxtcedulamed().setText(listaper.get(a).getCedula());
           vista.getTxtnombredoc().setText(listaper.get(a).getNombres());
           vista.getTxtapellidodoc().setText(listaper.get(a).getApellidos());
           vista.getTxttelefonomed().setText(listaper.get(a).getTelefono());
           vista.getTxtespecialidad().setText(modelo.especialidad_Med(listaper.get(a).getCedula()));
        }
      }
    }
    
   //
    private void selec_pac_datos(java.awt.event.MouseEvent e){
        int filasel = vista.getTblpac().getSelectedRow();
        vista.getTxtcedula_pac().setText((String) vista.getTblpac().getValueAt(filasel, 0));
        llenarpac();
    }
    //cargar datos de anamnesis
    private void selec_anam(java.awt.event.MouseEvent e){
        int filasel = vista.getTabla_anam().getSelectedRow();
        String id_med=(String) vista.getTabla_anam().getValueAt(filasel, 1);
        String id_pac=(String) vista.getTabla_anam().getValueAt(filasel, 2);
        
        vista.getTxtcedula_pac().setText(modelo.cedulaPac(id_pac));
        vista.getTxtcedulamed().setText(modelo.cedulaMed(id_med));
        llenarpac();
        llenarmed();
        llenaranam();
    }
        //Cargar datos paciente buscar
    private void buscarpac(java.awt.event.KeyEvent e){
    List<Paciente> listaper=modelo.listarPersonas(vista.getTxtcedula_pac().getText());
     for (int a = 0; a < listaper.size(); a++) {
        if (listaper.get(a).getCedula().equals(vista.getTxtcedula_pac().getText())) {
           vista.getTxtcedula_pac().setText(listaper.get(a).getCedula());
           vista.getTxtnombrespac().setText(listaper.get(a).getNombres());
           vista.getTxtapellidopac().setText(listaper.get(a).getApellidos());
           if(listaper.get(a).getGenero().equalsIgnoreCase("M")){
           vista.getTxtgeneropac().setText("Masculino");
           } else {
               vista.getTxtgeneropac().setText("Femenino");
           }
           vista.getTxtdireccion().setText(listaper.get(a).getDireccion());
           vista.getTxttelefonopac().setText(listaper.get(a).getTelefono());
           vista.getTxtcorreo().setText(listaper.get(a).getCorreo());
           vista.getTxtprovincia().setText(listaper.get(a).getProvincia());
           vista.getTxtciudad().setText(listaper.get(a).getCiudad());
           vista.getDateFechanacEsp().setDate(listaper.get(a).getFecha_nac());
        }
      }
    }
//cargarpaciente
    private void llenarpac(){
    List<Paciente> listaper=modelo.listarPersonas(vista.getTxtcedula_pac().getText());
     for (int a = 0; a < listaper.size(); a++) {
        if (listaper.get(a).getCedula().equals(vista.getTxtcedula_pac().getText())) {
           vista.getTxtcedula_pac().setText(listaper.get(a).getCedula());
           vista.getTxtnombrespac().setText(listaper.get(a).getNombres());
           vista.getTxtapellidopac().setText(listaper.get(a).getApellidos());
           if(listaper.get(a).getGenero().equalsIgnoreCase("M")){
           vista.getTxtgeneropac().setText("Masculino");
           } else {
               vista.getTxtgeneropac().setText("Femenino");
           }
           vista.getTxtdireccion().setText(listaper.get(a).getDireccion());
           vista.getTxttelefonopac().setText(listaper.get(a).getTelefono());
           vista.getTxtcorreo().setText(listaper.get(a).getCorreo());
           vista.getTxtprovincia().setText(listaper.get(a).getProvincia());
           vista.getTxtciudad().setText(listaper.get(a).getCiudad());
           vista.getDateFechanacEsp().setDate(listaper.get(a).getFecha_nac());
        }
      }}
    //Llenar medico
    private void llenarmed(){
    List<Doctor> listmed=modelo.listarMedico(vista.getTxtcedulamed().getText());
     for (int a = 0; a < listmed.size(); a++) {
        if (listmed.get(a).getCedula().equals(vista.getTxtcedulamed().getText())) {
           vista.getTxtcedulamed().setText(listmed.get(a).getCedula());
           vista.getTxtnombredoc().setText(listmed.get(a).getNombres());
           vista.getTxtapellidodoc().setText(listmed.get(a).getApellidos());
           vista.getTxttelefonomed().setText(listmed.get(a).getTelefono());
           vista.getTxtespecialidad().setText(modelo.especialidad_Med(listmed.get(a).getCedula()));
           
        }
      }}
    //Llenar txt anamnesis
    private void llenaranam(){
        int filasel = vista.getTabla_anam().getSelectedRow();
        String idanam=(String) vista.getTabla_anam().getValueAt(filasel, 0);
        String idpac=(String) vista.getTabla_anam().getValueAt(filasel, 2);
        
        List<Anamnesis> listan=modelo.listarbuscar(idpac, idanam);
     for (int a = 0; a < listan.size(); a++) {
        if (listan.get(a).getId_anamnesis().equals(idanam)) {
           vista.getTxtembarazo().setText(listan.get(a).getEmbarazo());
           vista.getTxproblema().setText(listan.get(a).getProble_act());
           vista.getTxtconsulta().setText(listan.get(a).getMotiv_consul());
        }
      }}
    //Crear anamnesis
    private void crearEditarAnamnesis(){
    Model_Anamnesis anam = new Model_Anamnesis();
    anam.setId_anamnesis(id_anam());
    anam.setId_paciente(modelo.idPac(vista.getTxtcedula_pac().getText()));
    anam.setEmbarazo(vista.getTxtembarazo().getText());
    anam.setMotiv_consul(vista.getTxtconsulta().getText());
    anam.setProble_act(vista.getTxproblema().getText());
    anam.setId_doctor(modelo.idMed(vista.getTxtcedulamed().getText()));
    if(accion.equals("guardar")){  
    if(anam.crearAnamnesis()){
            JOptionPane.showMessageDialog(vista, "Datos guardados");
            accion="editar";
            vista.getBtnguardar().setText("Editar");
            cargarAnamnesis();
            limpiar();
        } else {JOptionPane.showMessageDialog(vista, "No se pudo guardar");}
    } else if(accion.equals("editar")){
    int filasel = vista.getTabla_anam().getSelectedRow();
    String idanam=(String) vista.getTabla_anam().getValueAt(filasel, 0);
    anam.setId_anamnesis(idanam);
    anam.setId_paciente(modelo.idPac(vista.getTxtcedula_pac().getText()));
    anam.setEmbarazo(vista.getTxtembarazo().getText());
    anam.setMotiv_consul(vista.getTxtconsulta().getText());
    anam.setProble_act(vista.getTxproblema().getText());
    anam.setId_doctor(modelo.idMed(vista.getTxtcedulamed().getText()));
       
        if(anam.actualizarAnamnesis()){
            JOptionPane.showMessageDialog(vista, "Se modificaron los datos");
            accion="guardar";
            vista.getBtnguardar().setText("Guardar");
            cargarAnamnesis();
            limpiar();
        } else {JOptionPane.showMessageDialog(vista, "No se pudo modificar");}
    }
    }

    //Imprimir
    private void imprimir(){
    ConexionPg con= new ConexionPg();   
//        try {
//            JasperReport listado = (JasperReport) JRLoader.loadObject(getClass().getResource("/Vista/Reporte/Factura.jasper"));
//            Map parametros = new HashMap();
//            String idan= vista.getLblidanam().getText();
//            parametros.put("facturaid", idan);
//            JasperPrint impr= JasperFillManager.fillReport(listado, parametros, con.Con());
//            JasperViewer ver= new JasperViewer(impr, false);
//            ver.setVisible(true);
//            limpiar();
//        } catch (JRException ex) {
//            Logger.getLogger(Controller_Anamnesis.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }
    private void limpiar(){
    accion="guardar";
    vista.getBtnguardar().setText("Guardar");
    vista.getTxtembarazo().setText("");
    vista.getTxproblema().setText("");
    vista.getTxtconsulta().setText("");
    vista.getTxtcedulamed().setText("");
    vista.getTxtnombredoc().setText("");
    vista.getTxtapellidodoc().setText("");
    vista.getTxtespecialidad().setText("");
    vista.getTxttelefonomed().setText("");
//    vista.getTxtcedula_pac().setText("");
//    vista.getTxtnombrespac().setText("");
//    vista.getTxtapellidopac().setText("");
//    vista.getTxtgeneropac().setText("");
//    vista.getTxtdireccion().setText("");
//    vista.getTxttelefonopac().setText("");
//    vista.getTxtcorreo().setText("");
//    vista.getTxtprovincia().setText("");
//    vista.getTxtciudad().setText("");
//    vista.getDateFechanacEsp().setDate(null);
    }

    private String id_anam() {
        String id=modelo.id_anam();
        if (id == null) {
            id="1";
        } else {
            int inc = Integer.parseInt(id);
            inc++;
            id=String.valueOf(inc);

        }
        return id;
    }
//
   
    private String id_an_act() {
        String id=modelo.id_act_anam();
        return id;
    }

}
