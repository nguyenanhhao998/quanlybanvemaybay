/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import static daos.KhachnuocngoaiDAO.getIDKH;
import java.util.List;
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojos.Phieudatcho;
import util.HibernateUtil;

/**
 *
 * @author HAO
 */
public class PhieudatchoDAO {
    public static int insert(Phieudatcho phieudc) {
        int id = 0;
        Session session = null;
        Transaction transaction = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();

            id = (Integer)session.save(phieudc);

            transaction.commit();

        } catch (HibernateException e) {
            transaction.rollback();
            e.printStackTrace();
        }finally{
            session.close();
        }
        
        return id;
    }
    
    public static List<Phieudatcho> getListPhieudatchoByMaKH(int idKH){
        List<Phieudatcho> listPhieu = null;
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();

            String sql = String.format("from Phieudatcho where maKH = %d",idKH);
            Query query = session.createQuery(sql);
            listPhieu = query.list();

            for(int i = 0; i < listPhieu.size(); i++){
                Hibernate.initialize(listPhieu.get(i).getVechuyenbay());
            } 
        } catch (HibernateException ex) {
            ex.printStackTrace();
        }finally{
            session.close();
        }
        return listPhieu;
    }
    
    public static void delete(Phieudatcho phieudc){
        Session session = null;
        Transaction transaction = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();

            session.delete(phieudc);

            transaction.commit();
            
        } catch (HibernateException e) {
            transaction.rollback();
            e.printStackTrace();
        }finally{
            session.close();
        }
    }
}
