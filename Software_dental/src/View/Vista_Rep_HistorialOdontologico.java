/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextArea;
import jtextfieldround.JTextFieldRound;

/**
 *
 * @author slix0
 */
public class Vista_Rep_HistorialOdontologico extends javax.swing.JInternalFrame {

    /**
     * Creates new form Vista_Rep_HistorialOdontologico
     */
    public Vista_Rep_HistorialOdontologico() {
        initComponents();
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
        btnLimpiar = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        txtenfermedad = new jtextfieldround.JTextFieldRound();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtfumbebe = new jtextfieldround.JTextFieldRound();
        jLabel22 = new javax.swing.JLabel();
        txtproblemascar = new jtextfieldround.JTextFieldRound();
        jLabel23 = new javax.swing.JLabel();
        txtulcera = new jtextfieldround.JTextFieldRound();
        jLabel24 = new javax.swing.JLabel();
        txtpresion = new jtextfieldround.JTextFieldRound();
        jLabel25 = new javax.swing.JLabel();
        txthepatitis = new jtextfieldround.JTextFieldRound();
        jLabel26 = new javax.swing.JLabel();
        txtdiabetes = new jtextfieldround.JTextFieldRound();
        jLabel27 = new javax.swing.JLabel();
        txtepilepsia = new jtextfieldround.JTextFieldRound();
        jLabel29 = new javax.swing.JLabel();
        txtdolorescab = new jtextfieldround.JTextFieldRound();
        jLabel28 = new javax.swing.JLabel();
        txtaltend = new jtextfieldround.JTextFieldRound();
        jLabel30 = new javax.swing.JLabel();
        txtvih = new jtextfieldround.JTextFieldRound();
        jLabel39 = new javax.swing.JLabel();
        txtprobcoag = new jtextfieldround.JTextFieldRound();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablahistorial = new javax.swing.JTable();
        btnCargarDatos = new javax.swing.JButton();
        txtfrecres = new jtextfieldround.JTextFieldRound();
        jLabel36 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        txtfreccar = new jtextfieldround.JTextFieldRound();
        txtpresart = new jtextfieldround.JTextFieldRound();
        jLabel37 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        txttemp = new jtextfieldround.JTextFieldRound();
        txtoxi = new jtextfieldround.JTextFieldRound();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtantecedentes = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txttratamiento = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtalergia = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtmedicamento = new javax.swing.JTextArea();
        btnImprimir = new javax.swing.JButton();


        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        setBackground(new java.awt.Color(255, 255, 255));
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelNice2.setBackground(new java.awt.Color(166, 104, 216));
        panelNice2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("SF Pro Display", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Reporte Historial Medico");
        panelNice2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, -1, -1));

