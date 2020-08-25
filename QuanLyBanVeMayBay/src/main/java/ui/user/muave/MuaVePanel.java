/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.user.muave;

import daos.HangveDAO;
import java.awt.Dimension;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import javax.swing.JOptionPane;
import pojos.Chuyenbay;
import pojos.Giahangvetheocb;
import ui.user.MainForUser;

/**
 *
 * @author DELL
 */
public class MuaVePanel extends javax.swing.JPanel {

    /**
     * Creates new form MuaVePanel
     */
    public MuaVePanel(Chuyenbay cb, int sl, String mahangve) {
        initComponents();
        int index = MainForUser.getInstance().getCurrentPaneIndex();
        
        //set width + height jsp and jpn
        int width = 3*400 + 50;
        int height = (sl/3 + 1)*300 + 50;
        Dimension size = new Dimension(width, height);
        jsp.setMinimumSize(size);
        jsp.setPreferredSize(size);
        
        jpnThongTinKHs.setMinimumSize(size);
        jpnThongTinKHs.setPreferredSize(size);
        
        if(index == 1){
            btnBack.setVisible(false);
            filler2.setVisible(false);
            
            //test for qldatve
            for(int i = 0; i < sl; i++){
                jpnThongTinKHs.add(new DienThongTinKHPanel(i+1));
            }
        }
        
        
        if(cb != null){//test for ql dat ve
        jlbSBDi.setText(cb.getSanbaydi().getThanhPho() + " (" + cb.getSanbaydi().getMaSb() + ")");
            jlbSBDen.setText(cb.getSanbayden().getThanhPho() + " (" + cb.getSanbayden().getMaSb() + ")");
        
        DateFormat df = new SimpleDateFormat("HH:mm");
        String timeStart = df.format(cb.getNgayKhoiHanh());
        jlbTimeStart.setText(timeStart);
        for(int i = 0; i < sl; i++){
            jpnThongTinKHs.add(new DienThongTinKHPanel(i+1));
        }
        
        DateFormat df1 = new SimpleDateFormat("dd/MM/yyyy");
        jlbNgay.setText(df1.format(cb.getNgayKhoiHanh()));
        
        if(sl < 10)
            jlbSL.setText(String.format("%02d", sl));
        else
            jlbSL.setText(String.format("%d", sl));
        
        String tenhv = HangveDAO.getTicketLevelName(mahangve);
        
        jlbHangVe.setText(tenhv);
        
        Iterator<Giahangvetheocb> tgs1 = cb.getGiahangvetheocbs().iterator();
        
        while(tgs1.hasNext()){
            Giahangvetheocb giahv = tgs1.next();
            if(giahv.getHangve().getMaHangVe().equalsIgnoreCase(mahangve)){
                jlbGia.setText(String.format("%,.0f VND",giahv.getGiaHienTai()));
                jlbTongTien.setText(String.format("%,.0f VND",giahv.getGiaHienTai()*sl));
            }       
        }
        }
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
        jsp = new javax.swing.JScrollPane();
        jpnThongTinKHs = new javax.swing.JPanel();
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
        jPanel21 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jlbTimeStart = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jlbSL = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jlbHangVe = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jlbGia = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jlbTongTien = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        btnBack = new javax.swing.JButton();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jButton2 = new javax.swing.JButton();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));

        setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setText("Nhập thông tin khách hàng");
        jPanel1.add(jLabel1);
        jPanel1.add(filler1);

        add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jsp.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jpnThongTinKHs.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin khách hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jpnThongTinKHs.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
        jsp.setViewportView(jpnThongTinKHs);

        add(jsp, java.awt.BorderLayout.CENTER);

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
        jlbNgay.setText("18/08/2020");
        jPanel8.add(jlbNgay);

        jPanel6.add(jPanel8);

        jPanel21.setMaximumSize(new java.awt.Dimension(32767, 40));
        jPanel21.setMinimumSize(new java.awt.Dimension(100, 40));
        jPanel21.setLayout(new javax.swing.BoxLayout(jPanel21, javax.swing.BoxLayout.LINE_AXIS));

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel29.setText("Giờ bay: ");
        jPanel21.add(jLabel29);

        jlbTimeStart.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlbTimeStart.setText("07h00");
        jPanel21.add(jlbTimeStart);

        jPanel6.add(jPanel21);

        jPanel2.setMaximumSize(new java.awt.Dimension(32767, 40));
        jPanel2.setMinimumSize(new java.awt.Dimension(100, 40));
        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.LINE_AXIS));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Số lượng vé: ");
        jPanel2.add(jLabel5);

        jlbSL.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlbSL.setText("02");
        jPanel2.add(jlbSL);

        jPanel6.add(jPanel2);

        jPanel10.setMaximumSize(new java.awt.Dimension(32767, 40));
        jPanel10.setMinimumSize(new java.awt.Dimension(100, 40));
        jPanel10.setLayout(new javax.swing.BoxLayout(jPanel10, javax.swing.BoxLayout.LINE_AXIS));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Hạng vé: ");
        jPanel10.add(jLabel10);

        jlbHangVe.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlbHangVe.setText("Phổ thông");
        jPanel10.add(jlbHangVe);

        jPanel6.add(jPanel10);

        jPanel4.setMaximumSize(new java.awt.Dimension(32767, 40));
        jPanel4.setMinimumSize(new java.awt.Dimension(100, 40));
        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.LINE_AXIS));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Giá vé: ");
        jPanel4.add(jLabel9);

        jlbGia.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlbGia.setText("500.000 VND");
        jPanel4.add(jlbGia);

        jPanel6.add(jPanel4);

        jPanel3.setMaximumSize(new java.awt.Dimension(32767, 40));
        jPanel3.setMinimumSize(new java.awt.Dimension(100, 40));
        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.LINE_AXIS));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setText("Thành tiền: ");
        jPanel3.add(jLabel15);

        jlbTongTien.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlbTongTien.setForeground(new java.awt.Color(255, 0, 0));
        jlbTongTien.setText("1.000.000 VND");
        jPanel3.add(jlbTongTien);

        jPanel6.add(jPanel3);

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

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Thanh toán");
        jButton2.setMaximumSize(new java.awt.Dimension(150, 40));
        jButton2.setMinimumSize(new java.awt.Dimension(150, 40));
        jButton2.setPreferredSize(new java.awt.Dimension(150, 40));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton2);
        jPanel5.add(filler3);

        jPanel6.add(jPanel5);

        add(jPanel6, java.awt.BorderLayout.EAST);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        MainForUser.getInstance().getTraCuuPane().changeLayout(this, "backChiTiet");
    }//GEN-LAST:event_btnBackActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //JOptionPane.showMessageDialog(null, );
        int index = MainForUser.getInstance().getCurrentPaneIndex();
        if(index == 0)
            MainForUser.getInstance().getTraCuuPane().changeLayout(new InVePanel(), "inve");
        if(index == 1)
            MainForUser.getInstance().getXuLyDatVePane().inVe(new InVePanel());
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel jlbGia;
    private javax.swing.JLabel jlbHangVe;
    private javax.swing.JLabel jlbNgay;
    private javax.swing.JLabel jlbSBDen;
    private javax.swing.JLabel jlbSBDi;
    private javax.swing.JLabel jlbSL;
    private javax.swing.JLabel jlbTimeStart;
    private javax.swing.JLabel jlbTongTien;
    private javax.swing.JPanel jpnThongTinKHs;
    private javax.swing.JScrollPane jsp;
    // End of variables declaration//GEN-END:variables
}
