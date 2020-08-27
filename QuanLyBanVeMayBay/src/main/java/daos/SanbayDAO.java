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
import pojos.Sanbay;
import util.HibernateUtil;

/**
 *
 * @author HAO
 */
public class SanbayDAO {
    public static List<Sanbay> getAll(){
        List<Sanbay> listsb = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            String hql = "select sb from Sanbay sb";
            Query query = session.createQuery(hql);
            listsb = query.list();
        } catch (HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        } 
        return listsb;
    }
    
    public static String getAirportNameById(String masb){
        List<Sanbay> listsb = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            String hql = String.format("select sb from Sanbay sb where maSb = '%s'",masb);
            Query query = session.createQuery(hql);
            listsb = query.list();
        } catch (HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }
        if(listsb.isEmpty())
            return "";
        return listsb.get(0).getThanhPho();
    }

    public static List<String> getListQuocGias() {
        List<String> listQG = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            String hql = String.format("select distinct sb.quocGia from Sanbay sb");
            Query query = session.createQuery(hql);
            listQG = query.list();
        } catch (HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }

        return listQG;
    }

    public static List<Sanbay> getListSanbaysByQuocGia(String quocGia) {
        List<Sanbay> listsb = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            String hql = String.format("select sb from Sanbay sb where sb.quocGia = '%s'", quocGia);
            Query query = session.createQuery(hql);
            listsb = query.list();
        } catch (HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }
        return listsb;
    }

    public static Sanbay getSanbayById(String id) {
        Sanbay sanbay = null;
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            String hql = String.format("from Sanbay sb where sb.maSb = '%s'", id);
            Query query = session.createQuery(hql);
            sanbay = (Sanbay) query.uniqueResult();
        } catch (HibernateException ex) {
            ex.printStackTrace();
        } finally {
            session.close();
        }

        return sanbay;
    }
}
