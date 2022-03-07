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
public class Vista_Diagnostico extends javax.swing.JInternalFrame {


    public Vista_Diagnostico() {
        initComponents();
    }

    public ButtonRound getBtnAnterior() {
        return btnAnterior;
    }

    public void setBtnAnterior(ButtonRound btnAnterior) {
        this.btnAnterior = btnAnterior;
    }
     

    public JTextArea getTxtAreaDiag() {
        return txtAreaDiag;
    }

    public void setTxtAreaDiag(JTextArea txtAreaDiag) {
        this.txtAreaDiag = txtAreaDiag;
    }

    public JButton getBtnProfValida() {
        return BtnProfValida;
    }

    public void setBtnProfValida(JButton BtnProfValida) {
        this.BtnProfValida = BtnProfValida;
    }

    public JButton getBtnDiag() {
        return btnDiag;
    }

    public void setBtnDiag(JButton btnDiag) {
        this.btnDiag = btnDiag;
    }

    public JButton getBtnDiagPresup() {
        return btnDiagPresup;
    }

    public void setBtnDiagPresup(JButton btnDiagPresup) {
        this.btnDiagPresup = btnDiagPresup;
    }

    public JButton getBtnImpProforma() {
        return btnImpProforma;
    }

    public void setBtnImpProforma(JButton btnImpProforma) {
        this.btnImpProforma = btnImpProforma;
    }

    public JButton getBtnIndicSaludBucal() {
        return btnIndicSaludBucal;
    }

    public void setBtnIndicSaludBucal(JButton btnIndicSaludBucal) {
        this.btnIndicSaludBucal = btnIndicSaludBucal;
    }

    public JButton getBtnValidProforma() {
        return btnValidProforma;
    }

    public void setBtnValidProforma(JButton btnValidProforma) {
        this.btnValidProforma = btnValidProforma;
    }

    public ComboBoxRound getCboxDoctor() {
        return cboxDoctor;
    }

    public void setCboxDoctor(ComboBoxRound cboxDoctor) {
        this.cboxDoctor = cboxDoctor;
    }

    public ComboBoxRound getCboxFormaPago() {
        return cboxFormaPago;
    }

    public void setCboxFormaPago(ComboBoxRound cboxFormaPago) {
        this.cboxFormaPago = cboxFormaPago;
    }

    public ComboBoxRound getCboxProtesisInf() {
        return cboxProtesisInf;
    }

    public void setCboxProtesisInf(ComboBoxRound cboxProtesisInf) {
        this.cboxProtesisInf = cboxProtesisInf;
    }

    public ComboBoxRound getCboxProtesisSup() {
        return cboxProtesisSup;
    }

    public void setCboxProtesisSup(ComboBoxRound cboxProtesisSup) {
        this.cboxProtesisSup = cboxProtesisSup;
    }

    public JLabel getLblFoto() {
        return lblFoto;
    }

    public void setLblFoto(JLabel lblFoto) {
        this.lblFoto = lblFoto;
    }

    public JTable getTblTratamientoPresupuesto() {
        return tblTratamientoPresupuesto;
    }

    public void setTblTratamientoPresupuesto(JTable tblTratamientoPresupuesto) {
        this.tblTratamientoPresupuesto = tblTratamientoPresupuesto;
    }

    public JTextField getTxtCuotalIni() {
        return txtCuotalIni;
    }

    public void setTxtCuotalIni(JTextField txtCuotalIni) {
        this.txtCuotalIni = txtCuotalIni;
    }

    public JTextField getTxtDesTotal() {
        return txtDesTotal;
    }

    public void setTxtDesTotal(JTextField txtDesTotal) {
        this.txtDesTotal = txtDesTotal;
    }

    public JTextField getTxtDescuento() {
        return txtDescuento;
    }

    public void setTxtDescuento(JTextField txtDescuento) {
        this.txtDescuento = txtDescuento;
    }

    public JTextField getTxtMesesCred() {
        return txtMesesCred;
    }

    public void setTxtMesesCred(JTextField txtMesesCred) {
        this.txtMesesCred = txtMesesCred;
    }

    public JTextField getTxtSaldoLuegoCuoIni() {
        return txtSaldoLuegoCuoIni;
    }

    public void setTxtSaldoLuegoCuoIni(JTextField txtSaldoLuegoCuoIni) {
        this.txtSaldoLuegoCuoIni = txtSaldoLuegoCuoIni;
    }

    public JTextField getTxtTotal() {
        return txtTotal;
    }

    public void setTxtTotal(JTextField txtTotal) {
        this.txtTotal = txtTotal;
    }

