/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import jtextfieldround.JTextFieldRound;
import org.edisoncor.gui.button.ButtonRound;

/**
 *
 * @author slix0
 */
public class Crud_Paciente extends javax.swing.JInternalFrame {

    /**
     * Creates new form Crud_Paciente
     */
    public Crud_Paciente() {
        initComponents();
    }

    public JButton getBtneliminar() {
        return btneliminar;
    }

    public void setBtneliminar(JButton btneliminar) {
        this.btneliminar = btneliminar;
    }

    public JTable getJtbPacientes() {
        return jtbPacientes;
    }

    public void setJtbPacientes(JTable jtbPacientes) {
        this.jtbPacientes = jtbPacientes;
    }

    public JLabel getLabelserie() {
        return labelserie;
    }

    public void setLabelserie(JLabel labelserie) {
        this.labelserie = labelserie;
    }

    public JTextField getTxtruta() {
        return txtruta;
    }

    public void setTxtruta(JTextField txtruta) {
        this.txtruta = txtruta;
    }

    public ButtonRound getBtnAnteriorEsp() {
        return btnAnteriorEsp;
    }

    public void setBtnAnteriorEsp(ButtonRound btnAnteriorEsp) {
        this.btnAnteriorEsp = btnAnteriorEsp;
    }

    public JButton getBtnguardarpac() {
        return btnguardarpac;
    }

    public void setBtnguardarpac(JButton btnguardarpac) {
        this.btnguardarpac = btnguardarpac;
    }

    public JComboBox<String> getCbSangre() {
        return cbSangre;
    }

    public JTextFieldRound getTxtbusqueda() {
        return txtbusqueda;
    }

    public void setTxtbusqueda(JTextFieldRound txtbusqueda) {
        this.txtbusqueda = txtbusqueda;
    }

    public void setCbSangre(JComboBox<String> cbSangre) {
        this.cbSangre = cbSangre;
    }

    public JComboBox<String> getCmgenero() {
        return cmgenero;
    }

    public void setCmgenero(JComboBox<String> cmgenero) {
        this.cmgenero = cmgenero;
    }

    public JTextFieldRound getTxtapellidos() {
        return txtapellidos;
    }

    public void setTxtapellidos(JTextFieldRound txtapellidos) {
        this.txtapellidos = txtapellidos;
    }

    public JTextFieldRound getTxtced() {
        return txtced;
    }

    public void setTxtced(JTextFieldRound txtced) {
        this.txtced = txtced;
    }

    public JTextFieldRound getTxtcelular() {
        return txtcelular;
    }

    public void setTxtcelular(JTextFieldRound txtcelular) {
        this.txtcelular = txtcelular;
    }

    public JTextFieldRound getTxtciudad() {
        return txtciudad;
    }

