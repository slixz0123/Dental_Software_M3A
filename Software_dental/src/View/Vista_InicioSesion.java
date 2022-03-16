
package View;

import javax.swing.JButton;
import javax.swing.JLabel;
import jtextfieldround.JPasswordFieldRound;
import jtextfieldround.JTextFieldRound;


public class Vista_InicioSesion extends javax.swing.JFrame {

    public Vista_InicioSesion() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordFieldRoundBeanInfo1 = new jtextfieldround.JPasswordFieldRoundBeanInfo();
        jPanel1 = new javax.swing.JPanel();
        panelNice1 = new org.edisoncor.gui.panel.PanelNice();
        jLabel17 = new javax.swing.JLabel();
        txtUsuario = new jtextfieldround.JTextFieldRound();
        txtContrasena = new jtextfieldround.JPasswordFieldRound();
        btnAceptar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        panelNice2 = new org.edisoncor.gui.panel.PanelNice();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblSalir = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(166, 104, 216));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelNice1.setBackground(new java.awt.Color(255, 255, 255));
        panelNice1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelNice1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icons/LOGO DENTAL daniela san martin -1_opt (2).png"))); // NOI18N
        panelNice1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 420, 150));
        panelNice1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 290, 30));
        panelNice1.add(txtContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 290, 30));

        btnAceptar.setBackground(new java.awt.Color(166, 104, 216));
        btnAceptar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptar.setText("Aceptar");
        btnAceptar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelNice1.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 280, 30));

        jLabel2.setBackground(new java.awt.Color(166, 104, 216));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(166, 104, 216));
        jLabel2.setText("Aceptar");
        panelNice1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 110, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Registrar Usuario ?");
        panelNice1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 110, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icons/contrasena.png"))); // NOI18N
        panelNice1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 30, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icons/usuarios (1).png"))); // NOI18N
        panelNice1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 30, 30));

        jPanel1.add(panelNice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, 430, 484));

        panelNice2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icons/doctores.png"))); // NOI18N

        javax.swing.GroupLayout panelNice2Layout = new javax.swing.GroupLayout(panelNice2);
        panelNice2.setLayout(panelNice2Layout);
        panelNice2Layout.setHorizontalGroup(
            panelNice2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNice2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        panelNice2Layout.setVerticalGroup(
            panelNice2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNice2Layout.createSequentialGroup()
                .addContainerGap(108, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jPanel1.add(panelNice2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 480, 540));

        jPanel2.setBackground(new java.awt.Color(90, 166, 166));

        lblSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icons/botonsalir.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 917, Short.MAX_VALUE)
                .addComponent(lblSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(lblSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 950, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JButton getBtnAceptar() {
        return btnAceptar;
    }

    public void setBtnAceptar(JButton btnAceptar) {
        this.btnAceptar = btnAceptar;
    }

    public JPasswordFieldRound getTxtContrasena() {
        return txtContrasena;
    }

    public void setTxtContrasena(JPasswordFieldRound txtContrasena) {
        this.txtContrasena = txtContrasena;
    }

    public JTextFieldRound getTxtUsuario() {
        return txtUsuario;
    }

    public void setTxtUsuario(JTextFieldRound txtUsuario) {
        this.txtUsuario = txtUsuario;
    }

    public JLabel getLblSalir() {
        return lblSalir;
    }

    public void setLblSalir(JLabel lblSalir) {
        this.lblSalir = lblSalir;
    }
    
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private jtextfieldround.JPasswordFieldRoundBeanInfo jPasswordFieldRoundBeanInfo1;
    private javax.swing.JLabel lblSalir;
    private org.edisoncor.gui.panel.PanelNice panelNice1;
    private org.edisoncor.gui.panel.PanelNice panelNice2;
    private jtextfieldround.JPasswordFieldRound txtContrasena;
    private jtextfieldround.JTextFieldRound txtUsuario;
    // End of variables declaration//GEN-END:variables
}
