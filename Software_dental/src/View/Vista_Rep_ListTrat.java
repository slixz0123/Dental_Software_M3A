/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import javax.swing.JButton;
import javax.swing.JTable;
import jtextfieldround.JTextFieldRound;

/**
 *
 * @author slix0
 */
public class Vista_Rep_ListTrat extends javax.swing.JInternalFrame {

    /**
     * Creates new form Vista_Rep_ListTrat
     */
    public Vista_Rep_ListTrat() {
        initComponents();
    }

    public JButton getBtnRefrescar() {
        return btnRefrescar;
    }

    public void setBtnRefrescar(JButton btnRefrescar) {
        this.btnRefrescar = btnRefrescar;
    }
    
    

    public JButton getBtnImprimir() {
        return btnImprimir;
    }

    public void setBtnImprimir(JButton btnImprimir) {
        this.btnImprimir = btnImprimir;
    }

    public JTable getTblTratamientos() {
        return tblTratamientos;
    }

    public void setTblTratamientos(JTable tblTratamientos) {
        this.tblTratamientos = tblTratamientos;
    }

    public JTextFieldRound getTxtbuscar() {
        return txtbuscar;
    }

    public void setTxtbuscar(JTextFieldRound txtbuscar) {
        this.txtbuscar = txtbuscar;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelNice2 = new org.edisoncor.gui.panel.PanelNice();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtbuscar = new jtextfieldround.JTextFieldRound();
        btnImprimir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTratamientos = new javax.swing.JTable();
        btnRefrescar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelNice2.setBackground(new java.awt.Color(166, 104, 216));
        panelNice2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("SF Pro Display", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("BUSCAR POR NOMBRE ");
        panelNice2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, 30));

        jLabel3.setFont(new java.awt.Font("SF Pro Display", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("LISTADO DE TRATAMIENTOS");
        panelNice2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, -1, -1));
        panelNice2.add(txtbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 830, 30));

        btnImprimir.setText("Imprimir");
        panelNice2.add(btnImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 580, 570, 50));

        tblTratamientos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Tipo Material", "Descripcion", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblTratamientos);

        panelNice2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 90, 1060, 450));

        btnRefrescar.setText("Refrescar");
        panelNice2.add(btnRefrescar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelNice2, javax.swing.GroupLayout.PREFERRED_SIZE, 1119, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnRefrescar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private org.edisoncor.gui.panel.PanelNice panelNice2;
    private javax.swing.JTable tblTratamientos;
    private jtextfieldround.JTextFieldRound txtbuscar;
    // End of variables declaration//GEN-END:variables
}
