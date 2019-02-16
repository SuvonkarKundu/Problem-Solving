/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package r.lab_5;
import java.awt.*;
import java.awt.geom.AffineTransform;
import javax.swing.*;

/**
 *
 * @author Suvonkar Kundu
 */
public class RLab_5 {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(0,0,800,800);
        frame.getContentPane().add(new MyCanvas());
        frame.setVisible(true);
    }
}

class MyCanvas extends JComponent{
    public void paint(Graphics g)
    {
        //Translation
        Graphics2D g2= (Graphics2D)g;
        g2.fillRect(10, 10, 60, 30);
        AffineTransform fig=new AffineTransform();
        fig.translate(50,50);
        g2.setTransform(fig);
        g2.fillRect(10, 10, 60, 30);
        
        //Scaling
        g2.fillRect(150, 100, 60, 30);
        AffineTransform fig2=new AffineTransform();
        fig2.translate(50, 50);
        fig2.scale(1.5, 1.5);
        g2.setTransform(fig2);
        g2.fillRect(135, 100, 60, 30);
        
        //Rotation
        g2.fillRect(240, 185, 40, 20);
        AffineTransform fig3=new AffineTransform();
        fig3.translate(50, 50);
        fig3.rotate(Math.toRadians(10));
        g2.setTransform(fig3);
        g2.fillRect(460, 250, 60, 30);
    }
}
