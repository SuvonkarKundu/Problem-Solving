/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gridbaglayout;

import java.awt.GridBagLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Suvonkar Kundu
 */
public class Gricbaglayout extends JFrame{
             
            JFrame frame;
            Gricbaglayout()
            {  JPanel panel=new JPanel();
            JLabel namelable=new JLabel("name: ");
            JLabel idlable=new JLabel("ID: ");
            JTextField namefield=new  JTextField(18);
              JTextField idfield=new  JTextField(10);
               setLocation(100,100);
               setSize(500,400);
               setLayout(new GridBagLayout());
               Grid
               frame.add(panel);
               setVisible(true);
               
               
            
            
            
            
            
            }
    
    public static void main(String[] args) {
       Gricbaglayout gric=new Gricbaglayout();
    }
}
