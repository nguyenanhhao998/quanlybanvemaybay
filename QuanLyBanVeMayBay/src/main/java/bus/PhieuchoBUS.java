/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;

import daos.PhieuchoDAO;
import pojos.Phieucho;

/**
 *
 * @author HAO
 */
public class PhieuchoBUS {    
    public static int insert(Phieucho phieuc){
        int maphieu = PhieuchoDAO.insert(phieuc);
        return maphieu;
    }
    
    public static void delete(Phieucho phieuc){
        PhieuchoDAO.delete(phieuc);
    }
}
