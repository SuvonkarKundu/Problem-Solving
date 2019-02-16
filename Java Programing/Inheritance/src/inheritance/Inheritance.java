/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;


public class Inheritance {
int a,b;
void show()
{
  System.out.print("a and b:"+a+""+b);
}
   class V extends Inheritance
   {
  int k;
  void showk()
  {
  System.out.print("k:"+k);
  }
       void sum()
  {
  System.out.print("a+b+k:"+(a+b+k));
  }
   }
}
   class Simpleinheritance
   {
   public static void main(String[] args)
   {
       Inheritance  q=new Inheritance();
  
   }
   }
   

