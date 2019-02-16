import java.util.Scanner;



class Processor extends Thread
{
 private volatile boolean running=true;
public void run() {
	while(running)
	{
	System.out.println("Hello");
	try {
		Thread.sleep(100);
		
	} catch (InterruptedException e) {
		e.printStackTrace();
		
	}
}
	
}
public void shurtdown()
{
 running=false;
	
}


}




public class App {

	
	
	public static void main(String[] args) {
		Processor proc1=new Processor();
		proc1.start();
		System.out.println("press return to stop.....");
		Scanner input=new Scanner(System.in);
		input.nextLine();
		proc1.shurtdown();
		
		

	}

	
}
