/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import jtextfieldround.JTextFieldRound;
import org.edisoncor.gui.button.ButtonRound;

/**
 *
 * @author Usuario
 */
public class Vista_NuevaEndodoncia extends javax.swing.JInternalFrame {

    /**
     * Creates new form Vista_NuevaEndodoncia
     */
    public Vista_NuevaEndodoncia() {
        initComponents();
        llamarframepaciente();
    }

   
public void llamarframepaciente(){
    Crud_Paciente crud_Paciente = new Crud_Paciente();
    crud_Paciente.setVisible(true);
    panelpaciente.add(crud_Paciente);
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldRoundBeanInfo1 = new jtextfieldround.JTextFieldRoundBeanInfo();
        jTextFieldRoundBeanInfo2 = new jtextfieldround.JTextFieldRoundBeanInfo();
        jPasswordFieldRoundBeanInfo1 = new jtextfieldround.JPasswordFieldRoundBeanInfo();
        jPasswordFieldRoundBeanInfo2 = new jtextfieldround.JPasswordFieldRoundBeanInfo();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        panelNice1 = new org.edisoncor.gui.panel.PanelNice();
        jLabel11 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        cBoxFrio = new javax.swing.JCheckBox();
        cBoxCalor = new javax.swing.JCheckBox();
        cBoxDulce = new javax.swing.JCheckBox();
        cBoxAcido = new javax.swing.JCheckBox();
        cBoxDolor = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        cBoxLocalizado = new javax.swing.JCheckBox();
        cBoxDifuso = new javax.swing.JCheckBox();
        cBoxProvocado = new javax.swing.JCheckBox();
        cBoxEspontaneo = new javax.swing.JCheckBox();
        cBoxPercusion = new javax.swing.JCheckBox();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        cBoxBolsaPeriod = new javax.swing.JCheckBox();
        cBoxEdoma = new javax.swing.JCheckBox();
        cBoxFatula = new javax.swing.JCheckBox();
        jSeparator3 = new javax.swing.JSeparator();
        panelNice3 = new org.edisoncor.gui.panel.PanelNice();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        DateFechaInicio = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNumFicha = new jtextfieldround.JTextFieldRound();
        btnFichaPaciente = new javax.swing.JButton();
        comboBoxRound1 = new org.edisoncor.gui.comboBox.ComboBoxRound();
        txtNumFicha3 = new jtextfieldround.JTextFieldRound();
        txtNumFicha4 = new jtextfieldround.JTextFieldRound();
        panelNice5 = new org.edisoncor.gui.panel.PanelNice();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtLongitud = new jtextfieldround.JTextFieldRound();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtPronostico = new jtextfieldround.JTextFieldRound();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAObserciones = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAObserciones1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btnPdf = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        panelNice2 = new org.edisoncor.gui.panel.PanelNice();
        jPanel6 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        cBoxNormal = new javax.swing.JCheckBox();
        cBoxClacificada = new javax.swing.JCheckBox();
        cBoxRetraida = new javax.swing.JCheckBox();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        cBoxRecta = new javax.swing.JCheckBox();
        cBoxCurva = new javax.swing.JCheckBox();
        cBoxReabsorcion = new javax.swing.JCheckBox();
        cBoxFactura = new javax.swing.JCheckBox();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        cBoxAbierto = new javax.swing.JCheckBox();
        cBoxCerrado = new javax.swing.JCheckBox();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        cBoxNormalP = new javax.swing.JCheckBox();
        cBoxEnsanchado = new javax.swing.JCheckBox();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        cBoxRarefaccion = new javax.swing.JCheckBox();
        cBoxSinlesion = new javax.swing.JCheckBox();
        cBoxConlesion = new javax.swing.JCheckBox();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        cBoxCaries = new javax.swing.JCheckBox();
        cBoxFractura = new javax.swing.JCheckBox();
        cBoxAmalgama = new javax.swing.JCheckBox();
        cBoxCorona = new javax.swing.JCheckBox();
        jLabel12 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        txtCostoTratEnd = new jtextfieldround.JTextFieldRound();
        jLabel25 = new javax.swing.JLabel();
        panelNice4 = new org.edisoncor.gui.panel.PanelNice();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jDateChooser4 = new com.toedter.calendar.JDateChooser();
        jDateChooser5 = new com.toedter.calendar.JDateChooser();
        jDateChooser6 = new com.toedter.calendar.JDateChooser();
        jDateChooser7 = new com.toedter.calendar.JDateChooser();
        jDateChooser8 = new com.toedter.calendar.JDateChooser();
        jLabel26 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        txtRece7 = new javax.swing.JTextField();
        txtRece8 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        txtAbo2 = new jtextfieldround.JTextFieldRound();
        txtAbo3 = new jtextfieldround.JTextFieldRound();
        txtAbo4 = new jtextfieldround.JTextFieldRound();
        txtAbo5 = new jtextfieldround.JTextFieldRound();
        txtAbo6 = new jtextfieldround.JTextFieldRound();
        jLabel27 = new javax.swing.JLabel();
        txtAbo7 = new jtextfieldround.JTextFieldRound();
        txtAct2 = new javax.swing.JTextField();
        txtAbo8 = new jtextfieldround.JTextFieldRound();
        txtAct3 = new javax.swing.JTextField();
        txtAct4 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txtSaldoSegiTrat = new javax.swing.JTextField();
        txtAct5 = new javax.swing.JTextField();
        txtAct6 = new javax.swing.JTextField();
        txtAct7 = new javax.swing.JTextField();
        txtAct8 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txtRece2 = new javax.swing.JTextField();
        txtRece3 = new javax.swing.JTextField();
        txtRece4 = new javax.swing.JTextField();
        txtRece5 = new javax.swing.JTextField();
        txtRece6 = new javax.swing.JTextField();
        panelpaciente = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelNice1.setBackground(new java.awt.Color(166, 104, 216));

        jLabel11.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("EXAMEN GENERAL");

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("ESTIMULO");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        cBoxFrio.setText("Frio");
        jPanel5.add(cBoxFrio, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        cBoxCalor.setText("Calor");
        jPanel5.add(cBoxCalor, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, -1));

        cBoxDulce.setText("Dulce");
        jPanel5.add(cBoxDulce, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));

