package Controller;

import Model.Model_Tratamiento;
import Model.Tratamiento;
import View.Vista_crud_Tratamiento;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Controller_CrudTratamiento {

    private Model_Tratamiento modelo;
    private Vista_crud_Tratamiento vista;
    String serie;

    public Controller_CrudTratamiento(Model_Tratamiento modelo, Vista_crud_Tratamiento vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setVisible(true);
        generarId();
        llenarTabla("");
        iniciaControl();
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
                llenarTabla(vista.getTxtBuscar().getText());
            }
        };
        KeyListener validarnum = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (c < '0' || c > '9') {
                    e.consume();
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        };
        vista.getTxtPrecioTrat().addKeyListener(validarnum);

        vista.getTblListaTrat().addMouseListener(new java.awt.event.MouseAdapter() {
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

        vista.getBtnGuardar().addActionListener(l -> crearTratamiento());
        vista.getBtnEliminar().addActionListener(l -> eliminar());
        vista.getBtnEditar().addActionListener(l -> editarTratamiento());
        vista.getTxtBuscar().addKeyListener(kl);
        vista.getBtnEditar().setEnabled(false);

    }

    public void generarId() {
        serie = modelo.NumId();
        if (serie == null) {
            serie = "1";
        } else {
            int inc = Integer.parseInt(serie);
            inc++;
            serie = "" + inc;
        }
    }

    public void llenarTabla(String buscar) {
        DefaultTableModel model;
        model = (DefaultTableModel) vista.getTblListaTrat().getModel();
        model.setRowCount(0);
        List<Tratamiento> listatrat = modelo.listaTratamiento(buscar);
        listatrat.stream().forEach(p1 -> {
            String[] trat = {p1.getId_tratamiento(), p1.getNombre_trat(), p1.getMaterial(), p1.getDescripcion_trat(), "" + p1.getPrecio_trat()};
            model.addRow(trat);
        });
    }

    public void crearTratamiento() {
        String nombre = vista.getTxtNomTratamiento().getText();
        String descripcion = vista.getTxtADescripTrat().getText();
        double precio = Double.parseDouble(vista.getTxtPrecioTrat().getText());
        String material = vista.getTxtTipMatTrat().getText();
        Model_Tratamiento trat = new Model_Tratamiento();
        trat.setId_tratamiento(serie);
        trat.setNombre_trat(nombre);
        trat.setDescripcion_trat(descripcion);
        trat.setPrecio_trat(precio);
        trat.setMaterial(material);
        if (trat.grabar() == true) {
            JOptionPane.showMessageDialog(null, "Tratamiento guardado");
        } else {
            JOptionPane.showMessageDialog(null, "Error al guardar tratamiento");
        }
        llenarTabla("");
        limpiarCampos();
        generarId();
    }

    public void editarTratamiento() {
        DefaultTableModel tblTrat = (DefaultTableModel) vista.getTblListaTrat().getModel();
        int fila = vista.getTblListaTrat().getSelectedRow();
        String id = tblTrat.getValueAt(fila, 0).toString();
        String nombre = vista.getTxtNomTratamiento().getText();
        String desrip = vista.getTxtADescripTrat().getText();
        double precio = Double.parseDouble(vista.getTxtPrecioTrat().getText());
        String material = vista.getTxtTipMatTrat().getText();
        Model_Tratamiento trat = new Model_Tratamiento();
        trat.setId_tratamiento(id);
        trat.setNombre_trat(nombre);
        trat.setDescripcion_trat(desrip);
        trat.setPrecio_trat(precio);
        trat.setMaterial(material);
        if (trat.modificar()) {
            JOptionPane.showMessageDialog(vista, "Tratamiento mosdificado satisfactoriamente");
            limpiarCampos();
            llenarTabla("");
            vista.getBtnGuardar().setEnabled(true);
            vista.getBtnEditar().setEnabled(false);

        } else {
            JOptionPane.showMessageDialog(vista, "No se pudo modificar el tratamiento");
            vista.getBtnGuardar().setEnabled(true);
            vista.getBtnEditar().setEnabled(false);

        }
    }

    public void modificar() {
        DefaultTableModel tblTrat = (DefaultTableModel) vista.getTblListaTrat().getModel();
        int fila = vista.getTblListaTrat().getSelectedRow();
        if (fila < 0) {
            JOptionPane.showMessageDialog(vista, "Seleccione una fila");
        } else {
            if (fila >= 0) {
                vista.getTxtNomTratamiento().setText(tblTrat.getValueAt(fila, 1).toString());
                vista.getTxtTipMatTrat().setText(tblTrat.getValueAt(fila, 2).toString());
                vista.getTxtADescripTrat().setText(tblTrat.getValueAt(fila, 3).toString());
                vista.getTxtPrecioTrat().setText(tblTrat.getValueAt(fila, 4).toString());
                vista.getBtnGuardar().setEnabled(false);
                vista.getBtnEditar().setEnabled(true);

            }
        }
    }

    private void eliminar() {
        int seleccion = vista.getTblListaTrat().getSelectedRow();
        if (seleccion < 0) {
            JOptionPane.showMessageDialog(null, "Seleccione una fila");
        } else {
            int confirmacion = JOptionPane.showConfirmDialog(vista, "Esta seguro que desea eliminar");
            if (confirmacion == 0) {

                String idtrat = (String) vista.getTblListaTrat().getModel().getValueAt(seleccion, 0);
                modelo.eliminar(idtrat);

                JOptionPane.showMessageDialog(vista, "Registro Eliminado");
                llenarTabla("");
                limpiarCampos();
                vista.getBtnGuardar().setEnabled(true);
                vista.getBtnEditar().setEnabled(false);

            } else {
                JOptionPane.showMessageDialog(vista, "Accion Cancelada");
                limpiarCampos();
                vista.getBtnGuardar().setEnabled(true);
                vista.getBtnEditar().setEnabled(false);

            }

        }
    }

    public void limpiarCampos() {
        vista.getTxtNomTratamiento().setText("");
        vista.getTxtADescripTrat().setText("");
        vista.getTxtPrecioTrat().setText("");
        vista.getTxtTipMatTrat().setText("");

    }

}
