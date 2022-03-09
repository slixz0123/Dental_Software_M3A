/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import jtextfieldround.JTextFieldRound;
import org.edisoncor.gui.button.ButtonRound;
import org.edisoncor.gui.comboBox.ComboBoxRound;

/**
 *
 * @author Usuario
 */
public class Vista_HistorialClinico extends javax.swing.JInternalFrame {


    public Vista_HistorialClinico() {
        initComponents();
    }

   
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelNice1 = new org.edisoncor.gui.panel.PanelNice();
        jLabel1 = new javax.swing.JLabel();
        btnDiag = new javax.swing.JButton();
        btnIndicSaludBucal = new javax.swing.JButton();
        panelNice2 = new org.edisoncor.gui.panel.PanelNice();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaDiag = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtNombreTrat3 = new jtextfieldround.JTextFieldRound();
        txtNombreTrat4 = new jtextfieldround.JTextFieldRound();
        txtNombreTrat5 = new jtextfieldround.JTextFieldRound();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtNombreTrat6 = new jtextfieldround.JTextFieldRound();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAreaDiag1 = new javax.swing.JTextArea();
        txtNombreTrat7 = new jtextfieldround.JTextFieldRound();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtAreaDiag2 = new javax.swing.JTextArea();
        jLabel29 = new javax.swing.JLabel();
        txtNombreTrat8 = new jtextfieldround.JTextFieldRound();

        setPreferredSize(new java.awt.Dimension(1208, 735));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelNice1.setBackground(new java.awt.Color(166, 104, 216));
        panelNice1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Odontograma");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        panelNice1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1070, 320));

        btnDiag.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icons/impresora.png"))); // NOI18N
        btnDiag.setText("Guardar");
        panelNice1.add(btnDiag, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, 170, 50));

        btnIndicSaludBucal.setText("imprimir");
        panelNice1.add(btnIndicSaludBucal, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 360, 190, 50));

        jPanel1.add(panelNice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 1110, 440));

        panelNice2.setBackground(new java.awt.Color(166, 154, 216));
        panelNice2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtAreaDiag.setColumns(20);
        txtAreaDiag.setRows(5);
        jScrollPane1.setViewportView(txtAreaDiag);

        panelNice2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, 220, 70));

        jLabel2.setFont(new java.awt.Font("SF Pro Display", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("HISTORIAL CLINICO");
        panelNice2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, -1, -1));

        jLabel18.setFont(new java.awt.Font("SF Pro Display", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("MOTIVO DE CONSULTA");
        panelNice2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel20.setFont(new java.awt.Font("SF Pro Display", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("EDAD");
        panelNice2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, -1, -1));

        jLabel21.setFont(new java.awt.Font("SF Pro Display", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("FECHA NACIMIENTO");
        panelNice2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));
        panelNice2.add(txtNombreTrat3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, 220, 20));
        panelNice2.add(txtNombreTrat4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 220, 20));
        panelNice2.add(txtNombreTrat5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 220, 20));

        jLabel22.setFont(new java.awt.Font("SF Pro Display", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("DOMICILIO");
        panelNice2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, 30));

        jLabel23.setFont(new java.awt.Font("SF Pro Display", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("TELEFONO");
        panelNice2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, -1, -1));
        panelNice2.add(txtNombreTrat6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, 220, 20));

        jLabel24.setFont(new java.awt.Font("SF Pro Display", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("OBSERVACIONES");
        panelNice2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 30, -1, -1));

        jLabel25.setFont(new java.awt.Font("SF Pro Display", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("MEDICACION");
        panelNice2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, -1, -1));

        txtAreaDiag1.setColumns(20);
        txtAreaDiag1.setRows(5);
        jScrollPane3.setViewportView(txtAreaDiag1);

        panelNice2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 230, 130));
        panelNice2.add(txtNombreTrat7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, 220, 20));

        jLabel26.setFont(new java.awt.Font("SF Pro Display", 1, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText(" SISTEMATICAS");
        panelNice2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, -1, -1));

        jLabel27.setFont(new java.awt.Font("SF Pro Display", 1, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("PATOLOGIAS ");
        panelNice2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, -1, -1));

        jLabel28.setFont(new java.awt.Font("SF Pro Display", 1, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("ENFERMEDADES ");
        panelNice2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, -1, -1));

        txtAreaDiag2.setColumns(20);
        txtAreaDiag2.setRows(5);
        jScrollPane4.setViewportView(txtAreaDiag2);

        panelNice2.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 50, 290, 210));

        jLabel29.setFont(new java.awt.Font("SF Pro Display", 1, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("ALERGIAS");
        panelNice2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, -1, -1));
        panelNice2.add(txtNombreTrat8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 240, 220, 20));

        jPanel1.add(panelNice2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 1090, 280));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 744, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDiag;
    private javax.swing.JButton btnIndicSaludBucal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private org.edisoncor.gui.panel.PanelNice panelNice1;
    private org.edisoncor.gui.panel.PanelNice panelNice2;
    private javax.swing.JTextArea txtAreaDiag;
    private javax.swing.JTextArea txtAreaDiag1;
    private javax.swing.JTextArea txtAreaDiag2;
    private jtextfieldround.JTextFieldRound txtNombreTrat3;
    private jtextfieldround.JTextFieldRound txtNombreTrat4;
    private jtextfieldround.JTextFieldRound txtNombreTrat5;
    private jtextfieldround.JTextFieldRound txtNombreTrat6;
    private jtextfieldround.JTextFieldRound txtNombreTrat7;
    private jtextfieldround.JTextFieldRound txtNombreTrat8;
    // End of variables declaration//GEN-END:variables
}
