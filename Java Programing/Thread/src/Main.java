abstract class NewThread implements Runnable{
    Thread t;
    NewThread()
    {
        t=new Thread(this,"Demo Thread");
        System.out.println("Child thread" +t);
        t.start();
    }
       public void Run()
       {
          try
          {
            for(int i=5;i>0;i--)
            {
              System.out.println("Child Thread" +i);
              Thread.sleep(500);
            }
          }
       catch(InterruptedException e)
       {
       
          System.out.println("child interrupted");
       }
       System.out.println("Exiting child thread");
       
       
       }
}
class ThreadDemo{
public static void main(String args[])
{
  new NewThread() {

        public void run() {
            throw new UnsupportedOperationException("Not supported yet.");
        }
    };
  
try
{
  for(int i=5;i>0;i--)
  {
      System.out.println("Main Thread" +i);
      Thread.sleep(1000);   
  }
}catch(InterruptedException e)
{
  System.out.println("Main thread interrupted");
    
}
System.out.println("Main thread exiting");
}
}



