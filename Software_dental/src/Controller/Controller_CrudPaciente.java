/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Model_Paciente;
import Model.Paciente;
import View.Crud_Paciente;
import View.MenuPrincipal;
import java.awt.Component;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.xml.ws.Holder;

/**
 *
 * @author slix0
 */
public class Controller_CrudPaciente {
    private Model_Paciente modelo ; 
 JFileChooser jfc = new JFileChooser();
 private Crud_Paciente vista ; 
 private FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivo de Imagen","jpg","png");

    
      public Controller_CrudPaciente(Model_Paciente modelo, Crud_Paciente vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setVisible(true);
          
       // vista.getjDialog1().setLocationRelativeTo(null);
       iniciarcontrol();
       cargarPersonas();
        
   
    }
    
      
      
      
      
    
      public void iniciarcontrol (){
          generarSerie();
          vista.getBtnexaminar().addActionListener(l-> btnexaminar());
          vista.getBtnguardarpac().addActionListener(l-> crearpaciente());
          cargarPersonas();
          vista.getBtneditar().addActionListener(l-> editarpaciente());
          
          
          KeyListener kl = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                cargarPersonasbusqueda(vista.getTxtbusqueda().getText());
            }
        };
         
          vista.getTxtbusqueda().addKeyListener(kl);
           setEventoMouseClicked(vista.getJtbPacientes());
          vista.getBtneliminar().addActionListener(l->eliminar());
        
          
          
      }
      
      
      
      
      private void generarSerie() {
      String   serie = modelo.NumSerie();
        if (serie == null) {
            vista.getLabelserie().setText("1");
        } else {
            int inc = Integer.parseInt(serie);
            inc++;
            vista.getLabelserie().setText("" + inc);

        }
    }
      
      
      
      
      
      
       private void setEventoMouseClicked(JTable tbl)
    {
        tbl.addMouseListener(new java.awt.event.MouseAdapter() {

        @Override
        public void mouseClicked(MouseEvent e) {
            try {
                cargardatosTxt(e);
            
            } catch (IOException ex) {
                Logger.getLogger(Controller_CrudPaciente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        });
    }
      
    public  void btnexaminar (){
        JFileChooser j = new JFileChooser();
        FileNameExtensionFilter fil = new FileNameExtensionFilter("JPG, PNG & GIF","jpg","png","gif");
        j.setFileFilter(fil);
        
        int s = j.showOpenDialog(this.jfc);
        if(s == JFileChooser.APPROVE_OPTION){
             try {
                 String ruta = j.getSelectedFile().getAbsolutePath();
                 vista.getTxtruta().setText(ruta);
                 Image imagen = ImageIO.read(j.getSelectedFile()).getScaledInstance(vista.getLablefoto().getWidth(), vista.getLablefoto().getHeight(), Image.SCALE_DEFAULT);
                 Icon ico = new ImageIcon (imagen);
                 vista.getLablefoto().setIcon(ico);
             } catch (IOException ex) {
                 Logger.getLogger(Controller_CrudPaciente.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
    }
    
    public void limpiartxt(){
    vista.getTxtced().setText("");
    vista.getYxynom().setText("");
    vista.getTxtapellidos().setText("");
    vista.getTxtcelular().setText("");
    vista.getTxttelefono().setText("");
    vista.getTxtdireccion().setText("");
    vista.getTxtcorreo().setText("");
    vista.getTxtprovincia().setText("");
    vista.getTxtciudad().setText("");
    vista.getCmgenero().setSelectedIndex(0);
   
    vista.getLablefoto().setText("");
    vista.getCbSangre().setSelectedIndex(0);
    vista.getJdcFecha().setDate(null);
    vista.getTxtruta().setText("");
    vista.getLablefoto().setIcon(null);
    }
    
      private void cargardatosTxt (java.awt.event.MouseEvent evt) throws IOException{

        List<Paciente> lp = modelo.listarpac();
         MenuPrincipal vistamenu = new MenuPrincipal();
        int xx = vista.getJtbPacientes().getSelectedRow();
        if (xx != -1) {
            String id = vista.getJtbPacientes().getValueAt(xx, 0).toString();
            String pro = id ;
            vista.getTxtced().setText(id);
            vistamenu.getLblCedulapac().setText(id);
            String nom = vista.getJtbPacientes().getValueAt(xx, 1).toString();
            vista.getYxynom().setText(nom);
             vistamenu.getLblnombrescomp().setText(nom);
            String apellido = vista.getJtbPacientes().getValueAt(xx, 2).toString();
            vista.getTxtapellidos().setText(apellido);
             vistamenu.getLabelapellido().setText(apellido);
            String telefono = vista.getJtbPacientes().getValueAt(xx, 3).toString();
            vista.getTxtcelular().setText(telefono);
            String direccion = vista.getJtbPacientes().getValueAt(xx, 4).toString();
            vista.getTxtdireccion().setText(direccion);
            String ciudad = vista.getJtbPacientes().getValueAt(xx, 5).toString();
            vista.getTxtciudad().setText(ciudad);
            String genero = vista.getJtbPacientes().getValueAt(xx, 6).toString();
            vista.getCmgenero().setSelectedItem(genero);
            llenartxtsobrantes();
              for (int i = 0; i < lp.size(); i++) {
                if (lp.get(i).getCedula().equals(pro)) {
                    if(lp.get(i).getFoto()!=null){
                    byte[] ft = lp.get(i).getFoto();
                    BufferedImage img = null;
                   
                     InputStream in = new ByteArrayInputStream(ft);
                     img = ImageIO.read(in);
                     if(img!=null){
                    Image j = img.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
                    
                    Icon ic = new ImageIcon(j);
                    vista.getLablefoto().setIcon(ic);
                    }  else {
                    vista.getLablefoto().setIcon(null);}
                  
                 } 
                   
               }
                 } else if (lp.get(i).getFoto() == null) {
                   
                    Icon icmuj = new ImageIcon("/Users/slix0/Documents/GitHub/Dental_Software_M3A/Software_dental/src/View/icons/icono_mujer.png");
                        System.out.println(vista.getCmgenero().getSelectedItem().toString());
                         vista.getLablefoto().setIcon(icmuj);
                 //   vista.getLablefoto().setIcon(null);
                    
//                    Icon icho = new ImageIcon("/Users/slix0/Documents/GitHub/Dental_Software_M3A/Software_dental/src/View/icons/icono_mujer.png");
//                    vista.getLablefoto().setIcon(icho);
//                    System.out.println(vista.getCmgenero().getSelectedItem().toString());
//
                    
                    }
                  
          
                    
                }

            }
            llenartxtsobrantes ();
            }
         
        
        else {
            JOptionPane.showMessageDialog(vista, "error seleccione una fila");
            
            }
            
            
            
            Date fecha_nac = (Date) vista.getJtbPacientes().getValueAt(xx, 8);
            vista.getJdcFecha().setDate(fecha_nac);
             String tipo_sang = vista.getJtbPacientes().getValueAt(xx, 9).toString();
            vista.getCbSangre().setSelectedItem(tipo_sang);
            
             
           
       

}
    
    
      public void crearpaciente(){
           File ruta = new File(vista.getTxtruta().getText());
     
     String cedula;
     String nombres;
     String apellidos;
     String celular;
     String telefono;
     String direccion;
     String correo;
     String provincia;
     String ciudad;
     String genero;
     Date fechanac;
     String tiposang;
     String id;
     byte foto ; 
    cedula = vista.getTxtced().getText();
    nombres = vista.getYxynom().getText();
    apellidos = vista.getTxtapellidos().getText();
    celular = vista.getTxtcelular().getText();
    telefono = vista.getTxttelefono().getText();
    direccion = vista.getTxtdireccion().getText();
    correo = vista.getTxtcorreo().getText();
    provincia = vista.getTxtprovincia().getText();
    ciudad = vista.getTxtciudad().getText();
    genero = vista.getCmgenero().getSelectedItem().toString();
    id = vista.getLabelserie().getText();
     SimpleDateFormat dateFormat = new SimpleDateFormat ("yyy-MM-dd");
     java.util.Date date= vista.getJdcFecha().getDate();
     long d = date.getTime();
     String fechael=dateFormat.format(d);
     java.sql.Date fecha = new java.sql.Date (d);
          
    tiposang = vista.getCbSangre().getSelectedItem().toString();
     
           Model_Paciente pac = new Model_Paciente();
           pac.setCedula(cedula);
           pac.setNombres(nombres);
           pac.setApellidos(apellidos);
           pac.setCelular(celular);
           pac.setTelefono(telefono);
           pac.setDireccion(direccion);
           pac.setCorreo(correo);
           pac.setProvincia(provincia);
           pac.setCiudad(ciudad);
           pac.setGenero(genero);
             try{
            byte[] icono = new byte[(int) ruta.length()];
            InputStream input = new FileInputStream(ruta);
            input.read(icono);
           pac.setFoto(icono);

            }catch(Exception ex){
           pac.setFoto(null);
        }
            pac.setId_paciente(id);
            pac.setCedula_pac(cedula);
            pac.setFecha_nac(fecha);
            pac.setTipo_sang(tiposang);
             
            pac.crearPersonaByte();
            generarSerie();
            cargarPersonas ();
            limpiartxt();
          
      }
      
      //
       public void editarpaciente(){
      File ruta = new File(vista.getTxtruta().getText());
     
     String cedula;
     String nombres;
     String apellidos;
     String celular;
     String telefono;
     String direccion;
     String correo;
     String provincia;
     String ciudad;
     String genero;
     Date fechanac;
     String tiposang;
     String id;
     
    
    cedula = vista.getTxtced().getText();
    nombres = vista.getYxynom().getText();
    apellidos = vista.getTxtapellidos().getText();
    celular = vista.getTxtcelular().getText();
    telefono = vista.getTxttelefono().getText();
    direccion = vista.getTxtdireccion().getText();
    correo = vista.getTxtcorreo().getText();
    provincia = vista.getTxtprovincia().getText();
    ciudad = vista.getTxtciudad().getText();
    genero = vista.getCmgenero().getSelectedItem().toString();
    id = vista.getLabelserie().getText();
     SimpleDateFormat dateFormat = new SimpleDateFormat ("yyy-MM-dd");
     java.util.Date date= vista.getJdcFecha().getDate();
     long d = date.getTime();
     String fechael=dateFormat.format(d);
     java.sql.Date fecha = new java.sql.Date (d);
          
    tiposang = vista.getCbSangre().getSelectedItem().toString();
     
          Model_Paciente pac = new Model_Paciente();
           pac.setCedula(cedula);
           pac.setNombres(nombres);
           pac.setApellidos(apellidos);
           pac.setCelular(celular);
           pac.setTelefono(telefono);
           pac.setDireccion(direccion);
           pac.setCorreo(correo);
           pac.setProvincia(provincia);
           pac.setCiudad(ciudad);
           pac.setGenero(genero);
             try{
            if(vista.getTxtruta().getText().trim().length()!=0){ 
            byte[] icono = new byte[(int) ruta.length()];
            InputStream input = new FileInputStream(ruta);
            input.read(icono);
            pac.setFoto(icono);
            }

            }catch(IOException ex){
                 System.out.println(ex);
           pac.setFoto(null);
        }
            pac.setId_paciente(id);
            pac.setCedula_pac(cedula);
            pac.setFecha_nac(fecha);
            pac.setTipo_sang(tiposang);
            if(vista.getTxtruta().getText().trim().length()!=0){ 
            pac.ActualizarPersonas();
             } else {
            
            pac.Actualizarsinfoto();
            }
            generarSerie();
            cargarPersonas ();
            limpiartxt();
          
      }
       //
       private void  cargarPersonas (){
        
        vista.getJtbPacientes().setDefaultRenderer(Object.class, new  ImagenTabla()); 
        vista.getJtbPacientes().setRowHeight(100);
      
        DefaultTableModel tbmodel ; 

        tbmodel = (DefaultTableModel) vista.getJtbPacientes().getModel() ; 
  
        tbmodel.setNumRows(0);

        List<Paciente> milista = modelo.listarpac();
     
        Holder<Integer> i = new Holder<>(0);
        milista.stream().forEach(pe -> {

      tbmodel.addRow( new Object[10]);// creo una fila vacia
       //dibujar elementos de la tabla 
       vista.getJtbPacientes().setValueAt(pe.getCedula(), i.value, 0);
       vista.getJtbPacientes().setValueAt(pe.getNombres(), i.value, 1);
       vista.getJtbPacientes().setValueAt(pe.getApellidos(), i.value, 2);
       vista.getJtbPacientes().setValueAt(pe.getCelular(), i.value, 3);
       vista.getJtbPacientes().setValueAt(pe.getDireccion(), i.value, 4);
        vista.getJtbPacientes().setValueAt(pe.getCiudad(), i.value, 5);
       vista.getJtbPacientes().setValueAt(pe.getGenero(), i.value, 6);
         try{
                    byte[] bi = pe.getFoto();
                    BufferedImage image = null;
                    InputStream in = new ByteArrayInputStream(bi);
                    image = ImageIO.read(in);
                    ImageIcon imgi = new ImageIcon(image.getScaledInstance(60, 60, 0));
                   DefaultTableCellRenderer render = new DefaultTableCellRenderer();
                 render.setIcon(imgi);
                   vista.getJtbPacientes().setValueAt(new JLabel(imgi), i.value, 7);

                }catch(Exception ex){
                      vista.getJtbPacientes().setValueAt(new JLabel("No imagen"),i.value, 7);
  
                }
         vista.getJtbPacientes().setValueAt(pe.getFecha_nac(), i.value, 8);
          vista.getJtbPacientes().setValueAt(pe.getTipo_sang(), i.value, 9);
//      
        i.value++;

           
        });
                
    }
   
       private void  cargarPersonasbusqueda (String busqueda){
        
        vista.getJtbPacientes().setDefaultRenderer(Object.class, new  ImagenTabla()); 
        vista.getJtbPacientes().setRowHeight(100);
      
        DefaultTableModel tbmodel ; 

        tbmodel = (DefaultTableModel) vista.getJtbPacientes().getModel() ; 
  
        tbmodel.setNumRows(0);

        List<Paciente> milista = modelo.listarpacbuscar(busqueda);
     
        Holder<Integer> i = new Holder<>(0);
        milista.stream().forEach(pe -> {

      tbmodel.addRow( new Object[10]);// creo una fila vacia
       //dibujar elementos de la tabla 
       vista.getJtbPacientes().setValueAt(pe.getCedula(), i.value, 0);
       vista.getJtbPacientes().setValueAt(pe.getNombres(), i.value, 1);
       vista.getJtbPacientes().setValueAt(pe.getApellidos(), i.value, 2);
       vista.getJtbPacientes().setValueAt(pe.getCelular(), i.value, 3);
       vista.getJtbPacientes().setValueAt(pe.getDireccion(), i.value, 4);
        vista.getJtbPacientes().setValueAt(pe.getCiudad(), i.value, 5);
       vista.getJtbPacientes().setValueAt(pe.getGenero(), i.value, 6);
     
         try{
                    byte[] bi = pe.getFoto();
                    BufferedImage image = null;
                    InputStream in = new ByteArrayInputStream(bi);
                    image = ImageIO.read(in);
                    ImageIcon imgi = new ImageIcon(image.getScaledInstance(60, 60, 0));
                   DefaultTableCellRenderer render = new DefaultTableCellRenderer();
                 render.setIcon(imgi);
                   vista.getJtbPacientes().setValueAt(new JLabel(imgi), i.value, 7);

                }catch(Exception ex){
                      vista.getJtbPacientes().setValueAt(new JLabel("No imagen"),i.value, 7);
                  
                }
         vista.getJtbPacientes().setValueAt(pe.getFecha_nac(), i.value, 8);
          vista.getJtbPacientes().setValueAt(pe.getTipo_sang(), i.value, 9);
//      
        i.value++;

      
        });
                
    }
      
       
      public void llenartxtsobrantes () {
           Model_Paciente pac = new Model_Paciente();
       
            String id2 = vista.getTxtced().getText();
           // pac.cargartxtsobrantes(id2);
            List<Paciente> milistapaci =  pac.cargartxtsobrantes(id2);
            for(int i = 0 ; i < milistapaci.size() ; i++){
            vista.getTxttelefono().setText(milistapaci.get(i).getTelefono()) ;
            vista.getTxtcorreo().setText(milistapaci.get(i).getCorreo()) ;
            vista.getTxtprovincia().setText(milistapaci.get(i).getProvincia()) ;
            System.out.println(pac.getTelefono());
            System.out.println(pac.getCorreo());
            System.out.println(pac.getProvincia());
            }
     
       
       
                
    } 
      public void eliminar(){
           int seleccion = vista.getJtbPacientes().getSelectedRow();
        int resp=0;
        Component rootPane = null;
        
        if(seleccion != -1){
            String ced = vista.getJtbPacientes().getValueAt(seleccion, 0).toString();
            JOptionPane.showMessageDialog(rootPane,( "¿Quieres eliminar este registro?"));
            if(resp==0){
                if(modelo.borrarPersona(ced)){
                    JOptionPane.showMessageDialog(null, "El registro ha sido eliminado");
                    cargarPersonas();
                }else{
                    JOptionPane.showMessageDialog(null, "No se ha podido eliminar el registro");
                }
                
            }
        }
          
      }
      
  

    
    
}
