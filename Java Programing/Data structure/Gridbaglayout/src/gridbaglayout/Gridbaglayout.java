/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gridbaglayout;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Gridbaglayout extends JFrame {
     
    Gridbaglayout()
    {
              JFrame frame=new JFrame();
            JPanel panel=new JPanel();
            JLabel namelable=new JLabel("name: ");
            JLabel idlable=new JLabel("ID: ");
            JTextField namefield=new  JTextField(18);
            JTextField idfield=new  JTextField(10);
            JButton button=new JButton("ADD");
            panel.add(button);
            setLocation(100,100);
            setSize(500,400);
            setLayout(new GridBagLayout());
            GridBagConstraints gc=new   GridBagConstraints();
            gc.weightx=1;
            gc.weighty=0.1;
            gc.gridx=0;
            gc.gridy=0;
            gc.insets=new Insets(0,0,0,5);
            gc.fill=GridBagConstraints.NONE;
            gc.anchor=GridBagConstraints.LINE_END;
            add(namelable,gc);
            gc.gridx=1;
            gc.gridy=0;
             gc.insets=new Insets(0,0,0,0);
            gc.anchor=GridBagConstraints.LAST_LINE_START;
            add(namefield,gc);
            gc.weightx=1;
            gc.weighty=0.1;
            gc.gridx=0;
            gc.gridy=1;
             gc.insets=new Insets(0,0,0,5);
            gc.anchor=GridBagConstraints.LINE_END;
            add(idlable,gc);
            gc.gridx=1;
            gc.gridy=1;
            gc.insets=new Insets(0,0,0,0);
            gc.anchor=GridBagConstraints.LINE_START;
            add(idfield,gc);
            gc.weightx=1;
            gc.weighty=2.0;
            gc.gridx=1;
            gc.gridy=2;
            gc.anchor=GridBagConstraints.FIRST_LINE_START;
            add(button,gc);
            frame.add(panel);
            setVisible(true);
               
    
    }

    


    public static void main(String[] args) {
        Gridbaglayout grid= new Gridbaglayout();
        
} 
}