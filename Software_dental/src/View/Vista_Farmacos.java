/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import jtextfieldround.JTextFieldRound;

/**
 *
 * @author Usuario
 */
public class Vista_Farmacos extends javax.swing.JInternalFrame {

    /**
     * Creates new form Vista_Farmacos
     */
    public Vista_Farmacos() {
        initComponents();
    }

    public JButton getBtnRefrescarFarma() {
        return btnRefrescarFarma;
    }

    public void setBtnRefrescarFarma(JButton btnRefrescarFarma) {
        this.btnRefrescarFarma = btnRefrescarFarma;
    }
    
    public JComboBox<String> getCbxMaterial() {
        return CbxMaterial;
    }

    public void setCbxMaterial(JComboBox<String> CbxMaterial) {
        this.CbxMaterial = CbxMaterial;
    }

    public JButton getBtnBuscarFarma() {
        return btnRefrescarFarma;
    }

    public void setBtnBuscarFarma(JButton btnBuscarFarma) {
        this.btnRefrescarFarma = btnBuscarFarma;
    }

    public JButton getBtnElimFarma() {
        return btnElimFarma;
    }

    public void setBtnElimFarma(JButton btnElimFarma) {
        this.btnElimFarma = btnElimFarma;
    }

    public JButton getBtnGuardarFarma() {
        return btnGuardarFarma;
    }

    public void setBtnGuardarFarma(JButton btnGuardarFarma) {
        this.btnGuardarFarma = btnGuardarFarma;
    }

    public JButton getBtnModifFarma() {
        return btnModifFarma;
    }

    public void setBtnModifFarma(JButton btnModifFarma) {
        this.btnModifFarma = btnModifFarma;
    }

    public JTable getTblListaFarma() {
        return tblListaFarma;
    }

    public void setTblListaFarma(JTable tblListaFarma) {
        this.tblListaFarma = tblListaFarma;
    }

    public JTextField getTxtBuscarFarma() {
        return txtBuscarFarma;
    }

    public void setTxtBuscarFarma(JTextField txtBuscarFarma) {
        this.txtBuscarFarma = txtBuscarFarma;
    }

    public JTextFieldRound getTxtMgFar() {
        return txtMgFar;
    }

    public void setTxtMgFar(JTextFieldRound txtMgFar) {
        this.txtMgFar = txtMgFar;
    }

    public JTextFieldRound getTxtNombreFar() {
        return txtNombreFar;
    }

    public void setTxtNombreFar(JTextFieldRound txtNombreFar) {
        this.txtNombreFar = txtNombreFar;
    }

    public JTextArea getTxtADescripcionFarma() {
        return txtADescripcionFarma;
    }

    public void setTxtADescripcionFarma(JTextArea txtADescripcionFarma) {
        this.txtADescripcionFarma = txtADescripcionFarma;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldRoundBeanInfo1 = new jtextfieldround.JTextFieldRoundBeanInfo();
        jTextFieldRoundBeanInfo2 = new jtextfieldround.JTextFieldRoundBeanInfo();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelNice1 = new org.edisoncor.gui.panel.PanelNice();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMgFar = new jtextfieldround.JTextFieldRound();
        btnGuardarFarma = new javax.swing.JButton();
        btnElimFarma = new javax.swing.JButton();
        btnModifFarma = new javax.swing.JButton();
        CbxMaterial = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtADescripcionFarma = new javax.swing.JTextArea();
        txtNombreFar = new jtextfieldround.JTextFieldRound();
        panelNice2 = new org.edisoncor.gui.panel.PanelNice();
        txtBuscarFarma = new javax.swing.JTextField();
        btnRefrescarFarma = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListaFarma = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("REGISTRO FARMACOS");

        panelNice1.setBackground(new java.awt.Color(166, 104, 216));
        panelNice1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NOMBRE:");
        panelNice1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("MILIGRAMOS:");
        panelNice1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("INSERTAR");
        panelNice1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("DESCRIPCION:");
        panelNice1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, 20));
        panelNice1.add(txtMgFar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 260, 21));

        btnGuardarFarma.setText("GUARDAR");
        panelNice1.add(btnGuardarFarma, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 90, -1));

        btnElimFarma.setText("ELIMINAR");
        panelNice1.add(btnElimFarma, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, -1, -1));

        btnModifFarma.setText("MODIFICAR");
        panelNice1.add(btnModifFarma, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, -1, -1));

        CbxMaterial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tabletas", "Jarabe / Bebible ", "Ampolla", "Capsula" }));
        panelNice1.add(CbxMaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 260, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("MATERIAL:");
        panelNice1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, 20));

        txtADescripcionFarma.setColumns(20);
        txtADescripcionFarma.setRows(5);
        jScrollPane2.setViewportView(txtADescripcionFarma);

        panelNice1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 260, -1));
        panelNice1.add(txtNombreFar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 260, 21));

        panelNice2.setBackground(new java.awt.Color(90, 166, 166));
        panelNice2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelNice2.add(txtBuscarFarma, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 310, -1));

        btnRefrescarFarma.setText("Refrescar");
        panelNice2.add(btnRefrescarFarma, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, -1, -1));

        tblListaFarma.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Material", "MG", "Descripcion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblListaFarma);
        if (tblListaFarma.getColumnModel().getColumnCount() > 0) {
            tblListaFarma.getColumnModel().getColumn(0).setResizable(false);
            tblListaFarma.getColumnModel().getColumn(1).setResizable(false);
            tblListaFarma.getColumnModel().getColumn(2).setResizable(false);
            tblListaFarma.getColumnModel().getColumn(3).setResizable(false);
            tblListaFarma.getColumnModel().getColumn(4).setResizable(false);
        }

        panelNice2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 650, 470));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Buscar:");
        panelNice2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 60, 20));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icons/LOGO DENTAL daniela san martin -1_opt (2).png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelNice1, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(panelNice2, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(panelNice2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(panelNice1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CbxMaterial;
    private javax.swing.JButton btnElimFarma;
    private javax.swing.JButton btnGuardarFarma;
    private javax.swing.JButton btnModifFarma;
    private javax.swing.JButton btnRefrescarFarma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private jtextfieldround.JTextFieldRoundBeanInfo jTextFieldRoundBeanInfo1;
    private jtextfieldround.JTextFieldRoundBeanInfo jTextFieldRoundBeanInfo2;
    private org.edisoncor.gui.panel.PanelNice panelNice1;
    private org.edisoncor.gui.panel.PanelNice panelNice2;
    private javax.swing.JTable tblListaFarma;
    private javax.swing.JTextArea txtADescripcionFarma;
    private javax.swing.JTextField txtBuscarFarma;
    private jtextfieldround.JTextFieldRound txtMgFar;
    private jtextfieldround.JTextFieldRound txtNombreFar;
    // End of variables declaration//GEN-END:variables
}
