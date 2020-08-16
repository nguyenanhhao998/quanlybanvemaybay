/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import daos.KhachhangDAO;
import daos.KhachvietnamDAO;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import pojos.Khachhang;
import pojos.Khachnuocngoai;
import pojos.Khachvietnam;

/**
 *
 * @author HAO
 */
public class Main {
    public static void main(String[] args) {

        Khachhang khachhangMoi = new Khachnuocngoai("Tom", "231323", "Nam", new Date(), new HashSet(0), new HashSet(0), "Anh", "2422");
        KhachhangDAO.themKhachhang(khachhangMoi);

        List<Khachhang> listKhachhangs = KhachhangDAO.getListKhachhang();
        for (Khachhang kh : listKhachhangs) {
            System.out.println(kh);
            System.out.println();
        }
    }
}
