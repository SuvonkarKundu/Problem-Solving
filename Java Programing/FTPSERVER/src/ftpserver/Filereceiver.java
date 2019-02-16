package ftpserver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Filereceiver {
    public static void main(String args[])
    {
    	try {
			Socket socket=new Socket("127.0.0.1",500);
			PrintWriter out=new PrintWriter(socket.getOutputStream());
			BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
			String st;
			while((br.read())!='~')
				System.out.println(br.readLine());
			System.out.println("Enter file index no.");
			out.println(bu.read());
			out.flush();
			try {
				BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("Received.txt")));
				while((st=br.readLine())!=null)
					out.write(st);
				out.close();
				if(br.readLine()==null);
				System.out.println("File write successful. close socket");
			} catch (IOException e) {
				
			}
		} catch (Exception e) {
			System.out.println("Server is down, please try again");
			
		} 	
    }
}
