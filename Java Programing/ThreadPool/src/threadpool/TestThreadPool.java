
package threadpool;

import java.util.concurrent.ExecutorService;
import java.util.logging.Level;
import java.util.logging.Logger;


public class TestThreadPool implements Runnable{

   private String message;

    public TestThreadPool(String s) {
        this.message = s;
    }
   

   
    public void run() {
        System.out.println(Thread.currentThread().getName()+"(Start) message"+message);
        Processmassage();
        System.out.println(Thread.currentThread().getName()+"(End)");
        
    }
    private void Processmassage()
    {
    
       try {
           Thread.sleep(2000);
       } catch (InterruptedException ex) {
          ex.printStackTrace();
       }
    }
    
}

 
