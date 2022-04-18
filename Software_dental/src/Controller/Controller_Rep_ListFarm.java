/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.ConexionPg;
import Model.Model_Farmacos;
import Model.farmaco;

import View.MenuPrincipal;
import View.Vista_Rep_ListFarm;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.List;
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
public class Controller_Rep_ListFarm {

    private Model_Farmacos modelo;
    private Vista_Rep_ListFarm vista;
    private MenuPrincipal vistamenu;

    public Controller_Rep_ListFarm(Model_Farmacos modelo, Vista_Rep_ListFarm vista, MenuPrincipal vistamenu) {
        this.modelo = modelo;
        this.vista = vista;
        this.vistamenu = vistamenu;
        vista.setVisible(true);
        vista.getBtnImprimir().addActionListener(l->imprimirListaFarmacos());
        vista.getBtnRefrescar().addActionListener(l->LlenarTabla(""));
        LlenarTabla("");
        KeyListener kl = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                LlenarTabla(vista.getTxtbuscar().getText());
            }
        };
        vista.getTxtbuscar().addKeyListener(kl);
    }

    public void LlenarTabla(String aguja) {
        //Cargamos los datos a la vista
        DefaultTableModel model;
        model = (DefaultTableModel) vista.getTblFarmacos().getModel();
        model.setNumRows(0);
        List<farmaco> lista = modelo.listafarmaco(aguja);
        lista.stream().forEach(p1 -> {
            String[] far = {p1.getId_farmaco(), p1.getNombre_farmaco(), p1.getMaterial(), p1.getMiligramos(), p1.getDescripcion_far()};
            model.addRow(far);

        });
    }

    public void imprimirListaFarmacos() {
        ConexionPg connection = new ConexionPg();
        try {
            JasperReport jr = (JasperReport) JRLoader.loadObject(getClass().getResource("/Reportes/farmacos.jasper"));
            JasperPrint jp = JasperFillManager.fillReport(jr, null, connection.getConnection());
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);

        } catch (JRException ex) {
        }

    }

}
