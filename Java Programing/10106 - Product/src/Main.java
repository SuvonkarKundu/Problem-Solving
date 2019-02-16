
import java.math.BigInteger;
import java.util.Scanner;
class Main
{
 public static void main(String args[])
 {
 BigInteger v,c,result; 
 Scanner input=new Scanner(System.in);
 
 while(input.hasNextBigInteger())
 {
 
 v=input.nextBigInteger();
 c=input.nextBigInteger();
 
 result=v.multiply(c);
 
 System.out.println(result);
 }
 
 }
}