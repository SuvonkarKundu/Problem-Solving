
package set;

import java.util.*;

public class Set {
    public static void main(String[] args) {
        int count[]={34, 22,10,60,30,22};
      HashSet <Integer> obj=new HashSet<Integer>();  
       try
       {
         for(int i=0;i<5;i++)
         {
           obj.add(count[i]);
         }
         System.out.println(obj);
         TreeSet<Integer> objt=new TreeSet<Integer>(obj);
         System.out.println("The sorted list is:");
         System.out.println(objt);
         System.out.println("The First element of This set is: "+(Integer)objt.first());
         System.out.println("The Last element of This set is: "+(Integer)objt.last());
       }
       catch(Exception e)
       {
       
       }
       
    }

}