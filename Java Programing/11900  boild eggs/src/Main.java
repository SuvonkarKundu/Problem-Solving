

import java.util.Scanner;
public class Main {
   public static void main(String[]args)
   {
      int n,p,q,t,h,g,count;
      Scanner input=new Scanner(System.in);
      int[] weight=new int[100];
      t=input.nextInt();
      for(int i=1;i<=t;i++)
      {     g=1;
           count=0;
           int sum=0;
            n=input.nextInt();
           p=input.nextInt();                     
            q=input.nextInt();
            for(int k=1;k<=n;k++)
            {
              weight[k]=input.nextInt();
              sum+=weight[k];
            } 
           if(sum==n)
           {
            System.out.printf("Case %d: %d\n",i,n);
           }
           else if(sum<=q&&p<=n)
           {
           System.out.printf("Case %d: %d\n",i,p);
           }
            else
           {
            for(int j=1;j<=n;j++)
            {
               h=weight[j]*j;
               g=g*h;
            if(g<=q)
            {
              count++;
            }
            else
            {
             break;
            }
            }
           System.out.printf("Case %d: %d\n",i,count);
           }         
      }
   
   }
     
}
