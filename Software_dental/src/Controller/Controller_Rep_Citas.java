package Controller;

import Model.Citas;
import Model.Paciente;
import Model.ConexionPg;
import Model.Model_Citas;
import Model.Model_Especialista;
import Model.Model_HistorialMedico;
import Model.Model_Paciente;
import Model.Paciente;
import View.MenuPrincipal;
import View.Vista_Rep_Citas;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class Controller_Rep_Citas {
     private Model_Citas modelo;
     private Model_Paciente modelpac;
     private Model_Especialista modelmed;
    private Vista_Rep_Citas vista;
 private MenuPrincipal vistamenu ;

      
    public Controller_Rep_Citas(Model_Citas modelo, Vista_Rep_Citas vista, MenuPrincipal vistamenu) {
        this.modelo = modelo;
        this.vista = vista;
         this.vistamenu = vistamenu;
        vista.setVisible(true);
        
        iniciaControl ();
        
        
    }
    public void iniciaControl () {
        
         vista.getBtnconsultar().addActionListener( l->cargardatoconcedula());
         
         vista.getBtnrepgeneral().addActionListener( l->imprimirlistacitas());
         vista.getBtnimprimir().addActionListener( l->imprimirlistacitasespe());
         
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
                cargarcitasbusqueda(vista.getTxtbuscar().getText());
            }
        };
       // setEventoKeytyped(vista.getTxtbuscar());
        // radiobuttons();
    }
    
     public void cargardatoconcedula(){
       
        
         String id2 = vistamenu.getLblCedulapac().getText();
           // pac.cargartxtsobrantes(id2);
            vista.getTxtbuscar().setText(id2);
        cargarcitas();
        
    }
    
    private void imprimirlistacitas(){
        ConexionPg con =new ConexionPg();
          try {
              JasperReport listado = (JasperReport) JRLoader.loadObject(getClass().getResource("/Reportes/REPROCITASS.jasper"));
            
              JasperPrint jp = JasperFillManager.fillReport(listado, null, con.Con());//cargando el reporte con los datos de la base
          
              JasperViewer jv = new JasperViewer(jp,false);
              jv.setVisible(true);
          } catch (JRException ex) {
              Logger.getLogger(Controller_Rep_Citas.class.getName()).log(Level.SEVERE, null, ex);
          }
    } 
     private void imprimirlistacitasespe(){
        ConexionPg con =new ConexionPg();
          try {
              JasperReport jr = (JasperReport)JRLoader.loadObject(getClass().getResource("/Reportes/recitascednom.jasper"));
              //Map<String,Object>parametros = new HashMap<String,Object>();
             //parametros.put("numcedula",vista.getTxtbuscar() );
             Map parametros = new HashMap();
             parametros.put("numcedula", vista.getTxtbuscar());
              JasperPrint jp = JasperFillManager.fillReport(jr, parametros, con.Con());//cargando el reporte con los datos de la base
          
              JasperViewer jv = new JasperViewer(jp,false);
              jv.setVisible(true);
          } catch (JRException ex) {
              Logger.getLogger(Controller_Rep_Citas.class.getName()).log(Level.SEVERE, null, ex);
          }
    }  
     private void  cargarcitas(){
        
        vista.getJtbllistadocitas().setDefaultRenderer(Object.class, new ImageTabla());//La manera de renderizar la tabla
        vista.getJtbllistadocitas().setRowHeight(100);
        
        
        DefaultTableModel tbmodel ; 
        tbmodel = (DefaultTableModel) vista.getJtbllistadocitas().getModel() ;
        tbmodel.setNumRows(0);
        
        List<Citas> milista = modelo.listarCitas(modelo.idPac(vistamenu.getLblCedulapac().getText()));
        Holder<Integer> i = new Holder<>(0);
        milista.stream().forEach(ci -> {
       
           tbmodel.addRow(new Object[7]);
           String id2 = vistamenu.getLblCedulapac().getText();
           // pac.cargartxtsobrantes(id2);
            vista.getJtbllistadocitas().setValueAt(id2, i.value, 0);
            String nom = vistamenu.getLblnombrescomp().getText();
           
            vista.getJtbllistadocitas().setValueAt(nom, i.value, 1);
            String ape = vistamenu.getLabelapellido().getText();
           
           vista.getJtbllistadocitas().setValueAt(ape, i.value, 2);
           vista.getJtbllistadocitas().setValueAt(ci.getFecha_cita(), i.value, 3);
           vista.getJtbllistadocitas().setValueAt(ci.getHora_cita(), i.value, 4);
           vista.getJtbllistadocitas().setValueAt(ci.getMotivo(), i.value, 5);
           
             String doc = vistamenu.getJcbDocs().getSelectedItem().toString().subSequence(11, 24).toString();
           // pac.cargartxtsobrantes(id2);
            vista.getJtbllistadocitas().setValueAt(doc, i.value, 6);
            
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

      tbmodel.addRow( new Object[3]);// creo una fila vacia
       //dibujar elementos de la tabla 
       vista.getJtbllistadocitas().setValueAt(pe.getCedula(), i.value, 0);
       vista.getJtbllistadocitas().setValueAt(pe.getNombres(), i.value, 1);
       vista.getJtbllistadocitas().setValueAt(pe.getApellidos(), i.value, 2);
         i.value++;

      
        });
        
        
                
    }
         private void  cargarcitasbusqueda (String busqueda){
        
        vista.getJtbllistadopac().setDefaultRenderer(Object.class, new  ImagenTabla()); 
        vista.getJtbllistadopac().setRowHeight(100);
      
        DefaultTableModel tbmodel ; 

        tbmodel = (DefaultTableModel) vista.getJtbllistadopac().getModel() ; 
  
        tbmodel.setNumRows(0);

        
        List<Citas> milistaci = modelo.listarCitascedula(busqueda);
     
        Holder<Integer> i = new Holder<>(0);
        milistaci.stream().forEach( ci -> {

      tbmodel.addRow( new Object[3]);// creo una fila vacia
       //dibujar elementos de la tabla 
       vista.getJtbllistadocitas().setValueAt(ci.getFecha_cita(), i.value, 3);
       vista.getJtbllistadocitas().setValueAt(ci.getHora_cita(), i.value, 4);
        vista.getJtbllistadocitas().setValueAt(ci.getMotivo(), i.value, 5);
        
        i.value++;

      
        });
                
    }
        
       /* vista.getJtbllistadocitas().setDefaultRenderer(Object.class, new ImageTabla());//La manera de renderizar la tabla
        vista.getJtbllistadocitas().setRowHeight(100);
        
        
        DefaultTableModel tbmodel ; 
        tbmodel = (DefaultTableModel) vista.getJtbllistadocitas().getModel() ;
        tbmodel.setNumRows(0);
        
        
    //    int fila =vista.getJtbllistadocitas().getSelectedRow();
      //  String cedula=(String)vista.getJtbllistadocitas().getValueAt(fila, 0);
       
      String cedula;
      if(vista.getBtnrepgeneral().isSelected()){
            cedula="";
             List<Citas> milista = modelo.listarCitas(modelo.idPac(cedula));
        Holder<Integer> i = new Holder<>(0);
        milista.stream().forEach(ci -> {
       
           tbmodel.addRow(new Object[7]);
           String id2 = vistamenu.getLblCedulapac().getText();
           // pac.cargartxtsobrantes(id2);
            vista.getJtbllistadocitas().setValueAt(id2, i.value, 0);
            String nom = vistamenu.getLblnombrescomp().getText();
           
            vista.getJtbllistadocitas().setValueAt(nom, i.value, 1);
            String ape = vistamenu.getLabelapellido().getText();
           
           vista.getJtbllistadocitas().setValueAt(ape, i.value, 2);
           vista.getJtbllistadocitas().setValueAt(ci.getFecha_cita(), i.value, 3);
           vista.getJtbllistadocitas().setValueAt(ci.getHora_cita(), i.value, 4);
           vista.getJtbllistadocitas().setValueAt(ci.getMotivo(), i.value, 5);
           
             String doc = vistamenu.getJcbDocs().getSelectedItem().toString().subSequence(11, 24).toString();
           // pac.cargartxtsobrantes(id2);
            vista.getJtbllistadocitas().setValueAt(doc, i.value, 6);
            
           i.value++;
        });
             
            
        }else if(vista.getBtnrepespe().isSelected()){
            cedula=vistamenu.getLblCedulapac().getText();
            
             List<Citas> milista = modelo.listarCitas(modelo.idPac(cedula));
        Holder<Integer> i = new Holder<>(0);
        milista.stream().forEach(ci -> {
       
           tbmodel.addRow(new Object[7]);
           String id2 = vistamenu.getLblCedulapac().getText();
           // pac.cargartxtsobrantes(id2);
            vista.getJtbllistadocitas().setValueAt(id2, i.value, 0);
            String nom = vistamenu.getLblnombrescomp().getText();
           
            vista.getJtbllistadocitas().setValueAt(nom, i.value, 1);
            String ape = vistamenu.getLabelapellido().getText();
           
           vista.getJtbllistadocitas().setValueAt(ape, i.value, 2);
           vista.getJtbllistadocitas().setValueAt(ci.getFecha_cita(), i.value, 3);
           vista.getJtbllistadocitas().setValueAt(ci.getHora_cita(), i.value, 4);
           vista.getJtbllistadocitas().setValueAt(ci.getMotivo(), i.value, 5);
           
             String doc = vistamenu.getJcbDocs().getSelectedItem().toString().subSequence(11, 24).toString();
           // pac.cargartxtsobrantes(id2);
            vista.getJtbllistadocitas().setValueAt(doc, i.value, 6);
            
           i.value++;
        });*/
             
        
       
      //buscar
     
     
     
     
       /*private void busqueda(java.awt.event.KeyEvent evt){ 
       DefaultTableModel tbmodel ; 
      
        tbmodel = (DefaultTableModel) vista.getJtbllistadocitas().getModel() ; 
     
        tbmodel.setNumRows(0);
        

        List<Citas> milista = modelo.listarCitascedula(vista.getTxtbuscar().getText());
        milista.stream().forEach(pe -> {
        String [] filacie = {pe.getFecha_cita().toString(),pe.getHora_cita(),pe.getMotivo()} ;
         tbmodel.addRow(filacie);

        });
        
        List<Paciente> milistapa = modelo.listarpacbuscar(busqueda);
     
        Holder<Integer> i = new Holder<>(0);
        milista.stream().forEach(pe -> {

      tbmodel.addRow( new Object[10]);// creo una fila vacia
       //dibujar elementos de la tabla 
       vista.getJtbllistadopac().setValueAt(pe.getCedula(), i.value, 0);
       vista.getJtbllistadopac().setValueAt(pe.getNombres(), i.value, 1);
       vista.getJtbllistadopac().setValueAt(pe.getApellidos(), i.value, 2);
          
    }
       private void setEventoKeytyped(JTextField txt)
    {
        txt.addKeyListener(new java.awt.event.KeyAdapter() {
 
        @Override
        public void keyReleased(KeyEvent e) {
        busqueda(e);
        }
        });
    }*/
    
    
    
   /*  public void radiobuttons(){
    vista.getBtgrepocitas().add(vista.getRadiobtngeneral());
     vista.getBtgrepocitas().add(vista.getRadiobnespecifico());
    if(vista.getRadiobtngeneral().isSelected()==true){
        cargarcitas();
    }else if(vista.getRadiobnespecifico().isSelected()==true){
         
     }
    }*/
}
