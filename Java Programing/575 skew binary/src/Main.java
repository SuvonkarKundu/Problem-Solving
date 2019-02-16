
import java.math.BigInteger;
import java.util.Scanner;

 
public class Main {
 
    public static void main(String[] args)
 { 
 
   Scanner input =new Scanner(System.in);
  BigInteger array[]=new BigInteger[100];
  int j; 
  
   
while(input.hasNextBigInteger())
 {
 BigInteger  sum,n;
   j=0;
   
       
   sum=BigInteger.ZERO;
   
       n=input.nextBigInteger(); 
       if(n.equals(BigInteger.ZERO))
       {
       break;
       
       }

      
       while(n.compareTo(BigInteger.ZERO) != 0 )
  {
      array[j]=n.mod(BigInteger.TEN);
      n=n.divide(BigInteger.TEN);
      j++;  
  }
     
     
     for(int i=j-1;i>=0;i--)
     {
         
   int store=(int)(Math.pow(2,i+1)-1);  
   sum=sum.add(array[i].multiply(BigInteger.valueOf(store)));
    
     }
 System.out.println(sum);
 
 }
 
 }
}

 
 
 
 
 
 
 
 
 
 
 










