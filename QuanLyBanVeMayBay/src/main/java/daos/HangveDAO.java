/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import pojos.Hangve;
import util.HibernateUtil;

/**
 *
 * @author HAO
 */
public class HangveDAO {
    public static List<Hangve> getAll(){
        List<Hangve> listhv = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            String hql = "select hv from Hangve hv";
            Query query = session.createQuery(hql);
            listhv = query.list();
        } catch (HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        } 
        return listhv;
    }
    
    public static String getTicketLevelName(String mahv){
        List<Hangve> listhv = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            String hql = String.format("select hv from Hangve hv where maHangVe = '%s'",mahv);
            Query query = session.createQuery(hql);
            listhv = query.list();
        } catch (HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        } 
        return listhv.get(0).getTenHangVe();
    }
}
