import java.awt.*;    
import javax.swing.*;    
public class Lines extends JPanel{  
  
    @Override  
    public void paint(Graphics g) {    
        g.setColor(Color.RED);  
        g.drawLine(50,50,50,100);
        g.drawLine(100,50,50,50);
        g.drawLine(100,50,50,100);
        g.drawLine(100,50,100,100);
        g.drawLine(50,100,100,100);
        g.fillRect(150, 150, 50, 70);
    }  
  
    public static void main(String[] args) {  
        EventQueue.invokeLater(new Runnable() {  
            public void run() {  
                JFrame frame = new JFrame();  
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
                frame.add(new Lines());  
                frame.setBounds(200,200,300,300);  
                frame.setVisible(true);  
            }  
        });  
    }  
} 