/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Persona;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import jtextfieldround.JTextFieldRound;

public class Vista_Citas_Tratamiento extends javax.swing.JInternalFrame {

    /**
     * Creates new form Vista_Citas_Tratamiento
     */
    public Vista_Citas_Tratamiento() {
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
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtbuscardoc = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbldoctor = new javax.swing.JTable();
        dialogpac = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtbuscarpac = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblpac = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        panelNice1 = new org.edisoncor.gui.panel.PanelNice();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnELIM = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtNombredoc = new jtextfieldround.JTextFieldRound();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jdateFecha = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jareades = new javax.swing.JTextArea();
        txtficha = new jtextfieldround.JTextFieldRound();
        txtApellidosPac = new jtextfieldround.JTextFieldRound();
        btnAgendar1 = new javax.swing.JButton();
        btnACTU = new javax.swing.JButton();
        txthora = new jtextfieldround.JTextFieldRound();
        jLabel5 = new javax.swing.JLabel();
        txtNombrePac = new jtextfieldround.JTextFieldRound();
        txtcedulapac = new jtextfieldround.JTextFieldRound();
        txtceduladoc = new jtextfieldround.JTextFieldRound();
        jLabel14 = new javax.swing.JLabel();
        txtapellidosdoc = new jtextfieldround.JTextFieldRound();
        btncargar = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        panelNice2 = new org.edisoncor.gui.panel.PanelNice();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblcitas = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(90, 166, 166));

        jLabel12.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Buscar:");

        txtbuscardoc.setToolTipText("Ingrese la cedula o el nombre para buscar");

