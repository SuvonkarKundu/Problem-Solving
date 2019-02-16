
import java.util.Scanner;



public class Main {
    public static void main(String args[])
    {
      int tc,v;
      String s1;
     
      Scanner input=new Scanner(System.in);
     tc=input.nextInt();
     for(int i=1;i<=tc;i++)
     {
        s1=input.nextLine();
         v=s1.length();
         char c=s1.charAt(1);
         char y=s1.charAt(0);
         
         if(v==3&&(c=='w'||c=='e'||c=='o'))
         {
         
           System.out.println(1);
         }
         
     else if(v==3&&y=='t')
         {
           System.out.println(2);
         
         }
     
     else if(v==5&&c=='h')
         {
           System.out.println(3);
         
         }
     }
    }
    
}
