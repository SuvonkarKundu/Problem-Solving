/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swapping.java;

/**
 *
 * @author Suvonkar kundu
 */
import javax.swing.*;
public class SwappingJava {

    /**
     * @param args the command line arguments
     */
   
       public static void  swap(int[]arr,int i,int j)
       {
      
    int temp = arr[i];
       arr[i]=arr[j];
       arr[j]=temp;   
    
    }
   
    public static void main(String[] args) {
      int arr[]=new int[100];
      for(int i=0;i<3;i++)
      {
           String input=JOptionPane. showInputDialog(arr[i]);
          arr[i]=Integer.parseInt(input);
}
 for(int i=0;i<3;i++)
 System.out.print(arr[i]+" ");
    swap(arr,0,1); System.out.print("\n");

    for(int i=0;i<3;i++) 
     System.out.println(arr[i]+" ");
     System.out.print("\n");
 
}
    
}