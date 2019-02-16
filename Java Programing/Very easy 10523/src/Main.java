import java.math.BigInteger;
import java.util.Scanner;

public class Main
{ 
    public static void main(String args[])
    {
   Scanner input=new Scanner(System.in);       
BigInteger Main;
for(int i=1; ;i++)
{
 Main=input.nextBigInteger();
 if(Main.equals(BigInteger.ZERO)) {
        break;
    }
 
 if((Main.mod(BigInteger.valueOf(17))).compareTo(BigInteger.ZERO) == 0)
 {
 System.out.println(1);
 
 }
  else
 {
     System.out.println(0);


}


    }

    }
}