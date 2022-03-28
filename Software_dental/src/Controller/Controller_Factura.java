package Controller;

import Model.Factura;
import Model.Model_Factura;
import Model.Model_ListadoPacientes;
import Model.Model_Tratamiento;
import Model.Paciente;
import Model.Tratamiento;
import View.MenuPrincipal;
import View.Vista_crud_Factura;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.xml.ws.Holder;

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
    String cbDescuento;
    double pre;
    int cant;
    double tpagar;
    double descuento;
    double iva;

    public Controller_Factura(Model_Factura model, Vista_crud_Factura vista, MenuPrincipal vistamenu) {
        this.model = model;
        this.vista = vista;
        this.vistamenu = vistamenu;
        vista.setVisible(true);
        vista.setTitle("Factura");
        modelo = (DefaultTableModel) vista.getTblFactura().getModel();
        fecha();
        generarSerie();
    }

    public void iniciarControl() {
        vista.getBtnAceptar().addActionListener(l -> generarVentas());
//        vista.getBtnNombres().addActionListener(l -> BuscarPaciente());
//        vista.getBtnTratamiento().addActionListener(l -> BuscarTratamiento());
        vista.getBtnCargarDatos().addActionListener(l -> cargardatosexternosconcedula());
        vista.getBtnAgregar().addActionListener(l -> agrgarTratamiento());
//        vista.getBtnAgregar().addActionListener(l -> calculardesc());
        vista.getBtnCalculadora().addActionListener(l -> iniciarCalculadora());
        vista.getBtnBuscarTrat().addActionListener(l -> abrir_dialog());
        vista.getTblDialTratamiento().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                if (e.getClickCount() == 1) {
                    System.out.println("Se ha hecho un click");
                }
                if (e.getClickCount() == 2) {
                    System.out.println("Se ha hecho doble click");
                    SetDatos();
                    vista.getDlTratamiento().dispose();
                }
            }
        }
        );
    }

    private void abrir_dialog() {
        vista.getDlTratamiento().setVisible(true);
        vista.getDlTratamiento().setTitle("Buscar Tratamiento");
        vista.getDlTratamiento().setSize(550, 420);
        cargarTratamiento();
    }

    private void cargarTratamiento() {
        DefaultTableModel tblTrat = (DefaultTableModel) vista.getTblDialTratamiento().getModel();
        int fila = vista.getTblDialTratamiento().getSelectedRow();

        DefaultTableModel tbmodel;

        tbmodel = (DefaultTableModel) vista.getTblDialTratamiento().getModel();

        tbmodel.setNumRows(0);

        List<Tratamiento> milista = modeltrat.listaTratamiento("");

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
            JOptionPane.showMessageDialog(vista, "Se realizo con exito");
        }
    }

    public void guardarFactura() {
        String idpacien = vista.getLblid().getText();
        if (vista.getLblid().equals("")) {
            JOptionPane.showInputDialog(vista, "Debe ingresar el codigo del cliente");
        } else {
            Paciente pacien = modelpac.listarpaciente(idpacien);
            if (pacien.getId_paciente() != null) {
                String serie = vista.getTxtNumSerie().getText();
                String paciente = pacien.getNombres();
            } else {
            }
        }

    }

    public void cargardatosexternosconcedula() {

        String id12 = vistamenu.getLblCedulapac().getText();
        // pac.cargartxtsobrantes(id2);
        System.out.println(id12 + "-----");

        List<Paciente> milistapa = model.cargartxtsobrantes(id12);
        for (int i = 0; i < milistapa.size(); i++) {

            vista.getLblNombre().setText(milistapa.get(i).getNombres());
            vista.getLblApellido().setText(milistapa.get(i).getApellidos());
            vista.getLblDireccion().setText(milistapa.get(i).getDireccion());
            vista.getLblid().setText(id12);
        }

    }

    public void generarSerie() {
        serie = model.NumSerie();
        if (serie == null) {
            vista.getTxtNumSerie().setText("000001");
        } else {
            int inc = Integer.parseInt(serie);
            inc++;
            vista.getTxtNumSerie().setText("00000" + inc);
            if (serie.substring(5).equals("10")) {
                vista.getTxtNumSerie().setText("0000" + inc);//OJO OJO OJO OJO OJO
            }
        }

    }

    private void BuscarPaciente() {
        int r;
        String idpac = vista.getLblid().getText();
        if (vista.getLblid().equals("")) {
            JOptionPane.showInputDialog(vista, "Debe ingresar el codigo del cliente");
        } else {
            Paciente pac = modelpac.listarpaciente(idpac);
            if (pac.getId_paciente() != null) {
//                vista.getTxtNombreFac().setText(pac.getCedula_pac());

            } else {
                r = JOptionPane.showConfirmDialog(vista, "Paciente no registrado,¿Desea Registrar? ");
                if (r == 0) {

                }
            }
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
        vista.getTblFactura().setModel(modelo);
        calcularTotal();
        nuevo();

    }

    private void fecha() {
        Calendar calendar = new GregorianCalendar();
        int año, mes, dia;
        año = calendar.get(Calendar.YEAR);
        mes = calendar.get(Calendar.MONTH) + 1;
        dia = calendar.get(Calendar.DATE);
        if (mes < 10) {
            vista.getTxtFecha().setText(año + "/0" + mes + "/" + dia);
        }
        if (dia < 10) {
            vista.getTxtFecha().setText(año + "/" + mes + "/0" + dia);
        }
        if (dia > 10 && mes > 10) {
            vista.getTxtFecha().setText(año + "/" + mes + "/" + dia);
        } else if (dia < 10 && mes < 10) {
            vista.getTxtFecha().setText(año + "/0" + mes + "/0" + dia);
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
        if (vista.getCbDescuento().getSelectedItem().equals("--SELECIONAR--")) {
            cbDescuento = "--SELECIONAR--";
            vista.getTxtDescuento().setText("0");
            descuento = tpagar;
        } else if (vista.getCbDescuento().getSelectedItem().equals("10%")) {
            cbDescuento = "10%";
            vista.getTxtDescuento().setText("10");
            descuento = tpagar - (tpagar * 0.10);
        } else if (vista.getCbDescuento().getSelectedItem().equals("20%")) {
            cbDescuento = "20%";
            vista.getTxtDescuento().setText("20");
            descuento = tpagar - (tpagar * 0.20);
        } else if (vista.getCbDescuento().getSelectedItem().equals("30%")) {
            cbDescuento = "30%";
            vista.getTxtDescuento().setText("30");
            descuento = tpagar - (tpagar * 0.30);
        }
    }

    public void nuevo() {
//        vista.getTxtNombreFac().setText("");
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
