/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Suvonkar Kundu
 */
public class TestThreadDaemon extends Thread{

   
    public void run() {
        if(Thread.currentThread().isDaemon())
        {
            System.out.println("Deamon Thread Work");
        
        }
        else 
        {
            System.out.println("User Thread Work");
        
        }
       
    }
    
    public static void main(String[]args)
    {
    
     TestThreadDaemon Deamonobj1=new TestThreadDaemon();
     TestThreadDaemon Deamonobj2=new TestThreadDaemon();
     TestThreadDaemon Deamonobj3=new TestThreadDaemon();
     Deamonobj1.setDaemon(true);
     Deamonobj1.start();
     Deamonobj2.start();
     Deamonobj3.start();
    }
    
    
    
}
