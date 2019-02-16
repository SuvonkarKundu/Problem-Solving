
public class Main {
    int stack[]=new int[10];
    int tos;
    Main()
    {
      tos=-1;
    }
    void push(int item)
    {
      if(tos==9)
      System.out.println("Stack is full");
      else
      stack[++tos]=item;
    }
    int pop()
    {
     if(tos<0)
     {
       System.out.println("Stack underfull");
       return 0;
     }
     else
         return stack[tos--];
    }
    
}
class teststack
{
  public static void main(String args[])
  {
   Main mystack1=new Main();
   Main mystack2=new Main();
   for(int i=0;i<10; i++)
       mystack1.push(i);
   for(int i=10;i<20;i++)
       mystack2.push(i);
   System.out.println("Stack in mystack1");
   for(int i=0;i<10;i++)
       System.out.println(mystack1.pop());
     System.out.println("Stack in mystack2");
   for(int i=0;i<10;i++)
       System.out.println(mystack2.pop());
  }
}
