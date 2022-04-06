
package View;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import jtextfieldround.JTextFieldRound;

/**
 *
 * @author slix0
 */
public class VISTA_PROFORMA extends javax.swing.JInternalFrame {

    /**
     * Creates new form VISTA_PROFORMA
     */
    public VISTA_PROFORMA() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtBuscarDl = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblDialog = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        panelNice3 = new org.edisoncor.gui.panel.PanelNice();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        panelNice1 = new org.edisoncor.gui.panel.PanelNice();
        jLabel17 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnValidProforma = new javax.swing.JButton();
        txtValorTotal = new jtextfieldround.JTextFieldRound();
        txtSubtotal = new jtextfieldround.JTextFieldRound();
        txtDescuento = new jtextfieldround.JTextFieldRound();
        txtIva = new jtextfieldround.JTextFieldRound();
        txtValorCouotaM = new jtextfieldround.JTextFieldRound();
        txtSaldo = new jtextfieldround.JTextFieldRound();
        txtCuotaInicial = new jtextfieldround.JTextFieldRound();
        txtTratamientos = new javax.swing.JTextField();
        btnBuscarTrat = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        txtPaciente = new javax.swing.JTextField();
        btnBuscarPac = new javax.swing.JButton();
        txtFecha = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        spiCantidad = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        txtNumSerie = new javax.swing.JTextField();
        spiDesc = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProforma = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtObservaciones = new javax.swing.JTextArea();
        btnAgregar = new javax.swing.JButton();
        cbFormaPago = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        spiMesesCred = new javax.swing.JSpinner();

        jPanel2.setBackground(new java.awt.Color(90, 166, 166));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("BUSCAR:");

