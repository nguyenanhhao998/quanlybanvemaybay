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
}
