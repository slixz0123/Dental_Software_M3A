/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Usuario
 */
public class Vista_crud_Factura extends javax.swing.JInternalFrame {

    /**
     * Creates new form Vista_crud_Factura
     */
    public Vista_crud_Factura() {
        initComponents();
    }

    public JLabel getLblCelular() {
        return lblCelular;
    }

    public void setLblCelular(JLabel lblCelular) {
        this.lblCelular = lblCelular;
    }

    public JButton getBtnRefrecar() {
        return btnRefrecar;
    }

    public void setBtnRefrecar(JButton btnRefrecar) {
        this.btnRefrecar = btnRefrecar;
    }
    

    public JButton getBtnCalculadora() {
        return btnCalculadora;
    }

    public void setBtnCalculadora(JButton btnCalculadora) {
        this.btnCalculadora = btnCalculadora;
    }

    public JButton getBtnEliminar() {
        return btnEliminar;
    }

    public void setBtnEliminar(JButton btnEliminar) {
        this.btnEliminar = btnEliminar;
    }
    
    

    public JTextField getTxtDlgTratamiento() {
        return txtDlgTratamiento;
    }

    public void setTxtDlgTratamiento(JTextField txtDlgTratamiento) {
        this.txtDlgTratamiento = txtDlgTratamiento;
    }

    public JDialog getDlTratamiento() {
        return dlTratamiento;
    }

    public void setDlTratamiento(JDialog dlTratamiento) {
        this.dlTratamiento = dlTratamiento;
    }

    public JTable getTblDialTratamiento() {
        return tblDialTratamiento;
    }

    public void setTblDialTratamiento(JTable tblDialTratamiento) {
        this.tblDialTratamiento = tblDialTratamiento;
    }

    public JButton getBtnCargarDatos() {
        return btnCargarDatos;
    }

    public void setBtnCargarDatos(JButton btnCargarDatos) {
        this.btnCargarDatos = btnCargarDatos;
    }

    public JLabel getLblDireccion() {
        return lblDireccion;
    }

    public void setLblDireccion(JLabel lblDireccion) {
        this.lblDireccion = lblDireccion;
    }

    public JLabel getLblApellido() {
        return lblApellido;
    }

    public void setLblApellido(JLabel lblApellido) {
        this.lblApellido = lblApellido;
    }

    public JLabel getLblNombre() {
        return lblNombre;
    }

    public void setLblNombre(JLabel lblNombre) {
        this.lblNombre = lblNombre;
    }

    public JLabel getLblid() {
        return lblid;
    }

    public void setLblid(JLabel lblid) {
        this.lblid = lblid;
    }

    public JTextField getTxtFecha() {
        return txtFecha;
    }

    public void setTxtFecha(JTextField txtFecha) {
        this.txtFecha = txtFecha;
    }

    public JButton getBtnAceptar() {
        return btnAceptar;
    }

    public void setBtnAceptar(JButton btnAceptar) {
        this.btnAceptar = btnAceptar;
    }

    public JButton getBtnAgregar() {
        return btnAgregar;
    }

    public void setBtnAgregar(JButton btnAgregar) {
        this.btnAgregar = btnAgregar;
    }

    public JButton getBtnBuscarTrat() {
        return btnBuscarTrat;
    }

    public void setBtnBuscarTrat(JButton btnBuscarTrat) {
        this.btnBuscarTrat = btnBuscarTrat;
    }

    public JButton getBtnCancelar() {
        return btnCancelar;
    }

    public void setBtnCancelar(JButton btnCancelar) {
        this.btnCancelar = btnCancelar;
    }

    public JButton getBtneditar() {
        return btneditar;
    }

    public void setBtneditar(JButton btneditar) {
        this.btneditar = btneditar;
    }

    public JButton getBtneliminar() {
        return btneliminar;
    }

    public void setBtneliminar(JButton btneliminar) {
        this.btneliminar = btneliminar;
    }

    public JSpinner getSpiCantidad() {
        return spiCantidad;
    }

    public void setSpiCantidad(JSpinner spiCantidad) {
        this.spiCantidad = spiCantidad;
    }

    public JSpinner getSpiDesc() {
        return spiDesc;
    }

    public void setSpiDesc(JSpinner spiDesc) {
        this.spiDesc = spiDesc;
    }


    public JTable getTblFactura() {
        return tblFactura;
    }

    public void setTblFactura(JTable tblFactura) {
        this.tblFactura = tblFactura;
    }

