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
public class Dailym {
    
    private int ai;
    private String bill_id;
    private String type;
    private String pid;
    private String qty;
    private String pname;
    private String date;
    private String amt;
    private String price;
    
    
    public Dailym(int Ai, String BI,String Type,String Pid,String Qty, String Pname,String Date,String Amt,String Price)
    {
        this.ai = Ai;
        this.bill_id = BI;
        this.type = Type;
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
    
    
    public String getBI()
    {
        return bill_id;
    }
    
    public String getType()
    {
        return type;
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


