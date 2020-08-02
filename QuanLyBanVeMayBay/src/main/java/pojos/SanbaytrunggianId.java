package pojos;
// Generated Aug 2, 2020, 11:17:00 PM by Hibernate Tools 4.3.1



/**
 * SanbaytrunggianId generated by hbm2java
 */
public class SanbaytrunggianId  implements java.io.Serializable {


     private String maCb;
     private int maSb;

    public SanbaytrunggianId() {
    }

    public SanbaytrunggianId(String maCb, int maSb) {
       this.maCb = maCb;
       this.maSb = maSb;
    }
   
    public String getMaCb() {
        return this.maCb;
    }
    
    public void setMaCb(String maCb) {
        this.maCb = maCb;
    }
    public int getMaSb() {
        return this.maSb;
    }
    
    public void setMaSb(int maSb) {
        this.maSb = maSb;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof SanbaytrunggianId) ) return false;
		 SanbaytrunggianId castOther = ( SanbaytrunggianId ) other; 
         
		 return ( (this.getMaCb()==castOther.getMaCb()) || ( this.getMaCb()!=null && castOther.getMaCb()!=null && this.getMaCb().equals(castOther.getMaCb()) ) )
 && (this.getMaSb()==castOther.getMaSb());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getMaCb() == null ? 0 : this.getMaCb().hashCode() );
         result = 37 * result + this.getMaSb();
         return result;
   }   


}

