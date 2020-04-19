/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyFrames;

/**
 *
 * @author SAMEER
 */
public class BillSearchm {
 
    

    private int bno;

    private int amt;
    private String pdate;
   
    
    public BillSearchm(int bno,int amt, String pdate)
    {
        this.bno=bno;
       
        this.amt=amt;
        this.pdate=pdate;
       
        
        
    }
            
    public int getbno()
    {
        return bno;
    }

    public int getamt()
    {
        return amt;
    }
    public String pdate()
    {
        return pdate;
    }
   
  }


