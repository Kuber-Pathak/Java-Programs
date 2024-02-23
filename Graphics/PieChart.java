package Graphics;

import javax.swing.*;
import java.awt.*;

public class PieChart extends JPanel {
    public void paintComponent(Graphics g) {
        int data[] = { 40, 30, 20, 10 };
        Color dataColor[] = { Color.red, Color.green, Color.black, Color.yellow };
        int total = 100;
        int startangle = 0;
        for (int i = 0; i < 4; i++) {
            g.setColor(dataColor[i]);
            int endangle = (int) (data[i] * 360) / total;
            g.fillArc(20, 20, 100, 100, startangle, endangle);
            startangle = startangle + endangle;
        }
    }

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(500, 500);
        f.setVisible(true);
        f.setLayout(new BorderLayout());
        PieChart d = new PieChart();
        f.add(d);
    }
}
