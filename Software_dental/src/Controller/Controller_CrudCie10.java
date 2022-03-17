/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Cie_10;
import Model.Model_Cie10;
import View.Vista_Crud_Cie10;
import static View.Vista_Crud_Cie10.tblListacie;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.xml.ws.Holder;
/**
 *
 * @author slix0
 */
public class Controller_CrudCie10 {
    
    private Model_Cie10  modelo;
    private Vista_Crud_Cie10 vista ;

    public Controller_CrudCie10 (Model_Cie10 modelo, Vista_Crud_Cie10 vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setVisible(true);
        
        generarSerie();
        iniciar();
    }
    public void iniciar(){
        vista.getBtnguardar().addActionListener(l->crearcrudcie10());
         vista.getBtneditar().addActionListener(l->editarcrudcie10());
          vista.getBtneliminar().addActionListener(l->eliminarcrudcie10());
          setEventoMouseClicked(vista.getTblListacie());
          setEventoKeytyped(vista.getTxtbusquedacie());
    }
    
    public void crearcrudcie10(){
    System.out.println("creando crud");
     String id_cie;
     String titulo;
     String patologia;
     
     id_cie=vista.getTxtcodigocie().getText();
     titulo=vista.getTxttitulocie().getText();
     patologia=vista.getCboxtipopato().getText();
     
     Model_Cie10 mcie= new Model_Cie10();
     
     mcie.setId_cie(id_cie);
     mcie.setTitulo(titulo);
     mcie.setPatologia(patologia);
    
     
     if (mcie.crearCie() == true)    {
         cargarcie();
         JOptionPane.showMessageDialog(vista, "CIE10 crado correctamente ");
     }else {
         JOptionPane.showMessageDialog(vista, "No se pudo crear  ");
          
     }
    }
    
    public void editarcrudcie10(){
      String id_cie;
     String titulo;
     String patologia;
     
     id_cie=vista.getTxtcodigocie().getText();
     titulo=vista.getTxttitulocie().getText();
     
     patologia=vista.getCboxtipopato().getText();
     
     Model_Cie10 mcie= new Model_Cie10();
     mcie.setId_cie(id_cie);
     mcie.setTitulo(titulo);
     mcie.setPatologia(patologia);
     
     if (mcie.actualizarCie() ==true)    {
         cargarcie();
         JOptionPane.showMessageDialog(vista, "CIE10 editadO correctamente ");
     }else {
         JOptionPane.showMessageDialog(vista, "No se pudo Editar  ");
          
     }
    }
    
    public void eliminarcrudcie10(){
      String id_cie;
     String titulo;
     String patologia;
     
     id_cie=vista.getTxtcodigocie().getText();
     titulo=vista.getTxttitulocie().getText();
     patologia=vista.getCboxtipopato().getText();
     
     Model_Cie10 mcie= new Model_Cie10();
     mcie.setId_cie(id_cie);
     mcie.setTitulo(titulo);
     mcie.setPatologia(patologia);
     
     if (mcie.eliminarCie() == true)    {
         cargarcie();
         JOptionPane.showMessageDialog(vista, "CIE10 eliminado correctamente ");
     }else {
         JOptionPane.showMessageDialog(vista, "No se pudo Eliminar  ");
          
     }
    }
    
    
    
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
    
    private void generarSerie(){
        
        String serie = modelo.NumSerie();
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
            
            String patol = vista.getTblListacie().getValueAt(xx, 2).toString();
            vista.getCboxtipopato().setText(patol);
            
        }
        else{
            
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



}