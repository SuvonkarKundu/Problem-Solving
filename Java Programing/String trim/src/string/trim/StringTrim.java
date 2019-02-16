/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package string.trim;
import java.io.*;
public class StringTrim {
    public static void main(String[] args) 
    throws IOException
    {
                      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                      String str;
                      System.out.println("Enter 'Stop' to quit.");
                      System.out.println("Enter State" );
                      do{
                          str=br.readLine();
                          str=str.trim();
                          if(str.equals("Illinois"))
                          {
                            System.out.println("capital is springfield");
                          }
                          else if(str.equals("Missouri"))
                          {
                            System.out.println("capital is jefferson city");
                          }
                          else if(str.equals("california"))
                          {
                          
                          System.out.println("capital is scaromento");
                          
                          }
                          else if(str.equals("Washington"))
                          {
                          System.out.println("capital is Olympia");
                          }
                       
                      }while(!str.equals("stop"));
    }
}
 