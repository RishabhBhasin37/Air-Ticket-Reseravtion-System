/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airline.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author bhasin
 */
public class RegistrationForm extends javax.swing.JFrame implements GlobalVariables{

    /**
     * Creates new form RegistrationForm
     */
    public RegistrationForm() {
        initComponents();
        jTextField1.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
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
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setText("Name");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 190, 60, 20);

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 255));
        jLabel2.setText("Username");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 230, 90, 20);

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 255));
        jLabel3.setText("Password");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 270, 90, 20);

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 255, 255));
        jLabel4.setText("Security Question");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 320, 150, 20);

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 255, 255));
        jLabel5.setText("Gender");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 400, 70, 20);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(170, 190, 290, 30);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(170, 230, 290, 30);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(170, 360, 290, 30);

        jPasswordField1.setEchoChar('*');
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(170, 270, 230, 30);

        jComboBox2.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose From Here", "What was the house number you lived in as a child?", "What is your best friend's name?", "What were the last four digits of your telephone number?", "What primary school did you attend?", "In what town or city was your first full time job?" }));
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(170, 320, 280, 30);

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 255, 0));
        jButton2.setText("REGISTER ADMIN");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(200, 440, 170, 40);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.png"))); // NOI18N
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(500, 10, 60, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("ADMIN ACCOUNT");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(180, 70, 270, 40);

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 255, 255));
        jLabel7.setText("Answer");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(30, 360, 80, 20);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Male");
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(170, 400, 80, 20);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Female");
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(280, 400, 90, 20);

        jButton4.setBackground(new java.awt.Color(0, 204, 204));
        getContentPane().add(jButton4);
        jButton4.setBounds(0, 120, 560, 20);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("NEW");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(250, 30, 90, 40);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 0));
        jLabel8.setText("Show Password");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel8MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel8MouseReleased(evt);
            }
        });
        getContentPane().add(jLabel8);
        jLabel8.setBounds(400, 230, 110, 100);

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/b2.jpg"))); // NOI18N
        getContentPane().add(jLabel21);
        jLabel21.setBounds(0, 0, 560, 540);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 204));
        jLabel11.setText("PLEASE FILL DETAILS TO CONTINUE");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(20, 150, 270, 17);
        getContentPane().add(jLabel10);
        jLabel10.setBounds(0, 0, 570, 0);

        setSize(new java.awt.Dimension(564, 537));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        Connection myconnection;
      
        
        try
        {
            
        myconnection=DriverManager.getConnection(url, username,password);
         try
         {
             int i=1;
             
             String query="insert into login(Name,Username,Password,SecurityQ,Answer,Usertype,Gender,DateTime) values(?,?,?,?,?,?,?,?)";
             String query2="insert into adminn(datetime) values(?)";
              
             PreparedStatement statement=(PreparedStatement) myconnection.prepareStatement(query);
             PreparedStatement statement2=(PreparedStatement) myconnection.prepareStatement(query2);
             java.util.Date date=new java.util.Date();
             SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
             
             jTextField1.requestFocus();
             statement.setString(1,jTextField1.getText());
             statement.setString(2,jTextField2.getText());
             statement.setString(3,jPasswordField1.getText());
             statement.setString(4,jComboBox2.getSelectedItem().toString());
             statement.setString(5,jTextField3.getText());
             statement.setString(6,"Admin");
             statement.setString(7,(jRadioButton1.isSelected()?"Male":"Female"));
             statement.setString(8,format.format(date));
             
             statement2.setString(1, format.format(date));
             
             if(statement.executeUpdate()>0 && statement2.executeUpdate()>0)
             {
                 
                 JOptionPane.showMessageDialog(rootPane,"Saved Successfully");
                  LoginAirline obj=new LoginAirline();
        obj.setVisible(true);
        this.dispose();
             }
             statement.close();
             jTextField1.setText("");
             jTextField2.setText("");
             jTextField3.setText("");
             buttonGroup1.clearSelection();
             jPasswordField1.setText("");
             jComboBox2.setSelectedIndex(0);
             
             
             
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

        
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.dispose();
        LoginAirline obj=new LoginAirline();
        obj.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jLabel8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MousePressed
        jPasswordField1.setEchoChar((char)0);
    }//GEN-LAST:event_jLabel8MousePressed

    private void jLabel8MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseReleased
        jPasswordField1.setEchoChar('*');
    }//GEN-LAST:event_jLabel8MouseReleased

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
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrationForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
