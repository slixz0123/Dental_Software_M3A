/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;


import Model.ConexionPg;
import Model.Model_Tratamiento;
import Model.Tratamiento;
import View.MenuPrincipal;
import View.Vista_Rep_ListTrat;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
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
public class Controller_Rep_ListTrat {
     private Model_Tratamiento modelo;
    private Vista_Rep_ListTrat vista;
    private MenuPrincipal vistamenu ;
    

    public Controller_Rep_ListTrat(Model_Tratamiento modelo, Vista_Rep_ListTrat vista, MenuPrincipal vistamenu) {
        this.modelo = modelo;
        this.vista = vista;
        this.vistamenu = vistamenu;
        vista.setVisible(true);
        vista.getBtnImprimir().addActionListener(l->imprimirListaProductos());
        llenarTabla("");
          KeyListener kl = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                llenarTabla(vista.getTxtbuscar().getText());
            }
        };
          vista.getTxtbuscar().addKeyListener(kl);
        
    }
    
        public void llenarTabla(String buscar) {
        DefaultTableModel model;
        model = (DefaultTableModel) vista.getTblTratamientos().getModel();
        model.setRowCount(0);
        List<Tratamiento> listatrat = modelo.listaTratamiento(buscar);
        listatrat.stream().forEach(p1 -> {
            String[] trat = {p1.getId_tratamiento(), p1.getNombre_trat(), p1.getMaterial(), p1.getDescripcion_trat(), "" + p1.getPrecio_trat()};
            model.addRow(trat);
        });
    }
        
    public void imprimirListaProductos() {
        ConexionPg connection = new ConexionPg();
        try {
            JasperReport jr = (JasperReport) JRLoader.loadObject(getClass().getResource("/Reportes/tratamientos.jasper"));
            JasperPrint jp = JasperFillManager.fillReport(jr, null, connection.getConnection());
            JasperViewer jv = new JasperViewer(jp,false);
            jv.setVisible(true);

        } catch (JRException ex) {
        }

    }
}
