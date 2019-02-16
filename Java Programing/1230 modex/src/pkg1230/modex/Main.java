package pkg1230.modex;


import java.math.BigInteger;
import java.util.Scanner;
  class Digit {
    
public static BigInteger factorial(BigInteger n)        
{
 if(n.compareTo(BigInteger.ZERO)==0) {
        return (BigInteger.ONE);
    }
 else 
 {
        return(n.multiply(factorial(n.subtract(BigInteger.valueOf(1)))));
  }
 
}        
}    
 public  class Main extends Digit
 {
        
  public static void main(String args[])
  { 
      
     for(int j=1;;j++)
     {
     BigInteger store,store1,n,m,value,result;
     int v = 0;
     Scanner input=new Scanner(System.in);
     n=input.nextBigInteger();
     m=input.nextBigInteger();
     store=factorial(n);
     value=(n.subtract(m));
     store1=factorial(value);
     result=store.divide(store1);
         BigInteger [] array= new BigInteger[100];
               
  while(result.compareTo(BigInteger.ZERO) != 0 )
  {
    array[v]=result.mod(BigInteger.valueOf(10));
    result=result.divide(BigInteger.TEN);
    if(array[v].compareTo(BigInteger.ZERO)!=0)
    {
     System.out.println(array[v]);   
      break;  
    }
  j++;
  
  
  
  
  }
     }
}
  }