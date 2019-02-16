/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prime.java;

/**
 *
 * @author Suvonkar kundu
 */
import javax.swing.*;
public class PrimeJava {

    /**
     * @param args the command line arguments
     */
  PrimeJava (int n)
   {      
     int arr[]=new int[100];
     int a=0;
      for(int i=2;i<n;i++)
      {
          for(int j=2;j<i;j++)
          {
            
              if(i%j==0)
                  break;
              if(i==j);
              {
            
             arr[a]=i;
             a++ ;
       }
  

}
       for(int l=0;l<a;l++)
      System.out.println(arr[l]);
    
         }
    
   public static void main(String[] args)  {
      String input=JOptionPane.showInputDialog("The number of n");
      int n=Integer.parseInt(input);
     
 new PrimeJava(n);
      }
}
