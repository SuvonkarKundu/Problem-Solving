
/*public class Main {
    int meth (int i,int j)
    {
     i*=2;
     j/=2;
    return i;
    
    }
    
}

class Callbyvalue
{
    public static void main(String args[])
    {
  Main ob=new Main();
  int a=15,b=20;
 
  ob.meth(a,b);
  System.out.println(+a+" "+b); //no effect values of a and b

}
}*/

// change the value of a and b
class Main
{
  int a,b;
  Main(int i,int j)
  {
    a=i;
    b=j;
  }
        void meth(Main o)
        {
          o.a*=2;
          o.b/=2;
        }
}
class Callbyref
{
 public static void main (String args[])
 {
  Main ob=new Main(15,20);
  System.out.println("ob.a and ob.b before call: "+ob.a+" "+ob.b);
  ob.meth(ob);
  System.out.println("ob.a and ob.b after call: "+ob.a+" "+ob.b);
  
 }
}
        