/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;
  import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Swing extends JFrame implements ActionListener{
    


JButton button = new JButton ("Submit");
JTextField field = new JTextField();
JLabel label = new JLabel("Enter your name : ",Label.RIGHT);
public Swing(){
super("JFrame with panel and button");
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
JPanel panel = new JPanel(null);
panel.add(label);
panel.add(field);
panel.add(button);
setContentPane(panel);
button.setBounds(100,70,100,50);
label.setBounds(20,30,200,20);
field.setBounds(120,30,100,20);
button.addActionListener(this);}
public void actionPerformed (ActionEvent e){
if (e.getSource() ==button){
JOptionPane.showMessageDialog(this,"Youre name was "+field.getText());}
}
public static void main (String[] args) {
Swing start = new Swing();
start.setSize(300, 200);
start.setVisible(true);
}
}

  
