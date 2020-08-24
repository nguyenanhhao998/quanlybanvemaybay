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
import pojos.Khachhang;
import pojos.Khachvietnam;
import util.HibernateUtil;

/**
 *
 * @author HAO
 */
public class KhachhangDAO {

    public static List<Khachhang> getListKhachhang() {
        List<Khachhang> listKhachhang = null;
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();

            String sql = "from Khachhang";
            Query query = session.createQuery(sql);
            listKhachhang = query.list();

        } catch (HibernateException ex) {
            ex.printStackTrace();
        }

        return listKhachhang;

    }

    public static void themKhachhang(Khachhang khachhang) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();

            session.saveOrUpdate(khachhang);

            transaction.commit();

        } catch (HibernateException e) {
            transaction.rollback();
            e.printStackTrace();
        }
    }

    public static Khachhang getKHbyID(int id) {
        Khachhang kh = null;
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();

            String hql = String.format("from Khachhang where maKh = %d",id);
            Query query = session.createQuery(hql);
            kh = (Khachhang)query.getSingleResult();

        } catch (HibernateException ex) {
            ex.printStackTrace();
        }

        return kh;
    }
    
}
