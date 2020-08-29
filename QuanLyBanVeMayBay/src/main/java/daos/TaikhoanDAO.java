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
import pojos.Taikhoan;
import util.HibernateUtil;

/**
 *
 * @author HAO
 */
public class TaikhoanDAO {
    public static int checkAccount(String name, String pass){
        int id = 0;
        Taikhoan tk = null;
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();

            String hql = String.format("from Taikhoan where tenTaiKhoan = '%s' and matKhau = '%s'",name,pass);
            Query query = session.createQuery(hql);
            tk = (Taikhoan)query.getSingleResult();
            
        } catch (HibernateException ex) {
            ex.printStackTrace();
        } catch (NoResultException ex){
            System.err.println(ex);
        }finally{
            session.close();
        }
        if(tk != null)
            id = tk.getIdNhanVien();
        return id;
    }
}
