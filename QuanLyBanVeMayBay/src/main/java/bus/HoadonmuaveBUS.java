/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;

import daos.HoadonmuaveDAO;
import pojos.Hoadonmuave;

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
}
