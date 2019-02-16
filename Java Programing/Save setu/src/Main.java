
import java.util.Scanner;
public class Main {
    public static void main(String [] args)
    {
      int operation,T=0;
      Scanner input=new Scanner(System.in);
      operation=input.nextInt();
      int count=0;
      for(int i=0;i<operation;i++)
      {
       String str=input.next();
       if(str.startsWith("d"))
       {
         count+=input.nextInt();
       
       }
       if(str.startsWith("r"))
       {
        
         System.out.println(count);
       
       }
      }
    }
    
}
