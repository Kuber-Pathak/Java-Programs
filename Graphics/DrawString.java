package Graphics;

import javax.swing.*;
import java.awt.*;

public class DrawString extends JPanel {
    public void paint(Graphics g) {
        g.setColor(Color.black);
        Font f = new Font("Times new Roman", Font.BOLD, 15);
        g.setFont(f);
        g.drawOval(100, 100, 500, 400);
        g.drawString("kuber", 250, 250);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(500, 500);
        f.setVisible(true);
        f.setLayout(new BorderLayout());
        DrawString d = new DrawString();
        f.add(d);
    }
}
