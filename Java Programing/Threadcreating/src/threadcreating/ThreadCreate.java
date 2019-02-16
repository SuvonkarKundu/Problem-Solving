/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadcreating;

import java.util.logging.Level;
import java.util.logging.Logger;

class BeginT extends Thread
{

    @Override
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
public class ThreadCreate {

   
    public static void main(String[] args) {
       BeginT obj1=new BeginT();
       BeginT obj4=new BeginT();
       obj1.start();
       obj4.start();
        
       
    } 
    
}
