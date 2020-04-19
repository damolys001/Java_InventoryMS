package MyFrames;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SAMEER
 */
public class Cash {

    private int id;
    private String name;
   
   
    private String password;
     private String pdate;
    
    public Cash(int id,String name, String password, String pdate)
    {
        this.id=id;
        this.name=name;
       
       
        this.password=password;
         this.pdate=pdate;
        
    }
            
    public int getid()
    {
        return id;
    }
    public String getname()
    {
        return name;
    }

   
    public String getpassword()
    {
        return password;
    }
        public String getpdate()
    {
        return pdate;
    }
}
