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
        jLabel8 = new javax.swing.JLabel();
        panelRoundTranslucido1 = new org.edisoncor.gui.panel.PanelRoundTranslucido();
        jLabel9 = new javax.swing.JLabel();
        btnAnteriorEsp = new org.edisoncor.gui.button.ButtonRound();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        panelNice2 = new org.edisoncor.gui.panel.PanelNice();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblListaTrat = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldRound1 = new jtextfieldround.JTextFieldRound();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelNice1.setBackground(new java.awt.Color(166, 104, 216));
        panelNice1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("FOTO:");
        panelNice1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NOMBRE DEL TRATAMIENTO:");
        panelNice1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PRECIO:");
        panelNice1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("TIPO DE MATERIAL:");
        panelNice1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jLabel5.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("GARANTIA:");
        panelNice1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jLabel6.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("DURABILIDAD PROMEDIA:");
        panelNice1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));
        panelNice1.add(txtNomTratamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 310, -1));
        panelNice1.add(txtPrecioTrat, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 310, -1));
        panelNice1.add(txtTipMatTrat, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 310, -1));
        panelNice1.add(txtGarantiaTrat, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 310, -1));
        panelNice1.add(txtDurabilidadTrat, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 310, -1));

        txtADescripTrat.setColumns(20);
        txtADescripTrat.setRows(5);
        jScrollPane1.setViewportView(txtADescripTrat);

        panelNice1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, 330, 170));

        jLabel8.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("DESCRIPCION:");
        panelNice1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 50, -1, 20));

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

        panelNice1.add(panelRoundTranslucido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 100, 240, 160));

        btnAnteriorEsp.setBackground(new java.awt.Color(166, 104, 216));
        btnAnteriorEsp.setText("cerrar");
        panelNice1.add(btnAnteriorEsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jButton1.setText("EXAMINAR");
        panelNice1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 290, 160, 40));

        jButton2.setText("GUARDAR");
        panelNice1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 160, 40));

        jButton3.setText("EDITAR");
        panelNice1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 160, 40));

        jLabel10.setFont(new java.awt.Font("SF Pro Display", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("REGISTRO DE TRATAMIENTOS");
        panelNice1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, -1, -1));

        jButton4.setText("ELIMINAR");
        panelNice1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 290, 160, 40));

        jPanel1.add(panelNice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 1140, 350));

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

        panelNice2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 57, 1070, 240));

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Buscar");
        panelNice2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));
        panelNice2.add(jTextFieldRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 980, -1));

        jPanel1.add(panelNice2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 1140, 310));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonRound btnAnteriorEsp;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
