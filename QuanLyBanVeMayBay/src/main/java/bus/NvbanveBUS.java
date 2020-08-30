/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;

import daos.NvbanveDAO;
import pojos.Nvbanve;

/**
 *
 * @author HAO
 */
public class NvbanveBUS {
    public static boolean checkNvBanve(int id){
        return NvbanveDAO.checkNvbanve(id);
    }
    
    public static Nvbanve getNVbyID(int id){
        return NvbanveDAO.getNVbyID(id);
    }
}
