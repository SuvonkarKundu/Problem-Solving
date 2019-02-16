/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacce.java;

/**
 *
 * @author Suvonkar kundu
 */
import javax.swing.*;
public class FibonacceJava {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String args[])  {
        String input = JOptionPane.showInputDialog("The number n =");
         long n=Integer.parseInt(input);
          long a=0,b=1,c,d;
        for(d=0;d<n;d++)
        {
            if(d<=1)
                c=d;
        else
            {
                c=a+b;
                a=b;
                b=c;
            }
            System.out.println("The number n="+c); 
        }
       
       
    }
}
