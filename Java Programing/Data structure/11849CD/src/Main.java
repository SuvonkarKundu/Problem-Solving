
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;
import java.util.TreeSet;


public class Main {
    public static void main(String[]args) throws IOException
    {
      BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        StringBuffer buffer=new StringBuffer("");
      while(true)
      {
       StringTokenizer token=new StringTokenizer(input.readLine());
       int r=Integer.parseInt(token.nextToken());
       int n=Integer.parseInt(token.nextToken());
       if(r==0&&n==0)
       {
         break;
       }
        HashSet<Integer> hash=new HashSet<Integer>();
        for(int i=0;i<r;i++)
        {
          hash.add(Integer.parseInt(input.readLine()));
        
        }
        int count=0;
        for(int j=0;j<n;j++)
        {
           if(hash.contains(Integer.parseInt(input.readLine())))
           {
             count++;
           }
        }
     hash.clear();
      buffer.append(count).append("\n");
      }
      System.out.print(buffer);
    }  
}
