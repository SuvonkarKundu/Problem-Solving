
import java.util.Scanner;



public class Main {
    public static void main(String []args)
    {
       int a,b,count,h,q;
       Scanner input=new Scanner(System.in);
       while(input.hasNextInt())
       {    
           
           count=0;
          a=input.nextInt();
          b=input.nextInt();
          if(a==0&&b==0)
          {
            break;
          }
         for(int i=a;i<=b;i++)
         {
            h=(int)Math.sqrt(i);
            q=h*h;
            if(q==i)
            {
            count++;
            }
             
         }
       
    
        System.out.println(count);
       }
      
    
    
    
    }
    
}
