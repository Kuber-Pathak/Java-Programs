package AWT_Swing;

import javax.swing.*;
import java.awt.*;
import java.text.*;
import java.util.*;

class DigitalWatch extends JFrame {
    SimpleDateFormat timeformat;
    String time;
    JTextField t;

    public DigitalWatch() {
        t = new JTextField();
        timeformat = new SimpleDateFormat("hh.mm.ss");
        setSize(500, 500);
        setVisible(true);
        setLayout(new FlowLayout());

        add(t);
        setTime();

    }

    public void setTime() {
        while (true) {
            time = timeformat.format(Calendar.getInstance().getTime());
            t.setText(time);
        }
    }

    public static void main(String[] args) {
        new DigitalWatch();
    }
}
