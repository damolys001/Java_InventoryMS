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
public class Upass {

    private int id;
    private String name;
   
    private String password;
    
    public Upass(int id,String name, String password)
    {
        this.id=id;
        this.name=name;
     
        this.password=password;
        
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
}
