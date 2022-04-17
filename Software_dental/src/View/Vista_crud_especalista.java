/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
import org.edisoncor.gui.comboBox.ComboBoxRound;


public class Vista_crud_especalista extends javax.swing.JInternalFrame {


    public Vista_crud_especalista() {
        initComponents();
    }

    public ButtonRound getBtnAnteriorEsp() {
        return btnAnteriorEsp;
    }

    public void setBtnAnteriorEsp(ButtonRound btnAnteriorEsp) {
        this.btnAnteriorEsp = btnAnteriorEsp;
    }

    public JButton getBtneliminar() {
        return btneliminar;
    }

    public void setBtneliminar(JButton btneliminar) {
        this.btneliminar = btneliminar;
    }

    public JButton getBtnNuevo() {
        return btnNuevo;
    }

    public void setBtnNuevo(JButton btnNuevo) {
        this.btnNuevo = btnNuevo;
    }

    public JButton getBtnguardarEsp() {
        return btnguardarEsp;
    }

    public void setBtnguardarEsp(JButton btnguardarEsp) {
        this.btnguardarEsp = btnguardarEsp;
    }

    public JComboBox<String> getcBoxespecialidad() {
        return cBoxespecialidad;
    }

    public void setcBoxespecialidad(JComboBox<String> cBoxespecialidad) {
        this.cBoxespecialidad = cBoxespecialidad;
    }

    public JComboBox<String> getCboxGeneroEsp() {
        return cboxGeneroEsp;
    }

    public void setCboxGeneroEsp(JComboBox<String> cboxGeneroEsp) {
        this.cboxGeneroEsp = cboxGeneroEsp;
    }

 
   

    public JLabel getLblFotoEsp() {
        return lblFotoEsp;
    }

    public void setLblFotoEsp(JLabel lblFotoEsp) {
        this.lblFotoEsp = lblFotoEsp;
    }

    public JTable getTblEspecialista() {
        return tblEspecialista;
    }

    public void setTblEspecialista(JTable tblEspecialista) {
        this.tblEspecialista = tblEspecialista;
    }

    public JTextFieldRound getTxtBuscarEsp() {
        return txtBuscarEsp;
    }

    public void setTxtBuscarEsp(JTextFieldRound txtBuscarEsp) {
        this.txtBuscarEsp = txtBuscarEsp;
    }

    public JTextFieldRound getTxtcedulaesp() {
        return txtcedulaesp;
    }

    public void setTxtcedulaesp(JTextFieldRound txtcedulaesp) {
        this.txtcedulaesp = txtcedulaesp;
    }

    public JTextFieldRound getTxtciudadesp() {
        return txtciudadesp;
    }

    public void setTxtciudadesp(JTextFieldRound txtciudadesp) {
        this.txtciudadesp = txtciudadesp;
    }

    public JTextFieldRound getTxtcorreoesp() {
        return txtcorreoesp;
    }

    public void setTxtcorreoesp(JTextFieldRound txtcorreoesp) {
        this.txtcorreoesp = txtcorreoesp;
    }

    public JTextFieldRound getTxtdirecesp() {
        return txtdirecesp;
    }

    public void setTxtdirecesp(JTextFieldRound txtdirecesp) {
        this.txtdirecesp = txtdirecesp;
    }

    public JTextFieldRound getTxttelfesp() {
        return txttelfesp;
    }

    public void setTxttelfesp(JTextFieldRound txttelfesp) {
        this.txttelfesp = txttelfesp;
    }

    public JTextFieldRound getTxtCelularesp() {
        return txtCelularesp;
    }

    public void setTxtCelularesp(JTextFieldRound txtCelularesp) {
        this.txtCelularesp = txtCelularesp;
    }

    public JLabel getTxtIdDoctor() {
        return TxtIdDoctor;
    }

    public void setTxtIdDoctor(JLabel TxtIdDoctor) {
        this.TxtIdDoctor = TxtIdDoctor;
    }
    
    public JTextFieldRound getTxtIdUsuario() {
        return txtIdUsuario;
    }

    public void setTxtIdUsuario(JTextFieldRound txtIdUsuario) {
        this.txtIdUsuario = txtIdUsuario;
    }

    public JTextFieldRound getTxtnombreesp() {
        return txtnombreesp;
    }

    public void setTxtnombreesp(JTextFieldRound txtnombreesp) {
        this.txtnombreesp = txtnombreesp;
    }

