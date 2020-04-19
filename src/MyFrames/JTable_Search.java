/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyFrames;

import java.awt.event.ActionEvent;
import java.awt.print.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.text.*;
import java.text.SimpleDateFormat;

import java.util.*;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
/*import sun.audio.AudioData;
import sun.audio.AudioDataStream;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

*/
/**
 *
 * @author SAMEER
 */
public class JTable_Search extends javax.swing.JInternalFrame {

    
    
    /**
     * Creates new form CreateBill
     */
    public JTable_Search() {
        initComponents();
       // pname.requestFocusInWindow();
           // call findUsers function
        findUsers();
     this.setLocation(30, 10);
      //   getsum();
      
        
    }


   

    
    
   
    
    
    
    
    
        
    @Override
    public void doDefaultCloseAction() {
       
               
 
      dispose(); 
            
   
    }
    
    
    
      public class FunctionBar{
            Connection con = null;
            ResultSet rs = null;
            PreparedStatement ps = null;
            public ResultSet find(String s){
                try{
                    con = DriverManager.getConnection("jdbc:mysql://localhost/qb", "root", "password");
                    ps = con.prepareStatement("select * from stock where barcode = ?");
                    ps.setString(1,s);
                    rs = ps.executeQuery();
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
                return rs;
            }
       
   }
  
   
  
 
    
      
    // function to connect to mysql database
    public Connection getConnection()
    {
        Connection con = null;
        
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost/qb", "root", "password");
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
        return con;
    }
    
 // function to return users arraylist with particular data 
    public ArrayList<User> ListUsers(String ValToSearch)
    {
        ArrayList<User> usersList = new ArrayList<User>();
        
        Statement st;
        ResultSet rs;
        
        try{
            Connection con = getConnection();
            st = con.createStatement();
            String searchQuery = "SELECT * FROM `stock` WHERE CONCAT(`id`,`barcode`, `pname`, `available`, `mrp`,`whole`) LIKE '%"+ValToSearch+"%'";
            rs = st.executeQuery(searchQuery);
            
            User user;
            
            while(rs.next())
            {
                user = new User(
                                 rs.getInt("id"),
                               //  rs.getString("barcode"),
                                 rs.getString("pname"),
                                 rs.getInt("available"),
                                 rs.getInt("mrp"),
                                
                                rs.getInt("whole")
                             
                                );
                usersList.add(user);
            }
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
        return usersList;
    }
    
    
     public void findUsersBar()
    {
       
        ArrayList<User> users = ListUsers(barcode.getText());
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"ID","Pname","Available","Retail","Wholesale"});
        Object[] row = new Object[5];
        
        for(int i = 0; i < users.size(); i++)
        {
            row[0] = users.get(i).getId();
           // row[1] = users.get(i).getBarcode();
            row[1] = users.get(i).getPname();
            row[2] = users.get(i).getAvailable();
            row[3] = users.get(i).getMrp();
             
              row[4] = users.get(i).getWhole();
              
            model.addRow(row);
        }
       jTable_Users.setModel(model);
       
