
import java.math.BigInteger;
import java.util.Scanner;


public class Main {
    public static void main(String[]args)
    {
       BigInteger result,r;
       int n;
     
       result=BigInteger.ONE;
       Scanner c=new Scanner(System.in);
       while(c.hasNextBigInteger())
       {
          r=c.nextBigInteger();
          n=c.nextInt();
         
        for(int i=1;i<=n;i++)
        {
        result=result.multiply(r);
        }
       
       System.out.println(result);
       
       }
    }   
}
