/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojos.Hoadonmuave;
import pojos.Vechuyenbay;
import util.HibernateUtil;

/**
 *
 * @author HAO
 */
public class VechuyenbayDAO {
    public static boolean updateStatus(Vechuyenbay ve){
        boolean kq = true;
        Session session = null;
        Transaction transaction = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();

            session.update(ve);

            transaction.commit();

        } catch (HibernateException e) {
            transaction.rollback();
            e.printStackTrace();
            kq = false;
        }finally{
            session.close();
        }
        
        return kq;
    }
    
    //public static Chuyenbay getChuyenBayBy
}
