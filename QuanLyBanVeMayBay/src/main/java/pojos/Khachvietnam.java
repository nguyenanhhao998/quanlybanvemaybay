package pojos;
// Generated Aug 2, 2020, 11:17:00 PM by Hibernate Tools 4.3.1



/**
 * Khachvietnam generated by hbm2java
 */
public class Khachvietnam  implements java.io.Serializable {


     private int maKh;
     private Khachhang khachhang;
     private String cmnd;
     private String ngheNghiep;
     private String diaChi;

    public Khachvietnam() {
    }

	
    public Khachvietnam(Khachhang khachhang) {
        this.khachhang = khachhang;
    }
    public Khachvietnam(Khachhang khachhang, String cmnd, String ngheNghiep, String diaChi) {
       this.khachhang = khachhang;
       this.cmnd = cmnd;
       this.ngheNghiep = ngheNghiep;
       this.diaChi = diaChi;
    }
   
    public int getMaKh() {
        return this.maKh;
    }
    
    public void setMaKh(int maKh) {
        this.maKh = maKh;
    }
    public Khachhang getKhachhang() {
        return this.khachhang;
    }
    
    public void setKhachhang(Khachhang khachhang) {
        this.khachhang = khachhang;
    }
    public String getCmnd() {
        return this.cmnd;
    }
    
    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }
    public String getNgheNghiep() {
        return this.ngheNghiep;
    }
    
    public void setNgheNghiep(String ngheNghiep) {
        this.ngheNghiep = ngheNghiep;
    }
    public String getDiaChi() {
        return this.diaChi;
    }
    
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }




}


