/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import org.edisoncor.gui.panel.Panel;

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

    public JLabel getLabelapellido() {
        return labelapellido;
    }

    public void setLabelapellido(JLabel labelapellido) {
        this.labelapellido = labelapellido;
    }

    public JLabel getLblnombrescomp() {
        return lblnombrescomp;
    }

    public void setLblnombrescomp(JLabel lblnombrescomp) {
        this.lblnombrescomp = lblnombrescomp;
    }

    public JLabel getLblIdpac() {
        return lblIdpac;
    }

    public void setLblIdpac(JLabel lblIdpac) {
        this.lblIdpac = lblIdpac;
    }

    public JLabel getLblCedulapac() {
        return lblCedulapac;
    }

    public void setLblCedulapac(JLabel lblCedulapac) {
        this.lblCedulapac = lblCedulapac;
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
        return lbl_CitasTratamientos;
    }

    public void setLbl_Contabilidad(JLabel lbl_Contabilidad) {
        this.lbl_CitasTratamientos = lbl_Contabilidad;
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

    public JLabel getLblNuevoEsp() {
        return lblNuevoEsp;
    }

    public void setLblNuevoEsp(JLabel lblNuevoEsp) {
        this.lblNuevoEsp = lblNuevoEsp;
    }

    public JLabel getLbl_CitasTratamientos() {
        return lbl_CitasTratamientos;
    }

    public void setLbl_CitasTratamientos(JLabel lbl_CitasTratamientos) {
        this.lbl_CitasTratamientos = lbl_CitasTratamientos;
    }

    public JLabel getLbl_Diagnostico() {
        return lbl_Diagnostico;
    }

    public void setLbl_Diagnostico(JLabel lbl_Diagnostico) {
        this.lbl_Diagnostico = lbl_Diagnostico;
    }

    public JLabel getLbl_NuevaEndodoncia() {
        return lbl_NuevaEndodoncia;
    }

    public void setLbl_NuevaEndodoncia(JLabel lbl_NuevaEndodoncia) {
        this.lbl_NuevaEndodoncia = lbl_NuevaEndodoncia;
    }

    public JButton getBtnagendaCitas() {
        return btnagendaCitas;
    }

    public void setBtnagendaCitas(JButton btnagendaCitas) {
        this.btnagendaCitas = btnagendaCitas;
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
        lblCrud_Paciente = new javax.swing.JLabel();
        panelCurves1 = new org.edisoncor.gui.panel.PanelCurves();
        lblNuevoEsp = new javax.swing.JLabel();
        lbl_CrudTratamiento = new javax.swing.JLabel();
        lbl_CrudFarmacos = new javax.swing.JLabel();
        lbl_CrudCie = new javax.swing.JLabel();
        lbl_historialCliniico = new javax.swing.JLabel();
        lbl_Agendarcitas = new javax.swing.JLabel();
        lbl_NuevaEndodoncia = new javax.swing.JLabel();
        lbl_Diagnostico = new javax.swing.JLabel();
        lbl_CitasTratamientos = new javax.swing.JLabel();
        lbl_Cotizacion = new javax.swing.JLabel();
        lbl_Certificado = new javax.swing.JLabel();
        lbl_Contabilidad1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        dkpPrincipal = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        panelRound1 = new org.edisoncor.gui.panel.PanelRound();
        jLabel2 = new javax.swing.JLabel();
        lblnombrescomp = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblCedulapac = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnagendaCitas = new javax.swing.JButton();
        lblIdpac = new javax.swing.JLabel();
        labelapellido = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

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
        labelini.setText("Proceso               ");
        labelini.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        MenuDesplegable.add(labelini);
        labelini.setBounds(-2, 10, 170, 60);

        lblCrud_Paciente.setForeground(new java.awt.Color(255, 255, 255));
        lblCrud_Paciente.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCrud_Paciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icons/dolor-de-muelas.png"))); // NOI18N
        lblCrud_Paciente.setText("Nuevo Paciente     ");
        lblCrud_Paciente.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        MenuDesplegable.add(lblCrud_Paciente);
        lblCrud_Paciente.setBounds(0, 70, 170, 30);

        panelCurves1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNuevoEsp.setBackground(new java.awt.Color(255, 255, 255));
        lblNuevoEsp.setForeground(new java.awt.Color(255, 255, 255));
        lblNuevoEsp.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNuevoEsp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icons/dentista.png"))); // NOI18N
        lblNuevoEsp.setText("Nuevo Especialista ");
        lblNuevoEsp.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        panelCurves1.add(lblNuevoEsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 170, 40));

        lbl_CrudTratamiento.setForeground(new java.awt.Color(255, 255, 255));
        lbl_CrudTratamiento.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_CrudTratamiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icons/herramientas-de-dentista.png"))); // NOI18N
        lbl_CrudTratamiento.setText("Nuevo Tratamiento ");
        lbl_CrudTratamiento.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        panelCurves1.add(lbl_CrudTratamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 170, 30));

        lbl_CrudFarmacos.setForeground(new java.awt.Color(255, 255, 255));
        lbl_CrudFarmacos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_CrudFarmacos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icons/farmaco.png"))); // NOI18N
        lbl_CrudFarmacos.setText("Registro farmacos  ");
        lbl_CrudFarmacos.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        panelCurves1.add(lbl_CrudFarmacos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 160, 30));

        lbl_CrudCie.setForeground(new java.awt.Color(255, 255, 255));
        lbl_CrudCie.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_CrudCie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icons/Copia de certificado.png"))); // NOI18N
        lbl_CrudCie.setText("Registro CIE-10     ");
        lbl_CrudCie.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        panelCurves1.add(lbl_CrudCie, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 160, 30));

        lbl_historialCliniico.setForeground(new java.awt.Color(255, 255, 255));
        lbl_historialCliniico.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_historialCliniico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icons/Copia de chequeo-dental.png"))); // NOI18N
        lbl_historialCliniico.setText("Historial Clinico     ");
        lbl_historialCliniico.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        panelCurves1.add(lbl_historialCliniico, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 160, 30));

        lbl_Agendarcitas.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Agendarcitas.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_Agendarcitas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icons/registro-dental.png"))); // NOI18N
        lbl_Agendarcitas.setText("Agendar de citas     ");
        lbl_Agendarcitas.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        panelCurves1.add(lbl_Agendarcitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 170, 40));

        lbl_NuevaEndodoncia.setForeground(new java.awt.Color(255, 255, 255));
        lbl_NuevaEndodoncia.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_NuevaEndodoncia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icons/perforacion.png"))); // NOI18N
        lbl_NuevaEndodoncia.setText("Nueva Endodoncia");
        lbl_NuevaEndodoncia.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        panelCurves1.add(lbl_NuevaEndodoncia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 160, 40));

        lbl_Diagnostico.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Diagnostico.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_Diagnostico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icons/diagnostico.png"))); // NOI18N
        lbl_Diagnostico.setText("Diagnostico            ");
        lbl_Diagnostico.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        panelCurves1.add(lbl_Diagnostico, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 160, 40));

        lbl_CitasTratamientos.setForeground(new java.awt.Color(255, 255, 255));
        lbl_CitasTratamientos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_CitasTratamientos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icons/tratamiento.png"))); // NOI18N
        lbl_CitasTratamientos.setText("Citas y Tratamiento");
        lbl_CitasTratamientos.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        panelCurves1.add(lbl_CitasTratamientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 160, 40));

        lbl_Cotizacion.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Cotizacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_Cotizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icons/chequeo-dental.png"))); // NOI18N
        lbl_Cotizacion.setText("Cotizacion             ");
        lbl_Cotizacion.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        panelCurves1.add(lbl_Cotizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, 160, 40));

        lbl_Certificado.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Certificado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_Certificado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icons/certificado.png"))); // NOI18N
        lbl_Certificado.setText("Certificacion          ");
        lbl_Certificado.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        panelCurves1.add(lbl_Certificado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, 160, 40));

        lbl_Contabilidad1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Contabilidad1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_Contabilidad1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icons/informacion-financiera.png"))); // NOI18N
        lbl_Contabilidad1.setText("Contablidad          ");
        lbl_Contabilidad1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        panelCurves1.add(lbl_Contabilidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 630, 160, 40));
        panelCurves1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 170, -1));
        panelCurves1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 670, 170, -1));
        panelCurves1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 170, -1));
        panelCurves1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 170, -1));
        panelCurves1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 170, -1));
        panelCurves1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 170, -1));
        panelCurves1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 170, -1));
        panelCurves1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 170, -1));
        panelCurves1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 170, -1));
        panelCurves1.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 170, -1));
        panelCurves1.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 170, -1));
        panelCurves1.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 102, 170, 60));
        panelCurves1.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 170, -1));
        panelCurves1.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 620, 170, -1));

        MenuDesplegable.add(panelCurves1);
        panelCurves1.setBounds(0, 0, 170, 810);
        MenuDesplegable.add(jSeparator12);
        jSeparator12.setBounds(0, 60, 170, 60);

        jPanel1.add(MenuDesplegable);
        MenuDesplegable.setBounds(0, 0, 170, 850);

        dkpPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icons/LOGO DENTAL daniela san martin -1_opt (1).png"))); // NOI18N

        dkpPrincipal.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout dkpPrincipalLayout = new javax.swing.GroupLayout(dkpPrincipal);
        dkpPrincipal.setLayout(dkpPrincipalLayout);
        dkpPrincipalLayout.setHorizontalGroup(
            dkpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dkpPrincipalLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        dkpPrincipalLayout.setVerticalGroup(
            dkpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dkpPrincipalLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );

        jPanel1.add(dkpPrincipal);
        dkpPrincipal.setBounds(170, 50, 1170, 760);

        panelRound1.setColorPrimario(new java.awt.Color(103, 58, 137));
        panelRound1.setColorSecundario(new java.awt.Color(103, 58, 137));

        jLabel2.setFont(new java.awt.Font("SF Pro Display", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Paciente:");

        lblnombrescomp.setFont(new java.awt.Font("SF Pro Display", 0, 18)); // NOI18N
        lblnombrescomp.setForeground(new java.awt.Color(255, 255, 255));
        lblnombrescomp.setText("...");

        jLabel4.setFont(new java.awt.Font("SF Pro Display", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cedula:");

        lblCedulapac.setFont(new java.awt.Font("SF Pro Display", 0, 18)); // NOI18N
        lblCedulapac.setForeground(new java.awt.Color(255, 255, 255));
        lblCedulapac.setText("0111111111");

        jButton1.setText("Listado Pacientes");

        btnagendaCitas.setText("Agenda de citas");

        lblIdpac.setFont(new java.awt.Font("SF Pro Display", 0, 18)); // NOI18N
        lblIdpac.setForeground(new java.awt.Color(255, 255, 255));
        lblIdpac.setText("...");

        labelapellido.setForeground(new java.awt.Color(255, 255, 255));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblnombrescomp, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(lblCedulapac, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnagendaCitas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblIdpac, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblnombrescomp)
                    .addComponent(jLabel4)
                    .addComponent(lblCedulapac)
                    .addComponent(jButton1)
                    .addComponent(btnagendaCitas)
                    .addComponent(lblIdpac)
                    .addComponent(labelapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        jPanel1.add(panelRound1);
        panelRound1.setBounds(200, -60, 1150, 110);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1396, Short.MAX_VALUE)
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
    private javax.swing.JButton btnagendaCitas;
    private javax.swing.JDesktopPane dkpPrincipal;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel labelapellido;
    private javax.swing.JLabel labelini;
    private javax.swing.JLabel lblCedulapac;
    private javax.swing.JLabel lblCrud_Paciente;
    private javax.swing.JLabel lblIdpac;
    private javax.swing.JLabel lblNuevoEsp;
    private javax.swing.JLabel lbl_Agendarcitas;
    private javax.swing.JLabel lbl_Certificado;
    private javax.swing.JLabel lbl_CitasTratamientos;
    private javax.swing.JLabel lbl_Contabilidad1;
    private javax.swing.JLabel lbl_Cotizacion;
    private javax.swing.JLabel lbl_CrudCie;
    private javax.swing.JLabel lbl_CrudFarmacos;
    private javax.swing.JLabel lbl_CrudTratamiento;
    private javax.swing.JLabel lbl_Diagnostico;
    private javax.swing.JLabel lbl_NuevaEndodoncia;
    private javax.swing.JLabel lbl_historialCliniico;
    private javax.swing.JLabel lblnombrescomp;
    private org.edisoncor.gui.panel.PanelCurves panelCurves1;
    private org.edisoncor.gui.panel.PanelRound panelRound1;
    // End of variables declaration//GEN-END:variables
}
