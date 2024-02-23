package Graphics;

import javax.swing.*;
import java.awt.*;

public class Flag extends JPanel {
    public void paintComponent(Graphics g) {
        g.setColor(Color.green);
        g.fillRect(10, 10, 200, 200);
        int x[] = { 20, 20, 90, 50, 90 };
        int y[] = { 20, 90, 70, 55, 40 };
        g.setColor(Color.red);
        g.fillPolygon(x, y, 5);
        g.setColor(Color.white);
        g.fillArc(30, 30, 10, 10, 0, -180);
        g.setColor(Color.white);
        g.fillOval(30, 60, 10, 10);
        g.setColor(Color.black);
        g.drawString("My nepal", 20, 120);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(500, 500);
        f.setVisible(true);
        f.setLayout(new BorderLayout());
        Flag d = new Flag();
        f.add(d);
    }
}
