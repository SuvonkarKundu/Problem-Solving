package Main;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author Suvonkar Kundu
 */
public class Main extends JFrame {
   
    Main()
    {
         JFrame jFrame=new JFrame("abc");
        jFrame.setLocation(100,100);
        jFrame.setSize(400,400);
        BorderLayout bl=new BorderLayout();
        jFrame.setLayout(bl);
        JPanel nel=new JPanel();
        add(nel,BorderLayout.CENTER);
        JTextField tf= new JTextField();
        add(tf,BorderLayout.NORTH);
        JButton b1=new JButton("INSERT");
        nel.add(b1);
        JButton b2=new JButton("DELETE");
        nel.add(b2);
        JButton b3= new JButton("SEARCH");
        nel.add(b3);
        jFrame.add(nel);
        setVisible(true);
        
    

    }
    public static void main(String args[])
    {
       new Main();
       new makeconnection().getConnection();
    }
    
}