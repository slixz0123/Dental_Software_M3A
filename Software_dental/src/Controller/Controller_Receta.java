/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Cie_10;
import Model.Model_Receta;
import Model.Paciente;
import Model.farmaco;
import Model.receta;
import View.MenuPrincipal;
import View.Vista_Receta;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
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
    DefaultTableModel dtm, dtm2;
    
    public void iniciarcontrol (){
         generarSerie();
        Fechaactual();
        generarIdFar();
        generarIdCie();
        vista.getBtncargardatos().addActionListener(l-> cargardatosexternosconcedula());
        vista.getBtncargardatos().addActionListener(l-> cargarFarmacosbusqueda(vista.getTxtbuscarfar().getText()));
        vista.getBtncargardatos().addActionListener(l-> cargarCIE10busqueda(vista.getTxtbuscarcie10().getText()));
        vista.getBtnbuscarfarmaco().addActionListener(l->abrir_Dialogfarmaco());
//        vista.getBtnbuscarfarmaco().addActionListener(l->cargarFARRec(vista.getTxtIDreceta().getText()));
        vista.getBtnBuscarcie().addActionListener(l->abrir_Dialogcie());
//        vista.getBtnBuscarcie().addActionListener(l->cargarCIE10Rec(vista.getTxtIDreceta().getText()));
      vista.getBtnagregardatos().addActionListener(l->crearRecFar());
//       vista.getBtnagregardatos().addActionListener(l-> cargarFARRec(vista.getTxtIDreceta().getText()));
       vista.getBtnagregarcie().addActionListener(l->crearRecCie());
//        vista.getBtnagregarcie().addActionListener(l-> cargarCIE10Rec(vista.getTxtIDreceta().getText()));
        vista.getBtnCrearRec().addActionListener(l->Validarreceta());
        //cargarCIE10busqueda(vista.getTxtbuscarcie10().getText());
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
               
            }
        };
//        vista.getTxtbuscarcie10().addKeyListener(kl);
//        vista.getTxtbuscarfar().addKeyListener(kl);
//        vista.getTxtIDreceta().addKeyListener(kl);
//        vista.getTxtIDreceta().addKeyListener(kl);
        
        
         cargarFarmacosbusqueda(vista.getTxtbuscarfar().getText());
         cargarCIE10busqueda(vista.getTxtbuscarcie10().getText());
                //--
//                cargarCIE10Rec(vista.getTxtIDreceta().getText());
               // vista.getBtncargarTabFarm().addActionListener(l-> cargarFARRec(vista.getTxtIDreceta().getText()));
        
        
        
       
    }
    
    private void generarSerie() {
      String   serie = modelo.id_receta();
        if (serie == null) {
            System.out.println("nunmero serie" + serie);
            vista.getTxtIDreceta().setText("01");
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
    vista.getTxtnombre().setText("");
    vista.getTxtApellido().setText("");
    vista.getTxtcedula().setText("");
    vista.getTxtsexo().setText("");
    vista.getTxtedad().setText("");
    vista.getJdcFechanaciento().setCalendar(null);
    vista.getTxtobservaciones().setText("");
    vista.getTxtalergias().setText("");
//    LimpiarTablafar();
//    LimpiarTablacie();
    generarSerie();
    
    cargarCIE10Rec(vista.getTxtIDreceta().getText());
    cargarFARRec(vista.getTxtIDreceta().getText());
    }
//    private void LimpiarTablafar(){
//            dtm2.getDataVector().removeAllElements();
//            vista.tblreceta.updateUI();
//    }
//    
//    private void LimpiarTablacie(){
//            dtm.getDataVector().removeAllElements();
//            vista.tblcie10.updateUI();
//    }
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
        limpiartxtcie10();
     }
    
    private void abrir_Dialogcie(){
        vista.getDialogCIE().setVisible(true);
        vista.getDialogCIE().setLocationRelativeTo(null);
        vista.getDialogCIE().setTitle("Buscar CIE-10");
        vista.getDialogCIE().setSize(550, 420);
        cargarCIE10();
        limpiartxtReceta();
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
        System.out.println("Fecha Actual: " + dia + "/" + (mes+1) + "/" + año);
        vista.getLblfecha().setText(dia + "-" + (mes+1) + "-" + año);

        }
//         public static LinkedList modelot2 = new LinkedList();
         
