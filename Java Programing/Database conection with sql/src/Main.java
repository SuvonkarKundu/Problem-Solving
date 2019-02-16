
import java.sql.*;
import javax.swing.JOptionPane;


public class Main {
   public static Connection ConectorDb() { 
    try
    {
      // Step 1: Load the JDBC driver. 
      Class.forName("Oracle.jbdc.OracleDriver"); 
      // Step 2: Establish the connection to the database. 
      String url = "jdbc:oracle:thin:@localhost:1521:XE"; 
      Connection conn = DriverManager.getConnection(url,"user1","password");
     
    }
    catch (Exception e)
    {
      JOptionPane.showMessageDialog(null, e);
  
    } 
        return null;
} 
}
