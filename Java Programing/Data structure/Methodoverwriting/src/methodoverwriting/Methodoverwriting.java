/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodoverwriting;

/**
 *
 * @author Suvonkar Kundu
 */
public class Methodoverwriting extends Class3 {

    void getName()
  {
  
  System.out.println("Methodoverwriting");
  
  }
    public static void main(String[] args) {
        Class3 obj=new Class3();
        obj.getName();
       
    }
    
}