        tblDialog.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblDialog);
        if (tblDialog.getColumnModel().getColumnCount() > 0) {
            tblDialog.getColumnModel().getColumn(0).setResizable(false);
            tblDialog.getColumnModel().getColumn(1).setResizable(false);
            tblDialog.getColumnModel().getColumn(2).setResizable(false);
            tblDialog.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txtBuscarDl, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtBuscarDl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(255, 255, 255));
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelNice3.setBackground(new java.awt.Color(90, 166, 166));
        panelNice3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("SF Pro Display", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("PLAN DE TRATAMIENTO Y PRESUPUESTO");
        panelNice3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, -1, -1));

        jLabel7.setFont(new java.awt.Font("SF Pro Display", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("TRATAMIENTOS");
        panelNice3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        panelNice1.setBackground(new java.awt.Color(166, 104, 216));
        panelNice1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("SF Pro Display", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Valor de cuota mensual:");
        panelNice1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, -1, 20));

        jLabel9.setFont(new java.awt.Font("SF Pro Display", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Saldo:");
        panelNice1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 160, 20));

        jLabel16.setFont(new java.awt.Font("SF Pro Display", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Cuota inicial:");
        panelNice1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, -1, 20));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        panelNice1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 10, 160));

        jLabel14.setFont(new java.awt.Font("SF Pro Display", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Valor total final:");
        panelNice1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, 20));

        jLabel13.setFont(new java.awt.Font("SF Pro Display", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("IVA:");
        panelNice1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, 20));

        jLabel12.setFont(new java.awt.Font("SF Pro Display", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Descuento:");
        panelNice1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 30));

        jLabel8.setFont(new java.awt.Font("SF Pro Display", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Subtotal:");
        panelNice1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 80, 30));

        btnValidProforma.setText("Validar Proforma");
        panelNice1.add(btnValidProforma, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 140, 260, 40));
        panelNice1.add(txtValorTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 80, 20));
        panelNice1.add(txtSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 80, 20));
        panelNice1.add(txtDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 80, 20));
        panelNice1.add(txtIva, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 80, 20));
        panelNice1.add(txtValorCouotaM, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, 90, 20));
        panelNice1.add(txtSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, 90, 20));
        panelNice1.add(txtCuotaInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 90, 20));

        panelNice3.add(panelNice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 1100, 200));
        panelNice3.add(txtTratamientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 120, -1));

        btnBuscarTrat.setText("Buscar");
        panelNice3.add(btnBuscarTrat, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, -1, -1));

        jLabel18.setFont(new java.awt.Font("SF Pro Display", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("FORMA DE PAGO");
        panelNice3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 60, -1, -1));
        panelNice3.add(txtPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 120, -1));

        btnBuscarPac.setText("Buscar");
        panelNice3.add(btnBuscarPac, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, -1));

        txtFecha.setEnabled(false);
        panelNice3.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 10, 120, -1));

        jLabel19.setFont(new java.awt.Font("SF Pro Display", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("PACIENTE");
        panelNice3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel20.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("CANTIDAD:");
        panelNice3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, -1, 10));

        jLabel21.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("PRECIO:");
        panelNice3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 60, 20));

        txtPrecio.setEditable(false);
        panelNice3.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, 230, 20));

        spiCantidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, 208, 1));
        panelNice3.add(spiCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, 230, 20));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("SERIE:");
        panelNice3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 10, -1, 20));

        txtNumSerie.setEnabled(false);
        panelNice3.add(txtNumSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 10, 112, -1));

        spiDesc.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 5));
        panelNice3.add(spiDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 80, 100, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("DESCUENTO:");
        panelNice3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 50, 80, 20));

        tblProforma.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Pieza", "Especificacion", "V. Unitario", "V. Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblProforma);

        panelNice3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 1100, 180));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Observaciones:");
        panelNice3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        txtObservaciones.setColumns(20);
        txtObservaciones.setRows(5);
        jScrollPane2.setViewportView(txtObservaciones);

        panelNice3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 920, 70));

        btnAgregar.setText("Agregar");
        panelNice3.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 80, -1));

        cbFormaPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECCIONE--", "T. Credito", "T. Debito", "Transferencia ", "Deposito", "Efectivo" }));
        panelNice3.add(cbFormaPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 80, 110, -1));

        jLabel15.setFont(new java.awt.Font("SF Pro Display", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Meses de credito:");
        panelNice3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 310, 140, 20));

        spiMesesCred.setModel(new javax.swing.SpinnerNumberModel(3, 0, 36, 3));
        panelNice3.add(spiMesesCred, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 340, 130, -1));

        jPanel1.add(panelNice3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1150, 650));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1194, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JButton getBtnAgregar() {
        return btnAgregar;
    }

    public void setBtnAgregar(JButton btnAgregar) {
        this.btnAgregar = btnAgregar;
    }

    public JTable getTblDialog() {
        return tblDialog;
    }

    public JDialog getjDialog1() {
        return jDialog1;
    }

    public void setjDialog1(JDialog jDialog1) {
        this.jDialog1 = jDialog1;
    }
    
    

    public void setTblDialog(JTable tblDialog) {
        this.tblDialog = tblDialog;
    }

    public JTextField getTxtBuscarDl() {
        return txtBuscarDl;
    }

    public void setTxtBuscarDl(JTextField txtBuscarDl) {
        this.txtBuscarDl = txtBuscarDl;
    }

    public JButton getBtnBuscarPac() {
        return btnBuscarPac;
    }

    public void setBtnBuscarPac(JButton btnBuscarPac) {
        this.btnBuscarPac = btnBuscarPac;
    }

    public JButton getBtnBuscarTrat() {
        return btnBuscarTrat;
    }

    public void setBtnBuscarTrat(JButton btnBuscarTrat) {
        this.btnBuscarTrat = btnBuscarTrat;
    }
    
    public JButton getBtnValidProforma() {
        return btnValidProforma;
    }

    public void setBtnValidProforma(JButton btnValidProforma) {
        this.btnValidProforma = btnValidProforma;
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

    public JComboBox<String> getCbFormaPago() {
        return cbFormaPago;
    }

    public void setCbFormaPago(JComboBox<String> cbFormaPago) {
        this.cbFormaPago = cbFormaPago;
    }



    public JSpinner getSpiMesesCred() {
        return spiMesesCred;
    }

    public void setSpiMesesCred(JSpinner spiMesesCred) {
        this.spiMesesCred = spiMesesCred;
    }

    public JTable getTblProforma() {
        return tblProforma;
    }

    public void setTblProforma(JTable tblProforma) {
        this.tblProforma = tblProforma;
    }

    public JTextFieldRound getTxtCuotaInicial() {
        return txtCuotaInicial;
    }

    public void setTxtCuotaInicial(JTextFieldRound txtCuotaInicial) {
        this.txtCuotaInicial = txtCuotaInicial;
    }

    public JTextFieldRound getTxtDescuento() {
        return txtDescuento;
    }

    public void setTxtDescuento(JTextFieldRound txtDescuento) {
        this.txtDescuento = txtDescuento;
    }

    public JTextField getTxtFecha() {
        return txtFecha;
    }

    public void setTxtFecha(JTextField txtFecha) {
        this.txtFecha = txtFecha;
    }

    public JTextFieldRound getTxtIva() {
        return txtIva;
    }

    public void setTxtIva(JTextFieldRound txtIva) {
        this.txtIva = txtIva;
    }

    public JTextField getTxtNumSerie() {
        return txtNumSerie;
    }

    public void setTxtNumSerie(JTextField txtNumSerie) {
        this.txtNumSerie = txtNumSerie;
    }

    public JTextArea getTxtObservaciones() {
        return txtObservaciones;
    }

    public void setTxtObservaciones(JTextArea txtObservaciones) {
        this.txtObservaciones = txtObservaciones;
    }

    public JTextField getTxtPaciente() {
        return txtPaciente;
    }

    public void setTxtPaciente(JTextField txtPaciente) {
        this.txtPaciente = txtPaciente;
    }

    public JTextField getTxtPrecio() {
        return txtPrecio;
    }

    public void setTxtPrecio(JTextField txtPrecio) {
        this.txtPrecio = txtPrecio;
    }

    public JTextFieldRound getTxtSaldo() {
        return txtSaldo;
    }

    public void setTxtSaldo(JTextFieldRound txtSaldo) {
        this.txtSaldo = txtSaldo;
    }

    public JTextFieldRound getTxtSubtotal() {
        return txtSubtotal;
    }

    public void setTxtSubtotal(JTextFieldRound txtSubtotal) {
        this.txtSubtotal = txtSubtotal;
    }

    public JTextField getTxtTratamientos() {
        return txtTratamientos;
    }

    public void setTxtTratamientos(JTextField txtTratamientos) {
        this.txtTratamientos = txtTratamientos;
    }

    public JTextFieldRound getTxtValorCouotaM() {
        return txtValorCouotaM;
    }

    public void setTxtValorCouotaM(JTextFieldRound txtValorCouotaM) {
        this.txtValorCouotaM = txtValorCouotaM;
    }

    public JTextFieldRound getTxtValorTotal() {
        return txtValorTotal;
    }

    public void setTxtValorTotal(JTextFieldRound txtValorTotal) {
        this.txtValorTotal = txtValorTotal;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscarPac;
    private javax.swing.JButton btnBuscarTrat;
    private javax.swing.JButton btnValidProforma;
    private javax.swing.JComboBox<String> cbFormaPago;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
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
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private org.edisoncor.gui.panel.PanelNice panelNice1;
    private org.edisoncor.gui.panel.PanelNice panelNice3;
    private javax.swing.JSpinner spiCantidad;
    private javax.swing.JSpinner spiDesc;
    private javax.swing.JSpinner spiMesesCred;
    private javax.swing.JTable tblDialog;
    private javax.swing.JTable tblProforma;
    private javax.swing.JTextField txtBuscarDl;
    private jtextfieldround.JTextFieldRound txtCuotaInicial;
    private jtextfieldround.JTextFieldRound txtDescuento;
    private javax.swing.JTextField txtFecha;
    private jtextfieldround.JTextFieldRound txtIva;
    private javax.swing.JTextField txtNumSerie;
    private javax.swing.JTextArea txtObservaciones;
    private javax.swing.JTextField txtPaciente;
    private javax.swing.JTextField txtPrecio;
    private jtextfieldround.JTextFieldRound txtSaldo;
    private jtextfieldround.JTextFieldRound txtSubtotal;
    private javax.swing.JTextField txtTratamientos;
    private jtextfieldround.JTextFieldRound txtValorCouotaM;
    private jtextfieldround.JTextFieldRound txtValorTotal;
    // End of variables declaration//GEN-END:variables
}
