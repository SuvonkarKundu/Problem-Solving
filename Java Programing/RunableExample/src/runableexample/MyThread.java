/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runableexample;

/**
 *
 * @author Suvonkar Kundu
 */
public class MyThread implements Runnable{
      Thread thread;
    public MyThread(String x) {
        thread= new Thread(this,x);
        if(x.equals("Thread-1")) thread.setPriority(Thread.MAX_PRIORITY);
        else thread.setPriority(Thread.MIN_PRIORITY);
        thread.start();
        
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName()+" "+i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
            
        }
        
    }
    
}
