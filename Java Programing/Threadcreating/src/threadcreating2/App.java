/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadcreating2;

/**
 *
 * @author Suvonkar Kundu
 */
public class App implements Runnable{
   
    public void run() {
         for(int i=0;i<10;i++)
       {
           System.out.println("Hello " +i);
       
           try {
               Thread.sleep(1000);
           } catch (InterruptedException ex) {
               ex.printStackTrace();
//Logger.getLogger(BeginT.class.getName()).log(Level.SEVERE, null, ex);
           }
       
       }
    }
    
}
 class Running {
    public static void main(String[] args) {
        Thread obj5=new Thread(new App());
          Thread obj8=new Thread(new App());
          obj5.start();
          obj8.start();
    }
    
}
    

