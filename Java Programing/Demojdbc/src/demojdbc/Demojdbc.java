
package demojdbc;


import java.sql.*;

/**
 *
 * @author Suvonkar Kundu
 */
public class Demojdbc {

   
    public static void main(String[] args) {
         try
        {
            String Query="select * from student8 where id_=1104040";
      
      Class.forName("oracle.jdbc.OracleDriver"); 
      String url = "jdbc:oracle:thin:@localhost:1521:XE"; 
      Connection conn = DriverManager.getConnection(url,"Suvonkar","01738019184");
      Statement st = conn.createStatement();
      ResultSet r8=st.executeQuery(Query);
      r8.next();
      String name=r8.getString(1104040);
      System.out.println("tree");
      conn.close();
      
    }
    catch (Exception e)
    {
    System.out.println(e);
  
    } 
    
}
    }

