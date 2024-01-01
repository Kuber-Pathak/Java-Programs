
import javax.swing.*;
import java.awt.*;

class Grid extends JFrame {
    JButton btn1, btn2, btn3, btn4, btn5;

    Grid() {
        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btn4 = new JButton("4");
        btn5 = new JButton("5");

        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2));

        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
        add(btn5);

    }
}

public class Grid_Layout {
    public static void main(String[] args) {
        new Grid();
    }
}