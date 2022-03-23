/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JButton;
import javax.swing.JComboBox;
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

    public JComboBox<String> getCbDescuento() {
        return cbDescuento;
    }

    public void setCbDescuento(JComboBox<String> cbDescuento) {
        this.cbDescuento = cbDescuento;
    }
    
    

    public JTextField getTxtPrecio() {
        return txtPrecio;
    }

    public void setTxtPrecio(JTextField txtPrecio) {
        this.txtPrecio = txtPrecio;
    }

    public JTextField getTxtFecha() {
        return txtFecha;
    }

    public void setTxtFecha(JTextField txtFecha) {
        this.txtFecha = txtFecha;
    }

    public JButton getBtnAgregar() {
        return btnAgregar;
    }

    public void setBtnAgregar(JButton btnAgregar) {
        this.btnAgregar = btnAgregar;
    }

    public JButton getBtnNombres() {
        return btnNombres;
    }

    public void setBtnNombres(JButton btnNombres) {
        this.btnNombres = btnNombres;
    }

    public JButton getBtnTratamiento() {
        return btnTratamiento;
    }

    public void setBtnTratamiento(JButton btnTratamiento) {
        this.btnTratamiento = btnTratamiento;
    }

    public JSpinner getSpiCantidad() {
        return spiCantidad;
    }

    public void setSpiCantidad(JSpinner spiCantidad) {
        this.spiCantidad = spiCantidad;
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

    public JTextField getTxtIva() {
        return txtIva;
    }

    public void setTxtIva(JTextField txtIva) {
        this.txtIva = txtIva;
    }

    public JTextField getTxtNombreFac() {
        return txtNombreFac;
    }

    public void setTxtNombreFac(JTextField txtNombreFac) {
        this.txtNombreFac = txtNombreFac;
    }

    public JTextField getTxtNumSerie() {
        return txtNumSerie;
    }

    public void setTxtNumSerie(JTextField txtNumSerie) {
        this.txtNumSerie = txtNumSerie;
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

    public JButton getBtnAceptar() {
        return btnAceptar;
    }

    public void setBtnAceptar(JButton btnAceptar) {
        this.btnAceptar = btnAceptar;
    }

    public JButton getBtnCalculadora() {
        return btnCalculadora;
    }

    public void setBtnCalculadora(JButton btnCalculadora) {
        this.btnCalculadora = btnCalculadora;
    }

    public JButton getBtnCancelar() {
        return btnCancelar;
    }

    public void setBtnCancelar(JButton btnCancelar) {
        this.btnCancelar = btnCancelar;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNumSerie = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNombreFac = new javax.swing.JTextField();
        btnNombres = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtTratamientoFac = new javax.swing.JTextField();
        btnTratamiento = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        spiCantidad = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        cbDescuento = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFactura = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtSubtotal = new javax.swing.JTextField();
        txtDescuento = new javax.swing.JTextField();
        txtIva = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        btnCalculadora = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(166, 166, 216));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icons/iconlogo.png"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 11, 92, 142));

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(108, 51, 130));
        jLabel2.setText("ODONTOLOGIA ESPECIALIZADA");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 159, -1, 32));

        jLabel3.setBackground(new java.awt.Color(108, 51, 130));
        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(108, 51, 130));
        jLabel3.setText("FACTURA");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 12, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(108, 51, 130));
        jLabel4.setText("SERIE:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(451, 39, -1, -1));

        txtNumSerie.setEnabled(false);
        jPanel3.add(txtNumSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 37, 112, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(108, 51, 130));
        jLabel5.setText("DESCUENTO:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 90, 80, 20));
        jPanel3.add(txtNombreFac, new org.netbeans.lib.awtextra.AbsoluteConstraints(462, 91, 162, -1));

        btnNombres.setText("...");
        jPanel3.add(btnNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(642, 90, -1, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(108, 51, 130));
        jLabel7.setText("TRATAMIENTO:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, -1, -1));
        jPanel3.add(txtTratamientoFac, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, 163, -1));

        btnTratamiento.setText("...");
        jPanel3.add(btnTratamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 120, -1, -1));

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(108, 51, 130));
        jLabel8.setText("CANTIDAD:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, -1, -1));

        jLabel13.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(108, 51, 130));
        jLabel13.setText("FECHA:");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 10, -1, 20));

        txtFecha.setEditable(false);
        jPanel3.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 10, 130, -1));

        btnAgregar.setText("Agregar");
        jPanel3.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 150, 97, -1));

        spiCantidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, 208, 1));
        jPanel3.add(spiCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 90, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(108, 51, 130));
        jLabel6.setText("NOMBRES:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 93, -1, -1));

        txtPrecio.setEditable(false);
        jPanel3.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 120, 110, -1));

        jLabel14.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(108, 51, 130));
        jLabel14.setText("PRECIO:");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(736, 120, 50, 20));

        cbDescuento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECIONAR--", "10%", "20%", "30%" }));
        jPanel3.add(cbDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 90, 110, -1));

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

        jPanel4.setBackground(new java.awt.Color(90, 170, 170));

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("SUBTOTAL $:");

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("DESCUENTO $:");

        jLabel11.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("I.V.A. $:");

        jLabel12.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("TOTAL $:");

        btnCalculadora.setBackground(new java.awt.Color(90, 170, 170));
        btnCalculadora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icons/calculadora.png"))); // NOI18N
        btnCalculadora.setBorder(null);

        btnAceptar.setText("Aceptar");

        btnCancelar.setText("Cancelar");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btnCalculadora, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar)
                .addGap(18, 18, 18)
                .addComponent(btnAceptar)
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSubtotal, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(txtDescuento)
                    .addComponent(txtIva)
                    .addComponent(txtTotal))
                .addGap(58, 58, 58))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtIva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAceptar)
                            .addComponent(btnCancelar)))
                    .addComponent(btnCalculadora, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 966, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCalculadora;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnNombres;
    private javax.swing.JButton btnTratamiento;
    private javax.swing.JComboBox<String> cbDescuento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner spiCantidad;
    private javax.swing.JTable tblFactura;
    private javax.swing.JTextField txtDescuento;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtIva;
    private javax.swing.JTextField txtNombreFac;
    private javax.swing.JTextField txtNumSerie;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtSubtotal;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtTratamientoFac;
    // End of variables declaration//GEN-END:variables
}
