

import java.math.BigInteger;
import java.util.Scanner;


public class Main {
    public static void main(String args[])
    {
        int tc,i;
      BigInteger h,w,a ;
    long p;
      Scanner input=new Scanner(System.in);
      for(i=1;;i++)
      {
        p=input.nextInt();
        a=input.nextBigInteger();
  
       w=h.mod(p);
      
          if( w.compareTo(BigInteger.ZERO)==0)
        {
        System.out.println("yes");
        }    
            
             else
          {
              System.out.println("no");      
      
      }
     
    }  
}
}