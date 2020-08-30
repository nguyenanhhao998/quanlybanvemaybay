/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.util.List;
import javax.persistence.NoResultException;
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojos.Hoadonmuave;
import pojos.Quydinh;
import util.HibernateUtil;

/**
 *
 * @author HAO
 */
public class QuydinhDAO {
    public static Quydinh getQuydinh(int id){
        Quydinh qd = null;
        
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();

            String hql = String.format("from Quydinh where idQuyDinh = %d and tinhTrang = '%s'", id, "Còn hiệu lực");
            Query query = session.createQuery(hql);
            qd = (Quydinh)query.getSingleResult();

        } catch (HibernateException ex) {
            ex.printStackTrace();
        } catch (NoResultException ex){
            ex.printStackTrace();
            qd = null;
        }finally{
            session.close();
        }
        
        return qd;
    }

    public static List<Quydinh> getListQuyDinh() {
        List<Quydinh> listQuydinhs = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            String hql = "from Quydinh";
            Query query = session.createQuery(hql);
            listQuydinhs = query.list();

        } catch (HibernateException e) {
            System.out.println(e);
        }
        return listQuydinhs;

    }

    public static boolean capNhatQuyDinh(Quydinh quydinh) {
        boolean res = true;
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();

            session.update(quydinh);

            transaction.commit();

        } catch (HibernateException e) {
            res = false;

            if (transaction != null) {
                transaction.rollback();
            }

            System.out.println(e);
        }

        return res;
    }

    public static Quydinh getQuydinhForAdmin(int id) {
        Quydinh qd = null;

        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();

            String hql = String.format("from Quydinh where idQuyDinh = %d", id);
            Query query = session.createQuery(hql);
            qd = (Quydinh) query.getSingleResult();

        } catch (HibernateException ex) {
            ex.printStackTrace();
        } catch (NoResultException ex) {
            ex.printStackTrace();
            qd = null;
        } finally {
            session.close();
        }

        return qd;
    }

}
