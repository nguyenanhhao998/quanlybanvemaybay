/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;

import daos.SanbaytrunggianDAO;
import java.util.List;

/**
 *
 * @author HAO
 */
public class SanbaytrunggianBUS {

    static boolean themSanbayTrungGian(String maCb, List<String> listMaSBTG) {
        boolean res = SanbaytrunggianDAO.themSanbayTrungGian(maCb, listMaSBTG);
        return res;
    }

    static void capNhatSanbayTrungGian(String maCb, List<String> listMaSBTG) {
        SanbaytrunggianDAO.xoaSanbayTrungGian(maCb);
        SanbaytrunggianDAO.themSanbayTrungGian(maCb, listMaSBTG);

    }

}
