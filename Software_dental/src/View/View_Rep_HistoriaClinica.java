/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JTextArea;
import jtextfieldround.JTextFieldRound;

/**
 *
 * @author slix0
 */
public class View_Rep_HistoriaClinica extends javax.swing.JInternalFrame {

    /**
     * Creates new form View_Rep_HistoriaClinica
     */
    public View_Rep_HistoriaClinica() {
        initComponents();
    }

    public JTextFieldRound getTxtgeneropac() {
        return Txtgeneropac;
    }

    public void setTxtgeneropac(JTextFieldRound Txtgeneropac) {
        this.Txtgeneropac = Txtgeneropac;
    }

    public JButton getBtncargardts() {
        return btncargardts;
    }

    public void setBtncargardts(JButton btncargardts) {
        this.btncargardts = btncargardts;
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

    public JButton getBtnimprimir() {
        return btnimprimir;
    }

    public void setBtnimprimir(JButton btnimprimir) {
        this.btnimprimir = btnimprimir;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelNice2 = new org.edisoncor.gui.panel.PanelNice();
        jLabel3 = new javax.swing.JLabel();
        btnimprimir = new javax.swing.JButton();
        btncargardts = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtnombrespac = new jtextfieldround.JTextFieldRound();
        jLabel5 = new javax.swing.JLabel();
        txtapellidospac = new jtextfieldround.JTextFieldRound();
        jLabel9 = new javax.swing.JLabel();
        Txtgeneropac = new jtextfieldround.JTextFieldRound();
        jLabel22 = new javax.swing.JLabel();
        txtdomicilio = new jtextfieldround.JTextFieldRound();
        jLabel21 = new javax.swing.JLabel();
        jdtfechanac = new com.toedter.calendar.JDateChooser();
        jLabel23 = new javax.swing.JLabel();
        txttelefono = new jtextfieldround.JTextFieldRound();
        jLabel20 = new javax.swing.JLabel();
        txtedad = new jtextfieldround.JTextFieldRound();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtAmedicacion = new javax.swing.JTextArea();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAmotivoocnsul = new javax.swing.JTextArea();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtApatologiass = new javax.swing.JTextArea();
        jLabel29 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAalergias = new javax.swing.JTextArea();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtAobservaciones = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        panelNice2.setBackground(new java.awt.Color(103, 58, 137));
        panelNice2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("SF Pro Display", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Reporte Historia Clinica");
        panelNice2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, -1, -1));

        btnimprimir.setText("Imprimir");
        panelNice2.add(btnimprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 570, 570, 50));

        btncargardts.setText("Cargar Datos");
        panelNice2.add(btncargardts, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("NOMBRES:");
        panelNice2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));
        panelNice2.add(txtnombrespac, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 220, 30));

        jLabel5.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("APELLIDOS:");
        panelNice2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, -1, -1));
        panelNice2.add(txtapellidospac, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, 220, 30));

        jLabel9.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("CIUDAD:");
        panelNice2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 70, -1, -1));
        panelNice2.add(Txtgeneropac, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 60, 220, -1));

        jLabel22.setFont(new java.awt.Font("SF Pro Display", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("DOMICILIO");
        panelNice2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, 30));
        panelNice2.add(txtdomicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 220, 30));

        jLabel21.setFont(new java.awt.Font("SF Pro Display", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("FECHA NACIMIENTO");
        panelNice2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));
        panelNice2.add(jdtfechanac, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 220, -1));

        jLabel23.setFont(new java.awt.Font("SF Pro Display", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("TELEFONO");
        panelNice2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, -1, -1));
        panelNice2.add(txttelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, 220, 30));

        jLabel20.setFont(new java.awt.Font("SF Pro Display", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("EDAD");
        panelNice2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 110, -1, -1));
        panelNice2.add(txtedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 100, 220, 30));

        jLabel25.setFont(new java.awt.Font("SF Pro Display", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("MEDICACION");
        panelNice2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, -1, -1));

        txtAmedicacion.setColumns(20);
        txtAmedicacion.setRows(5);
        jScrollPane4.setViewportView(txtAmedicacion);

        panelNice2.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 480, 80));

        jLabel18.setFont(new java.awt.Font("SF Pro Display", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("MOTIVO DE CONSULTA");
        panelNice2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 150, -1, -1));

        txtAmotivoocnsul.setColumns(20);
        txtAmotivoocnsul.setRows(5);
        jScrollPane3.setViewportView(txtAmotivoocnsul);

        panelNice2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, 490, 90));

        jLabel27.setFont(new java.awt.Font("SF Pro Display", 1, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("PATOLOGIAS ");
        panelNice2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, -1, -1));

        jLabel28.setFont(new java.awt.Font("SF Pro Display", 1, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("ENFERMEDADES ");
        panelNice2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, -1, -1));

        jLabel26.setFont(new java.awt.Font("SF Pro Display", 1, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText(" SISTEMATICAS");
        panelNice2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, -1, -1));

        txtApatologiass.setColumns(20);
        txtApatologiass.setRows(5);
        jScrollPane2.setViewportView(txtApatologiass);

        panelNice2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 480, 100));

        jLabel29.setFont(new java.awt.Font("SF Pro Display", 1, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("ALERGIAS");
        panelNice2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 270, -1, -1));

        txtAalergias.setColumns(20);
        txtAalergias.setRows(5);
        jScrollPane1.setViewportView(txtAalergias);

        panelNice2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 290, 490, 80));

        jLabel24.setFont(new java.awt.Font("SF Pro Display", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("OBSERVACIONES");
        panelNice2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 420, -1, -1));

        txtAobservaciones.setColumns(20);
        txtAobservaciones.setRows(5);
        jScrollPane5.setViewportView(txtAobservaciones);

        panelNice2.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 480, 90));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane6.setViewportView(jTable1);

        panelNice2.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 390, 490, 150));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelNice2, javax.swing.GroupLayout.PREFERRED_SIZE, 1126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelNice2, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private jtextfieldround.JTextFieldRound Txtgeneropac;
    private javax.swing.JButton btncargardts;
    private javax.swing.JButton btnimprimir;
    private javax.swing.JLabel jLabel18;
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTable1;
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
