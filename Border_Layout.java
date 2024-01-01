
//A border layout lays out a container, arranging and resizing its components to fit in five regions:
// north, south, east, west, and center
import javax.swing.*;
import java.awt.*;

class Border extends JFrame {
    JButton btn1, btn2, btn3, btn4, btn5;

    Border() {
        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btn4 = new JButton("4");
        btn5 = new JButton("5");

        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        add(btn1, BorderLayout.EAST);
        add(btn2, BorderLayout.WEST);
        add(btn3, BorderLayout.NORTH);
        add(btn4, BorderLayout.SOUTH);
        add(btn5, BorderLayout.CENTER);

    }
}

public class Border_Layout {
    public static void main(String[] args) {
        new Border();
    }
}