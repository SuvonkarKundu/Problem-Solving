/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringoparetion;

/**
 *
 * @author Suvonkar Kundu
 */
public class StringOparetion {

 
    public static void main(String[] args) {
       String one = "Hello";
      String two = new String(one);
System.out.println("One ="+one);
System.out.println("Two ="+two);
if (one == two){
System.out.println("one == two");
}
else{
System.out.println("one != two");
}
    }
    
}
