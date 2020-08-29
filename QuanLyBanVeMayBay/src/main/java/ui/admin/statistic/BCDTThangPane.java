/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.admin.statistic;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableRowSorter;
import util.ui.CustomCenterAlignmentRenderer;
import util.ui.CustomLeftAlignmentRenderer;

/**
 *
 * @author HAO
 */
public class BCDTThangPane extends javax.swing.JPanel {

    /**
     * Creates new form BCDTThangPane
     */
    private DefaultTableModel dtm;
    private TableRowSorter sorter;
    public static final Color SELCECTED_COLOR = new Color(208, 218, 253);
    public static final Color EVEN_COLOR = new Color(255, 255, 255);
    public static final Color ODD_COLOR = new Color(230, 230, 230);

    public BCDTThangPane() {
        initComponents();

        setupTable();
        setupModelForTable();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        filler8 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0));
        jPanel10 = new javax.swing.JPanel();
        filler13 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0));
        monthSpinnerFrom = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        yearChoosesFrom = new com.toedter.calendar.JYearChooser();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(40, 0), new java.awt.Dimension(40, 0), new java.awt.Dimension(40, 0));
        jPanel12 = new javax.swing.JPanel();
        filler16 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0));
        monthSpinnerFrom1 = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        yearChoosesFrom1 = new com.toedter.calendar.JYearChooser();
        filler14 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        addButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        titlePane = new javax.swing.JPanel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        titleLabel = new javax.swing.JLabel();
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jPanel2 = new javax.swing.JPanel();
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
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(250, 250, 250));
        setName("BCDTThang"); // NOI18N
        setLayout(new java.awt.BorderLayout());

        jPanel5.setBackground(new java.awt.Color(250, 250, 250));
        jPanel5.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 20, 15, 20));
        jPanel5.setMaximumSize(new java.awt.Dimension(32767, 100));
        jPanel5.setPreferredSize(new java.awt.Dimension(690, 100));
        jPanel5.setLayout(new javax.swing.BoxLayout(jPanel5, javax.swing.BoxLayout.LINE_AXIS));
        jPanel5.add(filler8);

        jPanel10.setBackground(new java.awt.Color(250, 250, 250));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Từ tháng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 16))); // NOI18N
        jPanel10.setAlignmentY(0.5F);
        jPanel10.setMaximumSize(new java.awt.Dimension(300, 70));
        jPanel10.setMinimumSize(new java.awt.Dimension(250, 70));
        jPanel10.setPreferredSize(new java.awt.Dimension(300, 70));
        jPanel10.setLayout(new javax.swing.BoxLayout(jPanel10, javax.swing.BoxLayout.LINE_AXIS));
        jPanel10.add(filler13);

        monthSpinnerFrom.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        monthSpinnerFrom.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
        monthSpinnerFrom.setMaximumSize(new java.awt.Dimension(100, 40));
        monthSpinnerFrom.setPreferredSize(new java.awt.Dimension(100, 40));
        jPanel10.add(monthSpinnerFrom);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel1.setText(" / ");
        jPanel10.add(jLabel1);

        yearChoosesFrom.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        yearChoosesFrom.setMaximumSize(new java.awt.Dimension(150, 40));
        yearChoosesFrom.setPreferredSize(new java.awt.Dimension(150, 40));
        jPanel10.add(yearChoosesFrom);

        jPanel5.add(jPanel10);
        jPanel5.add(filler3);

        jPanel12.setBackground(new java.awt.Color(250, 250, 250));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Đến tháng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 16))); // NOI18N
        jPanel12.setMaximumSize(new java.awt.Dimension(300, 70));
        jPanel12.setMinimumSize(new java.awt.Dimension(250, 70));
        jPanel12.setPreferredSize(new java.awt.Dimension(300, 70));
        jPanel12.setLayout(new javax.swing.BoxLayout(jPanel12, javax.swing.BoxLayout.LINE_AXIS));
        jPanel12.add(filler16);

        monthSpinnerFrom1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        monthSpinnerFrom1.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
        monthSpinnerFrom1.setMaximumSize(new java.awt.Dimension(100, 40));
        monthSpinnerFrom1.setPreferredSize(new java.awt.Dimension(100, 40));
        jPanel12.add(monthSpinnerFrom1);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel2.setText(" / ");
        jPanel12.add(jLabel2);

        yearChoosesFrom1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        yearChoosesFrom1.setMaximumSize(new java.awt.Dimension(150, 40));
        yearChoosesFrom1.setPreferredSize(new java.awt.Dimension(150, 40));
        jPanel12.add(yearChoosesFrom1);

        jPanel5.add(jPanel12);
        jPanel5.add(filler14);

        addButton.setBackground(new java.awt.Color(140, 197, 66));
        addButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addButton.setForeground(new java.awt.Color(255, 255, 255));
        addButton.setText("Tìm kiếm");
        addButton.setMaximumSize(new java.awt.Dimension(250, 50));
        addButton.setPreferredSize(new java.awt.Dimension(250, 50));
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        jPanel5.add(addButton);

        add(jPanel5, java.awt.BorderLayout.PAGE_START);

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.BorderLayout());

        titlePane.setBackground(new java.awt.Color(250, 250, 250));
        titlePane.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(102, 102, 102)));
        titlePane.setPreferredSize(new java.awt.Dimension(1405, 60));
        titlePane.setLayout(new javax.swing.BoxLayout(titlePane, javax.swing.BoxLayout.LINE_AXIS));
        titlePane.add(filler1);

        titleLabel.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        titleLabel.setText("Báo cáo doanh thu theo các tháng");
        titlePane.add(titleLabel);
        titlePane.add(filler4);

        jPanel1.add(titlePane, java.awt.BorderLayout.PAGE_START);

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
            .addGap(0, 384, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, java.awt.BorderLayout.LINE_START);

        tableScrollPane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        table.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tháng", "Tổng chuyến bay", "Tổng số vé bán ra", "Tổng doanh thu"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Double.class
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

        jPanel1.add(tableScrollPane, java.awt.BorderLayout.CENTER);

        jPanel3.setBackground(new java.awt.Color(250, 250, 250));
        jPanel3.setPreferredSize(new java.awt.Dimension(20, 427));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 384, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, java.awt.BorderLayout.LINE_END);

        jPanel4.setBackground(new java.awt.Color(250, 250, 250));
        jPanel4.setPreferredSize(new java.awt.Dimension(689, 10));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1040, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, java.awt.BorderLayout.PAGE_END);

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed

    }//GEN-LAST:event_addButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler13;
    private javax.swing.Box.Filler filler14;
    private javax.swing.Box.Filler filler16;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSpinner monthSpinnerFrom;
    private javax.swing.JSpinner monthSpinnerFrom1;
    private javax.swing.JTable table;
    private javax.swing.JScrollPane tableScrollPane;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JPanel titlePane;
    private com.toedter.calendar.JYearChooser yearChoosesFrom;
    private com.toedter.calendar.JYearChooser yearChoosesFrom1;
    // End of variables declaration//GEN-END:variables

    private void setupTable() {
        setupModelForTable();
        setupUIForTable();
    }

    private void setupModelForTable() {
        dtm = new DefaultTableModel() {
            String[] columnsNames = new String[]{
                "Tháng", "Tổng chuyến bay", "Tổng số vé bán ra", "Tổng doanh thu"
            };
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };

            @Override
            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
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

        dtm.addRow(new Object[]{"10/2019", 345, 27230, 30202203});
        dtm.addRow(new Object[]{"11/2019", 620, 32032, 20203403});
        dtm.addRow(new Object[]{"12/2019", 376, 25000, 32322203});
        dtm.addRow(new Object[]{"01/2020", 655, 40230, 40123203});

        table.setModel(dtm);

    }

    private void setupUIForTable() {

        //Column
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                TableColumnModel tableColumnModel = table.getColumnModel();
                tableColumnModel.getColumn(0).setPreferredWidth(250);
                tableColumnModel.getColumn(1).setPreferredWidth(250);
                tableColumnModel.getColumn(2).setPreferredWidth(250);
                tableColumnModel.getColumn(3).setPreferredWidth(300);

                for (int i = 0; i < 4; i++) {
                    tableColumnModel.getColumn(i).setCellRenderer(new CustomCenterAlignmentRenderer());
                }

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
    }

}