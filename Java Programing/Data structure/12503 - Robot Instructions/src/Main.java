
//import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[]args) throws IOException
    {
      Scanner input=new Scanner(System.in);
      int tc=input.nextInt();
       for(int i=1;i<=tc;i++)
       {
         int count=0;
        int instruction=input.nextInt();
         boolean [] condition=new boolean[instruction];
        for(int j=0;j<instruction;j++)
        {
              
          String robot=input.next();
          if(robot.equals("LEFT"))
          {
            condition[j]=false;
            count--;
          
          }
          else if(robot.equals("RIGHT"))
          {
            condition[j]=true;
            count++;
          
          }
         else   
          {
              input.next();
             condition[j]=condition[input.nextInt()-1];
             if(condition[j]==false) {
                 count--;
             }
               else {
                 count++;
             } 
             
          }
        }
       System.out.println(count);
       }
  
    }
    
}
