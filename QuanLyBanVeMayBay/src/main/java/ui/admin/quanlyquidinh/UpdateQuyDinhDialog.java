/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.admin.quanlyquidinh;

import bus.QuydinhBUS;
import javax.swing.JOptionPane;
import pojos.Quydinh;

/**
 *
 * @author HAO
 */
public class UpdateQuyDinhDialog extends javax.swing.JDialog {

    private int idQuydinh;
    private Quydinh quydinh;
    private QuanLyQuyDinhPane quanLyQuyDinhPane;


    /**
     * Creates new form UpdateQuyDinhDialog
     */
    public UpdateQuyDinhDialog(java.awt.Frame parent, boolean modal, int idQuydinh, QuanLyQuyDinhPane quanLyQuyDinhPane) {
        super(parent, modal);
        this.idQuydinh = idQuydinh;
        this.quydinh = QuydinhBUS.getQuydinhForAdmin(this.idQuydinh);
        this.quanLyQuyDinhPane = quanLyQuyDinhPane;
        initComponents();

        fillUpData();

    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        unitField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        valueField = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        statusCbb = new javax.swing.JComboBox<>();
        submitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cập nhật quy định");
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(510, 375));
        setMinimumSize(new java.awt.Dimension(510, 375));
        setPreferredSize(new java.awt.Dimension(510, 375));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 20, 10, 20));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Quy định: ");

        titleLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(9, 115, 185));
        titleLabel.setText("Thời hạn hủy vé trước giờ bay");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Đơn vị tính: ");

        unitField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        unitField.setText("Giờ");
        unitField.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 10)));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Giá trị:");

        valueField.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 10)));
        valueField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        valueField.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        valueField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valueFieldActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Tình trạng:");

        statusCbb.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        statusCbb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Còn hiệu lực", "Hết hiệu lực" }));
        statusCbb.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 10)));

        submitButton.setBackground(new java.awt.Color(204, 204, 0));
        submitButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        submitButton.setForeground(new java.awt.Color(255, 255, 255));
        submitButton.setText("Confirm");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titleLabel)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(statusCbb, javax.swing.GroupLayout.Alignment.LEADING, 0, 240, Short.MAX_VALUE)
                        .addComponent(valueField, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(unitField, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(titleLabel))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(unitField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valueField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(statusCbb, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(30, 30, 30)
                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void valueFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valueFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valueFieldActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed

        String kieu = unitField.getText();
        String giaTriText = valueField.getText();
        String tinhTrang = (String) statusCbb.getSelectedItem();
        if (kieu.isEmpty() || giaTriText.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Cần nhập đầy đủ thông tin!");
            return;
        }

        quydinh.setKieu(kieu);
        quydinh.setGiaTri(giaTriText);
        quydinh.setTinhTrang(tinhTrang);

        boolean res = QuydinhBUS.capNhatQuyDinh(quydinh);
        this.dispose();
        if (res) {
            quanLyQuyDinhPane.refreshData();
            JOptionPane.showMessageDialog(null, "Đã cập nhật " + quydinh.getTenQuyDinh());
        } else {
            JOptionPane.showMessageDialog(null, "Đã xảy ra lỗi, không thể cập nhật quy định!");
        }


    }//GEN-LAST:event_submitButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> statusCbb;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JTextField unitField;
    private javax.swing.JFormattedTextField valueField;
    // End of variables declaration//GEN-END:variables

    private void fillUpData() {

        titleLabel.setText(quydinh.getTenQuyDinh());
        unitField.setText(quydinh.getKieu());
        valueField.setText(quydinh.getGiaTri());
        statusCbb.setSelectedIndex(quydinh.getTinhTrang().equals("Còn hiệu lực") ? 0 : 1);
    }
}
