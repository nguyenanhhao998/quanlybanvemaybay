/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.admin.quanlycb;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author HAO
 */
public class QuanLyChuyenBayPane extends javax.swing.JPanel {

    DefaultTableModel dtm;
    /**
     * Creates new form QuanLyChuyenBay
     */
    public QuanLyChuyenBayPane() {
        initComponents();
        setupTable();
        setupModelForTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        parentPane = new javax.swing.JPanel();
        homePane = new javax.swing.JPanel();
        controlPanel = new javax.swing.JPanel();
        tablePane = new javax.swing.JPanel();
        tableScrollPane = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();

        setLayout(new java.awt.BorderLayout());

        parentPane.setLayout(new java.awt.CardLayout());

        homePane.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout controlPanelLayout = new javax.swing.GroupLayout(controlPanel);
        controlPanel.setLayout(controlPanelLayout);
        controlPanelLayout.setHorizontalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 689, Short.MAX_VALUE)
        );
        controlPanelLayout.setVerticalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        homePane.add(controlPanel, java.awt.BorderLayout.PAGE_START);

        tablePane.setLayout(new java.awt.BorderLayout());

        tableScrollPane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        table.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "Tân Sơn Nhất", "Hà Nội", "20/10/2020", "3 giờ", "Đang bay"},
                {"2", "Tân Sơn Nhất", "Hà Nội", "20/10/2020", "3.5 giờ", "Đã bay"},
                {"3", "Tân Sơn Nhất", "Hà Nội", "20/10/2020", "3.5 giờ", "Đã bay"},
                {"5", "Tân Sơn Nhất", "Hà Nội", "20/10/2020", "3.5 giờ", "Đã bay"},
                {"6", "Tân Sơn Nhất", "Hà Nội", "20/10/2020", "3.5 giờ", "Đang bay"},
                {"7", "Tân Sơn Nhất", "Hà Nội", "20/10/2020", "3.5 giờ", "Đang bay"},
                {"8", "Tân Sơn Nhất", "Hà Nội", "20/10/2020", "3.5 giờ", "Đang bay"},
                {"9", "Tân Sơn Nhất", "Hà Nội", "20/10/2020", "3.5 giờ", "Đang bay"},
                {"10", "Tân Sơn Nhất", "Hà Nội", "20/10/2020", "3.5 giờ", "Sắp khởi hành"},
                {"11", "Tân Sơn Nhất", "Hà Nội", "20/10/2020", "3.5 giờ", "Sắp khởi hành"},
                {"12", "Tân Sơn Nhất", "Hà Nội", "20/10/2020", "3.5 giờ", "Sắp khởi hành"},
                {"13", "Tân Sơn Nhất", "Hà Nội", "20/10/2020", "3.5 giờ", "Sắp khởi hành"},
                {"14", "Tân Sơn Nhất", "Hà Nội", "20/10/2020", "3.5 giờ", "Sắp khởi hành"},
                {"15", "Tân Sơn Nhất", "Hà Nội", "20/10/2020", "3 giờ", "Sắp khởi hành"},
                {"16", "Tân Sơn Nhất", "Hà Nội", "20/10/2020", "3 giờ", "Sắp khởi hành"},
                {"17", "Tân Sơn Nhất", "Hà Nội", "20/10/2020", "3 giờ", "Sắp khởi hành"},
                {"18", "Tân Sơn Nhất", "Hà Nội", "20/10/2020", "3 giờ", "Sắp khởi hành"},
                {"19", "Tân Sơn Nhất", "Hà Nội", "20/10/2020", "3 giờ", "Sắp khởi hành"},
                {"20", "Tân Sơn Nhất", "Hà Nội", "20/10/2020", "3 giờ", "Sắp khởi hành"},
                {"21", "Tân Sơn Nhất", "Hà Nội", "20/10/2020", "3 giờ", "Sắp khởi hành"}
            },
            new String [] {
                "Mã chuyến bay", "Sân bay đi", "Sân bay đến", "Ngày khởi hành", "Thời gian bay", "Tình trạng"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        table.getTableHeader().setReorderingAllowed(false);
        tableScrollPane.setViewportView(table);

        tablePane.add(tableScrollPane, java.awt.BorderLayout.CENTER);

        jPanel1.setPreferredSize(new java.awt.Dimension(20, 427));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 417, Short.MAX_VALUE)
        );

        tablePane.add(jPanel1, java.awt.BorderLayout.LINE_END);

        jPanel2.setPreferredSize(new java.awt.Dimension(20, 427));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 417, Short.MAX_VALUE)
        );

        tablePane.add(jPanel2, java.awt.BorderLayout.LINE_START);

        jPanel3.setPreferredSize(new java.awt.Dimension(689, 10));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 689, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        tablePane.add(jPanel3, java.awt.BorderLayout.PAGE_END);

        homePane.add(tablePane, java.awt.BorderLayout.CENTER);

        parentPane.add(homePane, "card2");

        add(parentPane, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel controlPanel;
    private javax.swing.JPanel homePane;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel parentPane;
    private javax.swing.JTable table;
    private javax.swing.JPanel tablePane;
    private javax.swing.JScrollPane tableScrollPane;
    // End of variables declaration//GEN-END:variables

    private void setupTable() {
        setupModelForTable();
        setupUIForTable();
    }
    private void setupModelForTable() {
        dtm = new javax.swing.table.DefaultTableModel(
                new Object[][]{
                    {"1", "Tân Sơn Nhất", "Hà Nội", "20/10/2020", "3 giờ", "Đang bay"},
                    {"2", "Tân Sơn Nhất", "Hà Nội", "20/10/2020", "3.5 giờ", "Đã bay"},
                    {"3", "Tân Sơn Nhất", "Hà Nội", "20/10/2020", "3.5 giờ", "Đã bay"},
                    {"5", "Tân Sơn Nhất", "Hà Nội", "20/10/2020", "3.5 giờ", "Đã bay"},
                    {"6", "Tân Sơn Nhất", "Hà Nội", "20/10/2020", "3.5 giờ", "Đang bay"},
                    {"7", "Tân Sơn Nhất", "Hà Nội", "20/10/2020", "3.5 giờ", "Đang bay"},
                    {"8", "Tân Sơn Nhất", "Hà Nội", "20/10/2020", "3.5 giờ", "Đang bay"},
                    {"9", "Tân Sơn Nhất", "Hà Nội", "20/10/2020", "3.5 giờ", "Đang bay"},
                    {"10", "Tân Sơn Nhất", "Hà Nội", "20/10/2020", "3.5 giờ", "Sắp khởi hành"},
                    {"11", "Tân Sơn Nhất", "Hà Nội", "20/10/2020", "3.5 giờ", "Sắp khởi hành"},
                    {"12", "Tân Sơn Nhất", "Hà Nội", "20/10/2020", "3.5 giờ", "Sắp khởi hành"},
                    {"13", "Tân Sơn Nhất", "Hà Nội", "20/10/2020", "3.5 giờ", "Sắp khởi hành"},
                    {"14", "Tân Sơn Nhất", "Hà Nội", "20/10/2020", "3.5 giờ", "Sắp khởi hành"},
                    {"15", "Tân Sơn Nhất", "Hà Nội", "20/10/2020", "3 giờ", "Sắp khởi hành"},
                    {"16", "Tân Sơn Nhất", "Hà Nội", "20/10/2020", "3 giờ", "Sắp khởi hành"},
                    {"17", "Tân Sơn Nhất", "Hà Nội", "20/10/2020", "3 giờ", "Sắp khởi hành"},
                    {"18", "Tân Sơn Nhất", "Hà Nội", "20/10/2020", "3 giờ", "Sắp khởi hành"},
                    {"19", "Tân Sơn Nhất", "Hà Nội", "20/10/2020", "3 giờ", "Sắp khởi hành"},
                    {"20", "Tân Sơn Nhất", "Hà Nội", "20/10/2020", "3 giờ", "Sắp khởi hành"},
                    {"21", "Tân Sơn Nhất", "Hà Nội", "20/10/2020", "3 giờ", "Sắp khởi hành"}
                },
                new String[]{
                    "Mã chuyến bay", "Sân bay đi", "Sân bay đến", "Ngày khởi hành", "Thời gian bay", "Tình trạng"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        table.setModel(dtm);
    }

    private void setupUIForTable() {
        table.setGridColor(Color.BLACK);
        table.setShowGrid(true);
        table.setRowHeight(50);

        //Header
        JTableHeader tableHeader = table.getTableHeader();
        tableHeader.setPreferredSize(new Dimension(80, 50));
        tableHeader.setFont(new Font("Tahoma", 1, 16));
        tableHeader.setForeground(Color.BLACK);
        tableHeader.setReorderingAllowed(false);
        tableHeader.setBorder(BorderFactory.createLineBorder(new Color(102, 102, 102), 1));

        //Column
        TableColumnModel tableColumnModel = table.getColumnModel();
        tableColumnModel.getColumn(0).setPreferredWidth(100);
        tableColumnModel.getColumn(1).setPreferredWidth(200);
        tableColumnModel.getColumn(2).setPreferredWidth(300);
        tableColumnModel.getColumn(3).setPreferredWidth(300);
        tableColumnModel.getColumn(4).setPreferredWidth(300);
        tableColumnModel.getColumn(5).setPreferredWidth(200);

    }

}
