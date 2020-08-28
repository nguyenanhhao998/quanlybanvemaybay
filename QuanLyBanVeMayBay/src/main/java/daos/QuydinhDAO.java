/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import javax.persistence.NoResultException;
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import pojos.Hoadonmuave;
import pojos.Quydinh;
import util.HibernateUtil;

/**
 *
 * @author HAO
 */
public class QuydinhDAO {
    public static Quydinh getQuydinh(int id){
        Quydinh qd = null;
        
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();

            String hql = String.format("from Quydinh where idQuyDinh = %d and tinhTrang = '%s'",id,"Còn hiệu lực");
            Query query = session.createQuery(hql);
            qd = (Quydinh)query.getSingleResult();

        } catch (HibernateException ex) {
            ex.printStackTrace();
        } catch (NoResultException ex){
            ex.printStackTrace();
            return null;
        }finally{
            session.close();
        }
        
        return qd;
    }
}
