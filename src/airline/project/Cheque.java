/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package airline.project;

import static airline.project.GlobalVariables.password;
import static airline.project.GlobalVariables.url;
import static airline.project.GlobalVariables.username;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author bhasin
 */
public class Cheque extends javax.swing.JFrame {
    DefaultTableModel m1;
    String email;
    public Cheque() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cheque Details");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("BANK NAME");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 340, 120, 22);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("CHEQUE DATE");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(60, 280, 160, 22);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 204));
        jLabel11.setText("FILL ALL DETAILS!");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(10, 150, 170, 22);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(220, 340, 240, 30);
        getContentPane().add(jDateChooser1);
        jDateChooser1.setBounds(230, 280, 160, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setText(" DETAILS");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(160, 80, 160, 40);

        jButton2.setBackground(new java.awt.Color(255, 255, 0));
        getContentPane().add(jButton2);
        jButton2.setBounds(0, 130, 500, 10);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 0, 0));
        jLabel19.setText("CHEQUE");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(170, 10, 290, 100);
        getContentPane().add(jLabel18);
        jLabel18.setBounds(10, 10, 0, 110);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("CHEQUE NUMBER");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(60, 220, 180, 22);

        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("######")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jFormattedTextField1);
        jFormattedTextField1.setBounds(230, 220, 140, 30);

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(51, 255, 0));
        jButton3.setText("SAVE ");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(330, 450, 140, 30);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.png"))); // NOI18N
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(430, 10, 60, 30);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/b2.jpg"))); // NOI18N
        getContentPane().add(jLabel13);
        jLabel13.setBounds(0, 0, 500, 540);

        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(430, 10, 60, 30);

        setSize(new java.awt.Dimension(496, 535));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jFormattedTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    
         Connection myconnection;
         
            if(jDateChooser1.getDate().equals(""))
                {
                    JOptionPane.showMessageDialog(rootPane,"Fill all details");
                }
                if(jFormattedTextField1.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(rootPane,"Fill all details");
                }
                if(jTextField4.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(rootPane,"Fill all details");
                }
                
        
                else{
        
        try
        {
            
        myconnection=DriverManager.getConnection(url, username,password);
         try
         {
             String query="insert into cheque values(?,?,?,?,?,?)";
             java.sql.PreparedStatement statement=(java.sql.PreparedStatement) myconnection.prepareStatement(query);
             java.util.Date date=new java.util.Date();
             SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
             SimpleDateFormat format2=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
             
             
             statement.setString(1,jFormattedTextField1.getText());
             statement.setString(2,TicketReservation.c);
             statement.setString(3,TicketReservation.j);
             statement.setString(4,format.format(jDateChooser1.getDate()));
             statement.setString(5,jTextField4.getText());
             statement.setString(6,format2.format(date));
             
           
             if(statement.executeUpdate()>0)
             {
                  
                 JOptionPane.showMessageDialog(rootPane,"Details Successfully Saved");
                  this.dispose();
                     
             }
             
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
        

                }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        this.dispose();
        Home obj=new Home();
        obj.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        this.dispose();
        
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(Cheque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cheque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cheque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cheque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cheque().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables

}
