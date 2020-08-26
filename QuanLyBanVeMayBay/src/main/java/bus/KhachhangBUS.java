/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;

import daos.*;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojos.Khachhang;
import pojos.Khachvietnam;
import util.HibernateUtil;

/**
 *
 * @author HAO
 */
public class KhachhangBUS {
    public static Khachhang getKHbyID(int id){
        if(id == -1) return null;
        return KhachhangDAO.getKHbyID(id);
    }
    
    public static boolean kiemTraIdNumberKH(int makh,String idNumber){
        boolean kq = KhachvietnamBUS.kiemTraIdNumberKH(makh,idNumber) || KhachnuocngoaiBUS.kiemTraIdNumberKH(makh,idNumber);
        return kq;
    }
    
    public static int getIdKHbyCMNDOrHoChieu(String cmndOrhochieu){
        int id = KhachvietnamBUS.getIdKHbyCMND(cmndOrhochieu);
        if(id == -1)
            id = KhachnuocngoaiBUS.getIdKHbyHoChieu(cmndOrhochieu);
        return id;
    }
}
