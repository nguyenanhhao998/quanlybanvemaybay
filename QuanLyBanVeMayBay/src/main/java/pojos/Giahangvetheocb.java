package pojos;
// Generated Aug 2, 2020, 10:12:15 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Giahangvetheocb generated by hbm2java
 */
public class Giahangvetheocb  implements java.io.Serializable {


     private GiahangvetheocbId id;
     private Chuyenbay chuyenbay;
     private Hangve hangve;
     private double giaHienTai;
     private Set lichsugiahangvecbs = new HashSet(0);

    public Giahangvetheocb() {
    }

	
    public Giahangvetheocb(GiahangvetheocbId id, Chuyenbay chuyenbay, Hangve hangve, double giaHienTai) {
        this.id = id;
        this.chuyenbay = chuyenbay;
        this.hangve = hangve;
        this.giaHienTai = giaHienTai;
    }
    public Giahangvetheocb(GiahangvetheocbId id, Chuyenbay chuyenbay, Hangve hangve, double giaHienTai, Set lichsugiahangvecbs) {
       this.id = id;
       this.chuyenbay = chuyenbay;
       this.hangve = hangve;
       this.giaHienTai = giaHienTai;
       this.lichsugiahangvecbs = lichsugiahangvecbs;
    }
   
    public GiahangvetheocbId getId() {
        return this.id;
    }
    
    public void setId(GiahangvetheocbId id) {
        this.id = id;
    }
    public Chuyenbay getChuyenbay() {
        return this.chuyenbay;
    }
    
    public void setChuyenbay(Chuyenbay chuyenbay) {
        this.chuyenbay = chuyenbay;
    }
    public Hangve getHangve() {
        return this.hangve;
    }
    
    public void setHangve(Hangve hangve) {
        this.hangve = hangve;
    }
    public double getGiaHienTai() {
        return this.giaHienTai;
    }
    
    public void setGiaHienTai(double giaHienTai) {
        this.giaHienTai = giaHienTai;
    }
    public Set getLichsugiahangvecbs() {
        return this.lichsugiahangvecbs;
    }
    
    public void setLichsugiahangvecbs(Set lichsugiahangvecbs) {
        this.lichsugiahangvecbs = lichsugiahangvecbs;
    }




}


