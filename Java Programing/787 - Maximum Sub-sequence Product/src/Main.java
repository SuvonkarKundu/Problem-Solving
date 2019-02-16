
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
 public static void main(String[]args)
 {
     ArrayList<BigInteger> list=new ArrayList<BigInteger>();
     BigInteger end,number,product,maxproduct;
     Scanner input=new Scanner(System.in);
     end=new BigInteger("-999999");
     while(input.hasNext())
     {
      number=BigInteger.valueOf(input.nextInt());
         
         if(number.compareTo(end)!=0)
             list.add(number);
         else
         {
             maxproduct=list.get(0);
         for(int i=0;i<list.size();i++)
         {
           product=BigInteger.ONE;
           for(int j=i;j<list.size();j++)
           {
               product=product.multiply(list.get(j));
               maxproduct=maxproduct.max(product);               
           }
         }
             System.out.println(maxproduct);
             list.clear();
         }
     
     }

 }

}