        cBoxAcido.setText("Acido");
        jPanel5.add(cBoxAcido, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, -1));

        cBoxDolor.setText("Dolor");
        jPanel5.add(cBoxDolor, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel5.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 21, 241));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("DOLOR");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, -1));

        cBoxLocalizado.setText("Localizado");
        jPanel5.add(cBoxLocalizado, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, -1, -1));

        cBoxDifuso.setText("Difuso");
        jPanel5.add(cBoxDifuso, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, -1, -1));

        cBoxProvocado.setText("Provocado");
        jPanel5.add(cBoxProvocado, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, -1, -1));

        cBoxEspontaneo.setText("Espontaneo");
        jPanel5.add(cBoxEspontaneo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, -1, -1));

        cBoxPercusion.setText("Percusion");
        jPanel5.add(cBoxPercusion, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, -1, -1));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel5.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 21, 241));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("MUCOSA");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 54, -1));

        cBoxBolsaPeriod.setText("Bolsa Periodontal");
        jPanel5.add(cBoxBolsaPeriod, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, -1, -1));

        cBoxEdoma.setText("Edoma");
        jPanel5.add(cBoxEdoma, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, -1, -1));

        cBoxFatula.setText("Fatula");
        jPanel5.add(cBoxFatula, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, -1, -1));
        jPanel5.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 740, 10));

        javax.swing.GroupLayout panelNice1Layout = new javax.swing.GroupLayout(panelNice1);
        panelNice1.setLayout(panelNice1Layout);
        panelNice1Layout.setHorizontalGroup(
            panelNice1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNice1Layout.createSequentialGroup()
                .addGap(332, 332, 332)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNice1Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 736, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        panelNice1Layout.setVerticalGroup(
            panelNice1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNice1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel3.add(panelNice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 810, 290));

        panelNice3.setBackground(new java.awt.Color(90, 166, 166));

        jLabel5.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("PIEZA DENTAL:");

        jLabel6.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("FECHA DE INICIO:");

        jLabel7.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("NUMERO DE CONDUCTOS:");

        jLabel1.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID END:");

        jLabel2.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Numero de ficha:");

        btnFichaPaciente.setText("IR A FICHA DE PACIENTE");

        javax.swing.GroupLayout panelNice3Layout = new javax.swing.GroupLayout(panelNice3);
        panelNice3.setLayout(panelNice3Layout);
        panelNice3Layout.setHorizontalGroup(
            panelNice3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNice3Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNumFicha3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNumFicha, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboBoxRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DateFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNumFicha4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnFichaPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        panelNice3Layout.setVerticalGroup(
            panelNice3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNice3Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addGroup(panelNice3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelNice3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelNice3Layout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addGroup(panelNice3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(txtNumFicha3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)
                                .addComponent(txtNumFicha, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)
                                .addComponent(comboBoxRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6)))
                        .addGroup(panelNice3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtNumFicha4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFichaPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelNice3Layout.createSequentialGroup()
                        .addComponent(DateFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)))
                .addGap(11, 11, 11))
        );

        jPanel3.add(panelNice3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 1180, 50));

        panelNice5.setBackground(new java.awt.Color(90, 166, 166));

        jLabel19.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Diganostico:");

        jLabel21.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Longitud de trabajo:");

        jLabel20.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Tratamiento:");

        jLabel22.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Pronostico:");

        jLabel23.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Observaciones:");

        txtAObserciones.setColumns(20);
        txtAObserciones.setRows(5);
        jScrollPane1.setViewportView(txtAObserciones);

        txtAObserciones1.setColumns(20);
        txtAObserciones1.setRows(5);
        jScrollPane2.setViewportView(txtAObserciones1);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        btnPdf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icons/pdf.png"))); // NOI18N
        btnPdf.setText("EXPORTAR");

        jButton1.setText("FOTOS");

        javax.swing.GroupLayout panelNice5Layout = new javax.swing.GroupLayout(panelNice5);
        panelNice5.setLayout(panelNice5Layout);
        panelNice5Layout.setHorizontalGroup(
            panelNice5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNice5Layout.createSequentialGroup()
                .addGroup(panelNice5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelNice5Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jLabel19))
                    .addGroup(panelNice5Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(panelNice5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelNice5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(panelNice5Layout.createSequentialGroup()
                                    .addComponent(btnPdf, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelNice5Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelNice5Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(txtLongitud, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelNice5Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jLabel20))
                    .addGroup(panelNice5Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(txtPronostico, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNice5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panelNice5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNice5Layout.createSequentialGroup()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNice5Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addGap(127, 127, 127))))
        );
        panelNice5Layout.setVerticalGroup(
            panelNice5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNice5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLongitud, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPronostico, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelNice5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPdf, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jPanel3.add(panelNice5, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 70, 350, 570));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        panelNice2.setBackground(new java.awt.Color(166, 154, 216));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("CAMARA");

        cBoxNormal.setText("Normal");

        cBoxClacificada.setText("Calcificada");

        cBoxRetraida.setText("Retraida");

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("RAIZ");

        cBoxRecta.setText("Recta");

        cBoxCurva.setText("Curva");

        cBoxReabsorcion.setText("Reabsorcion");

        cBoxFactura.setText("Fractura");

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("APICE");

        cBoxAbierto.setText("Abierto");

        cBoxCerrado.setText("Cerrado");

        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("PERIODONTO");

        cBoxNormalP.setText("Normal");

        cBoxEnsanchado.setText("Ensanchado");

        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setText("HUESO");

        cBoxRarefaccion.setText("Rarefaccion");

        cBoxSinlesion.setText("Sin lesion");

        cBoxConlesion.setText("Con lesion");

        jSeparator8.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setText("CORONA");

        cBoxCaries.setText("Caries");

        cBoxFractura.setText("Fractura");

        cBoxAmalgama.setText("Amalgama");

        cBoxCorona.setText("Corona");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cBoxRetraida)
                    .addComponent(cBoxClacificada)
                    .addComponent(cBoxNormal)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(cBoxRecta)
                    .addComponent(cBoxCurva)
                    .addComponent(cBoxReabsorcion)
                    .addComponent(cBoxFactura))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(cBoxAbierto)
                    .addComponent(cBoxCerrado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(cBoxNormalP)
                    .addComponent(cBoxEnsanchado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(cBoxRarefaccion)
                    .addComponent(cBoxSinlesion)
                    .addComponent(cBoxConlesion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(cBoxCaries)
                    .addComponent(cBoxFractura)
                    .addComponent(cBoxAmalgama)
                    .addComponent(cBoxCorona)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator4)
            .addComponent(jSeparator6)
            .addComponent(jSeparator5)
            .addComponent(jSeparator7, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator8, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(cBoxNormal)
                                .addGap(18, 18, 18)
                                .addComponent(cBoxClacificada)
                                .addGap(18, 18, 18)
                                .addComponent(cBoxRetraida))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(cBoxRecta)
                                .addGap(18, 18, 18)
                                .addComponent(cBoxCurva)
                                .addGap(18, 18, 18)
                                .addComponent(cBoxReabsorcion)))
                        .addGap(18, 18, 18)
                        .addComponent(cBoxFactura))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addComponent(cBoxAbierto)
                        .addGap(18, 18, 18)
                        .addComponent(cBoxCerrado))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(cBoxNormalP)
                        .addGap(18, 18, 18)
                        .addComponent(cBoxEnsanchado))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(18, 18, 18)
                        .addComponent(cBoxRarefaccion)
                        .addGap(18, 18, 18)
                        .addComponent(cBoxSinlesion)
                        .addGap(18, 18, 18)
                        .addComponent(cBoxConlesion))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(18, 18, 18)
                        .addComponent(cBoxCaries)
                        .addGap(18, 18, 18)
                        .addComponent(cBoxFractura)
                        .addGap(18, 18, 18)
                        .addComponent(cBoxAmalgama)
                        .addGap(18, 18, 18)
                        .addComponent(cBoxCorona)))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jLabel12.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("EXAMEN RADIOGRAFICO");

        javax.swing.GroupLayout panelNice2Layout = new javax.swing.GroupLayout(panelNice2);
        panelNice2.setLayout(panelNice2Layout);
        panelNice2Layout.setHorizontalGroup(
            panelNice2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNice2Layout.createSequentialGroup()
                .addGroup(panelNice2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelNice2Layout.createSequentialGroup()
                        .addGap(313, 313, 313)
                        .addComponent(jLabel12))
                    .addGroup(panelNice2Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(147, Short.MAX_VALUE))
        );
        panelNice2Layout.setVerticalGroup(
            panelNice2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNice2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(panelNice2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(438, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(359, 359, 359)
                .addComponent(panelNice2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1201, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 10, -1, 1830));

        jTabbedPane2.addTab("DIAGNOSTICO ENDOCRINO Y REDIPGRAFICO", jPanel3);

        jPanel4.setBackground(new java.awt.Color(166, 104, 216));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("COSTO DE TRATAMIENTO DE ENDODONCIA:");
        jPanel4.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 27, -1, -1));
        jPanel4.add(txtCostoTratEnd, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 23, 98, 20));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("TRATAMIENTO");
        jPanel4.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, -1, -1));

        panelNice4.setBackground(new java.awt.Color(90, 166, 166));
        panelNice4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelNice4.add(jDateChooser3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 100, -1));
        panelNice4.add(jDateChooser4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 100, -1));
        panelNice4.add(jDateChooser5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 100, -1));
        panelNice4.add(jDateChooser6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 100, -1));
        panelNice4.add(jDateChooser7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 100, -1));
        panelNice4.add(jDateChooser8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 100, -1));

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("FECHA");
        panelNice4.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));
        panelNice4.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 100, -1));
        panelNice4.add(txtRece7, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, 244, -1));
        panelNice4.add(txtRece8, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 270, 244, -1));

        jLabel29.setBackground(new java.awt.Color(255, 255, 255));
        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("ABONO");
        panelNice4.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 10, -1, -1));
        panelNice4.add(txtAbo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 40, 98, 20));
        panelNice4.add(txtAbo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 80, 98, 20));
        panelNice4.add(txtAbo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 120, 98, 20));
        panelNice4.add(txtAbo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 160, 98, 20));
        panelNice4.add(txtAbo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 200, 98, 20));

        jLabel27.setBackground(new java.awt.Color(255, 255, 255));
        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("ACTIVIDAD");
        panelNice4.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));
        panelNice4.add(txtAbo7, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 230, 98, 20));
        panelNice4.add(txtAct2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 271, -1));
        panelNice4.add(txtAbo8, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 270, 98, 20));
        panelNice4.add(txtAct3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 271, -1));
        panelNice4.add(txtAct4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 244, -1));

        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("SALDO:");
        panelNice4.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 320, -1, -1));
        panelNice4.add(txtSaldoSegiTrat, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 320, 94, -1));
        panelNice4.add(txtAct5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 244, -1));
        panelNice4.add(txtAct6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 244, -1));
        panelNice4.add(txtAct7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 244, -1));
        panelNice4.add(txtAct8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 244, -1));

        jLabel28.setBackground(new java.awt.Color(255, 255, 255));
        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("RECETA");
        panelNice4.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, -1, -1));
        panelNice4.add(txtRece2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, 244, -1));
        panelNice4.add(txtRece3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 80, 244, -1));
        panelNice4.add(txtRece4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, 244, -1));
        panelNice4.add(txtRece5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, 244, -1));
        panelNice4.add(txtRece6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 200, 244, -1));

        jPanel4.add(panelNice4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 84, 1141, 377));

        jTabbedPane2.addTab("SEGUIMIENTO Y TRATAMIENTO", jPanel4);

        javax.swing.GroupLayout panelpacienteLayout = new javax.swing.GroupLayout(panelpaciente);
        panelpaciente.setLayout(panelpacienteLayout);
        panelpacienteLayout.setHorizontalGroup(
            panelpacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1185, Short.MAX_VALUE)
        );
        panelpacienteLayout.setVerticalGroup(
            panelpacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 742, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("tab3", panelpaciente);

        jPanel1.add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 770));

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
    private com.toedter.calendar.JDateChooser DateFechaInicio;
    private javax.swing.JButton btnFichaPaciente;
    private javax.swing.JButton btnPdf;
    private javax.swing.JCheckBox cBoxAbierto;
    private javax.swing.JCheckBox cBoxAcido;
    private javax.swing.JCheckBox cBoxAmalgama;
    private javax.swing.JCheckBox cBoxBolsaPeriod;
    private javax.swing.JCheckBox cBoxCalor;
    private javax.swing.JCheckBox cBoxCaries;
    private javax.swing.JCheckBox cBoxCerrado;
    private javax.swing.JCheckBox cBoxClacificada;
    private javax.swing.JCheckBox cBoxConlesion;
    private javax.swing.JCheckBox cBoxCorona;
    private javax.swing.JCheckBox cBoxCurva;
    private javax.swing.JCheckBox cBoxDifuso;
    private javax.swing.JCheckBox cBoxDolor;
    private javax.swing.JCheckBox cBoxDulce;
    private javax.swing.JCheckBox cBoxEdoma;
    private javax.swing.JCheckBox cBoxEnsanchado;
    private javax.swing.JCheckBox cBoxEspontaneo;
    private javax.swing.JCheckBox cBoxFactura;
    private javax.swing.JCheckBox cBoxFatula;
    private javax.swing.JCheckBox cBoxFractura;
    private javax.swing.JCheckBox cBoxFrio;
    private javax.swing.JCheckBox cBoxLocalizado;
    private javax.swing.JCheckBox cBoxNormal;
    private javax.swing.JCheckBox cBoxNormalP;
    private javax.swing.JCheckBox cBoxPercusion;
    private javax.swing.JCheckBox cBoxProvocado;
    private javax.swing.JCheckBox cBoxRarefaccion;
    private javax.swing.JCheckBox cBoxReabsorcion;
    private javax.swing.JCheckBox cBoxRecta;
    private javax.swing.JCheckBox cBoxRetraida;
    private javax.swing.JCheckBox cBoxSinlesion;
    private org.edisoncor.gui.comboBox.ComboBoxRound comboBoxRound1;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private com.toedter.calendar.JDateChooser jDateChooser4;
    private com.toedter.calendar.JDateChooser jDateChooser5;
    private com.toedter.calendar.JDateChooser jDateChooser6;
    private com.toedter.calendar.JDateChooser jDateChooser7;
    private com.toedter.calendar.JDateChooser jDateChooser8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private jtextfieldround.JPasswordFieldRoundBeanInfo jPasswordFieldRoundBeanInfo1;
    private jtextfieldround.JPasswordFieldRoundBeanInfo jPasswordFieldRoundBeanInfo2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextArea jTextArea1;
    private jtextfieldround.JTextFieldRoundBeanInfo jTextFieldRoundBeanInfo1;
    private jtextfieldround.JTextFieldRoundBeanInfo jTextFieldRoundBeanInfo2;
    private org.edisoncor.gui.panel.PanelNice panelNice1;
    private org.edisoncor.gui.panel.PanelNice panelNice2;
    private org.edisoncor.gui.panel.PanelNice panelNice3;
    private org.edisoncor.gui.panel.PanelNice panelNice4;
    private org.edisoncor.gui.panel.PanelNice panelNice5;
    private javax.swing.JPanel panelpaciente;
    private javax.swing.JTextArea txtAObserciones;
    private javax.swing.JTextArea txtAObserciones1;
    private jtextfieldround.JTextFieldRound txtAbo2;
    private jtextfieldround.JTextFieldRound txtAbo3;
    private jtextfieldround.JTextFieldRound txtAbo4;
    private jtextfieldround.JTextFieldRound txtAbo5;
    private jtextfieldround.JTextFieldRound txtAbo6;
    private jtextfieldround.JTextFieldRound txtAbo7;
    private jtextfieldround.JTextFieldRound txtAbo8;
    private javax.swing.JTextField txtAct2;
    private javax.swing.JTextField txtAct3;
    private javax.swing.JTextField txtAct4;
    private javax.swing.JTextField txtAct5;
    private javax.swing.JTextField txtAct6;
    private javax.swing.JTextField txtAct7;
    private javax.swing.JTextField txtAct8;
    private jtextfieldround.JTextFieldRound txtCostoTratEnd;
    private jtextfieldround.JTextFieldRound txtLongitud;
    private jtextfieldround.JTextFieldRound txtNumFicha;
    private jtextfieldround.JTextFieldRound txtNumFicha3;
    private jtextfieldround.JTextFieldRound txtNumFicha4;
    private jtextfieldround.JTextFieldRound txtPronostico;
    private javax.swing.JTextField txtRece2;
    private javax.swing.JTextField txtRece3;
    private javax.swing.JTextField txtRece4;
    private javax.swing.JTextField txtRece5;
    private javax.swing.JTextField txtRece6;
    private javax.swing.JTextField txtRece7;
    private javax.swing.JTextField txtRece8;
    private javax.swing.JTextField txtSaldoSegiTrat;
    // End of variables declaration//GEN-END:variables
}
