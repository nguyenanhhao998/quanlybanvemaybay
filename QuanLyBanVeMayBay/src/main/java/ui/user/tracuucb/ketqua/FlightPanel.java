/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ui.user.tracuucb.ketqua;

import javax.swing.JOptionPane;
import ui.user.MainForUser;

/**
 *
 * @author DELL
 */
public class FlightPanel extends javax.swing.JPanel {

    /** Creates new form FightPanel */
    public FlightPanel() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jPanel8 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jlbSBDi = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        filler7 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0));
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        btnChon = new javax.swing.JButton();
        filler17 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));

        setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        setMaximumSize(new java.awt.Dimension(1000, 120));
        setMinimumSize(new java.awt.Dimension(500, 120));
        setPreferredSize(new java.awt.Dimension(400, 120));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));
        add(filler6);

        jPanel8.setMaximumSize(new java.awt.Dimension(200, 90));
        jPanel8.setMinimumSize(new java.awt.Dimension(200, 90));
        jPanel8.setPreferredSize(new java.awt.Dimension(200, 90));
        jPanel8.setLayout(new javax.swing.BoxLayout(jPanel8, javax.swing.BoxLayout.Y_AXIS));

        jPanel3.setMaximumSize(new java.awt.Dimension(200, 40));
        jPanel3.setMinimumSize(new java.awt.Dimension(200, 40));
        jPanel3.setPreferredSize(new java.awt.Dimension(200, 40));
        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jlbSBDi.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jlbSBDi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/plane_takeoff.png"))); // NOI18N
        jlbSBDi.setText("Hà nội (HAN)");
        jlbSBDi.setMaximumSize(new java.awt.Dimension(200, 40));
        jlbSBDi.setMinimumSize(new java.awt.Dimension(200, 40));
        jlbSBDi.setPreferredSize(new java.awt.Dimension(200, 40));
        jPanel3.add(jlbSBDi);

        jPanel8.add(jPanel3);

        jPanel5.setMaximumSize(new java.awt.Dimension(200, 40));
        jPanel5.setMinimumSize(new java.awt.Dimension(200, 40));
        jPanel5.setPreferredSize(new java.awt.Dimension(200, 40));
        jPanel5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/clock.png"))); // NOI18N
        jLabel10.setText("07:00");
        jLabel10.setAlignmentY(0.0F);
        jLabel10.setMaximumSize(new java.awt.Dimension(150, 35));
        jLabel10.setMinimumSize(new java.awt.Dimension(150, 35));
        jLabel10.setPreferredSize(new java.awt.Dimension(150, 35));
        jPanel5.add(jLabel10);

        jPanel8.add(jPanel5);

        add(jPanel8);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/flight.png"))); // NOI18N
        jLabel7.setMaximumSize(new java.awt.Dimension(60, 40));
        jLabel7.setMinimumSize(new java.awt.Dimension(60, 40));
        jLabel7.setPreferredSize(new java.awt.Dimension(60, 40));
        add(jLabel7);

        jPanel12.setMaximumSize(new java.awt.Dimension(250, 90));
        jPanel12.setMinimumSize(new java.awt.Dimension(250, 90));
        jPanel12.setPreferredSize(new java.awt.Dimension(200, 90));
        jPanel12.setLayout(new javax.swing.BoxLayout(jPanel12, javax.swing.BoxLayout.Y_AXIS));

        jPanel13.setMaximumSize(new java.awt.Dimension(200, 40));
        jPanel13.setMinimumSize(new java.awt.Dimension(200, 40));
        jPanel13.setPreferredSize(new java.awt.Dimension(200, 40));
        jPanel13.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/plane_landing.png"))); // NOI18N
        jLabel11.setText("TPHCM (SGN)");
        jLabel11.setMaximumSize(new java.awt.Dimension(200, 40));
        jLabel11.setMinimumSize(new java.awt.Dimension(200, 40));
        jLabel11.setPreferredSize(new java.awt.Dimension(200, 40));
        jPanel13.add(jLabel11);

        jPanel12.add(jPanel13);

        jPanel14.setMaximumSize(new java.awt.Dimension(200, 40));
        jPanel14.setMinimumSize(new java.awt.Dimension(200, 40));
        jPanel14.setPreferredSize(new java.awt.Dimension(200, 40));
        jPanel14.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/clock.png"))); // NOI18N
        jLabel12.setText("09:00");
        jLabel12.setAlignmentY(0.0F);
        jLabel12.setMaximumSize(new java.awt.Dimension(150, 35));
        jLabel12.setMinimumSize(new java.awt.Dimension(150, 35));
        jLabel12.setPreferredSize(new java.awt.Dimension(150, 35));
        jPanel14.add(jLabel12);

        jPanel12.add(jPanel14);

        add(jPanel12);

        jPanel9.setMaximumSize(new java.awt.Dimension(150, 90));
        jPanel9.setMinimumSize(new java.awt.Dimension(150, 90));
        jPanel9.setPreferredSize(new java.awt.Dimension(150, 90));
        jPanel9.setLayout(new javax.swing.BoxLayout(jPanel9, javax.swing.BoxLayout.Y_AXIS));

        jPanel10.setMaximumSize(new java.awt.Dimension(150, 40));
        jPanel10.setMinimumSize(new java.awt.Dimension(150, 40));
        jPanel10.setPreferredSize(new java.awt.Dimension(150, 40));
        jPanel10.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setText("Bay thẳng");
        jLabel6.setMaximumSize(new java.awt.Dimension(150, 40));
        jLabel6.setMinimumSize(new java.awt.Dimension(150, 40));
        jLabel6.setPreferredSize(new java.awt.Dimension(150, 40));
        jPanel10.add(jLabel6);

        jPanel9.add(jPanel10);

        jPanel11.setMaximumSize(new java.awt.Dimension(200, 40));
        jPanel11.setMinimumSize(new java.awt.Dimension(200, 40));
        jPanel11.setPreferredSize(new java.awt.Dimension(200, 40));
        jPanel11.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/clock.png"))); // NOI18N
        jLabel13.setText("02:00");
        jLabel13.setAlignmentY(0.0F);
        jLabel13.setMaximumSize(new java.awt.Dimension(100, 35));
        jLabel13.setMinimumSize(new java.awt.Dimension(100, 35));
        jLabel13.setPreferredSize(new java.awt.Dimension(100, 35));
        jPanel11.add(jLabel13);

        jPanel9.add(jPanel11);

        add(jPanel9);
        add(filler7);

        jPanel15.setMaximumSize(new java.awt.Dimension(200, 90));
        jPanel15.setMinimumSize(new java.awt.Dimension(200, 90));
        jPanel15.setPreferredSize(new java.awt.Dimension(200, 90));
        jPanel15.setLayout(new javax.swing.BoxLayout(jPanel15, javax.swing.BoxLayout.Y_AXIS));

        jPanel16.setMaximumSize(new java.awt.Dimension(200, 40));
        jPanel16.setMinimumSize(new java.awt.Dimension(200, 40));
        jPanel16.setPreferredSize(new java.awt.Dimension(200, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 102, 0));
        jLabel8.setText("500.000 VND/Khách");
        jLabel8.setMaximumSize(new java.awt.Dimension(200, 40));
        jLabel8.setMinimumSize(new java.awt.Dimension(200, 40));
        jLabel8.setPreferredSize(new java.awt.Dimension(200, 40));
        jPanel16.add(jLabel8);

        jPanel15.add(jPanel16);

        jPanel17.setMaximumSize(new java.awt.Dimension(200, 40));
        jPanel17.setMinimumSize(new java.awt.Dimension(200, 40));
        jPanel17.setPreferredSize(new java.awt.Dimension(200, 40));
        jPanel17.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        btnChon.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnChon.setText("Chọn");
        btnChon.setMaximumSize(new java.awt.Dimension(100, 40));
        btnChon.setMinimumSize(new java.awt.Dimension(100, 40));
        btnChon.setPreferredSize(new java.awt.Dimension(100, 40));
        btnChon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChonActionPerformed(evt);
            }
        });
        jPanel17.add(btnChon);

        jPanel15.add(jPanel17);

        add(jPanel15);
        add(filler17);
    }// </editor-fold>//GEN-END:initComponents

    private void btnChonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChonActionPerformed
        MainForUser.getInstance().getTraCuuPane().changeLayout(new ChiTietVeCBPanel());
    }//GEN-LAST:event_btnChonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChon;
    private javax.swing.Box.Filler filler17;
    private javax.swing.Box.Filler filler6;
    private javax.swing.Box.Filler filler7;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel jlbSBDi;
    // End of variables declaration//GEN-END:variables

}