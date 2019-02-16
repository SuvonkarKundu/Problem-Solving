package ftpserver;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;


public class Filesend {
	public  static void main(String args[])
	{
		try {
			ServerSocket serversocket=new ServerSocket(500);
			System.out.println("Running......");
			Socket soc=serversocket.accept();
			System.out.println("Clined connected.");
			PrintWriter pw=new PrintWriter(new OutputStreamWriter(soc.getOutputStream()));
			BufferedReader br=new BufferedReader(new InputStreamReader(soc.getInputStream()));
			String dirname="/home/suvonkar/Downloads/Textfile";
			File f1=new File(dirname);
			File f2[]=f1.listFiles();
			Arrays.sort(f2);
			int c=0;
			for(int i=0;i<f2.length;i++)
			{
				if(f2[i].canRead()&&(f2[i].toString().endsWith(".txt")))
			    c++;
			}
			pw.println(""+c+".text file found,listed A-z");
			for(int i=0;i<f2.length;i++)
			{
				if((f2[i].toString().endsWith(".txt")))
				pw.println(" "+f2[i].getName()+" "+f2[i].length()+"bytes");
				pw.println("~");
				pw.flush();
				String tem=br.readLine();
				int temp=Integer.parseInt(tem);
				temp-=48;
				System.out.println("Index: "+temp);
				boolean files=false;
				int index=0;
				if(temp>=0 && temp<=f2.length)
				{
					files=true;
					index=temp;	
				}
				else
				{
					files=false;	
				}
				if(files)
				{
					try {
						File ff=new File(f2[index].getAbsolutePath());
						FileReader fr=new FileReader(ff);
						BufferedReader brf=new BufferedReader(fr);
						String str;
						while((str=brf.readLine())!=null)
						{
							pw.println(str);
						}
						pw.flush();
						if(brf.readLine()==null)
						System.out.println("File Read successfuly. closing socket");
						
						
					} catch (IOException ioe) {
						System.out.println("\n Error in FTP, try again");
					}
					
					
					
				}
				
				br.close();
				soc.close();
				serversocket.close();
				
			}
			 
		} catch (Exception e) {
			System.out.println("\n Connection error please try again");
		}
		
		
		
		
		
		
		
	}

}
