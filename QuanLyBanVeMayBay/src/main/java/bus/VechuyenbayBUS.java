/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;

import daos.*;
import java.util.HashSet;
import java.util.Set;
import pojos.Chuyenbay;
import pojos.Vechuyenbay;

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
}
