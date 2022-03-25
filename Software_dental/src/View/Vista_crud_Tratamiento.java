/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextArea;
import jtextfieldround.JTextFieldRound;
import org.edisoncor.gui.button.ButtonRound;

/**
 *
 * @author Usuario
 */
public class Vista_crud_Tratamiento extends javax.swing.JInternalFrame {

    /**
     * Creates new form Vista_crud_Tratamiento
     */
    public Vista_crud_Tratamiento() {
        initComponents();
    }

    public JButton getBtnEditar() {
        return btnEditar;
    }

    public void setBtnEditar(JButton btnEditar) {
        this.btnEditar = btnEditar;
    }

    public JButton getBtnEliminar() {
        return btnEliminar;
    }

    public void setBtnEliminar(JButton btnEliminar) {
        this.btnEliminar = btnEliminar;
    }

    public JButton getBtnGuardar() {
        return btnGuardar;
    }

    public void setBtnGuardar(JButton btnGuardar) {
        this.btnGuardar = btnGuardar;
    }

    public JTable getTblListaTrat() {
        return tblListaTrat;
    }

    public void setTblListaTrat(JTable tblListaTrat) {
        this.tblListaTrat = tblListaTrat;
    }

    public JTextArea getTxtADescripTrat() {
        return txtADescripTrat;
    }

    public void setTxtADescripTrat(JTextArea txtADescripTrat) {
        this.txtADescripTrat = txtADescripTrat;
    }

    public JTextFieldRound getTxtBuscar() {
        return txtBuscar;
    }

    public void setTxtBuscar(JTextFieldRound txtBuscar) {
        this.txtBuscar = txtBuscar;
    }


    public JTextFieldRound getTxtNomTratamiento() {
        return txtNomTratamiento;
    }

    public void setTxtNomTratamiento(JTextFieldRound txtNomTratamiento) {
        this.txtNomTratamiento = txtNomTratamiento;
    }

    public JTextFieldRound getTxtPrecioTrat() {
        return txtPrecioTrat;
    }

    public void setTxtPrecioTrat(JTextFieldRound txtPrecioTrat) {
        this.txtPrecioTrat = txtPrecioTrat;
    }

    public JTextFieldRound getTxtTipMatTrat() {
        return txtTipMatTrat;
    }

    public void setTxtTipMatTrat(JTextFieldRound txtTipMatTrat) {
        this.txtTipMatTrat = txtTipMatTrat;
    }

   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelNice1 = new org.edisoncor.gui.panel.PanelNice();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNomTratamiento = new jtextfieldround.JTextFieldRound();
        txtPrecioTrat = new jtextfieldround.JTextFieldRound();
        txtTipMatTrat = new jtextfieldround.JTextFieldRound();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtADescripTrat = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        panelNice2 = new org.edisoncor.gui.panel.PanelNice();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblListaTrat = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtBuscar = new jtextfieldround.JTextFieldRound();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelNice1.setBackground(new java.awt.Color(166, 104, 216));
        panelNice1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NOMBRE DEL TRATAMIENTO:");
        panelNice1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PRECIO:");
        panelNice1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("TIPO DE MATERIAL:");
        panelNice1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));
        panelNice1.add(txtNomTratamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 310, -1));
        panelNice1.add(txtPrecioTrat, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 310, -1));
        panelNice1.add(txtTipMatTrat, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 310, -1));

        txtADescripTrat.setColumns(20);
        txtADescripTrat.setRows(5);
        jScrollPane1.setViewportView(txtADescripTrat);

        panelNice1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 90, 330, 110));

        jLabel8.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("DESCRIPCION:");
        panelNice1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 50, -1, 20));

        btnGuardar.setText("GUARDAR");
        panelNice1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 160, 40));

        btnEditar.setText("EDITAR");
        panelNice1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 160, 40));

        jLabel10.setFont(new java.awt.Font("SF Pro Display", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("REGISTRO DE TRATAMIENTOS");
        panelNice1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, -1, -1));

        btnEliminar.setText("ELIMINAR");
        panelNice1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 290, 160, 40));

        jPanel1.add(panelNice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 1140, 350));

        panelNice2.setBackground(new java.awt.Color(90, 166, 166));
        panelNice2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblListaTrat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Material", "Descripcion", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblListaTrat);
        if (tblListaTrat.getColumnModel().getColumnCount() > 0) {
            tblListaTrat.getColumnModel().getColumn(0).setResizable(false);
            tblListaTrat.getColumnModel().getColumn(1).setResizable(false);
            tblListaTrat.getColumnModel().getColumn(2).setResizable(false);
            tblListaTrat.getColumnModel().getColumn(3).setResizable(false);
            tblListaTrat.getColumnModel().getColumn(4).setResizable(false);
        }

        panelNice2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 57, 1070, 240));

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Buscar");
        panelNice2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 14, -1, 20));
        panelNice2.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 980, -1));

        jPanel1.add(panelNice2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 1140, 310));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private org.edisoncor.gui.panel.PanelNice panelNice1;
    private org.edisoncor.gui.panel.PanelNice panelNice2;
    private javax.swing.JTable tblListaTrat;
    private javax.swing.JTextArea txtADescripTrat;
    private jtextfieldround.JTextFieldRound txtBuscar;
    private jtextfieldround.JTextFieldRound txtNomTratamiento;
    private jtextfieldround.JTextFieldRound txtPrecioTrat;
    private jtextfieldround.JTextFieldRound txtTipMatTrat;
    // End of variables declaration//GEN-END:variables
}
