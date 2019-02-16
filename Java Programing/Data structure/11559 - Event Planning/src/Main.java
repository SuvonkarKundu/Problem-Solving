
import java.util.Scanner;


public class Main {
    public static void main(String[]args)
    {
      Scanner input=new Scanner(System.in);
      int n,b,h,w,cost=500050;
      while(input.hasNextInt())
      {
        n=input.nextInt();
        b=input.nextInt();
        h=input.nextInt();
        w=input.nextInt();
        for(int j=1;j<=h;j++)
        {
          int price=input.nextInt();
          for(int i=1;i<=w;i++)
          {
           int room=input.nextInt();
          int t=0;
          if(room>n)
          {
            t=n*price;
            if(cost>t)
            {
              cost=t;
            }
          }     
          }
        }
      
      if(cost>b)
      {
        System.out.println("stay home");
      }
      else
      {
      
        System.out.println(cost);
      }
      cost=500050;
      }
    }
    
}
