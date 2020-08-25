/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;

import daos.KhachnuocngoaiDAO;
import pojos.Khachnuocngoai;


/**
 *
 * @author HAO
 */
public class KhachnuocngoaiBUS {
    public static Integer insertKHNN(Khachnuocngoai khnn){
        //1 success 3 exception
        int idKH = KhachnuocngoaiDAO.insert(khnn);
        //insert khach hang moi va tra ve id cua khach hang do
        //neu khach hang da ton tai thi tra ve id
        return idKH;
    }
    
    public static boolean kiemTraIdNumberKH(int makh,String idNumber){
        return KhachnuocngoaiDAO.kiemTraIdNumberKH(makh,idNumber);
    }
    
    public static int getIdKHbyHoChieu(String cmndOrhochieu){
        return KhachnuocngoaiDAO.getIDKHByHoChieu(cmndOrhochieu);
    }
}
