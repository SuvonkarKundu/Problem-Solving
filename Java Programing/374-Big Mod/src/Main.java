
import java.math.BigInteger;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        int  t,q ,c;
        BigInteger result,h ;
        Scanner input=new Scanner(System.in);
        while(input.hasNextInt())
        {
          t=input.nextInt();
          q=input.nextInt();
          c=input.nextInt();
         result=BigInteger.valueOf(t).pow(q);
          h=result.mod(BigInteger.valueOf(c));
          System.out.println(h);
        }
    }
}
