
package Controller;

import Model.Citas;
import Model.ConexionPg;
import Model.Doctor;
import Model.Model_Citas;
import Model.Model_CitasTratamiento;
import Model.Paciente;
import Model.Persona;
import View.MenuPrincipal;
import View.Vista_Citas_Tratamiento;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.xml.ws.Holder;


public class Controller_CitasTratamiento {
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
        cargarcitas();
    }
    
    public void iniciar(){
        generarSerie();
        vista.getBtnAgendar1().addActionListener(l->crearcitas());
        vista.getBtnACTU().addActionListener(l->editarcita());
        vista.getBtnELIM().addActionListener(l->eliminarcita());
        setEventoMouseClicked(vista.getJtblcitas());
        vista.getBtncargar().addActionListener(l->cargardatosexternosconcedula());
    
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
         JOptionPane.showMessageDialog(vista, "Cita creada correctamente ");
         limpiar();
     }else {
         JOptionPane.showMessageDialog(vista, "No se pudo crear  ");
          
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
         JOptionPane.showMessageDialog(vista, "Cita editada correctamente ");
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
         JOptionPane.showMessageDialog(vista, "Cita eliminada correctamente ");
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
        
        List<Citas> milista = modelo.listarCitas();
        Holder<Integer> i = new Holder<>(0);
        milista.stream().forEach(ci -> {
       
           tbmodel.addRow(new Object[6]);
           vista.getJtblcitas().setValueAt(ci.getId_cita(), i.value, 0);
           vista.getJtblcitas().setValueAt(ci.getId_paciente(), i.value, 1);
           vista.getJtblcitas().setValueAt(ci.getFecha_cita(), i.value, 2);
           vista.getJtblcitas().setValueAt(ci.getHora_cita(), i.value, 3);
           vista.getJtblcitas().setValueAt(ci.getMotivo(), i.value, 4);
           vista.getJtblcitas().setValueAt(ci.getId_doctor(), i.value, 5);
           
           i.value++;
        });
                
    }
   
   
   private void cargardatosTxtcie (java.awt.event.MouseEvent evt) throws IOException{

        List<Citas> lp = modelo.listarCitas();
        int xx = vista.getJtblcitas().getSelectedRow();
        if (xx != -1) {
            String id = vista.getJtblcitas().getValueAt(xx, 0).toString();
            vista.getTxtficha().setText(id);
            vista.getTxtficha().setEnabled(false);
            
            
            String idpa = vista.getJtblcitas().getValueAt(xx, 1).toString();
            vista.getTxtcedulapac().setText(idpa);
            
            String fecha = vista.getJtblcitas().getValueAt(xx, 2).toString();
            vista.getJdateFecha().setDateFormatString(fecha);
            
            
            String hora= vista.getJtblcitas().getValueAt(xx, 3).toString();
            vista.getTxthora().setText(hora);
            
            
            
            
            
            String motivo = vista.getJtblcitas().getValueAt(xx, 4).toString();
            vista.getJareades().setText(motivo);
            
            String iddoc = vista.getJtblcitas().getValueAt(xx, 5).toString();
            vista.getTxtceduladoc().setText(iddoc);
         
            llenartxtsobrantesdoc ();   
        }
        
        else{
            
            JOptionPane.showMessageDialog(vista, "error seleccione una fila");
        }
        
} 

   
   public void llenartxtsobrantesdoc () {
           Model_Citas mc = new Model_Citas();
       
            String id2 = vista.getTxtceduladoc().getText();
           // pac.cargartxtsobrantes(id2);
            List<Doctor> milistadoc =  mc.cargartxtsobrantesdoc(id2);
            for(int i = 0 ; i < milistadoc.size() ; i++){
            vista.getTxtceduladoc().setText(milistadoc.get(i).getCedula_doc()) ;
            vista.getTxtNombredoc().setText(milistadoc.get(i).getCorreo()) ;
            vista.getTxtApellidosPac().setText(milistadoc.get(i).getProvincia()) ;
            
            }          
    } 
   
   
   
private void setEventoMouseClicked(JTable tbl)
    {
        tbl.addMouseListener(new java.awt.event.MouseAdapter() {

        @Override
        public void mouseClicked(MouseEvent e) {
            try {
                cargardatosTxtcie(e);
            } catch (IOException ex) {
                Logger.getLogger(Controller_CrudPaciente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        });
    }
   
   
   private void limpiar(){
       vista.getTxtficha().setText("");
       vista.getTxtceduladoc().setText("");
       vista.getTxtNombredoc().setText("");
       vista.getTxtapellidosdoc().setText("");
       vista.getTxtcedulapac().setText("");
       vista.getTxtNombrePac().setText("");
       vista.getTxtApellidosPac().setText("");
       vista.getJdateFecha().setDate(null);
       vista.getTxthora().setText("");
       vista.getJareades().setText("");
   }
   
   private void Inhabiltar(){
       vista.getTxtficha().setEnabled(true);
       vista.getTxtceduladoc().setEnabled(true);
       vista.getTxtNombredoc().setEnabled(true);
       vista.getTxtcedulapac().setEnabled(true);
       vista.getTxtNombrePac().setEnabled(true);
       vista.getTxtApellidosPac().setEnabled(true);
       
   }
   
    public void cargardatosexternosconcedula(){
       
        
         String id2 = vistamenu.getLblCedulapac().getText();
           // pac.cargartxtsobrantes(id2);
            vista.getTxtcedulapac().setText(id2);
            vista.getTxtNombrePac().setText(vistamenu.getLblnombrescomp().getText());
            vista.getTxtApellidosPac().setText(vistamenu.getLabelapellido().getText());
          
        
            
             
      cargardatosexternosIdmed();
        
        
    }
    
     public void cargardatosexternosIdmed(){
       
        //String iddoc =(String) vistamenu.getJcbDocs().getSelectedItem().toString().subSequence(0, 10);
       
            vista.getTxtceduladoc().setText(vistamenu.getJcbDocs().getSelectedItem().toString().subSequence(0, 10).toString());
            vista.getTxtNombredoc().setText(vistamenu.getJcbDocs().getSelectedItem().toString().subSequence(11, 16).toString());
             vista.getTxtapellidosdoc().setText(vistamenu.getJcbDocs().getSelectedItem().toString().subSequence(17, 24).toString());
            
         
              
            }
        
        
        
   
          
         
}