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
import java.util.List;
import pojos.Chuyenbay;
import pojos.Phieudatcho;

/**
 *
 * @author HAO
 */
public class PhieudatchoBUS {
    public static int insert(Phieudatcho phieudc){
        int maphieu = PhieudatchoDAO.insert(phieudc);
        return maphieu;
    }
    
    public static List<Phieudatcho> getListPhieudatchoByMaKH(int idKH){
        return PhieudatchoDAO.getListPhieudatchoByMaKH(idKH);
    }
    
    public static List<Phieudatcho> getListPhieudatcho(int idKH, Date ngayKH, String Sanbaydi, String Sanbayden){
        List<Phieudatcho> kq = new ArrayList();
        List<Phieudatcho> listAllPhieu = PhieudatchoBUS.getListPhieudatchoByMaKH(idKH);
        
        for(int i = 0; i < listAllPhieu.size();i++){
            String macb = listAllPhieu.get(i).getVechuyenbay().getChuyenbay().getMaCb();
            Chuyenbay cb = ChuyenbayBUS.getChuyenBayByID(macb);
            String sbdi = cb.getSanbayByMaSbdi().getThanhPho() +" (" + cb.getSanbayByMaSbdi().getMaSb() + ")";
            String sbden = cb.getSanbayByMaSbden().getThanhPho() +" (" + cb.getSanbayByMaSbden().getMaSb() + ")";
            DateFormat df = new SimpleDateFormat("hh:mm dd/MM/yyyy");
            boolean sosanhngay = df.format(ngayKH).equals(df.format(cb.getNgayKhoiHanh()));
            if(sbdi.equalsIgnoreCase(Sanbaydi) && sbden.equalsIgnoreCase(Sanbayden) && sosanhngay){
                kq.add(listAllPhieu.get(i));
            }        
        }
        return kq;
    }

    public static void delete(Phieudatcho phieudc){
        PhieudatchoDAO.delete(phieudc);
    }
}
