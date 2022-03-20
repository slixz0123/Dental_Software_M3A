package View;

import com.toedter.calendar.JDateChooser;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import jtextfieldround.JTextFieldRound;
import org.edisoncor.gui.button.ButtonRound;
import org.edisoncor.gui.panel.PanelNice;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author slix0
 */
public class Vista_Receta extends javax.swing.JInternalFrame {

    /**
     * Creates new form Vista_Anamesis
     */
    public Vista_Receta() {
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

        dialogFarmaco = new javax.swing.JDialog();
        paneldialog = new javax.swing.JPanel();
        txtbuscarfar = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        dialogCIE = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        txtbuscarcie10 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        panelNice1 = new org.edisoncor.gui.panel.PanelNice();
        btncerrar = new org.edisoncor.gui.button.ButtonRound();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jdcFechareceta = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtIDreceta = new jtextfieldround.JTextFieldRound();
        txtBuscarFarmaco = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtIdfamaco = new jtextfieldround.JTextFieldRound();
        txtCie = new jtextfieldround.JTextFieldRound();
        jLabel6 = new javax.swing.JLabel();
        btnBuscarcie = new javax.swing.JButton();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel24 = new javax.swing.JLabel();
        txtdosis = new jtextfieldround.JTextFieldRound();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txtdosis1 = new jtextfieldround.JTextFieldRound();
        jButton1 = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        txtCie1 = new jtextfieldround.JTextFieldRound();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCie2 = new jtextfieldround.JTextFieldRound();
        jButton2 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        btnCrearRec = new javax.swing.JButton();
        btnEditarrec = new javax.swing.JButton();
        btnEliminarrec = new javax.swing.JButton();

        paneldialog.setBackground(new java.awt.Color(90, 166, 166));

        txtbuscarfar.setToolTipText("Ingrese la cedula o el nombre para buscar");

        jLabel12.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Buscar:");

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
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout paneldialogLayout = new javax.swing.GroupLayout(paneldialog);
        paneldialog.setLayout(paneldialogLayout);
        paneldialogLayout.setHorizontalGroup(
            paneldialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneldialogLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtbuscarfar, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(133, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneldialogLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        paneldialogLayout.setVerticalGroup(
            paneldialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneldialogLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(paneldialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbuscarfar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout dialogFarmacoLayout = new javax.swing.GroupLayout(dialogFarmaco.getContentPane());
        dialogFarmaco.getContentPane().setLayout(dialogFarmacoLayout);
        dialogFarmacoLayout.setHorizontalGroup(
            dialogFarmacoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paneldialog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dialogFarmacoLayout.setVerticalGroup(
            dialogFarmacoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paneldialog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(166, 104, 216));

        txtbuscarcie10.setToolTipText("Ingrese la cedula o el nombre para buscar");

        jLabel13.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Buscar:");

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable4);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbuscarcie10, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbuscarcie10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout dialogCIELayout = new javax.swing.GroupLayout(dialogCIE.getContentPane());
        dialogCIE.getContentPane().setLayout(dialogCIELayout);
        dialogCIELayout.setHorizontalGroup(
            dialogCIELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dialogCIELayout.setVerticalGroup(
            dialogCIELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 690));

        panelNice1.setBackground(new java.awt.Color(166, 104, 216));
        panelNice1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btncerrar.setBackground(new java.awt.Color(166, 104, 216));
        btncerrar.setText("Cerrar");
        btncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrarActionPerformed(evt);
            }
        });
        panelNice1.add(btncerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icons/imgReceta.jpg"))); // NOI18N
        panelNice1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 10, 250, 100));

        jLabel20.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Daniela San Martín");
        panelNice1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, -1, -1));

        jLabel21.setBackground(new java.awt.Color(0, 153, 153));
        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(153, 255, 255));
        jLabel21.setText("ODONTOLOGA");
        panelNice1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        jSeparator1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelNice1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1140, 10));
        panelNice1.add(jdcFechareceta, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, 220, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Luis Moscoso 7 y Ricardo Marquez       Celular: 0989726783         Cuenca-Ecuador");
        panelNice1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 570, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Observaciones:");
        panelNice1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 110, 20));
        panelNice1.add(txtIDreceta, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 80, 60, 20));

        txtBuscarFarmaco.setText("Buscar");
        panelNice1.add(txtBuscarFarmaco, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Fecha:");
        panelNice1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, 50, 20));
        panelNice1.add(txtIdfamaco, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 150, 21));
        panelNice1.add(txtCie, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 150, 21));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CIE-10:");
        panelNice1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 70, 20));

        btnBuscarcie.setText("Buscar");
        panelNice1.add(btnBuscarcie, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, -1, -1));
        panelNice1.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 70, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("......");
        panelNice1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 80, 30, 20));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane4.setViewportView(jTextArea1);

        panelNice1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 700, 70));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Cantidad:");
        panelNice1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 70, 20));
        panelNice1.add(txtdosis, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 130, 150, 21));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Frecuencia:");
        panelNice1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 130, 80, 20));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Dosis:");
        panelNice1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, 70, 20));
        panelNice1.add(txtdosis1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 130, 150, 21));

        jButton1.setText("Agregar");
        panelNice1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 180, -1, -1));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Alergias:");
        panelNice1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 350, 80, 20));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane5.setViewportView(jTextArea2);

        panelNice1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 380, 390, 70));
        panelNice1.add(txtCie1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 180, 150, 21));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Categoria");
        panelNice1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 180, 70, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Titulo");
        panelNice1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 50, 20));
        panelNice1.add(txtCie2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 340, 21));

        jButton2.setText("Agregar");
        panelNice1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 130, -1, -1));

        jSeparator2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelNice1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 1130, 20));

        jSeparator3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelNice1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 1130, 20));

        jSeparator4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelNice1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 1130, 20));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Farmaco:");
        panelNice1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 70, 20));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Id Receta");
        panelNice1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 50, 80, 20));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText(".....");
        panelNice1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 140, 20));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Nombre y apellidos");
        panelNice1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 130, 20));

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText(".....");
        panelNice1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 140, 20));

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Cedula");
        panelNice1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 130, 20));

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("......");
        panelNice1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 130, 20));

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Sexo");
        panelNice1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 60, 20));

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("......");
        panelNice1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 60, 20));

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("......");
        panelNice1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 40, 20));

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("......");
        panelNice1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, 40, 20));

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Edad");
        panelNice1.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, 40, 20));

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Años");
        panelNice1.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, 40, 20));

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("Meses");
        panelNice1.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 80, 50, 20));

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Dias");
        panelNice1.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 80, 50, 20));

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("Cedula");
        panelNice1.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 520, 130, 20));

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText(".....");
        panelNice1.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 520, 140, 20));

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("Firma y sello prescriptor");
        panelNice1.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 460, 170, 20));

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText(".....");
        panelNice1.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 490, 140, 20));

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("......");
        panelNice1.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 490, 130, 20));

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("Nombre y apellidos");
        panelNice1.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 490, 130, 20));

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("Datos  del Prescriptor");
        panelNice1.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 460, 170, 20));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane6.setViewportView(jTable2);

        panelNice1.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 700, 110));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane8.setViewportView(jTable3);

        panelNice1.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 230, 390, 110));

        jPanel1.add(panelNice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1150, 600));

        btnCrearRec.setText("Crear");
        jPanel1.add(btnCrearRec, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 620, 160, 40));

        btnEditarrec.setText("Editar");
        jPanel1.add(btnEditarrec, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 620, 160, 40));

        btnEliminarrec.setText("Eliminar");
        jPanel1.add(btnEliminarrec, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 620, 160, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1170, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btncerrarActionPerformed

    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarcie;
    private javax.swing.JButton btnCrearRec;
    private javax.swing.JButton btnEditarrec;
    private javax.swing.JButton btnEliminarrec;
    private org.edisoncor.gui.button.ButtonRound btncerrar;
    private javax.swing.JDialog dialogCIE;
    private javax.swing.JDialog dialogFarmaco;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
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
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    public static com.toedter.calendar.JDateChooser jdcFechareceta;
    private org.edisoncor.gui.panel.PanelNice panelNice1;
    private javax.swing.JPanel paneldialog;
    private javax.swing.JButton txtBuscarFarmaco;
    private jtextfieldround.JTextFieldRound txtCie;
    private jtextfieldround.JTextFieldRound txtCie1;
    private jtextfieldround.JTextFieldRound txtCie2;
    private jtextfieldround.JTextFieldRound txtIDreceta;
    private jtextfieldround.JTextFieldRound txtIdfamaco;
    private javax.swing.JTextField txtbuscarcie10;
    private javax.swing.JTextField txtbuscarfar;
    private jtextfieldround.JTextFieldRound txtdosis;
    private jtextfieldround.JTextFieldRound txtdosis1;
    // End of variables declaration//GEN-END:variables
}
