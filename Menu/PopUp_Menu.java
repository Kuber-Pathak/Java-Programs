import java.awt.event.*;
import javax.swing.*;

class Demo extends JFrame implements ActionListener, MouseListener {
    JLabel lb;
    JPopupMenu pm;
    JMenuItem cut, copy, paste;

    public Demo() {
        lb = new JLabel();
        pm = new JPopupMenu();
        cut = new JMenuItem("Cut");
        copy = new JMenuItem("Copy");
        paste = new JMenuItem("paste");

        setSize(500, 500);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        lb.setBounds(180, 150, 150, 150);

        add(lb);
        add(pm);
        pm.add(cut);
        pm.add(copy);
        pm.add(paste);

        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        addMouseListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cut) {
            lb.setText("Cut is Selected");
        }
        if (e.getSource() == copy) {
            lb.setText("copy is Selected");
        }
        if (e.getSource() == paste) {
            lb.setText("paste is Selected");
        }
    }

    public void mouseClicked(MouseEvent e) {
        if (SwingUtilities.isRightMouseButton(e)) {
            pm.show(this, e.getX(), e.getY());
        }

    }

    public void mousePressed(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

}

public class PopUp_Menu {
    public static void main(String[] args) {
        new Demo();
    }
}
