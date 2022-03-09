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
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        txtCostoTratEnd = new jtextfieldround.JTextFieldRound();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jDateChooser4 = new com.toedter.calendar.JDateChooser();
        jDateChooser5 = new com.toedter.calendar.JDateChooser();
        jDateChooser6 = new com.toedter.calendar.JDateChooser();
        jDateChooser7 = new com.toedter.calendar.JDateChooser();
        jDateChooser8 = new com.toedter.calendar.JDateChooser();
        jLabel27 = new javax.swing.JLabel();
        txtAct2 = new javax.swing.JTextField();
        txtAct3 = new javax.swing.JTextField();
        txtAct4 = new javax.swing.JTextField();
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
        txtRece7 = new javax.swing.JTextField();
        txtRece8 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        txtAbo2 = new jtextfieldround.JTextFieldRound();
        txtAbo3 = new jtextfieldround.JTextFieldRound();
        txtAbo4 = new jtextfieldround.JTextFieldRound();
        txtAbo5 = new jtextfieldround.JTextFieldRound();
        txtAbo6 = new jtextfieldround.JTextFieldRound();
        txtAbo7 = new jtextfieldround.JTextFieldRound();
        txtAbo8 = new jtextfieldround.JTextFieldRound();
        jLabel30 = new javax.swing.JLabel();
        txtSaldoSegiTrat = new javax.swing.JTextField();
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNice1Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 748, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(panelNice1Layout.createSequentialGroup()
                .addGap(333, 333, 333)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelNice1Layout.setVerticalGroup(
            panelNice1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNice1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel3.add(panelNice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 810, 330));

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
                        .addGap(26, 26, 26)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelNice2Layout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(jLabel12)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        panelNice2Layout.setVerticalGroup(
            panelNice2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNice2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel3.add(panelNice2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 810, 300));

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

        javax.swing.GroupLayout panelNice5Layout = new javax.swing.GroupLayout(panelNice5);
        panelNice5.setLayout(panelNice5Layout);
        panelNice5Layout.setHorizontalGroup(
            panelNice5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNice5Layout.createSequentialGroup()
                .addGroup(panelNice5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelNice5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelNice5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelNice5Layout.createSequentialGroup()
                                .addGap(129, 129, 129)
                                .addComponent(jLabel19))
                            .addGroup(panelNice5Layout.createSequentialGroup()
                                .addGap(135, 135, 135)
                                .addComponent(jLabel23))
                            .addGroup(panelNice5Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(txtPronostico, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelNice5Layout.createSequentialGroup()
                                .addGap(143, 143, 143)
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelNice5Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(txtLongitud, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelNice5Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(panelNice5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(panelNice5Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(btnPdf, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelNice5Layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jLabel20))
                    .addGroup(panelNice5Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        panelNice5Layout.setVerticalGroup(
            panelNice5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNice5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(txtLongitud, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPronostico, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(btnPdf, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.add(panelNice5, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 70, 360, 640));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1279, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1830, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 10, -1, 1830));

        jTabbedPane2.addTab("DIAGNOSTICO ENDOCRINO Y REDIPGRAFICO", jPanel3);

        jLabel24.setText("COSTO DE TRATAMIENTO DE ENDODONCIA:");

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setText("TRATAMIENTO");

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel26.setText("FECHA");

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel27.setText("ACTIVIDAD");

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel28.setText("RECETA");

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel29.setText("ABONO");

        jLabel30.setText("SALDO:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCostoTratEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(565, 565, 565)
                        .addComponent(jLabel25)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel30)
                        .addGap(18, 18, 18)
                        .addComponent(txtSaldoSegiTrat, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jDateChooser8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                .addComponent(jDateChooser7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jDateChooser6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jDateChooser5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jDateChooser4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jDateChooser3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jDateChooser2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel27)
                                    .addComponent(txtAct5)
                                    .addComponent(txtAct6)
                                    .addComponent(txtAct7)
                                    .addComponent(txtAct8, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                                    .addComponent(txtAct4))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtAct3)
                            .addComponent(txtAct2))
                        .addGap(72, 72, 72)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel28)
                            .addComponent(txtRece2, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                            .addComponent(txtRece3)
                            .addComponent(txtRece4)
                            .addComponent(txtRece5)
                            .addComponent(txtRece6)
                            .addComponent(txtRece7)
                            .addComponent(txtRece8))
                        .addGap(88, 88, 88)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29)
                            .addComponent(txtAbo2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAbo3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAbo4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAbo5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAbo6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAbo7, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAbo8, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(296, 296, 296))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(txtCostoTratEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel25)
                .addGap(38, 38, 38)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(jLabel27)
                            .addComponent(jLabel28)
                            .addComponent(jLabel29))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtAct2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtRece2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtAbo2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAct3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRece3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAbo3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAct4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRece4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAbo4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jDateChooser5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAct5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jDateChooser6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtRece5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAbo5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtRece6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAbo6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(txtAct6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooser7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAct7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRece7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAbo7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooser8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAct8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRece8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAbo8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(txtSaldoSegiTrat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("SEGUIMIENTO Y TRATAMIENTO", jPanel4);

        javax.swing.GroupLayout panelpacienteLayout = new javax.swing.GroupLayout(panelpaciente);
        panelpaciente.setLayout(panelpacienteLayout);
        panelpacienteLayout.setHorizontalGroup(
            panelpacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1209, Short.MAX_VALUE)
        );
        panelpacienteLayout.setVerticalGroup(
            panelpacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 714, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("tab3", panelpaciente);

        jPanel1.add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1230, 760));

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
