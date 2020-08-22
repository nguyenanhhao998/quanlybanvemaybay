/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.user.datve;

import java.awt.CardLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import pojos.Chuyenbay;
import ui.user.MainForUser;

/**
 *
 * @author DELL
 */
public class PhieuChoPanel extends javax.swing.JPanel {

    /**
     * Creates new form PhieuChoPanel
     */
    CardLayout cardLayout;
    public PhieuChoPanel(Chuyenbay cb) {
        initComponents();
        
        jlbSBDi.setText(cb.getSanbayByMaSbdi().getThanhPho() + " (" + cb.getSanbayByMaSbdi().getMaSb() +")");
        jlbSBDen.setText(cb.getSanbayByMaSbden().getThanhPho() + " (" + cb.getSanbayByMaSbden().getMaSb() +")");
        
        DateFormat df = new SimpleDateFormat("HH:mm");
        String timeStart = df.format(cb.getNgayKhoiHanh());
        jlbTimeStart.setText(timeStart);
        
        DateFormat df1 = new SimpleDateFormat("dd/MM/yyyy");
        jlbNgayKH.setText(df1.format(cb.getNgayKhoiHanh()));
        jlbNgayDat.setText(df1.format(new Date()));
        
        cardLayout = (CardLayout) jpnCards.getLayout();
        
        cardLayout = (CardLayout) jpnCards.getLayout();
        
        cardLayout.show(jpnCards, "CardChonLoaiKH");
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
        jLabel1 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jpnThongTinKHs = new javax.swing.JPanel();
        jpnCards = new javax.swing.JPanel();
        jpnChonLoaiKhach = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jbtnKHVN = new javax.swing.JButton();
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jbtnKHNuocNgoai = new javax.swing.JButton();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jpnKhachNuocNgoai = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        filler8 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0));
        jLabel21 = new javax.swing.JLabel();
        filler27 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0));
        jTextField10 = new javax.swing.JTextField();
        filler48 = new javax.swing.Box.Filler(new java.awt.Dimension(30, 0), new java.awt.Dimension(30, 0), new java.awt.Dimension(30, 0));
        jLabel22 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        filler28 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        filler10 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10));
        jPanel10 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        filler12 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0));
        cbbGioiTinh = new javax.swing.JComboBox<>();
        filler13 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        filler15 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10));
        jPanel18 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        filler37 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0));
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        filler49 = new javax.swing.Box.Filler(new java.awt.Dimension(30, 0), new java.awt.Dimension(30, 0), new java.awt.Dimension(30, 0));
        jLabel24 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        filler38 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        filler21 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10));
        jPanel13 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        filler19 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0));
        jTextField3 = new javax.swing.JTextField();
        filler20 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jpnKhachVietNam = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        filler24 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0));
        jTextField5 = new javax.swing.JTextField();
        filler45 = new javax.swing.Box.Filler(new java.awt.Dimension(30, 0), new java.awt.Dimension(30, 0), new java.awt.Dimension(30, 0));
        jLabel12 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        filler25 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        filler26 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10));
        jPanel16 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        filler30 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0));
        cbbGioiTinh1 = new javax.swing.JComboBox<>();
        filler32 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        filler33 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10));
        jPanel17 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        filler34 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0));
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        filler46 = new javax.swing.Box.Filler(new java.awt.Dimension(30, 0), new java.awt.Dimension(30, 0), new java.awt.Dimension(30, 0));
        jLabel18 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        filler35 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        filler36 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10));
        jPanel19 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        filler40 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0));
        jTextField8 = new javax.swing.JTextField();
        filler47 = new javax.swing.Box.Filler(new java.awt.Dimension(30, 0), new java.awt.Dimension(30, 0), new java.awt.Dimension(30, 0));
        jLabel20 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        filler41 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        filler42 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10));
        jPanel6 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jlbSBDi = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jlbSBDen = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jlbNgayKH = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jlbTimeStart = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jlbNgayDat = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        filler7 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jButton1 = new javax.swing.JButton();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jButton2 = new javax.swing.JButton();
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));

        setLayout(new java.awt.BorderLayout());

        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.LINE_AXIS));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setText("Nhập thông tin phiếu chờ vé");
        jPanel2.add(jLabel1);
        jPanel2.add(filler1);

        add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jpnThongTinKHs.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin liên hệ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jpnThongTinKHs.setLayout(new java.awt.BorderLayout());

        jpnCards.setLayout(new java.awt.CardLayout());

        jpnChonLoaiKhach.setLayout(new java.awt.BorderLayout());

        jPanel7.setLayout(new javax.swing.BoxLayout(jPanel7, javax.swing.BoxLayout.LINE_AXIS));
        jPanel7.add(filler4);

        jbtnKHVN.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jbtnKHVN.setText("Khách Việt Nam");
        jbtnKHVN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnKHVNActionPerformed(evt);
            }
        });
        jPanel7.add(jbtnKHVN);
        jPanel7.add(filler5);

        jbtnKHNuocNgoai.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jbtnKHNuocNgoai.setText("Khách nước ngoài");
        jbtnKHNuocNgoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnKHNuocNgoaiActionPerformed(evt);
            }
        });
        jPanel7.add(jbtnKHNuocNgoai);
        jPanel7.add(filler3);

        jpnChonLoaiKhach.add(jPanel7, java.awt.BorderLayout.CENTER);

        jpnCards.add(jpnChonLoaiKhach, "cardChonLoaiKH");

        jpnKhachNuocNgoai.setLayout(new javax.swing.BoxLayout(jpnKhachNuocNgoai, javax.swing.BoxLayout.Y_AXIS));

        jPanel15.setLayout(new javax.swing.BoxLayout(jPanel15, javax.swing.BoxLayout.LINE_AXIS));
        jPanel15.add(filler8);

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel21.setText("Họ và tên");
        jLabel21.setMaximumSize(new java.awt.Dimension(100, 30));
        jLabel21.setMinimumSize(new java.awt.Dimension(100, 30));
        jLabel21.setPreferredSize(new java.awt.Dimension(100, 30));
        jPanel15.add(jLabel21);
        jPanel15.add(filler27);

        jTextField10.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField10.setMaximumSize(new java.awt.Dimension(300, 40));
        jTextField10.setMinimumSize(new java.awt.Dimension(300, 40));
        jTextField10.setPreferredSize(new java.awt.Dimension(300, 40));
        jPanel15.add(jTextField10);
        jPanel15.add(filler48);

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel22.setText("SĐT");
        jLabel22.setMaximumSize(new java.awt.Dimension(100, 30));
        jLabel22.setMinimumSize(new java.awt.Dimension(100, 30));
        jLabel22.setPreferredSize(new java.awt.Dimension(100, 30));
        jPanel15.add(jLabel22);

        jTextField11.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField11.setMaximumSize(new java.awt.Dimension(300, 40));
        jTextField11.setMinimumSize(new java.awt.Dimension(300, 40));
        jTextField11.setPreferredSize(new java.awt.Dimension(300, 40));
        jPanel15.add(jTextField11);
        jPanel15.add(filler28);

        jpnKhachNuocNgoai.add(jPanel15);
        jpnKhachNuocNgoai.add(filler10);

        jPanel10.setLayout(new javax.swing.BoxLayout(jPanel10, javax.swing.BoxLayout.LINE_AXIS));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("Giới tính");
        jLabel4.setMaximumSize(new java.awt.Dimension(100, 30));
        jLabel4.setMinimumSize(new java.awt.Dimension(100, 30));
        jLabel4.setPreferredSize(new java.awt.Dimension(100, 30));
        jPanel10.add(jLabel4);
        jPanel10.add(filler12);

        cbbGioiTinh.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        cbbGioiTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));
        cbbGioiTinh.setMaximumSize(new java.awt.Dimension(100, 40));
        cbbGioiTinh.setMinimumSize(new java.awt.Dimension(100, 40));
        cbbGioiTinh.setPreferredSize(new java.awt.Dimension(100, 40));
        jPanel10.add(cbbGioiTinh);
        jPanel10.add(filler13);

        jpnKhachNuocNgoai.add(jPanel10);
        jpnKhachNuocNgoai.add(filler15);

        jPanel18.setLayout(new javax.swing.BoxLayout(jPanel18, javax.swing.BoxLayout.LINE_AXIS));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel23.setText("Ngày sinh");
        jLabel23.setMaximumSize(new java.awt.Dimension(100, 30));
        jLabel23.setMinimumSize(new java.awt.Dimension(100, 30));
        jLabel23.setPreferredSize(new java.awt.Dimension(100, 30));
        jPanel18.add(jLabel23);
        jPanel18.add(filler37);

        jDateChooser3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jDateChooser3.setMaximumSize(new java.awt.Dimension(300, 40));
        jDateChooser3.setMinimumSize(new java.awt.Dimension(300, 40));
        jDateChooser3.setPreferredSize(new java.awt.Dimension(300, 40));
        jPanel18.add(jDateChooser3);
        jPanel18.add(filler49);

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel24.setText("Quốc tịch");
        jLabel24.setMaximumSize(new java.awt.Dimension(100, 30));
        jLabel24.setMinimumSize(new java.awt.Dimension(100, 30));
        jLabel24.setPreferredSize(new java.awt.Dimension(100, 30));
        jPanel18.add(jLabel24);

        jTextField12.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField12.setMaximumSize(new java.awt.Dimension(300, 40));
        jTextField12.setMinimumSize(new java.awt.Dimension(300, 40));
        jTextField12.setPreferredSize(new java.awt.Dimension(300, 40));
        jPanel18.add(jTextField12);
        jPanel18.add(filler38);

        jpnKhachNuocNgoai.add(jPanel18);
        jpnKhachNuocNgoai.add(filler21);

        jPanel13.setLayout(new javax.swing.BoxLayout(jPanel13, javax.swing.BoxLayout.LINE_AXIS));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel10.setText("Số hộ chiếu");
        jLabel10.setMaximumSize(new java.awt.Dimension(100, 30));
        jLabel10.setMinimumSize(new java.awt.Dimension(100, 30));
        jLabel10.setPreferredSize(new java.awt.Dimension(100, 30));
        jPanel13.add(jLabel10);
        jPanel13.add(filler19);

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField3.setMaximumSize(new java.awt.Dimension(300, 40));
        jTextField3.setMinimumSize(new java.awt.Dimension(300, 40));
        jTextField3.setPreferredSize(new java.awt.Dimension(300, 40));
        jPanel13.add(jTextField3);
        jPanel13.add(filler20);

        jpnKhachNuocNgoai.add(jPanel13);

        jpnCards.add(jpnKhachNuocNgoai, "cardKHNuocNgoai");

        jpnKhachVietNam.setLayout(new javax.swing.BoxLayout(jpnKhachVietNam, javax.swing.BoxLayout.Y_AXIS));

        jPanel14.setLayout(new javax.swing.BoxLayout(jPanel14, javax.swing.BoxLayout.LINE_AXIS));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel11.setText("Họ và tên");
        jLabel11.setMaximumSize(new java.awt.Dimension(100, 30));
        jLabel11.setMinimumSize(new java.awt.Dimension(100, 30));
        jLabel11.setPreferredSize(new java.awt.Dimension(100, 30));
        jPanel14.add(jLabel11);
        jPanel14.add(filler24);

        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField5.setMaximumSize(new java.awt.Dimension(300, 40));
        jTextField5.setMinimumSize(new java.awt.Dimension(300, 40));
        jTextField5.setPreferredSize(new java.awt.Dimension(300, 40));
        jPanel14.add(jTextField5);
        jPanel14.add(filler45);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel12.setText("SĐT");
        jLabel12.setMaximumSize(new java.awt.Dimension(100, 30));
        jLabel12.setMinimumSize(new java.awt.Dimension(100, 30));
        jLabel12.setPreferredSize(new java.awt.Dimension(100, 30));
        jPanel14.add(jLabel12);

        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField6.setMaximumSize(new java.awt.Dimension(300, 40));
        jTextField6.setMinimumSize(new java.awt.Dimension(300, 40));
        jTextField6.setPreferredSize(new java.awt.Dimension(300, 40));
        jPanel14.add(jTextField6);
        jPanel14.add(filler25);

        jpnKhachVietNam.add(jPanel14);
        jpnKhachVietNam.add(filler26);

        jPanel16.setLayout(new javax.swing.BoxLayout(jPanel16, javax.swing.BoxLayout.LINE_AXIS));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel13.setText("Giới tính");
        jLabel13.setMaximumSize(new java.awt.Dimension(100, 30));
        jLabel13.setMinimumSize(new java.awt.Dimension(100, 30));
        jLabel13.setPreferredSize(new java.awt.Dimension(100, 30));
        jPanel16.add(jLabel13);
        jPanel16.add(filler30);

        cbbGioiTinh1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        cbbGioiTinh1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));
        cbbGioiTinh1.setMaximumSize(new java.awt.Dimension(100, 40));
        cbbGioiTinh1.setMinimumSize(new java.awt.Dimension(100, 40));
        cbbGioiTinh1.setPreferredSize(new java.awt.Dimension(100, 40));
        jPanel16.add(cbbGioiTinh1);
        jPanel16.add(filler32);

        jpnKhachVietNam.add(jPanel16);
        jpnKhachVietNam.add(filler33);

        jPanel17.setLayout(new javax.swing.BoxLayout(jPanel17, javax.swing.BoxLayout.LINE_AXIS));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel17.setText("Ngày sinh");
        jLabel17.setMaximumSize(new java.awt.Dimension(100, 30));
        jLabel17.setMinimumSize(new java.awt.Dimension(100, 30));
        jLabel17.setPreferredSize(new java.awt.Dimension(100, 30));
        jPanel17.add(jLabel17);
        jPanel17.add(filler34);

        jDateChooser2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jDateChooser2.setMaximumSize(new java.awt.Dimension(300, 40));
        jDateChooser2.setMinimumSize(new java.awt.Dimension(300, 40));
        jDateChooser2.setPreferredSize(new java.awt.Dimension(300, 40));
        jPanel17.add(jDateChooser2);
        jPanel17.add(filler46);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel18.setText("CMND");
        jLabel18.setMaximumSize(new java.awt.Dimension(100, 30));
        jLabel18.setMinimumSize(new java.awt.Dimension(100, 30));
        jLabel18.setPreferredSize(new java.awt.Dimension(100, 30));
        jPanel17.add(jLabel18);

        jTextField7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField7.setMaximumSize(new java.awt.Dimension(300, 40));
        jTextField7.setMinimumSize(new java.awt.Dimension(300, 40));
        jTextField7.setPreferredSize(new java.awt.Dimension(300, 40));
        jPanel17.add(jTextField7);
        jPanel17.add(filler35);

        jpnKhachVietNam.add(jPanel17);
        jpnKhachVietNam.add(filler36);

        jPanel19.setLayout(new javax.swing.BoxLayout(jPanel19, javax.swing.BoxLayout.LINE_AXIS));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel19.setText("Nghề");
        jLabel19.setMaximumSize(new java.awt.Dimension(100, 30));
        jLabel19.setMinimumSize(new java.awt.Dimension(100, 30));
        jLabel19.setPreferredSize(new java.awt.Dimension(100, 30));
        jPanel19.add(jLabel19);
        jPanel19.add(filler40);

        jTextField8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField8.setMaximumSize(new java.awt.Dimension(300, 40));
        jTextField8.setMinimumSize(new java.awt.Dimension(300, 40));
        jTextField8.setPreferredSize(new java.awt.Dimension(300, 40));
        jPanel19.add(jTextField8);
        jPanel19.add(filler47);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel20.setText("Địa chỉ");
        jLabel20.setMaximumSize(new java.awt.Dimension(100, 30));
        jLabel20.setMinimumSize(new java.awt.Dimension(100, 30));
        jLabel20.setPreferredSize(new java.awt.Dimension(100, 30));
        jPanel19.add(jLabel20);

        jTextField9.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField9.setMaximumSize(new java.awt.Dimension(300, 40));
        jTextField9.setMinimumSize(new java.awt.Dimension(300, 40));
        jTextField9.setPreferredSize(new java.awt.Dimension(300, 40));
        jPanel19.add(jTextField9);
        jPanel19.add(filler41);

        jpnKhachVietNam.add(jPanel19);
        jpnKhachVietNam.add(filler42);

        jpnCards.add(jpnKhachVietNam, "cardKHVietNam");

        jpnThongTinKHs.add(jpnCards, java.awt.BorderLayout.CENTER);

        add(jpnThongTinKHs, java.awt.BorderLayout.CENTER);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chi tiết phiếu chờ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jPanel6.setMaximumSize(new java.awt.Dimension(450, 400));
        jPanel6.setMinimumSize(new java.awt.Dimension(450, 400));
        jPanel6.setPreferredSize(new java.awt.Dimension(450, 400));
        jPanel6.setLayout(new javax.swing.BoxLayout(jPanel6, javax.swing.BoxLayout.Y_AXIS));

        jPanel9.setMaximumSize(new java.awt.Dimension(32767, 40));
        jPanel9.setMinimumSize(new java.awt.Dimension(100, 40));
        jPanel9.setLayout(new javax.swing.BoxLayout(jPanel9, javax.swing.BoxLayout.LINE_AXIS));

        jPanel11.setMaximumSize(new java.awt.Dimension(200, 40));
        jPanel11.setMinimumSize(new java.awt.Dimension(200, 40));
        jPanel11.setPreferredSize(new java.awt.Dimension(200, 40));
        jPanel11.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jlbSBDi.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jlbSBDi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/plane_takeoff.png"))); // NOI18N
        jlbSBDi.setText("Hà nội (HAN)");
        jlbSBDi.setMaximumSize(new java.awt.Dimension(200, 40));
        jlbSBDi.setMinimumSize(new java.awt.Dimension(200, 40));
        jlbSBDi.setPreferredSize(new java.awt.Dimension(200, 40));
        jPanel11.add(jlbSBDi);

        jPanel9.add(jPanel11);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/flight.png"))); // NOI18N
        jLabel7.setMaximumSize(new java.awt.Dimension(60, 40));
        jLabel7.setMinimumSize(new java.awt.Dimension(60, 40));
        jLabel7.setPreferredSize(new java.awt.Dimension(60, 40));
        jPanel9.add(jLabel7);

        jPanel20.setMaximumSize(new java.awt.Dimension(200, 40));
        jPanel20.setMinimumSize(new java.awt.Dimension(200, 40));
        jPanel20.setPreferredSize(new java.awt.Dimension(200, 40));
        jPanel20.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jlbSBDen.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jlbSBDen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/plane_landing.png"))); // NOI18N
        jlbSBDen.setText("TPHCM (SGN)");
        jlbSBDen.setMaximumSize(new java.awt.Dimension(200, 40));
        jlbSBDen.setMinimumSize(new java.awt.Dimension(200, 40));
        jlbSBDen.setPreferredSize(new java.awt.Dimension(200, 40));
        jPanel20.add(jlbSBDen);

        jPanel9.add(jPanel20);

        jPanel6.add(jPanel9);

        jPanel12.setMaximumSize(new java.awt.Dimension(32767, 40));
        jPanel12.setMinimumSize(new java.awt.Dimension(100, 40));
        jPanel12.setLayout(new javax.swing.BoxLayout(jPanel12, javax.swing.BoxLayout.LINE_AXIS));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel27.setText("Ngày khởi hành: ");
        jPanel12.add(jLabel27);

        jlbNgayKH.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlbNgayKH.setText("20/08/2020");
        jPanel12.add(jlbNgayKH);

        jPanel6.add(jPanel12);

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

        jPanel8.setMaximumSize(new java.awt.Dimension(32767, 40));
        jPanel8.setMinimumSize(new java.awt.Dimension(100, 40));
        jPanel8.setLayout(new javax.swing.BoxLayout(jPanel8, javax.swing.BoxLayout.LINE_AXIS));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Ngày đặt: ");
        jPanel8.add(jLabel6);

        jlbNgayDat.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlbNgayDat.setText("18/08/2020");
        jPanel8.add(jlbNgayDat);

        jPanel6.add(jPanel8);

        jPanel5.setMaximumSize(new java.awt.Dimension(32767, 40));
        jPanel5.setMinimumSize(new java.awt.Dimension(100, 40));
        jPanel5.setLayout(new javax.swing.BoxLayout(jPanel5, javax.swing.BoxLayout.LINE_AXIS));
        jPanel5.add(filler7);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton1.setText("Back");
        jButton1.setMaximumSize(new java.awt.Dimension(150, 40));
        jButton1.setMinimumSize(new java.awt.Dimension(150, 40));
        jButton1.setPreferredSize(new java.awt.Dimension(150, 40));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton1);
        jPanel5.add(filler2);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Chờ vé");
        jButton2.setMaximumSize(new java.awt.Dimension(150, 40));
        jButton2.setMinimumSize(new java.awt.Dimension(150, 40));
        jButton2.setPreferredSize(new java.awt.Dimension(150, 40));
        jPanel5.add(jButton2);
        jPanel5.add(filler6);

        jPanel6.add(jPanel5);

        add(jPanel6, java.awt.BorderLayout.EAST);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnKHVNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnKHVNActionPerformed
        cardLayout.show(jpnCards, "cardKHVietNam");
    }//GEN-LAST:event_jbtnKHVNActionPerformed

    private void jbtnKHNuocNgoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnKHNuocNgoaiActionPerformed
        cardLayout.show(jpnCards, "cardKHNuocNgoai");
    }//GEN-LAST:event_jbtnKHNuocNgoaiActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MainForUser.getInstance().getTraCuuPane().changeLayout(this, "backChiTiet");
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbbGioiTinh;
    private javax.swing.JComboBox<String> cbbGioiTinh1;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler10;
    private javax.swing.Box.Filler filler12;
    private javax.swing.Box.Filler filler13;
    private javax.swing.Box.Filler filler15;
    private javax.swing.Box.Filler filler19;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler20;
    private javax.swing.Box.Filler filler21;
    private javax.swing.Box.Filler filler24;
    private javax.swing.Box.Filler filler25;
    private javax.swing.Box.Filler filler26;
    private javax.swing.Box.Filler filler27;
    private javax.swing.Box.Filler filler28;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler30;
    private javax.swing.Box.Filler filler32;
    private javax.swing.Box.Filler filler33;
    private javax.swing.Box.Filler filler34;
    private javax.swing.Box.Filler filler35;
    private javax.swing.Box.Filler filler36;
    private javax.swing.Box.Filler filler37;
    private javax.swing.Box.Filler filler38;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler40;
    private javax.swing.Box.Filler filler41;
    private javax.swing.Box.Filler filler42;
    private javax.swing.Box.Filler filler45;
    private javax.swing.Box.Filler filler46;
    private javax.swing.Box.Filler filler47;
    private javax.swing.Box.Filler filler48;
    private javax.swing.Box.Filler filler49;
    private javax.swing.Box.Filler filler5;
    private javax.swing.Box.Filler filler6;
    private javax.swing.Box.Filler filler7;
    private javax.swing.Box.Filler filler8;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JButton jbtnKHNuocNgoai;
    private javax.swing.JButton jbtnKHVN;
    private javax.swing.JLabel jlbNgayDat;
    private javax.swing.JLabel jlbNgayKH;
    private javax.swing.JLabel jlbSBDen;
    private javax.swing.JLabel jlbSBDi;
    private javax.swing.JLabel jlbTimeStart;
    private javax.swing.JPanel jpnCards;
    private javax.swing.JPanel jpnChonLoaiKhach;
    private javax.swing.JPanel jpnKhachNuocNgoai;
    private javax.swing.JPanel jpnKhachVietNam;
    private javax.swing.JPanel jpnThongTinKHs;
    // End of variables declaration//GEN-END:variables
}
