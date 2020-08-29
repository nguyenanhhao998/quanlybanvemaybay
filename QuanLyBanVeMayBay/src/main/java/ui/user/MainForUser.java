/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.user;

import com.formdev.flatlaf.FlatIntelliJLaf;
import java.awt.Color;
import java.awt.Font;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import ui.LoginFrame;
import ui.user.phieu.QuanLyPhieuChoPanel;
import ui.user.phieu.XuLyDatVePanel;
import ui.user.muave.DoiVePanel;
import ui.user.tracuucb.TraCuuChuyenBayPane;

/**
 *
 * @author HAO
 */
public class MainForUser extends javax.swing.JFrame {

    /**
     * Creates new form MainForUser
     */
    private static MainForUser instance;
    private TraCuuChuyenBayPane traCuuChuyenBayPane;
    private XuLyDatVePanel xuLyDatVePane;
    private DoiVePanel doiVePane;
    private QuanLyPhieuChoPanel qlPhieuCho;
    private MainForUser() {
        initComponents();

        setLocationRelativeTo(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        traCuuChuyenBayPane = new TraCuuChuyenBayPane();
        tabbedPane.addTab("Tra cứu vé", traCuuChuyenBayPane);
        
        xuLyDatVePane = new XuLyDatVePanel();
        tabbedPane.addTab("Quản lý đặt vé", xuLyDatVePane);
        
        doiVePane = new DoiVePanel();
        tabbedPane.addTab("Quản lý vé đã mua", doiVePane);
        
        qlPhieuCho = new QuanLyPhieuChoPanel();
        tabbedPane.addTab("Quản lý phiếu chờ", qlPhieuCho);
        
        tabbedPane.setFont( new Font( "Arial", Font.BOLD, 18 ) );
    }
    
    public static MainForUser getInstance() {
        if (instance == null) {
            instance = new MainForUser();
        }
        return instance;
    }
    
    public TraCuuChuyenBayPane getTraCuuPane(){
        return traCuuChuyenBayPane;
    }
    
    public XuLyDatVePanel getXuLyDatVePane(){
        return xuLyDatVePane;
    }
    
    public DoiVePanel getDoiVePane(){
        return doiVePane;
    }
    
    public QuanLyPhieuChoPanel getqlPhieuChoPane(){
        return qlPhieuCho;
    }
    
    public int getCurrentPaneIndex(){
        return tabbedPane.getSelectedIndex();
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MainForUser.getInstance().setVisible(true);
            }
        });
    }

    public void runFrame(){
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MainForUser.getInstance().setVisible(true);
            }
        });
    }
        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabbedPane = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0));
        jLabel1 = new javax.swing.JLabel();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        btnLogout = new javax.swing.JButton();
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(50, 0), new java.awt.Dimension(50, 0), new java.awt.Dimension(50, 0));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().add(tabbedPane, java.awt.BorderLayout.CENTER);

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));
        jPanel1.add(filler1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Phần mềm quản lý bán vé máy bay");
        jPanel1.add(jLabel1);
        jPanel1.add(filler3);

        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logout.png"))); // NOI18N
        btnLogout.setMaximumSize(new java.awt.Dimension(50, 50));
        btnLogout.setMinimumSize(new java.awt.Dimension(50, 50));
        btnLogout.setPreferredSize(new java.awt.Dimension(50, 50));
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogout);
        jPanel1.add(filler4);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        this.dispose();
        new LoginFrame().setVisible(true);
    }//GEN-LAST:event_btnLogoutActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogout;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane tabbedPane;
    // End of variables declaration//GEN-END:variables
}
