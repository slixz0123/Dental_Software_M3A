
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.ConexionPg;
import Model.Doctor;
import Model.Model_ListadoEspecialistas;
import Model.Model_ListadoPacientes;
import Model.Paciente;
import View.MenuPrincipal;
import View.Vista_ListadoEspecialista;
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
public class Contoller_ListadoEspecialista {
    
    private Model_ListadoEspecialistas modelo;
    private Vista_ListadoEspecialista vista;
    private MenuPrincipal vistaMenu ;
    public Contoller_ListadoEspecialista(Model_ListadoEspecialistas modelo, Vista_ListadoEspecialista vista, MenuPrincipal vistaMenu) {
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
                cargarEspecialistasbusqueda(vista.getTxtbuscaresp().getText());
            }
        };
         
          vista.getTxtbuscaresp().addKeyListener(kl);
           toquetabla();
           
           vista.getBtnimprimiresp().addActionListener(l-> imprimirlistaEspecialista());
          
     }
     
     
     
     public void toquetabla(){
          vista.getJtbllistadoesp().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                if (e.getClickCount() == 1) {
                    try {
                        System.out.println("Se ha hecho un click");
                        cargardatosTxt();
                    } catch (IOException ex) {
                        Logger.getLogger(Contoller_ListadoEspecialista.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                if (e.getClickCount() == 2) {
                    try {
                        System.out.println("Se ha hecho doble click");
                        cargardatosTxt();
                    } catch (IOException ex) {
                        Logger.getLogger(Contoller_ListadoEspecialista.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
        );
     
     }
     
     
     
     
     private void  cargarPersonas (){
        
        vista.getJtbllistadoesp().setDefaultRenderer(Object.class, new  ImagenTabla()); 
        vista.getJtbllistadoesp().setRowHeight(100);
      
        DefaultTableModel tbmodel ; 

        tbmodel = (DefaultTableModel) vista.getJtbllistadoesp().getModel() ; 
  
        tbmodel.setNumRows(0);

        List<Doctor> milista = modelo.listarEspecialista();
     
        Holder<Integer> i = new Holder<>(0);
        milista.stream().forEach(pe -> {

      tbmodel.addRow( new Object[10]);// creo una fila vacia
       //dibujar elementos de la tabla 
       vista.getJtbllistadoesp().setValueAt(pe.getCedula(), i.value, 0);
       vista.getJtbllistadoesp().setValueAt(pe.getNombres(), i.value, 1);
       vista.getJtbllistadoesp().setValueAt(pe.getApellidos(), i.value, 2);
       vista.getJtbllistadoesp().setValueAt(pe.getCelular(), i.value, 3);
       vista.getJtbllistadoesp().setValueAt(pe.getDireccion(), i.value, 4);
       vista.getJtbllistadoesp().setValueAt(pe.getCiudad(), i.value, 5);
       vista.getJtbllistadoesp().setValueAt(pe.getGenero(), i.value, 6);
       vista.getJtbllistadoesp().setValueAt(pe.getEspecialidad(), i.value, 7);
       vista.getJtbllistadoesp().setValueAt(pe.getCargo(), i.value, 8);
       try{
                    byte[] bi = pe.getFoto();
                    BufferedImage image = null;
                    InputStream in = new ByteArrayInputStream(bi);
                    image = ImageIO.read(in);
                    ImageIcon imgi = new ImageIcon(image.getScaledInstance(60, 60, 0));
                   DefaultTableCellRenderer render = new DefaultTableCellRenderer();
                 render.setIcon(imgi);
                   vista.getJtbllistadoesp().setValueAt(new JLabel(imgi), i.value, 9);

                }catch(Exception ex){
                      vista.getJtbllistadoesp().setValueAt(new JLabel("No imagen"),i.value, 9);
  
                }
       i.value++;

           
        });
     
     
    
}
     
      private void  cargarEspecialistasbusqueda (String busqueda){
        
        vista.getJtbllistadoesp().setDefaultRenderer(Object.class, new  ImagenTabla()); 
        vista.getJtbllistadoesp().setRowHeight(30);
      
        DefaultTableModel tbmodel ; 

        tbmodel = (DefaultTableModel) vista.getJtbllistadoesp().getModel() ; 
  
        tbmodel.setNumRows(0);

        List<Doctor> milista = modelo.listarEspbuscar(busqueda);
     
        Holder<Integer> i = new Holder<>(0);
        milista.stream().forEach(pe -> {

      tbmodel.addRow( new Object[10]);// creo una fila vacia
       //dibujar elementos de la tabla 
       vista.getJtbllistadoesp().setValueAt(pe.getCedula(), i.value, 0);
       vista.getJtbllistadoesp().setValueAt(pe.getNombres(), i.value, 1);
       vista.getJtbllistadoesp().setValueAt(pe.getApellidos(), i.value, 2);
       vista.getJtbllistadoesp().setValueAt(pe.getCelular(), i.value, 3);
       vista.getJtbllistadoesp().setValueAt(pe.getDireccion(), i.value, 4);
       vista.getJtbllistadoesp().setValueAt(pe.getCiudad(), i.value, 5);
       vista.getJtbllistadoesp().setValueAt(pe.getGenero(), i.value, 6);
       vista.getJtbllistadoesp().setValueAt(pe.getEspecialidad(), i.value, 7);
       vista.getJtbllistadoesp().setValueAt(pe.getCargo(), i.value, 8);
       try{
                    byte[] bi = pe.getFoto();
                    BufferedImage image = null;
                    InputStream in = new ByteArrayInputStream(bi);
                    image = ImageIO.read(in);
                    ImageIcon imgi = new ImageIcon(image.getScaledInstance(60, 60, 0));
                   DefaultTableCellRenderer render = new DefaultTableCellRenderer();
                 render.setIcon(imgi);
                   vista.getJtbllistadoesp().setValueAt(new JLabel(imgi), i.value, 9);

                }catch(Exception ex){
                      vista.getJtbllistadoesp().setValueAt(new JLabel("No imagen"),i.value, 9);
  
                }
        i.value++;

      
        });
                
    }
      
      private void cargardatosTxt () throws IOException{

        List<Doctor> lp = modelo.listarEspecialista();
         
        int xx = vista.getJtbllistadoesp().getSelectedRow();
        if (xx != -1) {
            String id = vista.getJtbllistadoesp().getValueAt(xx, 0).toString();
            String pro = id ;
            vistaMenu.getLblCedulapac().setText(id);
            String nom = vista.getJtbllistadoesp().getValueAt(xx, 1).toString();
            vistaMenu.getLblnombrescomp().setText(nom);
            String apellido = vista.getJtbllistadoesp().getValueAt(xx, 2).toString();
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

      
       private void imprimirlistaEspecialista(){
        ConexionPg con =new ConexionPg();
          try {
              JasperReport listado = (JasperReport) JRLoader.loadObject(getClass().getResource("/Reportes/Rep_Especialistas.jasper"));
            
              JasperPrint jp = JasperFillManager.fillReport(listado, null, con.Con());
          
              JasperViewer jv = new JasperViewer(jp,false);
              jv.setVisible(true);
          } catch (JRException ex) {
              Logger.getLogger(Controller_Rep_Citas.class.getName()).log(Level.SEVERE, null, ex);
          }
    } 
    
      
      
      
      
}

