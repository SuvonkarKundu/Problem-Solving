/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coustomexception;

/**
 *
 * @author Suvonkar Kundu
 */
public class Coustomexception extends Exception {
     String value;

    public Coustomexception(String x) {
        
        value= "Coustomexception: "+x;
    }
   public String toString()
    {
         return value;
    
    
    }
     
   
    public static void main(String[] args) {
        try {
            calculate(11);
        } catch (Coustomexception e) {
            System.out.println("Caught Exception: "+e);
        }
       
    }
    public static void calculate(int x) throws Coustomexception
    {
    
    if(x>10) throw new Coustomexception("Geater than Ten");
    else System.out.println("Normal exit: ");
    
    }
}
