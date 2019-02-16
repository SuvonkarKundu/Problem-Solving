/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package conting.oddnumber;

import javax.swing.*;
public class ContingOddnumber {
    int i,count=0;
    String input=JOptionPane.showInputDialog("The value of ");
    int n=Integer.parseInt(input);
    ContingOddnumber()
    {
    for(i=1;i<=n;i++)
    {  
    if((i%2)!=0)
        count++;   
    }
    
    System.out.print(count);
    
    }
    public static void main(String[] args) {
       new ContingOddnumber();
    }
}
