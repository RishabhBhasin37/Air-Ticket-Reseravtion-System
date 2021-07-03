/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package airline.project;

import static airline.project.GlobalVariables.password;
import static airline.project.GlobalVariables.url;
import static airline.project.GlobalVariables.username;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author bhasin
 */
public class CostumerUpdateUser extends javax.swing.JFrame {
    DefaultTableModel m1;
    String email;
    File myfile;
    String imagename;
    public CostumerUpdateUser() {
        initComponents();
        
        
       
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel16 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jFormattedTextField3 = new javax.swing.JFormattedTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Update Costumer Details");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Email");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 320, 60, 15);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("First Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 180, 90, 15);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Last Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 220, 63, 15);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Passport Number");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 270, 105, 15);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("DOB");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 360, 26, 15);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Address Line ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 430, 82, 15);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("City");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(410, 330, 24, 15);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("State");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(400, 230, 34, 15);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Pin Code");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(390, 270, 70, 15);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 204));
        jLabel11.setText("Fill Passport Number To Search.");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(10, 150, 240, 22);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(130, 180, 160, 30);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(130, 220, 160, 30);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(130, 310, 160, 30);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(470, 220, 160, 30);
        getContentPane().add(jTextField6);
        jTextField6.setBounds(470, 320, 160, 30);
        getContentPane().add(jDateChooser1);
        jDateChooser1.setBounds(130, 350, 160, 30);

        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(130, 390, 170, 120);

        jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jFormattedTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jFormattedTextField1);
        jFormattedTextField1.setBounds(470, 270, 160, 30);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Here", "India", "Canada", "United States Of America", "Sri Lanka", "United Kingdom", "Spain", "France", "Brazil", "Pakistan", "Bangladesh", "Australia", "South Africa", "Afghanistan", "New Zealand", "West Indies" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(470, 180, 150, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setText("YOUR DETAILS");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(350, 80, 250, 40);

        jButton2.setBackground(new java.awt.Color(255, 255, 0));
        getContentPane().add(jButton2);
        jButton2.setBounds(0, 130, 1020, 10);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Phone");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(400, 370, 60, 15);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Gender");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(400, 420, 60, 15);

        try {
            jFormattedTextField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jFormattedTextField2);
        jFormattedTextField2.setBounds(470, 370, 160, 30);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton1.setText("Female");
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(530, 420, 93, 25);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton2.setText("Male");
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(470, 420, 80, 25);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("H");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(470, 150, 50, 17);

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 255, 0));
        jButton3.setText("DELETE CUSTOMER");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(710, 490, 171, 30);

        try {
            jFormattedTextField3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jFormattedTextField3);
        jFormattedTextField3.setBounds(130, 260, 160, 30);
        getContentPane().add(jLabel18);
        jLabel18.setBounds(10, 10, 200, 110);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 0, 0));
        jLabel19.setText(" UPDATE\n");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(370, 10, 290, 100);

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 255, 0));
        jButton4.setText("UPDATE CUSTOMER");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(500, 490, 200, 30);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setText("Country");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(410, 190, 50, 15);

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setText("CUSTOMER ID");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(360, 150, 110, 17);

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setForeground(new java.awt.Color(0, 255, 0));
        jButton5.setText("Search");
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(290, 260, 73, 30);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.png"))); // NOI18N
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(860, 10, 60, 30);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/b2.jpg"))); // NOI18N
        getContentPane().add(jLabel13);
        jLabel13.setBounds(0, 0, 940, 540);

        setSize(new java.awt.Dimension(926, 532));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jFormattedTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int ans=JOptionPane.showConfirmDialog(rootPane,"Do you want to delete record ?", "Confirm Deletion",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.ERROR_MESSAGE);
        if(ans==JOptionPane.YES_OPTION)
        {
        
        Connection myconnection;
        
        try
        {
            
        myconnection=DriverManager.getConnection(url, username,password);
         try
         {
             String query="delete from customertable where Customer_ID = ?";
             com.mysql.jdbc.PreparedStatement statement=(com.mysql.jdbc.PreparedStatement) myconnection.prepareStatement(query);
             
             statement.setString(1,jLabel16.getText());
             
             
             if(statement.executeUpdate()>0)
             {
                 JOptionPane.showMessageDialog(rootPane,"Deleted Successfully");
             }
             statement.close();
             jTextArea1.setText("");
             jTextField1.setText("");
             jTextField2.setText("");
             jFormattedTextField2.setText("");
             jTextField4.setText("");
             jTextField5.setText("");
             jTextField6.setText("");
             jFormattedTextField1.setText("");
             jFormattedTextField3.setText("");
             buttonGroup1.clearSelection();
             jComboBox1.setSelectedIndex(0);
             m1.setRowCount(0);
             jDateChooser1.setDate(null);
             jTextField1.requestFocus();
             
         }
         catch(Exception e)
         {
             JOptionPane.showMessageDialog(rootPane, e.getMessage());
             
         }
         finally
         {
             myconnection.close();
         }
        }
         catch(Exception e)    
                 {
                 JOptionPane.showMessageDialog(rootPane, e.getMessage());
                 }
        }


    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         Connection myconnection;
         
                    
         boolean flag=false;
 
                if(myfile!=null)
                {
                if(myfile.length()<300000)
                {
                imagename=new java.util.Date().getTime() + myfile.getName();
                int i;

                FileInputStream rd = null;
                FileOutputStream outs = null;

                try {

                rd = new FileInputStream(myfile);
                outs = new FileOutputStream("C:\\Users\\bhasin\\Desktop\\Images\\"+imagename);//writing the new file in 'Images' folder, in the project
                byte[] b = new byte[2048]; //cache of 2kb
                while ((i = rd.read(b)) !=-1) {
                outs.write(b, 0, i); //copying from pictures to empimages byte by byte
                }
                }
                catch (Exception e) 
                {
                JOptionPane.showMessageDialog(rootPane, "error" + e.getMessage());
                e.printStackTrace();
                } 
                flag=true;
                }
                else
                {
                flag=false;
                }
                }
                else
                {
                imagename="defalutprofilepic.jpg";
                flag=true;
                } 



                if(flag)
                {

        

        
        try
        {
            
        myconnection=DriverManager.getConnection(url, username,password);
         try
         {
             String query="update customertable set Firstname=?,LastName=?,Passport=?,DOB=?,Address=?,Country=?,State=?,Pincode=?,City=?,Phone=?,Gender=?,Email=?,Image=?,DateTime=? where Customer_ID = ?";
             com.mysql.jdbc.PreparedStatement statement=(com.mysql.jdbc.PreparedStatement) myconnection.prepareStatement(query);
             
             java.util.Date date=new java.util.Date();
             SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
             SimpleDateFormat format2=new SimpleDateFormat("yyyy-MM-dd");
             
             
             statement.setString(15,jLabel16.getText());
             statement.setString(1,jTextField1.getText());
             statement.setString(2,jTextField2.getText());
             statement.setString(3,jFormattedTextField3.getText());
             statement.setString(4,format2.format(jDateChooser1.getDate()));
             statement.setString(5,jTextArea1.getText());
             statement.setString(6,jComboBox1.getSelectedItem().toString());
             statement.setString(7,jTextField5.getText());
             statement.setString(8,jFormattedTextField1.getText());
             statement.setString(9,jTextField6.getText());
             statement.setString(10,jFormattedTextField2.getText());
             statement.setString(11,jRadioButton2.isSelected()?"Male":"Female");
             statement.setString(12,jTextField4.getText());
             statement.setString(13,imagename);
             statement.setString(14,format.format(date));
             
             if(statement.executeUpdate()>0)
             {
                 JOptionPane.showMessageDialog(rootPane,"Customer Updated Successfully");
             }
             statement.close();
             this.dispose();
             
         }
         catch(Exception e)
         {
             JOptionPane.showMessageDialog(rootPane, e.getMessage());
             
         }
         finally
         {
             myconnection.close();
         }
        }
         catch(Exception e)    
                 {
                 JOptionPane.showMessageDialog(rootPane, e.getMessage());
                 }
                }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Connection myconnection;
      
               
        try
        {
            
        myconnection=DriverManager.getConnection(url, username,password);
         try
         {
             String query="select Customer_ID from customertable where Passport=?";
             com.mysql.jdbc.PreparedStatement statement=(com.mysql.jdbc.PreparedStatement) myconnection.prepareStatement(query);
             statement.setString(1,jFormattedTextField3.getText());
             
             ResultSet set=statement.executeQuery();
               
                     
             if(set.next())
             {
                 jLabel16.setText(set.getString("Customer_ID"));
                 try
                 {
                 
                 String query1="select * from customertable where Customer_ID=?";
                com.mysql.jdbc.PreparedStatement statement1=(com.mysql.jdbc.PreparedStatement) myconnection.prepareStatement(query1);
                statement1.setString(1,jLabel16.getText());
                
                ResultSet set2=statement1.executeQuery();
                
                if(set2.next())
                {
                 jTextField1.setText(set2.getString("Firstname"));
                 jTextField2.setText(set2.getString("Lastname"));
                 jTextField5.setText(set2.getString("State"));
                 jFormattedTextField1.setText(set2.getString("Pincode"));
                 jTextField6.setText(set2.getString("City"));
                 jTextArea1.setText(set2.getString("Address"));
                 jFormattedTextField2.setText(set2.getString("Phone"));
                 jFormattedTextField3.setText(set2.getString("Passport"));
                 if(set2.getString("Gender").equalsIgnoreCase("Male"))
                 {
                  jRadioButton2.setSelected(true);
                 }
                 else
                 {
                   jRadioButton1.setSelected(true);
                 }
                     
                 jComboBox1.setSelectedItem(set2.getString("Country"));
                 jTextField4.setText(set2.getString("Email"));
                 jDateChooser1.setDate(set2.getDate("DOB"));
                }
                
                 }
                 catch(Exception e)
                 {
                     JOptionPane.showMessageDialog(rootPane,e.getMessage());
                 }
              
             }
             else
                    JOptionPane.showMessageDialog(rootPane,"Passport Number Not Found");
             statement.close();
                     }
             
             
         
         catch(Exception e)
         {
             JOptionPane.showMessageDialog(rootPane, e.getMessage());
             
         }
         finally
         {
             myconnection.close();
         }
        }
         catch(Exception e)    
                 {
                 JOptionPane.showMessageDialog(rootPane, e.getMessage());
                 }
    

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        this.dispose();
       
    }//GEN-LAST:event_jButton6ActionPerformed

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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CostumerUpdateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CostumerUpdateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CostumerUpdateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CostumerUpdateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CostumerUpdateUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JFormattedTextField jFormattedTextField3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables

}