/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;

import daos.AdminDAO;
import pojos.Admin;
/**
 *
 * @author HAO
 */
public class AdminBUS {
    public static boolean checkAdmin(int id){
        return AdminDAO.checkAdmin(id);
    }
    
    public static Admin getNVbyID(int id){
        return AdminDAO.getNVbyID(id);
    }
}
