/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextArea;

/**
 *
 * @author Saul
 */
public class Odontograma extends javax.swing.JInternalFrame {

    /**
     * Creates new form Odontograma
     */
    public Odontograma() {
        initComponents();
    }

    public static JButton getBtnnuevo() {
        return btnnuevo;
    }

    public static void setBtnnuevo(JButton btnnuevo) {
        Odontograma.btnnuevo = btnnuevo;
    }

    public static JComboBox<String> getSelecOpcion() {
        return selecOpcion;
    }

    public static void setSelecOpcion(JComboBox<String> selecOpcion) {
        Odontograma.selecOpcion = selecOpcion;
    }

    public static JButton getBtnAstericoAzul() {
        return btnAstericoAzul;
    }

    public static void setBtnAstericoAzul(JButton btnAstericoAzul) {
        Odontograma.btnAstericoAzul = btnAstericoAzul;
    }

    public static JButton getBtnAstericoRojo() {
        return btnAstericoRojo;
    }

    public static void setBtnAstericoRojo(JButton btnAstericoRojo) {
        Odontograma.btnAstericoRojo = btnAstericoRojo;
    }

    public static JButton getBtnCirculoAzul() {
        return btnCirculoAzul;
    }

    public static void setBtnCirculoAzul(JButton btnCirculoAzul) {
        Odontograma.btnCirculoAzul = btnCirculoAzul;
    }

    public static JButton getBtnCirculoRojo() {
        return btnCirculoRojo;
    }

    public static void setBtnCirculoRojo(JButton btnCirculoRojo) {
        Odontograma.btnCirculoRojo = btnCirculoRojo;
    }

    public static JButton getBtnS() {
        return btnS;
    }

    public static void setBtnS(JButton btnS) {
        Odontograma.btnS = btnS;
    }

    public static JButton getBtnTriangulo() {
        return btnTriangulo;
    }

    public static void setBtnTriangulo(JButton btnTriangulo) {
        Odontograma.btnTriangulo = btnTriangulo;
    }

    public static JButton getBtnXazul() {
        return btnXazul;
    }

    public static void setBtnXazul(JButton btnXazul) {
        Odontograma.btnXazul = btnXazul;
    }

    public static JButton getBtnXrojo() {
        return btnXrojo;
    }

    public static void setBtnXrojo(JButton btnXrojo) {
        Odontograma.btnXrojo = btnXrojo;
    }

    public JButton getBtnguardar() {
        return btnguardar;
    }

    public void setBtnguardar(JButton btnguardar) {
        this.btnguardar = btnguardar;
    }

    public static JButton getBtnlineacontinua() {
        return btnlineacontinua;
    }

    public static void setBtnlineacontinua(JButton btnlineacontinua) {
        Odontograma.btnlineacontinua = btnlineacontinua;
    }

    public static JButton getBtnlineaentrecortada() {
        return btnlineaentrecortada;
    }

    public static void setBtnlineaentrecortada(JButton btnlineaentrecortada) {
        Odontograma.btnlineaentrecortada = btnlineaentrecortada;
    }

    public JPanel getPanelod() {
        return panelod;
    }

    public void setPanelod(JPanel panelod) {
        this.panelod = panelod;
    }

    public JDialog getDialogOdonto() {
        return dialogOdonto;
    }

    public void setDialogOdonto(JDialog dialogOdonto) {
        this.dialogOdonto = dialogOdonto;
    }

    public JTable getTblOdontograma() {
        return tblOdontograma;
    }

    public void setTblOdontograma(JTable tblOdontograma) {
        this.tblOdontograma = tblOdontograma;
    }

    public JTextArea getTxtobservaciones() {
        return txtobservaciones;
    }

    public void setTxtobservaciones(JTextArea txtobservaciones) {
        this.txtobservaciones = txtobservaciones;
    }

    public JLabel getPruebalbl() {
        return pruebalbl;
    }

