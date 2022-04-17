/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.ConexionPg;
import Model.Model_ListadoPacientes;
import Model.Model_Paciente;
import Model.Model_Proforma;
import Model.Model_Tratamiento;
import Model.Paciente;
import Model.Proforma;
import Model.Tratamiento;
import View.VISTA_PROFORMA;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
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

/**
 *
 * @author slix0
 */
public final class Controller_Proforma {

    private Model_Proforma modelo;
    private VISTA_PROFORMA vista;
    Model_Tratamiento modeltrat = new Model_Tratamiento();
    Model_Paciente modelpac = new Model_Paciente();
    Model_ListadoPacientes modellistpac = new Model_ListadoPacientes();
    Proforma pro = new Proforma();
    DefaultTableModel modelotbl;
    String spiDescuento, serie;
    String nombre, apellido, direccion, telefono;
    Date fechanac;
    int fila;
    int cant;
    double pre;
    double tpagar, descuento, porcentaje;

    public Controller_Proforma(Model_Proforma modelo, VISTA_PROFORMA vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setVisible(true);
        modelotbl = (DefaultTableModel) vista.getTblProforma().getModel();
        fecha();
        generarSerie();
        iniciarControl();
    }

    public void iniciarControl() {
        vista.getBtnBuscarTrat().addActionListener(l -> cargarDialogo(1));
        vista.getBtnBuscarPac().addActionListener(l -> cargarDialogo(2));
        vista.getBtnAgregar().addActionListener(l -> agregarTratamiento());
        vista.getBtnValidProforma().addActionListener(l -> generarProforma());
        vista.getTblProforma().addKeyListener(new java.awt.event.KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                int fila = vista.getTblProforma().getSelectedRow();
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

        vista.getTblDialog().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                if (e.getClickCount() == 1) {
                }
                if (e.getClickCount() == 2) {
                    if (vista.getjDialog1().getName().equals("Tratamiento")) {
                        SetDatosTrat();
                        vista.getjDialog1().dispose();
                    } else if (vista.getjDialog1().getName().equals("Paciente")) {
                        SetDatosPac();
                        vista.getjDialog1().dispose();
                        guardarProforma();
                          

                    } else {
                    }
                }
            }
        }
        );
    }

    private void cargarDialogo(int origen) {//Ponemos como parametro un entero para saber de que boton es pulsado(CREAR - EDITAR)
        vista.getjDialog1().setSize(600, 500);
        vista.getjDialog1().setLocationRelativeTo(vista);
        vista.getjDialog1().setVisible(false);

        switch (origen) {
            case 1:
                vista.getjDialog1().setTitle("Tratamiento");
                vista.getjDialog1().setName("Tratamiento");
                vista.getjDialog1().setVisible(true);
                cargarTratamiento();
                break;
            case 2:
                vista.getjDialog1().setTitle("Paciente");
                vista.getjDialog1().setName("Paciente");
                vista.getjDialog1().setVisible(true);
                cargarPaciente();
                break;
            default:
                vista.getjDialog1().setVisible(false);
                break;
        }

    }

    public void agregarTratamiento() {

        double total;
        String nomtrat = vista.getTxtTratamientos().getText();
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
        modelotbl.addRow(ob);
        vista.getTblProforma().setModel(modelotbl);
        calcularTotal();
        calcularCuota();
//        guardarProforma();
        guardarDetalleProforma();

        nuevo();

    }

    private void cargarTratamiento() {
        DefaultTableModel tblTrat = (DefaultTableModel) vista.getTblDialog().getModel();
        fila = vista.getTblDialog().getSelectedRow();

        DefaultTableModel tbmodel;

        tbmodel = (DefaultTableModel) vista.getTblDialog().getModel();
        tbmodel.setNumRows(0);
        tbmodel.setColumnCount(0);
        List<Tratamiento> milista = modeltrat.listaTratamiento("");
        tbmodel.addColumn("Id");
        tbmodel.addColumn("Nombre");
        tbmodel.addColumn("Material");
        tbmodel.addColumn("Descripcion");
        tbmodel.addColumn("Precio");
        Holder<Integer> i = new Holder<>(0);
        milista.stream().forEach(pe -> {

            tbmodel.addRow(new Object[4]);// creo una fila vacia
            //dibujar elementos de la tabla 
//       vista.getTblbuscarFarmacos().setValueAt(pe.getId_farmaco(), i.value, 0);
            vista.getTblDialog().setValueAt(pe.getId_tratamiento(), i.value, 0);
            vista.getTblDialog().setValueAt(pe.getNombre_trat(), i.value, 1);
            vista.getTblDialog().setValueAt(pe.getMaterial(), i.value, 2);
            vista.getTblDialog().setValueAt(pe.getDescripcion_trat(), i.value, 3);
            vista.getTblDialog().setValueAt(pe.getPrecio_trat(), i.value, 4);

            i.value++;

        });

    }

    private void cargarPaciente() {
        DefaultTableModel tblModel;
        tblModel = (DefaultTableModel) vista.getTblDialog().getModel();
        tblModel.setNumRows(0);
        tblModel.setColumnCount(0);
        List<Paciente> listap = modelpac.listarpac();
        tblModel.addColumn("Cedula");
        tblModel.addColumn("Nombre");
        tblModel.addColumn("Apellido");
        tblModel.addColumn("Direccion");
        tblModel.addColumn("Telefono");
        tblModel.addColumn("Fecha Nacimiento");
        Holder<Integer> i = new Holder<>(0);

        listap.stream().forEach(pe -> {
            tblModel.addRow(new Object[5]);
            vista.getTblDialog().setValueAt(pe.getCedula(), i.value, 0);//Fila 1 para que inicie despues de los titulos
            vista.getTblDialog().setValueAt(pe.getNombres(), i.value, 1);
            vista.getTblDialog().setValueAt(pe.getApellidos(), i.value, 2);
            vista.getTblDialog().setValueAt(pe.getDireccion(), i.value, 3);
            vista.getTblDialog().setValueAt(pe.getCelular(), i.value, 4);
            vista.getTblDialog().setValueAt(pe.getFecha_nac(), i.value, 5);
            i.value++;
        });
    }

    public void guardarProforma() {
        double cuotaini = 0;
        double saldo = 0;
        double cuotamensual = 0;
        double totalpr = 0;

        String idpacien = vista.getTxtPaciente().getText();
        if (vista.getTxtPaciente().equals("")) {
            JOptionPane.showInputDialog(vista, "Debe ingresar el codigo del cliente");
        } else {
            Paciente pacien = modellistpac.listarpaciente(idpacien);
            String serie = vista.getTxtNumSerie().getText();
            String paciente = vista.getTxtPaciente().getText();
            totalpr = Double.parseDouble(vista.getTxtValorTotal().getText());
            String fecha = vista.getTxtFecha().getText();
            String obs = vista.getTxtObservaciones().getText();
            String formap = vista.getCbFormaPago().getSelectedItem().toString();
            if (vista.getTxtCuotaInicial().getText().length() == 0) {
                cuotaini = 0;
            } else {
                cuotaini = Double.parseDouble(vista.getTxtCuotaInicial().getText());
            }
            if (vista.getTxtSaldo().getText().length() == 0) {
                saldo = 0;
            } else {
                saldo = Double.parseDouble(vista.getTxtSaldo().getText());

            }
            int mesescredit = Integer.parseInt(vista.getSpiMesesCred().getValue().toString());
            if (vista.getTxtValorCouotaM().getText().length() == 0) {
                cuotamensual = 0;
            } else {
                cuotamensual = Double.parseDouble(vista.getTxtValorCouotaM().getText());

            }
            pro.setSerieProf(serie);
            pro.setCedula(paciente);
            pro.setTotal(totalpr);
            pro.setFecha(fecha);
            pro.setObservaciones(obs);
            pro.setFormaPago(formap);
            pro.setCuotaini(cuotaini);
            pro.setSaldo(saldo);
            pro.setMesecredit(mesescredit);
            pro.setValorcuotamen(cuotamensual);
            modelo.GuardarProforma(pro);
            System.out.println("GUARDAR PROFORMA OK");

        }

    }
