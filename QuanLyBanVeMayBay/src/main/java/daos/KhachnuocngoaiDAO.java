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
public class KhachnuocngoaiDAO {
    public static List<KhachnuocngoaiDAO> getListKhachnuocngoai() {
        List<KhachnuocngoaiDAO> listKhachnuocngoai = null;
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();

            String sql = "from Khachnuocngoai";
            Query query = session.createQuery(sql);
            listKhachnuocngoai = query.list();

        } catch (HibernateException ex) {
            ex.printStackTrace();
        }

        return listKhachnuocngoai;
    }
    
    public static int insert(Khachnuocngoai khnn) {
        int id = getIDKH(khnn.getHoTen(),khnn.getSdt(),khnn.getQuocTich(), khnn.getHoChieu());
        //neu da co luu khach hang nay thi tra ve id khach hang
        if(id != -1)
            return id;
        Session session = null;
        Transaction transaction = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();

            id = (Integer)session.save(khnn);

            transaction.commit();

        } catch (HibernateException e) {
            transaction.rollback();
            e.printStackTrace();
        }
        
        return id;
    }
    
    public static int getIDKH(String hoten, String sdt, String quoctich, String hochieu) {
        int id = -1;
        Khachnuocngoai kh = null;
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();

            String hql = String.format("from Khachnuocngoai where hoTen = '%s' and sdt = '%s' "
                    + "and quocTich = '%s' and hoChieu = '%s'",hoten, sdt, quoctich, hochieu);
            Query query = session.createQuery(hql);
            kh = (Khachnuocngoai)query.getSingleResult();

        } catch (HibernateException ex) {
            ex.printStackTrace();
        } catch (NoResultException ex){
            return id;
        } finally{
            session.close();
        }

        if(kh != null)
            id = kh.getMaKh();
        return id;
    }
    
    public static boolean kiemTraIdNumberKH(int makh, String idNumber){
        Khachnuocngoai kh = null;
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();

            String hql = String.format("from Khachnuocngoai where maKh = %d and hoChieu = '%s'", makh, idNumber);
            Query query = session.createQuery(hql);
            kh = (Khachnuocngoai)query.getSingleResult();
        } catch (HibernateException ex) {
            ex.printStackTrace();
        } catch (NoResultException ex){
            return false;
        }
        
        return true;
    }
}
