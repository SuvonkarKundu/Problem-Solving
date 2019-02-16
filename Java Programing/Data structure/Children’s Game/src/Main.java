
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[]args) throws IOException
    {
    BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
    String str;
     ArrayList<String> list;
     StringTokenizer token;
     StringBuilder builder=new StringBuilder();
    while((str=(input.readLine()))!=null)
    {
    int n=Integer.parseInt(str);
    if(n==0)
    {
       break;
    }
    token=new StringTokenizer(input.readLine());
    list=new ArrayList<>();
    for(int i=0;i<n;i++)
    {
      list.add(token.nextToken());
    }
    Collections.sort(list,new Comparator<String>(){
            public int compare(String first,String second)
            {
              if(first.length()==second.length()) {
                    return -(first.compareTo(second));
                }
              else {
                    return -((first+second).compareTo(second+first));
                }
            }
    });
    for(int j=0;j<n;j++)
    {
     builder.append(list.get(j));
    }
    builder.append("\n");
    }
  System.out.print(builder);
}
}