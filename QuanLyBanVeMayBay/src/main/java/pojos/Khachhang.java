package pojos;
// Generated Aug 2, 2020, 11:17:00 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Khachhang generated by hbm2java
 */
public abstract class Khachhang implements java.io.Serializable {


    protected Integer maKh;
    protected String hoTen;
    protected String sdt;
    protected String gioiTinh;
    protected Date ngaySinh;
    protected Set phieus = new HashSet(0);
    protected Set hoadonmuaves = new HashSet(0);

    public Khachhang() {
    }

    public Khachhang(String hoTen, String sdt, String gioiTinh, Date ngaySinh, Set phieus, Set hoadonmuaves) {
        this.hoTen = hoTen;
        this.sdt = sdt;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.phieus = phieus;
        this.hoadonmuaves = hoadonmuaves;
    }
   
    public Integer getMaKh() {
        return this.maKh;
    }
    
    public void setMaKh(Integer maKh) {
        this.maKh = maKh;
    }
    public String getHoTen() {
        return this.hoTen;
    }
    
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public String getSdt() {
        return this.sdt;
    }
    
    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
    public String getGioiTinh() {
        return this.gioiTinh;
    }
    
    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    public Date getNgaySinh() {
        return this.ngaySinh;
    }
    
    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public Set getPhieus() {
        return this.phieus;
    }
    
    public void setPhieus(Set phieus) {
        this.phieus = phieus;
    }
    public Set getHoadonmuaves() {
        return this.hoadonmuaves;
    }
    
    public void setHoadonmuaves(Set hoadonmuaves) {
        this.hoadonmuaves = hoadonmuaves;
    }




}


