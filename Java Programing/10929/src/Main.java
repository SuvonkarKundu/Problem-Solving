import java.math.BigInteger;
import java.util.Scanner;

public class Main
{ 
    public static void main(String args[])
    {
   Scanner input=new Scanner(System.in);       
 BigInteger n;
while(input.hasNextBigInteger())
{
 n=input.nextBigInteger();
 if(n.equals(BigInteger.ZERO)) {
        break;
    }
 
 if((n.remainder(BigInteger.valueOf(11))).compareTo(BigInteger.ZERO) == 0)
 {
 System.out.printf("%d is a multiple of 11.\n",n);
 
 }
  else
 {
     System.out.printf("%d is not a multiple of 11.\n",n);


}
}

    }
}