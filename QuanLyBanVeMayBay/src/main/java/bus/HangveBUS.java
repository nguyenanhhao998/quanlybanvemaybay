/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;

import daos.HangveDAO;

/**
 *
 * @author HAO
 */
public class HangveBUS {   
    public static String getTicketLevelName(String mahangve){
        return HangveDAO.getTicketLevelName(mahangve);
    }
}
