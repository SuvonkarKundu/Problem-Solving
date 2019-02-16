/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundtype;

/**
 *
 * @author Suvonkar Kundu
 */
public class States <T extends Number> {
T[] nums;

    public States(T[] o) {
        
       nums=o;
    }
    double average()
    {
      double sum=0.0;
      for(int i=0;i<nums.length;i++)
      {
       sum+=nums[i].doubleValue();
      
      }
      return sum/nums.length;
    }
    boolean sameAvg(States<?> ob)
    {
     if(average() ==ob.average()  )
     {
     return true;
     }
     return false;
    
    }

}
class Boundsdemo{
  public static void main(String args[])
  {
      Integer inums[]={1,2,3,4,5};
      States<Integer> iob=new States<Integer>(inums);
      double v=iob.average();
      System.out.println("iob average is " +v);
      Double dnums[]={1.1,2.2,3.3,4.4,5.5};
      States<Double> dob=new States<Double>(dnums);
      double w=dob.average();
      System.out.println("dob average is " +w);
       Float fnums[]={1.0F,2.0F,3.0F,4.0F,5.0F};
      States<Float> fob=new States<Float>(fnums);
      double x=fob.average();
      System.out.println("dob average is " +x);
      
       System.out.println("Averages of iob and dob");
       if(iob.sameAvg(dob))
       {
          System.out.println("are the same");
       
       }
       else
       {
        System.out.println("differ"); 
       }
         System.out.println("Averages of iob and fob");
       if(iob.sameAvg(fob))
       {
          System.out.println("are the same");
       
       }
       else
       {
        System.out.println("differ"); 
       }
       
      
  }
}