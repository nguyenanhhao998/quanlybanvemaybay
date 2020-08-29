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
import pojos.Nhanvien;
import util.HibernateUtil;

/**
 *
 * @author HAO
 */
public class NhanvienDAO {

    public static final int SEARCH_BY_NAME = 0;
    public static final int SEARCH_BY_USERNAME = 1;
    public static final int SEARCH_BY_PHONE = 2;
    public static final int SEARCH_BY_CMND = 3;

    public static List<Nhanvien> getListNhanVien() {

        List<Nhanvien> listNhanviens = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            String hql = "from Nhanvien";
            Query query = session.createQuery(hql);
            listNhanviens = query.list();

        } catch (HibernateException e) {
            e.printStackTrace();
        }

        return listNhanviens;
    }

    public static List<Nhanvien> getListNhanVien(int searchCriteria, String keyWord) {
        List<Nhanvien> listNhanviens = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            String criteria = "nv.hoTen";

            switch (searchCriteria) {
                case SEARCH_BY_NAME:
                    criteria = "nv.hoTen";
                    break;
                case SEARCH_BY_USERNAME:
                    criteria = "nv.taikhoan.tenTaiKhoan";
                    break;
                case SEARCH_BY_PHONE:
                    criteria = "nv.sdt";
                    break;
                case SEARCH_BY_CMND:
                    criteria = "nv.cmnd";
                    break;
            }

            String hql = String.format("select nv from Nhanvien nv where %s LIKE '%%%s%%'", criteria, keyWord);
            System.out.println(hql);
            Query query = session.createQuery(hql);
            listNhanviens = query.list();
            System.out.println("DAo size ========================= " + listNhanviens.size());

        } catch (HibernateException e) {
            e.printStackTrace();
        }

        return listNhanviens;

    }
}
