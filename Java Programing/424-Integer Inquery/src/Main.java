
import java.math.BigInteger;
import java.util.Scanner;
public class Main {
    public static void main(String[]args)
    {
       BigInteger sum  ,c;
      sum=BigInteger.valueOf(0);
       Scanner t=new Scanner(System.in);
    while(t.hasNextBigInteger())
    { 
      c=t.nextBigInteger();
      if(c.equals(BigInteger.ZERO))
          break;
     sum=(sum.add(c));
    }
    System.out.println(sum);
    
    }
    
}
