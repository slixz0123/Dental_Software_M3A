/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.ConexionPg;
import Model.Hist_Medico;
import Model.Model_HistorialMedico;
import View.MenuPrincipal;
import View.Vista_Rep_HistorialOdontologico;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
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
 * @author Saul
 */
public class Controller_Rep_His_Med {
    private Model_HistorialMedico modelo;
    private Vista_Rep_HistorialOdontologico vista;
    private MenuPrincipal vistaMenu;

    public Controller_Rep_His_Med(Model_HistorialMedico modelo, Vista_Rep_HistorialOdontologico vista, MenuPrincipal vistaMenu) {
        this.modelo = modelo;
        this.vista = vista;
        this.vistaMenu = vistaMenu;
        vista.setVisible(true);
        iniciar();
    }
    private void iniciar(){
    vista.getBtnCargarDatos().addActionListener(l->cargardesdeMenu());
    vista.getBtnLimpiar().addActionListener(l->limpiar());
    vista.getBtnImprimir().addActionListener(l->imprimir());
    eventocargar(vista.getTablahistorial());
    pintarbtnimprimir(vista.getBtnImprimir());
    pintarbtncargar(vista.getBtnCargarDatos());
    pintarbtnlimpiar(vista.getBtnLimpiar());
    }
    //
    //
    private void pintarbtnimprimir(JButton bt){
    bt.addMouseListener(new java.awt.event.MouseAdapter() {
    @Override
    public void mouseEntered(MouseEvent e){
     vista.getBtnImprimir().setBackground(new Color (3, 100, 80));
     vista.getBtnImprimir().setForeground(Color.WHITE);
    }
    @Override
    public void mouseExited(MouseEvent e){
     vista.getBtnImprimir().setBackground(new Color (240, 240, 240));
     vista.getBtnImprimir().setForeground(Color.BLACK);
    }
    });
    }
    //
    private void pintarbtncargar(JButton bt){
    bt.addMouseListener(new java.awt.event.MouseAdapter() {
    @Override
    public void mouseEntered(MouseEvent e){
     vista.getBtnCargarDatos().setBackground(new Color (3, 100, 80));
     vista.getBtnCargarDatos().setForeground(Color.WHITE);
    }
    @Override
    public void mouseExited(MouseEvent e){
     vista.getBtnCargarDatos().setBackground(new Color (240, 240, 240));
     vista.getBtnCargarDatos().setForeground(Color.BLACK);
    }
    });
    }
    //
    private void pintarbtnlimpiar(JButton bt){
    bt.addMouseListener(new java.awt.event.MouseAdapter() {
    @Override
    public void mouseEntered(MouseEvent e){
     vista.getBtnLimpiar().setBackground(new Color (3, 100, 80));
     vista.getBtnLimpiar().setForeground(Color.WHITE);
    }
    @Override
    public void mouseExited(MouseEvent e){
     vista.getBtnLimpiar().setBackground(new Color (240, 240, 240));
     vista.getBtnLimpiar().setForeground(Color.BLACK);
    }
    });
    }
    //
    private void cargardesdeMenu(){
     String cedu=vistaMenu.getLblCedulapac().getText();
     if(cedu.equals("...")||cedu.equals("")){JOptionPane.showMessageDialog(vistaMenu, "Debe tener cargado un paciente en la parte superior");} else{
     cargartablahistorial();
        }
     }
    
