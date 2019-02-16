

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
public class Main {
    public static void main(String[]args)
    {
      Scanner input=new Scanner(System.in);
      Stack<Integer> stra=new Stack();
      PriorityQueue<Integer> priority=new PriorityQueue();
      Queue<Integer> que=new LinkedList();
      StringBuffer buffer=new StringBuffer("");
      int tc,command,value;
      Boolean q,pq,st;
      while(input.hasNext())
      {
      tc=input.nextInt();
     /* if(tc==0)
      {
       break;
      }*/
      q=pq=st=true;
      stra.clear();
      priority.clear();
      que.clear();
      for(int i=0;i<tc;i++)
      {
        command=input.nextInt();
        value=input.nextInt();
        if(command==1)
        {
           stra.push(value);
           priority.add(-value);
           que.add(value);
        }
        else
        {
          if(st)
          {
            if(stra.isEmpty())
            {
              st=false;
            }
            else
            {
            if(stra.pop()!=value)
            {
              st=false;
            }
            }
          }
          if(pq)
          {
              if(priority.isEmpty())
              {
              pq=false;
              }
              else
              {
               if(-1*priority.poll()!=value)
              {
               pq=false;
              }
              }
          }
          if(q)
          {
            if(que.isEmpty())
            {
             q=false;
            }
            else
            {
             if(que.poll()!=value)
             {
               q=false;
             }
            }
          }
        }
      }
       if(!st && !pq && !q)
        {
          buffer.append("impossible\n");
        }
        else if(st && !(q || pq))
        {
          buffer.append("stack\n");
        }
        else if(pq && !(st||q))
        {
          buffer.append("priority queue\n");
        }
         else if(q &&! (st||pq))
        { 
          buffer.append("queue\n");
        }
        else
         {
           buffer.append("not sure\n");
         }
      
      }
       System.out.print(buffer);
    }   
}
