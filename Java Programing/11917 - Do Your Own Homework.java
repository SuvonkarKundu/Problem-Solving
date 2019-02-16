
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[]arg) throws ArrayIndexOutOfBoundsException
    {
     Scanner input=new Scanner(System.in);
     StringBuilder builder=new StringBuilder();
     int tc=input.nextInt();
     for(int i=1;i<=tc;i++)
     {
      int subject_number=input.nextInt();
      ArrayList<String> alt=new ArrayList<String>();
      int[]day=new int[subject_number];
      input.nextLine();
      for(int j=0;j<subject_number;j++)
      {
             String[] objt=input.nextLine().split(" ");
             alt.add(objt[0]);
             day[j]=Integer.parseInt(objt[1]);
      
      }
      int d=input.nextInt();
      input.nextLine();
      String sub_subject=input.nextLine();
      builder.append("Case ").append(i).append(": ");
      if(alt.contains(sub_subject))
      {
       int index=alt.indexOf(sub_subject);
       if(day[index]<=d) {
              builder.append("Yesss").append("\n");
          }
       else if(day[index]>d &&day[index]<=d+5)
       {
         builder.append("Late").append("\n");
       }
       else
       {
         builder.append("Do your own homework!").append("\n");
       
       }
      }
       else
       {
       builder.append("Do your own homework!").append("\n");
       }
      
      }
              System.out.print(builder);
      }
    }
    

