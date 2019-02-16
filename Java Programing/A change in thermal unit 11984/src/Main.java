
import java.util.Scanner;


public class Main {
  
    public static void main(String args[])
    {
      int i,tc;
      double c,d,f,store,result,store1;
      Scanner input=new Scanner(System.in);
     tc=input.nextInt();
      for(i=1;i<=tc;i++)
      {
         c=input.nextFloat();
         d=input.nextFloat();
         f=(1.8*c)+32;
         store=f+d;
         store1=(store-32)*5;
         result=store1/9;
         System.out.println("Case "+i+": "+(String.format("%.02f",result))); 
      }
    }
}
