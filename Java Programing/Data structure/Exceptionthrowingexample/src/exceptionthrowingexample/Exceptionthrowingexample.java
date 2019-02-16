/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionthrowingexample;

/**
 *
 * @author Suvonkar Kundu
 */
public class Exceptionthrowingexample {

  
    public static void main(String[] args) {
        try
        {
         compute(0);
        }
        catch(Exception e)
        {
        
            System.out.println("Caught Exception: "+e);
        
        }
      
    }
    public static void compute(int s) throws ArithmeticException
    {
    
      if(s==0)
      {
          throw new ArithmeticException("Don't divide by zero");
      }
      else 
      {
        int a=10/s;
          System.out.println("Computation result"+a);
      
      
      }
    
    
    }
    
}
