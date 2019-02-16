package threadname;

public class Creatingthreadname extends Thread{
	
	@Override
	public void run() {
		System.out.println("Running...");
	}
	public static void main(String[]args)
 {
	 Creatingthreadname t1=new Creatingthreadname();
	 Creatingthreadname t2=new Creatingthreadname();
	 System.out.println("Name of t1 "+t1.getName());
	 System.out.println("Name of t2 "+t2.getName());
	 System.out.println("Id of t1 "+t1.getId());
	 t1.start();
	 t2.start();
	 t1.setName("Channging Thread");
	 System.out.println("Channging name of t1 "+t1.getName());
	 
	 
 }
}
