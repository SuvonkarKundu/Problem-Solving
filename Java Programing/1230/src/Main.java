
import java.math.BigInteger;
import java.util.Scanner;

public class Main
{
  public static void main(String args[])
  {
     int   tc,y;
     Scanner input=new Scanner(System.in);
     tc=input.nextInt();
     BigInteger result,result1,x,n;
     for(int i=1;i<=tc;i++)
     {
        x=input.nextBigInteger();
        y=input.nextInt();
        n=input.nextBigInteger();
        if(x.compareTo(BigInteger.ZERO)==0)    
        {
            break;
        }
     
     result1=x.pow(y);
         result=result1.mod(n);
     System.out.println(result);
     
     
     
     }
     
  
  }
}
  
  
  
  
  
  
  
  

    