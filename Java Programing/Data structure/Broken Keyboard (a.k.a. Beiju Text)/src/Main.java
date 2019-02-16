
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class Main {
    public static void main(String[]args) throws IOException
    {
      BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
      ArrayList<Character> link=new ArrayList<>();
      StringBuilder builder=new StringBuilder();
      String str;
      while((str=input.readLine())!=null)
      {
        int index=0;
        char[]chararray=str.toCharArray();
        
         for(char ch: chararray)
         {
           if(ch=='[') {
                 index=0;
             }
           else if(ch==']') {
                index= link.size();
             }
           else
           {
           link.add(index++, ch);
           
           }
         }
           String result="";
           for(char y:link)
           {
            result+=y;
           }
           builder.append(result).append("\n");
              System.out.print(builder);
               builder.setLength(0);
               link.clear();      
      } 
    }    
}
