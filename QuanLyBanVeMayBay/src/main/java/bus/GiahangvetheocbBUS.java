/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;

import daos.*;
import java.util.Iterator;
import java.util.List;
import pojos.Chuyenbay;
import pojos.Giahangvetheocb;
import pojos.Hangve;

/**
 *
 * @author HAO
 */
public class GiahangvetheocbBUS {
    public static double getGia(String macb, String mahangve){  
        double kq = GiahangvetheocbDAO.getGiahientai(macb,mahangve);
        return kq;
    }
    
    public static double getGiaHienTai(Chuyenbay cb, String mahangve){
        Iterator<Giahangvetheocb> ghvs = cb.getGiahangvetheocbs().iterator();
        while(ghvs.hasNext()){
            Giahangvetheocb ghv = ghvs.next();
            if(ghv.getHangve().getMaHangVe().equals(mahangve)){
                return ghv.getGiaHienTai();
            }
        }
        return 0;
    }

    static boolean taoGiaHangVeTheoChuyenBay(String maCb, List<Integer> listSoLuongVeTheoHang, List<Double> giaVeTheoHang) {
        List<Hangve> listHangves = HangveDAO.getAll();
        for (int i = 0; i < 3; i++) {
            if (listSoLuongVeTheoHang.get(i) > 0) {
                GiahangvetheocbDAO.themGiaHangVeTheoChuyenBay(maCb, listHangves.get(i).getMaHangVe(), giaVeTheoHang.get(i));
            }
        }

        return true;
    }

}
