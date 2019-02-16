
import java.util.Scanner;


public class Main {
    
public static void main(String args[])
{
  Scanner input=new Scanner(System.in);
  while(input.hasNextInt())
          {
             int  t,v,result;
             v=input.nextInt();
             t=input.nextInt();
             result=(2*t)*v;
             System.out.println(result);
         
          }
 
}


}
