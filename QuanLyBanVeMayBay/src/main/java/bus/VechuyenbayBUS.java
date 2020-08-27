/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;

import daos.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import pojos.Chuyenbay;
import pojos.Vechuyenbay;
import util.HibernateUtil;

/**
 *
 * @author HAO
 */
public class VechuyenbayBUS {

    public static boolean updateStatus(Vechuyenbay ve, String status){
        ve.setTinhTrang(status);
        
        return VechuyenbayDAO.updateStatus(ve);
    }
    /*
    public static Chuyenbay getChuyenBayByMaSoVe(String mave){
        return VechuyenbayDAO.getChuyenBayByMaSoVe(mave);
    }*/

    static boolean taoListVeCuaChuyenBay(String maCb, List<Integer> listSoLuongVeTheoHang) {
        List<List<String>> listIdVe = generateVeIdForNewChuyenBay(maCb, listSoLuongVeTheoHang);
        boolean res = VechuyenbayDAO.taoListVeCuaChuyenBay(maCb, listSoLuongVeTheoHang, listIdVe);
        return res;
    }

    private static List<List<String>> generateVeIdForNewChuyenBay(String maCb, List<Integer> listSoLuongVeTheoHang) {
        List<List<String>> res = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            res.add(new ArrayList<>());
        }

        for (int i = 0; i < listSoLuongVeTheoHang.get(0); i++) {
            String idVe = maCb + "PT" + String.format("V%04d", i + 1);
            res.get(0).add(idVe);
        }
        for (int i = 0; i < listSoLuongVeTheoHang.get(1); i++) {
            String idVe = maCb + "DB" + String.format("V%04d", i + 1);
            res.get(1).add(idVe);
        }
        for (int i = 0; i < listSoLuongVeTheoHang.get(2); i++) {
            String idVe = maCb + "TG" + String.format("V%04d", i + 1);
            res.get(2).add(idVe);
        }
        return res;
    }
    public static int getSoVeDaMuaTheoHangCB(String maCB, String maHangVe) {
        int res = -1;
        res = VechuyenbayDAO.getSoVeDaMuaTheoHangCB(maCB, maHangVe);
        return res;
    }

    public static int getSoVeTheoHangCB(String maCB, String maHangVe) {
        int res = -1;
        res = VechuyenbayDAO.getSoVeTheoHangCB(maCB, maHangVe);
        return res;
    }

    public static void capNhatListVeCuaChuyenBay(String maCb, List<Integer> listSoLuongVeTheoHang, List<Integer> listSoLuongVeTheoHangBanDau) {
        String[] maHangVe = {"hv_pt", "hv_ptdb", "hv_tg"};
        for (int i = 0; i < 3; i++) {
            int newNum = listSoLuongVeTheoHang.get(i);
            int oldNum = listSoLuongVeTheoHangBanDau.get(i);
            if (newNum > oldNum) {
                themVeTheoHangChuyenBay(maCb, listSoLuongVeTheoHangBanDau.get(i), newNum - oldNum, maHangVe[i]);
            } else if (newNum < oldNum) {
                //xoaVeTheoHangChuyenBay(maCb, oldNum - newNum);
            }
        }
    }

    private static void themVeTheoHangChuyenBay(String maCb, int soLuongHienTai, int soLuongThemVao, String maHangVe) {
        List<String> listNewId = new ArrayList<>();
        String mid = "";
        if (maHangVe.equals("hv_pt")) {
            mid = "PT";
        } else if (maHangVe.equals("hv_ptdb")) {
            mid = "DB";
        } else {
            mid = "TG";
        }
        for (int i = soLuongHienTai; i < soLuongHienTai + soLuongThemVao; i++) {
            String idVe = maCb + mid + String.format("V%04d", i + 1);
            listNewId.add(idVe);
        }

        VechuyenbayDAO.themVeTheoHangChuyenBay(maCb, listNewId, maHangVe);

    }

}
