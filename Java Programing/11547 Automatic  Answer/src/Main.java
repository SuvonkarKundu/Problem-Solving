
import java.util.Scanner;


public class Main {
    public static void main(String args[])
    {
      int t,n,q,i=1,w,e,r,y,v,j,t1,c;
      int arr[]=new int[100];
      Scanner input= new Scanner(System.in);
      t=input.nextInt();
      while(i<=t)
      {  j=0;
         n=input.nextInt();
           q=n*567;
        w=q/9;
        e=w+7492;
        r=e*235;
        y=r/47;
        c=y-498;
        v=Math.abs(c);
        while(v!=0)
        {
            arr[j]=v%10;
            if(j==1)
            {
          System.out.printf("%d\n",arr[j]);
            }
            v=v/10;
            j++;
 
      }
    i++;
    }
    
    }
}
