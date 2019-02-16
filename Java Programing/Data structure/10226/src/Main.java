
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;


public class Main {
    public static void main(String[]args) throws IOException
    {
      String hardwood;
      int tc,totalcount=0;
      BufferedReader input=new  BufferedReader(new InputStreamReader(System.in));
      TreeMap<String,Integer>  tree=new TreeMap();    
      tc=input.read();
      input.readLine();
      //input.readLine();
     for(int i=0;i<tc;i++)
      {
          if(i!=0)
          {
            System.out.println();
          }
          while((hardwood=input.readLine())!=null)
          {
        if(hardwood.length()==0)
        {
            break;
        }
          totalcount++;
        if(tree.containsKey(hardwood))
        {
          tree.put(hardwood, tree.get(hardwood)+1);
        }
        else
        {
       tree.put(hardwood, 1);
        }
      }
    StringBuilder sb= new StringBuilder();
    
     Set<Entry<String, Integer>> stockSet = tree.entrySet();
             
     Iterator<Entry<String, Integer>> objt= stockSet.iterator();
             
            while(objt.hasNext())
            {
                Entry<String,Integer> rt=objt.next();
                double fraction=((double)rt.getValue()/totalcount)*100;
                DecimalFormat df=new DecimalFormat("0.0000");
                sb.append(rt.getKey()+" "+df.format(fraction));
                sb.append("\n");
            }
    System.out.print(sb);
    }
    }       
}
