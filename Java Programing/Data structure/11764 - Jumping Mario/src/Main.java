
import java.util.Scanner;


public class Main {
    public static void main(String[]args)
    {
      Scanner input=new Scanner(System.in);
      int tc;
      tc=input.nextInt();
    
      int[]array=new int[50];
      for(int i=1;i<=tc;i++)
      {
          int high_jump=0;
          int low_jump=0;
            int n=input.nextInt();
      for(int j=0;j<n;j++)
      {
        array[j]=input.nextInt();
      }
      for(int j=1;j<n;j++)
      {
        if(array[j-1]<array[j])
        {
         high_jump++ ;
        }
        else if(array[j-1]>array[j])
        {
          low_jump++; 
        }
      
      }
     
   
      System.out.println("Case "+i+": "+high_jump+" "+low_jump);
      }  
}
}
