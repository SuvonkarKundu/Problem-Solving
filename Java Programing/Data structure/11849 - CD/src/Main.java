
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[]args) throws IOException
    {
       BufferedReader input=new BufferedReader(new InputStreamReader(System.in ));
       //StringTokenizer token=new  StringTokenizer(input.readLine());
        HashSet<Integer> jackhash =new HashSet<>();
        HashSet<Integer>jillhash =new HashSet<>();
        int n,r;
        while(true)
        {
          String[] trt= input.readLine().split(" ");
          n=Integer.parseInt(trt[0]);
          r=Integer.parseInt(trt[1]);
          if(n==0&&r==0)
          {
           break;
          }
           for(int i=0;i<n;i++)
           {
            
            jackhash.add(Integer.parseInt(input.readLine()));
           }
             for(int j=0;j<r;j++)
           {
            
            jillhash.add(Integer.parseInt(input.readLine()));
           }
         jackhash.retainAll(jillhash);
         System.out.println(jackhash.size());
        }
    }
}