//         private void setModelo(){
//             String [] cabecera={"DETALLE", "DOSIS", "CANTIDAD", "FRECUENCIA"};
//             dtmreceta.setColumnIdentifiers(cabecera);
//             vista.tblreceta.setModel(dtmreceta);
//         }
//         
//         private void llenarLista(){
//             String nombre = vista.getTxtIdfamaco().getText();
//             String mg = vista.getTxtmiligramos().getText();
//             String cantidad = vista.getSpcantidad().getValue().toString();
////             String dosis = vista.getTxtdosis().getText();
//             String frecuencia = vista.getTxtfrecuencia().getText();
//             receta mireceta = new receta(nombre,mg,cantidad,frecuencia);
//             listareceta.add(mireceta);
//             setDatos();
//         }   
//         private void setDatos(){
//             Object[] datos = new Object[dtmreceta.getColumnCount()];
//             int i = 0;
//             dtmreceta.setRowCount(0);
//             for (receta mireceta : listareceta) {
//                 datos[0] = mireceta.getFarmaco();
//                 datos[1] = mireceta.getMiligramos()+"mg";
//                 datos[2] = mireceta.getCantidad();
//                 datos[3] = mireceta.getFrecuencia();
//                 i++;
//                 dtmreceta.addRow(datos);
//             }
//             vista.tblreceta.setModel(dtmreceta);
//             limpiartxtReceta();
//         }
         
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
             
        System.out.println("creando receta");
     
     String id_rec=vista.getTxtIDreceta().getText();
     String cedula=vista.getTxtcedula().getText();
     String nombres=vista.getTxtnombre().getText();
     String apellido=vista.getTxtApellido().getText();
     String sexo=vista.getTxtsexo().getText();
     String edad=vista.getTxtedad().getText();
     String fechaac=vista.getLblfecha().getText();
     String obs=vista.getTxtobservaciones().getText();
     String alergias=vista.getTxtalergias().getText();
        System.out.println("antes del metodo");
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
        System.out.println("despues del metodo");
                limpiartxt();
                generarSerie();

    }
         
         public void crearRecFar(){
         
     String id_rec_far=vista.getId_rec_far().getText();
     String id_rec=vista.getTxtIDreceta().getText();
     String farmaco=vista.getTxtIdfamaco().getText();
     String mg=vista.getTxtmiligramos().getText();
     String cantidad=String.valueOf(vista.getSpcantidad().getValue());
     String frecuencia=vista.getTxtfrecuencia().getText();
        System.out.println("antes del metodo");
     Model_Receta mEsp= new Model_Receta();
     
     mEsp.setId_rec_far(id_rec_far);
     mEsp.setId_receta(id_rec);
     mEsp.setFarmaco(farmaco);
     mEsp.setMiligramos(mg);
     mEsp.setCantidad(cantidad);
     mEsp.setFrecuencia(frecuencia);    
     
     mEsp.crearRecFar();
//     mEsp.crearPersonas2();
        System.out.println("despues del metodo");
                generarIdFar();
                limpiartxtReceta();
                limpiartxtcie10();

//                cargarFARRec();
//                LimpiarTablafar();
                cargarFARRec(vista.getTxtIDreceta().getText());
    }
         
         public void crearRecCie(){
         
     String id_rec_cie=vista.getId_rec_cie().getText();
     String id_rec=vista.getTxtIDreceta().getText();
     String id_cie=vista.getTxtCie().getText();
     String titulo=vista.getTxtCie1().getText();
     String categoria=vista.getTxttitulo().getText();
        System.out.println("antes del metodo");
     Model_Receta mEsp= new Model_Receta();
     
     mEsp.setId_rec_cie(id_rec_cie);
     mEsp.setId_receta(id_rec);
     mEsp.setId_titulo(id_cie+" - "+titulo);
     mEsp.setCategoria(categoria);    
     
     mEsp.crearRecCie();
//     mEsp.crearPersonas2();
        System.out.println("despues del metodo");
                generarIdCie();
                limpiartxtcie10();
                limpiartxtReceta();
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

        generarSerie();    
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

        generarSerie();   
        });
        
         }
         Icon advert;
          void Validarreceta(){
    //validaciones
        if (vista.getTxtnombre().equals("")&& vista.getTxtApellido().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese el nombre y apellido del Paciente","Error", JOptionPane.PLAIN_MESSAGE, advert);
        } else if (vista.getTxtcedula().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese la cedula del Paciente","Error", JOptionPane.PLAIN_MESSAGE, advert);
        } else if (vista.getTxtsexo().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese el genero del Paciente","Error", JOptionPane.PLAIN_MESSAGE, advert);
        } else if (vista.getTxtedad().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese la edad del Paciente","Error", JOptionPane.PLAIN_MESSAGE, advert);
        } else if (vista.getTxtIDreceta().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese el id de Receta","Error", JOptionPane.PLAIN_MESSAGE, advert);
        }else if (vista.getLblfecha().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese la fecha actual","Error", JOptionPane.PLAIN_MESSAGE, advert);
        } else{crearRecetas();}
        
        
//          else if (spinneredad.getValue().toString().equals("0")) {
//            JOptionPane.showMessageDialog(this, "Ingrese una edad valida","Error", JOptionPane.PLAIN_MESSAGE, advert);
//        } else if (selecsangre.getSelectedItem().toString().equals("Seleccione el tipo")) {
//            JOptionPane.showMessageDialog(this, "Elija el tipo de sangre","error", JOptionPane.PLAIN_MESSAGE, advert);
//        } else if (selecsexo.getSelectedItem().toString().equals("Seleccione el genero")) {
//            JOptionPane.showMessageDialog(this, "Elija el genero","error", JOptionPane.PLAIN_MESSAGE, advert);
//        } else if (txtprescripcion.getText().equals("")) {
//            JOptionPane.showMessageDialog(this, "Ingrese las observaciones","error", JOptionPane.PLAIN_MESSAGE, advert);
//        }
         }
}
