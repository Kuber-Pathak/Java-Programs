package Graphics;

import javax.swing.*;
import java.awt.*;

public class Draw extends JPanel {
    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.fillRect(50, 50, 200, 200);
        g.setColor(Color.black);
        g.drawString("All the Best", 70, 70);
        g.setColor(Color.green);
        g.fillOval(80, 80, 50, 50);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(500, 500);
        f.setVisible(true);
        f.setLayout(new BorderLayout());
        Draw d = new Draw();
        f.add(d);
    }
}
