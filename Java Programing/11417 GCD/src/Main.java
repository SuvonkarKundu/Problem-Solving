
import java.util.Scanner;
class Main
 {
     
  public static void main(String args[])
{
    int g;
   int i,j,n,h;
   Scanner input =new Scanner(System.in);
    while(input.hasNextInt())
    {
        n=input.nextInt();
        
Calculating obj=new Calculating();
        g=0;
        if(n==0)
            break;

        for(i=1;i<n;i++)
        {
            for(j=i+1;j<=n;j++)
            {
                h=obj.GCD(i, j);
                g+=h;

            }
        }
System.out.println(g);
    }
     
}
}



class Calculating
{
  int GCD(int a,int b)
  {
    int gcd=0,r=1;
       while(r!=0)
        {
            r=a%b;
            a=b;
            b=r;
            gcd=a;
        }
        return(gcd);
  }
}







 