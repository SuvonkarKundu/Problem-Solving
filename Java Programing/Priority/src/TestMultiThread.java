
public class TestMultiThread  extends Thread{
	@Override
	public void run() {
		System.out.println("running thread name is: "+Thread.currentThread().getName());
		System.out.println("running thread priority is: "+Thread.currentThread().getPriority());
	}
	public static void main(String[]args)
	{
		TestMultiThread t1=new TestMultiThread();
		
		TestMultiThread t2=new TestMultiThread();
		t1.setPriority(Thread.MIN_PRIORITY);
		t1.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.start();
		
		
		
	}

}
 