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
public class UserCheck {
    
  
    private String pname;
   
    private int mrp;
     
    
    
    public UserCheck(String Pname,int Mrp)
    {
       
        this.pname = Pname;
       
        this.mrp = Mrp;
        
    }
   
    
    public String getPname()
    {
        return pname;
    }
    
   
    
    public int getMrp()
    {
        return mrp;
    }
   
}


