
import java.util.Scanner;
public class Main {
    public static void main(System [] args)
    { Scanner input=new Scanner(System.in);
       String str;
      int n=input.nextInt();
      
       int y,sum,i,j;
      
       while(input.hasNextLine())
       {
         sum=0;
         str=input.nextLine();
        String tr =str;
       for(i=0;i<tr.length();i++)
    {
      if(tr.charAt(i) =='a')
      {
          sum+=1;
      }
     if(tr.charAt(i)=='b')
      {
          sum+=2;
      }
    if(tr.charAt(i)=='c')
      {
          sum+=3;
      }
      if(tr.charAt(i)=='d')
      {
          sum+=4;
      }

    if(tr.charAt(i)=='e')
      {
          sum+=5;
      }
      if(tr.charAt(i)=='f')
      {
          sum+=6;
      }
    if(tr.charAt(i)=='g')
      {
          sum+=7;
      }
      if(tr.charAt(i)=='h')
      {
          sum+=8;
      }
      if(tr.charAt(i)=='i')
      {
          sum+=9;
      }
      if(tr.charAt(i)=='j')
      {
          sum+=10;
      }
      if(tr.charAt(i)=='k')
      {
          sum+=11;
      }
      if(tr.charAt(i)=='l')
      {
          sum+=12;
      }
      if(tr.charAt(i)=='m')
      {
          sum+=13;
      }
      if(tr.charAt(i)=='n')
      {
          sum+=14;
      }
      if(tr.charAt(i)=='o')
      {
          sum+=15;
      }
      if(tr.charAt(i)=='p')
      {
          sum+=16;
      }
      if(tr.charAt(i)=='q')
      {
          sum+=17;
      }
      if(tr.charAt(i)=='r')
      {
          sum+=18;
      }
      if(tr.charAt(i)=='s')
      {
          sum+=19;
      }
      if(tr.charAt(i)=='t')
      {
          sum+=20;
      }
      if(tr.charAt(i)=='u')
      {
          sum+=21;
      }
      if(tr.charAt(i)=='v')
      {
          sum+=22;
      }if(tr.charAt(i)=='w')
      {
          sum+=23;
      }
      if(tr.charAt(i)=='x')
      {
          sum+=24;
      }
      if(tr.charAt(i)=='y')
      {
          sum+=25;
      }
      if(tr.charAt(i)=='z')
      {
          sum+=26;
      }
     if(tr.charAt(i)=='a')

     if(tr.charAt(i)=='A')
      {
          sum+=27;
      }
     if(tr.charAt(i)=='B')
      {
          sum+=28;
      }
    if(tr.charAt(i)=='C')
      {
          sum+=29;
      }
      if(tr.charAt(i)=='D')
      {
          sum+=30;
      }

    if(tr.charAt(i)=='E')
      {
          sum+=31;
      }
      if(tr.charAt(i)=='F')
      {
          sum+=32;
      }
    if(tr.charAt(i)=='G')
      {
          sum+=33;
      }
      if(tr.charAt(i)=='H')
      {
          sum+=34;
      }
      if(tr.charAt(i)=='I')
      {
          sum+=35;
      }
      if(tr.charAt(i)=='J')
      {
          sum+=36;
      }
      if(tr.charAt(i)=='K')
      {
          sum+=37;
      }
      if(tr.charAt(i)=='L')
      {
          sum+=38;
      }
      if(tr.charAt(i)=='M')
      {
          sum+=39;
      }
      if(tr.charAt(i)=='N')
      {
          sum+=40;
      }
      if(tr.charAt(i)=='O')
      {
          sum+=41;
      }
      if(tr.charAt(i)=='P')
      {
          sum+=42;
      }
      if(tr.charAt(i)=='Q')
      {
          sum+=43;
      }
      if(tr.charAt(i)=='R')
      {
          sum+=44;
      }
      if(tr.charAt(i)=='S')
      {
          sum+=45;
      }
      if(tr.charAt(i)=='T')
      {
          sum+=46;
      }
      if(tr.charAt(i)=='U')
      {
          sum+=47;
      }
      if(tr.charAt(i)=='V')
      {
          sum+=48;
      }if(tr.charAt(i)=='W')
      {
          sum+=49;
      }
      if(tr.charAt(i)=='X')
      {
          sum+=50;
      }
      if(tr.charAt(i)=='Y')
      {
          sum+=51;
      }
      if(tr.charAt(i)=='Z')
      {
          sum+=52;
      }
    }
         for(int v=2;v<=sum;v++)
        {

            if(sum%v!=0)
            {
                continue;
            }
       if(sum==v)
        {
           System.out.printf("it is priem word\n");
        }
        else
        {
        System.out.printf("it is not priem word\n");
        }
        break;

        }
       }
    }
}












       
       
       
       
       
       
       
       
       
       
       
     
    
    
    
    
    
    
    
    
   
            
    

