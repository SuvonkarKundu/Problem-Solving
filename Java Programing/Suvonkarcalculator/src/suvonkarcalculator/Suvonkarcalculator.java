import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class Calculator extends JFrame implements ActionListener
{
	double show=0,first,second,result;
	String press;
	JTextField jt1=new JTextField();
	 Calculator()
	{
		BorderLayout bl=new BorderLayout();
		setLayout(bl);
		add(jt1,BorderLayout.NORTH);
		JPanel p=new JPanel();
		add(p,BorderLayout.CENTER);
		GridLayout gl=new GridLayout(5,5);
		p.setLayout(gl);
		setTitle("Calculator");
		setLocation(225,250);
		setVisible(true);
		setSize(260,260);
		JButton jb1=new JButton("Sqrt");
		p.add(jb1);
		jb1.addActionListener(this);
		JButton jb2=new JButton("X^Y");
		p.add(jb2);
		jb2.addActionListener(this);
		JButton jb3=new JButton("DEL");
		p.add(jb3);
		jb3.addActionListener(this);
		JButton jb4=new JButton("AC");
		p.add(jb4);
		jb4.addActionListener(this);
        }
	public void actionPerformed(ActionEvent e)
	{
		String s=e.getActionCommand();
		if(s.equals("1"))
			show=(show*10)+1;
		else if(s.equals("2"))
			show=(show*10)+2;
		else if(s.equals("3"))
			show=(show*10)+3;
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