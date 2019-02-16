
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {
    public static void main(String[]args)
    {
      Scanner input=new Scanner(System.in);
      ArrayList<Integer> list=new ArrayList<Integer>();
      while(input.hasNextInt())
      {
        int number;
        number=input.nextInt();
        if(number==0)
            break;
        list.add(number);
        Collections.sort(list);
        int median=(list.size()>1&& list.size()%2==0?(list.get((list.size()-1)/2)+list.get(list.size()/2))/2:(list.get((list.size()-1)/2)));
        System.out.println(median);
      }
    }   
}
