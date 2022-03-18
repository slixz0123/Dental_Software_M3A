/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Model_Farmacos;
import Model.farmaco;
import View.Vista_Farmacos;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class Controller_Farmacos {

    private Model_Farmacos modelo;
    private Vista_Farmacos vista;
    String serie;

    public Controller_Farmacos(Model_Farmacos modelo, Vista_Farmacos vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setVisible(true);
        generarId();
        LlenarTabla("");
    }

    public void iniciaControl() {
        KeyListener kl = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                LlenarTabla(vista.getTxtBuscarFarma().getText());
            }
        };
        vista.getTblListaFarma().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                if (e.getClickCount() == 1) {
                    System.out.println("Se ha hecho un click");
                }
                if (e.getClickCount() == 2) {
                    System.out.println("Se ha hecho doble click");
                    modificar();
                }
            }
        }
        );
        vista.getBtnGuardarFarma().addActionListener(l -> crearFarmaco());
        vista.getBtnElimFarma().addActionListener(l -> eliminar());
        vista.getBtnModifFarma().addActionListener(l -> editarFarmaco());
        vista.getTxtBuscarFarma().addKeyListener(kl);
        vista.getBtnRefrescarFarma().addActionListener(l -> LlenarTabla(""));
    }

    public void LlenarTabla(String aguja) {
        //Cargamos los datos a la vista
        DefaultTableModel model;
        model = (DefaultTableModel) vista.getTblListaFarma().getModel();
        model.setNumRows(0);
        List<farmaco> lista = modelo.listafarmaco(aguja);
        lista.stream().forEach(p1 -> {
            String[] far = {p1.getId_farmaco(), p1.getNombre_farmaco(), p1.getMaterial(), p1.getMiligramos(), p1.getDescripcion_far()};
            model.addRow(far);

        });
    }

    public void crearFarmaco() {
        
        String nombre = vista.getTxtNombreFar().getText().trim();
        String descrip = vista.getTxtADescripcionFarma().getText();
        String mg = vista.getTxtMgFar().getText();
        String material = vista.getCbxMaterial().getSelectedItem().toString();
        Model_Farmacos far = new Model_Farmacos();
        far.setId_farmaco(serie);
        far.setNombre_farmaco(nombre);
        far.setDescripcion_far(descrip);
        far.setMaterial(material);
        far.setMiligramos(mg);
        far.grabar();
        limpiarCampos();
        generarId();

    }

    public void editarFarmaco() {
        DefaultTableModel tblFar = (DefaultTableModel) vista.getTblListaFarma().getModel();
        int fila = vista.getTblListaFarma().getSelectedRow();
        String id = tblFar.getValueAt(fila, 0).toString();
        String nombre = vista.getTxtNombreFar().getText().trim();
        String descrip = vista.getTxtADescripcionFarma().getText();
        String mg = vista.getTxtMgFar().getText();
        String material = vista.getCbxMaterial().getSelectedItem().toString();
        Model_Farmacos far = new Model_Farmacos();
        far.setId_farmaco(id);
        far.setNombre_farmaco(nombre);
        far.setDescripcion_far(descrip);
        far.setMaterial(material);
        far.setMiligramos(mg);
        if (far.modificar()) {
            JOptionPane.showMessageDialog(vista, "Farmaco modificada satisfactoriamente");
            limpiarCampos();
        } else {
            JOptionPane.showMessageDialog(vista, "No se pudo modificar el farmaco");
        }
    }

    public void modificar() {
        DefaultTableModel tblFar = (DefaultTableModel) vista.getTblListaFarma().getModel();
        int fila = vista.getTblListaFarma().getSelectedRow();
        if (fila < 0) {
            JOptionPane.showMessageDialog(null, "Seleccione una fila");
        } else {
            if (fila >= 0) {
                vista.getTxtNombreFar().setText(tblFar.getValueAt(fila, 1).toString());
                vista.getCbxMaterial().setSelectedItem(tblFar.getValueAt(fila, 2));
                vista.getTxtMgFar().setText(tblFar.getValueAt(fila, 3).toString());
                vista.getTxtADescripcionFarma().setText(tblFar.getValueAt(fila, 4).toString());

            }
        }
    }

    private void generarId() {
        serie = modelo.NumId();
        if (serie == null) {
            serie = "1";
        } else {
            int inc = Integer.parseInt(serie);
            inc++;
            serie = "" + inc;

        }
    }

    private void eliminar() {
        int seleccion = vista.getTblListaFarma().getSelectedRow();
        if (seleccion < 0) {
            JOptionPane.showMessageDialog(null, "Seleccione una fila");
        } else {
            int confirmacion = JOptionPane.showConfirmDialog(vista, "Esta seguro que desea eliminar");
            if (confirmacion == 0) {

                String idpersona = (String) vista.getTblListaFarma().getModel().getValueAt(seleccion, 0);
                modelo.eliminar(idpersona);

                JOptionPane.showMessageDialog(vista, "Registro Eliminado");
                LlenarTabla("");
            } else {
                JOptionPane.showMessageDialog(vista, "Accion Cancelada");

            }

        }
    }

    private void limpiarCampos() {
        vista.getTxtNombreFar().setText("");
        vista.getTxtADescripcionFarma().setText("");
        vista.getTxtMgFar().setText("");
        vista.getCbxMaterial().setSelectedItem(null);
    }

}
