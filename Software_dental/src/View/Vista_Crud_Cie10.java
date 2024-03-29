/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;
import jtextfieldround.JTextFieldRound;

/**
 *
 * @author slix0
 */
public class Vista_Crud_Cie10 extends javax.swing.JInternalFrame{

    /**
     * Creates new form Vista_Crud_Cie10
     */
    public Vista_Crud_Cie10() {
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

        jPanel1 = new javax.swing.JPanel();
        panelNice1 = new org.edisoncor.gui.panel.PanelNice();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtcodigocie = new jtextfieldround.JTextFieldRound();
        txtitulo = new jtextfieldround.JTextFieldRound();
        btneliminar = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        btneditar = new javax.swing.JButton();
        cbcate = new javax.swing.JComboBox<>();
        btnimprimircie = new javax.swing.JButton();
        panelNice2 = new org.edisoncor.gui.panel.PanelNice();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblListacie = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtbusquedacie = new jtextfieldround.JTextFieldRound();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelNice1.setBackground(new java.awt.Color(166, 104, 216));
        panelNice1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("SF Pro Display", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Código CIE10:");
        panelNice1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("SF Pro Display", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Categoria:");
        panelNice1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("SF Pro Display", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Titulo Código: ");
        panelNice1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, -1, -1));
        panelNice1.add(txtcodigocie, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 410, 40));
        panelNice1.add(txtitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 410, 40));

        btneliminar.setText("ELIMINAR");
        panelNice1.add(btneliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 160, 40));

        btnguardar.setText("GUARDAR");
        panelNice1.add(btnguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 160, 40));

        btneditar.setText("LIMPIAR");
        panelNice1.add(btneditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 190, 160, 40));

        cbcate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbcate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Prevención", "Operativo", "Endodoncia", "Periodoncia", "Cirugía" }));
        panelNice1.add(cbcate, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, 410, 40));

        btnimprimircie.setText("IMPRIMIR");
        panelNice1.add(btnimprimircie, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 190, 140, 40));

        jPanel1.add(panelNice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 1070, 260));

        panelNice2.setBackground(new java.awt.Color(90, 166, 166));
        panelNice2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblListacie.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo CIE", "Categoria", "Titulo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblListacie);

        panelNice2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 990, 320));

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Buscar");
        panelNice2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));
        panelNice2.add(txtbusquedacie, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 910, -1));

        jPanel1.add(panelNice2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 1070, 390));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btneditar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnimprimircie;
    private javax.swing.JComboBox<String> cbcate;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private org.edisoncor.gui.panel.PanelNice panelNice1;
    private org.edisoncor.gui.panel.PanelNice panelNice2;
    public static javax.swing.JTable tblListacie;
    private jtextfieldround.JTextFieldRound txtbusquedacie;
    private jtextfieldround.JTextFieldRound txtcodigocie;
    private jtextfieldround.JTextFieldRound txtitulo;
    // End of variables declaration//GEN-END:variables

    public JButton getBtneditar() {
        return btneditar;
    }

    public void setBtneditar(JButton btneditar) {
        this.btneditar = btneditar;
    }

    public JButton getBtneliminar() {
        return btneliminar;
    }

    public void setBtneliminar(JButton btneliminar) {
        this.btneliminar = btneliminar;
    }

    public JButton getBtnguardar() {
        return btnguardar;
    }

    public void setBtnguardar(JButton btnguardar) {
        this.btnguardar = btnguardar;
    }

    public JTextFieldRound getCboxtipopato() {
        return txtitulo;
    }

    public void setCboxtipopato(JTextFieldRound cboxtipopato) {
        this.txtitulo = cboxtipopato;
    }


    public JTextFieldRound getTxtcodigocie() {
        return txtcodigocie;
    }

    public void setTxtcodigocie(JTextFieldRound txtcodigocie) {
        this.txtcodigocie = txtcodigocie;
    }

    public JTextFieldRound getTxttitulocie() {
        return txtitulo;
    }

    public void setTxttitulocie(JTextFieldRound txttitulocie) {
        this.txtitulo = txttitulocie;
    }

    public JTable getTblListacie() {
        return tblListacie;
    }

    public void setTblListacie(JTable tblListacie) {
        this.tblListacie = tblListacie;
    }

    public JTextFieldRound getTxtbusquedacie() {
        return txtbusquedacie;
    }

    public void setTxtbusquedacie(JTextFieldRound txtbusquedacie) {
        this.txtbusquedacie = txtbusquedacie;
    }

    public JComboBox<String> getCbcate() {
        return cbcate;
    }

    public void setCbcate(JComboBox<String> cbcate) {
        this.cbcate = cbcate;
    }

    public JTextFieldRound getTxtitulo() {
        return txtitulo;
    }

    public void setTxtitulo(JTextFieldRound txtitulo) {
        this.txtitulo = txtitulo;
    }

    public JButton getBtnimprimircie() {
        return btnimprimircie;
    }

    public void setBtnimprimircie(JButton btnimprimircie) {
        this.btnimprimircie = btnimprimircie;
    }


}
