/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MyFrames;

/**
 *
 * @author GANDALF
 */
public class UserUp {
    
    private int id;
     private String barcode;
    private String pname;
    private int available;
     private int mrp;
     private int retailpack;
    
       private int whole;
     private String expdate;
      private String expdate2;
      private String expdate3;
      private int pack;
        private int discount;
      private String gravity;
    
    public UserUp(int Id,String Barcode,String Pname,int Available,int Mrp,int Retailpack,int Whole,String Expdate,String Expdate2,String Expdate3,int Pack,int Discount,String Gravity)
    {
        this.id = Id;
         this.barcode = Barcode;
        this.pname = Pname;
        this.available = Available;
        
        this.mrp = Mrp;
         this.retailpack = Retailpack;
       
         this.whole = Whole;
        this.expdate = Expdate;
         this.expdate2 = Expdate2;
         this.expdate3 = Expdate3;
          this.pack = Pack;
           this.discount = Discount;
           this.gravity = Gravity;
    }

   /* UserUp(int aInt, String string, String string0, int aInt0, int aInt1, int aInt2, int aInt3, int aInt4, String string1, String string2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    */
    public int getId()
    {
        return id;
    }
     public String getBarcode()
    {
        return barcode;
    }
    
    public String getPname()
    {
        return pname;
    }
    
    public int getAvailable()
    {
        return available;
    }
    
    
     public int getMrp()
    {
        return mrp;
    }
      public int getRetailpack()
    {
        return retailpack;
    }
  
     public int getWhole()
    {
        return whole;
    }
    
     public String getExpdate()
    {
        return expdate;
    }
     
     public String getExpdate2()
    {
        return expdate2;
    }
      public String getExpdate3()
    {
        return expdate3;
    }
       public int getPack()
    {
        return pack;
    }
         public int getDiscount()
    {
        return discount;
    }
         
          public String getGravity()
    {
        return gravity;
    }
}


