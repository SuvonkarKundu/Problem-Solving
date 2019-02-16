/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javacalculator;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class Calculator extends JFrame implements ActionListener
{
	double value=0,store;
	String store1;
	JTextField textfield=new JTextField();
	 Calculator()
	{
		BorderLayout lay=new BorderLayout();
		setLayout(lay);
		add(textfield,BorderLayout.NORTH);
		JPanel nel=new JPanel();
		add(nel,BorderLayout.CENTER);
		GridLayout gl=new GridLayout(5,5);
		nel.setLayout(gl);
		setTitle("Calculator");
		setLocation(225,250);
		setVisible(true);
		setSize(260,260);
		JButton b1=new JButton("Sqrt");
		nel.add(b1);
		b1.addActionListener(this);
		JButton b2=new JButton("X^Y");
		nel.add(b2);
		b2.addActionListener(this);
		JButton jb3=new JButton("DEL");
		nel.add(jb3);
		jb3.addActionListener(this);
		JButton b4=new JButton("AC");
		nel.add(b4);
		b4.addActionListener(this);
        String ass=new String("789+456-123*0.=/");
		for(int i=0;i<16;i++)
		{
			char c=ass.charAt(i);
			JButton button=new JButton(String.valueOf(c));
			nel.add(button);
		    button.addActionListener(this);
		}
	}
	public void actionPerformed(ActionEvent e)
	{
		String s1=e.getActionCommand();
		if(s1==("1"))
			value=(value*10)+1;
		else if(s1==("2"))
			value=(value*10)+2;
		else if(s1==("3"))
			value=(value*10)+3;
		else if(s.equals("4"))
			show=(show*10)+4;
		else if(s.equals("5"))
			show=(show*10)+5;
		else if(s.equals("6"))
			show=(show*10)+6;
		else if(s.equals("7"))
			show=(show*10)+7;
		else if(s.equals("8"))
			show=(show*10)+8;
		else if(s.equals("9"))
			show=(show*10)+9;
		else if(s.equals("0"))
			show=(show*10)+0;
		else if(s.equals("AC"))
			show=0;
		else if(s.equals("DEL"))
			show=(int)(show/10);
		else if(s.equals("+"))
		{
			first=show;
			show=0;
			 press="+"; 
		}
		else if(s.equals("-"))
		{
			first=show;
			show=0;
			 press="-"; 
		}
		else if(s.equals("*"))
		{
			first=show;
			show=0;
			 press="*"; 
		}
		else if(s.equals("/"))
		{
			first=show;
			show=0;
			 press="/"; 
		}
		else if(s.equals("Sqrt"))
		{	
		   show=Math.sqrt(show);
		}
		else if(s.equals("X^Y"))
		{
			first=show;
			show=0;
			press="^";
		}
		else if(s.equals("="))
		{
			if(press=="+")					
			 show=first+show;			
			else if(press=="-")
			 show=first-show;
			else if(press=="*")
			 show=first*show;
			else if(press=="/")
			 show=first/show;
			else if(press=="^")
			 show=Math.pow(first,show);
		}
		jt1.setText(String.valueOf(show));
	}

  public static void main(String args[])
    	{
    		new Calculator();
  
    	}
}