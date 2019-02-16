
package thread1;


abstract public class Thread1 implements Runnable {

   String name;
   Thread t;
   
Thread1(String threadname)
{
name=threadname;
t=new Thread(this,name);
System.out.println("New thread: " +t);
t.start();
} 
 public void run()
 {
   try{
   
      for(int i=5;i>0;i--)
      {
         System.out.println(name+": "+i);
         Thread.sleep(1000);
      }
   }
 
  catch(InterruptedException e)
       {
           System.out.println(name+ "Interrupted");
       }
        System.out.println(name+ "exiting");
 }
}
class MultiThreadDemo
{
public static void main(String args[])
{
 
        //throw new UnsupportedOperationException("Not yet implemented");
    
    
    new NewThread("one");
new NewThread("Two");
new NewThread("Three");
try
{
  Thread.sleep(100000);
throw new UnsupportedOperationException("Not yet implemented");

}

catch(InterruptedException e)
{
  System.out.println("Main thead exiting");

}

}
}