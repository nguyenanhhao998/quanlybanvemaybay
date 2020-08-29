/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.util.List;
import javax.persistence.NoResultException;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojos.Chuyenbay;
import pojos.Giahangvetheocb;
import pojos.Hangve;
import util.HibernateUtil;

/**
 *
 * @author HAO
 */
public class GiahangvetheocbDAO {
    public static double getGiahientai(String macb, String mahangve){
        double giahientai = 0;
        Giahangvetheocb gia = null;
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();    
            String hql = String.format("from Giahangvetheocb where maCb = '%s' and maHangVe = '%s'",macb,mahangve);
            Query query = session.createQuery(hql);
            gia = (Giahangvetheocb)query.getSingleResult();

        } catch (HibernateException ex) {
            ex.printStackTrace();
        } catch(NoResultException ex){
            System.err.println(ex);
        } finally {
            session.close();
        }

        if(gia != null)
            giahientai = gia.getGiaHienTai();
        return giahientai;
    } 

    public static boolean updateGiaHangVeTheoChuyenBay(String maCb, String maHangve, Double gia) {
        boolean res = true;
        Chuyenbay chuyenbay = ChuyenbayDAO.getChuyenBayByID(maCb);
        Hangve hangve = HangveDAO.getHangVeById(maHangve);
        Session session = null;
        Transaction transaction = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();

            Giahangvetheocb giahangvetheocb = new Giahangvetheocb(chuyenbay, hangve, gia);
            session.saveOrUpdate(giahangvetheocb);

            transaction.commit();

        } catch (HibernateException ex) {
            res = false;
            transaction.rollback();
            ex.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }

        }
        return res;
    }

    public static boolean xoaGiaHangVeTheoChuyenBay(String maCb, String maHangVe) {
        boolean res = true;
        Session session = null;
        Transaction transaction = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();

            String sql = String.format("DELETE FROM giahangvetheocb WHERE MaCB = '%s' AND MaHangVe = '%s'", maCb, maHangVe);
            Query query = session.createSQLQuery(sql);
            query.executeUpdate();

            transaction.commit();

        } catch (HibernateException ex) {
            res = false;
            transaction.rollback();
            ex.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }

        }
        return res;
    }

}
