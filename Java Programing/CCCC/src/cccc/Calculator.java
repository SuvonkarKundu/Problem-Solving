/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cccc;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 class Calculator extends JFrame implements ActionListener
        {
    double value=0,store;
    String store1;
  JTextField textfield=new JTextField();
Calculator()
{ 
setLocation(100,100);
setSize(300,300);
setVisible(true);
BorderLayout lay=new BorderLayout();
setLayout(lay);
add(textfield,BorderLayout.NORTH);
JPanel nel=new JPanel();
add(nel,BorderLayout.CENTER);
GridLayout grid=new GridLayout(3,3);
nel.setLayout(grid);
JButton b1=new JButton("1");
JButton b2=new JButton("2");
JButton b3=new JButton("3");
JButton b4=new JButton("4");
JButton b5=new JButton("5");
JButton b6=new JButton("6");
JButton b7=new JButton("7");
JButton b8=new JButton("8");
JButton b9=new JButton("9");
JButton b10=new JButton("0");
JButton b11=new JButton("+");
JButton b12=new JButton("-");
JButton b13=new JButton("*");
JButton b14=new JButton("/");
JButton b15=new JButton("=");
JButton b16=new JButton("sqrt");
JButton b17=new JButton("DEL");
JButton b18=new JButton("AC");
JButton b19=new JButton("x^y");
JButton b20=new JButton(".");
nel.add(b1);
nel.add(b2);
nel.add(b3);
nel.add(b4);
nel.add(b5);
nel.add(b6);
nel.add(b7);
nel.add(b8);
nel.add(b9);
nel.add(b10);
nel.add(b11);
nel.add(b12);
nel.add(b13);
nel.add(b14);
nel.add(b15);
nel.add(b16);
nel.add(b17);
nel.add(b18);
nel.add(b19);
nel.add(b20);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);
b10.addActionListener(this);
b11.addActionListener(this);
b12.addActionListener(this);
b13.addActionListener(this);
b14.addActionListener(this);
b16.addActionListener(this);
b17.addActionListener(this);
b18.addActionListener(this);
b19.addActionListener(this);
b20.addActionListener(this);
String ass=new String("789+456-123*0.=/");
         for(int i=0;i<16;i++)
		{
			char c=ass.charAt(i);
			JButton button=new JButton(String.valueOf(c));
		 button=new JButton(String.valueOf(c));
                    nel.add(button);
		    button.addActionListener(this);
                }

}
public void actionPerformed(ActionEvent e)
{
String s1=e.getActionCommand();
if(s1=="1")
value=value*10+1;
else if(s1=="2")
value=value*10+2;
else if(s1=="3")
value=value*10+3;
else if(s1=="4")
value=value*10+4;
else if(s1=="5")
value=value*10+5;
else if(s1=="6")
value=value*10+6;
else if(s1=="7")
value=value*10+7;
else if(s1=="8")
value=value*10+8;
else if(s1=="9")
value=value*10+9;
else if(s1=="0")
value=value*10+0;
else if(s1=="AC")
    value=0;
else if(s1=="DEL")
    value=(int)(value/10);
else if(s1=="+")
{
store=value;
value=0;
store1="+";
}
else if(s1=="-")
{
store=value;
value=0;
store1="-";
}
else if(s1=="*")
{
store=value;
value=0;
store1="*";
}
else if(s1=="/")
{
store=value;
value=0;
store1="/";
}
else if(s1=="sqrt")
{
value=Math.sqrt(value);
}
else if(s1=="x^y")
{
store=value;
value=0;
store1="^";
}
else if(s1=="=")
{
if(store1=="+")
    value=store+value;
else if(store1=="-")
    value=store-value;
else if(store1=="*")
    value=store*value;
else if(store1=="/")
    value=store/value;
else if(store1=="^")
   value=Math.pow(store, value);
}
textfield.setText(String.valueOf(value));
}
public static void main(String args[])
{
Calculator cal=new Calculator();

}

}





