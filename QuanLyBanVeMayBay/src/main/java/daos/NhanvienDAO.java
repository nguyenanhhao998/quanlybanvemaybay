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
import pojos.Nhanvien;
import util.HibernateUtil;

/**
 *
 * @author HAO
 */
public class NhanvienDAO {

    public static final int SEARCH_BY_NAME = 0;
    public static final int SEARCH_BY_USERNAME = 1;
    public static final int SEARCH_BY_PHONE = 2;
    public static final int SEARCH_BY_CMND = 3;

    public static List<Nhanvien> getListNhanVien() {

        List<Nhanvien> listNhanviens = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            String hql = "from Nhanvien";
            Query query = session.createQuery(hql);
            listNhanviens = query.list();

        } catch (HibernateException e) {
            e.printStackTrace();
        }

        return listNhanviens;
    }

    public static List<Nhanvien> getListNhanVien(int searchCriteria, String keyWord) {
        List<Nhanvien> listNhanviens = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            String criteria = "nv.hoTen";

            switch (searchCriteria) {
                case SEARCH_BY_NAME:
                    criteria = "nv.hoTen";
                    break;
                case SEARCH_BY_USERNAME:
                    criteria = "nv.taikhoan.tenTaiKhoan";
                    break;
                case SEARCH_BY_PHONE:
                    criteria = "nv.sdt";
                    break;
                case SEARCH_BY_CMND:
                    criteria = "nv.cmnd";
                    break;
            }

            String hql = String.format("select nv from Nhanvien nv where %s LIKE '%%%s%%'", criteria, keyWord);
            Query query = session.createQuery(hql);
            listNhanviens = query.list();

        } catch (HibernateException e) {
            e.printStackTrace();
        }

        return listNhanviens;

    }

    public static boolean themOrUpdateNhanvien(Nhanvien nv) {
        boolean res = true;

        Session session = null;
        Transaction transaction = null;

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();

            session.saveOrUpdate(nv);

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

    public static Nhanvien getNhanvienById(Integer idNhanVien) {

        Nhanvien nv = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            String hql = String.format("From Nhanvien nv where nv.idNhanVien = '%s'", idNhanVien);
            Query query = session.createQuery(hql);
            nv = (Nhanvien) query.uniqueResult();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return nv;

    }

    public static boolean deleteNhanvien(Nhanvien nhanvien) {
        boolean res = true;

        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();

            session.delete(nhanvien);

            transaction.commit();

        } catch (Exception e) {
            res = false;
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return res;
    }

    public static boolean checkTinhTrangNV(int id){
        boolean res = true;
        Nhanvien nv = null;
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();

            String hql = String.format("from Nhanvien where idNhanVien = %d and trangThai = '%s'",id, "Đang hoạt động");
            Query query = session.createQuery(hql);
            nv = (Nhanvien)query.getSingleResult();
            
        } catch (HibernateException ex) {
            ex.printStackTrace();
        } catch (NoResultException ex){
            res = false;
        }finally{
            session.close();
        }

        return res;
    }
}
