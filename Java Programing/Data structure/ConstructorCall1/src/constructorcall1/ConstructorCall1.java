/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructorcall1;

/**
 *
 * @author Suvonkar Kundu
 */
public class ConstructorCall1 extends SuperClass2 {

    ConstructorCall1()
    {
    
    System.out.println("This is main class");
    }
    public static void main(String[] args) {
        new ConstructorCall1();
    }
    
}
