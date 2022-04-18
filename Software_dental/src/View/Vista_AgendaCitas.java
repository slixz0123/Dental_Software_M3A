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
import javax.swing.JTable;

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

   
    public JTable getTb7am() {
        return tb7am;
    }

    public void setTb7am(JTable tb7am) {
        this.tb7am = tb7am;
    }

   

    
    public JLabel getLb7am() {
        return lb7am;
    }

    public void setLb7am(JLabel lb7am) {
        this.lb7am = lb7am;
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
        labelfecha = new javax.swing.JLabel();
        jLabelDia = new javax.swing.JLabel();
        jLabelHora = new javax.swing.JLabel();
        lb7am = new javax.swing.JLabel();
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
        jLabel7H1 = new javax.swing.JLabel();
        jLabel8H1 = new javax.swing.JLabel();
        jLabel9H1 = new javax.swing.JLabel();
        jLabel10H1 = new javax.swing.JLabel();
        jLabel11H1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tb7am = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tb7am1 = new javax.swing.JTable();
        jScrollPane20 = new javax.swing.JScrollPane();
        tb7am2 = new javax.swing.JTable();
        jScrollPane21 = new javax.swing.JScrollPane();
        tb7am3 = new javax.swing.JTable();
        jScrollPane22 = new javax.swing.JScrollPane();
        tb7am4 = new javax.swing.JTable();
        jScrollPane23 = new javax.swing.JScrollPane();
        tb7am5 = new javax.swing.JTable();
        jScrollPane24 = new javax.swing.JScrollPane();
        tb7am6 = new javax.swing.JTable();
        jScrollPane25 = new javax.swing.JScrollPane();
        tb7am7 = new javax.swing.JTable();
        jScrollPane26 = new javax.swing.JScrollPane();
        tb7am8 = new javax.swing.JTable();
        jScrollPane27 = new javax.swing.JScrollPane();
        tb7am9 = new javax.swing.JTable();
        jScrollPane28 = new javax.swing.JScrollPane();
        tb7am10 = new javax.swing.JTable();
        jScrollPane29 = new javax.swing.JScrollPane();
        tb7am11 = new javax.swing.JTable();
        jScrollPane30 = new javax.swing.JScrollPane();
        tb7am12 = new javax.swing.JTable();
        jScrollPane31 = new javax.swing.JScrollPane();
        tb7am13 = new javax.swing.JTable();
        jScrollPane32 = new javax.swing.JScrollPane();
        tb7am14 = new javax.swing.JTable();
        jScrollPane33 = new javax.swing.JScrollPane();
        tb7am15 = new javax.swing.JTable();
        btnsiguiente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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

        jLabelHora.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelHora.setForeground(new java.awt.Color(166, 104, 216));
        jLabelHora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelHora.setText("Hora");
        jLabelHora.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        jPanel2.add(jLabelHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, 70));

        lb7am.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lb7am.setForeground(new java.awt.Color(166, 104, 216));
        lb7am.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb7am.setText("07:00");
        lb7am.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        jPanel2.add(lb7am, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 150, 70));

        jLabel8H.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8H.setForeground(new java.awt.Color(166, 104, 216));
        jLabel8H.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8H.setText("08:00");
        jLabel8H.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        jPanel2.add(jLabel8H, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 150, 70));

        jLabel9H.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9H.setForeground(new java.awt.Color(166, 104, 216));
        jLabel9H.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9H.setText("09:00");
        jLabel9H.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        jPanel2.add(jLabel9H, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 150, 70));

        jLabel10H.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10H.setForeground(new java.awt.Color(166, 104, 216));
        jLabel10H.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10H.setText("10:00");
        jLabel10H.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        jPanel2.add(jLabel10H, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 150, 70));

        jLabel11H.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11H.setForeground(new java.awt.Color(166, 104, 216));
        jLabel11H.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11H.setText("11:00");
        jLabel11H.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        jPanel2.add(jLabel11H, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 150, 70));

        jLabel12H.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12H.setForeground(new java.awt.Color(166, 104, 216));
        jLabel12H.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12H.setText("17:00");
        jLabel12H.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        jPanel2.add(jLabel12H, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 780, 150, 70));

        jLabel13H.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13H.setForeground(new java.awt.Color(166, 104, 216));
        jLabel13H.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13H.setText("18:00");
        jLabel13H.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        jPanel2.add(jLabel13H, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 850, 150, 70));

        jLabel14H.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14H.setForeground(new java.awt.Color(166, 104, 216));
        jLabel14H.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14H.setText("19:00");
        jLabel14H.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        jPanel2.add(jLabel14H, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 920, 150, 70));

        jLabel15H.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel15H.setForeground(new java.awt.Color(166, 104, 216));
        jLabel15H.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15H.setText("20:00");
        jLabel15H.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        jPanel2.add(jLabel15H, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 990, 150, 70));

        jLabel16H.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel16H.setForeground(new java.awt.Color(166, 104, 216));
        jLabel16H.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16H.setText("21:00");
        jLabel16H.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        jPanel2.add(jLabel16H, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1060, 150, 70));

        jLabel17H.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel17H.setForeground(new java.awt.Color(166, 104, 216));
        jLabel17H.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17H.setText("22:00");
        jLabel17H.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        jPanel2.add(jLabel17H, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1130, 150, 70));

        jLabel7H1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7H1.setForeground(new java.awt.Color(166, 104, 216));
        jLabel7H1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7H1.setText("12:00");
        jLabel7H1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        jPanel2.add(jLabel7H1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 150, 70));

        jLabel8H1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8H1.setForeground(new java.awt.Color(166, 104, 216));
        jLabel8H1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8H1.setText("13:00");
        jLabel8H1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        jPanel2.add(jLabel8H1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 150, 70));

        jLabel9H1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9H1.setForeground(new java.awt.Color(166, 104, 216));
        jLabel9H1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9H1.setText("14:00 ");
        jLabel9H1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        jPanel2.add(jLabel9H1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 570, 150, 70));

        jLabel10H1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10H1.setForeground(new java.awt.Color(166, 104, 216));
        jLabel10H1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10H1.setText("15:00");
        jLabel10H1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        jPanel2.add(jLabel10H1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 640, 150, 70));

        jLabel11H1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11H1.setForeground(new java.awt.Color(166, 104, 216));
        jLabel11H1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11H1.setText("16:00");
        jLabel11H1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        jPanel2.add(jLabel11H1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 710, 150, 70));

        tb7am.setBackground(new java.awt.Color(90, 166, 166));
        tb7am.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 0, 0), new java.awt.Color(255, 102, 102), new java.awt.Color(255, 0, 0), new java.awt.Color(255, 51, 51)));
        tb7am.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombres", "Hora", "Motivo", "Medico Tratante"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb7am.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tb7am.setSelectionBackground(new java.awt.Color(166, 104, 216));
        tb7am.setShowGrid(true);
        jScrollPane3.setViewportView(tb7am);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 630, 70));

        tb7am1.setBackground(new java.awt.Color(90, 166, 166));
        tb7am1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombres", "Hora", "Motivo", "Medico Tratante"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb7am1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tb7am1.setSelectionBackground(new java.awt.Color(166, 104, 216));
        tb7am1.setShowGrid(true);
        jScrollPane4.setViewportView(tb7am1);

        jPanel2.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 630, 70));

        tb7am2.setBackground(new java.awt.Color(90, 166, 166));
        tb7am2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombres", "Hora", "Motivo", "Medico Tratante"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb7am2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tb7am2.setSelectionBackground(new java.awt.Color(166, 104, 216));
        tb7am2.setShowGrid(true);
        jScrollPane20.setViewportView(tb7am2);

        jPanel2.add(jScrollPane20, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 630, 70));

        tb7am3.setBackground(new java.awt.Color(90, 166, 166));
        tb7am3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombres", "Hora", "Motivo", "Medico Tratante"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb7am3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tb7am3.setSelectionBackground(new java.awt.Color(166, 104, 216));
        tb7am3.setShowGrid(true);
        jScrollPane21.setViewportView(tb7am3);

        jPanel2.add(jScrollPane21, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 630, 70));

        tb7am4.setBackground(new java.awt.Color(90, 166, 166));
        tb7am4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombres", "Hora", "Motivo", "Medico Tratante"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb7am4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tb7am4.setSelectionBackground(new java.awt.Color(166, 104, 216));
        tb7am4.setShowGrid(true);
        jScrollPane22.setViewportView(tb7am4);

        jPanel2.add(jScrollPane22, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 630, 70));

        tb7am5.setBackground(new java.awt.Color(90, 166, 166));
        tb7am5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombres", "Hora", "Motivo", "Medico Tratante"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb7am5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tb7am5.setSelectionBackground(new java.awt.Color(166, 104, 216));
        tb7am5.setShowGrid(true);
        jScrollPane23.setViewportView(tb7am5);

        jPanel2.add(jScrollPane23, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 640, 630, 70));

        tb7am6.setBackground(new java.awt.Color(90, 166, 166));
        tb7am6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombres", "Hora", "Motivo", "Medico Tratante"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb7am6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tb7am6.setSelectionBackground(new java.awt.Color(166, 104, 216));
        tb7am6.setShowGrid(true);
        jScrollPane24.setViewportView(tb7am6);

        jPanel2.add(jScrollPane24, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, 630, 70));

        tb7am7.setBackground(new java.awt.Color(90, 166, 166));
        tb7am7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombres", "Hora", "Motivo", "Medico Tratante"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb7am7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tb7am7.setSelectionBackground(new java.awt.Color(166, 104, 216));
        tb7am7.setShowGrid(true);
        jScrollPane25.setViewportView(tb7am7);

        jPanel2.add(jScrollPane25, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 570, 630, 70));

        tb7am8.setBackground(new java.awt.Color(90, 166, 166));
        tb7am8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombres", "Hora", "Motivo", "Medico Tratante"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb7am8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tb7am8.setSelectionBackground(new java.awt.Color(166, 104, 216));
        tb7am8.setShowGrid(true);
        jScrollPane26.setViewportView(tb7am8);

        jPanel2.add(jScrollPane26, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 500, 630, 70));

        tb7am9.setBackground(new java.awt.Color(90, 166, 166));
        tb7am9.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombres", "Hora", "Motivo", "Medico Tratante"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb7am9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tb7am9.setSelectionBackground(new java.awt.Color(166, 104, 216));
        tb7am9.setShowGrid(true);
        jScrollPane27.setViewportView(tb7am9);

        jPanel2.add(jScrollPane27, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 710, 630, 70));

        tb7am10.setBackground(new java.awt.Color(90, 166, 166));
        tb7am10.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombres", "Hora", "Motivo", "Medico Tratante"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb7am10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tb7am10.setSelectionBackground(new java.awt.Color(166, 104, 216));
        tb7am10.setShowGrid(true);
        jScrollPane28.setViewportView(tb7am10);

        jPanel2.add(jScrollPane28, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 850, 630, 70));

        tb7am11.setBackground(new java.awt.Color(90, 166, 166));
        tb7am11.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombres", "Hora", "Motivo", "Medico Tratante"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb7am11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tb7am11.setSelectionBackground(new java.awt.Color(166, 104, 216));
        tb7am11.setShowGrid(true);
        jScrollPane29.setViewportView(tb7am11);

        jPanel2.add(jScrollPane29, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 920, 630, 70));

        tb7am12.setBackground(new java.awt.Color(90, 166, 166));
        tb7am12.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombres", "Hora", "Motivo", "Medico Tratante"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb7am12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tb7am12.setSelectionBackground(new java.awt.Color(166, 104, 216));
        tb7am12.setShowGrid(true);
        jScrollPane30.setViewportView(tb7am12);

        jPanel2.add(jScrollPane30, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 780, 630, 70));

        tb7am13.setBackground(new java.awt.Color(90, 166, 166));
        tb7am13.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombres", "Hora", "Motivo", "Medico Tratante"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb7am13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tb7am13.setSelectionBackground(new java.awt.Color(166, 104, 216));
        tb7am13.setShowGrid(true);
        jScrollPane31.setViewportView(tb7am13);

        jPanel2.add(jScrollPane31, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 1130, 630, 70));

        tb7am14.setBackground(new java.awt.Color(90, 166, 166));
        tb7am14.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombres", "Hora", "Motivo", "Medico Tratante"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb7am14.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tb7am14.setSelectionBackground(new java.awt.Color(166, 104, 216));
        tb7am14.setShowGrid(true);
        jScrollPane32.setViewportView(tb7am14);

        jPanel2.add(jScrollPane32, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 1060, 630, 70));

        tb7am15.setBackground(new java.awt.Color(90, 166, 166));
        tb7am15.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombres", "Hora", "Motivo", "Medico Tratante"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb7am15.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tb7am15.setSelectionBackground(new java.awt.Color(166, 104, 216));
        tb7am15.setShowGrid(true);
        jScrollPane33.setViewportView(tb7am15);

        jPanel2.add(jScrollPane33, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 990, 630, 70));

        jScrollPane1.setViewportView(jPanel2);

        panelNice3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 820, 1230));
        panelNice3.add(btnsiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 20, 80, 90));

        panelNice1.add(panelNice3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 1050, 1270));

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
            .addGap(0, 1488, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panelNice1, javax.swing.GroupLayout.PREFERRED_SIZE, 1456, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(26, Short.MAX_VALUE)))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
    private javax.swing.JLabel jLabel10H;
    private javax.swing.JLabel jLabel10H1;
    private javax.swing.JLabel jLabel11H;
    private javax.swing.JLabel jLabel11H1;
    private javax.swing.JLabel jLabel12H;
    private javax.swing.JLabel jLabel13H;
    private javax.swing.JLabel jLabel14H;
    private javax.swing.JLabel jLabel15H;
    private javax.swing.JLabel jLabel16H;
    private javax.swing.JLabel jLabel17H;
    private javax.swing.JLabel jLabel7H1;
    private javax.swing.JLabel jLabel8H;
    private javax.swing.JLabel jLabel8H1;
    private javax.swing.JLabel jLabel9H;
    private javax.swing.JLabel jLabel9H1;
    private javax.swing.JLabel jLabelActividades;
    private javax.swing.JLabel jLabelDia;
    private javax.swing.JLabel jLabelEscogerDia;
    private javax.swing.JLabel jLabelHora;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane25;
    private javax.swing.JScrollPane jScrollPane26;
    private javax.swing.JScrollPane jScrollPane27;
    private javax.swing.JScrollPane jScrollPane28;
    private javax.swing.JScrollPane jScrollPane29;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane30;
    private javax.swing.JScrollPane jScrollPane31;
    private javax.swing.JScrollPane jScrollPane32;
    private javax.swing.JScrollPane jScrollPane33;
    private javax.swing.JScrollPane jScrollPane4;
    private com.toedter.calendar.JDateChooser jdcSeleccionDia;
    private javax.swing.JLabel labelfecha;
    private javax.swing.JLabel lb7am;
    private org.edisoncor.gui.panel.PanelNice panelNice1;
    private org.edisoncor.gui.panel.PanelNice panelNice2;
    private org.edisoncor.gui.panel.PanelNice panelNice3;
    private javax.swing.JTable tb7am;
    private javax.swing.JTable tb7am1;
    private javax.swing.JTable tb7am10;
    private javax.swing.JTable tb7am11;
    private javax.swing.JTable tb7am12;
    private javax.swing.JTable tb7am13;
    private javax.swing.JTable tb7am14;
    private javax.swing.JTable tb7am15;
    private javax.swing.JTable tb7am2;
    private javax.swing.JTable tb7am3;
    private javax.swing.JTable tb7am4;
    private javax.swing.JTable tb7am5;
    private javax.swing.JTable tb7am6;
    private javax.swing.JTable tb7am7;
    private javax.swing.JTable tb7am8;
    private javax.swing.JTable tb7am9;
    // End of variables declaration//GEN-END:variables
}
