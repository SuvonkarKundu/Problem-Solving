package createjoin;



public class CreatingJoinMethod extends Thread{
	public void run() {
		
		for(int i=1;i<=5;i++)
		{
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);	
		}
		
	}
	public static void main(String[]args)
	{
		CreatingJoinMethod  obj1=new CreatingJoinMethod();
		CreatingJoinMethod  obj2=new CreatingJoinMethod();
		CreatingJoinMethod  obj3=new CreatingJoinMethod();
		obj1.start();
		try {
			obj1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		obj2.start();
		obj3.start();
	
	}


}