    public void setPruebalbl(JLabel pruebalbl) {
        this.pruebalbl = pruebalbl;
    }

   

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogOdonto = new javax.swing.JDialog();
        panelNice2 = new org.edisoncor.gui.panel.PanelNice();
        jLabel4 = new javax.swing.JLabel();
        btnCirculoAzul = new javax.swing.JButton();
        btnCirculoRojo = new javax.swing.JButton();
        btnTriangulo = new javax.swing.JButton();
        btnAstericoAzul = new javax.swing.JButton();
        btnlineacontinua = new javax.swing.JButton();
        btnlineaentrecortada = new javax.swing.JButton();
        btnAstericoRojo = new javax.swing.JButton();
        btnS = new javax.swing.JButton();
        btnXazul = new javax.swing.JButton();
        btnXrojo = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        selecOpcion = new javax.swing.JComboBox<>();
        btnnuevo = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblOdontograma = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtobservaciones = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        panelNice1 = new org.edisoncor.gui.panel.PanelNice();
        panelod = new javax.swing.JPanel();
        pruebalbl = new javax.swing.JLabel();

        javax.swing.GroupLayout dialogOdontoLayout = new javax.swing.GroupLayout(dialogOdonto.getContentPane());
        dialogOdonto.getContentPane().setLayout(dialogOdontoLayout);
        dialogOdontoLayout.setHorizontalGroup(
            dialogOdontoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        dialogOdontoLayout.setVerticalGroup(
            dialogOdontoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        panelNice2.setBackground(new java.awt.Color(90, 166, 166));
        panelNice2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Herramientas");
        panelNice2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        btnCirculoAzul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icons/iconos_odonto/circulo_azul.png"))); // NOI18N
        btnCirculoAzul.setDefaultCapable(false);
        panelNice2.add(btnCirculoAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, -1));

        btnCirculoRojo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icons/iconos_odonto/circulo_rojo.png"))); // NOI18N
        btnCirculoRojo.setDefaultCapable(false);
        panelNice2.add(btnCirculoRojo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, -1, -1));

        btnTriangulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icons/iconos_odonto/triangulo.png"))); // NOI18N
        btnTriangulo.setDefaultCapable(false);
        btnTriangulo.setPreferredSize(new java.awt.Dimension(61, 37));
        panelNice2.add(btnTriangulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        btnAstericoAzul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icons/iconos_odonto/asterisco_azul.png"))); // NOI18N
        btnAstericoAzul.setDefaultCapable(false);
        btnAstericoAzul.setPreferredSize(new java.awt.Dimension(61, 37));
        panelNice2.add(btnAstericoAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, -1, -1));