    public JTextField getTxtTotalTrat() {
        return txtTotalTrat;
    }

    public void setTxtTotalTrat(JTextField txtTotalTrat) {
        this.txtTotalTrat = txtTotalTrat;
    }

    public JTextFieldRound getTxtTratamientos() {
        return txtTratamientos;
    }

    public void setTxtTratamientos(JTextFieldRound txtTratamientos) {
        this.txtTratamientos = txtTratamientos;
    }

    public JTextField getTxtValorCuotMensual() {
        return txtValorCuotMensual;
    }

    public void setTxtValorCuotMensual(JTextField txtValorCuotMensual) {
        this.txtValorCuotMensual = txtValorCuotMensual;
    }

    public JTextField getTxtValorTotFinal() {
        return txtValorTotFinal;
    }

    public void setTxtValorTotFinal(JTextField txtValorTotFinal) {
        this.txtValorTotFinal = txtValorTotFinal;
    }
    
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelNice1 = new org.edisoncor.gui.panel.PanelNice();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        panelNice2 = new org.edisoncor.gui.panel.PanelNice();
        jLabel3 = new javax.swing.JLabel();
        cboxDoctor = new org.edisoncor.gui.comboBox.ComboBoxRound();
        jLabel4 = new javax.swing.JLabel();
        cboxProtesisSup = new org.edisoncor.gui.comboBox.ComboBoxRound();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaDiag = new javax.swing.JTextArea();
        btnDiag = new javax.swing.JButton();
        btnIndicSaludBucal = new javax.swing.JButton();
        BtnProfValida = new javax.swing.JButton();
        cboxProtesisInf = new org.edisoncor.gui.comboBox.ComboBoxRound();
        panelNice3 = new org.edisoncor.gui.panel.PanelNice();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtTratamientos = new jtextfieldround.JTextFieldRound();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTratamientoPresupuesto = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        txtTotalTrat = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtValorCuotMensual = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cboxFormaPago = new org.edisoncor.gui.comboBox.ComboBoxRound();
        jLabel11 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtDescuento = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtDesTotal = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtValorTotFinal = new javax.swing.JTextField();
        txtCuotalIni = new javax.swing.JTextField();
        txtSaldoLuegoCuoIni = new javax.swing.JTextField();
        txtMesesCred = new javax.swing.JTextField();
        btnImpProforma = new javax.swing.JButton();
        btnValidProforma = new javax.swing.JButton();
        lblFoto = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnDiagPresup = new javax.swing.JButton();
        btnAnterior = new org.edisoncor.gui.button.ButtonRound();

