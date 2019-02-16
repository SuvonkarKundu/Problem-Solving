/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Suvonkar Kundu
 */
public class exceptioncoding {
    public static void main(String[] args) {
        try {
            int a=5/0;
            System.out.println("After division");
        } catch (ArithmeticException e) {
            System.out.println("Cougth exception: "+e);
        }
         catch(ArrayIndexOutOfBoundsException e)
         {
           System.out.println("ArrayIndexOutOfBoundsException");
        
         }
        finally
        {
            System.out.println("This is finally block");
        }
    }
    
}
