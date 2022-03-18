/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import com.toedter.calendar.JDateChooser;
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

   

    public JTextFieldRound getTxtgeneropac() {
        return Txtgeneropac;
    }

    public void setTxtgeneropac(JTextFieldRound Txtgeneropac) {
        this.Txtgeneropac = Txtgeneropac;
    }

    public JButton getBtncargardatos() {
        return btncargardatos;
    }

    public void setBtncargardatos(JButton btncargardatos) {
        this.btncargardatos = btncargardatos;
    }

    public JDateChooser getJdtfechanac() {
        return jdtfechanac;
    }

    public void setJdtfechanac(JDateChooser jdtfechanac) {
        this.jdtfechanac = jdtfechanac;
    }

    public JTextArea getTxtAalergias() {
        return txtAalergias;
    }

    public void setTxtAalergias(JTextArea txtAalergias) {
        this.txtAalergias = txtAalergias;
    }

    public JTextArea getTxtAmedicacion() {
        return txtAmedicacion;
    }

    public void setTxtAmedicacion(JTextArea txtAmedicacion) {
        this.txtAmedicacion = txtAmedicacion;
    }

    public JTextArea getTxtAmotivoocnsul() {
        return txtAmotivoocnsul;
    }

    public void setTxtAmotivoocnsul(JTextArea txtAmotivoocnsul) {
        this.txtAmotivoocnsul = txtAmotivoocnsul;
    }

    public JTextArea getTxtAobservaciones() {
        return txtAobservaciones;
    }

    public void setTxtAobservaciones(JTextArea txtAobservaciones) {
        this.txtAobservaciones = txtAobservaciones;
    }

    public JTextArea getTxtApatologiass() {
        return txtApatologiass;
    }

    public void setTxtApatologiass(JTextArea txtApatologiass) {
        this.txtApatologiass = txtApatologiass;
    }

    public JTextFieldRound getTxtapellidospac() {
        return txtapellidospac;
    }

    public void setTxtapellidospac(JTextFieldRound txtapellidospac) {
        this.txtapellidospac = txtapellidospac;
    }

    public JTextFieldRound getTxtdomicilio() {
        return txtdomicilio;
    }

    public void setTxtdomicilio(JTextFieldRound txtdomicilio) {
        this.txtdomicilio = txtdomicilio;
    }

    public JTextFieldRound getTxtedad() {
        return txtedad;
    }

    public void setTxtedad(JTextFieldRound txtedad) {
        this.txtedad = txtedad;
    }

    public JTextFieldRound getTxtnombrespac() {
        return txtnombrespac;
    }

    public void setTxtnombrespac(JTextFieldRound txtnombrespac) {
        this.txtnombrespac = txtnombrespac;
    }

    public JTextFieldRound getTxttelefono() {
        return txttelefono;
    }

    public void setTxttelefono(JTextFieldRound txttelefono) {
        this.txttelefono = txttelefono;
    }

   

   
   
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelNice2 = new org.edisoncor.gui.panel.PanelNice();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAalergias = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtdomicilio = new jtextfieldround.JTextFieldRound();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txttelefono = new jtextfieldround.JTextFieldRound();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAmotivoocnsul = new javax.swing.JTextArea();
        txtedad = new jtextfieldround.JTextFieldRound();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtAmedicacion = new javax.swing.JTextArea();
        jLabel29 = new javax.swing.JLabel();
        jdtfechanac = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtApatologiass = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtAobservaciones = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        txtnombrespac = new jtextfieldround.JTextFieldRound();
        jLabel3 = new javax.swing.JLabel();
        txtapellidospac = new jtextfieldround.JTextFieldRound();
        jLabel9 = new javax.swing.JLabel();
        btncargardatos = new javax.swing.JButton();
        Txtgeneropac = new jtextfieldround.JTextFieldRound();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1208, 735));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelNice2.setBackground(new java.awt.Color(90, 166, 166));
        panelNice2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtAalergias.setColumns(20);
        txtAalergias.setRows(5);
        jScrollPane1.setViewportView(txtAalergias);

        panelNice2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 340, 480, 100));

        jLabel2.setFont(new java.awt.Font("SF Pro Display", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("HISTORIAL CLINICO");
        panelNice2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, -1, -1));

        jLabel18.setFont(new java.awt.Font("SF Pro Display", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("MOTIVO DE CONSULTA");
        panelNice2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 40, -1, -1));

        jLabel20.setFont(new java.awt.Font("SF Pro Display", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("EDAD");
        panelNice2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, -1, -1));

        jLabel21.setFont(new java.awt.Font("SF Pro Display", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("FECHA NACIMIENTO");
        panelNice2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));
        panelNice2.add(txtdomicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 310, 30));

        jLabel22.setFont(new java.awt.Font("SF Pro Display", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("DOMICILIO");
        panelNice2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, 30));

        jLabel23.setFont(new java.awt.Font("SF Pro Display", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("TELEFONO");
        panelNice2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, -1));
        panelNice2.add(txttelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 330, 30));

        jLabel24.setFont(new java.awt.Font("SF Pro Display", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("OBSERVACIONES");
        panelNice2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 450, -1, -1));

        jLabel25.setFont(new java.awt.Font("SF Pro Display", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("MEDICACION");
        panelNice2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, -1, -1));

        txtAmotivoocnsul.setColumns(20);
        txtAmotivoocnsul.setRows(5);
        jScrollPane3.setViewportView(txtAmotivoocnsul);

        panelNice2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 60, 490, 110));
        panelNice2.add(txtedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 330, 30));

        jLabel26.setFont(new java.awt.Font("SF Pro Display", 1, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText(" SISTEMATICAS");
        panelNice2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 180, -1, -1));

        jLabel27.setFont(new java.awt.Font("SF Pro Display", 1, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("PATOLOGIAS ");
        panelNice2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 180, -1, -1));

        jLabel28.setFont(new java.awt.Font("SF Pro Display", 1, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("ENFERMEDADES ");
        panelNice2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 180, -1, -1));

        txtAmedicacion.setColumns(20);
        txtAmedicacion.setRows(5);
        jScrollPane4.setViewportView(txtAmedicacion);

        panelNice2.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, 330, 140));

        jLabel29.setFont(new java.awt.Font("SF Pro Display", 1, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("ALERGIAS");
        panelNice2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 320, -1, -1));
        panelNice2.add(jdtfechanac, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 310, -1));

        txtApatologiass.setColumns(20);
        txtApatologiass.setRows(5);
        jScrollPane2.setViewportView(txtApatologiass);

        panelNice2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 210, 480, 100));

        txtAobservaciones.setColumns(20);
        txtAobservaciones.setRows(5);
        jScrollPane5.setViewportView(txtAobservaciones);

        panelNice2.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 480, 480, 90));

        jLabel1.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NOMBRES:");
        panelNice2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));
        panelNice2.add(txtnombrespac, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 310, 30));

        jLabel3.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("APELLIDOS:");
        panelNice2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));
        panelNice2.add(txtapellidospac, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 310, 30));

        jLabel9.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("CIUDAD:");
        panelNice2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        btncargardatos.setText("Cargar Datos");
        panelNice2.add(btncargardatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));
        panelNice2.add(Txtgeneropac, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 310, -1));

        jPanel1.add(panelNice2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 1140, 640));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private jtextfieldround.JTextFieldRound Txtgeneropac;
    private javax.swing.JButton btncargardatos;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private com.toedter.calendar.JDateChooser jdtfechanac;
    private org.edisoncor.gui.panel.PanelNice panelNice2;
    private javax.swing.JTextArea txtAalergias;
    private javax.swing.JTextArea txtAmedicacion;
    private javax.swing.JTextArea txtAmotivoocnsul;
    private javax.swing.JTextArea txtAobservaciones;
    private javax.swing.JTextArea txtApatologiass;
    private jtextfieldround.JTextFieldRound txtapellidospac;
    private jtextfieldround.JTextFieldRound txtdomicilio;
    private jtextfieldround.JTextFieldRound txtedad;
    private jtextfieldround.JTextFieldRound txtnombrespac;
    private jtextfieldround.JTextFieldRound txttelefono;
    // End of variables declaration//GEN-END:variables
}
