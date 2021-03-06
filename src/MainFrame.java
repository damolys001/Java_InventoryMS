


import MyFrames.UpdatePass;
import MyFrames.UpdateStock;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author SAMEER
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
       
        
        
       
        
        
        
        
                     this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new WindowAdapter(){

            @Override
            public void windowClosing(WindowEvent e) {
                int x = JOptionPane.showConfirmDialog(null, "Are you sure you want to close this App? ", "Exit", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
        if (x == JOptionPane.YES_NO_OPTION){
               e.getWindow().dispose();    
           }
                else{
               
               
                     }
           
           
                                                     }
            
            
                                                         });
    }

    
    
    
    
   
    
    
    
      
      
     
     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        desktop = new javax.swing.JDesktopPane();
        jLabel4 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jComboBox4 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();

        jMenu4.setText("File");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("HunriTek_ADMIN");
        setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        setMinimumSize(new java.awt.Dimension(1370, 741));
        setPreferredSize(new java.awt.Dimension(1370, 741));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        desktop.setMinimumSize(new java.awt.Dimension(1510, 741));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buttons-characters-concept-1591057q.jpg"))); // NOI18N
        jLabel4.setMinimumSize(new java.awt.Dimension(1575, 741));
        jLabel4.setPreferredSize(new java.awt.Dimension(1575, 741));

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, desktopLayout.createSequentialGroup()
                .addGap(0, 140, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1370, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopLayout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        desktop.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        getContentPane().add(desktop, new org.netbeans.lib.awtextra.AbsoluteConstraints(-140, 100, 1510, 640));

        jComboBox3.setBackground(new java.awt.Color(255, 255, 153));
        jComboBox3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-SALES-", "Sales List", "Sales Chart" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, 140, -1));

        jComboBox4.setBackground(new java.awt.Color(255, 255, 153));
        jComboBox4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-STOCKS-", "Products", "Create Database List" }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 40, 170, -1));

        jComboBox2.setBackground(new java.awt.Color(255, 255, 153));
        jComboBox2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-EXPIRATION-", "About To Expire", "Expired" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 40, 150, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 102));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyFrames/settings.png"))); // NOI18N
        jButton3.setText("ACCOUNT SETTINGS");
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, -1, 40));

        jButton6.setFont(new java.awt.Font("KBZipaDeeDooDah", 0, 24)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 0, 102));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyFrames/logout.png"))); // NOI18N
        jButton6.setText("Logout");
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 30, 150, 40));

        jButton7.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledShadow"));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(0, 0, 102));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stock.png"))); // NOI18N
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 30, 40, 40));

        jButton9.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledShadow"));
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton9.setForeground(new java.awt.Color(0, 0, 102));
        jButton9.setText("LOW STOCK");
        jButton9.setBorderPainted(false);
        jButton9.setContentAreaFilled(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 30, 150, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Henrilogo2.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 100));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bk.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 100));

        jButton8.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledShadow"));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(0, 0, 102));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sale.png"))); // NOI18N
        jButton8.setText("Sales");
        jButton8.setContentAreaFilled(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 30, -1, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
   int x = JOptionPane.showConfirmDialog(null, "Are you sure you want to Logout", "LOGOUT", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
           if (x == JOptionPane.YES_NO_OPTION){
               Home qb = new  Home();
       qb.setVisible(true);
       this.setVisible(false);    
           }
                else{
               
               
                     }            // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        UpdatePass up=new  UpdatePass();
        this.desktop.add(up);
        
        up.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       
             
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
    JOptionPane.showMessageDialog(null,"    PLEASE UPGRADE TO PRO VERSION   ", "INFORMATION",JOptionPane.INFORMATION_MESSAGE); 
                 // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed

    
         if (jComboBox3.getSelectedItem().toString().equals("Sales List")){
         JOptionPane.showMessageDialog(null,"    PLEASE UPGRADE TO PRO VERSION   ", "INFORMATION",JOptionPane.INFORMATION_MESSAGE); 
   
         jComboBox3.setSelectedItem("-SALES-");
         }
         
         else if (jComboBox3.getSelectedItem().toString().equals("Sales Chart")){
           JOptionPane.showMessageDialog(null,"    PLEASE UPGRADE TO PRO VERSION   ", "INFORMATION",JOptionPane.INFORMATION_MESSAGE); 
   
         jComboBox3.setSelectedItem("-SALES-");
             
         }
        
          else{
              
              
          }
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
       
         if (jComboBox4.getSelectedItem().toString().equals("Products")){
           UpdateStock up =new UpdateStock();
            this.desktop.add(up);
        up.setVisible(true);
         jComboBox4.setSelectedItem("-STOCKS-");
         }
         
         else if (jComboBox4.getSelectedItem().toString().equals("Create Database List")){
          JOptionPane.showMessageDialog(null,"    PLEASE UPGRADE TO PRO VERSION   ", "INFORMATION",JOptionPane.INFORMATION_MESSAGE); 
   
         jComboBox4.setSelectedItem("-STOCKS-");
             
         }
        
          else{
              
              
          }
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed

        if (jComboBox2.getSelectedItem().toString().equals("About To Expire")){
          JOptionPane.showMessageDialog(null,"    PLEASE UPGRADE TO PRO VERSION   ", "INFORMATION",JOptionPane.INFORMATION_MESSAGE); 
   
            jComboBox2.setSelectedItem("-EXPIRATION-");
        }

        else if (jComboBox2.getSelectedItem().toString().equals("Expired")){
           JOptionPane.showMessageDialog(null,"    PLEASE UPGRADE TO PRO VERSION   ", "INFORMATION",JOptionPane.INFORMATION_MESSAGE); 
   

            jComboBox2.setSelectedItem("-EXPIRATION-");

        }

        else{

        }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            
           UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
          //  UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TexturelLookAndFeel");
         /*   for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
            
            */
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
      
            new MainFrame().setVisible(true);
        
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JDesktopPane desktop;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar2;
    // End of variables declaration//GEN-END:variables
}
