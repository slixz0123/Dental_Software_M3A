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
        cargarcie();
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
     String categoria;
     String titulo;
     
     
     id_cie=vista.getTxtcodigocie().getText();
     categoria=vista.getCbcate().getModel().getSelectedItem().toString();
     titulo=vista.getTxtitulo().getText();
     
     Model_Cie10 mcie= new Model_Cie10();
     
     mcie.setId_cie(id_cie);
     
     mcie.setTitulo(titulo);
     mcie.setCategoria(categoria);
     if (mcie.crearCie())    {
         cargarcie();
         
         JOptionPane.showMessageDialog(vista, "CIE10 creado correctamente ");
         
     }else {
         JOptionPane.showMessageDialog(vista, "No se pudo crear  ");
          
     }
    }
    
    public void editarcrudcie10(){
     String id_cie;
     String categoria;
     String titulo;
     
     
     id_cie=vista.getTxtcodigocie().getText();
     vista.getTxtcodigocie().setEnabled(true);
     
     categoria=vista.getCbcate().getSelectedItem().toString();
     titulo=vista.getTxtitulo().getText();
     
     Model_Cie10 mcie= new Model_Cie10();
     
     mcie.setId_cie(id_cie);
     mcie.setCategoria(categoria);
     mcie.setTitulo(titulo);
     
   
     
     if (mcie.actualizarCie10())    {
         cargarcie();
         
         JOptionPane.showMessageDialog(vista, "CIE10 editado correctamente ");
     }else {
         JOptionPane.showMessageDialog(vista, "No se pudo crear  ");
          
     }
        
    }
    
    public void eliminarcrudcie10(){
    String id_cie;
     String categoria;
     String titulo;
     
     
     id_cie=vista.getTxtcodigocie().getText();
     categoria=vista.getCbcate().getModel().getSelectedItem().toString();
     titulo=vista.getTxtitulo().getText();
     
     Model_Cie10 mcie= new Model_Cie10();
     
     mcie.setId_cie(id_cie);
     
     mcie.setTitulo(titulo);
     mcie.setCategoria(categoria);
     if (mcie.eliminarCie())    {
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
           vista.getTblListacie().setValueAt(ci.getCategoria(), i.value, 1);
           vista.getTblListacie().setValueAt(ci.getTitulo(), i.value, 2);
           
           
           i.value++;
        });
                
    }
    
       
     private void busqueda(java.awt.event.KeyEvent evt){ 
       DefaultTableModel tbmodel ; 
      
        tbmodel = (DefaultTableModel) vista.getTblListacie().getModel() ; 
     
        tbmodel.setNumRows(0);
        

        List<Cie_10> milista = modelo.listarbuscarcie(vista.getTxtbusquedacie().getText());
        milista.stream().forEach(pe -> {
        String [] filacie = {pe.getId_cie() ,  pe.getCategoria(), pe.getTitulo()} ;
         tbmodel.addRow(filacie);

        });

 }





private void cargardatosTxtcie (java.awt.event.MouseEvent evt) throws IOException{

        List<Cie_10> lp = modelo.listarCie10();
        int xx = vista.getTblListacie().getSelectedRow();
        if (xx != -1) {
            String id = vista.getTblListacie().getValueAt(xx, 0).toString();
            vista.getTxtcodigocie().setText(id);
            vista.getTxtcodigocie().setEnabled(false);
            
            
            
            String cat = vista.getTblListacie().getValueAt(xx, 1).toString();
            vista.getCbcate().setSelectedItem(cat);
            
            String ti = vista.getTblListacie().getValueAt(xx, 2).toString();
            vista.getTxtitulo().setText(ti);
            
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