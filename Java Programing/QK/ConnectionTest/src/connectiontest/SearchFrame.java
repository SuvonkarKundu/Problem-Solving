/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package connectiontest;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;


public class SearchFrame extends JFrame{
        private TitleSrchPanel titleSrchPanel;
    public SearchFrame(){
           super("Search");
           
             setLayout(new BorderLayout()); 
        
        setSize(400,200);
       setLocationRelativeTo(null);
       setVisible(true);
       setResizable(false);
       
          titleSrchPanel = new TitleSrchPanel();
     add(titleSrchPanel,BorderLayout.NORTH);
    }

    private static class TitleSrchPanel extends JPanel{
        
          private JButton allBtn;
        
        public void paintComponent(Graphics g){
        
             g.setColor(Color.LIGHT_GRAY);
             g.fillRect(0, 0,700, 200);
              }

        public TitleSrchPanel() {
            
          Dimension dim = getPreferredSize();
      dim.setSize(700, 200);
      setPreferredSize(dim);
      
      allBtn = new JButton(" QUERY Table RESULT");
      
            allBtn.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    
                    java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rrrrrr1().setVisible(true);
               }
               });
                    
                    
                   // try {
                     //   new Report1();
                    //} catch (SQLException ex) {
                       // Logger.getLogger(SearchFrame.class.getName()).log(Level.SEVERE, null, ex);
                    //}
                    
                }
            });
      
      Border innerBorder=BorderFactory.createTitledBorder("Search by STUDENT_INFORMATION");//fixes the inner border
        Border outerBorder=BorderFactory.createEmptyBorder(0, 0, 0, 0);//fixes the outer border
        setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));
        layoutComponents();
      
        }

        private void layoutComponents() {
             setLayout(new GridBagLayout());
        GridBagConstraints gc = new GridBagConstraints();
            
             gc.gridy = 0;
        gc.weightx=0;
        gc.weighty=0;
                        
       gc.gridx=3;  
       //gc.anchor=GridBagConstraints.CENTER;
       gc.insets=new Insets(40,0,40,0);
       gc.fill=GridBagConstraints.NONE;
       gc.anchor=GridBagConstraints.CENTER;
       add(allBtn,gc);
            
        }
    }

    
    
    
}

