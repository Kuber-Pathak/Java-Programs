import javax.swing.*;
import java.awt.*;

class Flow extends JFrame {
    JButton btn1, btn2, btn3, btn4, btn5;

    Flow() {
        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btn4 = new JButton("4");
        btn5 = new JButton("5");

        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.RIGHT));

        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
        add(btn5);

    }
}

public class Flow_Layout {
    public static void main(String[] args) {
        new Flow();
    }
}
