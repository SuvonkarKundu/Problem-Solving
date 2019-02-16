/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package connectiontest;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Suvonkar Kundu
 */
public class Diningtableinsert extends JFrame implements ActionListener {

   JFrame objjf = new JFrame();
    JLabel objjl = new JLabel();
    JPanel obj = new JPanel();
    JTextField obJT1, obJT2, obJT3, obJT4, obJT5, obJT6,obJT7,obJT8;
    JTextField name, id, deptment, batch, email;
    static Statement st;
    static Connection con;
    DefaultTableModel table_model, table_model1;
    ResultSet result_set, result_set1;
    ResultSetMetaData result_set_meta_data, result_set_meta_data1;
Diningtableinsert() throws SQLException {
        
        initComponent();
       //String query = "insert into diningtable values('1123',4,8,12,15,200)";
                    //System.out.println(query);
                    
                   // st.executeQuery(query);

        
        objjf.setLayout(null);
       

       
        JLabel objjl2 = new JLabel();
        objjl2.setText("VOUCHER_ID:");
        objjl2.setBounds(100, 50, 100, 30);
        objjf.add(objjl2);
        obJT2 = new JTextField(18);
        obJT2.setBounds(200, 50, 150, 30);
        objjf.add(obJT2);
        JLabel objjl3 = new JLabel();
        objjl3.setText("TOKEN_DAY:");
        objjl3.setBounds(100, 100, 100, 30);
        objjf.add(objjl3);
        obJT3 = new JTextField(18);
        obJT3.setBounds(200, 100, 150, 30);
        objjf.add(obJT3);
        JLabel objjl4 = new JLabel();
        objjl4.setText("TOKEN_SUBMIT_NUMBER:");
        objjl4.setBounds(100, 150, 100, 30);
        objjf.add(objjl4);
        obJT4 = new JTextField(18);
        obJT4.setBounds(200, 150, 150, 30);
        objjf.add(obJT4);
        JLabel objjl5 = new JLabel();
        objjl5.setText("HALL__FEE:");
        objjl5.setBounds(100, 200, 100, 30);
        objjf.add(objjl5);
        obJT5 = new JTextField(18);
        obJT5.setBounds(200, 200, 150, 30);
        objjf.add(obJT5);
        JLabel objjl6 = new JLabel();
        objjl6.setText("TOKEN_FEE:");
        objjl6.setBounds(100, 250, 100, 30);
        objjf.add(objjl6);
        obJT6 = new JTextField(18);
        obJT6.setBounds(200, 250, 150, 30);
        objjf.add(obJT6);
        JLabel objjl7=new JLabel();
        objjl7.setText("TOKEN_SUBMIT_TK: ");
        objjl7.setBounds(100, 300, 100, 30);
        objjf.add(objjl7);
        obJT7=new JTextField(18);
        obJT7.setBounds(200, 300, 150, 30);
        objjf.add(obJT7);
         JLabel objjl8=new JLabel();
        
        JButton button = new JButton("ADD1");
        button.setBounds(230, 400, 80, 50);
        button.addActionListener(this);
        objjf.add(button);
        JTable table = new JTable();
        objjf.setVisible(true);
        objjf.setLocation(0, 0);
        objjf.setSize(500, 568);


    }

    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();

        if (s.equals("ADD1")) {

            try {
                
                
               
                String voucher_id = obJT2.getText();
                String token_day = obJT3.getText();
                String token_submit_number = obJT4.getText();
                String hall__fee = obJT5.getText();
                String token_fee = obJT6.getText();
                String token_submit_tk = obJT7.getText();
                 
                  String query = "INSERT INTO DININGTABLE VALUES('" + voucher_id + "'," + token_day+ "," + token_submit_number+ "," + hall__fee + "," +token_fee+ "," +token_submit_tk + ")";
                    System.out.println(query);
                    
                    
                
               if ( voucher_id.isEmpty() || token_day.isEmpty() || token_submit_number.isEmpty() || hall__fee.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Please Insert name,id,result", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                   
                 st.executeQuery(query);

                }
            } catch (SQLException ex) {
                Logger.getLogger(INSERT.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NumberFormatException er) {
                System.out.println(er.toString());
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
