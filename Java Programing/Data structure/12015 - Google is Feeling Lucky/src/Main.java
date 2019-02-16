
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[]args) throws IOException
    {
        int tc;
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        tc=Integer.parseInt(input.readLine());
  
        StringBuilder builder=new StringBuilder();
        for(int i=1;i<=tc;i++)
        {
           int max=0;
           for(int j=0;j<10;j++)
           {
             String google=input.readLine();
             String[] str=google.split(" ");
            if(Integer.parseInt(str[1])>max)
            {
              builder=new StringBuilder();
             builder.append(str[0]);
              max=Integer.parseInt(str[1]);
            }
            else if(Integer.parseInt(str[1])==max)
            {
              builder.append(";");
              builder.append(str[0]);
            }
          
           }
          String [] ch=builder.toString().split(";");
          System.out.println("Case #"+i+":");
          for(int q=0;q<ch.length;q++)
          {
          System.out.println(ch[q]);
          
          }
        }
     
    }
    
}
