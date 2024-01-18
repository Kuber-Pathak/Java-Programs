import javax.management.JMException;
import javax.swing.*;
import java.awt.event.*;;

class Menu extends JFrame implements ActionListener {
    JMenuBar mb;
    JMenu file, help;
    JMenuItem open, close;

    Menu() {
        setLayout(null);
        setVisible(true);
        mb = new JMenuBar();
        file = new JMenu("File");
        help = new JMenu("Help");
        open = new JMenuItem("open");
        close = new JMenuItem("close");
        file.add(open);
        file.add(close);
        mb.add(file);
        mb.add(help);
        setJMenuBar(mb);
        close.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == close) {
            int a = JOptionPane.showConfirmDialog(mb, "Exit for Program", "Confirmation",
                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
            if (a == JOptionPane.YES_OPTION) {
                System.exit(0);
            }

        }
    }
}

public class Menu_bar {
    public static void main(String[] args) {
        new Menu();
    }
}
