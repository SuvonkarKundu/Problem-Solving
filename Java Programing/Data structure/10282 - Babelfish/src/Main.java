
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;


public class Main {
    public static void main(String[]args) throws IOException
    {
     BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
     String english_foreign="";
     LinkedHashMap<String,String> link=new LinkedHashMap<String,String>();
     while((english_foreign=input.readLine())!=null)
     {
       if(english_foreign.trim().equals(""))
       {
        break;
       }
       String []str=english_foreign.split(" ");
       link.put(str[1],str[0]);
     }
     StringBuffer buffer= new StringBuffer();
     String foreign;
     while((foreign=input.readLine())!=null)
     {
      foreign=foreign.trim();
      if(link.containsKey(foreign))
      {
       buffer.append(link.get(foreign)).append("\n");
      
      }
     else
      {
        buffer.append("eh").append("\n");
      
      }
     
     
     }
    
    System.out.print(buffer);
    
    
    }
    
}
