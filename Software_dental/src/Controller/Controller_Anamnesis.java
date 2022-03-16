/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.ConexionPg;
import Model.Doctor;
import Model.Model_Anamnesis;
import Model.Persona;
import View.MenuPrincipal;
import View.Vista_Anamesis;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Saul
 */
public class Controller_Anamnesis {
    private Model_Anamnesis modelo;
    private Vista_Anamesis vista;
    private MenuPrincipal vistamenu;
    private String accion = "guardar";
    public Controller_Anamnesis(Model_Anamnesis modelo, Vista_Anamesis vista) {
      this.modelo = modelo;
      this.vista = vista;
      vista.setVisible(true); 
      iniciarControl();
    }
    public void iniciarControl(){
       // vista.getBtnbuscarpac().addActionListener(l->buscarpac());
        vista.getBtnguardar().addActionListener(l->crearEditarAnamnesis());
        vista.getBtnimprimir().addActionListener(l->imprimir());
        vista.getBtnnuevo().addActionListener(l->limpiar());
    cargarnomdoc();
    cargardatodoc();
    cargpaci(vista.getTxtcedula_pac());
        System.out.println("Hola controlador anamnesis");
    }
    //eventos
    private void cargpaci(JTextField ced){
         ced.addKeyListener(new java.awt.event.KeyListener() {
             @Override
             public void keyTyped(KeyEvent e) {}
             @Override
             public void keyPressed(KeyEvent e) {}
             @Override
             public void keyReleased(KeyEvent e) {
             //cargardatospac(e);
                 buscarpac(e);
             }
         });
     }
    //Cargar datos paciente evento
    private void cargardatospac(java.awt.event.KeyEvent e){
    List<Persona> listap=modelo.listarPersonas(vistamenu.getLblCedulapac().getText());
        System.out.println(vistamenu.getLblCedulapac().getText());
     for (int a = 0; a < listap.size(); a++) {
        if (listap.get(a).getCedula().equals(vistamenu.getLblCedulapac().getText())) {
           vista.getTxtcedula_pac().setText(listap.get(a).getCedula());
           vista.getTxtnombrespac().setText(listap.get(a).getNombres());
           vista.getTxtapellidopac().setText(listap.get(a).getApellidos());
           if(listap.get(a).getGenero().equals("M")){
           vista.getTxtgeneropac().setText("Masculino");
           } else {
               vista.getTxtgeneropac().setText("Femenino");
           }
           vista.getTxtdireccion().setText(listap.get(a).getDireccion());
           vista.getTxttelefonopac().setText(listap.get(a).getTelefono());
           vista.getTxtcorreo().setText(listap.get(a).getCorreo());
           vista.getTxtprovincia().setText(listap.get(a).getProvincia());
           vista.getTxtciudad().setText(listap.get(a).getCiudad());
           vista.getDateFechanacEsp().setDate(modelo.fecha_nac(vista.getTxtcedula_pac().getText()));
        } else {
            JOptionPane.showMessageDialog(vista, "No existe un paciente con numero de cedula "+vista.getTxtcedula_pac().getText());
        } 
      }
    }
        //Cargar datos paciente buscar
    private void buscarpac(java.awt.event.KeyEvent e){
    List<Persona> listaper=modelo.listarPersonas(vista.getTxtcedula_pac().getText());
     for (int a = 0; a < listaper.size(); a++) {
        if (listaper.get(a).getCedula().equals(vista.getTxtcedula_pac().getText())) {
//           vistamenu.getLblCedulapac().setText(listaper.get(a).getCedula());
     //      vistamenu.getLblnombrescomp().setText(listaper.get(a).getNombres().concat(" ").concat(listaper.get(a).getApellidos()));
      //     vistamenu.getLblIdpac().setText(modelo.idPac(vista.getTxtcedula_pac().getText()));
           vista.getTxtcedula_pac().setText(listaper.get(a).getCedula());
           vista.getTxtnombrespac().setText(listaper.get(a).getNombres());
           vista.getTxtapellidopac().setText(listaper.get(a).getApellidos());
           if(listaper.get(a).getGenero().equals("M")){
           vista.getTxtgeneropac().setText("Masculino");
           } else {
               vista.getTxtgeneropac().setText("Femenino");
           }
           vista.getTxtdireccion().setText(listaper.get(a).getDireccion());
           vista.getTxttelefonopac().setText(listaper.get(a).getTelefono());
           vista.getTxtcorreo().setText(listaper.get(a).getCorreo());
           vista.getTxtprovincia().setText(listaper.get(a).getProvincia());
           vista.getTxtciudad().setText(listaper.get(a).getCiudad());
           vista.getDateFechanacEsp().setDate(modelo.fecha_nac(vista.getTxtcedula_pac().getText()));
        } else {
            JOptionPane.showMessageDialog(vista, "No existe un paciente con numero de cedula "+vista.getTxtcedula_pac().getText());
        } 
      }
    }
    //listar id
  private void cargarnomdoc(){
  modelo.cargar_doc(vista.getCbmedico());
  }
 
