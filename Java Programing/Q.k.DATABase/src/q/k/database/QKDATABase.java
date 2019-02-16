/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package q.k.database;

 import java.awt.*;  
import java.awt.event.ActionListener;
 import java.sql.*;  
 import javax.swing.*;  
public class QKDATABase  {

   
  
 public static void main(String[] args){  
  
 JFrame f=new JFrame();  
 JLabel label1=new JLabel("Name: ");  
 JLabel label2=new JLabel("Address: ");  
 JLabel label3=new JLabel("");  
 JButton SubmitButton=new JButton("Submit");  
 JTextField text1=new JTextField(20);  
 JTextField text2=new JTextField(20);  
 try{  
  
 Class.forName("com.mysql.jdbc.Driver");  
 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MyStudentProfile", "root", "hejsan123");  
  
 Statement st=con.createStatement();  
 ResultSet rs=st.executeQuery("INSERT INTO contractyearly" +  
 "VALUES (12, ");  
 String name="",address="";  
 if(rs.next()){  
 name=rs.getString("name");  
 address=rs.getString("address");  
 }  
 text1.setText(name);  
 text2.setText(address);  
 }  
 catch(Exception e){  
 }  
 JPanel p=new JPanel(new GridLayout(2,2));  
 p.add(label1);  
 p.add(text1);  
 p.add(label3);  
 p.add(label2);  
 p.add(text2);  
 p.add(SubmitButton);  
 f.add(p);  
 f.setVisible(true);  
 f.pack();  
 }
 
 private void SubmitButtonActionPerformed(java.awt.event.ActionE vent evt) {  
  
 String s1 = text1.getText();  
 String s2 = text2.getText();  
  
 try{  
 Statement stmt = this.con.createStatement();  
 stmt.executeUpdate("insert into employee (First_Name ,Last_Name , Address , Salary ) values (" + s1+ ","+s2+ ")");  
  
 }catch(Exception e){  
  
 System.out.println(e.toString());  
  
  
 }  
  
  





	  
