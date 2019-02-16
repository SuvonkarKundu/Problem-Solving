/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayinput.java;

/**
 *
 * @author Suvonkar kundu
 */
import javax.swing.*;
public class ArrayInputJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arr[][]=new int[100][100];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
        { 
            String input=JOptionPane.showInputDialog(arr[i][j]);
            arr[i][j] = Integer.parseInt(input);
        } 
            }
        for(int i=0;i<3;i++)
        {
            for(int j=2;j>=0;j--)
            {
                System.out.print(arr[i][j]);
               System.out.print(" ");
            }
            System.out.print("\n");
        }
        
    }
    
    
}
