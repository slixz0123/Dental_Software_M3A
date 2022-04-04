/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import javax.swing.JPanel;

/**
 *
 * @author slix0
 */
public class Vista_Reportes extends javax.swing.JInternalFrame {

    /**
     * Creates new form Vista_Reportes
     */
    public Vista_Reportes() {
        initComponents();
    }

    public JPanel getPnListTrat() {
        return PnListTrat;
    }

    public void setPnListTrat(JPanel PnListTrat) {
        this.PnListTrat = PnListTrat;
    }

    public JPanel getPnListfarm() {
        return PnListfarm;
    }

    public void setPnListfarm(JPanel PnListfarm) {
        this.PnListfarm = PnListfarm;
    }

    public JPanel getOnCitas() {
        return onCitas;
    }

    public void setOnCitas(JPanel onCitas) {
        this.onCitas = onCitas;
    }

    public JPanel getPnHistClinica() {
        return pnHistClinica;
    }

    public void setPnHistClinica(JPanel pnHistClinica) {
        this.pnHistClinica = pnHistClinica;
    }

    public JPanel getPnHistOdonto() {
        return pnHistOdonto;
    }

    public void setPnHistOdonto(JPanel pnHistOdonto) {
        this.pnHistOdonto = pnHistOdonto;
    }

    public JPanel getPnListEsp() {
        return pnListEsp;
    }

    public void setPnListEsp(JPanel pnListEsp) {
        this.pnListEsp = pnListEsp;
    }

    public JPanel getPnListPac() {
        return pnListPac;
    }

    public void setPnListPac(JPanel pnListPac) {
        this.pnListPac = pnListPac;
    }

    public JPanel getPnodontogram() {
        return pnodontogram;
    }

    public void setPnodontogram(JPanel pnodontogram) {
        this.pnodontogram = pnodontogram;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelNice2 = new org.edisoncor.gui.panel.PanelNice();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        pnListPac = new javax.swing.JPanel();
        pnListEsp = new javax.swing.JPanel();
        PnListfarm = new javax.swing.JPanel();
        PnListTrat = new javax.swing.JPanel();
        onCitas = new javax.swing.JPanel();
        pnHistOdonto = new javax.swing.JPanel();
        pnHistClinica = new javax.swing.JPanel();
        pnodontogram = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelNice2.setBackground(new java.awt.Color(255, 255, 255));
        panelNice2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        pnListPac.setBackground(new java.awt.Color(255, 255, 255));
        pnListPac.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnListPacLayout = new javax.swing.GroupLayout(pnListPac);
        pnListPac.setLayout(pnListPacLayout);
        pnListPacLayout.setHorizontalGroup(
            pnListPacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1159, Short.MAX_VALUE)
        );
        pnListPacLayout.setVerticalGroup(
            pnListPacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 664, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Listado Pacientes", pnListPac);

        pnListEsp.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnListEspLayout = new javax.swing.GroupLayout(pnListEsp);
        pnListEsp.setLayout(pnListEspLayout);
        pnListEspLayout.setHorizontalGroup(
            pnListEspLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1159, Short.MAX_VALUE)
        );
        pnListEspLayout.setVerticalGroup(
            pnListEspLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 664, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Listado Especialistas", pnListEsp);

        PnListfarm.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PnListfarmLayout = new javax.swing.GroupLayout(PnListfarm);
        PnListfarm.setLayout(PnListfarmLayout);
        PnListfarmLayout.setHorizontalGroup(
            PnListfarmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1159, Short.MAX_VALUE)
        );
        PnListfarmLayout.setVerticalGroup(
            PnListfarmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 664, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Listado Farmacos", PnListfarm);

        PnListTrat.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PnListTratLayout = new javax.swing.GroupLayout(PnListTrat);
        PnListTrat.setLayout(PnListTratLayout);
        PnListTratLayout.setHorizontalGroup(
            PnListTratLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1159, Short.MAX_VALUE)
        );
        PnListTratLayout.setVerticalGroup(
            PnListTratLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 664, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Listado Tratamientos", PnListTrat);

        onCitas.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout onCitasLayout = new javax.swing.GroupLayout(onCitas);
        onCitas.setLayout(onCitasLayout);
        onCitasLayout.setHorizontalGroup(
            onCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1159, Short.MAX_VALUE)
        );
        onCitasLayout.setVerticalGroup(
            onCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 664, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Citas", onCitas);

        pnHistOdonto.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnHistOdontoLayout = new javax.swing.GroupLayout(pnHistOdonto);
        pnHistOdonto.setLayout(pnHistOdontoLayout);
        pnHistOdontoLayout.setHorizontalGroup(
            pnHistOdontoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1159, Short.MAX_VALUE)
        );
        pnHistOdontoLayout.setVerticalGroup(
            pnHistOdontoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 664, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Historial Odontologico", pnHistOdonto);

        pnHistClinica.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnHistClinicaLayout = new javax.swing.GroupLayout(pnHistClinica);
        pnHistClinica.setLayout(pnHistClinicaLayout);
        pnHistClinicaLayout.setHorizontalGroup(
            pnHistClinicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1159, Short.MAX_VALUE)
        );
        pnHistClinicaLayout.setVerticalGroup(
            pnHistClinicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 664, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Historia Clinica", pnHistClinica);

        pnodontogram.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnodontogramLayout = new javax.swing.GroupLayout(pnodontogram);
        pnodontogram.setLayout(pnodontogramLayout);
        pnodontogramLayout.setHorizontalGroup(
            pnodontogramLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1159, Short.MAX_VALUE)
        );
        pnodontogramLayout.setVerticalGroup(
            pnodontogramLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 664, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Odontograma", pnodontogram);

        panelNice2.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 1180, 710));

        jPanel1.add(panelNice2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1160, 710));

        jLabel3.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Reportes Odontologicos");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 330, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PnListTrat;
    private javax.swing.JPanel PnListfarm;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel onCitas;
    private org.edisoncor.gui.panel.PanelNice panelNice2;
    private javax.swing.JPanel pnHistClinica;
    private javax.swing.JPanel pnHistOdonto;
    private javax.swing.JPanel pnListEsp;
    private javax.swing.JPanel pnListPac;
    private javax.swing.JPanel pnodontogram;
    // End of variables declaration//GEN-END:variables
}
