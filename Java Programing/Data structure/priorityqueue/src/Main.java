
import java.util.PriorityQueue;
import java.util.Scanner;


public class Main {
    public static void main(String[]args)
    {
    Scanner input=new Scanner(System.in);
     PriorityQueue<Long> priority=new PriorityQueue<Long>();
   
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
           System.out.println(priority.poll());
           
         } 
}
    
}
}