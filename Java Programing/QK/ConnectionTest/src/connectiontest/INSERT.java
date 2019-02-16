/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package connectiontest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

class INSERT extends JFrame implements ActionListener {

    JFrame objjf = new JFrame();
    JLabel objjl = new JLabel();
    JPanel obj = new JPanel();
    JTextField obJT, obJT1, obJT2, obJT3, obJT4, obJT5,obJT6,obJT7;
    JTextField name, id, deptment, batch, email;
    static Statement st;
    static Connection con;
    DefaultTableModel table_model, table_model1;
    ResultSet result_set, result_set1;
    ResultSetMetaData result_set_meta_data, result_set_meta_data1;

    INSERT() throws SQLException {
        
       initComponent();
        //String query = "insert into studentinfo values('a',2,'o',11,'agt','234','1234')";
                 //  System.out.println(query);
                    
                  //  st.executeQuery(query);

        
        objjf.setLayout(null);
       

        objjl.setText("NAME:");
        objjl.setBounds(100, 50, 50, 30);
        objjf.add(objjl);
        obJT = new JTextField(18);
        obJT.setBounds(200, 50, 150, 30);
        objjf.add(obJT);
        JLabel objjl2 = new JLabel();
        objjl2.setText("ID:");
        objjl2.setBounds(100, 100, 100, 30);
        objjf.add(objjl2);
        obJT1 = new JTextField(18);
        obJT1.setBounds(200, 100, 150, 30);
        objjf.add(obJT1);
        JLabel objjl4 = new JLabel();
        objjl4.setText("BLOOD_GROUP:");
        objjl4.setBounds(100, 150, 100, 30);
        objjf.add(objjl4);
        obJT3 = new JTextField(18);
        obJT3.setBounds(200, 150, 150, 30);
        objjf.add(obJT3);
        JLabel objjl5 = new JLabel();
        objjl5.setText("BATCH:");
        objjl5.setBounds(100, 200, 100, 30);
        objjf.add(objjl5);
        obJT4 = new JTextField(18);
        obJT4.setBounds(200, 200, 150, 30);
        objjf.add(obJT4);
        JLabel objjl6 = new JLabel();
        objjl6.setText("EMAIL:");
        objjl6.setBounds(100, 250, 100, 30);
        objjf.add(objjl6);
        obJT5 = new JTextField(18);
        obJT5.setBounds(200, 250, 150, 30);
        objjf.add(obJT5);
        JLabel objjl7=new JLabel();
        objjl7.setText("ROOM NO: ");
        objjl7.setBounds(100, 300, 100, 30);
        objjf.add(objjl7);
        obJT6=new JTextField(18);
        obJT6.setBounds(200, 300, 150, 30);
        objjf.add(obJT6);
        JLabel objjl8=new JLabel();
        objjl8.setText("VOUCHER_ID: ");
        objjl8.setBounds(100, 350, 100, 30);
        objjf.add(objjl8);
        obJT7=new JTextField(18);
        obJT7.setBounds(200, 350, 150, 30);
        objjf.add(obJT7);
        JButton button = new JButton("ADD");
        button.setBounds(230, 450, 80, 50);
        button.addActionListener(this);
        objjf.add(button);
        JTable table = new JTable();
        objjf.setVisible(true);
        objjf.setLocation(0, 0);
        objjf.setSize(500, 568);


    }

    public void actionPerformed(ActionEvent e)
    {
        String s = e.getActionCommand();

        if (s.equals("ADD"))
        {

                
                String name_ = obJT.getText();
                String id_ = obJT1.getText();
                String blood_group = obJT3.getText();
                String batch = obJT4.getText();
                String email = obJT5.getText();
                String room_no = obJT6.getText();
                String voucher_id=obJT7.getText();
                if (name_.isEmpty() || id_.isEmpty() || batch.isEmpty() || email.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Please Insert name,id,result", "Error", JOptionPane.ERROR_MESSAGE);
                } 
               else {
                  String query = "INSERT INTO STUDENTINFO VALUES('" + name_ + "'," + id_ + ",'" + blood_group + "'," + batch + ",'" + email + "','" + room_no + "','" +voucher_id+ "')";
                    System.out.println(query); 
  
                try {
                    st.executeQuery(query);
                } catch (SQLException ex) {
                    Logger.getLogger(INSERT.class.getName()).log(Level.SEVERE, null, ex);
                }

                }
          
            
        }

    }

   public void initComponent() {
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        try {
            con = makeconnection.getDatabaseConnection();
            System.out.println("connected");
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        try {
            st = con.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(INSERT.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}