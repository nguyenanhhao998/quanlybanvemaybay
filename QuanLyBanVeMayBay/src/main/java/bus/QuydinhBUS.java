/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;

import daos.*;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import pojos.Quydinh;
import util.HibernateUtil;

/**
 *
 * @author HAO
 */
public class QuydinhBUS {
    public static boolean ktThoiHanDatVe(Date ngayKhoiHanh){
        boolean kq = true;
        int thoihan = -1;
        int id = 2;//mã quy định của thời hạn đặt vé
        Quydinh qd = QuydinhDAO.getQuydinh(id);
        switch(qd.getKieu()){
            case "Number":
                thoihan = Integer.valueOf(qd.getGiaTri());
                break;
        }
        
        if(thoihan != -1){
            //ngày sau khi cộng thêm thời hạn có thể đặt vé vào ngày hiện tại
            Date ngay = new Date(ngayKhoiHanh.getTime() + TimeUnit.HOURS.toMillis((long) thoihan));
            if(ngayKhoiHanh.compareTo(ngay) <= 0){
                kq = false;
            }
        }
        
        return kq;
    }
    
    public static boolean ktThoiHanHuyVe(Date ngayKhoiHanh){
        boolean kq = true;
        int thoihan = -1;
        int id = 1;//mã quy định của thời hạn hủy vé
        Quydinh qd = QuydinhDAO.getQuydinh(id);
        switch(qd.getKieu()){
            case "Number":
                thoihan = Integer.valueOf(qd.getGiaTri());
                break;
        }
        
        if(thoihan != -1){
            //ngày sau khi cộng thêm thời hạn có thể đặt vé vào ngày hiện tại
            Date ngay = new Date(ngayKhoiHanh.getTime() + TimeUnit.HOURS.toMillis((long) thoihan));
            if(ngayKhoiHanh.compareTo(ngay) <= 0){
                kq = false;
            }
        }        
        return kq;
    }

    public static List<Quydinh> getListQuyDinh() {
        return QuydinhDAO.getListQuyDinh();
    }

    public static Quydinh getQuydinh(int id) {
        return QuydinhDAO.getQuydinh(id);
    }

    public static boolean capNhatQuyDinh(Quydinh quydinh) {
        return QuydinhDAO.capNhatQuyDinh(quydinh);
    }

    public static Quydinh getQuydinhForAdmin(int id) {
        return QuydinhDAO.getQuydinhForAdmin(id);
    }

}
