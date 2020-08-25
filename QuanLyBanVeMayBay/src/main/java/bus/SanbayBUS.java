/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;

import daos.*;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import pojos.Sanbay;
import util.HibernateUtil;

/**
 *
 * @author HAO
 */
public class SanbayBUS {
    public static List<Sanbay> getAll(){
        List<Sanbay> listsb = null;
        listsb = SanbayDAO.getAll();
        return listsb;
    }
    /*
    public static String getAirportNameById(String masb){
        List<Sanbay> listsb = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            String hql = String.format("select sb from Sanbay sb where maSb = '%s'",masb);
            Query query = session.createQuery(hql);
            listsb = query.list();
        } catch (HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }
        if(listsb.isEmpty())
            return "";
        return listsb.get(0).getThanhPho();
    }*/
}
