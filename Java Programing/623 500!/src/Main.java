
import java.math.BigInteger;
import java.util.Scanner;



public class Main
{
public static void main(String []args)
{
   int i,n;
   BigInteger result;
   Scanner input=new Scanner(System.in);
   while(input.hasNextBigInteger())
   {  
       result=BigInteger.valueOf(1);
       n=input.nextInt();
       for(i=1;i<=n;i++)
       {
        result=result.multiply(BigInteger.valueOf(i));
   }
   System.out.printf("%d!",n);
   System.out.println(); 
   System.out.println(result);
   }
}
    
}
