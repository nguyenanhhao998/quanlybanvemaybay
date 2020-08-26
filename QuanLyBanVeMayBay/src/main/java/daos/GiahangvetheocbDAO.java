/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import javax.persistence.NoResultException;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import pojos.Giahangvetheocb;
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
}
