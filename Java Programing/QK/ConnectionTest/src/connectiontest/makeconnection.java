package connectiontest;  
import java.sql.*;
import oracle.jdbc.driver.OracleDriver;

public class makeconnection
{
    String name;
public static Connection getDatabaseConnection()
    {
        Connection conn=null;
        
        try {
            Class.forName ("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.toString());
        }
        try {
            
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "01738019184");
            
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return conn;
}

    

    

}
    

