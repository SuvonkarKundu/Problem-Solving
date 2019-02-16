
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
     public static void main(String [] args) throws IOException
    {
      BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
      int tc;
      StringBuffer buffer=new StringBuffer();
      tc=Integer.parseInt(input.readLine());
      for(int i=1;i<=tc;i++)
      {
         String line="";
         StringBuilder builder=new StringBuilder("");
         line=input.readLine();
         char c ='\0' ;
         buffer.append("Case ").append(i).append(": ");
         for(int j=0;j<line.length();j++)
         {
             if(line.charAt(j)>='A'&& line.charAt(j)<='Z')
             {
                if(j>0)
                {
                    int n=Integer.valueOf(builder.toString());
                    builder=new StringBuilder();
                    for(int z=0;z<n;z++)
                    {
                        buffer.append(c);
                    }
                }
                c=line.charAt(j);
             }
             else
             {
               builder.append(line.charAt(j));
             }
   
         }
       int n=Integer.valueOf(builder.toString());
                    for(int z=0;z<n;z++)
                    {
                        buffer.append(c);
                    
                    }
          buffer.append("\n");
          
      
      }
     System.out.print(buffer);
   
    }
}
