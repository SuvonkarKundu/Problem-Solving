/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package r_lab_4;

import java.awt.*;
import java.awt.image.*;
import javax.swing.*;
/**
 *
 * @author Suvonkar Kundu
 */
public class R_Lab_4 {

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
    BufferedImage image=new BufferedImage(500,500,BufferedImage.TYPE_INT_RGB);
    public void paint(Graphics g)
    {
       Graphics2D g2 = image.createGraphics();
       g2.setColor(Color.WHITE);
       g2.fillRect(0,0, image.getWidth(), image.getHeight());    
       g2.setColor(Color.RED);
       g2.drawRect(100,100,55,55);
       boundaryFill(141,141,Color.GRAY,Color.RED);       
       g.drawImage(image, 0, 0, null);
    }
    
    public void boundaryFill(int x,int y, Color newcolor, Color edgecolor)   
    {
        int current;
        current=image.getRGB(x,y);
        
        if((current!=edgecolor.getRGB()) && (current !=newcolor.getRGB()))
        {
            image.setRGB(x,y,newcolor.getRGB());
            
            boundaryFill(x+1,y,newcolor,edgecolor);
            boundaryFill(x,y+1,newcolor,edgecolor);
            boundaryFill(x-1,y,newcolor,edgecolor);
            boundaryFill(x,y-1,newcolor,edgecolor);
        }
    }
}