        btnlineacontinua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icons/iconos_odonto/linea_continua2.png"))); // NOI18N
        btnlineacontinua.setDefaultCapable(false);
        btnlineacontinua.setPreferredSize(new java.awt.Dimension(61, 37));
        panelNice2.add(btnlineacontinua, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, -1, -1));

        btnlineaentrecortada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icons/iconos_odonto/linea_entrecortada2.png"))); // NOI18N
        btnlineaentrecortada.setDefaultCapable(false);
        btnlineaentrecortada.setPreferredSize(new java.awt.Dimension(61, 37));
        panelNice2.add(btnlineaentrecortada, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, -1, -1));

        btnAstericoRojo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icons/iconos_odonto/asterisco_rojo.png"))); // NOI18N
        btnAstericoRojo.setDefaultCapable(false);
        btnAstericoRojo.setPreferredSize(new java.awt.Dimension(61, 37));
        panelNice2.add(btnAstericoRojo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, -1, -1));

        btnS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icons/iconos_odonto/S1.png"))); // NOI18N
        btnS.setDefaultCapable(false);
        btnS.setPreferredSize(new java.awt.Dimension(61, 37));
        panelNice2.add(btnS, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, -1, -1));

        btnXazul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icons/iconos_odonto/x_azul.png"))); // NOI18N
        btnXazul.setDefaultCapable(false);
        btnXazul.setPreferredSize(new java.awt.Dimension(61, 37));
        panelNice2.add(btnXazul, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        btnXrojo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icons/iconos_odonto/x_rojo.png"))); // NOI18N
        btnXrojo.setDefaultCapable(false);
        btnXrojo.setPreferredSize(new java.awt.Dimension(61, 37));
        panelNice2.add(btnXrojo, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, -1, -1));

        btnguardar.setText("Guardar");
        btnguardar.setDefaultCapable(false);
        btnguardar.setPreferredSize(new java.awt.Dimension(85, 30));
        panelNice2.add(btnguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, -1, -1));

        selecOpcion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Caries", "Buen Estado", "Fractura Dental", "Extraccion", "Restauracion Deficiente", "Dientes en erupcion" }));
        panelNice2.add(selecOpcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        btnnuevo.setText("Nuevo");
        btnnuevo.setDefaultCapable(false);
        btnnuevo.setPreferredSize(new java.awt.Dimension(85, 30));
        panelNice2.add(btnnuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, -1, -1));

        tblOdontograma.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Fecha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblOdontograma);
        if (tblOdontograma.getColumnModel().getColumnCount() > 0) {
            tblOdontograma.getColumnModel().getColumn(0).setMinWidth(30);
            tblOdontograma.getColumnModel().getColumn(0).setPreferredWidth(30);
            tblOdontograma.getColumnModel().getColumn(0).setMaxWidth(30);
        }

        panelNice2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, 150, 90));

        txtobservaciones.setColumns(20);
        txtobservaciones.setLineWrap(true);
        txtobservaciones.setRows(5);
        txtobservaciones.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txtobservaciones);

        panelNice2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 10, 190, 90));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Observaciones:");
        panelNice2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 10, -1, -1));

        panelNice1.setBackground(new java.awt.Color(166, 104, 216));
        panelNice1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelod.setBackground(new java.awt.Color(255, 255, 255));
        panelod.setPreferredSize(new java.awt.Dimension(1090, 498));

        pruebalbl.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        pruebalbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pruebalbl.setIconTextGap(0);
        pruebalbl.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout panelodLayout = new javax.swing.GroupLayout(panelod);
        panelod.setLayout(panelodLayout);
        panelodLayout.setHorizontalGroup(
            panelodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelodLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pruebalbl, javax.swing.GroupLayout.DEFAULT_SIZE, 1070, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelodLayout.setVerticalGroup(
            panelodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelodLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pruebalbl, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelNice1.add(panelod, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelNice2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelNice1, javax.swing.GroupLayout.DEFAULT_SIZE, 1194, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelNice1, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelNice2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnAstericoAzul;
    public static javax.swing.JButton btnAstericoRojo;
    public static javax.swing.JButton btnCirculoAzul;
    public static javax.swing.JButton btnCirculoRojo;
    public static javax.swing.JButton btnS;
    public static javax.swing.JButton btnTriangulo;
    public static javax.swing.JButton btnXazul;
    public static javax.swing.JButton btnXrojo;
    private javax.swing.JButton btnguardar;
    public static javax.swing.JButton btnlineacontinua;
    public static javax.swing.JButton btnlineaentrecortada;
    public static javax.swing.JButton btnnuevo;
    private javax.swing.JDialog dialogOdonto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private org.edisoncor.gui.panel.PanelNice panelNice1;
    private org.edisoncor.gui.panel.PanelNice panelNice2;
    private javax.swing.JPanel panelod;
    private javax.swing.JLabel pruebalbl;
    public static javax.swing.JComboBox<String> selecOpcion;
    private javax.swing.JTable tblOdontograma;
    private javax.swing.JTextArea txtobservaciones;
    // End of variables declaration//GEN-END:variables
}
