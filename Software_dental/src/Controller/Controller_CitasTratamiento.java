
package Controller;

import Model.Citas;
import Model.Doctor;
import Model.Model_Citas;

import Model.Paciente;
import View.MenuPrincipal;
import View.Vista_Citas_Tratamiento;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.xml.ws.Holder;
import jtextfieldround.JTextFieldRound;


public class Controller_CitasTratamiento {
    private String cambio="agendar";
    
    private Model_Citas modelo;
    private Vista_Citas_Tratamiento vista;
 private MenuPrincipal vistamenu ;
      private JFileChooser jfc;
      
    public Controller_CitasTratamiento(Model_Citas modelo, Vista_Citas_Tratamiento vista, MenuPrincipal vistamenu) {
        this.modelo = modelo;
        this.vista = vista;
         this.vistamenu = vistamenu;
        vista.setVisible(true);
        iniciar();
        //cargarcitas();
    }
    
    public void iniciar(){
        generarSerie();
       // cargarcitas();
        vista.getBtnAgendar1().addActionListener(l->crearcitas());
        vista.getBtnACTU().addActionListener(l->limpiar());
        vista.getBtnELIM().addActionListener(l->eliminarcita());
        setEventoMouseClicked(vista.getJtblcitas());
        vista.getBtncargar().addActionListener(l->cargardatosexternosconcedula());
        eventodolcab(vista.getTxthora());
    }
    private void eventodolcab(JTextFieldRound txt){
    txt.addKeyListener(new KeyAdapter() {
        public void keyPressed(KeyEvent e) {
           
        }
         @Override
        public void keyTyped(KeyEvent e) {
            char c = e.getKeyChar();   
       if(c>= '0' && c<='9' && vista.getTxthora().getText().length()<=4 && (c!=(char)KeyEvent.VK_BACK_SPACE)){
         if(vista.getTxthora().getText().length() == 2  ){
           vista.getTxthora().setText(vista.getTxthora().getText() + ":");
         }
       }else{
        e.consume();
       }
        
       
       
       
       
       if( vista.getTxthora().getText().length() == 0 && c !='0' && c !='1' && c !='2' && (c!=(char)KeyEvent.VK_BACK_SPACE) ){
         JOptionPane.showMessageDialog(null, "El numero ingresado no pertenece a una hora correcta");
           e.consume();
       }
        }
    });}
    
     public void cargardatosexternosconcedula(){
       
        
         String id2 = vistamenu.getLblCedulapac().getText();
           // pac.cargartxtsobrantes(id2);
            vista.getTxtcedulapac().setText(id2);
            vista.getTxtNombrePac().setText(vistamenu.getLblnombrescomp().getText());
            vista.getTxtApellidosPac().setText(vistamenu.getLabelapellido().getText());
          
             
      cargardatosexternosIdmed();
        cargarcitas();
        
    }
     public void cargardatosexternosIdmed(){
        
         String cadced=vistamenu.getJcbDocs().getSelectedItem().toString().subSequence(0, 10).toString();
        vista.getTxtceduladoc().setText(cadced);
        List<Doctor> listadoc=modelo.cargardatosdoctores(cadced);   
        for (int a = 0; a < listadoc.size(); a++) {   
        vista.getTxtNombredoc().setText(listadoc.get(a).getNombres());
        vista.getTxtapellidosdoc().setText(listadoc.get(a).getApellidos());
          
      }
          
     }
     
     
     
    
    private void generarSerie() {
      String   serie = modelo.NumSerie();
        if (serie == null) {
            vista.getTxtficha().setText("1");
        } else {
            int inc = Integer.parseInt(serie);
            inc++;
            vista.getTxtficha().setText("" + inc);

        }
    }
    public void crearcitas(){
        if(cambio.equals("agendar")){
    System.out.println("creando crud");
    String id_cita;
    String id_paciente;
    Date fecha;
    String hora_cita;
    String motivo;
    String id_doctor;
     
    
    id_cita=vista.getTxtficha().getText();
    
    //id_paciente=vista.getTxtcedulapac().getText();
    
    SimpleDateFormat dateFormat = new SimpleDateFormat ("yyy-MM-dd");
     java.util.Date date= vista.getJdateFecha().getDate();
     long d = date.getTime();
     String fechael=dateFormat.format(d);
     java.sql.Date fecha1 = new java.sql.Date(d);
     
     hora_cita=vista.getTxthora().getText();
     motivo=vista.getJareades().getText();
     id_doctor=vista.getTxtceduladoc().getText();
    
    
     Model_Citas mci= new Model_Citas();
     
    mci.setId_cita(id_cita);
    mci.setId_paciente(modelo.idPaci(vista.getTxtcedulapac().getText()));
    
    mci.setFecha_cita(fecha1);
    mci.setHora_cita(hora_cita);
    mci.setMotivo(motivo);
    mci.setId_doctor(modelo.idMed(vista.getTxtceduladoc().getText()));
    
     
     if (mci.crearCita())    
     { 
         cargarcitas();
         generarSerie();
         cambio="actualizar";
         JOptionPane.showMessageDialog(vista, "Cita creada correctamente ");
         limpiar();
     }else {
         JOptionPane.showMessageDialog(vista, "No se pudo crear  ");
          
     }
        }
        else if(cambio.equals("actualizar")){
            editarcita();
        }
    }
    
