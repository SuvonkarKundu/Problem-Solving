/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package connectiontest;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Arrays;
import javax.swing.*;

public class Adminestorpassword extends JFrame {
     int input;
   Adminestorpassword () throws SQLException   {
    JFrame guiframe= new JFrame();
    guiframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    guiframe.setTitle("Dialog Box Example"); 
    guiframe.setSize(500,500); 
    guiframe.setLocationRelativeTo(null); 
    guiframe.setVisible(true); 
    JTextArea tracker = new JTextArea("Password Tracker:");
    guiframe.add(tracker); 
    JPanel userPanel = new JPanel(); 
    userPanel.setLayout(new GridLayout(2,2)); 
    JLabel usernameLbl = new JLabel("Username:");
    JLabel passwordLbl = new JLabel("Password:");
    JTextField username = new JTextField();
    JPasswordField passwordFld = new JPasswordField();
    userPanel.add(usernameLbl);
    userPanel.add(username);
    userPanel.add(passwordLbl);
    userPanel.add(passwordFld);
    int input = JOptionPane.showConfirmDialog(guiframe, userPanel, "Enter your password:" ,JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE); 
    char[] correctPassword = {'0', '1', '7', '3', '8', '0', '1', '9', '1','8','4'};
    if (input == 0)  { tracker.append("\nUsername entered was: " + username.getText());
    char[] enteredPassword = passwordFld.getPassword();
    tracker.append("\nPassword entered was: " + String.valueOf(enteredPassword));
     
    if (Arrays.equals(correctPassword, enteredPassword)) { 
      Idusd obj=new Idusd();
    
    }
    else { tracker.append("\nCall security - it's an imposter!"); }
   Arrays.fill(enteredPassword, '0'); } else {
           tracker.append("\nDialog cancelled.."); } 
}
   
     public void actionPerformed(ActionEvent e) throws SQLException
  {
       String s1=e.getActionCommand();
    
       if(input==JOptionPane.OK_CANCEL_OPTION)
       {
          Idusd obj= new Idusd();
       
       }
  }
}
