/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Suvonkar Kundu
 */
public class Gen<T> {
    T ob;

    public Gen(T o) {
        this.ob = o;
    }
    T getOb()
    {
    return ob;
    }
    void showType()
    {
      System.out.println("Type of T is" +ob.getClass().getName());
    
    }
    
}
class Gendemo
{
public static void main(String args[])
{
  Gen<Integer> iob=new Gen<Integer>(88);
  iob.showType();
  int v=iob.getOb();
  System.out.println("value: "+v);
  System.out.println();
  Gen<String> strob=new Gen<String>("Generics Test");
  strob.showType();
  String str=strob.getOb();
  System.out.println("value: "+str);

}




}
