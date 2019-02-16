import java.awt.GridLayout;
import java.awt.KeyboardFocusManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
class ActionFocusMover implements ActionListener {
  public void actionPerformed(ActionEvent actionEvent) {
    KeyboardFocusManager manager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
    manager.focusNextComponent();
  }
}
 class FocusSampleActionFocusMover {
  public static void main(String args[]) {
    JFrame frame = new JFrame("Focus Sample");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ActionListener actionListener = new ActionFocusMover();
    frame.setLayout(new GridLayout(3, 3));
    for (int i = 1; i < 10; i++) {
      JButton button = new JButton(Integer.toString(i));
      button.addActionListener(actionListener);
      if ((i % 2) != 0) {
        button.setFocusable(false);
      }
      frame.add(button);
    }
    frame.setSize(300, 200);
    frame.setVisible(true);
  }
}