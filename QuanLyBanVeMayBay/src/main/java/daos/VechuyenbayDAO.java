/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.util.List;
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojos.Chuyenbay;
import pojos.Hangve;
import pojos.Hoadonmuave;
import pojos.Vechuyenbay;
import util.HibernateUtil;

/**
 *
 * @author HAO
 */
public class VechuyenbayDAO {
    public static boolean updateStatus(Vechuyenbay ve){
        boolean kq = true;
        Session session = null;
        Transaction transaction = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();

            session.update(ve);

            transaction.commit();

        } catch (HibernateException e) {
            transaction.rollback();
            e.printStackTrace();
            kq = false;
        }finally{
            session.close();
        }
        
        return kq;
    }
    
    //public static Chuyenbay getChuyenBayBy
    public static boolean taoListVeCuaChuyenBay(String maCb, List<Integer> listSoLuongVeTheoHang, List<List<String>> listIdVe) {
        boolean res = true;
        List<Hangve> listHangve = HangveDAO.getAll();
        Chuyenbay chuyenbay = ChuyenbayDAO.getChuyenBayByID(maCb);
        Session session = null;
        Transaction transaction = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < listIdVe.get(i).size(); j++) {
                    Vechuyenbay vechuyenbay = new Vechuyenbay(listIdVe.get(i).get(j), chuyenbay, listHangve.get(i), "Chưa được mua");
                    session.save(vechuyenbay);
                }
            }
            transaction.commit();

        } catch (HibernateException e) {
            transaction.rollback();
            res = false;
            e.printStackTrace();
        }
        return res;
    }

//    public List<Vechuyenbay> getListVeTheoHangCB(String maCB, String maHangVe){
//        List<Vechuyenbay> listVeTheoHangCB = null;
//        Session session = null;
//
//        try {
//            session = HibernateUtil.getSessionFactory().openSession();
//            String hql = String.format("from Vechuyenbay vcb where vcb.maCB = '%s' and vcb.maHangVe = '%s'", maCB, maHangVe);
//            Query query = session.createQuery(hql);
//            listVeTheoHangCB = query.list();
//
//        } catch (HibernateException e) {
//            e.printStackTrace();
//        } finally{
//            if (session != null){
//                session.close();
//            }
//        }
//
//        return listVeTheoHangCB;
//    }
    public static int getSoVeDaMuaTheoHangCB(String maCB, String maHangVe) {
        int res = 0;
        Session session = null;

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            String hql = String.format("select count(*) from Vechuyenbay vcb where vcb.chuyenbay.maCb = '%s' and vcb.hangve.maHangVe = '%s' and vcb.tinhTrang != 'Chưa được mua'", maCB, maHangVe);
            Query query = session.createQuery(hql);
            res = ((Long) query.uniqueResult()).intValue();

        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }

        return res;
    }

    public static int getSoVeTheoHangCB(String maCB, String maHangVe) {
        int res = 0;
        Session session = null;

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            String hql = String.format("select count(*) from Vechuyenbay vcb where vcb.chuyenbay.maCb = '%s' and vcb.hangve.maHangVe = '%s'", maCB, maHangVe);
            Query query = session.createQuery(hql);
            res = ((Long) query.uniqueResult()).intValue();

            System.out.println("======================================" + res);

        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }

        return res;
    }

    public static boolean themVeTheoHangChuyenBay(String maCb, List<String> listNewId, String maHangVe) {
        boolean res = true;
        Hangve hangve = HangveDAO.getHangVeById(maHangVe);
        Chuyenbay chuyenbay = ChuyenbayDAO.getChuyenBayByID(maCb);
        Session session = null;
        Transaction transaction = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();

            for (int i = 0; i < listNewId.size(); i++) {
                Vechuyenbay vechuyenbay = new Vechuyenbay(listNewId.get(i), chuyenbay, hangve, "Chưa được mua");
                session.save(vechuyenbay);
            }
            transaction.commit();

        } catch (HibernateException e) {
            transaction.rollback();
            res = false;
            e.printStackTrace();
        }
        return res;
    }

    public static boolean xoaVeTheoHangChuyenBay(String maCb, int soLuongXoa, String maHangVe) {
        boolean res = true;
//        //Hangve hangve = HangveDAO.getHangVeById(maHangVe);
//        Chuyenbay chuyenbay = ChuyenbayDAO.getChuyenBayByID(maCb);
//        Session session = null;
//        Transaction transaction = null;
//        try {
//            session = HibernateUtil.getSessionFactory().openSession();
//            transaction = session.beginTransaction();
//
//            String hql = String.format("DELETE FROM Vechuyenbay vcb"
//                    + " WHERE vcb.maCb = '%s' and vcb.");
//
//            transaction.commit();
//
//        } catch (HibernateException e) {
//            transaction.rollback();
//            res = false;
//            e.printStackTrace();
//        }
        return res;
    }
}
