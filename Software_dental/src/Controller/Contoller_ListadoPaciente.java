
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Model_ListadoPacientes;
import Model.Paciente;
import View.MenuPrincipal;
import View.Vista_ListadoPacientes;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.xml.ws.Holder;

/**
 *
 * @author slix0
 */
public class Contoller_ListadoPaciente {
    
    private Model_ListadoPacientes modelo;
    private Vista_ListadoPacientes vista;
    private MenuPrincipal vistaMenu ;
    public Contoller_ListadoPaciente(Model_ListadoPacientes modelo, Vista_ListadoPacientes vista, MenuPrincipal vistaMenu) {
        this.modelo = modelo;
        this.vista = vista;
        this.vistaMenu = vistaMenu; 
        vista.setVisible(true);
        iniciarcontrol ();
        
        
    }
    
     public void iniciarcontrol (){
         cargarPersonas ();
           KeyListener kl = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                cargarPersonasbusqueda(vista.getTxtbuscar().getText());
            }
        };
         
          vista.getTxtbuscar().addKeyListener(kl);
           toquetabla();
          
     }
     
     
     
     public void toquetabla(){
          vista.getJtbllistadopac().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                if (e.getClickCount() == 1) {
                    try {
                        System.out.println("Se ha hecho un click");
                        cargardatosTxt();
                    } catch (IOException ex) {
                        Logger.getLogger(Contoller_ListadoPaciente.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                if (e.getClickCount() == 2) {
                    try {
                        System.out.println("Se ha hecho doble click");
                        cargardatosTxt();
                    } catch (IOException ex) {
                        Logger.getLogger(Contoller_ListadoPaciente.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
        );
     
     }
     
     
     
     
     private void  cargarPersonas (){
        
        vista.getJtbllistadopac().setDefaultRenderer(Object.class, new  ImagenTabla()); 
        vista.getJtbllistadopac().setRowHeight(100);
      
        DefaultTableModel tbmodel ; 

        tbmodel = (DefaultTableModel) vista.getJtbllistadopac().getModel() ; 
  
        tbmodel.setNumRows(0);

        List<Paciente> milista = modelo.listarpac();
     
        Holder<Integer> i = new Holder<>(0);
        milista.stream().forEach(pe -> {

      tbmodel.addRow( new Object[10]);// creo una fila vacia
       //dibujar elementos de la tabla 
       vista.getJtbllistadopac().setValueAt(pe.getCedula(), i.value, 0);
       vista.getJtbllistadopac().setValueAt(pe.getNombres(), i.value, 1);
       vista.getJtbllistadopac().setValueAt(pe.getApellidos(), i.value, 2);
       vista.getJtbllistadopac().setValueAt(pe.getCelular(), i.value, 3);
       vista.getJtbllistadopac().setValueAt(pe.getDireccion(), i.value, 4);
        vista.getJtbllistadopac().setValueAt(pe.getCiudad(), i.value, 5);
       vista.getJtbllistadopac().setValueAt(pe.getGenero(), i.value, 6);
         try{
                    byte[] bi = pe.getFoto();
                    BufferedImage image = null;
                    InputStream in = new ByteArrayInputStream(bi);
                    image = ImageIO.read(in);
                    ImageIcon imgi = new ImageIcon(image.getScaledInstance(60, 60, 0));
                   DefaultTableCellRenderer render = new DefaultTableCellRenderer();
                 render.setIcon(imgi);
                   vista.getJtbllistadopac().setValueAt(new JLabel(imgi), i.value, 7);

                }catch(Exception ex){
                      vista.getJtbllistadopac().setValueAt(new JLabel("No imagen"),i.value, 7);
  
                }
         vista.getJtbllistadopac().setValueAt(pe.getFecha_nac(), i.value, 8);
          vista.getJtbllistadopac().setValueAt(pe.getTipo_sang(), i.value, 9);
//      getJtbllistadopac
        i.value++;

           
        });
     
     
    
}
     
      private void  cargarPersonasbusqueda (String busqueda){
        
        vista.getJtbllistadopac().setDefaultRenderer(Object.class, new  ImagenTabla()); 
        vista.getJtbllistadopac().setRowHeight(100);
      
        DefaultTableModel tbmodel ; 

        tbmodel = (DefaultTableModel) vista.getJtbllistadopac().getModel() ; 
  
        tbmodel.setNumRows(0);

        List<Paciente> milista = modelo.listarpacbuscar(busqueda);
     
        Holder<Integer> i = new Holder<>(0);
        milista.stream().forEach(pe -> {

      tbmodel.addRow( new Object[10]);// creo una fila vacia
       //dibujar elementos de la tabla 
       vista.getJtbllistadopac().setValueAt(pe.getCedula(), i.value, 0);
       vista.getJtbllistadopac().setValueAt(pe.getNombres(), i.value, 1);
       vista.getJtbllistadopac().setValueAt(pe.getApellidos(), i.value, 2);
       vista.getJtbllistadopac().setValueAt(pe.getCelular(), i.value, 3);
       vista.getJtbllistadopac().setValueAt(pe.getDireccion(), i.value, 4);
        vista.getJtbllistadopac().setValueAt(pe.getCiudad(), i.value, 5);
       vista.getJtbllistadopac().setValueAt(pe.getGenero(), i.value, 6);
     
         try{
                    byte[] bi = pe.getFoto();
                    BufferedImage image = null;
                    InputStream in = new ByteArrayInputStream(bi);
                    image = ImageIO.read(in);
                    ImageIcon imgi = new ImageIcon(image.getScaledInstance(60, 60, 0));
                   DefaultTableCellRenderer render = new DefaultTableCellRenderer();
                 render.setIcon(imgi);
                   vista.getJtbllistadopac().setValueAt(new JLabel(imgi), i.value, 7);

                }catch(Exception ex){
                      vista.getJtbllistadopac().setValueAt(new JLabel("No imagen"),i.value, 7);
                  
                }
         vista.getJtbllistadopac().setValueAt(pe.getFecha_nac(), i.value, 8);
          vista.getJtbllistadopac().setValueAt(pe.getTipo_sang(), i.value, 9);
//      
        i.value++;

      
        });
                
    }
      
      private void cargardatosTxt () throws IOException{

        List<Paciente> lp = modelo.listarpac();
         
        int xx = vista.getJtbllistadopac().getSelectedRow();
        if (xx != -1) {
            String id = vista.getJtbllistadopac().getValueAt(xx, 0).toString();
            String pro = id ;
            vistaMenu.getLblCedulapac().setText(id);
            String nom = vista.getJtbllistadopac().getValueAt(xx, 1).toString();
            vistaMenu.getLblnombrescomp().setText(nom);
            String apellido = vista.getJtbllistadopac().getValueAt(xx, 2).toString();
            vistaMenu.getLabelapellido().setText(apellido);
           for (int i = 0; i < lp.size(); i++) {
                if (lp.get(i).getCedula().equals(pro)) {
       vistaMenu.getLblCedulapac().setText(id);
       vistaMenu.getLblnombrescomp().setText(nom);
       vistaMenu.getLabelapellido().setText(apellido);
            
            System.out.println(id+""+nom+apellido);
                    
                }
            }
           
            }
            else {
            JOptionPane.showMessageDialog(vista, "error seleccione una fila");
            
            }
  

}

}