    public void setTxtciudad(JTextFieldRound txtciudad) {
        this.txtciudad = txtciudad;
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

    public JTextFieldRound getTxtprovincia() {
        return txtprovincia;
    }

    public void setTxtprovincia(JTextFieldRound txtprovincia) {
        this.txtprovincia = txtprovincia;
    }

    public JTextFieldRound getTxttelefono() {
        return txttelefono;
    }

    public void setTxttelefono(JTextFieldRound txttelefono) {
        this.txttelefono = txttelefono;
    }

    public JTextFieldRound getYxynom() {
        return yxynom;
    }

    public void setYxynom(JTextFieldRound yxynom) {
        this.yxynom = yxynom;
    }

    public JButton getBtnexaminar() {
        return btnexaminar;
    }

    public void setBtnexaminar(JButton btnexaminar) {
        this.btnexaminar = btnexaminar;
    }

    public JDateChooser getJdcFecha() {
        return jdcFecha;
    }

    public void setJdcFecha(JDateChooser jdcFecha) {
        this.jdcFecha = jdcFecha;
    }

    public JLabel getLablefoto() {
        return lablefoto;
    }

    public void setLablefoto(JLabel lablefoto) {
        this.lablefoto = lablefoto;
    }

    public JButton getBtneditar() {
        return btneditar;
    }

    public void setBtneditar(JButton btneditar) {
        this.btneditar = btneditar;
    }

    
    
    
    
    
    
    
    /**
     *
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        panelNice1 = new org.edisoncor.gui.panel.PanelNice();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtapellidos = new jtextfieldround.JTextFieldRound();
        txtced = new jtextfieldround.JTextFieldRound();
        txtdireccion = new jtextfieldround.JTextFieldRound();
        txttelefono = new jtextfieldround.JTextFieldRound();
        txtcelular = new jtextfieldround.JTextFieldRound();
        txtcorreo = new jtextfieldround.JTextFieldRound();
        txtciudad = new jtextfieldround.JTextFieldRound();
        txtprovincia = new jtextfieldround.JTextFieldRound();
        jdcFecha = new com.toedter.calendar.JDateChooser();
        panelTranslucido1 = new org.edisoncor.gui.panel.PanelTranslucido();
        lablefoto = new javax.swing.JLabel();
        btnexaminar = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        yxynom = new jtextfieldround.JTextFieldRound();
        btnguardarpac = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        cmgenero = new javax.swing.JComboBox<>();
        cbSangre = new javax.swing.JComboBox<>();
        txtruta = new javax.swing.JTextField();
        panelNice2 = new org.edisoncor.gui.panel.PanelNice();
        jLabel3 = new javax.swing.JLabel();
        txtbusqueda = new jtextfieldround.JTextFieldRound();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbPacientes = new javax.swing.JTable();
        btneliminar = new javax.swing.JButton();
        btneditar = new javax.swing.JButton();
        btnAnteriorEsp = new org.edisoncor.gui.button.ButtonRound();
        jLabel1 = new javax.swing.JLabel();
        labelserie = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelNice1.setBackground(new java.awt.Color(166, 104, 216));
        panelNice1.setAlignmentX(1.0F);
        panelNice1.setAlignmentY(1.0F);
        panelNice1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("SF Pro Display", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("APELLIDOS:");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelNice1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 180, 20));

        jLabel5.setFont(new java.awt.Font("SF Pro Display", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("CEDULA DE IDENTIDAD:");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelNice1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, 20));

        jLabel6.setFont(new java.awt.Font("SF Pro Display", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("GENERO:");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelNice1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 170, 30));

        jLabel7.setFont(new java.awt.Font("SF Pro Display", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("DIRECCION DOMICILIO:");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelNice1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, 20));

        jLabel8.setFont(new java.awt.Font("SF Pro Display", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("TELEFONO:");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelNice1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 210, 180, 20));

        jLabel9.setFont(new java.awt.Font("SF Pro Display", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText(" CELULAR:");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelNice1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 190, 20));

        jLabel10.setFont(new java.awt.Font("SF Pro Display", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("CORREO:");
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelNice1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 190, 20));

        jLabel11.setFont(new java.awt.Font("SF Pro Display", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("PROVINCIA:");
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelNice1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 190, 20));

        jLabel12.setFont(new java.awt.Font("SF Pro Display", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("CIUDAD:");
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelNice1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 190, 20));

        jLabel13.setFont(new java.awt.Font("SF Pro Display", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("FECHA NACIMIENTO");
        jLabel13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelNice1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 190, 20));
        panelNice1.add(txtapellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 260, -1));
        panelNice1.add(txtced, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 260, -1));
        panelNice1.add(txtdireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 260, -1));
        panelNice1.add(txttelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 260, -1));
        panelNice1.add(txtcelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 260, -1));
        panelNice1.add(txtcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 260, -1));
        panelNice1.add(txtciudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 260, -1));
        panelNice1.add(txtprovincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 260, -1));
        panelNice1.add(jdcFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 260, -1));

        lablefoto.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelTranslucido1Layout = new javax.swing.GroupLayout(panelTranslucido1);
        panelTranslucido1.setLayout(panelTranslucido1Layout);
        panelTranslucido1Layout.setHorizontalGroup(
            panelTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTranslucido1Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(lablefoto, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        panelTranslucido1Layout.setVerticalGroup(
            panelTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTranslucido1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lablefoto, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        panelNice1.add(panelTranslucido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 180, 80));

        btnexaminar.setText("EXAMINAR");
        panelNice1.add(btnexaminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 490, 130, 40));

        jLabel14.setFont(new java.awt.Font("SF Pro Display", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("NOMBRES :");
        jLabel14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelNice1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 180, 20));
        panelNice1.add(yxynom, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 260, -1));

        btnguardarpac.setText("Guardar");
        panelNice1.add(btnguardarpac, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 570, 220, 40));

        jLabel15.setFont(new java.awt.Font("SF Pro Display", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("TIPO DE SANGRE");
        jLabel15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelNice1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 170, 30));

        cmgenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "M", "F" }));
        panelNice1.add(cmgenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 130, 260, -1));

        cbSangre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panelNice1.add(cbSangre, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 450, 260, -1));
        panelNice1.add(txtruta, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 530, 220, -1));

        jPanel1.add(panelNice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 500, 630));

        panelNice2.setBackground(new java.awt.Color(90, 166, 166));
        panelNice2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("SF Pro Display", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("BUSCAR:");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelNice2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 20, 120, 30));
        panelNice2.add(txtbusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 520, -1));

        jtbPacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cedula", "Nombres", "Apellidos", "Celular", "Direccion", "Ciudad", "Genero", "Foto", "Fecha Nac", "Tipo sangre"
            }
        ));
        jScrollPane1.setViewportView(jtbPacientes);

        panelNice2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 630, 500));

        btneliminar.setText("Eliminar");
        panelNice2.add(btneliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 570, 220, 40));

        btneditar.setText("Editar");
        panelNice2.add(btneditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 570, 220, 40));

        jPanel1.add(panelNice2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, 660, 630));

        btnAnteriorEsp.setBackground(new java.awt.Color(166, 104, 216));
        btnAnteriorEsp.setText("cerrar");
        jPanel1.add(btnAnteriorEsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel1.setText("numero serie");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));
        jPanel1.add(labelserie, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 230, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonRound btnAnteriorEsp;
    private javax.swing.JButton btneditar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnexaminar;
    private javax.swing.JButton btnguardarpac;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbSangre;
    private javax.swing.JComboBox<String> cmgenero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdcFecha;
    private javax.swing.JTable jtbPacientes;
    private javax.swing.JLabel labelserie;
    private javax.swing.JLabel lablefoto;
    private org.edisoncor.gui.panel.PanelNice panelNice1;
    private org.edisoncor.gui.panel.PanelNice panelNice2;
    private org.edisoncor.gui.panel.PanelTranslucido panelTranslucido1;
    private jtextfieldround.JTextFieldRound txtapellidos;
    private jtextfieldround.JTextFieldRound txtbusqueda;
    private jtextfieldround.JTextFieldRound txtced;
    private jtextfieldround.JTextFieldRound txtcelular;
    private jtextfieldround.JTextFieldRound txtciudad;
    private jtextfieldround.JTextFieldRound txtcorreo;
    private jtextfieldround.JTextFieldRound txtdireccion;
    private jtextfieldround.JTextFieldRound txtprovincia;
    private javax.swing.JTextField txtruta;
    private jtextfieldround.JTextFieldRound txttelefono;
    private jtextfieldround.JTextFieldRound yxynom;
    // End of variables declaration//GEN-END:variables
}
