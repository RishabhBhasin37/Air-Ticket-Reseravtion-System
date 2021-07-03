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
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author bhasin
 */
public class AirlineProjectMainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                
                }
            }
            
        
            
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        
        Connection myconnection;
        
        try
        {
            
        myconnection=DriverManager.getConnection(url, username,password);
         try
         {
             String query="select * from login";
             com.mysql.jdbc.PreparedStatement statement=(com.mysql.jdbc.PreparedStatement) myconnection.prepareStatement(query);
             ResultSet set=statement.executeQuery();
             
             if(set.next())
             {
                 LoginAirline obj=new LoginAirline();
                 obj.setVisible(true);
             }
             else
             {
                 RegistrationForm obj=new RegistrationForm();
                 obj.setVisible(true);
             }
                 
             
             statement.close();
         }
         catch(Exception e)
         {
             JOptionPane.showMessageDialog(null, e.getMessage());
             
         }
         finally
         {
             myconnection.close();
         }
        }
         catch(Exception e)    
                 {
                 JOptionPane.showMessageDialog(null, e.getMessage());
                 }
        
    
}

}