    private void eventocargar(JTable tbl){
    tbl.addMouseListener(new java.awt.event.MouseAdapter() {
    @Override
    public void mouseClicked(MouseEvent e){
        llenardatoshistorial(e);
    }
    });
    } 
    //Llenar datos paciente
    private void llenardatoshistorial(java.awt.event.MouseEvent e){
        int filasel = vista.getTablahistorial().getSelectedRow();
        String id=(String) vista.getTablahistorial().getValueAt(filasel, 0);
        Date fecha=(Date) vista.getTablahistorial().getValueAt(filasel, 1);
        SimpleDateFormat fechacon = new SimpleDateFormat("yyyy-MM-dd");
        String fecha1 = fechacon.format(fecha);
        List<Hist_Medico> list_h=modelo.listarbuscarhisttabla(fecha1, id);
        for (int a = 0; a < list_h.size(); a++) {
        if (list_h.get(a).getId_his_med().equals(id)) {
           vista.getTxtenfermedad().setText(list_h.get(a).getEnfermedad_act());
           vista.getTxtantecedentes().setText(list_h.get(a).getAnt_fam());
           vista.getTxttratamiento().setText(list_h.get(a).getTrat_med());
           vista.getTxtalergia().setText(list_h.get(a).getAler_med());
           vista.getTxtmedicamento().setText(list_h.get(a).getMed_hab());
           vista.getTxtfumbebe().setText(list_h.get(a).getFum_b());
           vista.getTxtproblemascar().setText(list_h.get(a).getPro_card());
           vista.getTxtulcera().setText(list_h.get(a).getUlc_gas());
           vista.getTxtpresion().setText(list_h.get(a).getPresion());
           vista.getTxthepatitis().setText(list_h.get(a).getHepat());
           vista.getTxtdiabetes().setText(list_h.get(a).getDiabetes());
           vista.getTxtepilepsia().setText(list_h.get(a).getEpilepsia());
           vista.getTxtdolorescab().setText(list_h.get(a).getDo_cab());
           vista.getTxtaltend().setText(list_h.get(a).getAl_endo());
           vista.getTxtvih().setText(list_h.get(a).getVih());
           vista.getTxtprobcoag().setText(list_h.get(a).getPro_coagu());
           vista.getTxtfrecres().setText(list_h.get(a).getFre_res());
           vista.getTxtfreccar().setText(list_h.get(a).getFre_car());
           vista.getTxtpresart().setText(list_h.get(a).getPre_art());
           vista.getTxttemp().setText(list_h.get(a).getTem());
           vista.getTxtoxi().setText(list_h.get(a).getOxim());
        }
      }
    }
  
    private void cargartablahistorial(){
    DefaultTableModel tblModel;
    tblModel=(DefaultTableModel)vista.getTablahistorial().getModel();
    tblModel.setNumRows(0);
    List<Hist_Medico> listap= modelo.listarbuscarhist("",modelo.idPac(vistaMenu.getLblCedulapac().getText()));
    Holder<Integer> i = new Holder<>(0);

    listap.stream().forEach(pe->{
    tblModel.addRow(new Object[3]);   
    vista.getTablahistorial().setValueAt(pe.getId_his_med(), i.value, 0);
    vista.getTablahistorial().setValueAt(pe.getFecha_his(), i.value, 1);
    vista.getTablahistorial().setValueAt(pe.getHora_his(), i.value, 2);
    i.value++;
    });
    }
    
    private void limpiar(){
    
    vista.getTxtenfermedad().setText("");
    vista.getTxtantecedentes().setText("");
    vista.getTxttratamiento().setText("");
    vista.getTxtalergia().setText("");
    vista.getTxtmedicamento().setText("");
    vista.getTxtfumbebe().setText("");
    vista.getTxtproblemascar().setText("");
    vista.getTxtulcera().setText("");
    vista.getTxtpresion().setText("");
    vista.getTxthepatitis().setText("");
    vista.getTxtdiabetes().setText("");
    vista.getTxtepilepsia().setText("");
    vista.getTxtdolorescab().setText("");
    vista.getTxtaltend().setText("");
    vista.getTxtvih().setText("");
    vista.getTxtprobcoag().setText("");
    vista.getTxtfrecres().setText("");
    vista.getTxtfreccar().setText("");
    vista.getTxtpresart().setText("");
    vista.getTxttemp().setText("");
    vista.getTxtoxi().setText("");
    cargartablahistorial();
}
    private void imprimir(){
    ConexionPg con= new ConexionPg();
    int filasel = vista.getTablahistorial().getSelectedRow();
    if (filasel==-1){
    JOptionPane.showMessageDialog(null, "Debe seleccionar un dato de la tabla");
    }else{
    String num=(String) vista.getTablahistorial().getValueAt(filasel, 0);
        try {
            JasperReport listado = (JasperReport) JRLoader.loadObject(getClass().getResource("/Reportes/Reporte Hist Odontologico.jasper"));
            
            Map parametros = new HashMap();
            parametros.put("reporteid", num);
            JasperPrint impr= JasperFillManager.fillReport(listado, parametros, con.Con());
            JasperViewer ver= new JasperViewer(impr,false);
            ver.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(Controller_Rep_His_Med.class.getName()).log(Level.SEVERE, null, ex);
        }}
    }
}
