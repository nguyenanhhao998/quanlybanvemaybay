package pojos;
// Generated Aug 2, 2020, 11:17:00 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Nhanvien generated by hbm2java
 */
public class Nhanvien  implements java.io.Serializable {


     private Integer idNhanVien;
     private String hoTen;
     private String gioiTinh;
     private Date ngaySinh;
     private String sdt;
     private String cmnd;
     private Nvbanve nvbanve;
     private Taikhoan taikhoan;
     private Admin admin;

    public Nhanvien() {
    }

	
    public Nhanvien(String hoTen) {
        this.hoTen = hoTen;
    }
    public Nhanvien(String hoTen, String gioiTinh, Date ngaySinh, String sdt, String cmnd, Nvbanve nvbanve, Taikhoan taikhoan, Admin admin) {
       this.hoTen = hoTen;
       this.gioiTinh = gioiTinh;
       this.ngaySinh = ngaySinh;
       this.sdt = sdt;
       this.cmnd = cmnd;
       this.nvbanve = nvbanve;
       this.taikhoan = taikhoan;
       this.admin = admin;
    }
   
    public Integer getIdNhanVien() {
        return this.idNhanVien;
    }
    
    public void setIdNhanVien(Integer idNhanVien) {
        this.idNhanVien = idNhanVien;
    }
    public String getHoTen() {
        return this.hoTen;
    }
    
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
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
    public String getSdt() {
        return this.sdt;
    }
    
    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
    public String getCmnd() {
        return this.cmnd;
    }
    
    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }
    public Nvbanve getNvbanve() {
        return this.nvbanve;
    }
    
    public void setNvbanve(Nvbanve nvbanve) {
        this.nvbanve = nvbanve;
    }
    public Taikhoan getTaikhoan() {
        return this.taikhoan;
    }
    
    public void setTaikhoan(Taikhoan taikhoan) {
        this.taikhoan = taikhoan;
    }
    public Admin getAdmin() {
        return this.admin;
    }
    
    public void setAdmin(Admin admin) {
        this.admin = admin;
    }




}

