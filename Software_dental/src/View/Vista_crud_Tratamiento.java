/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JTable;
import javax.swing.JTextArea;
import jtextfieldround.JTextFieldRound;
import org.edisoncor.gui.button.ButtonRound;

/**
 *
 * @author Usuario
 */
public class Vista_crud_Tratamiento extends javax.swing.JInternalFrame {

    /**
     * Creates new form Vista_crud_Tratamiento
     */
    public Vista_crud_Tratamiento() {
        initComponents();
    }

    public ButtonRound getBtnGuardarTrat() {
        return btnGuardarTrat;
    }

    public void setBtnGuardarTrat(ButtonRound btnGuardarTrat) {
        this.btnGuardarTrat = btnGuardarTrat;
    }

    public JTable getTblListaTrat() {
        return tblListaTrat;
    }

    public void setTblListaTrat(JTable tblListaTrat) {
        this.tblListaTrat = tblListaTrat;
    }

    public JTextArea getTxtADescripTrat() {
        return txtADescripTrat;
    }

    public void setTxtADescripTrat(JTextArea txtADescripTrat) {
        this.txtADescripTrat = txtADescripTrat;
    }

    public JTextFieldRound getTxtDurabilidadTrat() {
        return txtDurabilidadTrat;
    }

    public void setTxtDurabilidadTrat(JTextFieldRound txtDurabilidadTrat) {
        this.txtDurabilidadTrat = txtDurabilidadTrat;
    }

    public JTextFieldRound getTxtGarantiaTrat() {
        return txtGarantiaTrat;
    }

    public void setTxtGarantiaTrat(JTextFieldRound txtGarantiaTrat) {
        this.txtGarantiaTrat = txtGarantiaTrat;
    }

    public JTextFieldRound getTxtNomTratamiento() {
        return txtNomTratamiento;
    }

    public void setTxtNomTratamiento(JTextFieldRound txtNomTratamiento) {
        this.txtNomTratamiento = txtNomTratamiento;
    }

    public JTextFieldRound getTxtPrecioTrat() {
        return txtPrecioTrat;
    }

    public void setTxtPrecioTrat(JTextFieldRound txtPrecioTrat) {
        this.txtPrecioTrat = txtPrecioTrat;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelNice1 = new org.edisoncor.gui.panel.PanelNice();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNomTratamiento = new jtextfieldround.JTextFieldRound();
        txtPrecioTrat = new jtextfieldround.JTextFieldRound();
        txtTipMatTrat = new jtextfieldround.JTextFieldRound();
        txtGarantiaTrat = new jtextfieldround.JTextFieldRound();
        txtDurabilidadTrat = new jtextfieldround.JTextFieldRound();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtADescripTrat = new javax.swing.JTextArea();
        btnGuardarTrat = new org.edisoncor.gui.button.ButtonRound();
        jLabel8 = new javax.swing.JLabel();
        panelRoundTranslucido1 = new org.edisoncor.gui.panel.PanelRoundTranslucido();
        jLabel9 = new javax.swing.JLabel();
        btnGuardarTrat1 = new org.edisoncor.gui.button.ButtonRound();
        btnGuardarTrat2 = new org.edisoncor.gui.button.ButtonRound();
        btnGuardarTrat3 = new org.edisoncor.gui.button.ButtonRound();
        panelNice2 = new org.edisoncor.gui.panel.PanelNice();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblListaTrat = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldRound1 = new jtextfieldround.JTextFieldRound();
        btnAnteriorEsp = new org.edisoncor.gui.button.ButtonRound();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelNice1.setBackground(new java.awt.Color(166, 104, 216));
        panelNice1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Foto");
        panelNice1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NOMBRE DEL TRATAMIENTO:");
        panelNice1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PRECIO:");
        panelNice1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel4.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("TIPO DE MATERIAL:");
        panelNice1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel5.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("GARANTIA:");
        panelNice1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jLabel6.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("DURABILIDAD PROMEDIA:");
        panelNice1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));
        panelNice1.add(txtNomTratamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 330, -1));
        panelNice1.add(txtPrecioTrat, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 330, -1));
        panelNice1.add(txtTipMatTrat, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 330, -1));
        panelNice1.add(txtGarantiaTrat, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 330, -1));
        panelNice1.add(txtDurabilidadTrat, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 330, -1));

        txtADescripTrat.setColumns(20);
        txtADescripTrat.setRows(5);
        jScrollPane1.setViewportView(txtADescripTrat);

        panelNice1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, 330, 170));

        btnGuardarTrat.setText("EXAMINAR");
        panelNice1.add(btnGuardarTrat, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 220, 220, -1));

        jLabel8.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("DESCRIPCION:");
        panelNice1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 20, -1, -1));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("jLabel9");

        javax.swing.GroupLayout panelRoundTranslucido1Layout = new javax.swing.GroupLayout(panelRoundTranslucido1);
        panelRoundTranslucido1.setLayout(panelRoundTranslucido1Layout);
        panelRoundTranslucido1Layout.setHorizontalGroup(
            panelRoundTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRoundTranslucido1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        panelRoundTranslucido1Layout.setVerticalGroup(
            panelRoundTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRoundTranslucido1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        panelNice1.add(panelRoundTranslucido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 50, 240, 160));

        btnGuardarTrat1.setText("ELIMINAR");
        panelNice1.add(btnGuardarTrat1, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 260, 220, -1));

        btnGuardarTrat2.setText("GUARDAR");
        panelNice1.add(btnGuardarTrat2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 240, -1));

        btnGuardarTrat3.setText("EDITAR");
        panelNice1.add(btnGuardarTrat3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 250, 280, 30));

        jPanel1.add(panelNice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 1240, 310));

        panelNice2.setBackground(new java.awt.Color(90, 166, 166));
        panelNice2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblListaTrat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblListaTrat);

        panelNice2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 57, 1140, 270));

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Buscar");
        panelNice2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));
        panelNice2.add(jTextFieldRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 1060, -1));

        jPanel1.add(panelNice2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 1240, 360));

        btnAnteriorEsp.setBackground(new java.awt.Color(166, 104, 216));
        btnAnteriorEsp.setText("cerrar");
        jPanel1.add(btnAnteriorEsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 732, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonRound btnAnteriorEsp;
    private org.edisoncor.gui.button.ButtonRound btnGuardarTrat;
    private org.edisoncor.gui.button.ButtonRound btnGuardarTrat1;
    private org.edisoncor.gui.button.ButtonRound btnGuardarTrat2;
    private org.edisoncor.gui.button.ButtonRound btnGuardarTrat3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private jtextfieldround.JTextFieldRound jTextFieldRound1;
    private org.edisoncor.gui.panel.PanelNice panelNice1;
    private org.edisoncor.gui.panel.PanelNice panelNice2;
    private org.edisoncor.gui.panel.PanelRoundTranslucido panelRoundTranslucido1;
    private javax.swing.JTable tblListaTrat;
    private javax.swing.JTextArea txtADescripTrat;
    private jtextfieldround.JTextFieldRound txtDurabilidadTrat;
    private jtextfieldround.JTextFieldRound txtGarantiaTrat;
    private jtextfieldround.JTextFieldRound txtNomTratamiento;
    private jtextfieldround.JTextFieldRound txtPrecioTrat;
    private jtextfieldround.JTextFieldRound txtTipMatTrat;
    // End of variables declaration//GEN-END:variables
}
