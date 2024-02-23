package Graphics;

import javax.swing.*;
import java.awt.*;

public class BarGraph extends JPanel {
    public void paintComponent(Graphics g) {
        String s[] = { "Java", "c", "c++" };
        int data[] = { 50, 30, 40 };
        for (int i = 0; i < 3; i++) {
            g.setColor(Color.black);
            g.drawString(s[i], 10, 20 + i * 50);
            g.setColor(Color.red);
            g.fillRect(50, 10 + i * 50, data[i], 10);
        }
    }

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(500, 500);
        f.setVisible(true);
        f.setLayout(new BorderLayout());
        BarGraph d = new BarGraph();
        f.add(d);
    }
}
