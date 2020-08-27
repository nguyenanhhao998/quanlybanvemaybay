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
            ex.printStackTrace();
        } finally {
            session.close();
        }

        return gia.getGiaHienTai();
    } 

    public static boolean themGiaHangVeTheoChuyenBay(String maCb, String maHangve, Double gia) {
        boolean res = true;
        Chuyenbay chuyenbay = ChuyenbayDAO.getChuyenBayByID(maCb);
        Hangve hangve = HangveDAO.getHangVeById(maHangve);
        Session session = null;
        Transaction transaction = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();

            Giahangvetheocb giahangvetheocb = new Giahangvetheocb(chuyenbay, hangve, gia);
            session.save(giahangvetheocb);

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
