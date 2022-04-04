/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import jtextfieldround.JTextFieldRound;

/**
 *
 * @author slix0
 */
public class Vista_Rep_Citas extends javax.swing.JInternalFrame {

    /**
     * Creates new form Vista_Rep_Citas
     */
    public Vista_Rep_Citas() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtbuscar = new jtextfieldround.JTextFieldRound();
        btnimprimir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtbllistadopac = new javax.swing.JTable();
        radiobnespecifico = new javax.swing.JRadioButton();
        radiobtngeneral = new javax.swing.JRadioButton();
        btnrepcitas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        panelNice2.setBackground(new java.awt.Color(166, 104, 216));
        panelNice2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("SF Pro Display", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("BUSCAR POR NOMBRE O CEDULA");
        panelNice2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, 30));

        jLabel3.setFont(new java.awt.Font("SF Pro Display", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Reporte de citas");
        panelNice2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 180, -1));
        panelNice2.add(txtbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 830, 30));

        btnimprimir.setText("Imprimir");
        panelNice2.add(btnimprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 580, 570, 50));

        jtbllistadopac.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cedula", "Nombres", "Apellidos", "Celular", "Direccion", "Ciudad", "Genero", "Foto", "Fecha Nac", "Tipo sangre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jtbllistadopac);

        panelNice2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 1080, 430));

        radiobnespecifico.setForeground(new java.awt.Color(255, 255, 255));
        radiobnespecifico.setText("Especifico");
        panelNice2.add(radiobnespecifico, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, -1, -1));

        radiobtngeneral.setForeground(new java.awt.Color(255, 255, 255));
        radiobtngeneral.setText("General");
        panelNice2.add(radiobtngeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, -1, -1));

        btnrepcitas.setText("Consultar");
        panelNice2.add(btnrepcitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 60, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(panelNice2, javax.swing.GroupLayout.PREFERRED_SIZE, 1112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelNice2, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnimprimir;
    private javax.swing.JButton btnrepcitas;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtbllistadopac;
    private org.edisoncor.gui.panel.PanelNice panelNice2;
    private javax.swing.JRadioButton radiobnespecifico;
    private javax.swing.JRadioButton radiobtngeneral;
    private jtextfieldround.JTextFieldRound txtbuscar;
    // End of variables declaration//GEN-END:variables

    public JButton getBtnrepcitas() {
        return btnrepcitas;
    }

    public void setBtnrepcitas(JButton btnrepcitas) {
        this.btnrepcitas = btnrepcitas;
    }

    public JTable getJtbllistadopac() {
        return jtbllistadopac;
    }

    public void setJtbllistadopac(JTable jtbllistadopac) {
        this.jtbllistadopac = jtbllistadopac;
    }

    public JRadioButton getRadiobnespecifico() {
        return radiobnespecifico;
    }

    public void setRadiobnespecifico(JRadioButton radiobnespecifico) {
        this.radiobnespecifico = radiobnespecifico;
    }

    public JRadioButton getRadiobtngeneral() {
        return radiobtngeneral;
    }

    public void setRadiobtngeneral(JRadioButton radiobtngeneral) {
        this.radiobtngeneral = radiobtngeneral;
    }

    public JTextFieldRound getTxtbuscar() {
        return txtbuscar;
    }

    public void setTxtbuscar(JTextFieldRound txtbuscar) {
        this.txtbuscar = txtbuscar;
    }

    public JButton getBtnimprimir() {
        return btnimprimir;
    }

    public void setBtnimprimir(JButton btnimprimir) {
        this.btnimprimir = btnimprimir;
    }

}
