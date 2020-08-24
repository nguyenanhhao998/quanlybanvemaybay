/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;

import daos.*;
import java.util.Iterator;
import pojos.Chuyenbay;
import pojos.Giahangvetheocb;

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
}
