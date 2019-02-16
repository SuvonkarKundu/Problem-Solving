import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ellipse extends JPanel implements MouseListener{

    Graphics P;

    public Ellipse()
    {
        addMouseListener(this);
    }

    static int Radius = 0;
    int CenterX, CenterY, RadiusX, RadiusY;

    public void paintComponent(Graphics g)
    {
        P=g;
        EllipseMidpoint(CenterX, CenterY, RadiusX, RadiusY);
    }

    public void EllipseMidpoint(int Cx, int Cy, int Rx, int Ry)
    {
         int Rx2 = Rx * Rx;
         int Ry2 = Ry * Ry;
         int twoRx2 = 2 * Rx2;
         int twoRy2 = 2 * Ry2;
         int x = 0;
         int y = Ry;
         int p;
         int px= 0;
         int py = twoRx2 * y;
         PlotEllipsePoint(Cx, Cy, x, y);

         //Region 1
         p = (int)(Ry2 - (Rx2 * Ry) + (0.25 + Rx2));
         while (px < py)
         {
             x = x + 1;
             px = twoRy2 + px;
             if (p < 0)
             {
                 p = Ry2 + px + p;
             }
             else 
             {
                 y = y - 1;
                 py = twoRx2 - py;
                 p = Ry2 + px - py + p;
             }
             PlotEllipsePoint(Cx, Cy, x, y);   
         }

         //Region2 
         p = (int)(Ry2 * (x + 0.5) * (x + 0.5) + Rx2 * (y - 1) * (y - 1) - Rx2 * Ry2);
         while (y > 0)
         {
             y = y - 1;
             py = twoRx2 - py;
             if (p > 0)
             {
                 p = Rx2 - py + p;
             }
             else
             {
                 x = x + 1;
                 px = twoRy2 + px;
                 p = Rx2 + px - py + p;
             }
             PlotEllipsePoint(Cx, Cy, x, y);    
         }         
    }   

    public void PlotEllipsePoint(int CX, int CY, int X, int Y)
    {
     drawPixel(CX + X, CY + Y);
     drawPixel(CX - X, CY + Y);
     drawPixel(CX + X, CY - Y);
     drawPixel(CX - X, CY - Y);
    }

    public void drawPixel(int x, int y)
    {
        P.fillOval(x, y, 200, 100);
     } 

    public void mousePressed(MouseEvent e) 
    {
        if (e.getButton() == MouseEvent.BUTTON1)
        {
            CenterX = e.getX();
            CenterY = e.getY();
        }
        else if (e.getButton() == MouseEvent.BUTTON3)
        {
            Radius = Radius + 1;
            if (Radius == 1)
            {
                RadiusX = (int) Math.pow((Math.pow((e.getX() - CenterX), 2) + Math.pow((e.getY() - CenterY), 2)), 0.5);
            }
            else if (Radius == 2)
            {
                RadiusY = (int) Math.pow((Math.pow((e.getX() - CenterX), 2) + Math.pow((e.getY() - CenterY), 2)), 0.5);
            }
            PlotEllipsePoint(CenterX, CenterY, RadiusX, RadiusY);
        }
    }

     public static void main(String[] args) 
        {
            JFrame JF = new JFrame("Ellipse");
            JF.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            JF.setSize(500,500);
            Ellipse E = new Ellipse();
            JF.getContentPane().add(E);
            JF.setVisible(true);
        }

     public void mouseClicked(MouseEvent e) {}
     public void mouseReleased(MouseEvent e) {}
     public void mouseEntered(MouseEvent e) {}
     public void mouseExited(MouseEvent e) {}
}