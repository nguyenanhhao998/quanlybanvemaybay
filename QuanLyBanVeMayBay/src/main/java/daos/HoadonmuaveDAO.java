/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
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
            hd = null;
        }finally{
            session.close();
        }

        return hd;
    }
    
    public static boolean delete(Hoadonmuave hd){
        boolean res = true;
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
            res = false;
        }finally{
            session.close();
        }
        
        return res;
    }

    public static Integer getSoLuongVeBanDuocTrongKhoangThoiGian(Date from, Date to) {
        Integer res = 0;
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            String hql = String.format("SELECT COUNT(*)"
                    + " FROM Hoadonmuave hd"
                    + " WHERE hd.ngayMua >= '%s' AND hd.ngayMua <= '%s'",
                    df.format(from), df.format(to));

            Query query = session.createQuery(hql);
            Long lres = (Long) query.uniqueResult();
            res = lres.intValue();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return res;
    }

    public static Double getTongDoanhTrongKhoangThoiGian(Date from, Date to) {
        Double res = 0d;

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            String hql = String.format("SELECT SUM(hd.giaVe)"
                    + " FROM Hoadonmuave hd"
                    + " WHERE hd.ngayMua >= '%s' AND hd.ngayMua <= '%s'",
                    df.format(from), df.format(to));

            Query query = session.createQuery(hql);
            res = (Double) query.uniqueResult();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return (res == null ? 0d : res);
    }
}
