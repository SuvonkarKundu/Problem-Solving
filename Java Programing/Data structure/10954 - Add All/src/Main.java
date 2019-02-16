
import java.io.IOException;
import java.util.PriorityQueue;
import java.util.Scanner;


public class Main {
    public static void main (String[]args)throws IOException
    {
      Scanner input=new Scanner(System.in);
      PriorityQueue<Long> priority=new PriorityQueue<Long> ();
      StringBuilder builder=new StringBuilder("");
      int n;
      n=input.nextInt();
      while(true)
      {
          long sum=0,value;
          if(n==0)
          {
             break;
          }
          
      for(int i=0;i<n;i++)
      {
        value=input.nextLong();
        priority.add(value);
      }
      long x,y;
     while(priority.size()>1)
     {
        x=priority.remove();
        y=priority.remove();
        priority.add(x+y);
        sum+=(x+y);
     }
     
    builder.append(sum).append("\n");
    }
  System.out.print(builder);  
}
}
