/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class TestPool {
    public static void main(String[] args) {
       ExecutorService execute= Executors.newFixedThreadPool(5); 
       for(int i=0;i<10;i++)
       {
        Runnable worker=new TestThreadPool(""+i);
        execute.execute(worker);
       
       }
       execute.shutdown();
       while(!execute.isTerminated()){
          // System.out.println("not Terminate");
       
       }
        System.out.println("Finshed all Threads");
    }

   
    
}
 