        setPreferredSize(new java.awt.Dimension(1208, 735));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelNice1.setBackground(new java.awt.Color(166, 104, 216));
        panelNice1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("SF Pro Display", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DIAGNOSTICO");
        panelNice1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        jLabel1.setText("Odontograma");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        panelNice1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 500, 270));

        jPanel1.add(panelNice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 550, 350));

        panelNice2.setBackground(new java.awt.Color(166, 154, 216));
        panelNice2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("SF Pro Display", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("DIAGNOSTICO");
        panelNice2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));
        panelNice2.add(cboxDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 150, -1));

        jLabel4.setFont(new java.awt.Font("SF Pro Display", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Protesis Superior");
        panelNice2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));
        panelNice2.add(cboxProtesisSup, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 150, -1));

        jLabel5.setFont(new java.awt.Font("SF Pro Display", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Protesis Inferior");
        panelNice2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, -1, -1));

        txtAreaDiag.setColumns(20);
        txtAreaDiag.setRows(5);
        jScrollPane1.setViewportView(txtAreaDiag);

        panelNice2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 280, 120));

        btnDiag.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icons/impresora.png"))); // NOI18N
        btnDiag.setText("Diagnostico");
        panelNice2.add(btnDiag, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, -1, -1));

        btnIndicSaludBucal.setText("Indicadores Salud Bucal");
        panelNice2.add(btnIndicSaludBucal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 150, -1));

        BtnProfValida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icons/ver.png"))); // NOI18N
        BtnProfValida.setText("Proforma Valida");
        BtnProfValida.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        panelNice2.add(BtnProfValida, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 150, -1));
        panelNice2.add(cboxProtesisInf, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 150, -1));

        jPanel1.add(panelNice2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 550, 280));

        panelNice3.setBackground(new java.awt.Color(90, 166, 166));
        panelNice3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("SF Pro Display", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("PLAN DE TRATAMIENTO Y PRESUPESTO");
        panelNice3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        jLabel7.setFont(new java.awt.Font("SF Pro Display", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("TRATAMIENTOS");
        panelNice3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));
        panelNice3.add(txtTratamientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 220, -1));

        tblTratamientoPresupuesto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblTratamientoPresupuesto);

        panelNice3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 570, 180));

        jLabel8.setFont(new java.awt.Font("SF Pro Display", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Total:");
        panelNice3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, -1, -1));
        panelNice3.add(txtTotalTrat, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, 120, -1));

        jLabel9.setFont(new java.awt.Font("SF Pro Display", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Saldo luego de la cuota inicial:");
        panelNice3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 480, -1, -1));
        panelNice3.add(txtValorCuotMensual, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 540, 70, -1));

        jLabel10.setFont(new java.awt.Font("SF Pro Display", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Total de tratamientos:");
        panelNice3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, -1, -1));
        panelNice3.add(cboxFormaPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 150, -1));

        jLabel11.setFont(new java.awt.Font("SF Pro Display", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Forma de pago:");
        panelNice3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, -1, -1));
        panelNice3.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(509, 300, 70, -1));

        jLabel12.setFont(new java.awt.Font("SF Pro Display", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Descuento:");
        panelNice3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, -1, -1));
        panelNice3.add(txtDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 330, 70, -1));

        jLabel13.setFont(new java.awt.Font("SF Pro Display", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Descuento total:");
        panelNice3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 360, -1, -1));
        panelNice3.add(txtDesTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 360, 70, -1));

        jLabel14.setFont(new java.awt.Font("SF Pro Display", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Valor total final:");
        panelNice3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 390, -1, -1));

        jLabel15.setFont(new java.awt.Font("SF Pro Display", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Meses de credito:");
        panelNice3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 510, -1, -1));

        jLabel16.setFont(new java.awt.Font("SF Pro Display", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Cuota inicial:");
        panelNice3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 450, -1, -1));

        jLabel17.setFont(new java.awt.Font("SF Pro Display", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Valor de cuota mensual:");
        panelNice3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 540, -1, -1));
        panelNice3.add(txtValorTotFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 390, 70, -1));
        panelNice3.add(txtCuotalIni, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 450, 70, -1));
        panelNice3.add(txtSaldoLuegoCuoIni, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 480, 70, -1));
        panelNice3.add(txtMesesCred, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 510, 70, -1));

        btnImpProforma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icons/impresora.png"))); // NOI18N
        btnImpProforma.setText("Proforma");
        panelNice3.add(btnImpProforma, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        btnValidProforma.setText("Validar Proforma");
        panelNice3.add(btnValidProforma, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        lblFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelNice3.add(lblFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 110, 80));
        panelNice3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 420, 250, 10));

        btnDiagPresup.setText("Diagnostico y presupuesto inicial ");
        panelNice3.add(btnDiagPresup, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, -1, 30));

        jPanel1.add(panelNice3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, 590, 640));

        btnAnterior.setText("Anterior");
        jPanel1.add(btnAnterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 120, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1194, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnProfValida;
    private org.edisoncor.gui.button.ButtonRound btnAnterior;
    private javax.swing.JButton btnDiag;
    private javax.swing.JButton btnDiagPresup;
    private javax.swing.JButton btnImpProforma;
    private javax.swing.JButton btnIndicSaludBucal;
    private javax.swing.JButton btnValidProforma;
    private org.edisoncor.gui.comboBox.ComboBoxRound cboxDoctor;
    private org.edisoncor.gui.comboBox.ComboBoxRound cboxFormaPago;
    private org.edisoncor.gui.comboBox.ComboBoxRound cboxProtesisInf;
    private org.edisoncor.gui.comboBox.ComboBoxRound cboxProtesisSup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblFoto;
    private org.edisoncor.gui.panel.PanelNice panelNice1;
    private org.edisoncor.gui.panel.PanelNice panelNice2;
    private org.edisoncor.gui.panel.PanelNice panelNice3;
    private javax.swing.JTable tblTratamientoPresupuesto;
    private javax.swing.JTextArea txtAreaDiag;
    private javax.swing.JTextField txtCuotalIni;
    private javax.swing.JTextField txtDesTotal;
    private javax.swing.JTextField txtDescuento;
    private javax.swing.JTextField txtMesesCred;
    private javax.swing.JTextField txtSaldoLuegoCuoIni;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtTotalTrat;
    private jtextfieldround.JTextFieldRound txtTratamientos;
    private javax.swing.JTextField txtValorCuotMensual;
    private javax.swing.JTextField txtValorTotFinal;
    // End of variables declaration//GEN-END:variables
}
