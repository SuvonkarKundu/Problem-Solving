
package natural.sorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

class Person implements Comparable<Person>
{
  public String name;
  public Person(String name)
  {
   this.name=name;
  
  }
   
 public String toString(){
  
  return name;
  
  } 

    @Override
    public int compareTo(Person o) {
       int len1=name.length();
       int len2=o.name.length();
       if(len1>len2)
       {
        return 1;
       }
       else if(len1<len2)
       {
         return -1;
       }
       else
       {
        return name.compareTo(o.name);
       }
    }
  


}

public class NaturalSorting {

   
    public static void main(String[] args) {
               List<Person> list=new ArrayList<Person>();
		SortedSet<Person> set=new TreeSet<Person>();
		addElements(list);
		addElements(set);
		Collections.sort(list);
		showElements(list);
		System.out.println();
		showElements(set);
    }
    private static void addElements(Collection<Person>col)
	{
		col.add(new Person("Joe"));
		col.add(new Person("Sue"));
		col.add(new Person("Juliet"));
		col.add(new Person("Clare"));
		col.add(new Person("Mike"));
		
		
	}
	private static void showElements(Collection<Person>col)
	{
		for(Person name: col)
		{
			System.out.println(name);
			
			
		}
		
}
}
