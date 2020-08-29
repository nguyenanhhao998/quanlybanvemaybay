/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;

import daos.*;
import java.util.List;


import pojos.Nhanvien;


/**
 *
 * @author HAO
 */
public class NhanvienBUS {
    public static List<Nhanvien> getListNhanVien() {
        return NhanvienDAO.getListNhanVien();
    }

    public static List<Nhanvien> getListNhanVien(int searchCriteria, String keyWord) {
        return NhanvienDAO.getListNhanVien(searchCriteria, keyWord);
    }

    public static void themOrUpdateNhanvien(Nhanvien nv) {
        NhanvienDAO.themOrUpdateNhanvien(nv);

    }

    public static Nhanvien getNhanvienById(Integer idNhanVien) {

        Nhanvien nv;

        nv = NhanvienDAO.getNhanvienById(idNhanVien);

        return nv;

    }

    public static boolean deleteNhanvienById(Integer idNhanVien) {
        Nhanvien nhanvien = getNhanvienById(idNhanVien);
        if (nhanvien == null) {
            return false;
        }

        return NhanvienDAO.deleteNhanvien(nhanvien);

    }

}
