//Here we use getContentPane() to catch the background and setBackground() sets the backgroud.
//setBackground() has Color class that is used to change the color

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ColorChange extends JFrame implements ActionListener {
    JButton blue, black;

    ColorChange() {
        blue = new JButton("BLUE");
        black = new JButton("BLACK");

        setSize(500, 500);
        setVisible(true);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(blue);
        add(black);

        blue.addActionListener(this);
        black.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == blue) {
            getContentPane().setBackground(Color.BLUE);
        }
        if (e.getSource() == black) {
            getContentPane().setBackground(Color.BLACK);
        }
    }
}

public class Background_Change {
    public static void main(String[] args) {
        new ColorChange();
    }

}