        btnLimpiar.setText("Limpiar");
        panelNice2.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 570, 130, 50));

        jLabel32.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Enfermedad Actual");
        panelNice2.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 140, -1, -1));

        txtenfermedad.setEditable(false);
        panelNice2.add(txtenfermedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 140, 370, 21));

        jLabel16.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Antecedentes familiares:");
        panelNice2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, -1));

        jLabel18.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Tratamiento medico:");
        panelNice2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, -1, -1));

        jLabel19.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Alergia Medicamentos:");
        panelNice2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 390, -1, -1));

        jLabel20.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Medicamentos Habituales: ");
        panelNice2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 480, -1, -1));

        jLabel21.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Fuma o Bebe");
        panelNice2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, -1, -1));

        txtfumbebe.setEditable(false);
        panelNice2.add(txtfumbebe, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 110, 21));

        jLabel22.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Problemas Cardiacos");
        panelNice2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 170, -1, -1));

        txtproblemascar.setEditable(false);
        panelNice2.add(txtproblemascar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 170, 370, 21));

        jLabel23.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Ulcera Gastrica");
        panelNice2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 200, -1, -1));

        txtulcera.setEditable(false);
        panelNice2.add(txtulcera, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 200, 370, 21));

        jLabel24.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Presion");
        panelNice2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, -1, -1));

        txtpresion.setEditable(false);
        panelNice2.add(txtpresion, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 110, 21));

        jLabel25.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Hepatitis");
        panelNice2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, -1, -1));

        txthepatitis.setEditable(false);
        panelNice2.add(txthepatitis, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 110, 21));

        jLabel26.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Diabetes");
        panelNice2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, -1, -1));

        txtdiabetes.setEditable(false);
        panelNice2.add(txtdiabetes, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 110, 21));

        jLabel27.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Epilepsia");
        panelNice2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 80, -1, -1));

        txtepilepsia.setEditable(false);
        panelNice2.add(txtepilepsia, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, 370, 21));

        jLabel29.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Dolores de cabeza");
        panelNice2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 110, -1, -1));

        txtdolorescab.setEditable(false);
        panelNice2.add(txtdolorescab, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 110, 370, 21));

        jLabel28.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Alteracion Endocrina");
        panelNice2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 50, -1, -1));

        txtaltend.setEditable(false);
        panelNice2.add(txtaltend, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 50, 370, 21));

        jLabel30.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("VIH");
        panelNice2.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, -1, -1));

        txtvih.setEditable(false);
        panelNice2.add(txtvih, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 110, 21));

        jLabel39.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Problemas Coagulacion");
        panelNice2.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 230, -1, -1));

        txtprobcoag.setEditable(false);
        panelNice2.add(txtprobcoag, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 230, 370, 21));

        tablahistorial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Fecha Atencion", "Hora"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablahistorial);
        if (tablahistorial.getColumnModel().getColumnCount() > 0) {
            tablahistorial.getColumnModel().getColumn(0).setMinWidth(30);
            tablahistorial.getColumnModel().getColumn(0).setPreferredWidth(30);
            tablahistorial.getColumnModel().getColumn(0).setMaxWidth(30);
            tablahistorial.getColumnModel().getColumn(1).setMinWidth(150);
            tablahistorial.getColumnModel().getColumn(1).setPreferredWidth(150);
            tablahistorial.getColumnModel().getColumn(1).setMaxWidth(150);
            tablahistorial.getColumnModel().getColumn(2).setMinWidth(90);
            tablahistorial.getColumnModel().getColumn(2).setPreferredWidth(90);
            tablahistorial.getColumnModel().getColumn(2).setMaxWidth(90);
        }

        panelNice2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 270, 310));

        btnCargarDatos.setText("Cargar Datos");
        panelNice2.add(btnCargarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        txtfrecres.setEditable(false);
        panelNice2.add(txtfrecres, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 110, 21));

        jLabel36.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("<html>Frecuencia Respiratoria<p>x min<html>");
        panelNice2.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, -1, -1));

        jLabel34.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("<html>Frecuencia Cardiaca<p>x min <html>");
        panelNice2.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, -1, 30));

        txtfreccar.setEditable(false);
        panelNice2.add(txtfreccar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 110, 21));

        txtpresart.setEditable(false);
        panelNice2.add(txtpresart, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 110, 21));

        jLabel37.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Presion Arterial");
        panelNice2.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, -1, -1));

        jLabel35.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Temperatura");
        panelNice2.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 310, -1, -1));

        txttemp.setEditable(false);
        panelNice2.add(txttemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 110, 21));

        txtoxi.setEditable(false);
        panelNice2.add(txtoxi, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, 110, 21));

        jLabel15.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Oximetria");
        panelNice2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, -1, -1));

        txtantecedentes.setEditable(false);
        txtantecedentes.setColumns(20);
        txtantecedentes.setLineWrap(true);
        txtantecedentes.setRows(5);
        txtantecedentes.setWrapStyleWord(true);
        jScrollPane2.setViewportView(txtantecedentes);

        panelNice2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 300, -1));

        txttratamiento.setEditable(false);
        txttratamiento.setColumns(20);
        txttratamiento.setLineWrap(true);
        txttratamiento.setRows(5);
        txttratamiento.setWrapStyleWord(true);
        jScrollPane3.setViewportView(txttratamiento);

        panelNice2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 480, 300, -1));

        txtalergia.setEditable(false);
        txtalergia.setColumns(20);
        txtalergia.setLineWrap(true);
        txtalergia.setRows(5);
        txtalergia.setWrapStyleWord(true);
        txtalergia.setMinimumSize(new java.awt.Dimension(164, 18));
        jScrollPane4.setViewportView(txtalergia);

        panelNice2.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 390, 300, -1));

        txtmedicamento.setEditable(false);
        txtmedicamento.setColumns(20);
        txtmedicamento.setRows(5);
        jScrollPane5.setViewportView(txtmedicamento);

        panelNice2.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 480, 300, -1));

        btnImprimir.setText("Imprimir");
        panelNice2.add(btnImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 570, 130, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelNice2, javax.swing.GroupLayout.PREFERRED_SIZE, 1126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelNice2, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JButton getBtnCargarDatos() {
        return btnCargarDatos;
    }

    public void setBtnCargarDatos(JButton btnCargarDatos) {
        this.btnCargarDatos = btnCargarDatos;
    }

    public JButton getBtnImprimir() {
        return btnImprimir;
    }

    public void setBtnImprimir(JButton btnImprimir) {
        this.btnImprimir = btnImprimir;
    }

    public JButton getBtnLimpiar() {
        return btnLimpiar;
    }

    public void setBtnLimpiar(JButton btnLimpiar) {
        this.btnLimpiar = btnLimpiar;
    }

   
    public JTable getTablahistorial() {
        return tablahistorial;
    }

    public void setTablahistorial(JTable tablahistorial) {
        this.tablahistorial = tablahistorial;
    }

    public JTextArea getTxtalergia() {
        return txtalergia;
    }

    public void setTxtalergia(JTextArea txtalergia) {
        this.txtalergia = txtalergia;
    }

    public JTextFieldRound getTxtaltend() {
        return txtaltend;
    }

    public void setTxtaltend(JTextFieldRound txtaltend) {
        this.txtaltend = txtaltend;
    }

    public JTextFieldRound getTxtdiabetes() {
        return txtdiabetes;
    }

    public void setTxtdiabetes(JTextFieldRound txtdiabetes) {
        this.txtdiabetes = txtdiabetes;
    }

    public JTextFieldRound getTxtdolorescab() {
        return txtdolorescab;
    }

    public void setTxtdolorescab(JTextFieldRound txtdolorescab) {
        this.txtdolorescab = txtdolorescab;
    }

    public JTextFieldRound getTxtenfermedad() {
        return txtenfermedad;
    }

    public void setTxtenfermedad(JTextFieldRound txtenfermedad) {
        this.txtenfermedad = txtenfermedad;
    }

    public JTextFieldRound getTxtepilepsia() {
        return txtepilepsia;
    }

    public void setTxtepilepsia(JTextFieldRound txtepilepsia) {
        this.txtepilepsia = txtepilepsia;
    }

    public JTextFieldRound getTxtfreccar() {
        return txtfreccar;
    }

    public void setTxtfreccar(JTextFieldRound txtfreccar) {
        this.txtfreccar = txtfreccar;
    }

    public JTextFieldRound getTxtfrecres() {
        return txtfrecres;
    }

    public void setTxtfrecres(JTextFieldRound txtfrecres) {
        this.txtfrecres = txtfrecres;
    }

    public JTextFieldRound getTxtfumbebe() {
        return txtfumbebe;
    }

    public void setTxtfumbebe(JTextFieldRound txtfumbebe) {
        this.txtfumbebe = txtfumbebe;
    }

    public JTextFieldRound getTxthepatitis() {
        return txthepatitis;
    }

    public void setTxthepatitis(JTextFieldRound txthepatitis) {
        this.txthepatitis = txthepatitis;
    }

    public JTextArea getTxtmedicamento() {
        return txtmedicamento;
    }

    public void setTxtmedicamento(JTextArea txtmedicamento) {
        this.txtmedicamento = txtmedicamento;
    }

    public JTextFieldRound getTxtoxi() {
        return txtoxi;
    }

    public void setTxtoxi(JTextFieldRound txtoxi) {
        this.txtoxi = txtoxi;
    }

    public JTextFieldRound getTxtpresart() {
        return txtpresart;
    }

    public void setTxtpresart(JTextFieldRound txtpresart) {
        this.txtpresart = txtpresart;
    }

    public JTextFieldRound getTxtpresion() {
        return txtpresion;
    }

    public void setTxtpresion(JTextFieldRound txtpresion) {
        this.txtpresion = txtpresion;
    }

    public JTextFieldRound getTxtprobcoag() {
        return txtprobcoag;
    }

    public void setTxtprobcoag(JTextFieldRound txtprobcoag) {
        this.txtprobcoag = txtprobcoag;
    }

    public JTextFieldRound getTxtproblemascar() {
        return txtproblemascar;
    }

    public void setTxtproblemascar(JTextFieldRound txtproblemascar) {
        this.txtproblemascar = txtproblemascar;
    }

    public JTextFieldRound getTxttemp() {
        return txttemp;
    }

    public void setTxttemp(JTextFieldRound txttemp) {
        this.txttemp = txttemp;
    }

    public JTextFieldRound getTxtulcera() {
        return txtulcera;
    }

    public void setTxtulcera(JTextFieldRound txtulcera) {
        this.txtulcera = txtulcera;
    }

    public JTextFieldRound getTxtvih() {
        return txtvih;
    }

    public void setTxtvih(JTextFieldRound txtvih) {
        this.txtvih = txtvih;
    }

    public JTextArea getTxtantecedentes() {
        return txtantecedentes;
    }

    public void setTxtantecedentes(JTextArea txtantecedentes) {
        this.txtantecedentes = txtantecedentes;
    }

    public JTextArea getTxttratamiento() {
        return txttratamiento;
    }

    public void setTxttratamiento(JTextArea txttratamiento) {
        this.txttratamiento = txttratamiento;
    }

   
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargarDatos;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
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
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private org.edisoncor.gui.panel.PanelNice panelNice2;
    private javax.swing.JTable tablahistorial;
    private javax.swing.JTextArea txtalergia;
    private jtextfieldround.JTextFieldRound txtaltend;
    private javax.swing.JTextArea txtantecedentes;
    private jtextfieldround.JTextFieldRound txtdiabetes;
    private jtextfieldround.JTextFieldRound txtdolorescab;
    private jtextfieldround.JTextFieldRound txtenfermedad;
    private jtextfieldround.JTextFieldRound txtepilepsia;
    private jtextfieldround.JTextFieldRound txtfreccar;
    private jtextfieldround.JTextFieldRound txtfrecres;
    private jtextfieldround.JTextFieldRound txtfumbebe;
    private jtextfieldround.JTextFieldRound txthepatitis;
    private javax.swing.JTextArea txtmedicamento;
    private jtextfieldround.JTextFieldRound txtoxi;
    private jtextfieldround.JTextFieldRound txtpresart;
    private jtextfieldround.JTextFieldRound txtpresion;
    private jtextfieldround.JTextFieldRound txtprobcoag;
    private jtextfieldround.JTextFieldRound txtproblemascar;
    private jtextfieldround.JTextFieldRound txttemp;
    private javax.swing.JTextArea txttratamiento;
    private jtextfieldround.JTextFieldRound txtulcera;
    private jtextfieldround.JTextFieldRound txtvih;
    // End of variables declaration//GEN-END:variables
}
