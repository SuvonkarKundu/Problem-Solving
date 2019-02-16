

import java.util.Scanner;


public class Main {
    
   
    public static void main(String args[])
    {
     String arr;
     int count=1;
     Scanner input= new Scanner(System.in);
     String s1="HELLO";
     String s2="HOLA";
     String s3="HALLO";
     String s4="BONJOUR";
     String s5="CIAO";
     String s6="ZDRAVSTVUJTE";
     String s7="#";
     while(input.hasNextLine())
     {
            arr=input.nextLine();
            if(arr.equals(s7))
            {
             break;
            }
            if(arr.equals(s1))
            {
              System.out.printf("Case %d: ENGLISH",count);
            
            }
       
            else if(arr.equals(s2))
            {
              System.out.printf("Case %d: SPANISH",count);
            
            }
            else if(arr.equals(s3))
            {
              System.out.printf("Case %d: GERMAN",count);
            
            }
     
            else if(arr.equals(s4))
            {
              System.out.printf("Case %d: FRENCH",count);
            
            }
     
           else if(arr.equals(s5))
            {
              System.out.printf("Case %d: ITALIAN",count);
            
            }
           else if(arr.equals(s6))
            {
              System.out.printf("Case %d: RUSSIAN",count);
            
            }
           else 
            {
              System.out.printf("Case %d: UNKNOWN",count);
            
            }
           count++;
           System.out.printf("\n"); 
     }
            
    }
}
