
import java.util.Scanner;
public class Main {
    
public static void main(String args[])
{
   int N,v=3,count,i,result,h;
   Scanner input=new Scanner(System.in);
  for(int j=1; ;j++)
   {count=0;
      N=input.nextInt();
        h=N;
        while(input.hasNextInt())
        {   
          
           if(N%3==0)
           {
           i=N-v+1;
           N=i;
           if(N<=1)
           {
               break;
           }
           count++;
           }
           else
           {
               N=N+1;
               i=N-v+1;
               N=i;
               if(N<=1)
               {
                break;
               }
               count++;
           }
        }
        result=h+count;
  System.out.println(result);

    }


}

   

   
   
   }
  











}
