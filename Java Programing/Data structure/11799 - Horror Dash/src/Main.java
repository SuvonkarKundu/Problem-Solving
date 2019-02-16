
import java.util.Scanner;
public class Main {
    public static void main(String[]args)
    {
       Scanner input=new Scanner(System.in);
       int tc;
       tc=input.nextInt();
       for(int j=1;j<=tc;j++)
       { int max=0;
         int no_of_paticipent=input.nextInt();
         for(int i=0;i<no_of_paticipent;i++)
         {
             int number=input.nextInt();
            if(number>max)
            {
              max=number;
            }
         }
         System.out.println("Case "+j+": "+max);
       
       }
    }
    
}
