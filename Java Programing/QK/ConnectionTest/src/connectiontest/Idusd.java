package connectiontest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.border.LineBorder;

class Idusd extends JFrame implements ActionListener {
    JMenuBar obmenubar= new JMenuBar();

    Idusd() throws SQLException  {
       /*setTitle("Menu");
        setBounds(200, 100, 500, 600);
        setResizable(false);
        //setLayout(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        JTabbedPane tabbedPane = new JTabbedPane();
        add(tabbedPane);
        tabbedPane.addTab("ADMINESTORPASSWORD", new Adminestorpassword());
        tabbedPane.addTab("INSERT", new INSERT());
        tabbedPane.addTab("DELETE", new JPanel());
        tabbedPane.addTab("UPDATE", new JPanel());
        tabbedPane.addTab("SEARCH", new JPanel());
        tabbedPane.addTab("VIEW", new JPanel());*/
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
         setSize(500,100);
         BorderLayout lay=new BorderLayout();
         setLayout(lay);
         JPanel nel=new JPanel();
         add(nel,BorderLayout.CENTER);
         GridLayout grid=new GridLayout(1,5);
         nel.setLayout(grid);
         JButton b1=new JButton("INSERT");
         nel.add(b1);
         b1.addActionListener(this);
         JButton b2=new JButton("DELETE");
         nel.add(b2);
         b2.addActionListener(this);
         JButton b3=new JButton("UPDATE");
         nel.add(b3);
         b3.addActionListener(this);
         JButton b4=new JButton("SEARCH");
         nel.add(b4);
         b4.addActionListener(this);
         JButton b5=new JButton("VIEW");
         nel.add(b5);
         b5.addActionListener(this);
         setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String s1 = e.getActionCommand();
                {
                    if(s1.equals("INSERT"))
                    {
                        try {
                            new INSERT();
                            new Diningtableinsert();
                        } catch (SQLException ex) {
                            Logger.getLogger(Idusd.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    
                    }
                   
                 if(s1.equals("UPDATE"))
                    {
                        
                            //new ReportGui().setVisible(true);
                            new SearchFrame();
                           
                           
                       
     
                    }
                 
                   
                
                
                }



    }
    
}
