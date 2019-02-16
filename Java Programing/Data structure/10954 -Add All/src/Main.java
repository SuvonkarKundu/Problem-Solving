
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[]args)
    {
     Scanner input=new Scanner(System.in);
     PriorityQueue<Long> priority=new PriorityQueue<Long>();
     StringBuilder builder=new StringBuilder("");
     
     int tc;
     while(true)
     {
         tc=input.nextInt();
         if(tc==0)
         {
         break;
         }
         for(int i=0;i<tc;i++)
         {
           priority.add(input.nextLong());
           
         }
         long sum=0,x=0,y=0;
         while(priority.size()>1)
         {
            x=priority.remove();
            y=priority.remove();
            priority.add(x+y);
            sum+=x+y;
         }
        builder.append(sum).append("\n");
        priority.clear();
     }
    
    System.out.print(builder);
    }    
}
