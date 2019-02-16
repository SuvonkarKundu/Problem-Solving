/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Suvonkar Kundu
 */
public class Main {
    public static void main(String[]args)
    {
    MyClass obj=new MyClass();
    MyClass obj2=new MyClass();
    obj.x++;
    obj.y++;
    obj2.x++;
    obj2.y++;
    System.out.println("obj.x++ is "+obj.x);
    System.out.println("obj.y++ is "+obj.y);
    System.out.println("obj2.x++ is "+obj2.x);
    System.out.println("obj2.y++ is "+obj2.y);
    
    
    }
    
}
