/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import com.toedter.calendar.JDateChooser;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author slix0
 */
public class Vista_AgendaCitas extends javax.swing.JInternalFrame {

    /**
     * Creates new form Vista_AgendaCitas
     */
    public Vista_AgendaCitas() {
        initComponents();
    }

    public JButton getBtnanterior() {
        return btnanterior;
    }

    public void setBtnanterior(JButton btnanterior) {
        this.btnanterior = btnanterior;
    }

    public JButton getBtnsiguiente() {
        return btnsiguiente;
    }

    public void setBtnsiguiente(JButton btnsiguiente) {
        this.btnsiguiente = btnsiguiente;
    }

    public JDateChooser getJdcSeleccionDia() {
        return jdcSeleccionDia;
    }

    public void setJdcSeleccionDia(JDateChooser jdcSeleccionDia) {
        this.jdcSeleccionDia = jdcSeleccionDia;
    }

    public JLabel getLabelfecha() {
        return labelfecha;
    }

    public void setLabelfecha(JLabel labelfecha) {
        this.labelfecha = labelfecha;
    }

    public JButton getBtnseleccionar() {
        return btnseleccionar;
    }

    public void setBtnseleccionar(JButton btnseleccionar) {
        this.btnseleccionar = btnseleccionar;
    }

    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelNice1 = new org.edisoncor.gui.panel.PanelNice();
        panelNice2 = new org.edisoncor.gui.panel.PanelNice();
        jLabelEscogerDia = new javax.swing.JLabel();
        jdcSeleccionDia = new com.toedter.calendar.JDateChooser();
        jLabelActividades = new javax.swing.JLabel();
        btnseleccionar = new javax.swing.JButton();
        panelNice3 = new org.edisoncor.gui.panel.PanelNice();
        btnanterior = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jButton00 = new javax.swing.JButton();
        jButton01 = new javax.swing.JButton();
        jButton02 = new javax.swing.JButton();
        jButton03 = new javax.swing.JButton();
        jButton04 = new javax.swing.JButton();
        jButton05 = new javax.swing.JButton();
        jButton06 = new javax.swing.JButton();
        jButton07 = new javax.swing.JButton();
        jButton08 = new javax.swing.JButton();
        jButton09 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        labelfecha = new javax.swing.JLabel();
        jLabelDia = new javax.swing.JLabel();
        jLabel23H = new javax.swing.JLabel();
        jLabelHora = new javax.swing.JLabel();
        jLabel0H = new javax.swing.JLabel();
        jLabel1H = new javax.swing.JLabel();
        jLabel2H = new javax.swing.JLabel();
        jLabel3H = new javax.swing.JLabel();
        jLabel4H = new javax.swing.JLabel();
        jLabel5H = new javax.swing.JLabel();
        jLabel6H = new javax.swing.JLabel();
        jLabel7H = new javax.swing.JLabel();
        jLabel8H = new javax.swing.JLabel();
        jLabel9H = new javax.swing.JLabel();
        jLabel10H = new javax.swing.JLabel();
        jLabel11H = new javax.swing.JLabel();
        jLabel12H = new javax.swing.JLabel();
        jLabel13H = new javax.swing.JLabel();
        jLabel14H = new javax.swing.JLabel();
        jLabel15H = new javax.swing.JLabel();
        jLabel16H = new javax.swing.JLabel();
        jLabel17H = new javax.swing.JLabel();
        jLabel18H = new javax.swing.JLabel();
        jLabel19H = new javax.swing.JLabel();
        jLabel20H = new javax.swing.JLabel();
        jLabel21H = new javax.swing.JLabel();
        jLabel22H = new javax.swing.JLabel();
        btnsiguiente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        panelNice1.setBackground(new java.awt.Color(90, 166, 166));
        panelNice1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelNice2.setBackground(new java.awt.Color(166, 104, 216));
        panelNice2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelEscogerDia.setFont(new java.awt.Font("SF Pro Display", 1, 36)); // NOI18N
        jLabelEscogerDia.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEscogerDia.setText("Seleccionar día: ");
        panelNice2.add(jLabelEscogerDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 270, -1));
        panelNice2.add(jdcSeleccionDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, 210, 40));

        jLabelActividades.setFont(new java.awt.Font("SF Pro Display", 1, 36)); // NOI18N
        jLabelActividades.setForeground(new java.awt.Color(255, 255, 255));
        jLabelActividades.setText("CALENDARIO DE CITAS MEDICAS ");
        panelNice2.add(jLabelActividades, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        btnseleccionar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnseleccionar.setText("SELECCIONAR");
        panelNice2.add(btnseleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 70, 210, 40));

        panelNice1.add(panelNice2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 1050, 130));

        panelNice3.setBackground(new java.awt.Color(166, 104, 216));
        panelNice3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelNice3.add(btnanterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 100, 90));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton00.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel2.add(jButton00, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 630, 70));

        jButton01.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel2.add(jButton01, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 630, 70));

        jButton02.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel2.add(jButton02, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 630, 70));

        jButton03.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel2.add(jButton03, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 630, 70));

        jButton04.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel2.add(jButton04, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 630, 70));

        jButton05.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel2.add(jButton05, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, 630, 70));

        jButton06.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel2.add(jButton06, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 500, 630, 70));

        jButton07.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel2.add(jButton07, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 570, 630, 70));

        jButton08.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel2.add(jButton08, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 640, 630, 70));

        jButton09.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel2.add(jButton09, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 710, 630, 70));

        jButton10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel2.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 780, 630, 70));

        jButton11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel2.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 850, 630, 70));

        jButton12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel2.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 920, 630, 70));

        jButton13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel2.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 990, 630, 70));

        jButton14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel2.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 1060, 630, 70));

        jButton15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel2.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 1130, 630, 70));

        jButton16.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel2.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 1200, 630, 70));

        jButton17.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel2.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 1270, 630, 70));

        jButton18.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel2.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 1340, 630, 70));

        jButton19.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel2.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 1410, 630, 70));

        jButton20.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel2.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 1480, 630, 70));

        jButton21.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel2.add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 1550, 630, 70));

        jButton22.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel2.add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 1620, 630, 70));

        jButton23.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel2.add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 1690, 630, 70));

        labelfecha.setFont(new java.awt.Font("Tahoma", 1, 52)); // NOI18N
        labelfecha.setForeground(new java.awt.Color(166, 104, 216));
        labelfecha.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelfecha.setToolTipText("");
        jPanel2.add(labelfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 360, 60));

        jLabelDia.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelDia.setForeground(new java.awt.Color(166, 104, 216));
        jLabelDia.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelDia.setText("Día:");
        jLabelDia.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        jPanel2.add(jLabelDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 630, 70));

        jLabel23H.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel23H.setForeground(new java.awt.Color(166, 104, 216));
        jLabel23H.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23H.setText("23H00");
        jLabel23H.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        jPanel2.add(jLabel23H, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1690, 150, 70));

        jLabelHora.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelHora.setForeground(new java.awt.Color(166, 104, 216));
        jLabelHora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelHora.setText("Hora");
        jLabelHora.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        jPanel2.add(jLabelHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, 70));

        jLabel0H.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel0H.setForeground(new java.awt.Color(166, 104, 216));
        jLabel0H.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel0H.setText("00H00");
        jLabel0H.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        jPanel2.add(jLabel0H, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 150, 70));

        jLabel1H.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1H.setForeground(new java.awt.Color(166, 104, 216));
        jLabel1H.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1H.setText("01H00");
        jLabel1H.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        jPanel2.add(jLabel1H, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 150, 70));

        jLabel2H.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2H.setForeground(new java.awt.Color(166, 104, 216));
        jLabel2H.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2H.setText("02H00");
        jLabel2H.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        jPanel2.add(jLabel2H, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 150, 70));

        jLabel3H.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3H.setForeground(new java.awt.Color(166, 104, 216));
        jLabel3H.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3H.setText("03H00");
        jLabel3H.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        jPanel2.add(jLabel3H, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 150, 70));

        jLabel4H.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4H.setForeground(new java.awt.Color(166, 104, 216));
        jLabel4H.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4H.setText("04H00");
        jLabel4H.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        jPanel2.add(jLabel4H, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 150, 70));

        jLabel5H.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5H.setForeground(new java.awt.Color(166, 104, 216));
        jLabel5H.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5H.setText("05H00");
        jLabel5H.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        jPanel2.add(jLabel5H, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 150, 70));

        jLabel6H.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6H.setForeground(new java.awt.Color(166, 104, 216));
        jLabel6H.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6H.setText("06H00");
        jLabel6H.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        jPanel2.add(jLabel6H, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 150, 70));

        jLabel7H.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7H.setForeground(new java.awt.Color(166, 104, 216));
        jLabel7H.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7H.setText("07H00");
        jLabel7H.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        jPanel2.add(jLabel7H, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 570, 150, 70));

        jLabel8H.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8H.setForeground(new java.awt.Color(166, 104, 216));
        jLabel8H.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8H.setText("08H00");
        jLabel8H.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        jPanel2.add(jLabel8H, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 640, 150, 70));

        jLabel9H.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9H.setForeground(new java.awt.Color(166, 104, 216));
        jLabel9H.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9H.setText("09H00");
        jLabel9H.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        jPanel2.add(jLabel9H, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 710, 150, 70));

        jLabel10H.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10H.setForeground(new java.awt.Color(166, 104, 216));
        jLabel10H.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10H.setText("10H00");
        jLabel10H.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        jPanel2.add(jLabel10H, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 780, 150, 70));

        jLabel11H.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11H.setForeground(new java.awt.Color(166, 104, 216));
        jLabel11H.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11H.setText("11H00");
        jLabel11H.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        jPanel2.add(jLabel11H, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 850, 150, 70));

        jLabel12H.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12H.setForeground(new java.awt.Color(166, 104, 216));
        jLabel12H.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12H.setText("12H00");
        jLabel12H.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        jPanel2.add(jLabel12H, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 920, 150, 70));

        jLabel13H.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13H.setForeground(new java.awt.Color(166, 104, 216));
        jLabel13H.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13H.setText("13H00");
        jLabel13H.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        jPanel2.add(jLabel13H, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 990, 150, 70));

        jLabel14H.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14H.setForeground(new java.awt.Color(166, 104, 216));
        jLabel14H.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14H.setText("14H00");
        jLabel14H.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        jPanel2.add(jLabel14H, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1060, 150, 70));

        jLabel15H.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel15H.setForeground(new java.awt.Color(166, 104, 216));
        jLabel15H.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15H.setText("15H00");
        jLabel15H.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        jPanel2.add(jLabel15H, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1130, 150, 70));

        jLabel16H.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel16H.setForeground(new java.awt.Color(166, 104, 216));
        jLabel16H.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16H.setText("16H00");
        jLabel16H.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        jPanel2.add(jLabel16H, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1200, 150, 70));

        jLabel17H.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel17H.setForeground(new java.awt.Color(166, 104, 216));
        jLabel17H.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17H.setText("17H00");
        jLabel17H.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        jPanel2.add(jLabel17H, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1270, 150, 70));

        jLabel18H.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel18H.setForeground(new java.awt.Color(166, 104, 216));
        jLabel18H.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18H.setText("18H00");
        jLabel18H.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        jPanel2.add(jLabel18H, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1340, 150, 70));

        jLabel19H.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel19H.setForeground(new java.awt.Color(166, 104, 216));
        jLabel19H.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19H.setText("19H00");
        jLabel19H.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        jPanel2.add(jLabel19H, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1410, 150, 70));

        jLabel20H.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel20H.setForeground(new java.awt.Color(166, 104, 216));
        jLabel20H.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20H.setText("20H00");
        jLabel20H.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        jPanel2.add(jLabel20H, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1480, 150, 70));

        jLabel21H.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel21H.setForeground(new java.awt.Color(166, 104, 216));
        jLabel21H.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21H.setText("21H00");
        jLabel21H.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        jPanel2.add(jLabel21H, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1550, 150, 70));

        jLabel22H.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel22H.setForeground(new java.awt.Color(166, 104, 216));
        jLabel22H.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22H.setText("22H00");
        jLabel22H.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        jPanel2.add(jLabel22H, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1620, 150, 70));

        jScrollPane1.setViewportView(jPanel2);

        panelNice3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 820, 420));
        panelNice3.add(btnsiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 20, 80, 90));

        panelNice1.add(panelNice3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 1050, 510));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelNice1, javax.swing.GroupLayout.PREFERRED_SIZE, 1127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(52, 52, 52)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 659, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panelNice1, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(15, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
    private javax.swing.JButton btnanterior;
    private javax.swing.JButton btnseleccionar;
    private javax.swing.JButton btnsiguiente;
    private javax.swing.JButton jButton00;
    private javax.swing.JButton jButton01;
    private javax.swing.JButton jButton02;
    private javax.swing.JButton jButton03;
    private javax.swing.JButton jButton04;
    private javax.swing.JButton jButton05;
    private javax.swing.JButton jButton06;
    private javax.swing.JButton jButton07;
    private javax.swing.JButton jButton08;
    private javax.swing.JButton jButton09;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JLabel jLabel0H;
    private javax.swing.JLabel jLabel10H;
    private javax.swing.JLabel jLabel11H;
    private javax.swing.JLabel jLabel12H;
    private javax.swing.JLabel jLabel13H;
    private javax.swing.JLabel jLabel14H;
    private javax.swing.JLabel jLabel15H;
    private javax.swing.JLabel jLabel16H;
    private javax.swing.JLabel jLabel17H;
    private javax.swing.JLabel jLabel18H;
    private javax.swing.JLabel jLabel19H;
    private javax.swing.JLabel jLabel1H;
    private javax.swing.JLabel jLabel20H;
    private javax.swing.JLabel jLabel21H;
    private javax.swing.JLabel jLabel22H;
    private javax.swing.JLabel jLabel23H;
    private javax.swing.JLabel jLabel2H;
    private javax.swing.JLabel jLabel3H;
    private javax.swing.JLabel jLabel4H;
    private javax.swing.JLabel jLabel5H;
    private javax.swing.JLabel jLabel6H;
    private javax.swing.JLabel jLabel7H;
    private javax.swing.JLabel jLabel8H;
    private javax.swing.JLabel jLabel9H;
    private javax.swing.JLabel jLabelActividades;
    private javax.swing.JLabel jLabelDia;
    private javax.swing.JLabel jLabelEscogerDia;
    private javax.swing.JLabel jLabelHora;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdcSeleccionDia;
    private javax.swing.JLabel labelfecha;
    private org.edisoncor.gui.panel.PanelNice panelNice1;
    private org.edisoncor.gui.panel.PanelNice panelNice2;
    private org.edisoncor.gui.panel.PanelNice panelNice3;
    // End of variables declaration//GEN-END:variables
}
