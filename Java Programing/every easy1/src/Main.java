
import java.math.BigInteger;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int i,N;
        Scanner input=new Scanner(System.in);
        BigInteger A;
        while(input.hasNextInt())
        {
           
            BigInteger sum;
                  N=input.nextInt();

            A=input.nextBigInteger();
     
         sum=BigInteger.ZERO;
        for( i=1;i<=N;i++)
        {
       
        sum=sum.add(BigInteger.valueOf(i).multiply(A.pow(i)));
        
        
        }
        
        
        System.out.println(sum);
        
        }
       
       
    }
}