   //Cargar datos doctor evento
    private void cargardatodoc(){
        List<Doctor> listap=modelo.listarMedico(idmedico());
     for (int a = 0; a < listap.size(); a++) {
        if (listap.get(a).getId_doctor().equals(idmedico())) {
           vista.getTxtcedulamed().setText(listap.get(a).getCedula());
           vista.getTxtespecialidad().setText(listap.get(a).getEspecialidad());
           vista.getTxttelefonomed().setText(listap.get(a).getTelefono());
        }
      }
    }
    
    //Crear anamnesis
    private void crearEditarAnamnesis(){
    Model_Anamnesis anam = new Model_Anamnesis();
    anam.setId_anamnesis(idanamnesis());
    anam.setId_paciente(vistamenu.getLblIdpac().getText());
    anam.setEmbarazo(vista.getTxtembarazo().getText());
    anam.setMotiv_consul(vista.getTxtconsulta().getText());
    anam.setProble_act(vista.getTxproblema().getText());
    anam.setId_doctor(idmedico());
    if(accion.equals("guardar")){  
    if(anam.crearAnamnesis()){
            JOptionPane.showMessageDialog(vista, "Anamnesis creada");
            accion="editar";
            vista.getBtnguardar().setText("Editar");
        } else {JOptionPane.showMessageDialog(vista, "No se pudo crear la anamnesis");}
    } else if(accion.equals("editar")){
     anam.setId_anamnesis(idanamnesis());
    anam.setId_paciente(vistamenu.getLblIdpac().getText());
    anam.setEmbarazo(vista.getTxtembarazo().getText());
    anam.setMotiv_consul(vista.getTxtconsulta().getText());
    anam.setProble_act(vista.getTxproblema().getText());
    anam.setId_doctor(idmedico());
        if(anam.actualizarAnamnesis()){
            JOptionPane.showMessageDialog(vista, "Anamnesis modificada");
            accion="guardar";
            vista.getBtnguardar().setText("Guardar");
        } else {JOptionPane.showMessageDialog(vista, "No se pudo modificar la anamnesis");}
    }
    }
    //Modificar anamnesis
    private void modificarAnamnesis(){
    Model_Anamnesis anam = new Model_Anamnesis();
    anam.setId_anamnesis(idanamnesis());
    anam.setId_paciente(vistamenu.getLblIdpac().getText());
    anam.setEmbarazo(vista.getTxtembarazo().getText());
    anam.setMotiv_consul(vista.getTxtconsulta().getText());
    anam.setProble_act(vista.getTxproblema().getText());
    anam.setId_doctor(idmedico());
        if(anam.actualizarAnamnesis()){
            JOptionPane.showMessageDialog(vista, "Anamnesis modificada");
            accion="guardar";
            vista.getBtnguardar().setText("Guardar");
        } else {JOptionPane.showMessageDialog(vista, "No se pudo modificar la anamnesis");}
    }
    //ID anamnesis
    private String idanamnesis(){
        String id_an;  
        id_an=modelo.id_anam("SELECT MAX(id_anamnesis) FROM anamnesis;");
        return id_an;
    }
    //ID medico
    private String idmedico(){
        String idmed;  
        String id=vista.getCbmedico().getSelectedItem().toString();
        List<Integer> soloid=modelo.extraerNumeros(id);
        idmed=String.valueOf(soloid);
        return idmed;
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
    vista.getTxtembarazo().setText("");
    vista.getTxproblema().setText("");
    vista.getTxtconsulta().setText("");
    cargarnomdoc();
    }
}
