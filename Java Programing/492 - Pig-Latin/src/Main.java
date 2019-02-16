
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Main {
    public static void main(String [] args) throws IOException
    {
      //BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Scanner input=new Scanner(System.in);
        StringBuffer builder= new StringBuffer();
        StringBuffer builder2= new StringBuffer();
        char firstchar;
      String latin;
      String con="ay",result;
      while((latin=input.next())!=null)
      {
          
        for(int i=0;i<latin.length();i++)
        {
          char ch=latin.charAt(i);
          if(ch=='a'||ch=='i'||ch=='o'||ch=='u'||ch=='e'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
          {
            result=latin.concat(con);
            builder.append(result).append(" ");
          }
          else
          {
            builder.append(latin.charAt(i+1));
            builder.append(latin.charAt(0)).append(con).append(" ");
          }
     
         }  
      }
    System.out.println(builder);
   
    }

   
    
}
