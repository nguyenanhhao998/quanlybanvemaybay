/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.user.phieu;

import bus.ChuyenbayBUS;
import bus.KhachhangBUS;
import bus.PhieudatchoBUS;
import daos.SanbayDAO;
import java.awt.Color;
import java.awt.Font;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import pojos.Chuyenbay;
import pojos.Khachhang;
import pojos.Phieudatcho;
import pojos.Sanbay;
import ui.user.muave.InVePanel;
import ui.user.muave.MuaVePanel;
import ui.user.tracuucb.JPNTraCuu;

/**
 *
 * @author DELL
 */
public class XuLyDatVePanel extends javax.swing.JPanel {

    /**
     * Creates new form XuLyDatVePanel
     */
    List<Sanbay> listSanBay;
    MuaVePanel muave;
    InVePanel inve;
    public XuLyDatVePanel() {
        initComponents();
        listSanBay = SanbayDAO.getAll();
        for(int i = 0; i < listSanBay.size(); i++){
            Sanbay sb = listSanBay.get(i);
            cbbSanBayDi.addItem(sb.getThanhPho() +" (" + sb.getMaSb() + ")");
            cbbSanBayDen.addItem(sb.getThanhPho() +" (" + sb.getMaSb() + ")");
        }
        ((JTextField)ngaykhoihanh.getDateEditor().getUiComponent()).setText("");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel12 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
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
        jPanel10 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        filler8 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0));
        ngaykhoihanh = new com.toedter.calendar.JDateChooser();
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0));
        jPanel13 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        filler11 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0));
        jtfTen = new javax.swing.JTextField();
        filler12 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0));
        jPanel14 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        filler16 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0));
        jtfcmnd = new javax.swing.JTextField();
        filler18 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0));
        filler9 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        btnFind = new javax.swing.JButton();
        filler14 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 20), new java.awt.Dimension(0, 20), new java.awt.Dimension(0, 20));
        jpnKetQua = new javax.swing.JPanel();
        filler21 = new javax.swing.Box.Filler(new java.awt.Dimension(100, 0), new java.awt.Dimension(100, 0), new java.awt.Dimension(100, 0));
        filler22 = new javax.swing.Box.Filler(new java.awt.Dimension(100, 0), new java.awt.Dimension(100, 0), new java.awt.Dimension(100, 0));

        setLayout(new java.awt.BorderLayout());

        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.Y_AXIS));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Tra cứu phiếu đặt vé chuyến bay");
        jPanel1.add(jLabel1);

        jPanel2.add(jPanel1);

        jPanel4.setMaximumSize(new java.awt.Dimension(32767, 100));
        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.LINE_AXIS));

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Điểm khởi hành", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 16))); // NOI18N
        jPanel6.setLayout(new javax.swing.BoxLayout(jPanel6, javax.swing.BoxLayout.LINE_AXIS));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/plane_takeoff.png"))); // NOI18N
        jPanel6.add(jLabel2);
        jPanel6.add(filler1);

        cbbSanBayDi.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        cbbSanBayDi.setMaximumSize(new java.awt.Dimension(200, 40));
        cbbSanBayDi.setMinimumSize(new java.awt.Dimension(200, 40));
        cbbSanBayDi.setPreferredSize(new java.awt.Dimension(200, 40));
        jPanel6.add(cbbSanBayDi);

        jPanel4.add(jPanel6);
        jPanel4.add(filler4);

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Điểm đến", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 16))); // NOI18N
        jPanel7.setLayout(new javax.swing.BoxLayout(jPanel7, javax.swing.BoxLayout.LINE_AXIS));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/plane_landing.png"))); // NOI18N
        jPanel7.add(jLabel3);
        jPanel7.add(filler2);

        cbbSanBayDen.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        cbbSanBayDen.setMaximumSize(new java.awt.Dimension(200, 40));
        cbbSanBayDen.setMinimumSize(new java.awt.Dimension(200, 40));
        cbbSanBayDen.setPreferredSize(new java.awt.Dimension(200, 40));
        jPanel7.add(cbbSanBayDen);

        jPanel4.add(jPanel7);
        jPanel4.add(filler5);

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thời gian khởi hành", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 16))); // NOI18N
        jPanel10.setMaximumSize(new java.awt.Dimension(250, 70));
        jPanel10.setMinimumSize(new java.awt.Dimension(250, 70));
        jPanel10.setPreferredSize(new java.awt.Dimension(250, 70));
        jPanel10.setLayout(new javax.swing.BoxLayout(jPanel10, javax.swing.BoxLayout.LINE_AXIS));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/calendar.png"))); // NOI18N
        jPanel10.add(jLabel7);
        jPanel10.add(filler8);

        ngaykhoihanh.setDateFormatString("HH:mm dd/MM/yyyy ");
        ngaykhoihanh.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        ngaykhoihanh.setMaximumSize(new java.awt.Dimension(200, 40));
        ngaykhoihanh.setMinimumSize(new java.awt.Dimension(200, 40));
        ngaykhoihanh.setPreferredSize(new java.awt.Dimension(200, 40));
        jPanel10.add(ngaykhoihanh);

        jPanel4.add(jPanel10);
        jPanel4.add(filler6);

        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tên khách hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 16))); // NOI18N
        jPanel13.setMaximumSize(new java.awt.Dimension(250, 70));
        jPanel13.setMinimumSize(new java.awt.Dimension(250, 70));
        jPanel13.setPreferredSize(new java.awt.Dimension(250, 70));
        jPanel13.setLayout(new javax.swing.BoxLayout(jPanel13, javax.swing.BoxLayout.LINE_AXIS));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/guest.png"))); // NOI18N
        jPanel13.add(jLabel11);
        jPanel13.add(filler11);

        jtfTen.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jtfTen.setMaximumSize(new java.awt.Dimension(200, 40));
        jtfTen.setMinimumSize(new java.awt.Dimension(200, 40));
        jtfTen.setPreferredSize(new java.awt.Dimension(200, 40));
        jPanel13.add(jtfTen);

        jPanel4.add(jPanel13);
        jPanel4.add(filler12);

        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CMND / Hộ chiếu", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 16))); // NOI18N
        jPanel14.setMaximumSize(new java.awt.Dimension(250, 70));
        jPanel14.setMinimumSize(new java.awt.Dimension(250, 70));
        jPanel14.setPreferredSize(new java.awt.Dimension(250, 70));
        jPanel14.setLayout(new javax.swing.BoxLayout(jPanel14, javax.swing.BoxLayout.LINE_AXIS));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/idcard.png"))); // NOI18N
        jPanel14.add(jLabel12);
        jPanel14.add(filler16);

        jtfcmnd.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jtfcmnd.setMaximumSize(new java.awt.Dimension(200, 40));
        jtfcmnd.setMinimumSize(new java.awt.Dimension(200, 40));
        jtfcmnd.setPreferredSize(new java.awt.Dimension(200, 40));
        jPanel14.add(jtfcmnd);

        jPanel4.add(jPanel14);
        jPanel4.add(filler18);
        jPanel4.add(filler9);

        btnFind.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnFind.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search.png"))); // NOI18N
        btnFind.setText("Tìm phiếu đặt vé");
        btnFind.setMaximumSize(new java.awt.Dimension(240, 40));
        btnFind.setMinimumSize(new java.awt.Dimension(240, 40));
        btnFind.setPreferredSize(new java.awt.Dimension(240, 40));
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });
        jPanel4.add(btnFind);
        jPanel4.add(filler14);

        jPanel2.add(jPanel4);
        jPanel2.add(filler3);

        jPanel12.add(jPanel2);

        add(jPanel12, java.awt.BorderLayout.PAGE_START);

        jpnKetQua.setLayout(new java.awt.BorderLayout());
        jpnKetQua.add(filler21, java.awt.BorderLayout.WEST);
        jpnKetQua.add(filler22, java.awt.BorderLayout.EAST);

        add(jpnKetQua, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        //Lấy dữ liệu từ giao diện     
        String tenkh = jtfTen.getText();
        String cmndOrHoChieu = jtfcmnd.getText();
        String Sanbaydi = String.valueOf(cbbSanBayDi.getSelectedItem());
        String Sanbayden = String.valueOf(cbbSanBayDen.getSelectedItem());
        Date ngayKH = null;
        try{
            ngayKH = ngaykhoihanh.getCalendar().getTime();
        }catch(NullPointerException ex){
            JLabel label = new JLabel("Bạn phải chọn thời gian khởi hành.");
            label.setFont(new Font("Arial", Font.BOLD, 18));
            label.setForeground(Color.red);
            JOptionPane.showMessageDialog(null,label,"ERROR",JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        //kiểm tra        
        //điền đủ thông tin
        if(tenkh.isEmpty() || cmndOrHoChieu.isEmpty()){
            JLabel label = new JLabel("Bạn phải điền đầy đủ thông tin.");
            label.setFont(new Font("Arial", Font.BOLD, 18));
            label.setForeground(Color.red);
            JOptionPane.showMessageDialog(null,label , "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        int id = KhachhangBUS.getIdKHbyCMNDOrHoChieu(cmndOrHoChieu);
        
        Khachhang kh = KhachhangBUS.getKHbyID(id);
        
        if(id == -1 || !kh.getHoTen().equalsIgnoreCase(tenkh)){
            JLabel label = new JLabel("Không tìm thấy phiếu đặt vé tương ứng.");
            label.setFont(new Font("Arial", Font.BOLD, 18));
            label.setForeground(Color.red);
            JOptionPane.showMessageDialog(null,label , "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        List <Phieudatcho> listCanXuLy = PhieudatchoBUS.getListPhieudatcho(id,ngayKH,Sanbaydi,Sanbayden);

        if(listCanXuLy.isEmpty()){
            JLabel label = new JLabel("Không tìm thấy phiếu đặt vé tương ứng.");
            label.setFont(new Font("Arial", Font.BOLD, 18));
            label.setForeground(Color.red);
            JOptionPane.showMessageDialog(null,label , "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String macb = listCanXuLy.get(0).getVechuyenbay().getChuyenbay().getMaCb();
        Chuyenbay cb = ChuyenbayBUS.getChuyenBayByID(macb);
        muave = new MuaVePanel(cb,listCanXuLy.size(),listCanXuLy.get(0).getVechuyenbay().getHangve().getMaHangVe(),listCanXuLy);
        jpnKetQua.add(muave);
        jpnKetQua.invalidate();
        jpnKetQua.revalidate();
        jpnKetQua.repaint();
    }//GEN-LAST:event_btnFindActionPerformed

    public void inVe(InVePanel panel){
        jpnKetQua.remove(muave);
        inve = panel;
        jpnKetQua.add(inve);
        jpnKetQua.invalidate();
        jpnKetQua.revalidate();
        jpnKetQua.repaint();
    }
    
    public void hoanThanhInVe(){
        jpnKetQua.remove(inve);
        ((JTextField)ngaykhoihanh.getDateEditor().getUiComponent()).setText("");
        jtfTen.setText("");
        jtfcmnd.setText("");
        jpnKetQua.invalidate();
        jpnKetQua.revalidate();
        jpnKetQua.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFind;
    private javax.swing.JComboBox<String> cbbSanBayDen;
    private javax.swing.JComboBox<String> cbbSanBayDi;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler11;
    private javax.swing.Box.Filler filler12;
    private javax.swing.Box.Filler filler14;
    private javax.swing.Box.Filler filler16;
    private javax.swing.Box.Filler filler18;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler21;
    private javax.swing.Box.Filler filler22;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    private javax.swing.Box.Filler filler6;
    private javax.swing.Box.Filler filler8;
    private javax.swing.Box.Filler filler9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jpnKetQua;
    private javax.swing.JTextField jtfTen;
    private javax.swing.JTextField jtfcmnd;
    private com.toedter.calendar.JDateChooser ngaykhoihanh;
    // End of variables declaration//GEN-END:variables
}
