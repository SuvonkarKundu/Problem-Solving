/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package connectiontest;

//import connectiontest.Adminestorpassword;
import connectiontest.makeconnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Suvonkar Kundu
 */
public class Main {

    public static void main(String[] args) throws SQLException {




        // TODO code application logic here
        Connection connection = makeconnection.getDatabaseConnection();
        
        Adminestorpassword obj1 = new Adminestorpassword();
        
            //Searchdata obj8= new Searchdata();
         
        //String Query="select* from student8";
        /*String Query = "select * from  QKHALL ";
        Statement st = connection.createStatement();
        ResultSet r8 = st.executeQuery(Query);
        while (r8.next()) {
            String name = r8.getString(2);
            System.out.println(name);
        }
        String str = "insert into QKHALL values('ytry','11','cse','11','eyt')";
        st.executeQuery(str);*/
    }
}
