/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Cie_10;
import Model.Doctor;
import Model.Model_Especialista;
import Model.Model_Receta;
import Model.Paciente;
import Model.farmaco;
import Model.historia_clinica;
import Model.receta;
import View.MenuPrincipal;
import View.Vista_Receta;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
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
import java.util.LinkedList;
import java.util.List;
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
    public void iniciarcontrol (){
        
        vista.getBtncargardatos().addActionListener(l-> cargardatosexternosconcedula());
        vista.getBtnbuscarfarmaco().addActionListener(l->abrir_Dialogfarmaco());
        
        vista.getBtnBuscarcie().addActionListener(l->abrir_Dialogcie());
        vista.getBtnagregardatos().addActionListener(l->llenarLista());
        vista.getBtnagregarcie().addActionListener(l->llenarListacie());
        vista.getBtnCrearRec().addActionListener(l->{
            try {
                crearRecetas();
            } catch (ParseException ex) {
                Logger.getLogger(Controller_Receta.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        setEventoMouseClicked(vista.getTblbuscarFarmacos());
        setEventoMouseClicked(vista.getTblbuscarcie10());
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
        vista.getTxtbuscarcie10().addKeyListener(kl);
        vista.getTxtbuscarfar().addKeyListener(kl);
        generarSerie();
        Fechaactual();
        setModelo();
        setModelocie();
    }
    
    private void generarSerie() {
      String   serie = modelo.id_receta();
        if (serie == null) {
            vista.getTxtIDreceta().setText("1");
        } else {
            int inc = Integer.parseInt(serie);
            inc++;
            vista.getTxtIDreceta().setText("0" + inc);

        }
    }
    
//    public void crearReceta(){
//        
//        
//    String id_receta = vista.getTxtIDreceta().getText();
//    String nombre = vista.getTxtnombre().getText();
//    String apellido = vista.getTxtApellido().getText();
//    String cedula = vista.getTxtcedula().getText();
//    String sexo = vista.getTxtApellido().getText();
//    Date fecha = (Date) vista.getJdcFechareceta().getDate();
//    String id_farmaco = vista.getTxtIdfamaco().getText();
//    String indicaciones = vista.getTxtIndicaciones().getText();
//     
//          Model_Receta rec = new Model_Receta();
//           rec.setId_receta(id_receta);
//           rec.setFecha_receta(fecha);
//           rec.setId_farmaco_rec(id_farmaco);
//           rec.setIndicaciones(indicaciones);
//           
//            rec.crearReceta();
//            generarSerie();
//            fecha();
////            cargarPersonas ();
////            limpiartxt();
//          
//      }
    
    
    
    public void limpiartxt(){
    vista.getTxtCie().setText("");
    vista.getTxtIDreceta().setText("");
    }
    
    public void cargardatosexternosconcedula(){
       
        
         String id2 = vistamenu.getLblCedulapac().getText();
           // pac.cargartxtsobrantes(id2);
           System.out.println(id2+"-----");
 
            List<Paciente> milistapa =  modelo.cargartxtsobrantes(id2);
            
         for(int i = 0 ; i < milistapa.size() ; i++){
             
            vista.getTxtcedula().setText(milistapa.get(i).getCedula());  
            vista.getTxtnombre().setText(milistapa.get(i).getNombres());
            vista.getTxtApellido().setText(milistapa.get(i).getApellidos());
            vista.getTxtsexo().setText(milistapa.get(i).getGenero());
            vista.getJdcFechanaciento().setDate(milistapa.get(i).getFecha_nac()) ;
            //vista.getTxtalergias().setText(milista.get(i).getAlergias_his);
              calcu_edad();
              cargarAlergia();
            }        
        
    }
    
    public void cargarAlergia(){
        
        String id = vista.getTxtcedula().getText();
        String milista =  modelo.alergia(id);
        
            vista.getTxtalergias().setText(milista);
              
    }
    
//    public void cargarDatosReceta(){
//        String idpac =(String) vistamenu.getJcbDocs().getSelectedItem().toString().subSequence(0, 10);
//       // vistamenu.getLblIdpac().setText(id); 
//           // pac.cargartxtsobrantes(id2);
//           System.out.println("holas"+iddoc);
// 
//            List<Doctor> milistapaci =  model.cargaridDoc(iddoc);
//         for(int i = 0 ; i < milistapaci.size() ; i++){
//              
//            vista.getLabelIddoc().setText(milistapaci.get(i).getId_doctor());
//        }
//    }
    
         private void calcu_edad(){
        SimpleDateFormat dateFormat = new SimpleDateFormat ("yyyy-MM-dd");
        java.util.Date dato=vista.getJdcFechanaciento().getDate();
        String fechael=dateFormat.format(dato);  
        LocalDate hoy = LocalDate.now();
        System.out.println(fechael);
        LocalDate fechanac = LocalDate.parse(fechael);
      Period p = Period.between(fechanac, hoy);   
      double Anio = p.getYears();
      double mes = p.getMonths();
      double dias = p.getDays();
    
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
//       vista.getTblbuscarFarmacos().setValueAt(pe.getId_farmaco(), i.value, 0);
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
//       vista.getTblbuscarFarmacos().setValueAt(pe.getId_farmaco(), i.value, 0);
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
                cargardatosTxtFarmaco(e);
                cargardatosTxtCIE10(e);
                
                
            
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
        vista.getDialogCIE().dispose();
       }
         
         private void cargardatosTxtCIE10 (java.awt.event.MouseEvent evt) throws IOException{

        List<Cie_10> lp = modelo.mostrarCIE10();
        int xx = vista.getTblbuscarcie10().getSelectedRow();
        if (xx != -1) {
            String id = vista.getTblbuscarcie10().getValueAt(xx, 0).toString();
            vista.getTxtCie().setText(id);
            String categoria = vista.getTblbuscarcie10().getValueAt(xx, 1).toString();
            vista.getTxtCie1().setText(categoria);
            String titulo = vista.getTblbuscarcie10().getValueAt(xx, 2).toString();
            vista.getTxttitulo().setText(titulo);
            }
       }
         
         public void crearRecetas() throws ParseException{
        System.out.println("creando receta");
     
     String id_rec=vista.getTxtIDreceta().getText();
     String nombres=vista.getTxtnombre().getText();
     String apellido=vista.getTxtApellido().getText();
     String sexo=vista.getTxtsexo().getText();
     String edad=vista.getTxtedad().getText();
     SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        String fechaac="";
     Date dataFormateada = sdf.parse(fechaac);
        System.out.println(fechaac);
     String farmaco=vista.getTxtIdfamaco().getText();
     String mg=vista.getTxtmiligramos().getText();
     String cantidad=String.valueOf(vista.getSpcantidad().getValue()).toString();
     String dosis=vista.getTxtdosis().getText();
     String frecuencia=vista.getTxtfrecuencia().getText();
     String obs=vista.getTxtobservaciones().getText();
     String alergias=vista.getTxtalergias().getText();
        System.out.println("antes del metodo");
     Model_Receta mEsp= new Model_Receta();
     
     mEsp.setId_receta(id_rec);
     mEsp.setNombre(nombres+" "+ apellido);
     mEsp.setSexo(sexo);
     mEsp.setEdad(edad);
     
     mEsp.setFecha((java.sql.Date) dataFormateada);
     mEsp.setFarmaco(farmaco+" "+mg+"mg");
     mEsp.setCantidad(cantidad);
     mEsp.setDosis(dosis);
     mEsp.setFrecuencia(frecuencia);
     mEsp.setObservaciones(obs);
     mEsp.setAlergias(alergias);     
     
     mEsp.crearReceta();
//     mEsp.crearPersonas2();
        System.out.println("despues del metodo");
                generarSerie();
                limpiartxt();

    }
         
         public void Fechaactual(){
            
        Calendar fecha = new GregorianCalendar();                                    
        int año = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH);
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        System.out.println("Fecha Actual: " + dia + "/" + (mes+1) + "/" + año);
        vista.getLblfecha().setText(+ dia + "-" + (mes+1) + "-" + año);

        }
//         public static LinkedList modelot2 = new LinkedList();
         
         private void setModelo(){
             String [] cabecera={"DETALLE", "CANTIDAD", "DOSIS", "FRECUENCIA"};
             dtmreceta.setColumnIdentifiers(cabecera);
             vista.tblreceta.setModel(dtmreceta);
         }
         
         private void llenarLista(){
             String nombre = vista.getTxtIdfamaco().getText();
             String mg = vista.getTxtmiligramos().getText();
             String cantidad = vista.getSpcantidad().getValue().toString();
             String dosis = vista.getTxtdosis().getText();
             String frecuencia = vista.getTxtfrecuencia().getText();
             receta mireceta = new receta(nombre,mg,cantidad,dosis,frecuencia);
             listareceta.add(mireceta);
             setDatos();
         }   
         private void setDatos(){
             Object[] datos = new Object[dtmreceta.getColumnCount()];
             int i = 0;
             dtmreceta.setRowCount(0);
             for (receta mireceta : listareceta) {
                 datos[0] = mireceta.getFarmaco()+" "+mireceta.getMiligramos()+"mg";
                 datos[1] = mireceta.getCantidad();
                 datos[2] = mireceta.getDosis();
                 datos[3] = mireceta.getFrecuencia();
                 i++;
                 dtmreceta.addRow(datos);
             }
             vista.tblreceta.setModel(dtmreceta);
             limpiartxtReceta();
         }
         
         private void limpiartxtReceta(){
             vista.txtIdfamaco.setText("");
             vista.txtmiligramos.setText("");
             vista.spcantidad.setValue(0);
             vista.txtdosis.setText("");
             vista.txtfrecuencia.setText("");
         }
         
         private void setModelocie(){
             String [] cabecera={"CIE-10"};
             dtmcie10.setColumnIdentifiers(cabecera);
             vista.tblcie10.setModel(dtmcie10);
         }
         
         private void llenarListacie(){
             String id = vista.getTxtCie().getText();
             String patologia = vista.getTxtCie1().getText();
             String titulo = vista.getTxttitulo().getText();
             Cie_10 micie = new Cie_10(id,titulo,patologia);
             listacie10.add(micie);
             setDatoscie();
         }   
         private void setDatoscie(){
             Object[] datos = new Object[dtmcie10.getColumnCount()];
             int i = 0;
             dtmcie10.setRowCount(0);
             for (Cie_10 micie : listacie10) {
                 datos[0] = micie.getId_cie()+" - "+micie.getCategoria()+" - "+micie.getTitulo();
                 i++;
                 dtmcie10.addRow(datos);
             }
             vista.tblcie10.setModel(dtmcie10);
             limpiartxtcie10();
         }
         
         private void limpiartxtcie10(){
             vista.txtCie.setText("");
             vista.txtCie1.setText("");
             vista.txttitulo.setText("");
         }
}
