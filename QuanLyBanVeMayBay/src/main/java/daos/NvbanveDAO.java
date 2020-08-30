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
import org.hibernate.Transaction;
import pojos.Nvbanve;
import util.HibernateUtil;

/**
 *
 * @author HAO
 */
public class NvbanveDAO {
    public static boolean checkNvbanve(int id){
        boolean res = true;
        Nvbanve nv = null;
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();

            String hql = String.format("from Nvbanve where idNhanVien = %d",id);
            Query query = session.createQuery(hql);
            nv = (Nvbanve)query.getSingleResult();
            
        } catch (HibernateException ex) {
            ex.printStackTrace();
        } catch (NoResultException ex){
            res = false;
        }finally{
            session.close();
        }
        return res;
    }
    
    public static Nvbanve getNVbyID(int id){
        Nvbanve nv = null;
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();

            String hql = String.format("from Nvbanve where idNhanVien = %d",id);
            Query query = session.createQuery(hql);
            nv = (Nvbanve)query.getSingleResult();
            
        } catch (HibernateException ex) {
            ex.printStackTrace();
        } catch (NoResultException ex){
            nv = null;
        }finally{
            session.close();
        }
        return nv;
    }
}
