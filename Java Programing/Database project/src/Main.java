
import java.awt.*;
import javax.swing.*;
public class Main extends JFrame {
    Main()
    {
        setLocation(100,100);
        setSize(400,400);
        BorderLayout bl=new BorderLayout();
        setLayout(bl);
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
        setVisible(true);
        
    

    }
    public static void main(String args[])
    {
       new Main();
    
    }
    
    
}
