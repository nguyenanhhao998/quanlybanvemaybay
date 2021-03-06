/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;

import daos.*;
import pojos.Nhanvien;
import pojos.Taikhoan;

/**
 *
 * @author HAO
 */
public class TaikhoanBUS {
    //kiểm tra tên tài khoản và mật khẩu, nếu đúng thì trả về id của tài khoản đó, sai thì trả về 0
    public static int checkAccount(String name, String pass){
        int id = 0;
        id = TaikhoanDAO.checkAccount(name, pass);
        return id;
    }
    
    public static String getPermission(int id){
        String res = "none";
        if(AdminBUS.checkAdmin(id))
            res = "admin";
        else if(NvbanveBUS.checkNvBanve(id))
            res = "nvbanve";
        return res;
    }
    
    public static String login(String name, String pass){
        int id = checkAccount(name, pass);        
        String res = "";
        if(id != 0){
            if(checkTinhTrangNV(id))
                res = getPermission(id);
            else
                res = "disable";
        }        
        return res;
    } 

    public static int checkAccount(String tenDangNhap) {
        int id = 0;
        id = TaikhoanDAO.checkAccount(tenDangNhap);
        return id;
    }

    //true: còn làm việc
    //false: đã nghỉ việc
    public static boolean checkTinhTrangNV(int id){
        return NhanvienDAO.checkTinhTrangNV(id);
    }
   
    public static boolean ChangePass(Taikhoan tk){
        return TaikhoanDAO.changePass(tk);
    }
}
