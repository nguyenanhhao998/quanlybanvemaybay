/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.user.tracuucb.ketqua;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import pojos.Chuyenbay;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class MotChieuPanel extends javax.swing.JPanel {

    /**
     * Creates new form MotChieuPanel
     */
    List<FlightPanel> listcbpanel;
    List<FlightPanel> listcbpanelhientai;//dung de sap xep sau khi loc
    List<FlightPanel> listcbpanelhientaichuasapxep;
    String locDiemDung = "";
    int loctgBay = 0; //0 => tất cả, 1 => 00:00-06:00, 2 => 06:00-12:00, 3 => 12:00-18:00, 4 => 18:00-24:00
    int loctgDen = 0;
    String tieuchisapxep = "";
    public MotChieuPanel(List<Chuyenbay> listcb, int sl, String mahangve) {
        initComponents();
        listcbpanel = new ArrayList();
        listcbpanelhientai = new ArrayList();
        listcbpanelhientaichuasapxep = new ArrayList();
        for(int i = 0; i < listcb.size(); i++){
            Chuyenbay cb = listcb.get(i);
            listcbpanel.add(new FlightPanel(cb, sl, mahangve));
            jpnContainFlights.add(listcbpanel.get(i));
            listcbpanelhientai.add(listcbpanel.get(i));
            listcbpanelhientaichuasapxep.add(listcbpanelhientai.get(i));
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
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jLabel2 = new javax.swing.JLabel();
        filler12 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0));
        jPanel6 = new javax.swing.JPanel();
        cbbLocTheoDiemDung = new javax.swing.JComboBox<>();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0));
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0));
        cbbLocTheoTimeStart = new javax.swing.JComboBox<>();
        filler10 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0));
        jLabel4 = new javax.swing.JLabel();
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0));
        cbbLocTheoTimeEnd = new javax.swing.JComboBox<>();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jLabel1 = new javax.swing.JLabel();
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0));
        cbbColSort = new javax.swing.JComboBox<>();
        filler7 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jScrollPane1 = new javax.swing.JScrollPane();
        jpnContainFlights = new javax.swing.JPanel();

        setMaximumSize(new java.awt.Dimension(1500, 1069));
        setMinimumSize(new java.awt.Dimension(1000, 569));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.Y_AXIS));

        jPanel1.setMaximumSize(new java.awt.Dimension(1500, 69));
        jPanel1.setMinimumSize(new java.awt.Dimension(1000, 69));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 69));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));
        jPanel1.add(filler6);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Bộ lọc");
        jPanel1.add(jLabel2);
        jPanel1.add(filler12);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Điểm dừng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 16))); // NOI18N
        jPanel6.setLayout(new javax.swing.BoxLayout(jPanel6, javax.swing.BoxLayout.LINE_AXIS));

        cbbLocTheoDiemDung.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        cbbLocTheoDiemDung.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả", "Bay thẳng", "1 điểm dừng", "2+ điểm dừng" }));
        cbbLocTheoDiemDung.setMaximumSize(new java.awt.Dimension(160, 40));
        cbbLocTheoDiemDung.setMinimumSize(new java.awt.Dimension(160, 40));
        cbbLocTheoDiemDung.setPreferredSize(new java.awt.Dimension(160, 40));
        cbbLocTheoDiemDung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbLocTheoDiemDungActionPerformed(evt);
            }
        });
        jPanel6.add(cbbLocTheoDiemDung);

        jPanel1.add(jPanel6);
        jPanel1.add(filler2);

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thời gian bay", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 16))); // NOI18N
        jPanel7.setLayout(new javax.swing.BoxLayout(jPanel7, javax.swing.BoxLayout.LINE_AXIS));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/plane_takeoff.png"))); // NOI18N
        jPanel7.add(jLabel3);
        jPanel7.add(filler3);

        cbbLocTheoTimeStart.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        cbbLocTheoTimeStart.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả", "00.00 - 06.00", "06.00 - 12.00", "12.00 - 18.00", "18.00 - 24.00" }));
        cbbLocTheoTimeStart.setMaximumSize(new java.awt.Dimension(150, 40));
        cbbLocTheoTimeStart.setMinimumSize(new java.awt.Dimension(150, 40));
        cbbLocTheoTimeStart.setPreferredSize(new java.awt.Dimension(150, 40));
        cbbLocTheoTimeStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbLocTheoTimeStartActionPerformed(evt);
            }
        });
        jPanel7.add(cbbLocTheoTimeStart);
        jPanel7.add(filler10);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/plane_landing.png"))); // NOI18N
        jPanel7.add(jLabel4);
        jPanel7.add(filler5);

        cbbLocTheoTimeEnd.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        cbbLocTheoTimeEnd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả", "00.00 - 06.00", "06.00 - 12.00", "12.00 - 18.00", "18.00 - 24.00" }));
        cbbLocTheoTimeEnd.setMaximumSize(new java.awt.Dimension(150, 40));
        cbbLocTheoTimeEnd.setMinimumSize(new java.awt.Dimension(150, 40));
        cbbLocTheoTimeEnd.setPreferredSize(new java.awt.Dimension(150, 40));
        cbbLocTheoTimeEnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbLocTheoTimeEndActionPerformed(evt);
            }
        });
        jPanel7.add(cbbLocTheoTimeEnd);

        jPanel1.add(jPanel7);
        jPanel1.add(filler1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setText("Sắp xếp");
        jPanel1.add(jLabel1);
        jPanel1.add(filler4);

        cbbColSort.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        cbbColSort.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Giờ khởi hành sớm nhất", "Giá vé thấp nhất", "Thời gian bay ngắn nhất" }));
        cbbColSort.setMaximumSize(new java.awt.Dimension(250, 40));
        cbbColSort.setMinimumSize(new java.awt.Dimension(250, 40));
        cbbColSort.setPreferredSize(new java.awt.Dimension(250, 40));
        cbbColSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbColSortActionPerformed(evt);
            }
        });
        jPanel1.add(cbbColSort);
        jPanel1.add(filler7);

        add(jPanel1);

        jScrollPane1.setMaximumSize(new java.awt.Dimension(1200, 600));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(27, 500));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(100, 500));

        jpnContainFlights.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách các chuyến bay", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 16))); // NOI18N
        jpnContainFlights.setMaximumSize(new java.awt.Dimension(2200, 1500));
        jpnContainFlights.setLayout(new javax.swing.BoxLayout(jpnContainFlights, javax.swing.BoxLayout.Y_AXIS));

        jScrollPane1.getVerticalScrollBar().setUnitIncrement(20);

        jScrollPane1.setViewportView(jpnContainFlights);

        add(jScrollPane1);
    }// </editor-fold>//GEN-END:initComponents

    private void loc(){
        //xóa hết các panel cb hiện tại và thêm lại tất cả panel từ list ban đầu
        jpnContainFlights.removeAll();
        
        //xóa list cb hiển thị hiện tại
        int size =  listcbpanelhientai.size();
        for(int i = size - 1; i >= 0; i--){
            listcbpanelhientai.remove(i);
        }

        for(int i = 0; i < listcbpanel.size(); i++){
            FlightPanel fp = listcbpanel.get(i);
            listcbpanelhientai.add(fp); //refresh list cb hien tai
            jpnContainFlights.add(fp);
            jpnContainFlights.validate();
            jpnContainFlights.repaint();
        }
        
        //lọc theo số điểm dừng
        if(!locDiemDung.isEmpty()){
            locTheoDiemDung();
        }
              
        locTheoThoiGianbay();
        
        locTheoThoiGianden();
        
        //xóa list cb chưa sắp xếp hiển thị hiện tại
        int size1 =  listcbpanelhientaichuasapxep.size();
        for(int i = size1 - 1; i >= 0; i--){
            listcbpanelhientaichuasapxep.remove(i);
        }
        
        for(int i = 0; i<listcbpanelhientai.size(); i++){
            listcbpanelhientaichuasapxep.add(listcbpanelhientai.get(i));
        }
        
        sapxep();
    }
    
    private void locTheoDiemDung(){
        //kiểm tra điều kiện lọc để xóa các panel không phù hợp
            if(locDiemDung.equalsIgnoreCase("2+ điểm dừng")){
                for(int i = 0; i < listcbpanel.size(); i++){
                    FlightPanel fp = listcbpanel.get(i);
                    if(fp.getSoDiemDung().equalsIgnoreCase("Bay thẳng")){
                        listcbpanelhientai.remove(fp); //xóa panel đó trong list hiện tại
                        jpnContainFlights.remove(fp);
                        jpnContainFlights.validate();
                        jpnContainFlights.repaint();
                    } 
                    if(fp.getSoDiemDung().equalsIgnoreCase("1 điểm dừng")){
                        listcbpanelhientai.remove(fp); //xóa panel đó trong list hiện tại
                        jpnContainFlights.remove(fp);
                        jpnContainFlights.validate();
                        jpnContainFlights.repaint();
                    }
                }//Bay thẳng hoặc 1 điểm dừng
            } else if(locDiemDung.equalsIgnoreCase("Bay thẳng") || locDiemDung.equalsIgnoreCase("1 điểm dừng")){ 
                for(int i = 0; i < listcbpanel.size(); i++){
                    FlightPanel fp = listcbpanel.get(i);
                    if(!fp.getSoDiemDung().equalsIgnoreCase(locDiemDung)){
                        listcbpanelhientai.remove(fp); //xóa panel đó trong list hiện tại
                        jpnContainFlights.remove(fp);
                        jpnContainFlights.validate();
                        jpnContainFlights.repaint();
                    }
                }
            }
    }
    
    private void locTheoThoiGianbay() {
        for (int i = 0; i < listcbpanelhientai.size(); i++) {
            FlightPanel fp = listcbpanelhientai.get(i);

            DateFormat df = new SimpleDateFormat("hh:mm");

            Date date = null;
            try {
                date = df.parse(fp.getTimeStart());
            } catch (ParseException ex) {
                Logger.getLogger(MotChieuPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            Calendar calendar = GregorianCalendar.getInstance(); // creates a new calendar instance
            calendar.setTime(date);   // assigns calendar to given date 

            int h = calendar.get(Calendar.HOUR_OF_DAY);
            int m = calendar.get(Calendar.MINUTE);
            switch (loctgBay) {
                case 1:
                    if (h == 6 && m > 0 || h > 6) {
                        listcbpanelhientai.remove(fp); //xóa panel đó trong list hiện tại
                        i--;
                        jpnContainFlights.remove(fp);
                        jpnContainFlights.validate();
                        jpnContainFlights.repaint();
                    }
                    break;
                case 2:
                    if (h < 6 || h == 12 && m > 0 || h > 12) {
                        listcbpanelhientai.remove(fp); //xóa panel đó trong list hiện tại
                        i--;
                        jpnContainFlights.remove(fp);
                        jpnContainFlights.validate();
                        jpnContainFlights.repaint();
                    }
                    break;
                case 3:
                    if (h < 12 || h == 18 && m > 0 || h > 18) {
                        listcbpanelhientai.remove(fp); //xóa panel đó trong list hiện tại
                        i--;
                        jpnContainFlights.remove(fp);
                        jpnContainFlights.validate();
                        jpnContainFlights.repaint();
                    }
                    break;
                case 4:
                    if (h < 18) {
                        listcbpanelhientai.remove(fp); //xóa panel đó trong list hiện tại
                        i--;
                        jpnContainFlights.remove(fp);
                        jpnContainFlights.validate();
                        jpnContainFlights.repaint();
                    }
                    break;
            }
        }
    }
    
    private void locTheoThoiGianden() {
        for (int i = 0; i < listcbpanelhientai.size(); i++) {
            FlightPanel fp = listcbpanelhientai.get(i);

            DateFormat df = new SimpleDateFormat("hh:mm");

            Date date = null;
            try {
                date = df.parse(fp.getTimeEnd());
            } catch (ParseException ex) {
                Logger.getLogger(MotChieuPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            Calendar calendar = GregorianCalendar.getInstance(); // creates a new calendar instance
            calendar.setTime(date);   // assigns calendar to given date 

            int h = calendar.get(Calendar.HOUR_OF_DAY);
            int m = calendar.get(Calendar.MINUTE);
            switch (loctgDen) {
                case 1:
                    if (h == 6 && m > 0 || h > 6) {
                        listcbpanelhientai.remove(fp); //xóa panel đó trong list hiện tại
                        i--;
                        jpnContainFlights.remove(fp);
                        jpnContainFlights.validate();
                        jpnContainFlights.repaint();
                    }
                    break;
                case 2:
                    if (h < 6 || h == 12 && m > 0 || h > 12) {
                        listcbpanelhientai.remove(fp); //xóa panel đó trong list hiện tại
                        i--;
                        jpnContainFlights.remove(fp);
                        jpnContainFlights.validate();
                        jpnContainFlights.repaint();
                    }
                    break;
                case 3:
                    if (h < 12 || h == 18 && m > 0 || h > 18) {
                        listcbpanelhientai.remove(fp); //xóa panel đó trong list hiện tại
                        i--;
                        jpnContainFlights.remove(fp);
                        jpnContainFlights.validate();
                        jpnContainFlights.repaint();
                    }
                    break;
                case 4:
                    if (h < 18) {
                        listcbpanelhientai.remove(fp); //xóa panel đó trong list hiện tại
                        i--;
                        jpnContainFlights.remove(fp);
                        jpnContainFlights.validate();
                        jpnContainFlights.repaint();
                    }
                    break;
            }
        }
    }
    
    private void cbbLocTheoDiemDungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbLocTheoDiemDungActionPerformed
        locDiemDung = String.valueOf(cbbLocTheoDiemDung.getSelectedItem());
        loc();    
    }//GEN-LAST:event_cbbLocTheoDiemDungActionPerformed

    private void cbbLocTheoTimeStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbLocTheoTimeStartActionPerformed
        loctgBay = cbbLocTheoTimeStart.getSelectedIndex();
        loc();
    }//GEN-LAST:event_cbbLocTheoTimeStartActionPerformed

    private void cbbLocTheoTimeEndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbLocTheoTimeEndActionPerformed
        loctgDen = cbbLocTheoTimeEnd.getSelectedIndex();
        loc();
    }//GEN-LAST:event_cbbLocTheoTimeEndActionPerformed

    private void sapxep(){       
        if(tieuchisapxep.equalsIgnoreCase("Giá vé thấp nhất")){
            sapxepTheoGia();
        } else if(tieuchisapxep.equalsIgnoreCase("Thời gian bay ngắn nhất")){
            sapxepTheoThoiGianBay();
        } else{
            //xóa hết các panel cb hiện tại và thêm lại tất cả panel từ list ban đầu
            jpnContainFlights.removeAll();

            //xóa list cb hiển thị hiện tại
            int size =  listcbpanelhientai.size();
            for(int i = size - 1; i >= 0; i--){
                listcbpanelhientai.remove(i);
            }

            for(int i = 0; i < listcbpanelhientaichuasapxep.size(); i++){
                FlightPanel fp = listcbpanelhientaichuasapxep.get(i);
                listcbpanelhientai.add(fp); //refresh list cb hien tai
                jpnContainFlights.add(fp);
                jpnContainFlights.validate();
                jpnContainFlights.repaint();
            }
        }
    }
    
    private void sapxepTheoGia(){
        Comparator<FlightPanel> comparator = new Comparator<FlightPanel>() {
            public int compare(FlightPanel fp1, FlightPanel fp2) {
                return Double.valueOf(fp1.getGia()).compareTo(Double.valueOf(fp2.getGia()));
            }
        };

        Collections.sort(listcbpanelhientai, comparator);
        jpnContainFlights.removeAll();
        for (int i = 0; i < listcbpanelhientai.size(); i++) {
            FlightPanel fp = listcbpanelhientai.get(i);

            jpnContainFlights.add(fp);
            jpnContainFlights.validate();
            jpnContainFlights.repaint();           
        }
    }
    
    private void sapxepTheoThoiGianBay(){
        Comparator<FlightPanel> comparator = new Comparator<FlightPanel>() {
            public int compare(FlightPanel fp1, FlightPanel fp2) {
                return (new Double(fp1.getThoiGianBay())).compareTo(new Double(fp2.getThoiGianBay()));
            }
        };

        Collections.sort(listcbpanelhientai, comparator);
        jpnContainFlights.removeAll();
        for (int i = 0; i < listcbpanelhientai.size(); i++) {
            FlightPanel fp = listcbpanelhientai.get(i);

            jpnContainFlights.add(fp);
            jpnContainFlights.validate();
            jpnContainFlights.repaint();           
        }
    }
    
    private void cbbColSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbColSortActionPerformed
        tieuchisapxep = String.valueOf(cbbColSort.getSelectedItem());
        sapxep();
    }//GEN-LAST:event_cbbColSortActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbbColSort;
    private javax.swing.JComboBox<String> cbbLocTheoDiemDung;
    private javax.swing.JComboBox<String> cbbLocTheoTimeEnd;
    private javax.swing.JComboBox<String> cbbLocTheoTimeStart;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler10;
    private javax.swing.Box.Filler filler12;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    private javax.swing.Box.Filler filler6;
    private javax.swing.Box.Filler filler7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpnContainFlights;
    // End of variables declaration//GEN-END:variables
}
