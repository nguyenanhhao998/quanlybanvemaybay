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
            String hql = "From Chuyenbay";
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
                    + "WHERE cb.ngayKhoiHanh > '%s'",df.format(new Date()));
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
}
