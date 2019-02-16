/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package input.java;

/**
 *
 * @author Suvonkar kundu
 */
 import javax.swing.*;
public class InputJava {

    /**
     * @param args the command line arguments
     */
  
    public static void main(String[] args) {
        String input=JOptionPane.showInputDialog("");
        int age=Integer.parseInt(input);
        for(int i=1;i<=age;i++)
        System.out.println(+i); 
        System.exit(0);
}
}