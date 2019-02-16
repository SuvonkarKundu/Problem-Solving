
import java.util.Scanner;



public class Main {
    
public static void main(System args[])
{
   int a,b,c,h,t,q,v=2;
   Scanner input=new Scanner(System.in);
   while(input.hasNextInt())
   {
       a=input.nextInt();
       b=input.nextInt();
       c=input.nextInt();
       if(a==0&&b==0&c==0)
       {
        break;
       }
          
  if(a>b&&a>c)
    {
      h=a;
      if(Math.pow(h,2)==Math.pow(b,2)+Math.pow(c,2))
      {
         System.out.println("right");
      }
      else
      {
          System.out.println("wrong"); 
      }
      }
     else if(b>a&&b>c)
     {
         t=b;

        if(Math.pow(t,2)==Math.pow(a,2)+Math.pow(c,2))
      {
        System.out.println("right");
      }
      else
        {
            System.out.println("wrong");
        }
     }
  else
  {
        if(Math.pow(c,2)==Math.pow(a,2)+Math.pow(b,2))
      {
            System.out.println("right");
      }
      else
        {
            System.out.println("wrong");
        }
   
   }

   }
}
}





















