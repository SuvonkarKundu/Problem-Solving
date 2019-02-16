
public class Main {
    
    int a;
    Main(int i)
    {
       a=i;
    }
  Main incrByTen()
  {
     Main temp=new Main(a+10);
     return temp;
  }
}
class Retob
{
  public static void main(String[]args)
  {
   Main obj1=new Main(2);
   Main obj2;
   obj2=obj1.incrByTen();
   System.out.println("obj1.a: "+obj1.a);
   System.out.println("obj2.a: "+obj2.a);
   obj2=obj2.incrByTen();
   System.out.println("obj2.a after scond increase: "+obj2.a);
  
  
  }




}


