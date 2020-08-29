/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.admin.quanlynhanvien;

import bus.NhanvienBUS;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableRowSorter;
import pojos.Nhanvien;
import pojos.Taikhoan;

import util.ui.CustomCenterAlignmentRenderer;
import util.ui.CustomDateRenderer;
import util.ui.CustomLeftAlignmentRenderer;
import util.ui.ImageIconUtil;

/**
 *
 * @author HAO
 */
public class QuanLyNhanVienPane extends javax.swing.JPanel {

//    private static final int SEARCH_BY_NAME = 0;
//    private static final int SEARCH_BY_USERNAME = 1;
//    private static final int SEARCH_BY_PHONE = 2;
//    private static final int SEARCH_BY_CMND = 3;

    /**
     * Creates new form QuanLyNhanVien
     */
    private DefaultTableModel dtm;
    private TableRowSorter sorter;
    public static final Color SELCECTED_COLOR = new Color(208, 218, 253);
    public static final Color EVEN_COLOR = new Color(255, 255, 255);
    public static final Color ODD_COLOR = new Color(230, 230, 230);

    private List<Nhanvien> listNhanviens;

    private int searchCriteria = 0;

    public QuanLyNhanVienPane() {
        initComponents();
        setupTable();
        setupModelForTable();
        fillUpData();
        setEventForFilterControl();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        parentPane = new javax.swing.JPanel();
        homePane = new javax.swing.JPanel();
        controlPanel = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        searchPanel = new javax.swing.JPanel();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0));
        iconSearchLabel = new javax.swing.JLabel();
        searchCriteriaCbb = new javax.swing.JComboBox<>();
        searchField = new javax.swing.JTextField();
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0));
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0));
        filler7 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0));
        filler8 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0));
        filler14 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        addButton = new javax.swing.JButton();
        tablePane = new javax.swing.JPanel();
        tableScrollPane = new javax.swing.JScrollPane();
        table = new javax.swing.JTable(){
            @Override
            public Component prepareRenderer(TableCellRenderer renderer, int row, int column) {
                Component c = super.prepareRenderer(renderer, row, column);
                if (isRowSelected(row)) {
                    c.setBackground(SELCECTED_COLOR);
                } else {

                    Color color = row % 2 == 0? EVEN_COLOR : ODD_COLOR;
                    c.setBackground(color);
                }
                return c;
            }
        };
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        titlePane = new javax.swing.JPanel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        titleLabel = new javax.swing.JLabel();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));

        setBackground(new java.awt.Color(250, 250, 250));
        setLayout(new java.awt.BorderLayout());

        parentPane.setLayout(new java.awt.CardLayout());

        homePane.setLayout(new java.awt.BorderLayout());

        controlPanel.setLayout(new javax.swing.BoxLayout(controlPanel, javax.swing.BoxLayout.PAGE_AXIS));

        jPanel4.setBackground(new java.awt.Color(250, 250, 250));
        jPanel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 20, 15, 20));
        jPanel4.setMaximumSize(new java.awt.Dimension(32767, 100));
        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.LINE_AXIS));

        searchPanel.setBackground(new java.awt.Color(255, 255, 255));
        searchPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        searchPanel.setMaximumSize(new java.awt.Dimension(600, 60));
        searchPanel.setPreferredSize(new java.awt.Dimension(600, 60));
        searchPanel.setLayout(new javax.swing.BoxLayout(searchPanel, javax.swing.BoxLayout.LINE_AXIS));
        searchPanel.add(filler2);

        iconSearchLabel.setMaximumSize(new java.awt.Dimension(50, 50));
        iconSearchLabel.setMinimumSize(new java.awt.Dimension(50, 50));
        iconSearchLabel.setPreferredSize(new java.awt.Dimension(50, 50));
        iconSearchLabel.setIcon(ImageIconUtil.ResizeImage("src/main/resources/icon/search_60px.png", 45, 45));
        searchPanel.add(iconSearchLabel);

        searchCriteriaCbb.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        searchCriteriaCbb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Theo Tên", "Theo Username", "Theo SĐT", "Theo CMND" }));
        searchCriteriaCbb.setBorder(null);
        searchCriteriaCbb.setMaximumSize(new java.awt.Dimension(210, 60));
        searchCriteriaCbb.setPreferredSize(new java.awt.Dimension(210, 60));
        searchPanel.add(searchCriteriaCbb);

        searchField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        searchField.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 7, 0, 7));
        searchPanel.add(searchField);

        jPanel4.add(searchPanel);
        jPanel4.add(filler4);
        jPanel4.add(filler5);
        jPanel4.add(filler7);
        jPanel4.add(filler8);
        jPanel4.add(filler14);

        addButton.setBackground(new java.awt.Color(140, 197, 66));
        addButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addButton.setForeground(new java.awt.Color(255, 255, 255));
        addButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/plus_math.png"))); // NOI18N
        addButton.setText("Thêm nhân viên");
        addButton.setMaximumSize(new java.awt.Dimension(250, 50));
        addButton.setPreferredSize(new java.awt.Dimension(250, 50));
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        jPanel4.add(addButton);

        controlPanel.add(jPanel4);

        homePane.add(controlPanel, java.awt.BorderLayout.PAGE_START);

        tablePane.setLayout(new java.awt.BorderLayout());

        tableScrollPane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        table.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Nhân viên", "Họ tên", "Tên tài khoản", "Giới tính", "Ngày sinh", "SDT", "CMND"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        table.setFillsViewportHeight(true);
        table.setShowVerticalLines(false);
        table.getTableHeader().setReorderingAllowed(false);
        tableScrollPane.setViewportView(table);

        tablePane.add(tableScrollPane, java.awt.BorderLayout.CENTER);

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));
        jPanel1.setPreferredSize(new java.awt.Dimension(20, 427));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 466, Short.MAX_VALUE)
        );

        tablePane.add(jPanel1, java.awt.BorderLayout.LINE_END);

        jPanel2.setBackground(new java.awt.Color(250, 250, 250));
        jPanel2.setPreferredSize(new java.awt.Dimension(20, 427));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 466, Short.MAX_VALUE)
        );

        tablePane.add(jPanel2, java.awt.BorderLayout.LINE_START);

        jPanel3.setBackground(new java.awt.Color(250, 250, 250));
        jPanel3.setPreferredSize(new java.awt.Dimension(689, 10));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1405, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        tablePane.add(jPanel3, java.awt.BorderLayout.PAGE_END);

        titlePane.setBackground(new java.awt.Color(250, 250, 250));
        titlePane.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(102, 102, 102)));
        titlePane.setPreferredSize(new java.awt.Dimension(1405, 60));
        titlePane.setLayout(new javax.swing.BoxLayout(titlePane, javax.swing.BoxLayout.LINE_AXIS));
        titlePane.add(filler1);

        titleLabel.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        titleLabel.setText("Nhân viên");
        titlePane.add(titleLabel);
        titlePane.add(filler3);

        tablePane.add(titlePane, java.awt.BorderLayout.PAGE_START);

        homePane.add(tablePane, java.awt.BorderLayout.CENTER);

        parentPane.add(homePane, "card2");

        add(parentPane, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        ThemNhanVienPane themNhanVienPane = new ThemNhanVienPane(this);
        parentPane.add(themNhanVienPane, themNhanVienPane.getName());
        CardLayout cl = (CardLayout) parentPane.getLayout();
        cl.show(parentPane, themNhanVienPane.getName());
    }//GEN-LAST:event_addButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JPanel controlPanel;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler14;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    private javax.swing.Box.Filler filler7;
    private javax.swing.Box.Filler filler8;
    private javax.swing.JPanel homePane;
    private javax.swing.JLabel iconSearchLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel parentPane;
    private javax.swing.JComboBox<String> searchCriteriaCbb;
    private javax.swing.JTextField searchField;
    private javax.swing.JPanel searchPanel;
    private javax.swing.JTable table;
    private javax.swing.JPanel tablePane;
    private javax.swing.JScrollPane tableScrollPane;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JPanel titlePane;
    // End of variables declaration//GEN-END:variables
    private void setupTable() {
        setupModelForTable();
        setupUIForTable();
    }

    private void setupModelForTable() {
        dtm = new DefaultTableModel() {
            String[] columnsNames = new String[]{
                "Mã nhân viên", "Họ tên", "Tên tài khoản", "Giới tính", "Ngày sinh", "SDT", "Email", "CMND", "Trạng thái", "Tác vụ"
            };
            Class[] types = new Class[]{
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.util.Date.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, Object.class
            };

            @Override
            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            @Override
            public boolean isCellEditable(int row, int column) {
                return column == (columnsNames.length - 1);
            }

            @Override
            public String getColumnName(int column) {
                return columnsNames[column];
            }

            @Override
            public int getColumnCount() {
                return columnsNames.length;
            }
        };

//        dtm.addRow(new Object[]{"1", "Nguyễn Anh Hào", "nguyenanhhaous", "Nam", "27-03-1999", "022390239", "nguyenanhhao.hcmus@gmail.com", "232313112312", "Đang hoạt động"});
//        dtm.addRow(new Object[]{"2", "Nguyễn Anh Hào", "nguyenanhhaous1", "Nam", "27-03-1999", "022390239", "nguyenanhhao.xx@gmail.com", "232313112312", "Nghỉ việc"});
//        dtm.addRow(new Object[]{"3", "Nguyễn Anh Hào", "nguyenanhhaous2", "Nam", "27-03-1999", "022390239", "nguyenanhhao.xx@gmail.com", "232313112312", "Nghỉ việc"});
//        dtm.addRow(new Object[]{"4", "Nguyễn Anh Hào", "ushcm", "Nam", "27-03-1999", "022390239", "nguyenanhhao.xx@gmail.com", "232313112312", "Đang hoạt động"});

        table.setModel(dtm);

    }

    private void setupUIForTable() {

        //Column
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                TableColumnModel tableColumnModel = table.getColumnModel();
                tableColumnModel.getColumn(0).setPreferredWidth(150);
                tableColumnModel.getColumn(1).setPreferredWidth(250);
                tableColumnModel.getColumn(2).setPreferredWidth(250);
                tableColumnModel.getColumn(3).setPreferredWidth(130);
                tableColumnModel.getColumn(4).setPreferredWidth(150);
                tableColumnModel.getColumn(5).setPreferredWidth(200);
                tableColumnModel.getColumn(6).setPreferredWidth(350);
                tableColumnModel.getColumn(7).setPreferredWidth(200);
                tableColumnModel.getColumn(7).setPreferredWidth(250);
                tableColumnModel.getColumn(8).setPreferredWidth(250);
                tableColumnModel.getColumn(9).setPreferredWidth(250);
                tableColumnModel.getColumn(0).setCellRenderer(new CustomLeftAlignmentRenderer());
                for (int i = 1; i <= 8; i++) {
                    if (i != 4) {
                        tableColumnModel.getColumn(i).setCellRenderer(new CustomCenterAlignmentRenderer());
                    }
                }
                tableColumnModel.getColumn(4).setCellRenderer(new CustomDateRenderer());

                NhanVienPanelCellEditorRenderer nhanVienPanelCellEditorRenderer = new NhanVienPanelCellEditorRenderer();
                int finalIndex = tableColumnModel.getColumnCount() - 1;
                tableColumnModel.getColumn(finalIndex).setCellRenderer(nhanVienPanelCellEditorRenderer);
                tableColumnModel.getColumn(finalIndex).setCellEditor(nhanVienPanelCellEditorRenderer);
                setSorterTable();

            }
        });
        table.setGridColor(Color.BLACK);
        table.setShowGrid(true);
        table.setShowVerticalLines(false);
        table.setRowHeight(60);

        //Header
        JTableHeader tableHeader = table.getTableHeader();
        tableHeader.setPreferredSize(new Dimension(80, 60));
        tableHeader.setFont(new Font("Tahoma", 1, 16));
        tableHeader.setForeground(new Color(34, 103, 190));
        tableHeader.setBackground(new Color(210, 227, 240));
        tableHeader.setReorderingAllowed(false);
        tableHeader.setBorder(BorderFactory.createLineBorder(new Color(102, 102, 102), 1));

    }

    private void setSorterTable() {
        sorter = new TableRowSorter<>(table.getModel());
        table.setRowSorter(sorter);
        int finalIndex = table.getColumnCount() - 1;
        sorter.setSortable(finalIndex, false);
    }

    public JPanel getParentPane() {
        return parentPane;
    }

    private void fillUpData() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                listNhanviens = NhanvienBUS.getListNhanVien();

                for (Nhanvien nhanvien : listNhanviens) {

                    Taikhoan taikhoan = nhanvien.getTaikhoan();
                    String tdn = "";
                    if (taikhoan != null) {
                        tdn = taikhoan.getTenTaiKhoan();
                    }

                    dtm.addRow(new Object[]{
                        nhanvien.getIdNhanVien(),
                        nhanvien.getHoTen(),
                        tdn,
                        nhanvien.getGioiTinh(),
                        nhanvien.getNgaySinh(),
                        nhanvien.getSdt(),
                        nhanvien.getEmail(),
                        nhanvien.getCmnd(),
                        nhanvien.getTrangThai(),
                        null
                    });
                }

            }
        });
    }

    private void setEventForFilterControl() {
        searchCriteriaCbb.addItemListener((ItemEvent e) -> {
            searchCriteria = searchCriteriaCbb.getSelectedIndex();
        });

        searchField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                changedUpdate(e);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                changedUpdate(e);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                proceedToFilter();
            }
        });
    }

    public void proceedToFilter() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

                listNhanviens = NhanvienBUS.getListNhanVien(searchCriteria, searchField.getText());

                table.removeEditor();
                dtm.setRowCount(0);



                for (Nhanvien nhanvien : listNhanviens) {

                    Taikhoan taikhoan = nhanvien.getTaikhoan();
                    String tdn = "";
                    if (taikhoan != null) {
                        tdn = taikhoan.getTenTaiKhoan();
                    }

                    dtm.addRow(new Object[]{
                        nhanvien.getIdNhanVien(),
                        nhanvien.getHoTen(),
                        tdn,
                        nhanvien.getGioiTinh(),
                        nhanvien.getNgaySinh(),
                        nhanvien.getSdt(),
                        nhanvien.getEmail(),
                        nhanvien.getCmnd(),
                        nhanvien.getTrangThai(),
                        null
                    });

                }
            }

        });
    }

}
