
import java.text.DateFormatSymbols;
import java.util.*;

public class Main {
   

  public static void main(String[]args)
  {
     GregorianCalendar d=new GregorianCalendar();
     int today=d.get(Calendar.DAY_OF_MONTH);
     int month=d.get(Calendar.MONTH);
     d.set(Calendar.DAY_OF_MONTH, 1);
     int weekday=d.get(Calendar.DAY_OF_WEEK);
     int firstdayweek=d.getFirstDayOfWeek();
     int indent=0;
     while(weekday!=firstdayweek);
     {
        indent++;
        d.add(Calendar.DAY_OF_MONTH,-1);
        weekday=d.get(Calendar.DAY_OF_WEEK);
     }
  String [] weekdaynames=new DateFormatSymbols().getShortWeekdays();
  do
  {
      System.out.printf("%4s",weekdaynames[weekday]);
      d.add(Calendar.DAY_OF_MONTH,1);
      weekday=d.get(Calendar.DAY_OF_WEEK);
  }
  while(weekday!=firstdayweek);
  System.out.println();
  for(int i=1;i<=indent;i++)
      System.out.printf(" ");
  do
  {
     int day=d.get(Calendar.DAY_OF_MONTH);
     System.out.printf("%3d",day);
     if(day==today)
         System.out.printf("*");
     else
         System.out.printf(" ");
     d.add(Calendar.DAY_OF_MONTH, 1);
     if(weekday==firstdayweek)
         System.out.println();
  }
     while(d.get(Calendar.MONTH)==month);
          if(weekday!=firstdayweek)
              System.out.println();
      
     
  }
  
  } 
  
    
