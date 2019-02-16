
public class CreatingThreadwithSleep  extends Thread{
	
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
			CreatingThreadwithSleep t1=new CreatingThreadwithSleep();
			CreatingThreadwithSleep t2=new CreatingThreadwithSleep();
			t1.start();
			t2.start();		
		}
	

}
