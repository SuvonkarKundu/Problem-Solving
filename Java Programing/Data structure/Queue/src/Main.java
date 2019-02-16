
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Suvonkar Kundu
 */
public class Main {
    public static void main(String[]args)
    {
      Queue<Integer> obj1= new ArrayBlockingQueue<Integer>(3);
      
      obj1.add(10);
      obj1.add(20);
      obj1.add(30);
      System.out.println("Head of the queue"  +  obj1.element());
      try{
      
      obj1.add(40);
      }
     catch(IllegalStateException e)
     {
      System.out.println("Tried to add too many items to the queue");
     }
     for(Integer value: obj1)
     {
      System.out.println(value);
     
     }
     System.out.println("Remove from the queue:"+obj1.remove());
     System.out.println("Remove from the queue:"+obj1.remove());
     System.out.println("Remove from the queue:"+obj1.remove());
     try{
     System.out.println("Remove from the queue:"+obj1.remove());
     }
     catch(NoSuchElementException e)
     {
        System.out.println("Tried to remove too many items from the queue");
     
     }
       Queue<Integer> obj2= new ArrayBlockingQueue<Integer>(2);
       System.out.println("Queue 2 peek "+obj2.peek());
       obj2.offer(10);
       obj2.offer(20);
       System.out.println("Queue 2 peek "+obj2.peek());
       if(obj2.offer(30)==false)
       {
         System.out.println("offer failed to add third item");
       }
       System.out.println("Queue 2 poll : "+obj2.poll());
       System.out.println("Queue 2 poll : "+obj2.poll());
       System.out.println("Queue 2 poll : "+obj2.poll());
       
       
       
    
    }
    
}
