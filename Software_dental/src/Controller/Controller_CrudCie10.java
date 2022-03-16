/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Cie_10;
import Model.Model_Cie10;
import View.Vista_Crud_Cie10;
import java.util.List;
import javax.swing.JOptionPane;
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
        iniciar();
    }
    public void iniciar(){
        vista.getBtnguardar().addActionListener(l->crearcrudcie10());
    }
    
    public void crearcrudcie10(){
    System.out.println("creando crud");
     String id_cie;
     String titulo;
     String patologia;
     
     id_cie=vista.getTxtcodigocie().getText();
     titulo=vista.getTxttitulocie().getText();
     patologia=vista.getCboxtipopato().getModel().getSelectedItem().toString();
     
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
     patologia=vista.getCboxtipopato().getModel().getSelectedItem().toString();
     
     Model_Cie10 mcie= new Model_Cie10();
     mcie.setId_cie(id_cie);
     mcie.setTitulo(titulo);
     mcie.setPatologia(patologia);
     
     if (mcie.actualizarCie())    {
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
     patologia=vista.getCboxtipopato().getModel().getSelectedItem().toString();
     
     Model_Cie10 mcie= new Model_Cie10();
     mcie.setId_cie(id_cie);
     mcie.setTitulo(titulo);
     mcie.setPatologia(patologia);
     
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
       
           tbmodel.addRow(new Object[9]);
           vista.getTblListacie().setValueAt(ci.getId_cie(), i.value, 0);
           vista.getTblListacie().setValueAt(ci.getTitulo(), i.value, 1);
           vista.getTblListacie().setValueAt(ci.getPatologia(), i.value, 2);
           
           i.value++;
        });
                
    }
    
}
    

