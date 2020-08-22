/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.admin.statistic;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author HAO
 */
public class ThongKePane extends javax.swing.JPanel {

    JPanel choosedPanelLabel;
    CardLayout cardLayout;

    BCDTNamPane bCDTNamPane = new BCDTNamPane();
    BCDTThangPane bCDTThangPane = new BCDTThangPane();
    /**
     * Creates new form ThongKe
     */
    public ThongKePane() {
        initComponents();
        cardLayout = (CardLayout) mainPane.getLayout();
        choosedPanelLabel = labelForBCThangPane;

        mainPane.add(bCDTThangPane, bCDTThangPane.getName());
        mainPane.add(bCDTNamPane, bCDTNamPane.getName());
        cardLayout.show(mainPane, labelForBCThangPane.getName());


    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jLabel1 = new javax.swing.JLabel();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jPanel1 = new javax.swing.JPanel();
        sidePane = new javax.swing.JPanel();
        logoPanel = new javax.swing.JPanel();
        labelForBCThangPane = new javax.swing.JPanel();
        filler11 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 55), new java.awt.Dimension(20, 55), new java.awt.Dimension(20, 55));
        jLabel2 = new javax.swing.JLabel();
        filler13 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 55), new java.awt.Dimension(20, 55), new java.awt.Dimension(20, 55));
        logoPanel1 = new javax.swing.JPanel();
        labelForBaoCaoNamPane = new javax.swing.JPanel();
        filler9 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 55), new java.awt.Dimension(20, 55), new java.awt.Dimension(20, 55));
        jLabel10 = new javax.swing.JLabel();
        mainPane = new javax.swing.JPanel();

        setLayout(new java.awt.BorderLayout());

        jPanel4.setBackground(new java.awt.Color(9, 115, 185));
        jPanel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 20, 15, 20));
        jPanel4.setMaximumSize(new java.awt.Dimension(32767, 200));
        jPanel4.setPreferredSize(new java.awt.Dimension(120, 80));
        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.LINE_AXIS));
        jPanel4.add(filler1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Báo cáo doanh thu");
        jPanel4.add(jLabel1);
        jPanel4.add(filler2);

        add(jPanel4, java.awt.BorderLayout.PAGE_START);

        jPanel1.setLayout(new java.awt.BorderLayout());

        sidePane.setBackground(new java.awt.Color(204, 204, 204));
        sidePane.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 1, new java.awt.Color(204, 204, 204)), javax.swing.BorderFactory.createEmptyBorder(1, 20, 1, 20)));
        sidePane.setFocusable(false);
        sidePane.setMaximumSize(new java.awt.Dimension(32767, 620));
        sidePane.setPreferredSize(new java.awt.Dimension(360, 620));
        sidePane.setLayout(new javax.swing.BoxLayout(sidePane, javax.swing.BoxLayout.PAGE_AXIS));

        logoPanel.setBackground(new java.awt.Color(18, 18, 18));
        logoPanel.setMaximumSize(new java.awt.Dimension(282, 50));
        logoPanel.setOpaque(false);
        logoPanel.setPreferredSize(new java.awt.Dimension(282, 50));
        logoPanel.setRequestFocusEnabled(false);

        javax.swing.GroupLayout logoPanelLayout = new javax.swing.GroupLayout(logoPanel);
        logoPanel.setLayout(logoPanelLayout);
        logoPanelLayout.setHorizontalGroup(
            logoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 282, Short.MAX_VALUE)
        );
        logoPanelLayout.setVerticalGroup(
            logoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        sidePane.add(logoPanel);

        labelForBCThangPane.setBackground(new java.awt.Color(1, 153, 252));
        labelForBCThangPane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        labelForBCThangPane.setForeground(new java.awt.Color(255, 255, 255));
        labelForBCThangPane.setMaximumSize(new java.awt.Dimension(32767, 80));
        labelForBCThangPane.setPreferredSize(new java.awt.Dimension(188, 80));
        labelForBCThangPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelForBCThangPaneMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelForBCThangPaneMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                labelForBCThangPaneMousePressed(evt);
            }
        });
        labelForBCThangPane.setLayout(new javax.swing.BoxLayout(labelForBCThangPane, javax.swing.BoxLayout.LINE_AXIS));
        labelForBCThangPane.add(filler11);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Báo cáo doanh thu theo tháng");
        labelForBCThangPane.add(jLabel2);
        labelForBCThangPane.add(filler13);

        sidePane.add(labelForBCThangPane);

        logoPanel1.setBackground(new java.awt.Color(18, 18, 18));
        logoPanel1.setMaximumSize(new java.awt.Dimension(282, 50));
        logoPanel1.setOpaque(false);
        logoPanel1.setPreferredSize(new java.awt.Dimension(282, 50));
        logoPanel1.setRequestFocusEnabled(false);

        javax.swing.GroupLayout logoPanel1Layout = new javax.swing.GroupLayout(logoPanel1);
        logoPanel1.setLayout(logoPanel1Layout);
        logoPanel1Layout.setHorizontalGroup(
            logoPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 282, Short.MAX_VALUE)
        );
        logoPanel1Layout.setVerticalGroup(
            logoPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        sidePane.add(logoPanel1);

        labelForBaoCaoNamPane.setBackground(new java.awt.Color(9, 115, 185));
        labelForBaoCaoNamPane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        labelForBaoCaoNamPane.setMaximumSize(new java.awt.Dimension(32767, 80));
        labelForBaoCaoNamPane.setPreferredSize(new java.awt.Dimension(135, 80));
        labelForBaoCaoNamPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelForBaoCaoNamPaneMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelForBaoCaoNamPaneMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                labelForBaoCaoNamPaneMousePressed(evt);
            }
        });
        labelForBaoCaoNamPane.setLayout(new javax.swing.BoxLayout(labelForBaoCaoNamPane, javax.swing.BoxLayout.LINE_AXIS));
        labelForBaoCaoNamPane.add(filler9);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Báo cáo doanh thu theo năm");
        labelForBaoCaoNamPane.add(jLabel10);

        sidePane.add(labelForBaoCaoNamPane);

        jPanel1.add(sidePane, java.awt.BorderLayout.WEST);

        mainPane.setBackground(new java.awt.Color(250, 250, 250));
        mainPane.setLayout(new java.awt.CardLayout());
        jPanel1.add(mainPane, java.awt.BorderLayout.CENTER);

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void labelForBCThangPaneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelForBCThangPaneMouseEntered
        // TODO add your handling code here:
        if (choosedPanelLabel != labelForBCThangPane) {
            setColor(labelForBCThangPane);
        }
    }//GEN-LAST:event_labelForBCThangPaneMouseEntered

    private void labelForBCThangPaneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelForBCThangPaneMouseExited
        // TODO add your handling code here:
        if (choosedPanelLabel != labelForBCThangPane) {
            resetColor(labelForBCThangPane);
        }
    }//GEN-LAST:event_labelForBCThangPaneMouseExited

    private void labelForBCThangPaneMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelForBCThangPaneMousePressed
        // TODO add your handling code here:
        if (choosedPanelLabel == labelForBCThangPane) {
            return;
        }
        resetColor(choosedPanelLabel);
        choosedPanelLabel = labelForBCThangPane;
        setColor(choosedPanelLabel);

        cardLayout.show(mainPane, bCDTThangPane.getName());
    }//GEN-LAST:event_labelForBCThangPaneMousePressed

    private void labelForBaoCaoNamPaneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelForBaoCaoNamPaneMouseEntered
        // TODO add your handling code here:
        if (choosedPanelLabel != labelForBaoCaoNamPane) {
            setColor(labelForBaoCaoNamPane);
        }
    }//GEN-LAST:event_labelForBaoCaoNamPaneMouseEntered

    private void labelForBaoCaoNamPaneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelForBaoCaoNamPaneMouseExited
        // TODO add your handling code here:
        if (choosedPanelLabel != labelForBaoCaoNamPane) {
            resetColor(labelForBaoCaoNamPane);
        }
    }//GEN-LAST:event_labelForBaoCaoNamPaneMouseExited

    private void labelForBaoCaoNamPaneMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelForBaoCaoNamPaneMousePressed
        // TODO add your handling code here:
        if (choosedPanelLabel == labelForBaoCaoNamPane) {
            return;
        }
        resetColor(choosedPanelLabel);
        choosedPanelLabel = labelForBaoCaoNamPane;
        setColor(choosedPanelLabel);

        cardLayout.show(mainPane, bCDTNamPane.getName());

    }//GEN-LAST:event_labelForBaoCaoNamPaneMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler11;
    private javax.swing.Box.Filler filler13;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel labelForBCThangPane;
    private javax.swing.JPanel labelForBaoCaoNamPane;
    private javax.swing.JPanel logoPanel;
    private javax.swing.JPanel logoPanel1;
    private javax.swing.JPanel mainPane;
    private javax.swing.JPanel sidePane;
    // End of variables declaration//GEN-END:variables

    private void setColor(JPanel panel) {
        panel.setBackground(new Color(1, 153, 252));
    }

    private void resetColor(JPanel panel) {
        //panel.setBackground(new Color(36, 36, 36));
        panel.setBackground(new Color(9, 115, 185));
    }


}
