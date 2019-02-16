
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.TreeSet;


public class Main {
    public static void main(String[]args) throws IOException
    {
       BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
       TreeSet<String> tree=new TreeSet<String>();
       StringBuffer buffer=new StringBuffer("");
       LinkedList<String> linked=new LinkedList<String>();
       String Andy="",Dictionary="";
       while((Andy=input.readLine())!=null)
       {
           StringBuilder builder=new StringBuilder();
           for(int i=0;i<Andy.length();i++)
           {
           if((Andy.charAt(i)>='a'&& Andy.charAt(i)<='z')||(Andy.charAt(i)>='A'&& Andy.charAt(i)<='Z'))
           {
              builder.append(Andy.charAt(i));
           }
           else
           {
             Dictionary=builder.toString().toLowerCase();
             builder=new StringBuilder();
             if(Dictionary.equals(""))
             {
               continue;
             }
            if(!tree.contains(Dictionary))
             {
                 linked.add(Dictionary);
                 tree.add(Dictionary);
             }
           }
      }
           Dictionary=builder.toString().toLowerCase();
             if(Dictionary.equals(""))
             {
               continue;
             }
             if(!tree.contains(Dictionary))
             {
              linked.add(Dictionary); 
              tree.add(Dictionary);
             }
           }
       Collections.sort(linked);
       while(!linked.isEmpty())
       {
       buffer.append(linked.remove()).append("\n");
       }
       System.out.print(buffer);
       }
    }


