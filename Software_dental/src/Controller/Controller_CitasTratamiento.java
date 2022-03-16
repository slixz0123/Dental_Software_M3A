
package Controller;

import Model.Model_Citas;
import Model.Model_CitasTratamiento;
import View.Vista_Citas_Tratamiento;
import java.sql.Date;
import java.text.SimpleDateFormat;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public class Controller_CitasTratamiento {
    private Model_CitasTratamiento modelo;
    private Vista_Citas_Tratamiento vista;
 
      private JFileChooser jfc;
      
    public Controller_CitasTratamiento(Model_CitasTratamiento modelo, Vista_Citas_Tratamiento vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setVisible(true);
    }
    
    public void iniciar(){
        vista.getBtnAgendar1().addActionListener(l->crearcrudcie10());
    }
    
    public void crearcrudcie10(){
    System.out.println("creando crud");
    String id_cita;
    String id_paciente;
    String hora_cita;
    String motivo;
    String id_doctor;
     
    /*
    SimpleDateFormat dateFormat = new SimpleDateFormat ("yyy-MM-dd");
     java.util.Date date= vista.jdateFecha.getDate();
     
     long d = date.getTime();
     String fechael=dateFormat.format(d);
     java.sql.Date fecha = new java.sql.Date (d);
    */
    
     id_cita=vista.getTxtficha().getText();
    //id_paciente=vista.gett.getText();
     hora_cita=vista.getTxthora().getText();
     motivo=vista.getJareades().getText();
    // id_doctor=vista.gett.getText();
     
     Model_Citas mci= new Model_Citas();
     
     mci.setId_cita(id_cita);
     mci.setHora_cita(hora_cita);
     mci.setMotivo(motivo);
    
     
     if (mci.crearCita())    {
         //cargarcie();
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
    //id_paciente=vista.gett.getText();
     hora_cita=vista.getTxthora().getText();
     motivo=vista.getJareades().getText();
    // id_doctor=vista.gett.getText();
     
     Model_Citas mci= new Model_Citas();
     
     mci.setId_cita(id_cita);
     mci.setHora_cita(hora_cita);
     //mci.setMotivo(motivo);
     
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
     
    /*
    SimpleDateFormat dateFormat = new SimpleDateFormat ("yyy-MM-dd");
     java.util.Date date= vista.jdateFecha.getDate();
     
     long d = date.getTime();
     String fechael=dateFormat.format(d);
     java.sql.Date fecha = new java.sql.Date (d);
    */
    
     id_cita=vista.getTxtficha().getText();
    //id_paciente=vista.gett.getText();
     hora_cita=vista.getTxthora().getText();
     motivo=vista.getJareades().getText();
    // id_doctor=vista.gett.getText();
     
     Model_Citas mci= new Model_Citas();
     
     mci.setId_cita(id_cita);
     mci.setHora_cita(hora_cita);
     mci.setMotivo(motivo);
    
     if (mci.eliminarcita())    {
         //cargarcie();
         JOptionPane.showMessageDialog(vista, "Cita eliminada correctamente ");
     }else {
         JOptionPane.showMessageDialog(vista, "No se pudo Eliminar  ");
          
     }
    }
    
    
    
     /*private void  cargarcita(){
        
        vista.getTblListacie().setDefaultRenderer(Object.class, new ImageTabla());//La manera de renderizar la tabla
        vista.getTblListacie().setRowHeight(100);
        
        
        DefaultTableModel tbmodel ; 
        tbmodel = (DefaultTableModel) vista.getTblListacie().getModel() ;
        tbmodel.setNumRows(0);
        
        List<Cie_10> milista = modelo.listarCie10();
        Holder<Integer> i = new Holder<>(0);
        milista.stream().forEach(ci -> {
       
           tbmodel.addRow(new Object[9]);
           vista.getTblListacie().setValueAt(ci.getId_cie(), i.value, 0);
           vista.getTblListacie().setValueAt(ci.getTitulo(), i.value, 1);
           vista.getTblListacie().setValueAt(ci.getPatologia(), i.value, 2);
           
           i.value++;
        });
    
}*/
}