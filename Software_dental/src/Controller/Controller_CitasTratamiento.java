
package Controller;

import Model.ConexionPg;
import Model.Model_Citas;
import Model.Model_CitasTratamiento;
import Model.Persona;
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
 
      private JFileChooser jfc;
      
    public Controller_CitasTratamiento(Model_Citas modelo, Vista_Citas_Tratamiento vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setVisible(true);
    }
    
    public void iniciar(){
        vista.getBtnAgendar1().addActionListener(l->crearcrudcie10());
        vista.getBtnAgendar1().addActionListener(l->crearcrudcie10());
        vista.getBtnAgendar1().addActionListener(l->crearcrudcie10());
        modelo.cargar_doc(vista.getCbosceduladoc());
    }
    
    public void crearcrudcie10(){
    System.out.println("creando crud");
    String id_cita;
    String id_paciente;
    String hora_cita;
    String motivo;
    String id_doctor;
     
    
    id_cita=vista.getTxtficha().getText();
    id_paciente=vista.getCboscedulapac().getModel().getSelectedItem().toString();
    hora_cita=vista.getTxthora().getText();
    motivo=vista.getJareades().getText();
    id_doctor=vista.getCbosceduladoc().getModel().getSelectedItem().toString();
    
    
    
     Model_Citas mci= new Model_Citas();
     
    mci.setId_cita(id_cita);
    mci.setId_paciente(id_paciente);
    mci.setHora_cita(hora_cita);
    mci.setMotivo(motivo);
    mci.setId_doctor(id_doctor);
     
     if (mci.crearCita())    
     {
         JOptionPane.showMessageDialog(vista, "Cita creada correctamente ");
     }else {
         JOptionPane.showMessageDialog(vista, "No se pudo crear  ");
          
     }
    }
    
    public void editarcita(){
    String id_cita;
    String id_paciente;
    String hora_cita;
    String motivo;
    String id_doctor;
     
    id_cita=vista.getTxtficha().getText();
    id_paciente=vista.getCboscedulapac().getModel().getSelectedItem().toString();
    hora_cita=vista.getTxthora().getText();
    motivo=vista.getJareades().getText();
    id_doctor=vista.getCbosceduladoc().getModel().getSelectedItem().toString();
    
     Model_Citas mci= new Model_Citas();
     
    mci.setId_cita(id_cita);
    mci.setId_paciente(id_paciente);
    mci.setHora_cita(hora_cita);
    mci.setMotivo(motivo);
    mci.setId_doctor(id_doctor);
    
     if (mci.actualizarCita())    {
         //cargarcie();
         JOptionPane.showMessageDialog(vista, "Cita editada correctamente ");
     }else {
         JOptionPane.showMessageDialog(vista, "No se pudo Editar  ");
          
     }
    }
    
    public void eliminarcrudcie10(){
    String id_cita;
    String id_paciente;
    String hora_cita;
    String motivo;
    String id_doctor;
     
    
    id_cita=vista.getTxtficha().getText();
    id_paciente=vista.getCboscedulapac().getModel().getSelectedItem().toString();
    hora_cita=vista.getTxthora().getText();
    motivo=vista.getJareades().getText();
    id_doctor=vista.getCbosceduladoc().getModel().getSelectedItem().toString();
     
     Model_Citas mci= new Model_Citas();
     
    mci.setId_cita(id_cita);
    mci.setId_paciente(id_paciente);
    mci.setHora_cita(hora_cita);
    mci.setMotivo(motivo);
    mci.setId_doctor(id_doctor);
    
     if (mci.eliminarcita())    {
         //cargarcie();
         JOptionPane.showMessageDialog(vista, "Cita eliminada correctamente ");
     }else {
         JOptionPane.showMessageDialog(vista, "No se pudo Eliminar  ");
          
     }
    }
    
   
    /*
    private void  cargarcie(){
        
        vista.getTblListacie().setDefaultRenderer(Object.class, new ImageTabla());//La manera de renderizar la tabla
        vista.getTblListacie().setRowHeight(100);
        
        
        DefaultTableModel tbmodel ; 
        tbmodel = (DefaultTableModel) vista.getTblListacie().getModel() ;
        tbmodel.setNumRows(0);
        
        List<Cie_10> milista = modelo.listarCie10();
        Holder<Integer> i = new Holder<>(0);
        milista.stream().forEach(ci -> {
       
           tbmodel.addRow(new Object[3]);
           vista.getTblListacie().setValueAt(ci.getId_cie(), i.value, 0);
           vista.getTblListacie().setValueAt(ci.getTitulo(), i.value, 1);
           vista.getTblListacie().setValueAt(ci.getPatologia(), i.value, 2);
           
           i.value++;
        });
                
    }
    
    private void generarSerie() {
        
        String serie = modelo.NumId();
        if (serie == null) {
            vista.getTxtcodigocie().setText("00001");
        } else {
            int inc = Integer.parseInt(serie);
            inc++;
            vista.getTxtcodigocie().setText("0000" + inc);

        }
    
}
    
     private void busqueda(java.awt.event.KeyEvent evt){ 
       DefaultTableModel tbmodel ; 
      
        tbmodel = (DefaultTableModel) vista.getTblListacie().getModel() ; 
     
        tbmodel.setNumRows(0);
        

        List<Cie_10> milista = modelo.listarbuscarcie(vista.getTxtbusquedacie().getText());
        milista.stream().forEach(pe -> {
        String [] filacie = {pe.getId_cie(), pe.getTitulo() ,  pe.getPatologia()} ;
         tbmodel.addRow(filacie);

        });

 }





private void cargardatosTxtcie (java.awt.event.MouseEvent evt) throws IOException{

        List<Cie_10> lp = modelo.listarCie10();
        int xx = vista.getTblListacie().getSelectedRow();
        if (xx != -1) {
            String id = vista.getTblListacie().getValueAt(xx, 0).toString();
            vista.getTxtcodigocie().setText(id);
            String ti = vista.getTblListacie().getValueAt(xx, 1).toString();
            vista.getTxttitulocie().setText(ti);
            
            String pato = vista.getTblListacie().getValueAt(xx, 3).toString();
            vista.getCboxtipopato().setSelectedItem(pato);
            
            JOptionPane.showMessageDialog(vista, "error seleccione una fila");
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




private void setEventoKeytyped(JTextField txt)
    {
        txt.addKeyListener(new java.awt.event.KeyAdapter() {
 
        @Override
        public void keyReleased(KeyEvent e) {
        busqueda(e);
        }
        });
    }


    */
    
   
}