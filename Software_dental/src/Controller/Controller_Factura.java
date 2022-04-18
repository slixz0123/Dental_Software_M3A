package Controller;

import Model.ConexionPg;
import Model.Factura;
import Model.Model_Factura;
import Model.Model_ListadoPacientes;
import Model.Model_Tratamiento;
import Model.Paciente;
import Model.Tratamiento;
import View.MenuPrincipal;
import View.Vista_crud_Factura;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.xml.ws.Holder;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class Controller_Factura {

    private Model_Factura model;
    private Vista_crud_Factura vista;
    private MenuPrincipal vistamenu;

    Model_ListadoPacientes modelpac = new Model_ListadoPacientes();
    Model_Tratamiento modeltrat = new Model_Tratamiento();
    Tratamiento trat = new Tratamiento();
    Factura fac = new Factura();
    DefaultTableModel modelo;
    String serie;
    String spiDescuento;
    double pre;
    int cant;
    double tpagar;
    double descuento;
    double porcentaje;
    int fila;

    public Controller_Factura(Model_Factura model, Vista_crud_Factura vista, MenuPrincipal vistamenu) {
        this.model = model;
        this.vista = vista;
        this.vistamenu = vistamenu;
        vista.setVisible(true);
        vista.setTitle("Factura");
        modelo = (DefaultTableModel) vista.getTblFactura().getModel();
        fecha();
        generarSerie();
        iniciarControl();

    }

    public void iniciarControl() {
        vista.getBtnAceptar().addActionListener(l -> generarVentas());
        vista.getBtnCargarDatos().addActionListener(l -> cargardatosexternosconcedula());
        vista.getBtnAgregar().addActionListener(l -> agrgarTratamiento());
        vista.getBtnCalculadora().addActionListener(l -> iniciarCalculadora());
        vista.getBtnBuscarTrat().addActionListener(l -> abrir_dialog());
        vista.getBtnEliminar().addActionListener(l -> eliminarFila());
         vista.getBtnRefrecar().addActionListener(l->cargarTratamiento(""));
        vista.getTblFactura().addKeyListener(new java.awt.event.KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                int fila = vista.getTblFactura().getSelectedRow();
                if (fila < 0) {
                    JOptionPane.showMessageDialog(vista, "Seleccione una fila");
                } else {
                    if (fila >= 0) {
                        switch (e.getKeyCode()) {
                            case KeyEvent.VK_BACK_SPACE:
                                eliminarFila();
                                break;
                            case KeyEvent.VK_DELETE:
                                eliminarFila();
                                break;
                            default:
                                break;
                        }

                    }
                }

            }
        });
        vista.getTblDialTratamiento().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                if (e.getClickCount() == 1) {
                }
                if (e.getClickCount() == 2) {
                    SetDatos();
                    vista.getDlTratamiento().dispose();
                }
            }
        }
        );
        KeyListener kl = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                cargarTratamiento(vista.getTxtDlgTratamiento().getText());
            }
        };
        vista.getTxtDlgTratamiento().addKeyListener(kl);
    }

    private void abrir_dialog() {
        vista.getDlTratamiento().setVisible(true);
        vista.getDlTratamiento().setSize(550, 420);
        final Toolkit toolkit = Toolkit.getDefaultToolkit();
        final Dimension screenSize = toolkit.getScreenSize();
        final int x = (screenSize.width - vista.getDlTratamiento().getWidth()) / 2;
        final int y = (screenSize.height - vista.getDlTratamiento().getHeight()) / 2;
        vista.getDlTratamiento().setLocation(x, y);
        vista.getDlTratamiento().setTitle("Buscar Tratamiento");
        cargarTratamiento("");
    }

    private void cargarTratamiento(String buscar) {
        DefaultTableModel tblTrat = (DefaultTableModel) vista.getTblDialTratamiento().getModel();
        fila = vista.getTblDialTratamiento().getSelectedRow();

        DefaultTableModel tbmodel;

        tbmodel = (DefaultTableModel) vista.getTblDialTratamiento().getModel();

        tbmodel.setNumRows(0);

        List<Tratamiento> milista = modeltrat.listaTratamiento(buscar);

        Holder<Integer> i = new Holder<>(0);
        milista.stream().forEach(pe -> {

            tbmodel.addRow(new Object[3]);// creo una fila vacia
            //dibujar elementos de la tabla 
//       vista.getTblbuscarFarmacos().setValueAt(pe.getId_farmaco(), i.value, 0);
            vista.getTblDialTratamiento().setValueAt(pe.getId_tratamiento(), i.value, 0);
            vista.getTblDialTratamiento().setValueAt(pe.getNombre_trat(), i.value, 1);
            vista.getTblDialTratamiento().setValueAt(pe.getMaterial(), i.value, 2);
            vista.getTblDialTratamiento().setValueAt(pe.getDescripcion_trat(), i.value, 3);
            vista.getTblDialTratamiento().setValueAt(pe.getPrecio_trat(), i.value, 4);

            i.value++;

        });

    }

    public void SetDatos() {
        DefaultTableModel tblTrat = (DefaultTableModel) vista.getTblDialTratamiento().getModel();
        int fila = vista.getTblDialTratamiento().getSelectedRow();
        if (fila < 0) {
            JOptionPane.showMessageDialog(vista, "Seleccione una fila");
        } else {
            if (fila >= 0) {
                vista.getTxtTratamientoFac().setText(tblTrat.getValueAt(fila, 1).toString());
                vista.getTxtPrecio().setText(tblTrat.getValueAt(fila, 4).toString());

            }
        }
    }

    public void generarVentas() {
        if (vista.getTxtTotal().getText().equals("")) {
            JOptionPane.showMessageDialog(vista, "Debe ingresar datos ");
        } else {
            int confirmacion = JOptionPane.showConfirmDialog(vista, "Desea imprimir?");
            if (confirmacion == 0) {
                System.out.println("PROCESANDO FACTURA....");
                double precio = Double.parseDouble(vista.getTxtTotal().getText());
                String idfact = vista.getTxtNumSerie().getText();
                model.Actualizarprecio(precio, idfact);
                JOptionPane.showMessageDialog(vistamenu, "Factura Guardada");
                imprimirFactura();
                limpiarTabla();
                nuevo();
                generarSerie();

                vista.getTxtSubtotal().setText("");
                vista.getTxtDescuento().setText("");
                vista.getTxtTotal().setText("");
                vista.getLblNombre().setText("");
                vista.getLblApellido().setText("");
                vista.getLblDireccion().setText("");
                vista.getLblid().setText("");
            } else {
                double precio = Double.parseDouble(vista.getTxtTotal().getText());
                String idfact = vista.getTxtNumSerie().getText();
                model.Actualizarprecio(precio, idfact);
                JOptionPane.showMessageDialog(vistamenu, "Factura Guardada");
                limpiarTabla();
                nuevo();
                generarSerie();
                vista.getTxtSubtotal().setText("");
                vista.getTxtDescuento().setText("");
                vista.getTxtTotal().setText("");
                vista.getLblNombre().setText("");
                vista.getLblApellido().setText("");
                vista.getLblDireccion().setText("");
                vista.getLblid().setText("");
            }

        }
    }

    public void eliminarFila() {
        int seleccion = vista.getTblFactura().getSelectedRow();
        DefaultTableModel temp = (DefaultTableModel) vista.getTblFactura().getModel();
        if (seleccion < 0) {
            JOptionPane.showMessageDialog(null, "Seleccione una fila");
        } else {
            int confirmacion = JOptionPane.showConfirmDialog(vista, "Esta seguro que desea eliminar");
            if (confirmacion == 0) {
                String nomtrat = (String) vista.getTblFactura().getModel().getValueAt(seleccion, 1);
                String idfact = vista.getTxtNumSerie().getText();
                model.eliminarTratamiento(nomtrat, idfact);
                temp.removeRow(vista.getTblFactura().getSelectedRow());
                fila--;
                calcularTotal();
                vista.getTxtTratamientoFac().requestFocusInWindow();
            }
        }

    }

    public void guardarFactura() {
        String idpacien = vista.getLblid().getText();
        if (vista.getLblid().equals("")) {
            JOptionPane.showInputDialog(vista, "Debe ingresar el codigo del cliente");
        } else {
            Paciente pacien = modelpac.listarpaciente(idpacien);
            String serie = vista.getTxtNumSerie().getText();
            String paciente = vista.getLblid().getText();
            String direccion = vista.getLblDireccion().getText();
            String fecha = vista.getTxtFecha().getText();

            int fila = vista.getTblFactura().getRowCount();
            for (int i = 0; i < fila; i++) {
                String tratamiento = vista.getTblFactura().getValueAt(i, 1).toString();
                fac.setTratamiento(tratamiento);
            }

            fac.setSerieFac(serie);
            fac.setNombres(paciente);
            fac.setDireccion(direccion);
            fac.setFecha(fecha);
            model.GuardarFactura(fac);
            System.out.println("GUARDAR FACTURA OK");

        }

    }

    public void guardarDetalleFactura() {
        for (int i = 0; i < vista.getTblFactura().getRowCount(); i++) {
            int detfactura = model.IdFactura();
            String seriedet = vista.getTxtNumSerie().getText();
            int cantidaddet = Integer.parseInt(vista.getTblFactura().getValueAt(i, 0).toString());
            String tratadet = vista.getTblFactura().getValueAt(i, 1).toString();
            double preciounit = Double.parseDouble(vista.getTblFactura().getValueAt(i, 2).toString());
            double preciodet = Double.parseDouble(vista.getTblFactura().getValueAt(i, 3).toString());
            fac.setIdDetalle(detfactura);
            fac.setSerieFac(seriedet);
            fac.setCantidad(cantidaddet);
            fac.setTratamiento(tratadet);
            fac.setPreciounit(preciounit);
            fac.setTotalprod(preciodet);

        }
        model.GuardarDetalleFactura(fac);
        System.out.println("GUARDAR DETALLE FACTURA OK ");

    }

    public void cargardatosexternosconcedula() {

        String id12 = vistamenu.getLblCedulapac().getText();
        List<Paciente> milistapa = model.cargartxtsobrantes(id12);
        for (int i = 0; i < milistapa.size(); i++) {

            vista.getLblNombre().setText(milistapa.get(i).getNombres());
            vista.getLblApellido().setText(milistapa.get(i).getApellidos());
            vista.getLblDireccion().setText(milistapa.get(i).getDireccion());
            vista.getLblCelular().setText(milistapa.get(i).getCelular());
           
            vista.getLblid().setText(id12);
            guardarFactura();
//            generarSerie();
        }

    }

    public void generarSerie() {

        serie = model.NumSerie();
        if (serie == null) {
            vista.getTxtNumSerie().setText("0000001");
        } else {
            int inc = Integer.parseInt(serie);
            inc++;
            String nroSerie = String.format("%7s", String.valueOf(inc)).replace(' ', '0');
            vista.getTxtNumSerie().setText(nroSerie);

        }

    }

    public void BuscarTratamiento() {
        String idtrat = vista.getTxtTratamientoFac().getText();
        if (vista.getTxtTratamientoFac().equals("")) {
            JOptionPane.showMessageDialog(vista, "Debe ingresar el codigo de el tratamiento");
        } else {
            trat = modeltrat.listaTrat(idtrat);
            if (trat.getId_tratamiento() == null) {
                JOptionPane.showMessageDialog(vista, "Tratamiento no ingresado");

            } else {
                vista.getTxtTratamientoFac().setText(trat.getNombre_trat());
                vista.getTxtPrecio().setText("" + trat.getPrecio_trat());

            }
        }
    }

    public void agrgarTratamiento() {

        double total;
        String nomtrat = vista.getTxtTratamientoFac().getText();
        cant = Integer.parseInt(vista.getSpiCantidad().getValue().toString());
        pre = Double.parseDouble(vista.getTxtPrecio().getText());
        total = cant * pre;
        ArrayList lista = new ArrayList();
        lista.add(cant);
        lista.add(nomtrat);
        lista.add(pre);
        lista.add(total);
        Object[] ob = new Object[4];
        ob[0] = lista.get(0);
        ob[1] = lista.get(1);
        ob[2] = lista.get(2);
        ob[3] = lista.get(3);
        modelo.addRow(ob);
        guardarDetalleFactura();
        vista.getTblFactura().setModel(modelo);
        calcularTotal();
        nuevo();

    }

    public void imprimirFactura() {
        ConexionPg connection = new ConexionPg();
        try {
            JasperReport jr = (JasperReport) JRLoader.loadObject(getClass().getResource("/Reportes/factura.jasper"));
            Map<String, Object> parametros = new HashMap<String, Object>();
            parametros.put("CEDULA_PACIENTE", vista.getLblid().getText());
            parametros.put("NOMBRE_PACIENTE", vista.getLblNombre().getText());
            parametros.put("APELLIDO_PACIENTE", vista.getLblApellido().getText());
            parametros.put("TELEFONO_PACIENTE", vista.getLblCelular().getText());
            parametros.put("SUBTOTAL_PACIENTE", Double.parseDouble(vista.getTxtSubtotal().getText()));
            parametros.put("DESCUENTO_PACIENTE", Double.parseDouble(vista.getTxtDescuento().getText()));
            parametros.put("FACTURA_SERIE", vista.getTxtNumSerie().getText());
//            parametros.put("LogoImagen1",Controller_Factura.class.getResource("/icons/logo salud.png"));
//            parametros.put("LogoImagen2", Controller_Factura.class.getResource("/icons/imgReceta.jpg"));
            JasperPrint jp = JasperFillManager.fillReport(jr, parametros, connection.Con());
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);

        } catch (JRException ex) {
            Logger.getLogger(Controller_Factura.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void fecha() {
        Calendar calendar = new GregorianCalendar();
        int año, mes, dia;
        año = calendar.get(Calendar.YEAR);
        mes = calendar.get(Calendar.MONTH) + 1;
        dia = calendar.get(Calendar.DATE);
        if (mes < 10) {
            vista.getTxtFecha().setText(año + "-0" + mes + "-" + dia);
        }
        if (dia < 10) {
            vista.getTxtFecha().setText(año + "-" + mes + "-0" + dia);
        }
        if (dia > 10 && mes > 10) {
            vista.getTxtFecha().setText(año + "-" + mes + "-" + dia);
        } else if (dia < 10 && mes < 10) {
            vista.getTxtFecha().setText(año + "-0" + mes + "-0" + dia);
        }

    }

    public void limpiarTabla() {
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }

    public void calcularTotal() {
        tpagar = 0;
        for (int i = 0; i < vista.getTblFactura().getRowCount(); i++) {
            cant = Integer.parseInt(vista.getTblFactura().getValueAt(i, 0).toString());
            pre = Double.parseDouble(vista.getTblFactura().getValueAt(i, 2).toString());
            tpagar = tpagar + (cant * pre);
            calculardesc();
        }
        vista.getTxtSubtotal().setText("" + tpagar);
        vista.getTxtTotal().setText("" + descuento);
    }

    public void calculardesc() {
        if (vista.getSpiDesc().getValue().toString().equals("0")) {
            spiDescuento = vista.getSpiDesc().getValue().toString();
            vista.getTxtDescuento().setText(spiDescuento);
            descuento = tpagar;
        } else {
            spiDescuento = vista.getSpiDesc().getValue().toString();
        }
        porcentaje = Double.parseDouble(vista.getSpiDesc().getValue().toString()) / 100;
        vista.getTxtDescuento().setText(spiDescuento);
        descuento = tpagar - (tpagar * porcentaje);
//        iva = descuento + (descuento * 0.12);

    }

    public void nuevo() {
        vista.getTxtPrecio().setText("");
        vista.getTxtTratamientoFac().setText("");
    }

    public void iniciarCalculadora() {
        Runtime r = Runtime.getRuntime();
        try {
            Process p = r.exec("calc");
        } catch (IOException e) {
            System.out.println("No se puede ejecutar la calculadora " + e);
        }
    }
}
