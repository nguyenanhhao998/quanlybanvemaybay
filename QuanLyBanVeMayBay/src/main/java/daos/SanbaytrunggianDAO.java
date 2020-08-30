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
import org.hibernate.Transaction;
import pojos.Sanbaytrunggian;
import util.HibernateUtil;

/**
 *
 * @author HAO
 */
public class SanbaytrunggianDAO {

    public static boolean themSanbayTrungGian(String maCb, List<String> listMaSBTG, List<Double> listThoiGianDung) {
        boolean res = true;
        Session session = null;
        Transaction transaction = null;

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();

            for (int i = 0; i < listMaSBTG.size(); i++) {
                Sanbaytrunggian sanbaytrunggian = new Sanbaytrunggian(
                        ChuyenbayDAO.getChuyenBayByID(maCb),
                        SanbayDAO.getSanbayById(listMaSBTG.get(i)),
                        listThoiGianDung.get(i).floatValue());
                session.save(sanbaytrunggian);
            }

            transaction.commit();

        } catch (HibernateException e) {
            transaction.rollback();
            res = false;
            e.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return res;
    }

    public static boolean xoaSanbayTrungGian(String maCb) {
        boolean res = true;
        Session session = null;
        Transaction transaction = null;

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();

            String hql = String.format("DELETE FROM Sanbaytrunggian sbtg WHERE sbtg.id.maCb = '%s'", maCb);
            Query query = session.createQuery(hql);

            query.executeUpdate();

            transaction.commit();

        } catch (HibernateException e) {
            transaction.rollback();
            res = false;
            e.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }

        return res;
    }

}