    public JTextField getTxtDescuento() {
        return txtDescuento;
    }

    public void setTxtDescuento(JTextField txtDescuento) {
        this.txtDescuento = txtDescuento;
    }

    public JTextField getTxtNumSerie() {
        return txtNumSerie;
    }

    public void setTxtNumSerie(JTextField txtNumSerie) {
        this.txtNumSerie = txtNumSerie;
    }

    public JTextField getTxtPrecio() {
        return txtPrecio;
    }

    public void setTxtPrecio(JTextField txtPrecio) {
        this.txtPrecio = txtPrecio;
    }

    public JTextField getTxtSubtotal() {
        return txtSubtotal;
    }

    public void setTxtSubtotal(JTextField txtSubtotal) {
        this.txtSubtotal = txtSubtotal;
    }

    public JTextField getTxtTotal() {
        return txtTotal;
    }

    public void setTxtTotal(JTextField txtTotal) {
        this.txtTotal = txtTotal;
    }

    public JTextField getTxtTratamientoFac() {
        return txtTratamientoFac;
    }

    public void setTxtTratamientoFac(JTextField txtTratamientoFac) {
        this.txtTratamientoFac = txtTratamientoFac;
    }

   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dlTratamiento = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDialTratamiento = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        txtDlgTratamiento = new javax.swing.JTextField();
        btnRefrecar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        panelNice1 = new org.edisoncor.gui.panel.PanelNice();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNumSerie = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lblid = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtTratamientoFac = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        spiDesc = new javax.swing.JSpinner();
        btnBuscarTrat = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        btnCargarDatos = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        spiCantidad = new javax.swing.JSpinner();
        lblCelular = new javax.swing.JLabel();
        panelNice2 = new org.edisoncor.gui.panel.PanelNice();
        btneliminar = new javax.swing.JButton();
        btneditar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFactura = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        txtSubtotal = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtDescuento = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnCalculadora = new javax.swing.JButton();

