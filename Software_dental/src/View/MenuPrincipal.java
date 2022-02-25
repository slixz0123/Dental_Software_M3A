/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import org.edisoncor.gui.panel.Panel;
import org.edisoncor.gui.panel.PanelRect;

/**
 *
 * @author slix0
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
    }

    public Panel getMenuDesplegable() {
        return MenuDesplegable;
    }

    public void setMenuDesplegable(Panel MenuDesplegable) {
        this.MenuDesplegable = MenuDesplegable;
    }

    public JLabel getLabelini() {
        return labelini;
    }

    public void setLabelini(JLabel labelini) {
        this.labelini = labelini;
    }

    public JDesktopPane getDkpPrincipal() {
        return dkpPrincipal;
    }

    public void setDkpPrincipal(JDesktopPane dkpPrincipal) {
        this.dkpPrincipal = dkpPrincipal;
    }

    public JLabel getLblCrud_Paciente() {
        return lblCrud_Paciente;
    }

    public void setLblCrud_Paciente(JLabel lblCrud_Paciente) {
        this.lblCrud_Paciente = lblCrud_Paciente;
    }

    public JLabel getLbl_Agendarcitas() {
        return lbl_Agendarcitas;
    }

    public void setLbl_Agendarcitas(JLabel lbl_Agendarcitas) {
        this.lbl_Agendarcitas = lbl_Agendarcitas;
    }

    public JLabel getLbl_Certificado() {
        return lbl_Certificado;
    }

    public void setLbl_Certificado(JLabel lbl_Certificado) {
        this.lbl_Certificado = lbl_Certificado;
    }

    public JLabel getLbl_Contabilidad() {
        return lbl_Contabilidad;
    }

    public void setLbl_Contabilidad(JLabel lbl_Contabilidad) {
        this.lbl_Contabilidad = lbl_Contabilidad;
    }

    public JLabel getLbl_Cotizacion() {
        return lbl_Cotizacion;
    }

    public void setLbl_Cotizacion(JLabel lbl_Cotizacion) {
        this.lbl_Cotizacion = lbl_Cotizacion;
    }

    public JLabel getLbl_CrudCie() {
        return lbl_CrudCie;
    }

    public void setLbl_CrudCie(JLabel lbl_CrudCie) {
        this.lbl_CrudCie = lbl_CrudCie;
    }

    public JLabel getLbl_CrudFarmacos() {
        return lbl_CrudFarmacos;
    }

    public void setLbl_CrudFarmacos(JLabel lbl_CrudFarmacos) {
        this.lbl_CrudFarmacos = lbl_CrudFarmacos;
    }

    public JLabel getLbl_CrudTratamiento() {
        return lbl_CrudTratamiento;
    }

    public void setLbl_CrudTratamiento(JLabel lbl_CrudTratamiento) {
        this.lbl_CrudTratamiento = lbl_CrudTratamiento;
    }

    public JLabel getLbl_historialCliniico() {
        return lbl_historialCliniico;
    }

    public void setLbl_historialCliniico(JLabel lbl_historialCliniico) {
        this.lbl_historialCliniico = lbl_historialCliniico;
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
        MenuDesplegable = new org.edisoncor.gui.panel.Panel();
        labelini = new javax.swing.JLabel();
        lbl_Contabilidad = new javax.swing.JLabel();
        lblCrud_Paciente = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbl_CrudTratamiento = new javax.swing.JLabel();
        lbl_CrudFarmacos = new javax.swing.JLabel();
        lbl_Agendarcitas = new javax.swing.JLabel();
        lbl_historialCliniico = new javax.swing.JLabel();
        lbl_CrudCie = new javax.swing.JLabel();
        lbl_Cotizacion = new javax.swing.JLabel();
        lbl_Certificado = new javax.swing.JLabel();
        dkpPrincipal = new javax.swing.JDesktopPane();
        panelRect2 = new org.edisoncor.gui.panel.PanelRect();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        MenuDesplegable.setForeground(new java.awt.Color(255, 255, 255));
        MenuDesplegable.setColorPrimario(new java.awt.Color(103, 58, 137));
        MenuDesplegable.setColorSecundario(new java.awt.Color(89, 168, 165));
        MenuDesplegable.setLayout(null);

        labelini.setForeground(new java.awt.Color(255, 255, 255));
        labelini.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelini.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icons/brillante.png"))); // NOI18N
        labelini.setText("INICIO           ");
        labelini.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        MenuDesplegable.add(labelini);
        labelini.setBounds(-2, 10, 170, 60);

        lbl_Contabilidad.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Contabilidad.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_Contabilidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icons/informacion-financiera.png"))); // NOI18N
        lbl_Contabilidad.setText("Contablidad          ");
        lbl_Contabilidad.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        MenuDesplegable.add(lbl_Contabilidad);
        lbl_Contabilidad.setBounds(0, 620, 160, 50);

        lblCrud_Paciente.setForeground(new java.awt.Color(255, 255, 255));
        lblCrud_Paciente.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCrud_Paciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icons/dolor-de-muelas.png"))); // NOI18N
        lblCrud_Paciente.setText("Nuevo Paciente     ");
        lblCrud_Paciente.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        MenuDesplegable.add(lblCrud_Paciente);
        lblCrud_Paciente.setBounds(0, 110, 160, 50);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icons/dentista.png"))); // NOI18N
        jLabel3.setText("Nuevo Especialista ");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        MenuDesplegable.add(jLabel3);
        jLabel3.setBounds(0, 170, 160, 50);

        lbl_CrudTratamiento.setForeground(new java.awt.Color(255, 255, 255));
        lbl_CrudTratamiento.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_CrudTratamiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icons/herramientas-de-dentista.png"))); // NOI18N
        lbl_CrudTratamiento.setText("Nuevo Tratamiento ");
        lbl_CrudTratamiento.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        MenuDesplegable.add(lbl_CrudTratamiento);
        lbl_CrudTratamiento.setBounds(0, 220, 160, 50);

        lbl_CrudFarmacos.setForeground(new java.awt.Color(255, 255, 255));
        lbl_CrudFarmacos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_CrudFarmacos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icons/farmaco.png"))); // NOI18N
        lbl_CrudFarmacos.setText("Registro farmacos  ");
        lbl_CrudFarmacos.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        MenuDesplegable.add(lbl_CrudFarmacos);
        lbl_CrudFarmacos.setBounds(0, 270, 160, 50);

        lbl_Agendarcitas.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Agendarcitas.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_Agendarcitas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icons/registro-dental.png"))); // NOI18N
        lbl_Agendarcitas.setText("Agenda de citas     ");
        lbl_Agendarcitas.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        MenuDesplegable.add(lbl_Agendarcitas);
        lbl_Agendarcitas.setBounds(0, 440, 160, 50);

        lbl_historialCliniico.setForeground(new java.awt.Color(255, 255, 255));
        lbl_historialCliniico.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_historialCliniico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icons/Copia de chequeo-dental.png"))); // NOI18N
        lbl_historialCliniico.setText("Historial Clinico     ");
        lbl_historialCliniico.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        MenuDesplegable.add(lbl_historialCliniico);
        lbl_historialCliniico.setBounds(0, 380, 160, 50);

        lbl_CrudCie.setForeground(new java.awt.Color(255, 255, 255));
        lbl_CrudCie.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_CrudCie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icons/Copia de certificado.png"))); // NOI18N
        lbl_CrudCie.setText("Registro CIE-10     ");
        lbl_CrudCie.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        MenuDesplegable.add(lbl_CrudCie);
        lbl_CrudCie.setBounds(0, 320, 160, 50);

        lbl_Cotizacion.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Cotizacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_Cotizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icons/chequeo-dental.png"))); // NOI18N
        lbl_Cotizacion.setText("Cotizacion             ");
        lbl_Cotizacion.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        MenuDesplegable.add(lbl_Cotizacion);
        lbl_Cotizacion.setBounds(0, 500, 160, 50);

        lbl_Certificado.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Certificado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_Certificado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icons/certificado.png"))); // NOI18N
        lbl_Certificado.setText("Certificacion          ");
        lbl_Certificado.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        MenuDesplegable.add(lbl_Certificado);
        lbl_Certificado.setBounds(0, 560, 160, 50);

        jPanel1.add(MenuDesplegable);
        MenuDesplegable.setBounds(0, 0, 170, 850);

        dkpPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout dkpPrincipalLayout = new javax.swing.GroupLayout(dkpPrincipal);
        dkpPrincipal.setLayout(dkpPrincipalLayout);
        dkpPrincipalLayout.setHorizontalGroup(
            dkpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1410, Short.MAX_VALUE)
        );
        dkpPrincipalLayout.setVerticalGroup(
            dkpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );

        jPanel1.add(dkpPrincipal);
        dkpPrincipal.setBounds(60, 30, 1410, 760);

        panelRect2.setAnchoDeBorde(0.0F);
        panelRect2.setAnchoDeSegundoBorde(0.0F);
        panelRect2.setColorPrimario(new java.awt.Color(103, 58, 137));
        panelRect2.setColorSecundario(new java.awt.Color(89, 168, 165));

        javax.swing.GroupLayout panelRect2Layout = new javax.swing.GroupLayout(panelRect2);
        panelRect2.setLayout(panelRect2Layout);
        panelRect2Layout.setHorizontalGroup(
            panelRect2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1420, Short.MAX_VALUE)
        );
        panelRect2Layout.setVerticalGroup(
            panelRect2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel1.add(panelRect2);
        panelRect2.setBounds(40, -10, 1420, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1462, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 813, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.panel.Panel MenuDesplegable;
    private javax.swing.JDesktopPane dkpPrincipal;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelini;
    private javax.swing.JLabel lblCrud_Paciente;
    private javax.swing.JLabel lbl_Agendarcitas;
    private javax.swing.JLabel lbl_Certificado;
    private javax.swing.JLabel lbl_Contabilidad;
    private javax.swing.JLabel lbl_Cotizacion;
    private javax.swing.JLabel lbl_CrudCie;
    private javax.swing.JLabel lbl_CrudFarmacos;
    private javax.swing.JLabel lbl_CrudTratamiento;
    private javax.swing.JLabel lbl_historialCliniico;
    private org.edisoncor.gui.panel.PanelRect panelRect2;
    // End of variables declaration//GEN-END:variables
}
