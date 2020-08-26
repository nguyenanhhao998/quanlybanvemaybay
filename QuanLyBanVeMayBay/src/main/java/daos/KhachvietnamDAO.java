/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.util.List;
import javax.persistence.NoResultException;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojos.Khachhang;
import pojos.Khachnuocngoai;
import pojos.Khachvietnam;
import util.HibernateUtil;

/**
 *
 * @author HAO
 */
public class KhachvietnamDAO {

    public static List<Khachvietnam> getListKhachvietnam() {
        List<Khachvietnam> listKhachvietnam = null;
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();

            String sql = "from Khachvietnam";
            Query query = session.createQuery(sql);
            listKhachvietnam = query.list();

        } catch (HibernateException ex) {
            ex.printStackTrace();
        }finally{
            session.close();
        }

        return listKhachvietnam;

    }

    public static int insert(Khachvietnam khvn) {
        int id = getIDKH(khvn.getHoTen(),khvn.getSdt(),khvn.getCmnd());
        //neu da co luu khach hang nay thi tra ve id khach hang
        if(id != -1)
            return id;
        Session session = null;
        Transaction transaction = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();

            id = (Integer)session.save(khvn);

            transaction.commit();

        } catch (HibernateException e) {
            transaction.rollback();
            e.printStackTrace();
        }finally{
            session.close();
        }
        
        return id;
    }
    
    public static int getIDKH(String hoten, String sdt, String cmnd) {
        int id = -1;
        Khachvietnam kh = null;
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();

            String hql = String.format("from Khachvietnam where hoTen = '%s' and sdt = '%s' "
                    + "and cmnd = '%s'",hoten, sdt, cmnd);
            Query query = session.createQuery(hql);
            kh = (Khachvietnam)query.uniqueResult();

        } catch (HibernateException ex) {
            ex.printStackTrace();
        }finally{
            session.close();
        }

        if(kh != null)
            id = kh.getMaKh();
        return id;
    }
    
    public static boolean kiemTraIdNumberKH(int makh, String idNumber){
        boolean kq = true;
        Khachvietnam kh = null;
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();

            String hql = String.format("from Khachvietnam where maKh = %d and cmnd = '%s'",makh, idNumber);
            Query query = session.createQuery(hql);
            kh = (Khachvietnam)query.getSingleResult();
            
        } catch (HibernateException ex) {
            ex.printStackTrace();
        } catch (NoResultException ex){
            kq = false;
        }finally{
            session.close();
        }
        
        return kq;
    }
    
    public static int getIDKHByCMND(String cmnd) {
        int id = -1;
        Khachvietnam kh = null;
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();

            String hql = String.format("from Khachvietnam where cmnd = '%s'", cmnd);
            Query query = session.createQuery(hql);
            kh = (Khachvietnam)query.getSingleResult();

        } catch (HibernateException ex) {
            ex.printStackTrace();
        }   catch (NoResultException ex){
            id = -1;
        } finally{
            session.close();
        }

        if(kh != null)
            id = kh.getMaKh();
        return id;
    }
}