         TableColumnModel columnModel = jTable_Users.getColumnModel();
		
               
                 columnModel.getColumn(0).setPreferredWidth(20);
               // columnModel.getColumn(1).setPreferredWidth(30);
                  columnModel.getColumn(1).setPreferredWidth(760);
                columnModel.getColumn(2).setPreferredWidth(40);
                  columnModel.getColumn(3).setPreferredWidth(40);
                   columnModel.getColumn(4).setPreferredWidth(40);
                 
       
    }
    
    
    
    
    // function to display data in jtable
    public void findUsers()
    {
        ArrayList<User> users = ListUsers(pname.getText());
        DefaultTableModel model = new DefaultTableModel();
       model.setColumnIdentifiers(new Object[]{"ID","Pname","Available","Retail","Wholesale"});
        Object[] row = new Object[5];
        
        for(int i = 0; i < users.size(); i++)
        {
            row[0] = users.get(i).getId();
           // row[1] = users.get(i).getBarcode();
            row[1] = users.get(i).getPname();
            row[2] = users.get(i).getAvailable();
            row[3] = users.get(i).getMrp();
             
              row[4] = users.get(i).getWhole();
              
            model.addRow(row);
        }
       jTable_Users.setModel(model);
       
         TableColumnModel columnModel = jTable_Users.getColumnModel();
		
               
                 columnModel.getColumn(0).setPreferredWidth(20);
               // columnModel.getColumn(1).setPreferredWidth(30);
                  columnModel.getColumn(1).setPreferredWidth(760);
                columnModel.getColumn(2).setPreferredWidth(40);
                  columnModel.getColumn(3).setPreferredWidth(40);
                   columnModel.getColumn(4).setPreferredWidth(40);
                 
       
    }
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pname = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Users = new javax.swing.JTable();
        barcode = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 177));
        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMaximizable(true);
        setResizable(true);
        setTitle("Search Product");

        jPanel1.setBackground(new java.awt.Color(255, 255, 177));

        pname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pnameActionPerformed(evt);
            }
        });
        pname.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                pnameCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        pname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pnameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pnameKeyTyped(evt);
            }
        });

        jTable_Users.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jTable_Users.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable_Users);

        barcode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                barcodeKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                barcodeKeyTyped(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel12.setText("Barcode:");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel4.setText("Product Name:");

        jLabel5.setFont(new java.awt.Font("Meiryo UI", 1, 24)); // NOI18N
        jLabel5.setText("SEARCH PRODUCT");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(22, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1256, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(barcode, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pname, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(524, 524, 524))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(barcode, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pnameKeyReleased
       findUsers();
       
      
    }//GEN-LAST:event_pnameKeyReleased

    private void barcodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_barcodeKeyReleased
        
       FunctionBar f = new FunctionBar();
    ResultSet rs = null;
   
     String ba = "barcode";
    String pn = "pname";
  
    
    
    
    rs = f.find(barcode.getText());
    try{
      if(rs.next()){
             
         
         //  pname.setText(rs.getString("pname"));
           
            barcode.setText(rs.getString("barcode"));
           // findUsers();
           
               if ( barcode.getText().isEmpty()){ 
                   findUsersBar();
               }
               else{
                   findUsersBar(); 
               }
           
           
       
      } 
      else{
          
            findUsersBar(); 
         // JOptionPane.showMessageDialog(null, "NO MATCH FOUND");
         
            // barcode.setText("");
    // pname.setText("");
    //qty.setText("");
 
      }
    }catch(Exception ex){
           JOptionPane.showMessageDialog(null, ex.getMessage());
            }
    }//GEN-LAST:event_barcodeKeyReleased

    private void barcodeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_barcodeKeyTyped
//       Beep();
     
		
    }//GEN-LAST:event_barcodeKeyTyped

    private void pnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pnameKeyTyped
       
    }//GEN-LAST:event_pnameKeyTyped

    private void pnameCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_pnameCaretPositionChanged
         
    }//GEN-LAST:event_pnameCaretPositionChanged

    private void pnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pnameActionPerformed
        
    }//GEN-LAST:event_pnameActionPerformed
    
  
 
          
     
      
         
  

        
    
   /* private void Fillcombo()
    {
        String sql;
        sql = "SELECT * FROM `stock`";
    Connection con;
   PreparedStatement ps;
   ResultSet rs;
        try
        {
          con=DriverManager.getConnection("jdbc:mysql://localhost/qb", "root", "password");
            ps=con.prepareStatement(sql);  
            rs=ps.executeQuery();
            while(rs.next())
            {
                String id=rs.getString("id");
                pid1.addItem(id);
            }
        }
        catch(Exception e)
        {
        JOptionPane.showMessageDialog(null,e);    
        }
        
    }
    */
    
   /* 
    */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField barcode;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Users;
    private javax.swing.JTextField pname;
    // End of variables declaration//GEN-END:variables
}