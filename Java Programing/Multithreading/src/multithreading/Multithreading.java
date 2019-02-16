/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading;

/**
 *
 * @author Suvonkar kundu
 */
public class Multithreading extends Thread
{
   public void run()
   {
       try{
        Thread.sleep(10000);
           for(int i=1;i<=10;i++)
       {
      
          System.out.println(i);
       
       }
       }
   catch(Exception e)
           {
              System.out.println("this is thread programming");
           
           }
   }
}
  class A extends Thread
{
   public void run()
   {
       try{
       for(int j=1;j<=10;j++)
       {
       
          System.out.println(j);
       
       }
       }
   catch(Exception e)
           {
              System.out.println("this is thread programming");
           
           }
   }
}
 class B extends Thread
{
   public void run()
   {
       try{
       for(int j=1;j<=10;j++)
       {
       
          System.out.println(j);
       
       }
       }
   catch(Exception e)
           {
              System.out.println("this is thread programming");
           
           }
   }
}
     
    
   class threadtest
   {
      
       public static void main(String[] args) 
       {
          new Multithreading().start();
         new A().start();
       new B().start();
    }

   
   }

  
