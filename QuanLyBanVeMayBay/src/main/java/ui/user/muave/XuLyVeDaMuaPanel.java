/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.user.muave;

import bus.ChuyenbayBUS;
import bus.QuydinhBUS;
import daos.HangveDAO;
import java.awt.Color;
import java.awt.Font;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import pojos.Chuyenbay;
import pojos.Giahangvetheocb;
import pojos.Hoadonmuave;
import pojos.Sanbaytrunggian;
import ui.user.MainForUser;
import ui.user.tracuucb.ketqua.PlaceBreakPanel;

/**
 *
 * @author DELL
 */
public class XuLyVeDaMuaPanel extends javax.swing.JPanel {

    /**
     * Creates new form XuLyVeDaMuaPanel
     */
    Hoadonmuave hd;
    Date ngayKhoiHanh;
    public XuLyVeDaMuaPanel(Hoadonmuave hd, String idNumber) {
        initComponents();
        this.hd = hd;
        Chuyenbay cb = ChuyenbayBUS.getChuyenBayByID(hd.getVechuyenbay().getChuyenbay().getMaCb());
        this.ngayKhoiHanh = cb.getNgayKhoiHanh();
        String[] dayOfWeek = {"Chủ nhật", "Thứ hai", "Thứ ba", "Thứ tư", "Thứ năm", "Thứ sáu", "Thứ bảy"};
        Calendar cal = Calendar.getInstance();
        cal.setTime(cb.getNgayKhoiHanh());
        String thu = dayOfWeek[cal.get(Calendar.DAY_OF_WEEK) - 1];
        DateFormat df1 = new SimpleDateFormat("'ngày' dd 'tháng' MM 'năm' yyyy");
        jlbNgay.setText(thu + ", " + df1.format(cb.getNgayKhoiHanh()));
        jlbSBDi.setText(cb.getSanbaydi().getThanhPho() + " (" + cb.getSanbaydi().getMaSb() + ")");
        jlbSBDen.setText(cb.getSanbayden().getThanhPho() + " (" + cb.getSanbayden().getMaSb() + ")");
        
        int sodiemdung = 0;
        if(!cb.getSanbaytrunggians().isEmpty())
            sodiemdung = cb.getSanbaytrunggians().size();
        
        if(sodiemdung == 0){
            jlbSoDiemDung.setText("Bay thẳng");
            jpnContainPlaceBreaks.setVisible(false);
        }
        else
            jlbSoDiemDung.setText(String.format("%d điểm dừng",sodiemdung));
        
        
        DateFormat df = new SimpleDateFormat("HH:mm");
        String timeStart = df.format(cb.getNgayKhoiHanh());
        jlbTimeStart.setText(timeStart);
        
        float time = cb.getThoiGianBay();
        Iterator<Sanbaytrunggian> tgs = cb.getSanbaytrunggians().iterator();
        
        while(tgs.hasNext()){
            Sanbaytrunggian tg = tgs.next();
            time+=tg.getThoiGianDung();
            jpnPlaceBreaks.add(new PlaceBreakPanel(tg));
        }
        //thoigianbay = time;
        time *= 60;// đổi thời gian bay sang phút 
        //JOptionPane.showMessageDialog(null, time);
        String timeEnd = df.format(new Date(cb.getNgayKhoiHanh().getTime() + TimeUnit.MINUTES.toMillis((long) time)));
        
        jlbTimeEnd.setText(timeEnd);
        
        String tenhv = HangveDAO.getTicketLevelName(hd.getVechuyenbay().getHangve().getMaHangVe());
        
        jlbHangVe.setText(tenhv);
        
        Iterator<Giahangvetheocb> tgs1 = cb.getGiahangvetheocbs().iterator();
        
        while(tgs1.hasNext()){
            Giahangvetheocb giahv = tgs1.next();
            if(giahv.getHangve().getMaHangVe().equalsIgnoreCase(hd.getVechuyenbay().getHangve().getMaHangVe())){
                jlbGia.setText(String.format("%,.0f VND",giahv.getGiaHienTai()));
            }       
        }

        float h = time/60;
        float m = time%60;
        if(h == 0)
            jlbTimeFly.setText(String.format("%.0f phút",m));
        else if(m == 0)
            jlbTimeFly.setText(String.format("%.0f giờ",h));
        else
            jlbTimeFly.setText(String.format("%.0f giờ %.0f phút",h,m));
        
        jlbTen.setText(hd.getKhachhang().getHoTen());
        jlbIdNumber.setText(idNumber);
        jlbsdt.setText(hd.getKhachhang().getSdt());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jlbNgay = new javax.swing.JLabel();
        filler18 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jPanel1 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jlbSBDi = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jlbTimeStart = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jlbSBDen = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jlbTimeEnd = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jlbSoDiemDung = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jlbTimeFly = new javax.swing.JLabel();
        filler17 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jpnContainPlaceBreaks = new javax.swing.JPanel();
        jpnPlaceBreaks = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jlbHangVe = new javax.swing.JLabel();
        filler7 = new javax.swing.Box.Filler(new java.awt.Dimension(50, 0), new java.awt.Dimension(50, 0), new java.awt.Dimension(50, 0));
        jLabel9 = new javax.swing.JLabel();
        jlbGia = new javax.swing.JLabel();
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jPanel15 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jlbTen = new javax.swing.JLabel();
        filler8 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jLabel10 = new javax.swing.JLabel();
        jlbIdNumber = new javax.swing.JLabel();
        filler9 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jLabel16 = new javax.swing.JLabel();
        jlbsdt = new javax.swing.JLabel();
        filler10 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jPanel7 = new javax.swing.JPanel();
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jButton5 = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(50, 0), new java.awt.Dimension(50, 0), new java.awt.Dimension(50, 0));
        jButton4 = new javax.swing.JButton();
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.Y_AXIS));

        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 15, 5, 5));
        jPanel2.setMaximumSize(new java.awt.Dimension(1000, 50));
        jPanel2.setMinimumSize(new java.awt.Dimension(500, 50));
        jPanel2.setPreferredSize(new java.awt.Dimension(400, 50));
        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.LINE_AXIS));

        jlbNgay.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlbNgay.setText("Chủ nhật Ngày 16 tháng 8 năm 2020");
        jPanel2.add(jlbNgay);
        jPanel2.add(filler18);

        add(jPanel2);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chi tiết chuyến bay", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jPanel1.setMaximumSize(new java.awt.Dimension(1000, 120));
        jPanel1.setMinimumSize(new java.awt.Dimension(500, 120));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 120));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        jPanel8.setMaximumSize(new java.awt.Dimension(200, 90));
        jPanel8.setMinimumSize(new java.awt.Dimension(200, 90));
        jPanel8.setPreferredSize(new java.awt.Dimension(200, 90));
        jPanel8.setLayout(new javax.swing.BoxLayout(jPanel8, javax.swing.BoxLayout.Y_AXIS));

        jPanel3.setMaximumSize(new java.awt.Dimension(200, 40));
        jPanel3.setMinimumSize(new java.awt.Dimension(200, 40));
        jPanel3.setPreferredSize(new java.awt.Dimension(200, 40));
        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jlbSBDi.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jlbSBDi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/plane_takeoff.png"))); // NOI18N
        jlbSBDi.setText("Hà nội (HAN)");
        jlbSBDi.setMaximumSize(new java.awt.Dimension(200, 40));
        jlbSBDi.setMinimumSize(new java.awt.Dimension(200, 40));
        jlbSBDi.setPreferredSize(new java.awt.Dimension(200, 40));
        jPanel3.add(jlbSBDi);

        jPanel8.add(jPanel3);

        jPanel5.setMaximumSize(new java.awt.Dimension(200, 40));
        jPanel5.setMinimumSize(new java.awt.Dimension(200, 40));
        jPanel5.setPreferredSize(new java.awt.Dimension(200, 40));
        jPanel5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jlbTimeStart.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jlbTimeStart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/clock.png"))); // NOI18N
        jlbTimeStart.setText("07:00");
        jlbTimeStart.setAlignmentY(0.0F);
        jlbTimeStart.setMaximumSize(new java.awt.Dimension(150, 35));
        jlbTimeStart.setMinimumSize(new java.awt.Dimension(150, 35));
        jlbTimeStart.setPreferredSize(new java.awt.Dimension(150, 35));
        jPanel5.add(jlbTimeStart);

        jPanel8.add(jPanel5);

        jPanel1.add(jPanel8);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/flight.png"))); // NOI18N
        jLabel7.setMaximumSize(new java.awt.Dimension(60, 40));
        jLabel7.setMinimumSize(new java.awt.Dimension(60, 40));
        jLabel7.setPreferredSize(new java.awt.Dimension(60, 40));
        jPanel1.add(jLabel7);

        jPanel12.setMaximumSize(new java.awt.Dimension(250, 90));
        jPanel12.setMinimumSize(new java.awt.Dimension(250, 90));
        jPanel12.setPreferredSize(new java.awt.Dimension(200, 90));
        jPanel12.setLayout(new javax.swing.BoxLayout(jPanel12, javax.swing.BoxLayout.Y_AXIS));

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

        jPanel12.add(jPanel13);

        jPanel14.setMaximumSize(new java.awt.Dimension(200, 40));
        jPanel14.setMinimumSize(new java.awt.Dimension(200, 40));
        jPanel14.setPreferredSize(new java.awt.Dimension(200, 40));
        jPanel14.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jlbTimeEnd.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jlbTimeEnd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/clock.png"))); // NOI18N
        jlbTimeEnd.setText("09:00");
        jlbTimeEnd.setAlignmentY(0.0F);
        jlbTimeEnd.setMaximumSize(new java.awt.Dimension(150, 35));
        jlbTimeEnd.setMinimumSize(new java.awt.Dimension(150, 35));
        jlbTimeEnd.setPreferredSize(new java.awt.Dimension(150, 35));
        jPanel14.add(jlbTimeEnd);

        jPanel12.add(jPanel14);

        jPanel1.add(jPanel12);

        jPanel9.setMaximumSize(new java.awt.Dimension(150, 90));
        jPanel9.setMinimumSize(new java.awt.Dimension(150, 90));
        jPanel9.setPreferredSize(new java.awt.Dimension(150, 90));
        jPanel9.setLayout(new javax.swing.BoxLayout(jPanel9, javax.swing.BoxLayout.Y_AXIS));

        jPanel10.setMaximumSize(new java.awt.Dimension(150, 40));
        jPanel10.setMinimumSize(new java.awt.Dimension(150, 40));
        jPanel10.setPreferredSize(new java.awt.Dimension(150, 40));
        jPanel10.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jlbSoDiemDung.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jlbSoDiemDung.setText("Bay thẳng");
        jlbSoDiemDung.setMaximumSize(new java.awt.Dimension(150, 40));
        jlbSoDiemDung.setMinimumSize(new java.awt.Dimension(150, 40));
        jlbSoDiemDung.setPreferredSize(new java.awt.Dimension(150, 40));
        jPanel10.add(jlbSoDiemDung);

        jPanel9.add(jPanel10);

        jPanel11.setMaximumSize(new java.awt.Dimension(200, 40));
        jPanel11.setMinimumSize(new java.awt.Dimension(200, 40));
        jPanel11.setPreferredSize(new java.awt.Dimension(200, 40));
        jPanel11.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jlbTimeFly.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jlbTimeFly.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/timefly.png"))); // NOI18N
        jlbTimeFly.setText("2 giờ");
        jlbTimeFly.setMaximumSize(new java.awt.Dimension(150, 40));
        jlbTimeFly.setMinimumSize(new java.awt.Dimension(150, 40));
        jlbTimeFly.setPreferredSize(new java.awt.Dimension(150, 40));
        jPanel11.add(jlbTimeFly);

        jPanel9.add(jPanel11);

        jPanel1.add(jPanel9);
        jPanel1.add(filler17);

        add(jPanel1);

        jpnContainPlaceBreaks.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Địa điểm dừng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jpnContainPlaceBreaks.setMaximumSize(new java.awt.Dimension(1000, 150));
        jpnContainPlaceBreaks.setMinimumSize(new java.awt.Dimension(12, 100));
        jpnContainPlaceBreaks.setLayout(new javax.swing.BoxLayout(jpnContainPlaceBreaks, javax.swing.BoxLayout.LINE_AXIS));

        jpnPlaceBreaks.setMaximumSize(new java.awt.Dimension(1000, 150));
        jpnPlaceBreaks.setMinimumSize(new java.awt.Dimension(1000, 100));
        jpnPlaceBreaks.setLayout(new javax.swing.BoxLayout(jpnPlaceBreaks, javax.swing.BoxLayout.Y_AXIS));
        jpnContainPlaceBreaks.add(jpnPlaceBreaks);

        add(jpnContainPlaceBreaks);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chi tiết vé", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jPanel6.setMaximumSize(new java.awt.Dimension(1000, 100));
        jPanel6.setLayout(new javax.swing.BoxLayout(jPanel6, javax.swing.BoxLayout.LINE_AXIS));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Hạng vé: ");
        jPanel6.add(jLabel5);

        jlbHangVe.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlbHangVe.setText("Phổ thông");
        jPanel6.add(jlbHangVe);
        jPanel6.add(filler7);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Giá vé: ");
        jPanel6.add(jLabel9);

        jlbGia.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlbGia.setText("500.000 VND");
        jPanel6.add(jlbGia);
        jPanel6.add(filler4);

        add(jPanel6);

        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin khách hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jPanel15.setMaximumSize(new java.awt.Dimension(1000, 100));
        jPanel15.setLayout(new javax.swing.BoxLayout(jPanel15, javax.swing.BoxLayout.LINE_AXIS));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Họ và tên: ");
        jPanel15.add(jLabel6);

        jlbTen.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlbTen.setText("Trần Văn B");
        jPanel15.add(jlbTen);
        jPanel15.add(filler8);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("CMND/Hộ chiếu: ");
        jPanel15.add(jLabel10);

        jlbIdNumber.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlbIdNumber.setText("xxxxxx");
        jPanel15.add(jlbIdNumber);
        jPanel15.add(filler9);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("SDT: ");
        jPanel15.add(jLabel16);

        jlbsdt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlbsdt.setText("0123456789");
        jPanel15.add(jlbsdt);
        jPanel15.add(filler10);

        add(jPanel15);

        jPanel7.setMaximumSize(new java.awt.Dimension(1000, 100));
        jPanel7.setLayout(new javax.swing.BoxLayout(jPanel7, javax.swing.BoxLayout.LINE_AXIS));
        jPanel7.add(filler6);

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5.setText("Trở về");
        jButton5.setMaximumSize(new java.awt.Dimension(150, 50));
        jButton5.setMinimumSize(new java.awt.Dimension(150, 50));
        jButton5.setOpaque(false);
        jButton5.setPreferredSize(new java.awt.Dimension(150, 50));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton5);
        jPanel7.add(filler1);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setText("Hủy vé");
        jButton4.setMaximumSize(new java.awt.Dimension(150, 50));
        jButton4.setMinimumSize(new java.awt.Dimension(150, 50));
        jButton4.setOpaque(false);
        jButton4.setPreferredSize(new java.awt.Dimension(150, 50));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton4);
        jPanel7.add(filler5);

        add(jPanel7);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(QuydinhBUS.ktThoiHanHuyVe(ngayKhoiHanh))
            MainForUser.getInstance().getDoiVePane().hoanThanhHuyVe(hd);
        else{
            JLabel label = new JLabel("Đã quá thời hạn trả vé đối với chuyến bay này.");
            label.setFont(new Font("Arial", Font.BOLD, 18));
            label.setForeground(Color.red);
            JOptionPane.showMessageDialog(null,label,"Warning",JOptionPane.ERROR_MESSAGE);
            MainForUser.getInstance().getDoiVePane().trove();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        MainForUser.getInstance().getDoiVePane().trove();
    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler10;
    private javax.swing.Box.Filler filler17;
    private javax.swing.Box.Filler filler18;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    private javax.swing.Box.Filler filler6;
    private javax.swing.Box.Filler filler7;
    private javax.swing.Box.Filler filler8;
    private javax.swing.Box.Filler filler9;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel jlbGia;
    private javax.swing.JLabel jlbHangVe;
    private javax.swing.JLabel jlbIdNumber;
    private javax.swing.JLabel jlbNgay;
    private javax.swing.JLabel jlbSBDen;
    private javax.swing.JLabel jlbSBDi;
    private javax.swing.JLabel jlbSoDiemDung;
    private javax.swing.JLabel jlbTen;
    private javax.swing.JLabel jlbTimeEnd;
    private javax.swing.JLabel jlbTimeFly;
    private javax.swing.JLabel jlbTimeStart;
    private javax.swing.JLabel jlbsdt;
    private javax.swing.JPanel jpnContainPlaceBreaks;
    private javax.swing.JPanel jpnPlaceBreaks;
    // End of variables declaration//GEN-END:variables
}