package View;

import com.toedter.calendar.JDateChooser;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
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
//    Calendar fechaactual=new GregorianCalendar();
    /**
     * Creates new form Vista_Anamesis
     */
    public Vista_Receta() {
        initComponents();
//        jdcFechanaciento.setCalendar(fechaactual);
    }
    
    public void fecha(){
        
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
        jScrollPane3 = new javax.swing.JScrollPane();
        tblbuscarFarmacos = new javax.swing.JTable();
        dialogCIE = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        txtbuscarcie10 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblbuscarcie10 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        panelNice1 = new org.edisoncor.gui.panel.PanelNice();
        btncerrar = new org.edisoncor.gui.button.ButtonRound();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jdcFechanaciento = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtIDreceta = new jtextfieldround.JTextFieldRound();
        btnbuscarfarmaco = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtIdfamaco = new jtextfieldround.JTextFieldRound();
        txtCie = new jtextfieldround.JTextFieldRound();
        jLabel6 = new javax.swing.JLabel();
        btnBuscarcie = new javax.swing.JButton();
        spcantidad = new javax.swing.JSpinner();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtobservaciones = new javax.swing.JTextArea();
        jLabel24 = new javax.swing.JLabel();
        txtfrecuencia = new jtextfieldround.JTextFieldRound();
        jLabel25 = new javax.swing.JLabel();
        btnagregarcie = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtalergias = new javax.swing.JTextArea();
        txtCie1 = new jtextfieldround.JTextFieldRound();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txttitulo = new jtextfieldround.JTextFieldRound();
        btnagregardatos = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtcedula = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        txtsexo = new javax.swing.JLabel();
        txtedad = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblreceta = new javax.swing.JTable();
        jScrollPane8 = new javax.swing.JScrollPane();
        tblcie10 = new javax.swing.JTable();
        jLabel29 = new javax.swing.JLabel();
        txtmiligramos = new jtextfieldround.JTextFieldRound();
        btncargardatos = new javax.swing.JButton();
        id_rec_cie = new javax.swing.JLabel();
        id_rec_far = new javax.swing.JLabel();
        btnCrearRec = new javax.swing.JButton();
        btnEditarrec = new javax.swing.JButton();
        btnEliminarrec = new javax.swing.JButton();
        lblfecha = new javax.swing.JLabel();

        paneldialog.setBackground(new java.awt.Color(90, 166, 166));

        txtbuscarfar.setToolTipText("Ingrese el nombre para buscar");

        jLabel12.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Buscar:");

        tblbuscarFarmacos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOMBRE", "MILIGRAMOS"
            }
        ));
        jScrollPane3.setViewportView(tblbuscarFarmacos);

        javax.swing.GroupLayout paneldialogLayout = new javax.swing.GroupLayout(paneldialog);
        paneldialog.setLayout(paneldialogLayout);
        paneldialogLayout.setHorizontalGroup(
            paneldialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneldialogLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtbuscarfar, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneldialogLayout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        paneldialogLayout.setVerticalGroup(
            paneldialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneldialogLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(paneldialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbuscarfar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
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

        txtbuscarcie10.setToolTipText("Ingrese el id, la categoria  o el titulo para buscar");

        jLabel13.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Buscar:");

        tblbuscarcie10.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "CATEGORIA", "TITULO"
            }
        ));
        jScrollPane2.setViewportView(tblbuscarcie10);

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
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
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

        jdcFechanaciento.setDateFormatString("yyyy-MM-dd");
        panelNice1.add(jdcFechanaciento, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, 220, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Luis Moscoso 7 y Ricardo Marquez       Celular: 0989726783         Cuenca-Ecuador");
        panelNice1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 570, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Observaciones:");
        panelNice1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 110, 20));
        panelNice1.add(txtIDreceta, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 80, 60, 20));

        btnbuscarfarmaco.setText("Buscar");
        panelNice1.add(btnbuscarfarmaco, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Fecha:");
        panelNice1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, 50, 20));
        panelNice1.add(txtIdfamaco, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 150, 21));
        panelNice1.add(txtCie, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 150, 21));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CIE-10:");
        panelNice1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 70, 20));

        btnBuscarcie.setText("Buscar");
        panelNice1.add(btnBuscarcie, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, -1, -1));
        panelNice1.add(spcantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 130, 140, -1));

        txtobservaciones.setColumns(20);
        txtobservaciones.setRows(5);
        jScrollPane4.setViewportView(txtobservaciones);

        panelNice1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 700, 70));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Dosis:");
        panelNice1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 80, 20));
        panelNice1.add(txtfrecuencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 130, 90, 21));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Frecuencia:");
        panelNice1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 130, 80, 20));

        btnagregarcie.setText("Agregar");
        panelNice1.add(btnagregarcie, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 180, -1, -1));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Alergias:");
        panelNice1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 350, 80, 20));

        txtalergias.setColumns(20);
        txtalergias.setRows(5);
        jScrollPane5.setViewportView(txtalergias);

        panelNice1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 380, 390, 70));
        panelNice1.add(txtCie1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 150, 21));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Categoria:");
        panelNice1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 70, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Titulo:");
        panelNice1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 180, 50, 20));
        panelNice1.add(txttitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 180, 340, 21));

        btnagregardatos.setText("Agregar");
        panelNice1.add(btnagregardatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 130, -1, -1));

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
        jLabel22.setText("Id Receta:");
        panelNice1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 50, 80, 20));

        txtcedula.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtcedula.setForeground(new java.awt.Color(255, 255, 255));
        txtcedula.setText(".....");
        panelNice1.add(txtcedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 130, 20));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Nombres y apellidos:");
        panelNice1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 140, 20));

        txtnombre.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtnombre.setForeground(new java.awt.Color(255, 255, 255));
        txtnombre.setText(".....");
        panelNice1.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 130, 20));

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Cedula:");
        panelNice1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 130, 20));

        txtApellido.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtApellido.setForeground(new java.awt.Color(255, 255, 255));
        txtApellido.setText("......");
        panelNice1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 130, 20));

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Sexo:");
        panelNice1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 60, 20));

        txtsexo.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtsexo.setForeground(new java.awt.Color(255, 255, 255));
        txtsexo.setText("......");
        panelNice1.add(txtsexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 60, 20));

        txtedad.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtedad.setForeground(new java.awt.Color(255, 255, 255));
        txtedad.setText("......");
        panelNice1.add(txtedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, 240, 20));

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Edad:");
        panelNice1.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, 40, 20));

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

        tblreceta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DETALLE", "DOSIS", "CANTIDAD", "FRECUENCIA"
            }
        ));
        jScrollPane6.setViewportView(tblreceta);

        panelNice1.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 700, 110));

        tblcie10.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CIE 10", "CATEGORIA"
            }
        ));
        jScrollPane8.setViewportView(tblcie10);

        panelNice1.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 230, 390, 110));

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Cantidad:");
        panelNice1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 130, 70, 20));
        panelNice1.add(txtmiligramos, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 150, 21));

        btncargardatos.setText("Cargar Datos");
        panelNice1.add(btncargardatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));
        panelNice1.add(id_rec_cie, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 550, 30, 20));
        panelNice1.add(id_rec_far, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 30, 20));

        jPanel1.add(panelNice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1150, 600));

        btnCrearRec.setText("Crear");
        jPanel1.add(btnCrearRec, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 620, 160, 40));

        btnEditarrec.setText("Editar");
        jPanel1.add(btnEditarrec, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 620, 160, 40));

        btnEliminarrec.setText("Eliminar");
        jPanel1.add(btnEliminarrec, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 620, 160, 40));

        lblfecha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lblfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 620, 100, 20));

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

    public JTextFieldRound getTxtIDreceta() {
        return txtIDreceta;
    }

    public void setTxtIDreceta(JTextFieldRound txtIDreceta) {
        this.txtIDreceta = txtIDreceta;
    }


    public JButton getBtnBuscarcie() {
        return btnBuscarcie;
    }

    public void setBtnBuscarcie(JButton btnBuscarcie) {
        this.btnBuscarcie = btnBuscarcie;
    }

    public JButton getBtnCrearRec() {
        return btnCrearRec;
    }

    public void setBtnCrearRec(JButton btnCrearRec) {
        this.btnCrearRec = btnCrearRec;
    }

    public JButton getBtnEditarrec() {
        return btnEditarrec;
    }

    public void setBtnEditarrec(JButton btnEditarrec) {
        this.btnEditarrec = btnEditarrec;
    }

    public JButton getBtnEliminarrec() {
        return btnEliminarrec;
    }

    public void setBtnEliminarrec(JButton btnEliminarrec) {
        this.btnEliminarrec = btnEliminarrec;
    }

    public JButton getBtnagregarcie() {
        return btnagregarcie;
    }

    public JButton getBtncargardatos() {
        return btncargardatos;
    }

    public void setBtncargardatos(JButton btncargardatos) {
        this.btncargardatos = btncargardatos;
    }

    public void setBtnagregarcie(JButton btnagregarcie) {
        this.btnagregarcie = btnagregarcie;
    }

    public JButton getBtnagregardatos() {
        return btnagregardatos;
    }

    public void setBtnagregardatos(JButton btnagregardatos) {
        this.btnagregardatos = btnagregardatos;
    }

    public JButton getBtnbuscarfarmaco() {
        return btnbuscarfarmaco;
    }

    public void setBtnbuscarfarmaco(JButton btnbuscarfarmaco) {
        this.btnbuscarfarmaco = btnbuscarfarmaco;
    }

    public ButtonRound getBtncerrar() {
        return btncerrar;
    }

    public void setBtncerrar(ButtonRound btncerrar) {
        this.btncerrar = btncerrar;
    }

    public JDialog getDialogCIE() {
        return dialogCIE;
    }

    public void setDialogCIE(JDialog dialogCIE) {
        this.dialogCIE = dialogCIE;
    }

    public JDialog getDialogFarmaco() {
        return dialogFarmaco;
    }

    public void setDialogFarmaco(JDialog dialogFarmaco) {
        this.dialogFarmaco = dialogFarmaco;
    }


    public JScrollPane getjScrollPane2() {
        return jScrollPane2;
    }

    public void setjScrollPane2(JScrollPane jScrollPane2) {
        this.jScrollPane2 = jScrollPane2;
    }

    public JScrollPane getjScrollPane4() {
        return jScrollPane4;
    }

    public void setjScrollPane4(JScrollPane jScrollPane4) {
        this.jScrollPane4 = jScrollPane4;
    }

    public JScrollPane getjScrollPane5() {
        return jScrollPane5;
    }

    public void setjScrollPane5(JScrollPane jScrollPane5) {
        this.jScrollPane5 = jScrollPane5;
    }

    public JScrollPane getjScrollPane6() {
        return jScrollPane6;
    }

    public void setjScrollPane6(JScrollPane jScrollPane6) {
        this.jScrollPane6 = jScrollPane6;
    }

    public JScrollPane getjScrollPane8() {
        return jScrollPane8;
    }

    public void setjScrollPane8(JScrollPane jScrollPane8) {
        this.jScrollPane8 = jScrollPane8;
    }

    public JTable getjTable1() {
        return tblbuscarFarmacos;
    }

    public void setjTable1(JTable jTable1) {
        this.tblbuscarFarmacos = jTable1;
    }

    public JTable getjTable4() {
        return tblbuscarcie10;
    }

    public void setjTable4(JTable jTable4) {
        this.tblbuscarcie10 = jTable4;
    }

    public static JDateChooser getJdcFechanaciento() {
        return jdcFechanaciento;
    }

    public static void setJdcFechanaciento(JDateChooser jdcFechanaciento) {
        Vista_Receta.jdcFechanaciento = jdcFechanaciento;
    }

    public PanelNice getPanelNice1() {
        return panelNice1;
    }

    public void setPanelNice1(PanelNice panelNice1) {
        this.panelNice1 = panelNice1;
    }

    public JPanel getPaneldialog() {
        return paneldialog;
    }

    public void setPaneldialog(JPanel paneldialog) {
        this.paneldialog = paneldialog;
    }

    public JSpinner getSpcantidad() {
        return spcantidad;
    }

    public void setSpcantidad(JSpinner spcantidad) {
        this.spcantidad = spcantidad;
    }

    public JTable getTblcie10() {
        return tblcie10;
    }

    public void setTblcie10(JTable tblcie10) {
        this.tblcie10 = tblcie10;
    }

    public JTable getTblreceta() {
        return tblreceta;
    }

    public void setTblreceta(JTable tblreceta) {
        this.tblreceta = tblreceta;
    }

    public JLabel getTxtApellido() {
        return txtApellido;
    }

    public void setTxtApellido(JLabel txtApellido) {
        this.txtApellido = txtApellido;
    }

    public JTextFieldRound getTxtCie() {
        return txtCie;
    }

    public void setTxtCie(JTextFieldRound txtCie) {
        this.txtCie = txtCie;
    }

    public JTextFieldRound getTxtCie1() {
        return txtCie1;
    }

    public void setTxtCie1(JTextFieldRound txtCie1) {
        this.txtCie1 = txtCie1;
    }

    public JTextFieldRound getTxtIdfamaco() {
        return txtIdfamaco;
    }

    public void setTxtIdfamaco(JTextFieldRound txtIdfamaco) {
        this.txtIdfamaco = txtIdfamaco;
    }

    public JTextArea getTxtalergias() {
        return txtalergias;
    }

    public void setTxtalergias(JTextArea txtalergias) {
        this.txtalergias = txtalergias;
    }

    public JLabel getLblfecha() {
        return lblfecha;
    }

    public void setLblfecha(JLabel lblfecha) {
        this.lblfecha = lblfecha;
    }

    public JLabel getTxtedad() {
        return txtedad;
    }

    public void setTxtedad(JLabel txtedad) {
        this.txtedad = txtedad;
    }

    public JTextField getTxtbuscarcie10() {
        return txtbuscarcie10;
    }

    public void setTxtbuscarcie10(JTextField txtbuscarcie10) {
        this.txtbuscarcie10 = txtbuscarcie10;
    }

    public JTextField getTxtbuscarfar() {
        return txtbuscarfar;
    }

    public void setTxtbuscarfar(JTextField txtbuscarfar) {
        this.txtbuscarfar = txtbuscarfar;
    }

    public JTextFieldRound getTxtfrecuencia() {
        return txtfrecuencia;
    }

    public void setTxtfrecuencia(JTextFieldRound txtfrecuencia) {
        this.txtfrecuencia = txtfrecuencia;
    }

    public JTextFieldRound getTxtmiligramos() {
        return txtmiligramos;
    }

    public void setTxtmiligramos(JTextFieldRound txtmiligramos) {
        this.txtmiligramos = txtmiligramos;
    }

    public JLabel getTxtcedula() {
        return txtcedula;
    }

    public void setTxtcedula(JLabel txtcedula) {
        this.txtcedula = txtcedula;
    }

    public JLabel getTxtnombre() {
        return txtnombre;
    }

    public void setTxtnombre(JLabel txtnombre) {
        this.txtnombre = txtnombre;
    }

    public JTextArea getTxtobservaciones() {
        return txtobservaciones;
    }

    public void setTxtobservaciones(JTextArea txtobservaciones) {
        this.txtobservaciones = txtobservaciones;
    }

    public JLabel getTxtsexo() {
        return txtsexo;
    }

    public void setTxtsexo(JLabel txtsexo) {
        this.txtsexo = txtsexo;
    }

    public JTextFieldRound getTxttitulo() {
        return txttitulo;
    }

    public void setTxttitulo(JTextFieldRound txttitulo) {
        this.txttitulo = txttitulo;
    }

    public JTable getTblbuscarFarmacos() {
        return tblbuscarFarmacos;
    }

    public void setTblbuscarFarmacos(JTable tblbuscarFarmacos) {
        this.tblbuscarFarmacos = tblbuscarFarmacos;
    }


    public JTable getTblbuscarcie10() {
        return tblbuscarcie10;
    }

    public void setTblbuscarcie10(JTable tblbuscarcie10) {
        this.tblbuscarcie10 = tblbuscarcie10;
    }

    public JLabel getId_rec_cie() {
        return id_rec_cie;
    }

    public void setId_rec_cie(JLabel id_rec_cie) {
        this.id_rec_cie = id_rec_cie;
    }

    public JLabel getId_rec_far() {
        return id_rec_far;
    }

    public void setId_rec_far(JLabel id_rec_far) {
        this.id_rec_far = id_rec_far;
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarcie;
    private javax.swing.JButton btnCrearRec;
    private javax.swing.JButton btnEditarrec;
    private javax.swing.JButton btnEliminarrec;
    private javax.swing.JButton btnagregarcie;
    private javax.swing.JButton btnagregardatos;
    private javax.swing.JButton btnbuscarfarmaco;
    private javax.swing.JButton btncargardatos;
    private org.edisoncor.gui.button.ButtonRound btncerrar;
    private javax.swing.JDialog dialogCIE;
    private javax.swing.JDialog dialogFarmaco;
    private javax.swing.JLabel id_rec_cie;
    private javax.swing.JLabel id_rec_far;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel36;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    public static com.toedter.calendar.JDateChooser jdcFechanaciento;
    public static javax.swing.JLabel lblfecha;
    private org.edisoncor.gui.panel.PanelNice panelNice1;
    private javax.swing.JPanel paneldialog;
    public static javax.swing.JSpinner spcantidad;
    private javax.swing.JTable tblbuscarFarmacos;
    private javax.swing.JTable tblbuscarcie10;
    public static javax.swing.JTable tblcie10;
    public static javax.swing.JTable tblreceta;
    private javax.swing.JLabel txtApellido;
    public static jtextfieldround.JTextFieldRound txtCie;
    public static jtextfieldround.JTextFieldRound txtCie1;
    private jtextfieldround.JTextFieldRound txtIDreceta;
    public static jtextfieldround.JTextFieldRound txtIdfamaco;
    private javax.swing.JTextArea txtalergias;
    private javax.swing.JTextField txtbuscarcie10;
    private javax.swing.JTextField txtbuscarfar;
    private javax.swing.JLabel txtcedula;
    private javax.swing.JLabel txtedad;
    public static jtextfieldround.JTextFieldRound txtfrecuencia;
    public static jtextfieldround.JTextFieldRound txtmiligramos;
    private javax.swing.JLabel txtnombre;
    private javax.swing.JTextArea txtobservaciones;
    private javax.swing.JLabel txtsexo;
    public static jtextfieldround.JTextFieldRound txttitulo;
    // End of variables declaration//GEN-END:variables
}
