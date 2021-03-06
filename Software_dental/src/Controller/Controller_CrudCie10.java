/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Cie_10;
import Model.ConexionPg;
import Model.Model_Cie10;
import View.Vista_Crud_Cie10;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.xml.ws.Holder;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
/**
 *
 * @author slix0
 */
public class Controller_CrudCie10 {
    private String cambio="guardar";
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
        vista.getBtneditar().addActionListener(l->limpiar());
        vista.getBtneliminar().addActionListener(l->eliminarcrudcie10());
        vista.getBtnimprimircie().addActionListener(l->imprimirlistacie());
        setEventoMouseClicked(vista.getTblListacie());
        setEventoKeytyped(vista.getTxtbusquedacie());
    }
       
    
     private void imprimirlistacie(){
        ConexionPg con =new ConexionPg();
          try {
              JasperReport listado = (JasperReport) JRLoader.loadObject(getClass().getResource("/Reportes/repocie10.jasper"));
            
              JasperPrint jp = JasperFillManager.fillReport(listado, null, con.Con());//cargando el reporte con los datos de la base
          
              JasperViewer jv = new JasperViewer(jp,false);
              jv.setVisible(true);
          } catch (JRException ex) {
              Logger.getLogger(Controller_Rep_Citas.class.getName()).log(Level.SEVERE, null, ex);
          }
    } 
    
    public void crearcrudcie10(){
        if(cambio.equals("guardar"))
        {
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
                 cambio="editar";
                 JOptionPane.showMessageDialog(vista, "CIE10 creado correctamente ");
                 limpiar();
             }else {
                 JOptionPane.showMessageDialog(vista, "No se pudo crear  ");

             }
        }else if(cambio.equals("editar")){
            editarcrudcie10();
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
         cambio="guardar";
         JOptionPane.showMessageDialog(vista, "CIE10 editado correctamente ");
         limpiar();
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
         limpiar();
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
                cambio="editar";
                vista.getBtnguardar().setText("EDITAR");
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
 private void limpiar(){
       vista.getTxtcodigocie().setText("");
       vista.getCbcate().setSelectedIndex(0);
       vista.getTxtitulo().setText("");
       cambio="guardar";
       vista.getBtnguardar().setText("GUARDAR");
   }


}