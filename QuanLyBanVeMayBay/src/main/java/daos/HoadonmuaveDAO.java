/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import javax.persistence.NoResultException;
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojos.Hoadonmuave;
import util.HibernateUtil;

/**
 *
 * @author HAO
 */
public class HoadonmuaveDAO {
    public static int insert(Hoadonmuave hd){
        int result = -1;
        Session session = null;
        Transaction transaction = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();

            result = (Integer)session.save(hd);

            transaction.commit();
        } catch (HibernateException e) {
            transaction.rollback();
            e.printStackTrace();
        }
        
        return result;
    }
    
    public static Hoadonmuave getHoaDonByID(int id) {
        Hoadonmuave hd = null;
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();

            String hql = String.format("from Hoadonmuave where idHoaDon = %d",id);
            Query query = session.createQuery(hql);
            hd = (Hoadonmuave)query.getSingleResult();
            Hibernate.initialize(hd.getKhachhang());
            Hibernate.initialize(hd.getVechuyenbay());

        } catch (HibernateException ex) {
            ex.printStackTrace();
        }

        return hd;
    }
    
    public static Hoadonmuave getHoaDonByMaVe(String masove) {
        Hoadonmuave hd = null;
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();

            String hql = String.format("from Hoadonmuave where MaSoVe = '%s'",masove);
            Query query = session.createQuery(hql);
            hd = (Hoadonmuave)query.getSingleResult();
            Hibernate.initialize(hd.getKhachhang());
            Hibernate.initialize(hd.getVechuyenbay());

        } catch (HibernateException ex) {
            ex.printStackTrace();
        } catch (NoResultException ex){
            return null;
        }finally{
            session.close();
        }

        return hd;
    }
    
    public static boolean delete(Hoadonmuave hd){
        Session session = null;
        Transaction transaction = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();

            session.delete(hd);

            transaction.commit();
            
        } catch (HibernateException e) {
            transaction.rollback();
            e.printStackTrace();
            return false;
        }
        
        return true;
    }
}
