/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Cie_10;
import Model.ConexionPg;
import Model.Doctor;
import Model.Model_Especialista;
import Model.Model_Receta;
import Model.Paciente;
import Model.farmaco;
import Model.historia_clinica;
import Model.receta;
import View.MenuPrincipal;
import View.Vista_Receta;
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
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.xml.ws.Holder;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author jose illescas
 */
public class Controller_Receta {
    private Model_Receta modelo;
    private Vista_Receta vista;
    private MenuPrincipal vistamenu ;
    

    public Controller_Receta(Model_Receta modelo, Vista_Receta vista, MenuPrincipal vistamenu) {
        this.modelo = modelo;
        this.vista = vista;
        this.vistamenu = vistamenu;
        vista.setVisible(true);
        iniciarcontrol();
    }
    DefaultTableModel dtmreceta= new DefaultTableModel();
    ArrayList<receta> listareceta = new ArrayList<>();
    DefaultTableModel dtmcie10= new DefaultTableModel();
    ArrayList<Cie_10> listacie10 = new ArrayList<>();
    DefaultTableModel dtm, dtm2;
    
    
    public void iniciarcontrol (){
        vista.getTxtIDreceta().setEnabled(false);
         generarSerie();
         Fechaactual();
         generarIdFar();
         generarIdCie();
        vista.getBtncargardatos().addActionListener(l-> cargardesdeMenu());
        vista.getBtnbuscarfarmaco().addActionListener(l->abrir_Dialogfarmaco());
        vista.getBtnBuscarcie().addActionListener(l->abrir_Dialogcie());
        vista.getBtnagregardatos().addActionListener(l->Validarfarmacos());
        vista.getBtnagregarcie().addActionListener(l->Validarcie10());
        vista.getBtnCrearRec().addActionListener(l->generaRecetaImprimir());
        setEventoMouseClicked(vista.getTblbuscarFarmacos());
        setEventoMouseClicked2(vista.getTblbuscarcie10());
        vista.getBtnEliminarrec().addActionListener(l->eliminarFarmaco());
        vista.getBtnEliminarrec().addActionListener(l->eliminarCie());
        vista.getBtnRefrescar().addActionListener(l->cargarFarmacos());
        vista.getBtnRefrescarCie().addActionListener(l->cargarCIE10());
        KeyListener kl = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {
                cargarFarmacosbusqueda(vista.getTxtbuscarfar().getText());
                cargarCIE10busqueda(vista.getTxtbuscarcie10().getText());
            }
            
        };
            vista.getTxtbuscarfar().addKeyListener(kl);
            vista.getTxtbuscarcie10().addKeyListener(kl);
            vista.getId_rec_far().setVisible(false);
            vista.getId_rec_cie().setVisible(false);
        
       
    }
    
    private void generarSerie() {
      String   serie = modelo.id_receta();
        if (serie == null) {
            vista.getTxtIDreceta().setText("01");
        } else {
            int inc = Integer.parseInt(serie);
            inc++;
            vista.getTxtIDreceta().setText("0" + inc);

        }
    }
    
    public void limpiartxt(){
    vista.getTxtnombre().setText("");
    vista.getTxtApellido().setText("");
    vista.getTxtcedula().setText("");
    vista.getTxtsexo().setText("");
    vista.getTxtedad().setText("");
    vista.getJdcFechanaciento().setCalendar(null);
    vista.getTxtobservaciones().setText("");
    vista.getTxtalergias().setText("");
    
    }
    
    private void cargardesdeMenu(){
     String cedu=vistamenu.getLblCedulapac().getText();
     if(cedu.equals("...")){
         JOptionPane.showMessageDialog(vistamenu, "Debe tener cargado un paciente en la parte superior ");
     }else{
//     vista.getTxtcedula_pac().setText(cedu);
     cargardatosexternosconcedula();
     }
     }
             
    public void cargardatosexternosconcedula(){
       
        
         String id2 = vistamenu.getLblCedulapac().getText();
           
 
            List<Paciente> milistapa =  modelo.cargartxtsobrantes(id2);
            
         for(int i = 0 ; i < milistapa.size() ; i++){
             
            vista.getTxtcedula().setText(milistapa.get(i).getCedula());  
            vista.getTxtnombre().setText(milistapa.get(i).getNombres());
            vista.getTxtApellido().setText(milistapa.get(i).getApellidos());
            vista.getTxtsexo().setText(milistapa.get(i).getGenero());
            vista.getJdcFechanaciento().setDate(milistapa.get(i).getFecha_nac()) ;
              calcu_edad();
              cargarAlergia();
              
            }        
        
    }
    
    public void cargarAlergia(){
        
        String id = vista.getTxtcedula().getText();
        String milista =  modelo.alergia(id);
        
            vista.getTxtalergias().setText(milista);
              
    }
    
         private void calcu_edad(){
        SimpleDateFormat dateFormat = new SimpleDateFormat ("yyyy-MM-dd");
        java.util.Date dato=vista.getJdcFechanaciento().getDate();
        String fechael=dateFormat.format(dato);  
        LocalDate hoy = LocalDate.now();
        LocalDate fechanac = LocalDate.parse(fechael);
      Period p = Period.between(fechanac, hoy);   
      int Anio = p.getYears();
      int mes = p.getMonths();
      int dias = p.getDays();
    
      vista.getTxtedad().setText(Anio + " Años " + mes + " Meses "+dias+ " Dias" );
      
         }
         
      //Abrir dialog
    private void abrir_Dialogfarmaco(){
      vista.getDialogFarmaco().setVisible(true);
      vista.getDialogFarmaco().setLocationRelativeTo(null);
      vista.getDialogFarmaco().setTitle("Buscar farmaco");
      vista.getDialogFarmaco().setSize(550, 420);
      cargarFarmacos();
     }
    
    private void abrir_Dialogcie(){
        vista.getDialogCIE().setVisible(true);
        vista.getDialogCIE().setLocationRelativeTo(null);
        vista.getDialogCIE().setTitle("Buscar CIE-10");
        vista.getDialogCIE().setSize(550, 420);
        cargarCIE10();
     }
    
    
         
         private void  cargarFarmacos (){
             
        DefaultTableModel tbmodel ; 

        tbmodel = (DefaultTableModel) vista.getTblbuscarFarmacos().getModel() ; 
  
        tbmodel.setNumRows(0);

        List<farmaco> milista = modelo.mostrarFarmaco();
     
        Holder<Integer> i = new Holder<>(0);
        milista.stream().forEach(pe -> {

      tbmodel.addRow( new Object[3]);// creo una fila vacia
       //dibujar elementos de la tabla 
       vista.getTblbuscarFarmacos().setValueAt(pe.getNombre_farmaco(), i.value, 0);
       vista.getTblbuscarFarmacos().setValueAt(pe.getMiligramos(), i.value, 1);
       
        i.value++;

           
        });
                
    }
         
         private void  cargarCIE10 (){
             
        DefaultTableModel tbmodel ; 

        tbmodel = (DefaultTableModel) vista.getTblbuscarcie10().getModel() ; 
  
        tbmodel.setNumRows(0);

        List<Cie_10> milista = modelo.mostrarCIE10();
     
        Holder<Integer> i = new Holder<>(0);
        milista.stream().forEach(pe -> {

      tbmodel.addRow( new Object[3]);// creo una fila vacia
       //dibujar elementos de la tabla 
       vista.getTblbuscarcie10().setValueAt(pe.getId_cie(), i.value, 0);
       vista.getTblbuscarcie10().setValueAt(pe.getCategoria(), i.value, 1);
       vista.getTblbuscarcie10().setValueAt(pe.getTitulo(), i.value, 2);
       
        i.value++;

           
        });
                
    }
         
         private void  cargarFarmacosbusqueda (String busqueda){
             
        DefaultTableModel tbmodel ; 

        tbmodel = (DefaultTableModel) vista.getTblbuscarFarmacos().getModel() ; 
  
        tbmodel.setNumRows(0);

        List<farmaco> milista = modelo.buscarFarmacos(busqueda);
     
        Holder<Integer> i = new Holder<>(0);
        milista.stream().forEach(pe -> {

      tbmodel.addRow( new Object[2]);// creo una fila vacia
       //dibujar elementos de la tabla 
       vista.getTblbuscarFarmacos().setValueAt(pe.getNombre_farmaco(), i.value, 0);
       vista.getTblbuscarFarmacos().setValueAt(pe.getMiligramos(), i.value, 1);
       
        i.value++;

           
        });
                
    }
         
         private void  cargarCIE10busqueda (String busqueda){
             
        DefaultTableModel tbmodel ; 

        tbmodel = (DefaultTableModel) vista.getTblbuscarcie10().getModel() ; 
  
        tbmodel.setNumRows(0);

        List<Cie_10> milista = modelo.buscarCIE10(busqueda);
     
        Holder<Integer> i = new Holder<>(0);
        milista.stream().forEach(pe -> {

      tbmodel.addRow( new Object[3]);// creo una fila vacia
       //dibujar elementos de la tabla 
       vista.getTblbuscarcie10().setValueAt(pe.getId_cie(), i.value, 0);
       vista.getTblbuscarcie10().setValueAt(pe.getCategoria(), i.value, 1);
       vista.getTblbuscarcie10().setValueAt(pe.getTitulo(), i.value, 2);
       
        i.value++;

           
        });
                
    }
         private void setEventoMouseClicked(JTable tbl)
    {
        tbl.addMouseListener(new java.awt.event.MouseAdapter() {

        @Override
        public void mouseClicked(MouseEvent e) {
            try {
//                vista.getBtnagregardatos().addActionListener(l-> cargarFARRec(vista.getTxtIDreceta().getText()));
                cargardatosTxtFarmaco(e);
                vista.getDialogFarmaco().dispose();
//                cargarFARRec(vista.getTxtIDreceta().getText());
            
            } catch (IOException ex) {
                Logger.getLogger(Controller_Receta.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        });
    }
    
         private void setEventoMouseClicked2(JTable tbl)
    {
        tbl.addMouseListener(new java.awt.event.MouseAdapter() {

        @Override
        public void mouseClicked(MouseEvent e) {
            try {
//                vista.getBtnagregarcie().addActionListener(l-> cargarCIE10Rec(vista.getTxtIDreceta().getText()));
                cargardatosTxtCIE10(e);
                vista.getDialogCIE().dispose();
//                cargarCIE10Rec(vista.getTxtIDreceta().getText());
            
            } catch (IOException ex) {
                Logger.getLogger(Controller_Receta.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        });
    }
            
         private void cargardatosTxtFarmaco (MouseEvent evt) throws IOException{

        List<farmaco> lp = modelo.mostrarFarmaco();
        int xx = vista.getTblbuscarFarmacos().getSelectedRow();
        if (xx != -1) {
            String nombre = vista.getTblbuscarFarmacos().getValueAt(xx, 0).toString();
            vista.getTxtIdfamaco().setText(nombre);
            String mg = vista.getTblbuscarFarmacos().getValueAt(xx, 1).toString();
            vista.getTxtmiligramos().setText(mg);
            
            }
       }
         
         private void cargardatosTxtCIE10 (java.awt.event.MouseEvent evt) throws IOException{

        List<Cie_10> lp = modelo.mostrarCIE10();
        int xx = vista.getTblbuscarcie10().getSelectedRow();
        if (xx != -1) {
            String id = vista.getTblbuscarcie10().getValueAt(xx, 0).toString();
            vista.getTxtCie().setText(id);
            String categoria = vista.getTblbuscarcie10().getValueAt(xx, 2).toString();
            vista.getTxtCie1().setText(categoria);
            String titulo = vista.getTblbuscarcie10().getValueAt(xx, 1).toString();
            vista.getTxttitulo().setText(titulo);
            }
        vista.getDialogFarmaco().dispose();
       }
         
         public void Fechaactual(){
            
        Calendar fecha = new GregorianCalendar();                                    
        int año = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH);
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        vista.getLblfecha().setText(+ dia + "-" + (mes+1) + "-" + año);

        }
         
         private void limpiartxtReceta(){
             vista.txtIdfamaco.setText("");
             vista.txtmiligramos.setText("");
             vista.spcantidad.setValue(0);
             vista.txtfrecuencia.setText("");
         }
         
         
         private void limpiartxtcie10(){
             vista.txtCie.setText("");
             vista.txtCie1.setText("");
             vista.txttitulo.setText("");
         }
         
         
    
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
         
         private void generarIdFar() {
      String   serie = modelo.NumIdFAR();
        if (serie == null) {
            vista.getId_rec_far().setText("01");
        } else {
            int inc = Integer.parseInt(serie);
            inc++;
            vista.getId_rec_far().setText("0" + inc);

        }
    }
         
         private void generarIdCie() {
      String   serie = modelo.NumIdCIE();
        if (serie == null) {
            vista.getId_rec_cie().setText("01");
        } else {
            int inc = Integer.parseInt(serie);
            inc++;
            vista.getId_rec_cie().setText("0" + inc);

        }
    }
         
         public void crearRecetas(){
     
     String id_rec=vista.getTxtIDreceta().getText();
     String cedula=vista.getTxtcedula().getText();
     String nombres=vista.getTxtnombre().getText();
     String apellido=vista.getTxtApellido().getText();
     String sexo=vista.getTxtsexo().getText();
     String edad=vista.getTxtedad().getText();
     String fechaac=vista.getLblfecha().getText();
     String obs=vista.getTxtobservaciones().getText();
     String alergias=vista.getTxtalergias().getText();
     Model_Receta mEsp= new Model_Receta();
     
     mEsp.setId_receta(id_rec);
     mEsp.setCedula_pac(cedula);
     mEsp.setNombre(nombres+" "+ apellido);
     mEsp.setSexo(sexo);
     mEsp.setEdad(edad);
     mEsp.setFecha(fechaac);
     mEsp.setObservaciones(obs);
     mEsp.setAlergias(alergias);     
     
     mEsp.crearReceta();
//     mEsp.crearPersonas2();
                limpiartxt();

    }
         
         public void crearRecFar(){
         
     String id_rec_far=vista.getId_rec_far().getText();
     String id_rec=vista.getTxtIDreceta().getText();
     String farmaco=vista.getTxtIdfamaco().getText();
     String mg=vista.getTxtmiligramos().getText();
     String cantidad=String.valueOf(vista.getSpcantidad().getValue());
     String frecuencia=vista.getTxtfrecuencia().getText();
     Model_Receta mEsp= new Model_Receta();
     
     mEsp.setId_rec_far(id_rec_far);
     mEsp.setId_receta(id_rec);
     mEsp.setFarmaco(farmaco);
     mEsp.setMiligramos(mg);
     mEsp.setCantidad(cantidad);
     mEsp.setFrecuencia(frecuencia);    
     
     mEsp.crearRecFar();
//     mEsp.crearPersonas2();
                generarIdFar();
                limpiartxtReceta();
                cargarFARRec(vista.getTxtIDreceta().getText());
                
    }
         
         public void crearRecCie(){
         
     String id_rec_cie=vista.getId_rec_cie().getText();
     String id_rec=vista.getTxtIDreceta().getText();
     String id_cie=vista.getTxtCie().getText();
     String titulo=vista.getTxtCie1().getText();
     String categoria=vista.getTxttitulo().getText();
     Model_Receta mEsp= new Model_Receta();
     
     mEsp.setId_rec_cie(id_rec_cie);
     mEsp.setId_receta(id_rec);
     mEsp.setId_titulo(id_cie+" - "+titulo);
     mEsp.setCategoria(categoria);    
     
     mEsp.crearRecCie();

                generarIdCie();
                limpiartxtcie10();
                cargarCIE10Rec(vista.getTxtIDreceta().getText());
                
    }
         
         private void  cargarCIE10Rec (String id){//String buscar
             
        DefaultTableModel tbmodel ; 

        tbmodel = (DefaultTableModel) vista.getTblcie10().getModel() ; 
  
        tbmodel.setNumRows(0);

        List<receta> mireccie = modelo.mostrarCie10Rec(id);//buscar
     
        Holder<Integer> i = new Holder<>(0);
        mireccie.stream().forEach(pe -> {

      tbmodel.addRow( new Object[2]);// creo una fila vacia
       //dibujar elementos de la tabla 
       vista.getTblcie10().setValueAt(pe.getId_titulo(), i.value, 0);
       vista.getTblcie10().setValueAt(pe.getCategoria(), i.value, 1);
       
        i.value++;

           
        });
        
         }
         
         private void  cargarFARRec (String buscar){//String buscar
             
        DefaultTableModel tbmodel ; 

        tbmodel = (DefaultTableModel) vista.getTblreceta().getModel() ; 
  
        tbmodel.setNumRows(0);

        List<receta> mireccfar = modelo.mostrarFarRec(buscar);//buscar
     
        Holder<Integer> i = new Holder<>(0);
        mireccfar.stream().forEach(pe -> {

      tbmodel.addRow( new Object[4]);// creo una fila vacia
       //dibujar elementos de la tabla 
       vista.getTblreceta().setValueAt(pe.getFarmaco(), i.value, 0);
       vista.getTblreceta().setValueAt(pe.getMiligramos(), i.value, 1);
       vista.getTblreceta().setValueAt(pe.getCantidad(), i.value, 2);
       vista.getTblreceta().setValueAt(pe.getFrecuencia(), i.value, 3);
       
        i.value++;

           
        });
        
         }

         void Validarfarmacos(){
    //validaciones
    String far=vista.getTxtIdfamaco().getText();
    String dosis=vista.getTxtmiligramos().getText();
    String cantidad=vista.getSpcantidad().getValue().toString();
    String frecuencia=vista.getTxtfrecuencia().getText();
    
        if (far.equals("")|| dosis.equals("")|| cantidad.equals("0")|| frecuencia.equals("")) {
            JOptionPane.showMessageDialog(vista, "Seleccione un farmaco o complete los campos");
        } else{
            crearRecFar();
        }
    }
         
         void Validarcie10(){
    //validaciones
    String cie=vista.getTxtCie().getText();
    String titulo=vista.getTxtCie1().getText();
    String categoria=vista.getTxttitulo().getText();
    
        if (cie.equals("")|| titulo.equals("")|| categoria.equals("0")) {
            JOptionPane.showMessageDialog(vista, "Seleccione el CIE-10 correspondiente");
        } else{
            crearRecCie();
        }
    }
         
          void Validarreceta(){
    //validaciones
    String nombre=vista.getTxtnombre().getText();
    String apellido=vista.getTxtApellido().getText();
    String cedula=vista.getTxtcedula().getText();
    String sexo=vista.getTxtsexo().getText();
    String edad=vista.getTxtedad().getText();
    String id=vista.getTxtIDreceta().getText();
    String fecha=vista.getLblfecha().getText();
    
        if (nombre.equals("")|| apellido.equals("")|| cedula.equals("")|| sexo.equals("")|| edad.equals("")|| id.equals("")|| fecha.equals("")) {
            JOptionPane.showMessageDialog(vista, "Seleccione los datos del Paciente");
        } else{
            crearRecetas();
        }
    }
          
          public void eliminarFarmaco(){
        int seleccion = vista.getTblreceta().getSelectedRow();
        int resp=0;
        Component rootPane = null;
        Model_Receta  eliminado = new Model_Receta();
        if(seleccion != -1){
            String det = vista.getTblreceta().getValueAt(seleccion, 0).toString();
            String dosis = vista.getTblreceta().getValueAt(seleccion, 1).toString();
            String frec = vista.getTblreceta().getValueAt(seleccion, 3).toString();
            JOptionPane.showMessageDialog(rootPane,( "¿Quieres eliminar este registro?"));
            if(resp==0){
                if(eliminado.removerFarmacos(det,dosis,frec)){
                    JOptionPane.showMessageDialog(null, "El registro ha sido eliminado");
                    
//                    cargarCIE10Rec(vista.getTxtIDreceta().getText());
                    cargarFARRec(vista.getTxtIDreceta().getText());
                    
                }else{
                    JOptionPane.showMessageDialog(null, "No se ha podido eliminar el registro");
                }
                
            }
        }
    }
          
          public void eliminarCie(){
        int seleccion = vista.getTblcie10().getSelectedRow();
        int resp=0;
        Component rootPane = null;
        Model_Receta  eliminado = new Model_Receta();
        if(seleccion != -1){
            String cod = vista.getTblcie10().getValueAt(seleccion, 0).toString();
            String cat = vista.getTblcie10().getValueAt(seleccion, 1).toString();
            JOptionPane.showMessageDialog(rootPane,( "¿Quieres eliminar este registro?"));
            if(resp==0){
                if(eliminado.removerCie(cod,cat)){
                    JOptionPane.showMessageDialog(null, "El registro ha sido eliminado");
                    
                    cargarCIE10Rec(vista.getTxtIDreceta().getText());

                }else{
                    JOptionPane.showMessageDialog(null, "No se ha podido eliminar el registro");
                }
                
            }
        }
    }
          private void imprimirReceta(){
        ConexionPg con =new ConexionPg();
          try {
//              JasperReport listado = (JasperReport) JRLoader.loadObject(getClass().getResource("/Reportes/Recetas2.jasper"+"/Reportes/Rec_Enca.jasper"+"/Reportes/Rep_Receta_Far.jasper"+"/Reportes/Rep_Receta_Cie.jasper"));
              JasperReport listado = (JasperReport) JRLoader.loadObject(getClass().getResource("/Reportes/Recetas3.jasper"));
              
              Map<String,Object> parametros =new HashMap<>();
              System.out.println(vista.getTxtIDreceta().getText());
              parametros.put("idRec2", vista.getTxtIDreceta().getText());//txtIDreceta
              JasperPrint jp = JasperFillManager.fillReport(listado, parametros, con.Con());
          
              JasperViewer jv = new JasperViewer(jp,false);
              jv.setVisible(true);
              
          } catch (JRException ex) {
              Logger.getLogger(Controller_Receta.class.getName()).log(Level.SEVERE, null, ex);
          }
    }
          
         private void imprimirReceta2(){
        ConexionPg con =new ConexionPg();
          try {
              JasperReport listado = (JasperReport) JRLoader.loadObject(getClass().getResource("/Reportes/Recetas2.jasper"));
              
              Map<String,Object> parametros =new HashMap<>();
              System.out.println(vista.getTxtIDreceta().getText());
              parametros.put("idRec2", vista.getTxtIDreceta().getText());//txtIDreceta
              JasperPrint jp = JasperFillManager.fillReport(listado, parametros, con.Con());
          
              JasperViewer jv = new JasperViewer(jp,false);
              jv.setVisible(true);
              
          } catch (JRException ex) {
              Logger.getLogger(Controller_Receta.class.getName()).log(Level.SEVERE, null, ex);
          }
    } 
         
          public void generaRecetaImprimir() {
        
            int confirmacion = JOptionPane.showConfirmDialog(vista, "¿Desea imprimir?");
            if (confirmacion == 0) {
                
                Validarreceta();
                imprimirReceta();
                generarSerie();
                cargarCIE10Rec(vista.getTxtIDreceta().getText());
                cargarFARRec(vista.getTxtIDreceta().getText());
            } else {
                Validarreceta();
                generarSerie();
                cargarCIE10Rec(vista.getTxtIDreceta().getText());
                cargarFARRec(vista.getTxtIDreceta().getText());
        }
    }     
}
