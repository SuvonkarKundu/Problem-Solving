
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main {
    public static void main (String[]args) throws IOException
    {
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in) );
    // String str1=br.readLine();
     String str1="   Hello world     ".trim();
     String str2=str1.concat("one");
     System.out.println(str2);
     
    }
    
}