    public void editarcita(){
    String id_cita;
    String id_paciente;
    String hora_cita;
    Date fecha;
    String motivo;
    String id_doctor;
     
    id_cita=vista.getTxtficha().getText();
    vista.getTxtficha().setEnabled(true);
    id_paciente=vista.getTxtcedulapac().getText();
    
    SimpleDateFormat dateFormat = new SimpleDateFormat ("yyy-MM-dd");
     java.util.Date date= vista.getJdateFecha().getDate();
     long d = date.getTime();
     String fechael=dateFormat.format(d);
     java.sql.Date fecha1 = new java.sql.Date(d);
     
    
    
    hora_cita=vista.getTxthora().getText();
    motivo=vista.getJareades().getText();
    id_doctor=vista.getTxtceduladoc().getText();
    
     Model_Citas mci= new Model_Citas();
     
    mci.setId_cita(id_cita);
    mci.setId_paciente(modelo.idPaci(vista.getTxtcedulapac().getText()));
    
    mci.setFecha_cita(fecha1);
    mci.setHora_cita(hora_cita);
    mci.setMotivo(motivo);
    mci.setId_doctor(modelo.idMed(vista.getTxtceduladoc().getText()));
    
     if (mci.actualizarCitas()) 
     {
         cargarcitas();
         
         generarSerie();
         cambio="agendar";
         JOptionPane.showMessageDialog(vista, "Cita editada correctamente ");
         limpiar();
     }else {
         JOptionPane.showMessageDialog(vista, "No se pudo Editar  ");
          
     }
    }
    
