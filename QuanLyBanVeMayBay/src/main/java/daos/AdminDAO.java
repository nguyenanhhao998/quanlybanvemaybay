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
import pojos.Admin;
import util.HibernateUtil;

/**
 *
 * @author HAO
 */
public class AdminDAO {
    public static boolean checkAdmin(int id){
        boolean res = true;
        Admin ad = null;
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();

            String hql = String.format("from Admin where idNhanVien = %d",id);
            Query query = session.createQuery(hql);
            ad = (Admin)query.getSingleResult();
            
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