        jPanel2.setBackground(new java.awt.Color(90, 166, 166));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblDialTratamiento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Material", "Descripcion", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblDialTratamiento);
        if (tblDialTratamiento.getColumnModel().getColumnCount() > 0) {
            tblDialTratamiento.getColumnModel().getColumn(0).setResizable(false);
            tblDialTratamiento.getColumnModel().getColumn(1).setResizable(false);
            tblDialTratamiento.getColumnModel().getColumn(2).setResizable(false);
            tblDialTratamiento.getColumnModel().getColumn(3).setResizable(false);
            tblDialTratamiento.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 85, 510, 300));

        jLabel17.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Buscar:");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, -1, 20));
        jPanel2.add(txtDlgTratamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 280, -1));

        btnRefrecar.setText("Refrescar");
        jPanel2.add(btnRefrecar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        javax.swing.GroupLayout dlTratamientoLayout = new javax.swing.GroupLayout(dlTratamiento.getContentPane());
        dlTratamiento.getContentPane().setLayout(dlTratamientoLayout);
        dlTratamientoLayout.setHorizontalGroup(
            dlTratamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        dlTratamientoLayout.setVerticalGroup(
            dlTratamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelNice1.setBackground(new java.awt.Color(166, 104, 216));
        panelNice1.setAlignmentX(1.0F);
        panelNice1.setAlignmentY(1.0F);
        panelNice1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icons/iconlogo.png"))); // NOI18N
        panelNice1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 92, 142));

        jLabel3.setBackground(new java.awt.Color(108, 51, 130));
        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("FACTURA");
        panelNice1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, -1, 20));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("DIRECCION:");
        panelNice1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, -1, 20));

        jLabel13.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("FECHA:");
        panelNice1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 140, -1, 20));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("SERIE:");
        panelNice1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 20, -1, -1));

        txtNumSerie.setEnabled(false);
        panelNice1.add(txtNumSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 20, 112, -1));

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ODONTOLOGIA ESPECIALIZADA");
        panelNice1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 32));

        lblid.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        lblid.setForeground(new java.awt.Color(255, 255, 255));
        lblid.setText("....");
        panelNice1.add(lblid, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 120, 20));

        jLabel15.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("NOMBRES Y APELLIDOS:");
        panelNice1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, -1, 20));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("TRATAMIENTO:");
        panelNice1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, -1, -1));
        panelNice1.add(txtTratamientoFac, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, 230, -1));

        btnAgregar.setText("Agregar");
        panelNice1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 140, 97, -1));

        lblNombre.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("....");
        panelNice1.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 60, 20));

        lblApellido.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        lblApellido.setForeground(new java.awt.Color(255, 255, 255));
        lblApellido.setText("....");
        panelNice1.add(lblApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 60, 20));

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("CANTIDAD:");
        panelNice1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, -1, -1));

        spiDesc.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 5));
        panelNice1.add(spiDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 90, 100, -1));

        btnBuscarTrat.setText("BUSCAR");
        panelNice1.add(btnBuscarTrat, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 50, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("DESCUENTO:");
        panelNice1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 60, 80, 20));

        jLabel14.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("PRECIO:");
        panelNice1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 50, 20));

        txtPrecio.setEditable(false);
        panelNice1.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 230, -1));

        txtFecha.setEditable(false);
        panelNice1.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 140, 140, -1));

        btnCargarDatos.setText("CARGAR DATOS");
        panelNice1.add(btnCargarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 140, -1));

        jLabel16.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("CEDULA PACIENTE");
        panelNice1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, -1, 20));

        lblDireccion.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        lblDireccion.setForeground(new java.awt.Color(255, 255, 255));
        lblDireccion.setText("....");
        panelNice1.add(lblDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 120, 20));

        spiCantidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, 208, 1));
        panelNice1.add(spiCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, 230, -1));

        lblCelular.setForeground(new java.awt.Color(166, 104, 216));
        panelNice1.add(lblCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 70, 10));

        jPanel1.add(panelNice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 980, 180));

        panelNice2.setBackground(new java.awt.Color(90, 166, 166));
        panelNice2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btneliminar.setText("Eliminar");
        panelNice2.add(btneliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 570, 220, 40));

        btneditar.setText("Editar");
        panelNice2.add(btneditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 570, 220, 40));

        tblFactura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CANT", "DESCRIPCION", "V. UNIT", "V. TOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblFactura);
        if (tblFactura.getColumnModel().getColumnCount() > 0) {
            tblFactura.getColumnModel().getColumn(0).setResizable(false);
            tblFactura.getColumnModel().getColumn(0).setPreferredWidth(5);
            tblFactura.getColumnModel().getColumn(1).setResizable(false);
            tblFactura.getColumnModel().getColumn(1).setPreferredWidth(450);
            tblFactura.getColumnModel().getColumn(2).setResizable(false);
            tblFactura.getColumnModel().getColumn(2).setPreferredWidth(5);
            tblFactura.getColumnModel().getColumn(3).setResizable(false);
            tblFactura.getColumnModel().getColumn(3).setPreferredWidth(5);
        }

        panelNice2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 960, 250));

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("SUBTOTAL $:");
        panelNice2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 340, -1, -1));
        panelNice2.add(txtSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 330, 100, -1));

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("DESCUENTO $:");
        panelNice2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 380, -1, -1));
        panelNice2.add(txtDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 370, 100, -1));

        jLabel12.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("TOTAL $:");
        panelNice2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 420, -1, -1));
        panelNice2.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 410, 100, -1));

        btnAceptar.setText("Aceptar");
        panelNice2.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 410, -1, -1));

        btnCancelar.setText("Cancelar");
        panelNice2.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 410, -1, -1));

        btnEliminar.setBackground(new java.awt.Color(90, 170, 170));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icons/boton-eliminar.png"))); // NOI18N
        btnEliminar.setBorder(null);
        panelNice2.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 56, -1));

        btnCalculadora.setBackground(new java.awt.Color(90, 170, 170));
        btnCalculadora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icons/calculadora.png"))); // NOI18N
        btnCalculadora.setBorder(null);
        panelNice2.add(btnCalculadora, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 56, 60));

        jPanel1.add(panelNice2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 980, 470));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscarTrat;
    private javax.swing.JButton btnCalculadora;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCargarDatos;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRefrecar;
    private javax.swing.JButton btneditar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JDialog dlTratamiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblid;
    private org.edisoncor.gui.panel.PanelNice panelNice1;
    private org.edisoncor.gui.panel.PanelNice panelNice2;
    private javax.swing.JSpinner spiCantidad;
    private javax.swing.JSpinner spiDesc;
    private javax.swing.JTable tblDialTratamiento;
    private javax.swing.JTable tblFactura;
    private javax.swing.JTextField txtDescuento;
    private javax.swing.JTextField txtDlgTratamiento;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtNumSerie;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtSubtotal;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtTratamientoFac;
    // End of variables declaration//GEN-END:variables
}