        tbldoctor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cedula", "Nombre", "Apellido", "Especialidad", "Telefono"
            }
        ));
        jScrollPane3.setViewportView(tbldoctor);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(51, 51, 51)
                        .addComponent(txtbuscardoc, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtbuscardoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout dialogbuscarLayout = new javax.swing.GroupLayout(dialogbuscar.getContentPane());
        dialogbuscar.getContentPane().setLayout(dialogbuscarLayout);
        dialogbuscarLayout.setHorizontalGroup(
            dialogbuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dialogbuscarLayout.setVerticalGroup(
            dialogbuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogbuscarLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel13.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Buscar:");

        txtbuscarpac.setToolTipText("Ingrese la cedula o el nombre para buscar");

        tblpac.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(tblpac);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(txtbuscarpac, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtbuscarpac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout dialogpacLayout = new javax.swing.GroupLayout(dialogpac.getContentPane());
        dialogpac.getContentPane().setLayout(dialogpacLayout);
        dialogpacLayout.setHorizontalGroup(
            dialogpacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dialogpacLayout.setVerticalGroup(
            dialogpacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogpacLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelNice1.setBackground(new java.awt.Color(166, 104, 216));
        panelNice1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CEDULA DEL PACIENTE:");
        panelNice1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, 20));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("FICHA:");
        panelNice1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, -1, 20));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("APELLIDOS DEL PACIENTE:");
        panelNice1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, 20));

        btnELIM.setText("ELIMINAR");
        panelNice1.add(btnELIM, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 440, 130, 40));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("APELLIDOS DEL DOCTOR:");
        panelNice1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, 20));

        txtNombredoc.setEditable(false);
        panelNice1.add(txtNombredoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 220, 20));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("CEDULA DEL DOCTOR:");
        panelNice1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, 20));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("FECHA:");
        panelNice1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, -1, -1));
        panelNice1.add(jdateFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 220, 20));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("HORA:");
        panelNice1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, -1, -1));

        jareades.setColumns(20);
        jareades.setRows(5);
        jScrollPane2.setViewportView(jareades);

        panelNice1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 270, 160));

        txtficha.setEditable(false);
        panelNice1.add(txtficha, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 220, 20));

        txtApellidosPac.setEditable(false);
        panelNice1.add(txtApellidosPac, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 220, 20));

        btnAgendar1.setText("AGENDAR");
        panelNice1.add(btnAgendar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 120, 40));

        btnACTU.setText("NUEVO");
        panelNice1.add(btnACTU, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 440, 130, 40));
        panelNice1.add(txthora, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 220, 20));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("NOMBRES DEL PACIENTE:");
        panelNice1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, 20));

        txtNombrePac.setEditable(false);
        panelNice1.add(txtNombrePac, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 220, 20));

        txtcedulapac.setEditable(false);
        panelNice1.add(txtcedulapac, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 220, 20));

        txtceduladoc.setEditable(false);
        panelNice1.add(txtceduladoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 220, 20));

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("NOMBRE DEL DOCTOR:");
        panelNice1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, 20));

        txtapellidosdoc.setEditable(false);
        panelNice1.add(txtapellidosdoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 220, 20));

        btncargar.setText("Cargar Datos");
        panelNice1.add(btncargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("MOTIVO:");
        panelNice1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, -1, -1));

        jPanel2.add(panelNice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 480, 490));

        panelNice2.setBackground(new java.awt.Color(90, 166, 166));
        panelNice2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtblcitas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID CITA", "FECHA CITA", "HORA", "MOTIVO"
            }
        ));
        jScrollPane1.setViewportView(jtblcitas);

        panelNice2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 600, 560));

        jPanel2.add(panelNice2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 630, 600));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icons/LOGO DENTAL daniela san martin -1_opt (2).png"))); // NOI18N
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 380, 140));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1193, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnACTU;
    private javax.swing.JButton btnAgendar1;
    private javax.swing.JButton btnELIM;
    private javax.swing.JButton btncargar;
    private javax.swing.JDialog dialogbuscar;
    private javax.swing.JDialog dialogpac;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jareades;
    private com.toedter.calendar.JDateChooser jdateFecha;
    private javax.swing.JTable jtblcitas;
    private org.edisoncor.gui.panel.PanelNice panelNice1;
    private org.edisoncor.gui.panel.PanelNice panelNice2;
    private javax.swing.JTable tbldoctor;
    private javax.swing.JTable tblpac;
    private jtextfieldround.JTextFieldRound txtApellidosPac;
    private jtextfieldround.JTextFieldRound txtNombrePac;
    private jtextfieldround.JTextFieldRound txtNombredoc;
    private jtextfieldround.JTextFieldRound txtapellidosdoc;
    private javax.swing.JTextField txtbuscardoc;
    private javax.swing.JTextField txtbuscarpac;
    private jtextfieldround.JTextFieldRound txtceduladoc;
    private jtextfieldround.JTextFieldRound txtcedulapac;
    private jtextfieldround.JTextFieldRound txtficha;
    private jtextfieldround.JTextFieldRound txthora;
    // End of variables declaration//GEN-END:variables

    
    
    
    public JButton getBtnACTU() {
        return btnACTU;
    }

    public void setBtnACTU(JButton btnACTU) {
        this.btnACTU = btnACTU;
    }

    public JButton getBtnAgendar1() {
        return btnAgendar1;
    }

    public void setBtnAgendar1(JButton btnAgendar1) {
        this.btnAgendar1 = btnAgendar1;
    }

    public JButton getBtnELIM() {
        return btnELIM;
    }

    public void setBtnELIM(JButton btnELIM) {
        this.btnELIM = btnELIM;
    }

    public JTextArea getJareades() {
        return jareades;
    }

    public void setJareades(JTextArea jareades) {
        this.jareades = jareades;
    }

    public JDateChooser getJdateFecha() {
        return jdateFecha;
    }

    public void setJdateFecha(JDateChooser jdateFecha) {
        this.jdateFecha = jdateFecha;
    }

    public JTable getJtblcitas() {
        return jtblcitas;
    }

    public void setJtblcitas(JTable jtblcitas) {
        this.jtblcitas = jtblcitas;
    }

    public JTextFieldRound getTxtApellidosPac() {
        return txtApellidosPac;
    }

    public void setTxtApellidosPac(JTextFieldRound txtApellidosPac) {
        this.txtApellidosPac = txtApellidosPac;
    }

    public JTextFieldRound getTxtNombrePac() {
        return txtNombrePac;
    }

    public void setTxtNombrePac(JTextFieldRound txtNombrePac) {
        this.txtNombrePac = txtNombrePac;
    }

    public JTextFieldRound getTxtNombredoc() {
        return txtNombredoc;
    }

    public void setTxtNombredoc(JTextFieldRound txtNombredoc) {
        this.txtNombredoc = txtNombredoc;
    }

    public JTextFieldRound getTxtceduladoc() {
        return txtceduladoc;
    }

    public void setTxtceduladoc(JTextFieldRound txtceduladoc) {
        this.txtceduladoc = txtceduladoc;
    }

    public JTextFieldRound getTxtcedulapac() {
        return txtcedulapac;
    }

    public void setTxtcedulapac(JTextFieldRound txtcedulapac) {
        this.txtcedulapac = txtcedulapac;
    }

    public JTextFieldRound getTxtficha() {
        return txtficha;
    }

    public void setTxtficha(JTextFieldRound txtficha) {
        this.txtficha = txtficha;
    }

    public JTextFieldRound getTxthora() {
        return txthora;
    }

    public void setTxthora(JTextFieldRound txthora) {
        this.txthora = txthora;
    }



    public JDialog getDialogbuscar() {
        return dialogbuscar;
    }

    public void setDialogbuscar(JDialog dialogbuscar) {
        this.dialogbuscar = dialogbuscar;
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

    

    public JTable getTbldoctor() {
        return tbldoctor;
    }

    public void setTbldoctor(JTable tbldoctor) {
        this.tbldoctor = tbldoctor;
    }

    public JTextField getTxtbuscardoc() {
        return txtbuscardoc;
    }

    public void setTxtbuscardoc(JTextField txtbuscardoc) {
        this.txtbuscardoc = txtbuscardoc;
    }

   

    public JButton getBtncargar() {
        return btncargar;
    }

    public void setBtncargar(JButton btncargar) {
        this.btncargar = btncargar;
    }

    public JTextFieldRound getTxtapellidosdoc() {
        return txtapellidosdoc;
    }

    public void setTxtapellidosdoc(JTextFieldRound txtapellidosdoc) {
        this.txtapellidosdoc = txtapellidosdoc;
    }

    

    

    
    


}
