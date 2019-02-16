/*-
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 class Calculator1 extends JFrame implements ActionListener
        {
    double value=0,store;
    String store1;
  JTextField textfield=new JTextField();
  JMenuBar obmenubar= new JMenuBar();
Calculator1()
{ 
  setJMenuBar(obmenubar);
  JMenu filemenu=new JMenu("File");
  JMenu editmenu  =new JMenu("Edit");
  JMenu viewmenu=new JMenu("View");
  JMenu helpmenu=new JMenu("Help");
  obmenubar.add( filemenu);
  obmenubar.add(editmenu );
   obmenubar.add(viewmenu );
    obmenubar.add(helpmenu);
  setLocation(100,100);
  setSize(400,400);
  BorderLayout lay=new BorderLayout();
  setLayout(lay);
  add(textfield,BorderLayout.NORTH);
  JPanel nel=new JPanel();
  add(nel,BorderLayout.CENTER);
  GridLayout grid=new GridLayout(5,5,10,10);
  nel.setLayout(grid);
  JButton b1=new JButton("AC");
  nel.add(b1);
  b1.addActionListener(this);
  JButton b2=new JButton("DEL");
  nel.add(b2);
  b2.addActionListener(this);
  JButton b3=new JButton("^");
  nel.add(b3);
  b3.addActionListener(this);
  JButton b4=new JButton("sqrt");
  nel.add(b4);
  b4.addActionListener(this);
  JButton b5=new JButton("sin");
  nel.add(b5);
  b5.addActionListener(this);
  JButton b6=new JButton("Cos");
  nel.add(b6);
  b6.addActionListener(this);
  JButton b7=new JButton("tan");
  nel.add(b7);
  b7.addActionListener(this);
  JButton b8=new JButton("n!");
  nel.add(b8);
  b8.addActionListener(this);
  JButton b9=new JButton("log");
  nel.add(b9);
  b9.addActionListener(this);
  JButton b10=new JButton("ln");
  nel.add(b10);
  b10.addActionListener(this);
  JButton b11=new JButton("1");
  nel.add(b11);
  b11.addActionListener(this);
  JButton b12=new JButton("2");
  nel.add(b12);    
  b12.addActionListener(this);
  JButton b13=new JButton("3");
  nel.add(b13);
  b13.addActionListener(this);
  JButton b14=new JButton("4");
  nel.add(b14);
  b14.addActionListener(this);
  JButton b15=new JButton("5");
  nel.add(b15);
  b15.addActionListener(this);
  JButton b16=new JButton("6");
  nel.add(b16);
  b16.addActionListener(this);
  JButton b17=new JButton("7");
  nel.add(b17);
  b17.addActionListener(this);
  JButton b18=new JButton("8");
  nel.add(b18);
  b18.addActionListener(this);
  JButton b19=new JButton("9");
  nel.add(b19);
  b19.addActionListener(this);
  JButton b20=new JButton("0");
  nel.add(b20);
  b20.addActionListener(this);
  JButton b21=new JButton("+");
  nel.add(b21);
  b21.addActionListener(this);
  JButton b22=new JButton("-");
  nel.add(b22);
  b22.addActionListener(this);
  JButton b23=new JButton("*");
  nel.add(b23);
  b23.addActionListener(this);
  JButton b24=new JButton("/");
  nel.add(b24);
  b24.addActionListener(this);
  JButton b25=new JButton("=");
  nel.add(b25);
  b25.addActionListener(this);
  setVisible(true);
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
        else if(s1=="/")
            {
                 store=value;
                 value=0;
                 store1="/";
            }
        else if(s1=="*")
            {
                store=value;
                value=0;
                store1="*";
            }
        else if(s1=="-")
           {
                store=value;
                value=0;
                store1="-";
           }
        else if(s1=="n!")
           {
                 store=value;
                 value=0;
                 store1="n!";
           }
        else if(s1=="log")
           {
                 store=value;
                 value=0;
                 store1="log";
           }
        else if(s1=="ln")
           {
                 store=value;
                 value=0;
                 store1="ln";
           }
         else if(s1=="^")
           {
                 store=value;
                 value=0;
                 store1="^";
           }
         else if(s1=="sqrt")
           {
                 store=value;
                 value=0;
                 store1="sqrt";
           }
         else if(s1=="sin")
           {
                store=value;
                value=0;
                store1="sin";
           }
         else if(s1=="cos")
           {
                store=value;
                value=0;
                store1="cos";
           }
         else if(s1=="tan")
           {
                store=value;
                value=0;
                store1="tan";
           }
         else if(s1==("="))
           {
               if(store1=="+")
               value=store+value;
               else if(store1=="-")
                value=store-value;
               else if(store1=="*")
               value=store*value;
               else if(store1=="/")
               value=store/value;
               else if(store1=="n!")
                 {   
                    value=1;
                    for(int i=1;i<=store;i++)
                       {
                           value=value*i;  
                       }
                 }
               else if(store1=="^")
               value=Math.pow(store, value);
               else if(store1=="sqrt")
               value=Math.sqrt( store);
               else if(store1=="sin")
               value=Math.sin((Math.PI*store)/180);
               else if(store1=="cos")
               value=Math.cos((Math.PI*store)/180);
               else if(store1=="tan")
               value=Math.tan((Math.PI*store)/180);
               else if(store1=="log")
               value=Math.log10(store);
               else if(store1=="ln")
               value=Math.log(store);
          }
              textfield.setText(String.valueOf(value));
    }
                 public static void main(String args[])
                      {
                             Calculator1 cal=new Calculator1();

                      }
}






