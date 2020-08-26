/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.admin.quanlycb;

import bus.ChuyenbayBUS;
import bus.SanbayBUS;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableRowSorter;
import pojos.Chuyenbay;
import pojos.Sanbay;
import util.ui.CustomCenterAlignmentRenderer;
import util.ui.CustomLeftAlignmentRenderer;
import util.ui.CustomTaskButtonRenderer;

/**
 *
 * @author HAO
 */
public class QuanLyChuyenBayPane extends javax.swing.JPanel {

    private DefaultTableModel dtm;
    private TableRowSorter sorter;
    public static final Color SELCECTED_COLOR = new Color(208, 218, 253);
    public static final Color EVEN_COLOR = new Color(255, 255, 255);
    public static final Color ODD_COLOR = new Color(230, 230, 230);

    List<Chuyenbay> listCB;
    List<Sanbay> listSBDi;
    List<Sanbay> listSBDen;
    /**
     * Creates new form QuanLyChuyenBay
     */
    public QuanLyChuyenBayPane() {
        initComponents();
        setupModelForControl();
        setupTable();
        setupModelForTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        parentPane = new javax.swing.JPanel();
        homePane = new javax.swing.JPanel();
        controlPanel = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0));
        cbbSanBayDi = new javax.swing.JComboBox<>();
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0));
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0));
        cbbSanBayDen = new javax.swing.JComboBox<>();
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0));
        jPanel8 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0));
        jLabel5 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        filler7 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0));
        jPanel9 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0));
        cbbHangGhe = new javax.swing.JComboBox<>();
        filler8 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0));
        jPanel10 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        filler9 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0));
        jDateStart = new com.toedter.calendar.JDateChooser();
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
        filler10 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        titleLabel = new javax.swing.JLabel();
        filler11 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));

        setLayout(new java.awt.BorderLayout());

        parentPane.setLayout(new java.awt.CardLayout());

        homePane.setLayout(new java.awt.BorderLayout());

        controlPanel.setLayout(new javax.swing.BoxLayout(controlPanel, javax.swing.BoxLayout.PAGE_AXIS));

        jPanel4.setBackground(new java.awt.Color(250, 250, 250));
        jPanel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 20, 15, 20));
        jPanel4.setMaximumSize(new java.awt.Dimension(32767, 100));
        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.LINE_AXIS));

        jPanel6.setBackground(new java.awt.Color(250, 250, 250));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Điểm khởi hành", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 16))); // NOI18N
        jPanel6.setLayout(new javax.swing.BoxLayout(jPanel6, javax.swing.BoxLayout.LINE_AXIS));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/plane_takeoff.png"))); // NOI18N
        jPanel6.add(jLabel2);
        jPanel6.add(filler1);

        cbbSanBayDi.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        cbbSanBayDi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbbSanBayDi.setMaximumSize(new java.awt.Dimension(200, 40));
        cbbSanBayDi.setMinimumSize(new java.awt.Dimension(200, 40));
        cbbSanBayDi.setPreferredSize(new java.awt.Dimension(200, 40));
        jPanel6.add(cbbSanBayDi);

        jPanel4.add(jPanel6);
        jPanel4.add(filler4);

        jPanel7.setBackground(new java.awt.Color(250, 250, 250));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Điểm đến", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 16))); // NOI18N
        jPanel7.setLayout(new javax.swing.BoxLayout(jPanel7, javax.swing.BoxLayout.LINE_AXIS));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/plane_landing.png"))); // NOI18N
        jPanel7.add(jLabel3);
        jPanel7.add(filler2);

        cbbSanBayDen.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        cbbSanBayDen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbbSanBayDen.setMaximumSize(new java.awt.Dimension(200, 40));
        cbbSanBayDen.setMinimumSize(new java.awt.Dimension(200, 40));
        cbbSanBayDen.setPreferredSize(new java.awt.Dimension(200, 40));
        jPanel7.add(cbbSanBayDen);

        jPanel4.add(jPanel7);
        jPanel4.add(filler5);

        jPanel8.setBackground(new java.awt.Color(250, 250, 250));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Số hành khách", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 16))); // NOI18N
        jPanel8.setLayout(new javax.swing.BoxLayout(jPanel8, javax.swing.BoxLayout.LINE_AXIS));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/passengers.png"))); // NOI18N
        jPanel8.add(jLabel4);
        jPanel8.add(filler3);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setText("Số lượng: ");
        jPanel8.add(jLabel5);

        jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        jFormattedTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jFormattedTextField1.setMaximumSize(new java.awt.Dimension(50, 35));
        jFormattedTextField1.setMinimumSize(new java.awt.Dimension(50, 35));
        jFormattedTextField1.setPreferredSize(new java.awt.Dimension(50, 35));
        jPanel8.add(jFormattedTextField1);

        jPanel4.add(jPanel8);
        jPanel4.add(filler7);

        jPanel9.setBackground(new java.awt.Color(250, 250, 250));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Hạng ghế", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 16))); // NOI18N
        jPanel9.setLayout(new javax.swing.BoxLayout(jPanel9, javax.swing.BoxLayout.LINE_AXIS));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/seat_level.png"))); // NOI18N
        jPanel9.add(jLabel6);
        jPanel9.add(filler6);

        cbbHangGhe.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        cbbHangGhe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hạng 1", "Hạng 2", "Hạng 3" }));
        cbbHangGhe.setMaximumSize(new java.awt.Dimension(200, 40));
        cbbHangGhe.setMinimumSize(new java.awt.Dimension(200, 40));
        cbbHangGhe.setPreferredSize(new java.awt.Dimension(200, 40));
        jPanel9.add(cbbHangGhe);

        jPanel4.add(jPanel9);
        jPanel4.add(filler8);

        jPanel10.setBackground(new java.awt.Color(250, 250, 250));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ngày đi", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 16))); // NOI18N
        jPanel10.setMaximumSize(new java.awt.Dimension(250, 70));
        jPanel10.setMinimumSize(new java.awt.Dimension(250, 70));
        jPanel10.setPreferredSize(new java.awt.Dimension(250, 70));
        jPanel10.setLayout(new javax.swing.BoxLayout(jPanel10, javax.swing.BoxLayout.LINE_AXIS));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/calendar.png"))); // NOI18N
        jPanel10.add(jLabel7);
        jPanel10.add(filler9);

        jDateStart.setDateFormatString("dd/MM/yyyy");
        jDateStart.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jDateStart.setMaximumSize(new java.awt.Dimension(200, 40));
        jDateStart.setMinimumSize(new java.awt.Dimension(200, 40));
        jDateStart.setPreferredSize(new java.awt.Dimension(200, 40));
        jPanel10.add(jDateStart);

        jPanel4.add(jPanel10);
        jPanel4.add(filler14);

        addButton.setBackground(new java.awt.Color(140, 197, 66));
        addButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addButton.setForeground(new java.awt.Color(255, 255, 255));
        addButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/plus_math.png"))); // NOI18N
        addButton.setText("Thêm");
        addButton.setMaximumSize(new java.awt.Dimension(120, 50));
        addButton.setPreferredSize(new java.awt.Dimension(120, 50));
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
                {"1", "Tân Sơn Nhất", "Hà Nội", "20/10/2020", "3 giờ", "Đang bay"},
                {"2", "Tân Sơn Nhất", "Hà Nội", "20/10/2020", "3.5 giờ", "Đã bay"},
                {"3", "Tân Sơn Nhất", "Hà Nội", "20/10/2020", "3.5 giờ", "Đã bay"},
                {"5", "Tân Sơn Nhất", "Hà Nội", "20/10/2020", "3.5 giờ", "Đã bay"},
                {"6", "Tân Sơn Nhất", "Hà Nội", "20/10/2020", "3.5 giờ", "Đang bay"}
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
            .addGap(0, 357, Short.MAX_VALUE)
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
            .addGap(0, 357, Short.MAX_VALUE)
        );

        tablePane.add(jPanel2, java.awt.BorderLayout.LINE_START);

        jPanel3.setBackground(new java.awt.Color(250, 250, 250));
        jPanel3.setPreferredSize(new java.awt.Dimension(689, 10));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1592, Short.MAX_VALUE)
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
        titlePane.add(filler10);

        titleLabel.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        titleLabel.setText("Quản lý chuyến bay");
        titlePane.add(titleLabel);
        titlePane.add(filler11);

        tablePane.add(titlePane, java.awt.BorderLayout.PAGE_START);

        homePane.add(tablePane, java.awt.BorderLayout.CENTER);

        parentPane.add(homePane, "card2");

        add(parentPane, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        ThemChuyenBayPane themChuyenBayPane = new ThemChuyenBayPane(this);
        parentPane.add(themChuyenBayPane, themChuyenBayPane.getName());
        CardLayout cl = (CardLayout) parentPane.getLayout();
        cl.show(parentPane, themChuyenBayPane.getName());
    }//GEN-LAST:event_addButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JComboBox<String> cbbHangGhe;
    private javax.swing.JComboBox<String> cbbSanBayDen;
    private javax.swing.JComboBox<String> cbbSanBayDi;
    private javax.swing.JPanel controlPanel;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler10;
    private javax.swing.Box.Filler filler11;
    private javax.swing.Box.Filler filler14;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    private javax.swing.Box.Filler filler6;
    private javax.swing.Box.Filler filler7;
    private javax.swing.Box.Filler filler8;
    private javax.swing.Box.Filler filler9;
    private javax.swing.JPanel homePane;
    private com.toedter.calendar.JDateChooser jDateStart;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel parentPane;
    private javax.swing.JTable table;
    private javax.swing.JPanel tablePane;
    private javax.swing.JScrollPane tableScrollPane;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JPanel titlePane;
    // End of variables declaration//GEN-END:variables

    private void setupTable() {
        setupModelForTable();
        setupUIForTable();
        //fillUpDataTable();
    }
    private void setupModelForTable() {
        dtm = new DefaultTableModel() {
            String[] columnsNames = new String[]{
                "Mã chuyến bay", "Sân bay đi", "Sân bay đến", "Ngày khởi hành", "Thời gian bay", "SL ghế", "Tình trạng", "Tác vụ"
            };
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, Integer.class, Object.class
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

        dtm.addRow(new Object[]{"1", "Thành phố Hồ Chí Minh (SGN)", "Hà Nội (HAN)", "20/10/2020", "3 giờ", 30, "Đang bay"});
        dtm.addRow(new Object[]{"2", "Đà Nẵng (DAD)", "Nha Trang Cam Ranh (CXR)", "20/10/2020", "3.5 giờ", 30, "Đã bay"});
        dtm.addRow(new Object[]{"3", "Phú Quốc (PQC)", "Hà Nội", "20/10/2020", "3.5 giờ", 30, "Đã bay"});
        dtm.addRow(new Object[]{"5", "Tân Sơn Nhất", "Thành phố Vinh (VII)", "20/10/2020", "3.5 giờ", 30, "Đã bay"});
        dtm.addRow(new Object[]{"6", "Nha Trang Cam Ranh (CXR)", "Buôn Ma Thuột (BMV)", "20/10/2020", "3.5 giờ", 30, "Đang bay"});
        dtm.addRow(new Object[]{"7", "Thành phố Vinh (VII)", "Đà Lạt (DLI)", "20/10/2020", "3.5 giờ", 30, "Đang bay"});
//        dtm.addRow(new Object[]{"8", "Tân Sơn Nhất", "Hà Nội", "20/10/2020", "3.5 giờ", 30, "Đang bay"});
//        dtm.addRow(new Object[]{"9", "Tân Sơn Nhất", "Hà Nội", "20/10/2020", "3.5 giờ", 30, "Đang bay"});
//        dtm.addRow(new Object[]{"10", "Tân Sơn Nhất", "Hà Nội", "20/10/2020", "3.5 giờ", 30, "Sắp khởi hành"});
//        dtm.addRow(new Object[]{"11", "Tân Sơn Nhất", "Hà Nội", "20/10/2020", "3.5 giờ", 30, "Sắp khởi hành"});
//        dtm.addRow(new Object[]{"12", "Tân Sơn Nhất", "Hà Nội", "20/10/2020", "3.5 giờ", 30, "Sắp khởi hành"});
//        dtm.addRow(new Object[]{"13", "Tân Sơn Nhất", "Hà Nội", "20/10/2020", "3.5 giờ", 30, "Sắp khởi hành"});
//        dtm.addRow(new Object[]{"14", "Tân Sơn Nhất", "Hà Nội", "20/10/2020", "3.5 giờ", 30, "Sắp khởi hành"});
//        dtm.addRow(new Object[]{"15", "Tân Sơn Nhất", "Hà Nội", "20/10/2020", "3 giờ", 30, "Sắp khởi hành"});
//        dtm.addRow(new Object[]{"16", "Tân Sơn Nhất", "Hà Nội", "20/10/2020", "3 giờ", 30, "Sắp khởi hành"});
//        dtm.addRow(new Object[]{"17", "Tân Sơn Nhất", "Hà Nội", "20/10/2020", "3 giờ", 30, "Sắp khởi hành"});
//        dtm.addRow(new Object[]{"18", "Tân Sơn Nhất", "Hà Nội", "20/10/2020", "3 giờ", 30, "Sắp khởi hành"});
//        dtm.addRow(new Object[]{"19", "Tân Sơn Nhất", "Hà Nội", "20/10/2020", "3 giờ", 30, "Sắp khởi hành"});
//        dtm.addRow(new Object[]{"20", "Tân Sơn Nhất", "Hà Nội", "20/10/2020", "3 giờ", 30, "Sắp khởi hành"});
//        dtm.addRow(new Object[]{"21", "Tân Sơn Nhất", "Hà Nội", "20/10/2020", "3 giờ", 30, "Sắp khởi hành"});

        table.setModel(dtm);

    }

    private void setupUIForTable() {

        //Column
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                TableColumnModel tableColumnModel = table.getColumnModel();
                tableColumnModel.getColumn(0).setPreferredWidth(190);
                tableColumnModel.getColumn(1).setPreferredWidth(400);
                tableColumnModel.getColumn(2).setPreferredWidth(400);
                tableColumnModel.getColumn(3).setPreferredWidth(300);
                tableColumnModel.getColumn(4).setPreferredWidth(200);
                tableColumnModel.getColumn(5).setPreferredWidth(200);
                tableColumnModel.getColumn(6).setPreferredWidth(200);
                tableColumnModel.getColumn(7).setPreferredWidth(200);

                tableColumnModel.getColumn(0).setCellRenderer(new CustomLeftAlignmentRenderer());
                for (int i = 1; i <= 6; i++) {
                    tableColumnModel.getColumn(i).setCellRenderer(new CustomCenterAlignmentRenderer());
                }

                PanelCellEditorRenderer PanelCellEditorRenderer = new PanelCellEditorRenderer();
                int finalIndex = tableColumnModel.getColumnCount() - 1;
                tableColumnModel.getColumn(finalIndex).setCellRenderer(PanelCellEditorRenderer);
                tableColumnModel.getColumn(finalIndex).setCellEditor(PanelCellEditorRenderer);

                //tableColumnModel.getColumn(6).setCellRenderer(new CustomTaskButtonRenderer());

                //setSorterTable();
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

    private void fillUpDataTable() {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                listCB = ChuyenbayBUS.getListChuyenbays();
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
                for (Chuyenbay chuyenbay : listCB) {
                    Sanbay sanBayDi = chuyenbay.getSanbaydi();
                    Sanbay sanBayDen = chuyenbay.getSanbayden();
                    Object[] row = new Object[]{
                        chuyenbay.getMaCb(),
                        sanBayDi.getThanhPho() + " (" + sanBayDi.getMaSb() + ")",
                        sanBayDen.getThanhPho() + " (" + sanBayDen.getMaSb() + ")",
                        sdf.format(chuyenbay.getNgayKhoiHanh()),
                        chuyenbay.getThoiGianBay() + " giờ",
                        chuyenbay.getVechuyenbays().size(),
                        chuyenbay.getTinhTrang()
                    };
                    dtm.addRow(row);
                    //        dtm.addRow(new Object[]{"1", "Tân Sơn Nhất", "Hà Nội", "20/10/2020", "3 giờ", 30, "Đang bay"});
                }
            }
        });

    }

    private void setupModelForControl() {

        //cbb San Bay Di
        listSBDi = SanbayBUS.getAll();
        DefaultComboBoxModel dcbSBDi = new DefaultComboBoxModel();
        dcbSBDi.addElement("Tất cả");
        for (Sanbay sanBayDi: listSBDi){
            dcbSBDi.addElement(sanBayDi.getThanhPho() + " (" + sanBayDi.getMaSb() + ")");
        }
        cbbSanBayDi.setModel(dcbSBDi);

        //cbb San Bay Den
        listSBDen = SanbayBUS.getAll();
        DefaultComboBoxModel dcbSBDen = new DefaultComboBoxModel();
        dcbSBDen.addElement("Tất cả");
        for (Sanbay sanBayDen: listSBDen){
            dcbSBDen.addElement(sanBayDen.getThanhPho() + " (" + sanBayDen.getMaSb() + ")");
        }
        cbbSanBayDen.setModel(dcbSBDen);
    }

}
