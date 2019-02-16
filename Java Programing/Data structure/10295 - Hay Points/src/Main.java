
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;


public class Main {
    public static void main(String[]args) throws IOException
    {
     BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
     String[] str=input.readLine().split(" ");
     int value=Integer.parseInt(str[0]);
     int value1=Integer.parseInt(str[1]);
     TreeMap<String,Integer> tree=new TreeMap<String,Integer>();
     StringBuffer buffer=new StringBuffer();
     for(int i=0;i<value;i++)
     {
       str=input.readLine().split(" ");
       tree.put(str[0],Integer.parseInt(str[1])); 
     }
     String text ;
     int hayPoints=0;
     while((text = input.readLine()) != null)
     {
         if(text.equals("."))
         {
         buffer.append(hayPoints).append("\n");
         System.out.print(buffer);
         hayPoints=0;
         buffer=new StringBuffer();
         continue;
         }
         StringTokenizer token=new StringTokenizer(text);
         while(token.hasMoreTokens())
         {
           String word=token.nextToken();
           if(tree.containsKey(word))
           {
            hayPoints+=tree.get(word);
           }
         }
    }
     
    }  
}
