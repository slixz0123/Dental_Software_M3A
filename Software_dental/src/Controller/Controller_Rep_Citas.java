package Controller;

import Model.Citas;
import Model.ConexionPg;
import Model.Model_Citas;
import View.MenuPrincipal;
import View.Vista_Rep_Citas;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
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
         vista.getBtnrepcitas().addActionListener( l->cargarcitas());
         vista.getBtnrepgeneral().addActionListener( l->imprimirlistacitas());
         vista.getBtnrepespe().addActionListener( l->imprimirlistacitasespe());
        // radiobuttons();
    }
    
    private void imprimirlistacitas(){
        ConexionPg con =new ConexionPg();
          try {
              JasperReport listado = (JasperReport) JRLoader.loadObject(getClass().getResource("/Reportes/REPROCITASS.jasper"));
            
              JasperPrint jp = JasperFillManager.fillReport(listado, null, con.getConnection());//cargando el reporte con los datos de la base
          
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
              Map<String,Object>parametros = new HashMap<String,Object>();
             // parametros.put("numcedula", );
              JasperPrint jp = JasperFillManager.fillReport(jr, parametros, con.getConnection());//cargando el reporte con los datos de la base
          
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
   /*  public void radiobuttons(){
    vista.getBtgrepocitas().add(vista.getRadiobtngeneral());
     vista.getBtgrepocitas().add(vista.getRadiobnespecifico());
    if(vista.getRadiobtngeneral().isSelected()==true){
        cargarcitas();
    }else if(vista.getRadiobnespecifico().isSelected()==true){
         
     }
    }*/
}
