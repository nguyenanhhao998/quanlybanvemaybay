package pojos;
// Generated Aug 2, 2020, 11:17:00 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Chuyenbay generated by hbm2java
 */
public class Chuyenbay  implements java.io.Serializable {


     private String maCb;
     private Sanbay sanbayByMaSbden;
     private Sanbay sanbayByMaSbdi;
     private Date ngayKhoiHanh;
     private Float thoiGianBay;
     private String tinhTrang;
     private Set giahangvetheocbs = new HashSet(0);
     private Set vechuyenbays = new HashSet(0);
     private Set sanbaytrunggians = new HashSet(0);
     private Set phieuchos = new HashSet(0);

    public Chuyenbay() {
    }

	
    public Chuyenbay(String maCb, Sanbay sanbayByMaSbden, Sanbay sanbayByMaSbdi) {
        this.maCb = maCb;
        this.sanbayByMaSbden = sanbayByMaSbden;
        this.sanbayByMaSbdi = sanbayByMaSbdi;
    }
    public Chuyenbay(String maCb, Sanbay sanbayByMaSbden, Sanbay sanbayByMaSbdi, Date ngayKhoiHanh, Float thoiGianBay, String tinhTrang, Set giahangvetheocbs, Set vechuyenbays, Set sanbaytrunggians, Set phieuchos) {
       this.maCb = maCb;
       this.sanbayByMaSbden = sanbayByMaSbden;
       this.sanbayByMaSbdi = sanbayByMaSbdi;
       this.ngayKhoiHanh = ngayKhoiHanh;
       this.thoiGianBay = thoiGianBay;
       this.tinhTrang = tinhTrang;
       this.giahangvetheocbs = giahangvetheocbs;
       this.vechuyenbays = vechuyenbays;
       this.sanbaytrunggians = sanbaytrunggians;
       this.phieuchos = phieuchos;
    }
   
    public String getMaCb() {
        return this.maCb;
    }
    
    public void setMaCb(String maCb) {
        this.maCb = maCb;
    }
    public Sanbay getSanbayByMaSbden() {
        return this.sanbayByMaSbden;
    }
    
    public void setSanbayByMaSbden(Sanbay sanbayByMaSbden) {
        this.sanbayByMaSbden = sanbayByMaSbden;
    }
    public Sanbay getSanbayByMaSbdi() {
        return this.sanbayByMaSbdi;
    }
    
    public void setSanbayByMaSbdi(Sanbay sanbayByMaSbdi) {
        this.sanbayByMaSbdi = sanbayByMaSbdi;
    }
    public Date getNgayKhoiHanh() {
        return this.ngayKhoiHanh;
    }
    
    public void setNgayKhoiHanh(Date ngayKhoiHanh) {
        this.ngayKhoiHanh = ngayKhoiHanh;
    }
    public Float getThoiGianBay() {
        return this.thoiGianBay;
    }
    
    public void setThoiGianBay(Float thoiGianBay) {
        this.thoiGianBay = thoiGianBay;
    }
    public String getTinhTrang() {
        return this.tinhTrang;
    }
    
    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
    public Set getGiahangvetheocbs() {
        return this.giahangvetheocbs;
    }
    
    public void setGiahangvetheocbs(Set giahangvetheocbs) {
        this.giahangvetheocbs = giahangvetheocbs;
    }
    public Set getVechuyenbays() {
        return this.vechuyenbays;
    }
    
    public void setVechuyenbays(Set vechuyenbays) {
        this.vechuyenbays = vechuyenbays;
    }
    public Set getSanbaytrunggians() {
        return this.sanbaytrunggians;
    }
    
    public void setSanbaytrunggians(Set sanbaytrunggians) {
        this.sanbaytrunggians = sanbaytrunggians;
    }
    public Set getPhieuchos() {
        return this.phieuchos;
    }
    
    public void setPhieuchos(Set phieuchos) {
        this.phieuchos = phieuchos;
    }




}

