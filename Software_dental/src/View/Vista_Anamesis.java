package View;

import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import jtextfieldround.JTextFieldRound;
import org.edisoncor.gui.button.ButtonRound;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author slix0
 */
public class Vista_Anamesis extends javax.swing.JInternalFrame {

    /**
     * Creates new form Vista_Anamesis
     */
    public Vista_Anamesis() {
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

        dialogbuscar = new javax.swing.JDialog();
        paneldialog = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbldoctor = new javax.swing.JTable();
        txtbuscardoc = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        dialogpac = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        txtbuscarpac = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblpac = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        panelNice1 = new org.edisoncor.gui.panel.PanelNice();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        dateFechanacEsp = new com.toedter.calendar.JDateChooser();
        txtcedula_pac = new jtextfieldround.JTextFieldRound();
        txtapellidopac = new jtextfieldround.JTextFieldRound();
        txtcorreo = new jtextfieldround.JTextFieldRound();
        txttelefonopac = new jtextfieldround.JTextFieldRound();
        txtdireccion = new jtextfieldround.JTextFieldRound();
        txtprovincia = new jtextfieldround.JTextFieldRound();
        txtciudad = new jtextfieldround.JTextFieldRound();
        txtgeneropac = new jtextfieldround.JTextFieldRound();
        btnbuscarpac = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        btncerrar = new org.edisoncor.gui.button.ButtonRound();
        txtnombrespac = new jtextfieldround.JTextFieldRound();
        panelNice2 = new org.edisoncor.gui.panel.PanelNice();
        lblidanam = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel31 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        txtembarazo = new jtextfieldround.JTextFieldRound();
        txtcedulamed = new jtextfieldround.JTextFieldRound();
        txttelefonomed = new jtextfieldround.JTextFieldRound();
        btnimprimir = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txproblema = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtconsulta = new javax.swing.JTextArea();
        txtespecialidad = new jtextfieldround.JTextFieldRound();
        jLabel34 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnnuevo = new javax.swing.JButton();
        txtnombredoc = new jtextfieldround.JTextFieldRound();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        txtapellidodoc = new jtextfieldround.JTextFieldRound();
        btnbuscardoc = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();

        paneldialog.setBackground(new java.awt.Color(90, 166, 166));

        tbldoctor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cedula", "Nombre", "Apellido", "Especialidad", "Telefono"
            }
        ));
        jScrollPane3.setViewportView(tbldoctor);
        if (tbldoctor.getColumnModel().getColumnCount() > 0) {
            tbldoctor.getColumnModel().getColumn(0).setHeaderValue("Cedula");
            tbldoctor.getColumnModel().getColumn(1).setHeaderValue("Nombre");
            tbldoctor.getColumnModel().getColumn(2).setHeaderValue("Apellido");
            tbldoctor.getColumnModel().getColumn(3).setHeaderValue("Especialidad");
            tbldoctor.getColumnModel().getColumn(4).setHeaderValue("Telefono");
        }

        txtbuscardoc.setToolTipText("Ingrese la cedula o el nombre para buscar");

        jLabel12.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Buscar:");

        javax.swing.GroupLayout paneldialogLayout = new javax.swing.GroupLayout(paneldialog);
        paneldialog.setLayout(paneldialogLayout);
        paneldialogLayout.setHorizontalGroup(
            paneldialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneldialogLayout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtbuscardoc, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133))
            .addGroup(paneldialogLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        paneldialogLayout.setVerticalGroup(
            paneldialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneldialogLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(paneldialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbuscardoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout dialogbuscarLayout = new javax.swing.GroupLayout(dialogbuscar.getContentPane());
        dialogbuscar.getContentPane().setLayout(dialogbuscarLayout);
        dialogbuscarLayout.setHorizontalGroup(
            dialogbuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paneldialog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dialogbuscarLayout.setVerticalGroup(
            dialogbuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paneldialog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(166, 104, 216));

        txtbuscarpac.setToolTipText("Ingrese la cedula o el nombre para buscar");

        jLabel13.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Buscar:");

        tblpac.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(tblpac);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbuscarpac, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbuscarpac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout dialogpacLayout = new javax.swing.GroupLayout(dialogpac.getContentPane());
        dialogpac.getContentPane().setLayout(dialogpacLayout);
        dialogpacLayout.setHorizontalGroup(
            dialogpacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dialogpacLayout.setVerticalGroup(
            dialogpacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelNice1.setBackground(new java.awt.Color(166, 104, 216));
        panelNice1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NOMBRES:");
        panelNice1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel2.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("APELLIDOS:");
        panelNice1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CEDULA:");
        panelNice1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel4.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("GENERO:");
        panelNice1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jLabel5.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("DIRECCION:");
        panelNice1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        jLabel6.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("TELEFONO:");
        panelNice1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        jLabel7.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("CORREO:");
        panelNice1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        jLabel8.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("PROVINCIA:");
        panelNice1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        jLabel9.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("CIUDAD:");
        panelNice1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        jLabel10.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("FECHA DE NACIMIENTO:");
        panelNice1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));
        panelNice1.add(dateFechanacEsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 200, -1));
        panelNice1.add(txtcedula_pac, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 150, 21));

        txtapellidopac.setEditable(false);
        panelNice1.add(txtapellidopac, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 220, 21));

        txtcorreo.setEditable(false);
        panelNice1.add(txtcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 220, 21));

        txttelefonopac.setEditable(false);
        panelNice1.add(txttelefonopac, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 220, 21));

        txtdireccion.setEditable(false);
        panelNice1.add(txtdireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 220, 21));

        txtprovincia.setEditable(false);
        panelNice1.add(txtprovincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 220, 21));

        txtciudad.setEditable(false);
        panelNice1.add(txtciudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 220, 21));

        txtgeneropac.setEditable(false);
        panelNice1.add(txtgeneropac, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 220, 21));

        btnbuscarpac.setText("Buscar");
        panelNice1.add(btnbuscarpac, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, -1, -1));

        jLabel41.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("DATOS DEL PACIENTE");
        panelNice1.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, -1, -1));

        btncerrar.setBackground(new java.awt.Color(166, 104, 216));
        btncerrar.setText("Cerrar");
        panelNice1.add(btncerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        txtnombrespac.setEditable(false);
        panelNice1.add(txtnombrespac, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 220, 21));

        jPanel2.add(panelNice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 410, 460));

        panelNice2.setBackground(new java.awt.Color(90, 166, 166));
        panelNice2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblidanam.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        lblidanam.setForeground(new java.awt.Color(255, 255, 255));
        panelNice2.add(lblidanam, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 570, 80, 30));

        jLabel14.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("ESPECIALIDAD:");
        panelNice2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel32.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Problema Actual:");
        panelNice2.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, -1, -1));

        jLabel16.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Motivo de consulta");
        panelNice2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 280, -1, -1));

        jLabel18.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        panelNice2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, -1, -1));

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        panelNice2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 10, 410));

        jLabel31.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("MEDICO TRATANTE:");
        panelNice2.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel42.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("DATOS DEL MEDICO TRATANTE");
        panelNice2.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jLabel11.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("CEDULA:");
        panelNice2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jLabel43.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("TELEFONO:");
        panelNice2.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));
        panelNice2.add(txtembarazo, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, 210, 21));

        txtcedulamed.setEditable(false);
        panelNice2.add(txtcedulamed, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 170, 21));

        txttelefonomed.setEditable(false);
        panelNice2.add(txttelefonomed, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 170, 21));

        btnimprimir.setText("Imprimir");
        panelNice2.add(btnimprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 480, 200, 50));

        btnguardar.setText("Guardar");
        panelNice2.add(btnguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 210, 50));

        txproblema.setColumns(20);
        txproblema.setRows(5);
        jScrollPane1.setViewportView(txproblema);

        panelNice2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 320, 130));

        txtconsulta.setColumns(20);
        txtconsulta.setRows(5);
        jScrollPane2.setViewportView(txtconsulta);

        panelNice2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, 320, 130));

        txtespecialidad.setEditable(false);
        panelNice2.add(txtespecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 170, 21));

        jLabel34.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("EMBARAZO");
        panelNice2.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, -1, -1));

        jLabel15.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("DATOS DEL ANAMESIS");
        panelNice2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, -1, -1));

        btnnuevo.setText("Nuevo");
        panelNice2.add(btnnuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 480, 210, 50));

        txtnombredoc.setEditable(false);
        panelNice2.add(txtnombredoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 170, 21));

        jLabel44.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("NOMBRES:");
        panelNice2.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel45.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("APELLIDOS:");
        panelNice2.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        txtapellidodoc.setEditable(false);
        panelNice2.add(txtapellidodoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 170, 21));

        btnbuscardoc.setText("Buscar");
        panelNice2.add(btnbuscardoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 90, -1));

        jPanel2.add(panelNice2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 690, 630));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icons/LOGO DENTAL daniela san martin -1_opt (2).png"))); // NOI18N
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 420, 150));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 690));

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

    public JPanel getPaneldialog() {
        return paneldialog;
    }

    public void setPaneldialog(JPanel paneldialog) {
        this.paneldialog = paneldialog;
    }

    public JDialog getDialogpac() {
        return dialogpac;
    }

    public void setDialogpac(JDialog dialogpac) {
        this.dialogpac = dialogpac;
    }

    public JTable getTblpac() {
        return tblpac;
    }

    public void setTblpac(JTable tblpac) {
        this.tblpac = tblpac;
    }

    public JTextField getTxtbuscarpac() {
        return txtbuscarpac;
    }

    public void setTxtbuscarpac(JTextField txtbuscarpac) {
        this.txtbuscarpac = txtbuscarpac;
    }

    public JButton getBtnbuscardoc() {
        return btnbuscardoc;
    }

    public void setBtnbuscardoc(JButton btnbuscardoc) {
        this.btnbuscardoc = btnbuscardoc;
    }

    public JButton getBtnbuscarpac() {
        return btnbuscarpac;
    }

    public void setBtnbuscarpac(JButton btnbuscarpac) {
        this.btnbuscarpac = btnbuscarpac;
    }

    public ButtonRound getBtncerrar() {
        return btncerrar;
    }

    public void setBtncerrar(ButtonRound btncerrar) {
        this.btncerrar = btncerrar;
    }

    public JButton getBtnguardar() {
        return btnguardar;
    }

    public void setBtnguardar(JButton btnguardar) {
        this.btnguardar = btnguardar;
    }

    public JButton getBtnimprimir() {
        return btnimprimir;
    }

    public void setBtnimprimir(JButton btnimprimir) {
        this.btnimprimir = btnimprimir;
    }

    public JButton getBtnnuevo() {
        return btnnuevo;
    }

    public void setBtnnuevo(JButton btnnuevo) {
        this.btnnuevo = btnnuevo;
    }

    public JDateChooser getDateFechanacEsp() {
        return dateFechanacEsp;
    }

    public void setDateFechanacEsp(JDateChooser dateFechanacEsp) {
        this.dateFechanacEsp = dateFechanacEsp;
    }

    public JDialog getDialogbuscar() {
        return dialogbuscar;
    }

    public void setDialogbuscar(JDialog dialogbuscar) {
        this.dialogbuscar = dialogbuscar;
    }

    public JLabel getLblidanam() {
        return lblidanam;
    }

    public void setLblidanam(JLabel lblidanam) {
        this.lblidanam = lblidanam;
    }

    public JTable getTbldoctor() {
        return tbldoctor;
    }

    public void setTbldoctor(JTable tbldoctor) {
        this.tbldoctor = tbldoctor;
    }

    public JTextArea getTxproblema() {
        return txproblema;
    }

    public void setTxproblema(JTextArea txproblema) {
        this.txproblema = txproblema;
    }

    public JTextFieldRound getTxtapellidodoc() {
        return txtapellidodoc;
    }

    public void setTxtapellidodoc(JTextFieldRound txtapellidodoc) {
        this.txtapellidodoc = txtapellidodoc;
    }

    public JTextFieldRound getTxtapellidopac() {
        return txtapellidopac;
    }

    public void setTxtapellidopac(JTextFieldRound txtapellidopac) {
        this.txtapellidopac = txtapellidopac;
    }

    public JTextField getTxtbuscardoc() {
        return txtbuscardoc;
    }

    public void setTxtbuscardoc(JTextField txtbuscardoc) {
        this.txtbuscardoc = txtbuscardoc;
    }

    public JTextFieldRound getTxtcedula_pac() {
        return txtcedula_pac;
    }

    public void setTxtcedula_pac(JTextFieldRound txtcedula_pac) {
        this.txtcedula_pac = txtcedula_pac;
    }

    public JTextFieldRound getTxtcedulamed() {
        return txtcedulamed;
    }

    public void setTxtcedulamed(JTextFieldRound txtcedulamed) {
        this.txtcedulamed = txtcedulamed;
    }

    public JTextFieldRound getTxtciudad() {
        return txtciudad;
    }

    public void setTxtciudad(JTextFieldRound txtciudad) {
        this.txtciudad = txtciudad;
    }

    public JTextArea getTxtconsulta() {
        return txtconsulta;
    }

    public void setTxtconsulta(JTextArea txtconsulta) {
        this.txtconsulta = txtconsulta;
    }

    public JTextFieldRound getTxtcorreo() {
        return txtcorreo;
    }

    public void setTxtcorreo(JTextFieldRound txtcorreo) {
        this.txtcorreo = txtcorreo;
    }

    public JTextFieldRound getTxtdireccion() {
        return txtdireccion;
    }

    public void setTxtdireccion(JTextFieldRound txtdireccion) {
        this.txtdireccion = txtdireccion;
    }

    public JTextFieldRound getTxtembarazo() {
        return txtembarazo;
    }

    public void setTxtembarazo(JTextFieldRound txtembarazo) {
        this.txtembarazo = txtembarazo;
    }

    public JTextFieldRound getTxtespecialidad() {
        return txtespecialidad;
    }

    public void setTxtespecialidad(JTextFieldRound txtespecialidad) {
        this.txtespecialidad = txtespecialidad;
    }

    public JTextFieldRound getTxtgeneropac() {
        return txtgeneropac;
    }

    public void setTxtgeneropac(JTextFieldRound txtgeneropac) {
        this.txtgeneropac = txtgeneropac;
    }

    public JTextFieldRound getTxtnombredoc() {
        return txtnombredoc;
    }

    public void setTxtnombredoc(JTextFieldRound txtnombredoc) {
        this.txtnombredoc = txtnombredoc;
    }

    public JTextFieldRound getTxtnombrespac() {
        return txtnombrespac;
    }

    public void setTxtnombrespac(JTextFieldRound txtnombrespac) {
        this.txtnombrespac = txtnombrespac;
    }

    public JTextFieldRound getTxtprovincia() {
        return txtprovincia;
    }

    public void setTxtprovincia(JTextFieldRound txtprovincia) {
        this.txtprovincia = txtprovincia;
    }

    public JTextFieldRound getTxttelefonomed() {
        return txttelefonomed;
    }

    public void setTxttelefonomed(JTextFieldRound txttelefonomed) {
        this.txttelefonomed = txttelefonomed;
    }

    public JTextFieldRound getTxttelefonopac() {
        return txttelefonopac;
    }

    public void setTxttelefonopac(JTextFieldRound txttelefonopac) {
        this.txttelefonopac = txttelefonopac;
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscardoc;
    private javax.swing.JButton btnbuscarpac;
    private org.edisoncor.gui.button.ButtonRound btncerrar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnimprimir;
    private javax.swing.JButton btnnuevo;
    private com.toedter.calendar.JDateChooser dateFechanacEsp;
    private javax.swing.JDialog dialogbuscar;
    private javax.swing.JDialog dialogpac;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblidanam;
    private org.edisoncor.gui.panel.PanelNice panelNice1;
    private org.edisoncor.gui.panel.PanelNice panelNice2;
    private javax.swing.JPanel paneldialog;
    private javax.swing.JTable tbldoctor;
    private javax.swing.JTable tblpac;
    private javax.swing.JTextArea txproblema;
    private jtextfieldround.JTextFieldRound txtapellidodoc;
    private jtextfieldround.JTextFieldRound txtapellidopac;
    private javax.swing.JTextField txtbuscardoc;
    private javax.swing.JTextField txtbuscarpac;
    private jtextfieldround.JTextFieldRound txtcedula_pac;
    private jtextfieldround.JTextFieldRound txtcedulamed;
    private jtextfieldround.JTextFieldRound txtciudad;
    private javax.swing.JTextArea txtconsulta;
    private jtextfieldround.JTextFieldRound txtcorreo;
    private jtextfieldround.JTextFieldRound txtdireccion;
    private jtextfieldround.JTextFieldRound txtembarazo;
    private jtextfieldround.JTextFieldRound txtespecialidad;
    private jtextfieldround.JTextFieldRound txtgeneropac;
    private jtextfieldround.JTextFieldRound txtnombredoc;
    private jtextfieldround.JTextFieldRound txtnombrespac;
    private jtextfieldround.JTextFieldRound txtprovincia;
    private jtextfieldround.JTextFieldRound txttelefonomed;
    private jtextfieldround.JTextFieldRound txttelefonopac;
    // End of variables declaration//GEN-END:variables
}
