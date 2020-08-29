/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.admin.quanlycb;

import bus.ChuyenbayBUS;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import util.ui.ImageIconUtil;

/**
 *
 * @author HAO
 */
public class CellTaskPane extends javax.swing.JPanel {

    /**
     * Creates new form CellTaskPane
     */
    public CellTaskPane() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        viewDetailButton = new javax.swing.JButton();
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(15, 0), new java.awt.Dimension(15, 0), new java.awt.Dimension(15, 0));
        editButton = new javax.swing.JButton();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(15, 0), new java.awt.Dimension(15, 0), new java.awt.Dimension(15, 0));
        deleteButton = new javax.swing.JButton();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));
        add(filler1);

        viewDetailButton.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        viewDetailButton.setToolTipText("Xem chi tiết");
        viewDetailButton.setMaximumSize(new java.awt.Dimension(39, 39));
        viewDetailButton.setPreferredSize(new java.awt.Dimension(39, 39));
        viewDetailButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                viewDetailButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                viewDetailButtonMouseExited(evt);
            }
        });
        viewDetailButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDetailButtonActionPerformed(evt);
            }
        });
        viewDetailButton.setIcon(ImageIconUtil.ResizeImage("src/main/resources/icon/view_details.png", 18, 18));
        add(viewDetailButton);
        add(filler5);

        editButton.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        editButton.setToolTipText("Chỉnh sửa");
        editButton.setMaximumSize(new java.awt.Dimension(39, 39));
        editButton.setPreferredSize(new java.awt.Dimension(39, 39));
        editButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editButtonMouseExited(evt);
            }
        });
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });
        editButton.setIcon(ImageIconUtil.ResizeImage("src/main/resources/icon/edit.png", 18, 18));
        add(editButton);
        add(filler3);

        deleteButton.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        deleteButton.setToolTipText("Xóa");
        deleteButton.setMaximumSize(new java.awt.Dimension(39, 39));
        deleteButton.setPreferredSize(new java.awt.Dimension(39, 39));
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        deleteButton.setIcon(ImageIconUtil.ResizeImage("src/main/resources/icon/delete.png", 18, 18));
        add(deleteButton);
        add(filler2);
    }// </editor-fold>//GEN-END:initComponents

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        JTable table = (JTable) SwingUtilities.getAncestorOfClass(JTable.class, (Component) evt.getSource());
        int row = table.getEditingRow();
        String idCb = (String) table.getValueAt(row, 0);

        int res = JOptionPane.showConfirmDialog(null, String.format("Bạn thực sự muốn xóa chuyến bay %s ?", idCb), "", JOptionPane.YES_NO_OPTION);

        if (res == 0) {
            ChuyenbayBUS.huyChuyenBay(idCb);
            QuanLyChuyenBayPane quanLyChuyenBayPane = (QuanLyChuyenBayPane) SwingUtilities.getAncestorOfClass(QuanLyChuyenBayPane.class, (Component) evt.getSource());
            quanLyChuyenBayPane.proceedToFilter();
            table.removeEditor();

        }



    }//GEN-LAST:event_deleteButtonActionPerformed

    private void editButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editButtonMouseEntered

    }//GEN-LAST:event_editButtonMouseEntered

    private void editButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editButtonMouseExited
        // TODO add your handling code here:

    }//GEN-LAST:event_editButtonMouseExited

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        JTable table = (JTable) SwingUtilities.getAncestorOfClass(JTable.class, (Component) evt.getSource());
        int row = table.getEditingRow();

        QuanLyChuyenBayPane quanLyChuyenBayPane
                = (QuanLyChuyenBayPane) SwingUtilities.getAncestorOfClass(QuanLyChuyenBayPane.class, (Component) evt.getSource());

        EditChuyenBayPane editChuyenBayPane = new EditChuyenBayPane((String) table.getValueAt(row, 0), quanLyChuyenBayPane);
        quanLyChuyenBayPane.getParentPane().add(editChuyenBayPane, editChuyenBayPane.getName());
        CardLayout cl = (CardLayout) quanLyChuyenBayPane.getParentPane().getLayout();
        cl.show(quanLyChuyenBayPane.getParentPane(), editChuyenBayPane.getName());

        table.getCellEditor().stopCellEditing();

    }//GEN-LAST:event_editButtonActionPerformed

    private void viewDetailButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDetailButtonActionPerformed
        JTable table = (JTable) SwingUtilities.getAncestorOfClass(JTable.class, (Component) evt.getSource());
        int row = table.getEditingRow();

        QuanLyChuyenBayPane quanLyChuyenBayPane
        = (QuanLyChuyenBayPane) SwingUtilities.getAncestorOfClass(QuanLyChuyenBayPane.class, (Component) evt.getSource());

        ChiTietChuyenBayPane chiTietChuyenBayPane = new ChiTietChuyenBayPane((String) table.getValueAt(row, 0), quanLyChuyenBayPane);
        quanLyChuyenBayPane.getParentPane().add(chiTietChuyenBayPane, chiTietChuyenBayPane.getName());
        CardLayout cl = (CardLayout) quanLyChuyenBayPane.getParentPane().getLayout();
        cl.show(quanLyChuyenBayPane.getParentPane(), chiTietChuyenBayPane.getName());

        table.getCellEditor().stopCellEditing();
    }//GEN-LAST:event_viewDetailButtonActionPerformed

    private void viewDetailButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewDetailButtonMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_viewDetailButtonMouseExited

    private void viewDetailButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewDetailButtonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_viewDetailButtonMouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler5;
    private javax.swing.JButton viewDetailButton;
    // End of variables declaration//GEN-END:variables
}
