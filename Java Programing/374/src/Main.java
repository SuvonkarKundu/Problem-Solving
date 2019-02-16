
import java.math.BigInteger;
import java.util.Scanner;



public class Main {    
public static void main(String args[])
{

    Scanner input=new Scanner(System.in);
     int T;

    BigInteger result, B,q;
  
  while(input.hasNextBigInteger())
  {
   B=input.nextBigInteger();
   T=input.nextInt(); 
   q=input.nextBigInteger();
  result=(B.pow(T)).mod(q);
  System.out.println(result);

  }
}









}
