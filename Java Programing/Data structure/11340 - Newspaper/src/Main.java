
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
public class Main {
    public static void main(String[]args) throws IOException
    {
     BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
     HashMap<Character,Integer>hash=new HashMap<Character,Integer>();
     int tc=Integer.parseInt(input.readLine());
     for(int j=1;j<=tc;j++)
     {
      int k=Integer.parseInt(input.readLine());
      for(int i=1;i<=k;i++)
      {
             String[]array=input.readLine().split(" ");
           hash.put(array[0].charAt(0),Integer.parseInt(array[1]) );
    
      }
      int t=Integer.parseInt(input.readLine());
      double ans=0;
      for(int i=0;i<t;i++)
      {
         char[] line=input.readLine().toCharArray();
         for(Character c: line)
         {
           if(hash.containsKey(c))
           {
              ans+=hash.get(c);
           }
         
         }
      }
     ans/=100.00;
    System.out.printf("%.2f$\n", ans);
    hash.clear();
     }
    }   
}
