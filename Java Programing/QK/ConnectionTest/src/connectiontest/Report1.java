/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package connectiontest;

import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


class Report1 extends JFrame {
    JPanel panel;
    JScrollPane jScrollPane1;
    JFrame frame;
    JButton UPDATE,DELETE;
    JTable jTable;
    static Connection con;
    static Statement st;
    
    DefaultTableModel table_model;
    ResultSet result_set;
    ResultSetMetaData result_set_meta_data;
     

    public Report1() throws SQLException {

       // Connection con=new  ConnectionToDatabase().getConnection();
      //  initComponent();
        
        frame = new JFrame("STUDENT_INFO");
        frame.setLayout(null);
        JPanel panel = new JPanel();

        jTable = new JTable();
        jTable.setBounds(0, 0,885,500);
        jTable.setShowGrid(true);
        
            String selfQ="select voucher_id, token_day,(case when token_day=30 then 'REGULAR'else 'IRREGULAR'end) as status from DININGTABLE";
             
              

         
        table_model=Table_Test1.getTableModel(selfQ);
           jTable.setModel(table_model); 
       // jScrollPane1=new JScrollPane();
        // jScrollPane1.setViewportView(jTable);
        //jTable.add(jScrollPane1);
        // frame.add(jScrollPane1);
        frame.add(jTable);

      /*  UPDATE=new JButton();
        UPDATE.setText("UPDATE");
        UPDATE.setBounds(200,550,100,30);
        frame.add(UPDATE);
        
         DELETE=new JButton();
        DELETE.setText("DELETE");
        DELETE.setBounds(400,550,100,30);
        frame.add(DELETE);
        
        frame.setVisible(true);
        frame.setSize(885,700);*/
    //<editor-fold defaultstate="collapsed" desc="comment">
    }
    //</editor-fold>
     /* public void initComponent() {
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
    }*/
  public static void main(String[] args)
  {
        try {
            new Report1();
        } catch (SQLException ex) {
            Logger.getLogger(Report1.class.getName()).log(Level.SEVERE, null, ex);
        }
  }
}
