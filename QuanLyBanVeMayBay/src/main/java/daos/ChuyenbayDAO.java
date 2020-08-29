/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.persistence.NoResultException;
import javax.swing.JOptionPane;
import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojos.Chuyenbay;
import pojos.Giahangvetheocb;
import pojos.Phieucho;
import pojos.Vechuyenbay;
import util.HibernateUtil;

/**
 *
 * @author HAO
 */
public class ChuyenbayDAO {

    public static List<Chuyenbay> getListChuyenbays() {
        List<Chuyenbay> ds = null;
        Session session = HibernateUtil.getSessionFactory().openSession();

        try {
            String hql = "From Chuyenbay cb WHERE cb.tinhTrang != 'Đã hủy'";
            Query query = session.createQuery(hql);
            ds = query.list();
        } catch (HibernateException ex) {
            //Log the exception
            System.err.println(ex);

        } finally {
            session.close();
        }

        return ds;
    }

    public static List<Chuyenbay> findFlights(String masbdi, String masbden,int SL, String MaHangGhe, Date date) {
        List<Chuyenbay> ds = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String ngay = df.format(date);
        
        String tinhtrangcb = "Chưa khởi hành";
        try {
            String hql = String.format("SELECT cb FROM Chuyenbay cb "                 
                    + "left join cb.giahangvetheocbs as gia "
                    + "left join cb.vechuyenbays as ve "
                    + "left join cb.sanbaytrunggians as sbtg "
                    + "WHERE gia.id.maHangVe = '%s' and ve.hangve = '%s' "
                    + "and MaSBDi = '%s' and MaSBDen = '%s' and Date(NgayKhoiHanh) = '%s' "
                    + "and cb.tinhTrang = '%s' "
                    + "GROUP BY cb.maCb "
                    + "ORDER BY NgayKhoiHanh asc",MaHangGhe,MaHangGhe,masbdi,masbden, ngay, tinhtrangcb);
            Query query = session.createQuery(hql).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
            ds = query.list();       
        } catch (HibernateException ex) {
            //Log the exception
            System.err.println(ex);
        } finally {
            session.close();
        }
        
        return ds;
    }

    public static Chuyenbay getChuyenBayByID(String macb){
        Chuyenbay cb = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            String hql = String.format("SELECT cb FROM Chuyenbay cb "                 
                    + "left join cb.sanbaytrunggians as sbtg "
                    + "WHERE cb.maCb = '%s'",macb);
            Query query = session.createQuery(hql).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
            cb = (Chuyenbay)query.getSingleResult();
        } catch (HibernateException ex) {
            //Log the exception
            System.err.println(ex);
        }catch (NoResultException ex) {
            //Log the exception
            System.err.println(ex);
        } finally {
            session.close();
        }
        
        return cb;
    }
    
    public static List<Chuyenbay> getTatCaCB(){//lấy tất cả các chuyến bay chưa khởi hành
        List<Chuyenbay> listCB = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        try {
            String hql = String.format("SELECT cb FROM Chuyenbay cb "
                    + "left join cb.giahangvetheocbs as sbtg "
                    + "left join cb.sanbaytrunggians as sbtg "
                    + "left join cb.phieuchos as pc "
                    + "left join cb.vechuyenbays as ve "
                    + "WHERE cb.ngayKhoiHanh > '%s'"
                    + "and cb.tinhTrang != 'Đã hủy'", df.format(new Date()));
            Query query = session.createQuery(hql).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
            listCB = query.list(); 
        } catch (HibernateException ex) {
            //Log the exception
            System.err.println(ex);
        } finally {
            session.close();
        }
        
        return listCB;
    }


    public static List<Chuyenbay> getListChuyenBaysByFilter(String maSanBayDi, String maSanBayDen, Integer soLuongHanhKhach, Date ngayKhoiHanh) {
        List<Chuyenbay> listCB = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        try {
            String hqlMaSanBayDi = "";
            String hqlMaSanBayDen = "";
            String hqlSoLuongHanhKhach = "";
            String hqlNgayKhoiHanh = "";
            if (maSanBayDi != null) {
                hqlMaSanBayDi = String.format(" AND cb.sanbaydi.maSb = '%s'", maSanBayDi);
            }
            if (maSanBayDen != null) {
                hqlMaSanBayDen = String.format(" AND cb.sanbayden.maSb = '%s'", maSanBayDen);
            }
            if (soLuongHanhKhach != -1) {
                hqlSoLuongHanhKhach = String.format(" AND %d <= (SELECT COUNT(*) FROM cb.vechuyenbays)", soLuongHanhKhach);
            }
            if (ngayKhoiHanh != null) {
                hqlNgayKhoiHanh = String.format(" AND cb.ngayKhoiHanh >= '%s'", df.format(ngayKhoiHanh));
            }

            String hql = String.format("SELECT cb FROM Chuyenbay cb "
                    + "WHERE cb.tinhTrang != 'Đã hủy'"
                    + hqlMaSanBayDi
                    + hqlMaSanBayDen
                    + hqlSoLuongHanhKhach
                    + hqlNgayKhoiHanh
            );
            Query query = session.createQuery(hql);
            listCB = query.list();

        } catch (HibernateException ex) {
            //Log the exception
            System.err.println(ex);
        } finally {
            session.close();
        }

        return listCB;
    }

    public static boolean themChuyenbay(Chuyenbay newCB) {
        boolean res = true;
        Session session = null;
        Transaction transaction = null;

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();

            session.save(newCB);

            transaction.commit();

        } catch (HibernateException e) {
            res = false;
            transaction.rollback();
            e.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }

        return res;
    }

    public static boolean capNhatChuyenbay(Chuyenbay newCB) {
        boolean res = true;
        Session session = null;
        Transaction transaction = null;

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();

            session.update(newCB);

            transaction.commit();

        } catch (HibernateException e) {
            res = false;
            transaction.rollback();
            e.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }

        return res;
    }

    public static boolean huyChuyenBay(String maCb) {
        boolean res = true;
        Session session = null;
        Transaction transaction = null;

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();

            String hql = String.format("UPDATE Chuyenbay cb SET cb.tinhTrang = 'Đã hủy' WHERE cb.maCb = '%s'", maCb);
            Query query = session.createQuery(hql);
            query.executeUpdate();

            transaction.commit();

        } catch (HibernateException e) {
            res = false;
            transaction.rollback();
            e.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }

        return res;
    }

    public static Integer getSoLuongChuyenBayTrongKhoangThoiGian(Date from, Date to) {
        Integer res = 0;
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            String hql = String.format("SELECT COUNT(*)"
                    + " FROM Chuyenbay cb"
                    + " WHERE cb.ngayKhoiHanh >= '%s' AND cb.ngayKhoiHanh <= '%s'",
                    df.format(from), df.format(to));

            Query query = session.createQuery(hql);
            Long lres = (Long) query.uniqueResult();
            res = lres.intValue();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return res;
    }

}
