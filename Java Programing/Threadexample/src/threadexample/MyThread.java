/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadexample;


public class MyThread extends Thread{

    public MyThread(String x) {
        
         super(x);
         this.start();
        
    }

    @Override
    public void run() {
        System.out.println("Current Thread: "+Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            
        }
        System.out.println("After sleep mode");
        
    }
    
    
    
}
