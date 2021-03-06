/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.user.phieu;

import bus.HangveBUS;
import bus.KhachhangBUS;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import pojos.Chuyenbay;
import pojos.Giahangvetheocb;
import pojos.Khachhang;
import pojos.Phieucho;
import ui.user.MainForUser;

/**
 *
 * @author DELL
 */
public class ThongBaoPhieuChoPanel extends javax.swing.JPanel {

    /**
     * Creates new form ThongBaoPhieuChoPanel
     */
    List<Double> listGia;
    List<Integer> listSL;
    public ThongBaoPhieuChoPanel(Chuyenbay cb) {
        initComponents();
        
        jlbSBDi.setText(cb.getSanbaydi().getThanhPho() + " (" + cb.getSanbaydi().getMaSb() + ")");
        jlbSBDen.setText(cb.getSanbayden().getThanhPho() + " (" + cb.getSanbayden().getMaSb() + ")");
        
        DateFormat df1 = new SimpleDateFormat("hh:mm dd/MM/yyyy");
        jlbNgay.setText(df1.format(cb.getNgayKhoiHanh()));
        
        Iterator<Giahangvetheocb> gias = cb.getGiahangvetheocbs().iterator();
        listGia = new ArrayList();
        listSL = new ArrayList();
        while(gias.hasNext()){
            Giahangvetheocb gia = gias.next();
            
            cbbHangGhe.addItem(HangveBUS.getTicketLevelName(gia.getHangve().getMaHangVe()));
            listGia.add(gia.getGiaHienTai());
            listSL.add(cb.laySoGheTrongTheoHangVe(gia.getHangve().getMaHangVe()));
        }

        jlbGia.setText(String.format("%,.0f VND", listGia.get(0)));
        jlbSL.setText(String.format("%d vé", listSL.get(0)));            
        
        DefaultTableModel model = new DefaultTableModel(
                new String[]{"STT","Tên khách hàng","Giới tính","Ngày sinh", "Số điện thoại"}, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        
        int pos = 1;
        Iterator<Phieucho> pcs = cb.getPhieuchos().iterator();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        while(pcs.hasNext()){
            Phieucho pc = pcs.next();
            Khachhang kh = KhachhangBUS.getKHbyID(pc.getKhachhang().getMaKh());
            model.addRow(new Object[]{pos,kh.getHoTen(),kh.getGioiTinh(),df.format(kh.getNgaySinh()),kh.getSdt()});
            pos++;
        }
        
        jtbDSPhieuCho.setModel(model);
        jtbDSPhieuCho.setFont(new java.awt.Font("Tahoma", 0, 16));
        jtbDSPhieuCho.getTableHeader().setReorderingAllowed(false);
        jtbDSPhieuCho.getTableHeader().setFont(new java.awt.Font("Tahoma", 1, 16));
        
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( SwingConstants.CENTER );
        for(int i = 0; i < 5; i++)
            jtbDSPhieuCho.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jpnThongTinKHs = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbDSPhieuCho = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jlbSBDi = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jlbSBDen = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jlbNgay = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        filler8 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0));
        cbbHangGhe = new javax.swing.JComboBox<>();
        jPanel11 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jlbGia = new javax.swing.JLabel();
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(30, 0), new java.awt.Dimension(30, 0), new java.awt.Dimension(30, 0));
        jLabel10 = new javax.swing.JLabel();
        jlbSL = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        btnBack = new javax.swing.JButton();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 70), new java.awt.Dimension(0, 70), new java.awt.Dimension(0, 70));
        jButton2 = new javax.swing.JButton();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));

        setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setText("Thông báo chuyến bay cho khách hàng");
        jPanel1.add(jLabel1);
        jPanel1.add(filler1);

        add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jpnThongTinKHs.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin khách hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jpnThongTinKHs.setLayout(new java.awt.BorderLayout());

        jtbDSPhieuCho.setAutoCreateRowSorter(true);
        jtbDSPhieuCho.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jtbDSPhieuCho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jtbDSPhieuCho.setRowHeight(35);
        jScrollPane1.setViewportView(jtbDSPhieuCho);

        jpnThongTinKHs.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        add(jpnThongTinKHs, java.awt.BorderLayout.CENTER);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chi tiết vé", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jPanel6.setMaximumSize(new java.awt.Dimension(450, 400));
        jPanel6.setMinimumSize(new java.awt.Dimension(450, 400));
        jPanel6.setPreferredSize(new java.awt.Dimension(450, 400));
        jPanel6.setLayout(new javax.swing.BoxLayout(jPanel6, javax.swing.BoxLayout.Y_AXIS));

        jPanel7.setMaximumSize(new java.awt.Dimension(32767, 40));
        jPanel7.setMinimumSize(new java.awt.Dimension(100, 40));
        jPanel7.setLayout(new javax.swing.BoxLayout(jPanel7, javax.swing.BoxLayout.LINE_AXIS));

        jPanel9.setMaximumSize(new java.awt.Dimension(200, 40));
        jPanel9.setMinimumSize(new java.awt.Dimension(200, 40));
        jPanel9.setPreferredSize(new java.awt.Dimension(200, 40));
        jPanel9.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jlbSBDi.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jlbSBDi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/plane_takeoff.png"))); // NOI18N
        jlbSBDi.setText("Hà nội (HAN)");
        jlbSBDi.setMaximumSize(new java.awt.Dimension(200, 40));
        jlbSBDi.setMinimumSize(new java.awt.Dimension(200, 40));
        jlbSBDi.setPreferredSize(new java.awt.Dimension(200, 40));
        jPanel9.add(jlbSBDi);

        jPanel7.add(jPanel9);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/flight.png"))); // NOI18N
        jLabel7.setMaximumSize(new java.awt.Dimension(60, 40));
        jLabel7.setMinimumSize(new java.awt.Dimension(60, 40));
        jLabel7.setPreferredSize(new java.awt.Dimension(60, 40));
        jPanel7.add(jLabel7);

        jPanel13.setMaximumSize(new java.awt.Dimension(200, 40));
        jPanel13.setMinimumSize(new java.awt.Dimension(200, 40));
        jPanel13.setPreferredSize(new java.awt.Dimension(200, 40));
        jPanel13.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jlbSBDen.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jlbSBDen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/plane_landing.png"))); // NOI18N
        jlbSBDen.setText("TPHCM (SGN)");
        jlbSBDen.setMaximumSize(new java.awt.Dimension(200, 40));
        jlbSBDen.setMinimumSize(new java.awt.Dimension(200, 40));
        jlbSBDen.setPreferredSize(new java.awt.Dimension(200, 40));
        jPanel13.add(jlbSBDen);

        jPanel7.add(jPanel13);

        jPanel6.add(jPanel7);

        jPanel8.setMaximumSize(new java.awt.Dimension(32767, 40));
        jPanel8.setMinimumSize(new java.awt.Dimension(100, 40));
        jPanel8.setLayout(new javax.swing.BoxLayout(jPanel8, javax.swing.BoxLayout.LINE_AXIS));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Ngày khởi hành: ");
        jPanel8.add(jLabel6);

        jlbNgay.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlbNgay.setText("07h00 18/08/2020");
        jPanel8.add(jlbNgay);

        jPanel6.add(jPanel8);

        jPanel10.setMaximumSize(new java.awt.Dimension(32767, 60));
        jPanel10.setMinimumSize(new java.awt.Dimension(100, 60));
        jPanel10.setPreferredSize(new java.awt.Dimension(463, 60));
        jPanel10.setLayout(new javax.swing.BoxLayout(jPanel10, javax.swing.BoxLayout.LINE_AXIS));

        jPanel14.setLayout(new javax.swing.BoxLayout(jPanel14, javax.swing.BoxLayout.LINE_AXIS));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/seat_level.png"))); // NOI18N
        jPanel14.add(jLabel8);
        jPanel14.add(filler8);

        cbbHangGhe.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        cbbHangGhe.setMaximumSize(new java.awt.Dimension(200, 40));
        cbbHangGhe.setMinimumSize(new java.awt.Dimension(200, 40));
        cbbHangGhe.setPreferredSize(new java.awt.Dimension(200, 40));
        cbbHangGhe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbHangGheActionPerformed(evt);
            }
        });
        jPanel14.add(cbbHangGhe);

        jPanel10.add(jPanel14);

        jPanel6.add(jPanel10);

        jPanel11.setMaximumSize(new java.awt.Dimension(32767, 40));
        jPanel11.setMinimumSize(new java.awt.Dimension(100, 40));
        jPanel11.setLayout(new javax.swing.BoxLayout(jPanel11, javax.swing.BoxLayout.LINE_AXIS));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Giá vé: ");
        jPanel11.add(jLabel9);

        jlbGia.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlbGia.setText("500.000 VND");
        jPanel11.add(jlbGia);
        jPanel11.add(filler5);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Số lượng: ");
        jPanel11.add(jLabel10);

        jlbSL.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlbSL.setText("01 vé");
        jPanel11.add(jlbSL);

        jPanel6.add(jPanel11);

        add(jPanel6, java.awt.BorderLayout.EAST);

        jPanel5.setMaximumSize(new java.awt.Dimension(32767, 40));
        jPanel5.setMinimumSize(new java.awt.Dimension(100, 40));
        jPanel5.setLayout(new javax.swing.BoxLayout(jPanel5, javax.swing.BoxLayout.LINE_AXIS));
        jPanel5.add(filler4);

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnBack.setText("Back");
        btnBack.setMaximumSize(new java.awt.Dimension(150, 40));
        btnBack.setMinimumSize(new java.awt.Dimension(150, 40));
        btnBack.setPreferredSize(new java.awt.Dimension(150, 40));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel5.add(btnBack);
        jPanel5.add(filler2);
        jPanel5.add(filler6);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Xóa tất cả phiếu");
        jButton2.setMaximumSize(new java.awt.Dimension(200, 40));
        jButton2.setMinimumSize(new java.awt.Dimension(200, 40));
        jButton2.setPreferredSize(new java.awt.Dimension(200, 40));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton2);
        jPanel5.add(filler3);

        add(jPanel5, java.awt.BorderLayout.PAGE_END);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        MainForUser.getInstance().getqlPhieuChoPane().hoanThanhThongBao(this, "back");
    }//GEN-LAST:event_btnBackActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        MainForUser.getInstance().getqlPhieuChoPane().hoanThanhThongBao(this, "remove");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cbbHangGheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbHangGheActionPerformed
        int index = cbbHangGhe.getSelectedIndex();
        try{
            jlbGia.setText(String.format("%,.0f VND", listGia.get(index)));
            jlbSL.setText(String.format("%d vé", listSL.get(index)));
        }catch(IndexOutOfBoundsException ex){
        }
        
    }//GEN-LAST:event_cbbHangGheActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JComboBox<String> cbbHangGhe;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    private javax.swing.Box.Filler filler6;
    private javax.swing.Box.Filler filler8;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlbGia;
    private javax.swing.JLabel jlbNgay;
    private javax.swing.JLabel jlbSBDen;
    private javax.swing.JLabel jlbSBDi;
    private javax.swing.JLabel jlbSL;
    private javax.swing.JPanel jpnThongTinKHs;
    private javax.swing.JTable jtbDSPhieuCho;
    // End of variables declaration//GEN-END:variables
}
