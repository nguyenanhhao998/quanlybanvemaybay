/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;

import daos.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javafx.util.Pair;
import javax.swing.JOptionPane;
import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojos.Chuyenbay;
import pojos.Giahangvetheocb;
import pojos.Phieucho;
import pojos.Vechuyenbay;
import util.HibernateUtil;

/**
 *
 * @author HAO
 */
public class ChuyenbayBUS {    
    public static List<Vechuyenbay> getXVe(Chuyenbay cb, int sl, String mahangve){
        List<Vechuyenbay> ves = new ArrayList();
        
        Iterator<Vechuyenbay> vecbs = cb.getVechuyenbays().iterator();
        
        while(vecbs.hasNext()){
            Vechuyenbay ve = vecbs.next();
            if(ve.getHangve().getMaHangVe().equals(mahangve) && ve.getTinhTrang().equals("Chưa được mua")){
                ves.add(ve);
                sl--;
                if(sl == 0)
                    break;
            }     
        }
        return ves;
    }
    
    public static Chuyenbay getChuyenBayByID(String macb){
        return ChuyenbayDAO.getChuyenBayByID(macb);
    }
    
    public static List<Chuyenbay> getTatCaChuyenBay(){//lấy tất cả các chuyến bay chưa khởi hành
        List<Chuyenbay> listkq = ChuyenbayDAO.getTatCaCB();

        return listkq;
    }

    public static List<Chuyenbay> getListChuyenbays() {
        List<Chuyenbay> ds = null;
        ds = ChuyenbayDAO.getListChuyenbays();
        //loại các chuyến bay không có phiếu chờ nào hoặc các chuyến bay không còn chỗ trống nào
        for (int i = 0; i < ds.size(); i++) {
            if (ds.get(i).getPhieuchos().isEmpty() || ds.get(i).laySoGheTrong() == 0) {
                ds.remove(i);
                i--;
            }
        }
        return ds;
    }

    public static List<Chuyenbay> getListChuyenbaysForAdmin() {
        List<Chuyenbay> ds = null;
        ds = ChuyenbayDAO.getListChuyenbays();

        return ds;
    }

    public static List<Chuyenbay> getListChuyenBaysByFilter(String maSanBayDi, String maSanBayDen, Integer soLuongHanhKhach, Date ngayKhoiHanh) {
        List<Chuyenbay> ds = null;
        ds = ChuyenbayDAO.getListChuyenBaysByFilter(maSanBayDi, maSanBayDen, soLuongHanhKhach, ngayKhoiHanh);
        return ds;
    }

    public static void themChuyenBay(Chuyenbay newCB, List<String> listMaSBTG, List<Integer> listSoLuongVeTheoHang, List<Double> giaVeTheoHang) {
        ChuyenbayBUS.themChuyenbay(newCB);
        SanbaytrunggianBUS.themSanbayTrungGian(newCB.getMaCb(), listMaSBTG);
        VechuyenbayBUS.taoListVeCuaChuyenBay(newCB.getMaCb(), listSoLuongVeTheoHang);
        GiahangvetheocbBUS.taoGiaHangVeTheoChuyenBay(newCB.getMaCb(), listSoLuongVeTheoHang, giaVeTheoHang);

    }

    private static boolean themChuyenbay(Chuyenbay newCB) {
        boolean isSuccess = ChuyenbayDAO.themChuyenbay(newCB);
        return isSuccess;
    }

    public static void capNhatChuyenBay(Chuyenbay newCB, List<String> listMaSBTG, List<Integer> listSoLuongVeTheoHang, List<Integer> listSoLuongVeTheoHangBanDau, List<Double> listGiaVeTheoHang) {
        ChuyenbayBUS.capNhatChuyenbay(newCB);
        SanbaytrunggianBUS.capNhatSanbayTrungGian(newCB.getMaCb(), listMaSBTG);
        VechuyenbayBUS.capNhatListVeCuaChuyenBay(newCB.getMaCb(), listSoLuongVeTheoHang, listSoLuongVeTheoHangBanDau);
        GiahangvetheocbBUS.updateGiaHangVeTheoChuyenBay(newCB.getMaCb(), listSoLuongVeTheoHang, listGiaVeTheoHang);
    }

    private static void capNhatChuyenbay(Chuyenbay newCB) {

        ChuyenbayDAO.capNhatChuyenbay(newCB);
    }

    
    public static List<Chuyenbay> getListChuyenbaysCoPhieuCho() {
        List<Chuyenbay> ds = null;
        ds = ChuyenbayDAO.getTatCaCB();
        //loại các chuyến bay không có phiếu chờ nào hoặc các chuyến bay không còn chỗ trống nào
        for (int i = 0; i < ds.size(); i++) {
            if (ds.get(i).getPhieuchos().isEmpty() || ds.get(i).laySoGheTrong() == 0) {
                ds.remove(i);
                i--;
            }
        }
        return ds;
    }

    public static boolean huyChuyenBay(String maCb) {
        return ChuyenbayDAO.huyChuyenBay(maCb);
    }
}
