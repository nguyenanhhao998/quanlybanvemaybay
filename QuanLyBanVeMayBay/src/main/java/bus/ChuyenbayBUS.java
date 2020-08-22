/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;

import daos.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import pojos.Chuyenbay;
import pojos.Giahangvetheocb;
import pojos.Phieucho;
import pojos.Vechuyenbay;
import util.HibernateUtil;

/**
 *
 * @author HAO
 */
public class ChuyenbayBUS {/*
    public static List<Chuyenbay> findFlights(String masbdi, String masbden,int SL, String MaHangGhe, Date date) {
        List<Chuyenbay> ds = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String ngay = df.format(date);
        
        String tinhtrangcb = "Chưa khởi hành";
        String tinhtrangve = "Chưa được mua";
        try {
            String hql = String.format("SELECT cb FROM Chuyenbay cb "                 
                    + "left join cb.giahangvetheocbs as gia "
                    + "left join cb.vechuyenbays as ve "
                    + "left join cb.sanbaytrunggians as sbtg "
                    + "WHERE gia.id.maHangVe = '%s' and ve.hangve = '%s' "
          //          + "WHERE gia.id.maHangVe = '%s' and ve.hangve = '%s' and ve.tinhTrang = '%s' "
                    + "and MaSBDi = '%s' and MaSBDen = '%s' and Date(NgayKhoiHanh) = '%s' "
                    + "and cb.tinhTrang = '%s' "
                    + "GROUP BY cb.maCb "
//                    + "HAVING COUNT(cb.maCb) >= %d"
                    + "ORDER BY NgayKhoiHanh asc",MaHangGhe,MaHangGhe,masbdi,masbden, ngay, tinhtrangcb);
            Query query = session.createQuery(hql).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
            ds = query.list();
            
            for(int i = 0; i < ds.size(); i++){
                Hibernate.initialize(ds.get(i).getSanbayByMaSbdi());
                Hibernate.initialize(ds.get(i).getSanbayByMaSbden());
            }          
        } catch (HibernateException ex) {
            //Log the exception
            System.err.println(ex);
        } finally {
            session.close();
        }
        
        return ds;
    }*/
}
