
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeMap;
public class Main {
    public static void main(String[]args) throws IOException
    {
        Scanner input=new Scanner(System.in);
        LinkedList<Long> link=new LinkedList<Long>();
        while(input.hasNext())
        {
          link.add(input.nextLong());
        }
        TreeMap<Long,Integer> tree=new TreeMap<Long,Integer>();
        LinkedList<Long> linked2=new LinkedList<Long>();
        for(int i=0;i<link.size();i++)
        {
          long carry=link.get(i);
         if(tree.containsKey(carry))
         {
           int value=tree.get(carry)+1;
           tree.remove(carry);
           tree.put(carry, value);
            
         }
         else
         {
           tree.put(carry, 1);
           linked2.add(carry);
             
        }
        }
       StringBuilder builder= new StringBuilder();
       for(int j=0;j<linked2.size();j++)
       {
         long Key=linked2.get(j);
          builder.append(Key).append(" ").append(tree.get(Key)).append("\n");
 
       }
    System.out.print(builder);
    
}
}