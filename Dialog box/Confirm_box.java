import javax.swing.*;
import java.awt.event.*;

class BOX extends WindowAdapter {
    JFrame f;

    BOX() {
        f = new JFrame();
        f.setSize(500, 500);
        f.setVisible(true);
        f.setLayout(null);
        f.addWindowListener(this);

    }

    public void windowClosingEvent(WindowEvent e) {
        int a = JOptionPane.showConfirmDialog(f, "Are you sure ?", "warning", JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.WARNING_MESSAGE);
        if (a == JOptionPane.YES_OPTION) {
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }

    }
}

public class Confirm_box {
    public static void main(String[] args) throws Exception {
        new BOX();
    }
}
