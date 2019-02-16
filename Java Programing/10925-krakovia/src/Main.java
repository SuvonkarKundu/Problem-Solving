
import java.math.BigInteger;
import java.util.Scanner;
public class Main {
    public static void main(String[]args)
    {
      int n,f;
      BigInteger v,sum,q;
      Scanner c=new Scanner(System.in);
      int j = 0 ;
    while(c.hasNextInt())
      {
          j++ ;
      n=c.nextInt();
      f=c.nextInt();
      if(n==0&&f==0) {
              break;
          }
        sum=BigInteger.ZERO;          
      for(int i=1;i<=n;i++)
      {
        v=c.nextBigInteger();
        sum=sum.add(v);
      }
      q=sum.divide(BigInteger.valueOf(f));
     System.out.printf("Bill #%d costs %d: each friend should pay %d\n\n",j,sum,q);
      }
    }  
}
