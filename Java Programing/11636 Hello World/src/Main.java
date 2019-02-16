
import java.util.Scanner;
public class Main {
    public static void main(String[]args)
    {
       int count=0,v,t,c=0,n;
       Scanner input=new Scanner(System.in);
       while(input.hasNextInt())
       {   
           t=1;
            v=0;
          n=input.nextInt();
          if(n<0)
          {
              break;
          }
            while(t<n)
		{
		      t=2*t;
		      v++;
		}
	        c++;
            System.out.printf("Case %d: %d\n",c,v);
       }	
       }
    }
    

