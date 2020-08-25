/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;

import daos.KhachvietnamDAO;
import java.util.Date;
import java.util.Set;
import pojos.Khachvietnam;


/**
 *
 * @author HAO
 */
public class KhachvietnamBUS {
    public static Integer insertKHVN(Khachvietnam khvn){
        //1 success 3 exception
        int idKH = KhachvietnamDAO.insert(khvn);
        //insert khach hang moi va tra ve id cua khach hang do
        //neu khach hang da ton tai thi tra ve id
        return idKH;
    }
    
    public static boolean kiemTraIdNumberKH(int makh, String idNumber){
        return KhachvietnamDAO.kiemTraIdNumberKH(makh, idNumber);
    }
 
    public static int getIdKHbyCMND(String cmndOrhochieu){
        return KhachvietnamDAO.getIDKHByCMND(cmndOrhochieu);
    }
}
