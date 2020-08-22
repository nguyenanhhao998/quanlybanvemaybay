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
import pojos.Phieucho;
import util.HibernateUtil;

/**
 *
 * @author HAO
 */
public class PhieuchoDAO {

    public static List<Phieucho> getListPhieuCho() {
        List<Phieucho> listPhieucho = null;
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();

            String sql = "from Phieucho";
            Query query = session.createQuery(sql);
            listPhieucho = query.list();

        } catch (HibernateException ex) {
            ex.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }

        return listPhieucho;
    }
}
