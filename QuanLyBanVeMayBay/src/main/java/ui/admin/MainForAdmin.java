/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.admin;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatIntelliJLaf;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import sun.security.jca.GetInstance;
import ui.admin.quanlycb.QuanLyChuyenBayPane;
import ui.admin.quanlynhanvien.QuanLyNhanVienPane;
import ui.admin.statistic.ThongKePane;

/**
 *
 * @author HAO
 */
public class MainForAdmin extends javax.swing.JFrame {

    /**
     * Creates new form MainForAdmin
     */
    private static MainForAdmin INSTANCE = null;

    public static MainForAdmin getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new MainForAdmin();
        }
        return INSTANCE;
    }

    private QuanLyChuyenBayPane quanLyChuyenBayPane;
    private QuanLyNhanVienPane quanLyNhanVienPane;
    private ThongKePane thongKePane;

    private MainForAdmin() {
        initComponents();

        setLocationRelativeTo(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        quanLyChuyenBayPane = new QuanLyChuyenBayPane();
        quanLyNhanVienPane = new QuanLyNhanVienPane();
        thongKePane = new ThongKePane();

        tabbedPane.addTab("Quản lý chuyến bay", quanLyChuyenBayPane);
        tabbedPane.add("Quản lý nhân viên", quanLyNhanVienPane);
        tabbedPane.add("Thống kê doanh thu", thongKePane);
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 700));
        getContentPane().add(tabbedPane, java.awt.BorderLayout.CENTER);

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
            //UIManager.setLookAndFeel(new FlatDarkLaf());
            UIManager.setLookAndFeel(new FlatIntelliJLaf());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(MainForAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MainForAdmin.getInstance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane tabbedPane;
    // End of variables declaration//GEN-END:variables
}
