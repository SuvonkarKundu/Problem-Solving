
import java.util.Scanner;


public class Main {
    public static void main(String[]args)
    {
      Scanner input=new Scanner(System.in);
     int tc=input.nextInt();
     for(int i=1;i<=tc;i++)
     {
      int length= input.nextInt();
      int width=input.nextInt();
      int height=input.nextInt();
      if((length<=20&&width<=20&&height<=20))
      {
      System.out.println("Case "+i+": good");
      }
     else
      {
        System.out.println("Case "+i+": bad");
      
      }
     
     }
    }
    
}
