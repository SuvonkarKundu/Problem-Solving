
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args)
    {
      int tc;
      Scanner input=new Scanner(System.in);
      List<Integer> objlist=new ArrayList<Integer>();
      tc=input.nextInt();
      int [] array=new int [10];
      System.out.println("Lumberjacks:");
      
      for(int i=1;i<=tc;i++)
      {
       int count=0;
        
        for(int j=0;j<10;j++) {
              array[j]=input.nextInt();
          }
        for(int j=1;j<10;j++)
        {
         if(array[j-1]>array[j])
         {
           count++;
           break;
         }
        }
          for( int j=1;j<10;j++)
        {
         if(array[j-1]<array[j])
         {
           count++;
           break;
         } 
        }
        if(count==1)
        {
          System.out.println("Ordered");
        }
        else 
        {
         System.out.println("Unordered");
        
        }
      }
    }
}
    

