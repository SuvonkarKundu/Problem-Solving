import java.awt.*;    
import javax.swing.*;    
public class HumanFace extends JPanel{  
      

    public void paint(Graphics g) {    
        g.setColor(Color.BLACK);
        g.drawOval(125, 125, 200, 200);
        g.drawOval(170, 170, 30, 30);
        g.fillOval(180, 180, 10, 10);
        g.drawOval(250, 170, 30, 30);
        g.fillOval(260, 180, 10, 10);
        g.drawArc(180,200,90,90,180,180);
        //g.drawRect(220, 210, 13, 40);
        g.drawLine(225, 210, 225, 260);
        
    }  
  
    public static void main(String[] args) {  
        EventQueue.invokeLater(new Runnable() {  
            public void run() {  
                JFrame frame = new JFrame("HumanFace");  
               // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
                frame.add(new HumanFace());  
                frame.setBounds(200,200,500,500);  
                frame.setVisible(true);  
            }  
        });  
    }  
} 