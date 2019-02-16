

package joption;
import javax.Swing.JOPtionPane;
import javax.swing.JOptionPane;
class joption {
    
    public static void main(String[] args) {
     
     String name =JOptionPane.showInputDialog("What is your name");
     String message=String.format("Welcome,%s,to java programming",name);
     JOptionPane.showMessageDialog(null,message);
    }      
     
}
