/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.changePassword;

/**
 *
 * @author DELL
 */
public class ChangePasswordDialog extends javax.swing.JDialog {

    /**
     * Creates new form ChangePasswordDialog
     */
    public ChangePasswordDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        filler21 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 20), new java.awt.Dimension(0, 20), new java.awt.Dimension(0, 20));
        filler25 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 20), new java.awt.Dimension(0, 20), new java.awt.Dimension(0, 20));
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        filler13 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 20), new java.awt.Dimension(0, 20), new java.awt.Dimension(0, 20));
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(100, 0));
        jpfOldPass = new javax.swing.JPasswordField();
        filler12 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 20), new java.awt.Dimension(0, 20), new java.awt.Dimension(0, 20));
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        filler18 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(100, 0));
        jpfNewPass = new javax.swing.JPasswordField();
        filler14 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 20), new java.awt.Dimension(0, 20), new java.awt.Dimension(0, 20));
        jPanel8 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        filler19 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(100, 0));
        jpfConfirm = new javax.swing.JPasswordField();
        filler20 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 20), new java.awt.Dimension(0, 20), new java.awt.Dimension(0, 20));
        jPanel6 = new javax.swing.JPanel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        btnChange = new javax.swing.JButton();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0));
        filler8 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(700, 400));
        setMinimumSize(new java.awt.Dimension(700, 400));
        setPreferredSize(new java.awt.Dimension(700, 400));

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.setForeground(new java.awt.Color(255, 255, 255));
        jPanel7.setMaximumSize(new java.awt.Dimension(32767, 41));
        jPanel7.setMinimumSize(new java.awt.Dimension(100, 41));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ĐỔI MẬT KHẨU");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel7.add(jLabel4, java.awt.BorderLayout.CENTER);
        jPanel7.add(filler21, java.awt.BorderLayout.PAGE_END);
        jPanel7.add(filler25, java.awt.BorderLayout.PAGE_START);

        getContentPane().add(jPanel7, java.awt.BorderLayout.PAGE_START);

        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel1.setMinimumSize(new java.awt.Dimension(600, 310));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 310));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.Y_AXIS));
        jPanel1.add(filler13);

        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.LINE_AXIS));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("Mật khẩu cũ");
        jLabel2.setMaximumSize(new java.awt.Dimension(200, 50));
        jLabel2.setMinimumSize(new java.awt.Dimension(100, 16));
        jLabel2.setPreferredSize(new java.awt.Dimension(100, 16));
        jPanel3.add(jLabel2);
        jPanel3.add(filler4);

        jpfOldPass.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jpfOldPass.setMaximumSize(new java.awt.Dimension(450, 40));
        jpfOldPass.setMinimumSize(new java.awt.Dimension(450, 40));
        jpfOldPass.setPreferredSize(new java.awt.Dimension(450, 40));
        jPanel3.add(jpfOldPass);

        jPanel1.add(jPanel3);
        jPanel1.add(filler12);

        jPanel5.setLayout(new javax.swing.BoxLayout(jPanel5, javax.swing.BoxLayout.LINE_AXIS));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setText("Mật khẩu mới");
        jLabel5.setMaximumSize(new java.awt.Dimension(200, 50));
        jLabel5.setMinimumSize(new java.awt.Dimension(100, 16));
        jLabel5.setPreferredSize(new java.awt.Dimension(100, 16));
        jPanel5.add(jLabel5);
        jPanel5.add(filler18);

        jpfNewPass.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jpfNewPass.setMaximumSize(new java.awt.Dimension(450, 40));
        jpfNewPass.setMinimumSize(new java.awt.Dimension(450, 40));
        jpfNewPass.setPreferredSize(new java.awt.Dimension(450, 40));
        jPanel5.add(jpfNewPass);

        jPanel1.add(jPanel5);
        jPanel1.add(filler14);

        jPanel8.setLayout(new javax.swing.BoxLayout(jPanel8, javax.swing.BoxLayout.LINE_AXIS));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setText("Xác nhận lại");
        jLabel6.setMaximumSize(new java.awt.Dimension(200, 50));
        jLabel6.setMinimumSize(new java.awt.Dimension(100, 16));
        jLabel6.setPreferredSize(new java.awt.Dimension(100, 16));
        jPanel8.add(jLabel6);
        jPanel8.add(filler19);

        jpfConfirm.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jpfConfirm.setMaximumSize(new java.awt.Dimension(450, 40));
        jpfConfirm.setMinimumSize(new java.awt.Dimension(450, 40));
        jpfConfirm.setPreferredSize(new java.awt.Dimension(450, 40));
        jPanel8.add(jpfConfirm);

        jPanel1.add(jPanel8);
        jPanel1.add(filler20);

        jPanel6.setMaximumSize(new java.awt.Dimension(32767, 50));
        jPanel6.setMinimumSize(new java.awt.Dimension(100, 50));
        jPanel6.setPreferredSize(new java.awt.Dimension(600, 50));
        jPanel6.setLayout(new javax.swing.BoxLayout(jPanel6, javax.swing.BoxLayout.LINE_AXIS));
        jPanel6.add(filler1);

        btnChange.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnChange.setText("Đổi mật khẩu");
        btnChange.setMaximumSize(new java.awt.Dimension(200, 50));
        btnChange.setMinimumSize(new java.awt.Dimension(200, 50));
        btnChange.setPreferredSize(new java.awt.Dimension(200, 50));
        jPanel6.add(btnChange);
        jPanel6.add(filler2);

        jPanel1.add(jPanel6);

        jPanel4.add(jPanel1, java.awt.BorderLayout.CENTER);
        jPanel4.add(filler3, java.awt.BorderLayout.LINE_START);
        jPanel4.add(filler8, java.awt.BorderLayout.EAST);

        getContentPane().add(jPanel4, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
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
            java.util.logging.Logger.getLogger(ChangePasswordDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangePasswordDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangePasswordDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangePasswordDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ChangePasswordDialog dialog = new ChangePasswordDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChange;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler12;
    private javax.swing.Box.Filler filler13;
    private javax.swing.Box.Filler filler14;
    private javax.swing.Box.Filler filler18;
    private javax.swing.Box.Filler filler19;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler20;
    private javax.swing.Box.Filler filler21;
    private javax.swing.Box.Filler filler25;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler8;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPasswordField jpfConfirm;
    private javax.swing.JPasswordField jpfNewPass;
    private javax.swing.JPasswordField jpfOldPass;
    // End of variables declaration//GEN-END:variables
}
