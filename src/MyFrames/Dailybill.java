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
public class Dailybill {
    
     private int ai;
    private String bill_id;
     private String cash;
    private String cuname;
    private String pid;
    private String qty;
    private String pname;
    private String date;
    private String amt;
    private String price;
    
    
    public Dailybill(int Ai, String Cash, String BI,String Cuname,String Pid,String Qty, String Pname,String Date,String Amt,String Price)
    {
        this.ai = Ai;
         this.cash = Cash;
        this.bill_id = BI;
        this.cuname = Cuname;
        this.pid = Pid;
        this.qty = Qty;
        this.pname = Pname;
        this.date = Date;
        this.amt = Amt;
        this.price = Price;
    }
    
 
    
       public int getAi()
    {
        return ai;
    }
    
       public String getCash()
    {
        return cash;
    }
    
    public String getBI()
    {
        return bill_id;
    }
    
    public String getCuname()
    {
        return cuname;
    }
    
    public String getPid()
    {
        return pid;
    }
    
    public String getQty()
    {
        return qty;
    }
    
      public String getPname()
    {
        return pname;
    }
    
    public String getDate()
    {
        return date;
    }
    
    public String getAmt()
    {
        return amt;
    }
    
    public String getPrice()
    {
        return price;
    }
}


