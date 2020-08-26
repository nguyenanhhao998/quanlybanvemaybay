package pojos;
// Generated Aug 2, 2020, 11:17:00 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Chuyenbay generated by hbm2java
 */
public class Chuyenbay  implements java.io.Serializable {


     private String maCb;
    private Sanbay sanbayden;
    private Sanbay sanbaydi;
     private Date ngayKhoiHanh;
     private Float thoiGianBay;
     private String tinhTrang;
     private Set giahangvetheocbs = new HashSet(0);
     private Set vechuyenbays = new HashSet(0);
     private Set sanbaytrunggians = new HashSet(0);
     private Set phieuchos = new HashSet(0);

    public Chuyenbay() {
    }

	
    public Chuyenbay(String maCb, Sanbay sanbayden, Sanbay sanbaydi) {
        this.maCb = maCb;
        this.sanbayden = sanbayden;
        this.sanbaydi = sanbaydi;
    }
    public Chuyenbay(String maCb, Sanbay sanbayden, Sanbay sanbaydi, Date ngayKhoiHanh, Float thoiGianBay, String tinhTrang, Set giahangvetheocbs, Set vechuyenbays, Set sanbaytrunggians, Set phieuchos) {
       this.maCb = maCb;
        this.sanbayden = sanbayden;
        this.sanbaydi = sanbaydi;
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
    public Sanbay getSanbayden() {
        return this.sanbayden;
    }
    
    public void setSanbayden(Sanbay sanbayByMaSbden) {
        this.sanbayden = sanbayByMaSbden;
    }
    public Sanbay getSanbaydi() {
        return this.sanbaydi;
    }
    
    public void setSanbaydi(Sanbay sanbayByMaSbdi) {
        this.sanbaydi = sanbayByMaSbdi;
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

    public int laySoGheTrongTheoHangVe(String mahv){
        int res = 0;
        Iterator<Vechuyenbay> ves = this.getVechuyenbays().iterator();
        
        while(ves.hasNext()){
            Vechuyenbay ve = ves.next();
            if(ve.getHangve().getMaHangVe().equals(mahv) && ve.getTinhTrang().equals("Chưa được mua")){
                res++;
            }
        }
        
        return res;
    }
    
    public int laySoGheTrong(){
        int res = 0;
        Iterator<Vechuyenbay> ves = this.getVechuyenbays().iterator();
        
        while(ves.hasNext()){
            Vechuyenbay ve = ves.next();
            if(ve.getTinhTrang().equals("Chưa được mua")){
                res++;
            }
        }
        
        return res;
    }
}