//    
//        public void ActguardarProforma() {
//        double cuotaini = 0;
//        double saldo = 0;
//        double cuotamensual = 0;
//        double totalpr = 0;
//
//        String idpacien = vista.getTxtPaciente().getText();
//        if (vista.getTxtPaciente().equals("")) {
//            JOptionPane.showInputDialog(vista, "Debe ingresar el codigo del cliente");
//        } else {
//            Paciente pacien = modellistpac.listarpaciente(idpacien);
//            String serie = vista.getTxtNumSerie().getText();
//            String paciente = vista.getTxtPaciente().getText();
//            totalpr = Double.parseDouble(vista.getTxtValorTotal().getText());
//            String fecha = vista.getTxtFecha().getText();
//            String obs = vista.getTxtObservaciones().getText();
//            String formap = vista.getCbFormaPago().getSelectedItem().toString();
//            if (vista.getTxtCuotaInicial().getText().length() == 0) {
//                cuotaini = 0;
//            } else {
//                cuotaini = Double.parseDouble(vista.getTxtCuotaInicial().getText());
//            }
//            if (vista.getTxtSaldo().getText().length() == 0) {
//                saldo = 0;
//            } else {
//                saldo = Double.parseDouble(vista.getTxtSaldo().getText());
//
//            }
//            int mesescredit = Integer.parseInt(vista.getSpiMesesCred().getValue().toString());
//            if (vista.getTxtValorCouotaM().getText().length() == 0) {
//                cuotamensual = 0;
//            } else {
//                cuotamensual = Double.parseDouble(vista.getTxtValorCouotaM().getText());
//
//            }
//            pro.setSerieProf(serie);
//            pro.setCedula(paciente);
//            pro.setTotal(totalpr);
//            pro.setFecha(fecha);
//            pro.setObservaciones(obs);
//            pro.setFormaPago(formap);
//            pro.setCuotaini(cuotaini);
//            pro.setSaldo(saldo);
//            pro.setMesecredit(mesescredit);
//            pro.setValorcuotamen(cuotamensual);
//            modelo.Actualizarprecio(totalpr,serie);
//            System.out.println("GUARDAR PROFORMA OK");
//
//        }
//
//    }

    public void generarProforma() {
        if (vista.getTxtValorTotal().getText().equals("")) {
            JOptionPane.showMessageDialog(vista, "Debe ingresar datos ");
        } else {
            int confirmacion = JOptionPane.showConfirmDialog(vista, "Desea imprimir?");
            if (confirmacion == 0) {

                System.out.println("PROCESANDO PROFORMA....");

                double precio = Double.parseDouble(vista.getTxtValorTotal().getText());
                String idfact = vista.getTxtNumSerie().getText();
                String obs = vista.getTxtObservaciones().getText();
                String fp= vista.getCbFormaPago().getSelectedItem().toString();
                double cuotaini = Double.parseDouble(vista.getTxtCuotaInicial().getText());
                double saldo=Double.parseDouble(vista.getTxtSaldo().getText());
                int mesescred = Integer.parseInt(vista.getSpiMesesCred().getValue().toString());
                double valorcuota = Double.parseDouble(vista.getTxtValorCouotaM().getText());
                modelo.Actualizarprecio(precio, idfact,obs,fp,cuotaini,saldo,mesescred,valorcuota);
//                ActguardarProforma();
                JOptionPane.showMessageDialog(vista, "Proforma Guardada");
                imprimirProforma();
                limpiarTabla();
                nuevo();
                generarSerie();
                vista.getTxtPaciente().setText("");
                vista.getTxtSubtotal().setText("");
                vista.getTxtDescuento().setText("");
                vista.getTxtValorTotal().setText("0.0");
                vista.getTxtCuotaInicial().setText("");
                vista.getTxtSaldo().setText("");
                vista.getTxtValorCouotaM().setText("");
                vista.getTxtObservaciones().setText("");
                vista.getSpiCantidad().setValue(1);
                vista.getCbFormaPago().setSelectedIndex(0);
                vista.getSpiDesc().setValue(0);
//                vista.getSpiMesesCred().setValue(0);

            } else {
                double precio = Double.parseDouble(vista.getTxtValorTotal().getText());
                String idfact = vista.getTxtNumSerie().getText();
//                modelo.Actualizarprecio(precio, idfact);
                JOptionPane.showMessageDialog(vista, "Proforma Guardada");
                limpiarTabla();
                nuevo();
                generarSerie();
                vista.getTxtPaciente().setText("");
                vista.getTxtSubtotal().setText("");
                vista.getTxtDescuento().setText("");
                vista.getTxtValorTotal().setText("0.0");
                vista.getTxtCuotaInicial().setText("");
                vista.getTxtSaldo().setText("");
                vista.getTxtValorCouotaM().setText("");
                vista.getTxtObservaciones().setText("");
                vista.getSpiCantidad().setValue(1);
                vista.getCbFormaPago().setSelectedIndex(0);
                vista.getSpiDesc().setValue(0);
                vista.getSpiMesesCred().setValue(0);
            }

        }
    }

    public void guardarDetalleProforma() {
        for (int i = 0; i < vista.getTblProforma().getRowCount(); i++) {
            int detfactura = modelo.IdProforma();
            String seriedet = vista.getTxtNumSerie().getText();
            int cantidaddet = Integer.parseInt(vista.getTblProforma().getValueAt(i, 0).toString());
            String tratadet = vista.getTblProforma().getValueAt(i, 1).toString();
            double preciounit = Double.parseDouble(vista.getTblProforma().getValueAt(i, 2).toString());
            double preciodet = Double.parseDouble(vista.getTblProforma().getValueAt(i, 3).toString());
            pro.setIdDetProf(detfactura);
            pro.setSerieProf(seriedet);
            pro.setCantidad(cantidaddet);
            pro.setTratamiento(tratadet);
            pro.setPreciounit(preciounit);
            pro.setTotalprod(preciodet);

        }
        modelo.GuardarDetalleProforma(pro);
        System.out.println("GUARDAR DETALLE PROFORMA OK ");

    }

    public void calcularCuota() {
        double cuotaini = 0;
        double saldo = 0;
        double cuotamensual = 0;
        if (vista.getCbFormaPago().getSelectedItem().toString().equals("T. Credito")) {
            if (vista.getSpiMesesCred().getValue().toString().equals("0")) {
                vista.getTxtCuotaInicial().setText(String.valueOf(cuotaini));
                vista.getTxtSaldo().setText(String.valueOf(saldo));
                vista.getTxtValorCouotaM().setText(String.valueOf(cuotamensual));
            } else if (vista.getSpiMesesCred().getValue().toString().equals("3")) {
                double vtotal = Double.parseDouble(vista.getTxtValorTotal().getText());
                cuotaini = (0.263 + vtotal) / 3;
                cuotamensual = cuotaini;
                saldo = cuotaini * 3;
                vista.getTxtCuotaInicial().setText(String.valueOf(cuotaini).subSequence(0, 5).toString());
                vista.getTxtSaldo().setText(String.valueOf(saldo).subSequence(0, 5).toString());
                vista.getTxtValorCouotaM().setText(String.valueOf(cuotamensual).subSequence(0, 5).toString());

            } else if (vista.getSpiMesesCred().getValue().toString().equals("4")) {
                double vtotal = Double.parseDouble(vista.getTxtValorTotal().getText());
                cuotaini = (0.330 + vtotal) / 4;
                cuotamensual = cuotaini;
                saldo = cuotaini * 4;
                vista.getTxtCuotaInicial().setText(String.valueOf(cuotaini).subSequence(0, 5).toString());
                vista.getTxtSaldo().setText(String.valueOf(saldo).subSequence(0, 5).toString());
                vista.getTxtValorCouotaM().setText(String.valueOf(cuotamensual).subSequence(0, 5).toString());

            } else if (vista.getSpiMesesCred().getValue().toString().equals("5")) {

                double vtotal = Double.parseDouble(vista.getTxtValorTotal().getText());
                cuotaini = (0.397 + vtotal) / 5;
                cuotamensual = cuotaini;
                saldo = cuotaini * 5;
                vista.getTxtCuotaInicial().setText(String.valueOf(cuotaini).subSequence(0, 5).toString());
                vista.getTxtSaldo().setText(String.valueOf(saldo).subSequence(0, 5).toString());
                vista.getTxtValorCouotaM().setText(String.valueOf(cuotamensual).subSequence(0, 5).toString());

            } else if (vista.getSpiMesesCred().getValue().toString().equals("6")) {

                double vtotal = Double.parseDouble(vista.getTxtValorTotal().getText());
                cuotaini = (0.465 + vtotal) / 6;
                cuotamensual = cuotaini;
                saldo = cuotaini * 6;
                vista.getTxtCuotaInicial().setText(String.valueOf(cuotaini).subSequence(0, 5).toString());
                vista.getTxtSaldo().setText(String.valueOf(saldo).subSequence(0, 5).toString());
                vista.getTxtValorCouotaM().setText(String.valueOf(cuotamensual).subSequence(0, 5).toString());

            } else if (vista.getSpiMesesCred().getValue().toString().equals("9")) {

                double vtotal = Double.parseDouble(vista.getTxtValorTotal().getText());
                cuotaini = (0.669 + vtotal) / 9;
                cuotamensual = cuotaini;
                saldo = cuotaini * 9;
                vista.getTxtCuotaInicial().setText(String.valueOf(cuotaini).subSequence(0, 5).toString());
                vista.getTxtSaldo().setText(String.valueOf(saldo).subSequence(0, 5).toString());
                vista.getTxtValorCouotaM().setText(String.valueOf(cuotamensual).subSequence(0, 5).toString());

            } else if (vista.getSpiMesesCred().getValue().toString().equals("12")) {

                double vtotal = Double.parseDouble(vista.getTxtValorTotal().getText());
                cuotaini = (0.876 + vtotal) / 12;
                cuotamensual = cuotaini;
                saldo = cuotaini * 12;
                vista.getTxtCuotaInicial().setText(String.valueOf(cuotaini).subSequence(0, 5).toString());
                vista.getTxtSaldo().setText(String.valueOf(saldo).subSequence(0, 5).toString());
                vista.getTxtValorCouotaM().setText(String.valueOf(cuotamensual).subSequence(0, 5).toString());

            } else if (vista.getSpiMesesCred().getValue().toString().equals("15")) {

                double vtotal = Double.parseDouble(vista.getTxtValorTotal().getText());
                cuotaini = (1.085 + vtotal) / 15;
                cuotamensual = cuotaini;
                saldo = cuotaini * 15;
                vista.getTxtCuotaInicial().setText(String.valueOf(cuotaini).subSequence(0, 5).toString());
                vista.getTxtSaldo().setText(String.valueOf(saldo).subSequence(0, 5).toString());
                vista.getTxtValorCouotaM().setText(String.valueOf(cuotamensual).subSequence(0, 5).toString());

            } else if (vista.getSpiMesesCred().getValue().toString().equals("18")) {

                double vtotal = Double.parseDouble(vista.getTxtValorTotal().getText());
                cuotaini = (1.297 + vtotal) / 18;
                cuotamensual = cuotaini;
                saldo = cuotaini * 18;
                vista.getTxtCuotaInicial().setText(String.valueOf(cuotaini).subSequence(0, 5).toString());
                vista.getTxtSaldo().setText(String.valueOf(saldo).subSequence(0, 5).toString());
                vista.getTxtValorCouotaM().setText(String.valueOf(cuotamensual).subSequence(0, 5).toString());

            } else if (vista.getSpiMesesCred().getValue().toString().equals("24")) {

                double vtotal = Double.parseDouble(vista.getTxtValorTotal().getText());
                cuotaini = (1.729 + vtotal) / 24;
                cuotamensual = cuotaini;
                saldo = cuotaini * 24;
                vista.getTxtCuotaInicial().setText(String.valueOf(cuotaini).subSequence(0, 5).toString());
                vista.getTxtSaldo().setText(String.valueOf(saldo).subSequence(0, 5).toString());
                vista.getTxtValorCouotaM().setText(String.valueOf(cuotamensual).subSequence(0, 5).toString());

            } else if (vista.getSpiMesesCred().getValue().toString().equals("36")) {
                double vtotal = Double.parseDouble(vista.getTxtValorTotal().getText());
                cuotaini = (2.623 + vtotal) / 36;
                cuotamensual = cuotaini;
                saldo = cuotaini * 36;
                vista.getTxtCuotaInicial().setText(String.valueOf(cuotaini).subSequence(0, 5).toString());
                vista.getTxtSaldo().setText(String.valueOf(saldo).subSequence(0, 5).toString());
                vista.getTxtValorCouotaM().setText(String.valueOf(cuotamensual).subSequence(0, 5).toString());
            }
        } else {

        }
    }

    public void imprimirProforma() {
        ConexionPg connection = new ConexionPg();
        try {
            JasperReport jr = (JasperReport) JRLoader.loadObject(getClass().getResource("/Reportes/proforma.jasper"));
            Map<String, Object> parametros = new HashMap<String, Object>();
            parametros.put("NOMBRE_PROF", nombre);
            parametros.put("APELLIDO_PROF", apellido);
            parametros.put("DIRECCION_PROF", direccion);
            parametros.put("TELEFONO_PROF", telefono);
            parametros.put("CEDULA_PROF", vista.getTxtPaciente().getText());
            parametros.put("SERIE_PROF", vista.getTxtNumSerie().getText());
            parametros.put("EDAD_PROF", calcularEdad());
            parametros.put("SUBTOTAL_PROF", Double.parseDouble(vista.getTxtSubtotal().getText()));
            parametros.put("DESCUENTO_PROF", Double.parseDouble(vista.getTxtDescuento().getText()));
            JasperPrint jp = JasperFillManager.fillReport(jr, parametros, connection.Con());
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);

        } catch (JRException ex) {
            Logger.getLogger(Controller_Proforma.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void generarSerie() {

        serie = modelo.NumSerie();
        if (serie == null) {
            vista.getTxtNumSerie().setText("0000001");
        } else {
            int inc = Integer.parseInt(serie);
            inc++;
            String nroSerie = String.format("%7s", String.valueOf(inc)).replace(' ', '0');
            vista.getTxtNumSerie().setText(nroSerie);

        }

    }

    public void SetDatosTrat() {
        DefaultTableModel tblTrat = (DefaultTableModel) vista.getTblDialog().getModel();
        int fila = vista.getTblDialog().getSelectedRow();
        if (fila < 0) {
            JOptionPane.showMessageDialog(vista, "Seleccione una fila");
        } else {
            if (fila >= 0) {
                vista.getTxtTratamientos().setText(tblTrat.getValueAt(fila, 1).toString());
                vista.getTxtPrecio().setText(tblTrat.getValueAt(fila, 4).toString());

            }
        }
    }

    public void SetDatosPac() {
        DefaultTableModel tblTrat = (DefaultTableModel) vista.getTblDialog().getModel();
        int fila = vista.getTblDialog().getSelectedRow();
        if (fila < 0) {
            JOptionPane.showMessageDialog(vista, "Seleccione una fila");
        } else {
            if (fila >= 0) {
                vista.getTxtPaciente().setText(tblTrat.getValueAt(fila, 0).toString());
                nombre = tblTrat.getValueAt(fila, 1).toString();
                apellido = tblTrat.getValueAt(fila, 2).toString();
                direccion = tblTrat.getValueAt(fila, 3).toString();
                telefono = tblTrat.getValueAt(fila, 4).toString();
                fechanac = (Date) tblTrat.getValueAt(fila, 5);

            }
        }
    }

    private int calcularEdad() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        Date dato = vista.getJdtfechanac().getDate();
        String fechael = dateFormat.format(fechanac);
        LocalDate hoy = LocalDate.now();
        System.out.println(fechael);
        LocalDate fechanac = LocalDate.parse(fechael);
        Period p = Period.between(fechanac, hoy);
        int Anio = p.getYears();
        int fecha = Anio;

//        vista.getTxtedad().setText("" + Anio + " años");
        return fecha;

    }

    public void eliminarFila() {
        int seleccion = vista.getTblProforma().getSelectedRow();
        DefaultTableModel temp = (DefaultTableModel) vista.getTblProforma().getModel();
        if (seleccion < 0) {
            JOptionPane.showMessageDialog(null, "Seleccione una fila");
        } else {
            int confirmacion = JOptionPane.showConfirmDialog(vista, "Esta seguro que desea eliminar");
            if (confirmacion == 0) {
                String nomtrat = (String) vista.getTblProforma().getModel().getValueAt(seleccion, 1);
                String idfact = vista.getTxtNumSerie().getText();
                modelo.eliminarTratamiento(nomtrat, idfact);
                temp.removeRow(vista.getTblProforma().getSelectedRow());
                fila--;
                calcularTotal();
            }
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
        for (int i = 0; i < modelotbl.getRowCount(); i++) {
            modelotbl.removeRow(i);
            i = i - 1;
        }
    }

    public void calcularTotal() {

        tpagar = 0;
        for (int i = 0; i < vista.getTblProforma().getRowCount(); i++) {
            cant = Integer.parseInt(vista.getTblProforma().getValueAt(i, 0).toString());
            pre = Double.parseDouble(vista.getTblProforma().getValueAt(i, 2).toString());
            tpagar = tpagar + (cant * pre);
            calculardesc();
        }
        vista.getTxtSubtotal().setText("" + tpagar);
        vista.getTxtValorTotal().setText("" + descuento);
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
        vista.getTxtTratamientos().setText("");
    }

}
