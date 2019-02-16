/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculator;
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
GridLayout grid=new GridLayout(5,5);
nel.setLayout(grid);
JButton b1=new JButton("1");
nel.add(b1);
b1.addActionListener(this);
JButton b2=new JButton("2");
nel.add(b2);
b2.addActionListener(this);
JButton b3=new JButton("3");
nel.add(b3);
b3.addActionListener(this);
JButton b4=new JButton("4");
nel.add(b4);
b4.addActionListener(this);
JButton b5=new JButton("5");
nel.add(b5);
b5.addActionListener(this);
JButton b6=new JButton("6");
nel.add(b6);
b6.addActionListener(this);
JButton b7=new JButton("7");
nel.add(b7);
b7.addActionListener(this);
JButton b8=new JButton("8");
nel.add(b8);
b8.addActionListener(this);
JButton b9=new JButton("9");
nel.add(b9);
b9.addActionListener(this);
JButton b10=new JButton("0");
nel.add(b10);
b10.addActionListener(this);
JButton b11=new JButton("+");
nel.add(b11);
b11.addActionListener(this);
JButton b12=new JButton("-");
nel.add(b12);
b12.addActionListener(this);
JButton b13=new JButton("*");
nel.add(b13);
b13.addActionListener(this);
JButton b14=new JButton("/");
nel.add(b14);
b14.addActionListener(this);
JButton b15=new JButton("=");
nel.add(b15);
b15.addActionListener(this);
JButton b16=new JButton("sqrt");
nel.add(b16);
b16.addActionListener(this);
JButton b17=new JButton("DEL");
nel.add(b17);
b17.addActionListener(this);
JButton b18=new JButton("AC");
nel.add(b18);
b18.addActionListener(this);
JButton b19=new JButton("x^y");
nel.add(b19);
b19.addActionListener(this);
JButton b20=new JButton(".");
nel.add(b20);
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




