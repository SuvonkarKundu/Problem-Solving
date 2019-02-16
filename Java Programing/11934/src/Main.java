
import java.util.Scanner;
public class Main {
    public static void main(String[]args)
    {
       int a,b,c,d,l,n,count,collect,h;
               
       Scanner input = new Scanner(System.in);
       while(input.hasNextInt())
       {
          a=input.nextInt();
          b=input.nextInt();
          c=input.nextInt();
          d=input.nextInt();
          l=input.nextInt();
          if(a==0&&b==0&&c==0&&d==0&&l==0)
              break;
           
        count=0;
        for(n=0;n<=l;n++)
        {
            h=(int)Math.pow(n,2);
            collect=a*h+b*n+c;
            if(collect%d==0)
            {
                count++;
            }
        }
       
       System.out.println(count);
       
       
       }

    }
   
}
