/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calling.fib.number.java;

/**
 *
 * @author Suvonkar kundu
 */


import javax.swing.*;
public class CallingFibNumberJava {

  public fabonacci(int n)
  {
     
      int a=0,b=1,count=0;
      int arr[]=new int[100];
      for(int i=0;;i++)
      {
      arr[i]=b;
      if(arr[i]>n)
          break;
      }
      System.out.print(arr[i]);
      count++;
      arr[i]=a+b;
      a=b;
      b=arr[i];
  }
//System.out.print(\n);
 System.out.print("no. of elements=" +count);
}
public static void main(String args[])
{

string x=JOptionpane.showInputDialog();
int n=Integer.ParseInt(x); 



}








}

          
    
    
    
    
    
    
    
    
    
    
  
    
    
    
    }    
}