    public void eliminarcita(){
    String id_cita;
    String id_paciente;
    String hora_cita;
    Date fecha;
    String motivo;
    String id_doctor;
     
    id_cita=vista.getTxtficha().getText();
    id_paciente=vista.getTxtcedulapac().getText();
    
    SimpleDateFormat dateFormat = new SimpleDateFormat ("yyy-MM-dd");
     java.util.Date date= vista.getJdateFecha().getDate();
     long d = date.getTime();
     String fechael=dateFormat.format(d);
     java.sql.Date fecha1 = new java.sql.Date(d);
     
    
    
    hora_cita=vista.getTxthora().getText();
    motivo=vista.getJareades().getText();
    id_doctor=vista.getTxtceduladoc().getText();
    
     Model_Citas mci= new Model_Citas();
     
    mci.setId_cita(id_cita);
    mci.setId_paciente(id_paciente);
    mci.setFecha_cita(fecha1);
    mci.setHora_cita(hora_cita);
    mci.setMotivo(motivo);
    mci.setId_doctor(id_doctor);
    
     if (mci.eliminarcita())    {
         cargarcitas();
         generarSerie();
         JOptionPane.showMessageDialog(vista, "Cita eliminada correctamente ");
         limpiar();
     }else {
         JOptionPane.showMessageDialog(vista, "No se pudo Eliminar  ");
          
     }
    }
    
   
   private void  cargarcitas(){
        
        vista.getJtblcitas().setDefaultRenderer(Object.class, new ImageTabla());//La manera de renderizar la tabla
        vista.getJtblcitas().setRowHeight(100);
        
        
        DefaultTableModel tbmodel ; 
        tbmodel = (DefaultTableModel) vista.getJtblcitas().getModel() ;
        tbmodel.setNumRows(0);
        
        List<Citas> milista = modelo.listarCitas(modelo.idPac(vista.getTxtcedulapac().getText()));
        Holder<Integer> i = new Holder<>(0);
        milista.stream().forEach(ci -> {
       
           tbmodel.addRow(new Object[4]);
           vista.getJtblcitas().setValueAt(ci.getId_cita(), i.value, 0);
           vista.getJtblcitas().setValueAt(ci.getFecha_cita(), i.value, 1);
           vista.getJtblcitas().setValueAt(ci.getHora_cita(), i.value, 2);
           vista.getJtblcitas().setValueAt(ci.getMotivo(), i.value, 3);
           i.value++;
        });
                
    }
   
   
   private void cargardatosTxtcie (java.awt.event.MouseEvent evt) throws IOException{
        int filasel = vista.getJtblcitas().getSelectedRow();
        String id=(String) vista.getJtblcitas().getValueAt(filasel, 0);
     
     
     
     String cedula=modelo.cedPaciente(id);
     List<Citas> listaci=modelo.listarCitas(modelo.idPac(cedula));
     for (int a = 0; a < listaci.size(); a++) {
        if (listaci.get(a).getId_cita().equals(id)) {
           vista.getTxtficha().setText(listaci.get(a).getId_cita());
           vista.getJdateFecha().setDate(listaci.get(a).getFecha_cita());
           vista.getTxthora().setText(listaci.get(a).getHora_cita());
           vista.getJareades().setText(listaci.get(a).getMotivo());
        }
        
      }
     cargardatospacientes();  
     cargardatosdoct();
} 
private void cargardatosdoct() {
     int filasel = vista.getJtblcitas().getSelectedRow();
        String id=(String) vista.getJtblcitas().getValueAt(filasel, 0);
        
List<Doctor> listadoc=modelo.cargardoctores(id);
     for (int a = 0; a < listadoc.size(); a++) {
        
           String ceduladoc ;
           vista.getTxtceduladoc().setText(listadoc.get(a).getCedula_doc());
           
           vista.getTxtNombredoc().setText(listadoc.get(a).getNombres());
           
           vista.getTxtapellidosdoc().setText(listadoc.get(a).getApellidos());
           
        
        
      }
}
  
private void cargardatospacientes() {
 int filasel = vista.getJtblcitas().getSelectedRow();
        String id=(String) vista.getJtblcitas().getValueAt(filasel, 0);
           
        List<Paciente> listaper=modelo.cargarpacientes(id);
     for (int a = 0; a < listaper.size(); a++) {   
       
            
          
           vista.getTxtNombrePac().setText(listaper.get(a).getNombres());
           vista.getTxtApellidosPac().setText(listaper.get(a).getApellidos());
           vista.getTxtcedulapac().setText(vistamenu.getLblCedulapac().getText());
           
        
        
      }
        
}
   
   
private void setEventoMouseClicked(JTable tbl)
    {
        tbl.addMouseListener(new java.awt.event.MouseAdapter() {

        @Override
        public void mouseClicked(MouseEvent e) {
            System.out.println("CLICK EN TABLA");
            try {
                cargardatosTxtcie(e);
                cambio="actualizar";
                vista.getBtnAgendar1().setText("ACTUALIZAR");
            } catch (IOException ex) {
                Logger.getLogger(Controller_CrudTratamiento.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        });
    }
   
   
   private void limpiar(){
       generarSerie();
       vista.getTxtceduladoc().setText("");
       vista.getTxtNombredoc().setText("");
       vista.getTxtapellidosdoc().setText("");
       vista.getTxtcedulapac().setText("");
       vista.getTxtNombrePac().setText("");
       vista.getTxtApellidosPac().setText("");
       vista.getJdateFecha().setDate(null);
       vista.getTxthora().setText("");
       vista.getJareades().setText("");
       vista.getBtnAgendar1().setText("AGENDAR");
       cambio="agendar";
   }
   
   private void Inhabiltar(){
       vista.getTxtficha().setEnabled(true);
       vista.getTxtceduladoc().setEnabled(true);
       vista.getTxtNombredoc().setEnabled(true);
       vista.getTxtcedulapac().setEnabled(true);
       vista.getTxtNombrePac().setEnabled(true);
       vista.getTxtApellidosPac().setEnabled(true);
       
   }
   
          
        
            
             
    
        
        
        
   
          
         
}