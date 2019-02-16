
import java.util.Scanner;
public class Main {
    public static void main(String []args)
    {
      Scanner input=new Scanner(System.in);
      double n ,result;
      long  result1;
       while(input.hasNextDouble())
       {
        n=input.nextDouble();
        if(n%2==0)
        {
             result=(Math.ceil(n/2));
             result1=(new Double(result)).longValue();
        }
        else
        {
        result=(Math.ceil(n/2))*(-1); 
        result1=(new Double(result)).longValue();
        }
        System.out.println(result1);
       }
    }
    
}
