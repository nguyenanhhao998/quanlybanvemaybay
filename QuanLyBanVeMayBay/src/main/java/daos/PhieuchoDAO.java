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
import org.hibernate.Transaction;
import pojos.Phieucho;
import util.HibernateUtil;

/**
 *
 * @author HAO
 */
public class PhieuchoDAO {

    public static List<Phieucho> getListPhieuCho() {
        List<Phieucho> listPhieucho = null;
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();

            String sql = "from Phieucho";
            Query query = session.createQuery(sql);
            listPhieucho = query.list();

        } catch (HibernateException ex) {
            ex.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }

        }

        return listPhieucho;
    }
    
    public static int insert(Phieucho phieuc) {
        int id = 0;
        Session session = null;
        Transaction transaction = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();

            id = (Integer)session.save(phieuc);

            transaction.commit();

        } catch (HibernateException e) {
            transaction.rollback();
            e.printStackTrace();
        }finally{
            session.close();
        }
        
        return id;
    }
    
    public static void delete(Phieucho phieuc){
        Session session = null;
        Transaction transaction = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();

            session.delete(phieuc);

            transaction.commit();
            
        } catch (HibernateException e) {
            transaction.rollback();
            e.printStackTrace();
        }finally{
            session.close();
        }
    }
}
