/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;

import static bus.ChuyenbayBUS.getSoLuongChuyenBayTrongKhoangThoiGian;
import daos.HoadonmuaveDAO;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import pojos.Hoadonmuave;
import util.ui.DateUtil;

/**
 *
 * @author HAO
 */
public class HoadonmuaveBUS {
    public static int insert(Hoadonmuave hd){
        int mahd = HoadonmuaveDAO.insert(hd);
        return mahd;
    }
    
    public static Hoadonmuave getHoaDonByID(int id){
        return HoadonmuaveDAO.getHoaDonByID(id);
    }
    
    public static Hoadonmuave getHoaDonByMaVe(String masove){
        return HoadonmuaveDAO.getHoaDonByMaVe(masove);
    }
    
    public static boolean delete(Hoadonmuave hd){
        return HoadonmuaveDAO.delete(hd);
    }

    public static Integer getSoLuongVeBanDuocTrongKhoangThoiGian(Date from, Date to) {
        Integer res = 0;
        res = HoadonmuaveDAO.getSoLuongVeBanDuocTrongKhoangThoiGian(from, to);
        return res;
    }

    public static Double getTongDoanhTrongKhoangThoiGian(Date from, Date to) {
        Double res = 0d;
        res = HoadonmuaveDAO.getTongDoanhTrongKhoangThoiGian(from, to);

        return res;
    }

    public static List<Integer> getListSoVeBanDuocTungThang(Date from, Date to) {
        List<Integer> listSoLuong = new ArrayList<>();

        Date curStart, curEnd;
        curStart = DateUtil.getTheBeginningOfCurrentMonth(from);
        curEnd = DateUtil.getTheEndOfCurrentMonth(from);

        while (true) {
            if (curStart.compareTo(to) > 0) {
                break;
            }
            int nextMonthRes = getSoLuongVeBanDuocTrongKhoangThoiGian(curStart, curEnd);
            listSoLuong.add(nextMonthRes);

            curStart = DateUtil.getTheBeginningOfNextMonth(curStart);
            curEnd = DateUtil.getTheEndOfCurrentMonth(curStart);
        }


        return listSoLuong;

    }

    public static List<Double> getListDoanhThuTungThang(Date from, Date to) {
        List<Double> listSoLuong = new ArrayList<>();

        Date curStart, curEnd;
        curStart = DateUtil.getTheBeginningOfCurrentMonth(from);
        curEnd = DateUtil.getTheEndOfCurrentMonth(from);

        while (true) {
            if (curStart.compareTo(to) > 0) {
                break;
            }
            Double nextMonthRes = getTongDoanhTrongKhoangThoiGian(curStart, curEnd);
            listSoLuong.add(nextMonthRes);

            curStart = DateUtil.getTheBeginningOfNextMonth(curStart);
            curEnd = DateUtil.getTheEndOfCurrentMonth(curStart);
        }

        return listSoLuong;
    }

    public static List<Integer> getListSoVeBanDuocTungNam(int from, int to) {
        List<Integer> listSoLuong = new ArrayList<>();
        Date curStart, curEnd;

        for (int i = from; i <= to; i++) {

            curStart = DateUtil.getTheBeginningOfCurrentYear(i);
            curEnd = DateUtil.getTheEndOfCurrentYear(i);

            int nextMonthRes = getSoLuongVeBanDuocTrongKhoangThoiGian(curStart, curEnd);
            listSoLuong.add(nextMonthRes);

        }

        return listSoLuong;
    }

    public static List<Double> getListDoanhThuTungNam(int from, int to) {
        List<Double> listSoLuong = new ArrayList<>();
        Date curStart, curEnd;

        for (int i = from; i <= to; i++) {
            curStart = DateUtil.getTheBeginningOfCurrentYear(i);
            curEnd = DateUtil.getTheEndOfCurrentYear(i);

            Double nextMonthRes = getTongDoanhTrongKhoangThoiGian(curStart, curEnd);
            listSoLuong.add(nextMonthRes);

        }

        return listSoLuong;
    }

}