    public JTextFieldRound getTxtprovinciaesp() {
        return txtprovinciaesp;
    }

    public void setTxtprovinciaesp(JTextFieldRound txtprovinciaesp) {
        this.txtprovinciaesp = txtprovinciaesp;
    }

    public JTextFieldRound getTxtCargoesp() {
        return txtCargoesp;
    }

    public void setTxtCargoesp(JTextFieldRound txtCargoesp) {
        this.txtCargoesp = txtCargoesp;
    }

    public JTextField getTxtruta() {
        return txtruta;
    }

    public void setTxtruta(JTextField txtruta) {
        this.txtruta = txtruta;
    }

    public JButton getBtnExaminar() {
        return btnExaminar;
    }

    public void setBtnExaminar(JButton btnExaminar) {
        this.btnExaminar = btnExaminar;
    }

    public JTextFieldRound getTxtapellidoesp() {
        return txtapellidoesp;
    }

    public void setTxtapellidoesp(JTextFieldRound txtapellidoesp) {
        this.txtapellidoesp = txtapellidoesp;
    }

  
    

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
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
        jLabel11 = new javax.swing.JLabel();
        txtcedulaesp = new jtextfieldround.JTextFieldRound();
        panelRoundTranslucido1 = new org.edisoncor.gui.panel.PanelRoundTranslucido();
        lblFotoEsp = new javax.swing.JLabel();
        txtnombreesp = new jtextfieldround.JTextFieldRound();
        txtcorreoesp = new jtextfieldround.JTextFieldRound();
        txttelfesp = new jtextfieldround.JTextFieldRound();
        txtdirecesp = new jtextfieldround.JTextFieldRound();
        txtprovinciaesp = new jtextfieldround.JTextFieldRound();
        txtciudadesp = new jtextfieldround.JTextFieldRound();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtCargoesp = new jtextfieldround.JTextFieldRound();
        btnguardarEsp = new javax.swing.JButton();
        cboxGeneroEsp = new javax.swing.JComboBox<>();
        cBoxespecialidad = new javax.swing.JComboBox<>();
        txtruta = new javax.swing.JTextField();
        btnExaminar = new javax.swing.JButton();
        txtapellidoesp = new jtextfieldround.JTextFieldRound();
        txtCelularesp = new jtextfieldround.JTextFieldRound();
        panelNice2 = new org.edisoncor.gui.panel.PanelNice();
        jLabel14 = new javax.swing.JLabel();
        txtBuscarEsp = new jtextfieldround.JTextFieldRound();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEspecialista = new javax.swing.JTable();
        btnNuevo = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnAnteriorEsp = new org.edisoncor.gui.button.ButtonRound();
        txtIdUsuario = new jtextfieldround.JTextFieldRound();
        TxtIdDoctor = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelNice1.setBackground(new java.awt.Color(166, 104, 216));
        panelNice1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NOMBRES:");
        panelNice1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("APELLIDOS:");
        panelNice1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CEDULA:");
        panelNice1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CELULAR:");
        panelNice1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel5.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("DIRECCION:");
        panelNice1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jLabel6.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("TELEFONO:");
        panelNice1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel7.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("CORREO:");
        panelNice1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        jLabel8.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("PROVINCIA:");
        panelNice1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        jLabel9.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("CIUDAD:");
        panelNice1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        jLabel11.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("CARGO:");
        panelNice1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));
        panelNice1.add(txtcedulaesp, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 190, 21));

        lblFotoEsp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout panelRoundTranslucido1Layout = new javax.swing.GroupLayout(panelRoundTranslucido1);
        panelRoundTranslucido1.setLayout(panelRoundTranslucido1Layout);
        panelRoundTranslucido1Layout.setHorizontalGroup(
            panelRoundTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRoundTranslucido1Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(lblFotoEsp, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        panelRoundTranslucido1Layout.setVerticalGroup(
            panelRoundTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRoundTranslucido1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(lblFotoEsp, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        panelNice1.add(panelRoundTranslucido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 200, 140));
        panelNice1.add(txtnombreesp, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 190, 21));
        panelNice1.add(txtcorreoesp, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 190, 21));
        panelNice1.add(txttelfesp, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 190, 21));
        panelNice1.add(txtdirecesp, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 190, 20));
        panelNice1.add(txtprovinciaesp, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 190, 21));
        panelNice1.add(txtciudadesp, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 190, 21));

        jLabel13.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("GENERO:");
        panelNice1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        jLabel12.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("ESPECIALIDAD:");
        panelNice1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));
        panelNice1.add(txtCargoesp, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 190, 21));

        btnguardarEsp.setText("Guardar");
        panelNice1.add(btnguardarEsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 520, 190, 50));

        cboxGeneroEsp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar genero", "Masculino", "Femenino" }));
        panelNice1.add(cboxGeneroEsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 190, -1));

        cBoxespecialidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione la especialidad", "Odontólogo general", "Odontopediatra", "Ortodoncista", "Periodoncista", "Endodoncista", "Patólogo oral o Cirujano oral", "Prostodoncista" }));
        panelNice1.add(cBoxespecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 190, -1));

        txtruta.setBackground(new java.awt.Color(166, 104, 216));
        txtruta.setForeground(new java.awt.Color(166, 104, 216));
        txtruta.setBorder(null);
        panelNice1.add(txtruta, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, 220, -1));

        btnExaminar.setText("Buscar Foto");
        panelNice1.add(btnExaminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, -1, -1));
        panelNice1.add(txtapellidoesp, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 190, 21));
        panelNice1.add(txtCelularesp, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 190, 21));

        jPanel1.add(panelNice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 330, 600));

        panelNice2.setBackground(new java.awt.Color(90, 166, 166));

        jLabel14.setFont(new java.awt.Font("SF Pro Display", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Buscar");

        tblEspecialista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "CEDULA", "NOMBRES", "APELLIDOS", "CELULAR", "DIRECCION", "CIUDAD", "GENERO", "FOTO", "ID DOCTOR", "ESPECIALIDAD"
            }
        ));
        jScrollPane1.setViewportView(tblEspecialista);

        btnNuevo.setText("Nuevo");

        btneliminar.setText("Eliminar");

        javax.swing.GroupLayout panelNice2Layout = new javax.swing.GroupLayout(panelNice2);
        panelNice2.setLayout(panelNice2Layout);
        panelNice2Layout.setHorizontalGroup(
            panelNice2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNice2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscarEsp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelNice2Layout.createSequentialGroup()
                .addContainerGap(101, Short.MAX_VALUE)
                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140)
                .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106))
            .addGroup(panelNice2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        panelNice2Layout.setVerticalGroup(
            panelNice2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNice2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelNice2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtBuscarEsp, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
                .addGap(17, 17, 17)
                .addGroup(panelNice2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        jPanel1.add(panelNice2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 800, 590));

        btnAnteriorEsp.setBackground(new java.awt.Color(166, 104, 216));
        btnAnteriorEsp.setText("Cerrar");
        jPanel1.add(btnAnteriorEsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        txtIdUsuario.setText("2");
        jPanel1.add(txtIdUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 11, 70, 20));
        jPanel1.add(TxtIdDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 50, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1160, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TxtIdDoctor;
    private org.edisoncor.gui.button.ButtonRound btnAnteriorEsp;
    private javax.swing.JButton btnExaminar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardarEsp;
    private javax.swing.JComboBox<String> cBoxespecialidad;
    private javax.swing.JComboBox<String> cboxGeneroEsp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JLabel lblFotoEsp;
    private org.edisoncor.gui.panel.PanelNice panelNice1;
    private org.edisoncor.gui.panel.PanelNice panelNice2;
    private org.edisoncor.gui.panel.PanelRoundTranslucido panelRoundTranslucido1;
    private javax.swing.JTable tblEspecialista;
    private jtextfieldround.JTextFieldRound txtBuscarEsp;
    private jtextfieldround.JTextFieldRound txtCargoesp;
    private jtextfieldround.JTextFieldRound txtCelularesp;
    private jtextfieldround.JTextFieldRound txtIdUsuario;
    private jtextfieldround.JTextFieldRound txtapellidoesp;
    private jtextfieldround.JTextFieldRound txtcedulaesp;
    private jtextfieldround.JTextFieldRound txtciudadesp;
    private jtextfieldround.JTextFieldRound txtcorreoesp;
    private jtextfieldround.JTextFieldRound txtdirecesp;
    private jtextfieldround.JTextFieldRound txtnombreesp;
    private jtextfieldround.JTextFieldRound txtprovinciaesp;
    private javax.swing.JTextField txtruta;
    private jtextfieldround.JTextFieldRound txttelfesp;
    // End of variables declaration//GEN-END:variables
}
