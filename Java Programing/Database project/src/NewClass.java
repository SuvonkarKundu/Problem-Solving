
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Suvonkar Kundu
 */
public class NewClass {
    
    try
        {
            String Query="select * from student8 where id_=1104040";
      
      Class.forName("oracle.jdbc.OracleDriver"); 
      String url = "jdbc:oracle:thin:@localhost:1521:XE"; 
      Connection conn = DriverManager.getConnection(url,"Suvonkar","01738019184");
      Statement st = conn.createStatement();
      ResultSet r8;
        try {
            r8 = st.executeQuery(Query);
        } catch (SQLException ex) {
            Logger.getLogger(NewClass.class.getName()).log(Level.SEVERE, null, ex);
        }
      r8.next();
        try {
            String name=r8.getString(1104040);
        } catch (SQLException ex) {
            Logger.getLogger(NewClass.class.getName()).log(Level.SEVERE, null, ex);
        }
      System.out.println("tree");
        try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(NewClass.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }
    catch (Exception e)
    {
    System.out.println(e);
  
    } 
    
}
