
package constructor.pkg1;
import javax.swing.*;
class kundu
{
      int a=0,b=1,c,n,count=0;
      int array[]=new int[100];
      kundu(int t)
 {
        for(c=0;c<n;c++)
   {
   if(c<=1)
       array[c]=c;
   else
       array[c]=a+b;
   a=b;
   b=array[c];
   }

        
           for(int i=3;i<=n;i++)
{
  if(array[i]==2)
      count++;
  else if(array[i]%2==0)
continue;
  else
      count++;
 
}   

            
 }
        }



public class Constructor1
{
  

    public static void main(String[] args) 
    {
       String input =JOptionPane.showInputDialog("The value of n:");
       int n=Integer.parseInt(input);
       kundu prime=new kundu(n);
       System.out.println(+count+);
    }
}
