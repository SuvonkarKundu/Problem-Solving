/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package split.method;
import java.lang.String;

public class SplitMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String Str = new String("Welcome-to-Tutorialspoint.com");

      System.out.println("Return Value :" );
      for (String retval: Str.split("-", 2)){
         System.out.println(retval);
      }
      System.out.println("");
      System.out.println("Return Value :" );
      for (String retval: Str.split("-", 3)){
         System.out.println(retval);
      }
      System.out.println("");
      System.out.println("Return Value :" );
      for (String retval: Str.split("-", 0)){
         System.out.println(retval);
      }
      System.out.println("");
      System.out.println("Return Value :" );
      for (String retval: Str.split("-")){
         System.out.println(retval);
    }
}
}