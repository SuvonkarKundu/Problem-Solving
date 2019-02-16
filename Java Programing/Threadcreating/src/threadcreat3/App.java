/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadcreat3;

/**
 *
 * @author Suvonkar Kundu
 */
public class App {
    public static void main(String[] args) {
        
        Thread t1=new Thread(new Runnable() {

           
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

                });
                
        t1.start();
                
                
        
        
    }
    
}
