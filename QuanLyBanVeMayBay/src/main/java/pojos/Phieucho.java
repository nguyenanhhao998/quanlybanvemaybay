package pojos;
// Generated Aug 2, 2020, 11:17:00 PM by Hibernate Tools 4.3.1



/**
 * Phieucho generated by hbm2java
 */
public class Phieucho  implements java.io.Serializable {


     private int idPhieu;
     private Chuyenbay chuyenbay;
     private Phieu phieu;

    public Phieucho() {
    }

    public Phieucho(Chuyenbay chuyenbay, Phieu phieu) {
       this.chuyenbay = chuyenbay;
       this.phieu = phieu;
    }
   
    public int getIdPhieu() {
        return this.idPhieu;
    }
    
    public void setIdPhieu(int idPhieu) {
        this.idPhieu = idPhieu;
    }
    public Chuyenbay getChuyenbay() {
        return this.chuyenbay;
    }
    
    public void setChuyenbay(Chuyenbay chuyenbay) {
        this.chuyenbay = chuyenbay;
    }
    public Phieu getPhieu() {
        return this.phieu;
    }
    
    public void setPhieu(Phieu phieu) {
        this.phieu = phieu;
    }




}

