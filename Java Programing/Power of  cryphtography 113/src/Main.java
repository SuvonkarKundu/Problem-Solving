
import java.math.BigInteger;
import java.util.Scanner;


public class Main {
    public static void main(String[]args)
    {
        int t;
       BigInteger h,result,q;
        Scanner input= new Scanner(System.in);
        while(input.hasNextBigInteger())
        {
            t=input.nextInt();
             h=input.nextBigInteger();
           for(int i=1;i<=t;i++)
           {
            q=h.divide(BigInteger.valueOf(t));
            h=q;
           }
            
            System.out.println(h);
        }  
    }
   
}
