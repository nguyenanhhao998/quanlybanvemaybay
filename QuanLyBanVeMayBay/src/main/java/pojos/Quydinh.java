package pojos;
// Generated Aug 2, 2020, 12:12:11 AM by Hibernate Tools 4.3.1



/**
 * Quydinh generated by hbm2java
 */
public class Quydinh  implements java.io.Serializable {


     private int idQuyDinh;
     private String tenQuyDinh;
     private String kieu;
     private String giaTri;
     private String tinhTrang;

    public Quydinh() {
    }

	
    public Quydinh(int idQuyDinh) {
        this.idQuyDinh = idQuyDinh;
    }
    public Quydinh(int idQuyDinh, String tenQuyDinh, String kieu, String giaTri, String tinhTrang) {
       this.idQuyDinh = idQuyDinh;
       this.tenQuyDinh = tenQuyDinh;
       this.kieu = kieu;
       this.giaTri = giaTri;
       this.tinhTrang = tinhTrang;
    }
   
    public int getIdQuyDinh() {
        return this.idQuyDinh;
    }
    
    public void setIdQuyDinh(int idQuyDinh) {
        this.idQuyDinh = idQuyDinh;
    }
    public String getTenQuyDinh() {
        return this.tenQuyDinh;
    }
    
    public void setTenQuyDinh(String tenQuyDinh) {
        this.tenQuyDinh = tenQuyDinh;
    }
    public String getKieu() {
        return this.kieu;
    }
    
    public void setKieu(String kieu) {
        this.kieu = kieu;
    }
    public String getGiaTri() {
        return this.giaTri;
    }
    
    public void setGiaTri(String giaTri) {
        this.giaTri = giaTri;
    }
    public String getTinhTrang() {
        return this.tinhTrang;
    }
    
    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }




}


