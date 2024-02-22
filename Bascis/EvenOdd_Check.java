//This is a simple program to check wheather the number is even or odd

import java.awt.event.*;
import javax.swing.*;

class Checker extends JFrame implements ActionListener {
    JTextField input, result;
    JButton check;

    Checker() {
        input = new JTextField();
        result = new JTextField();
        check = new JButton("Check");

        setSize(500, 500);
        setVisible(true);
        setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        result.setEditable(false);

        add(input);
        add(result);
        add(check);

        check.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == check) {
            int num = Integer.parseInt(input.getText());
            if (num % 2 == 0) {
                result.setText("Even Number");
            } else {
                result.setText("Odd Number");
            }
        }
    }
}

public class EvenOdd_Check {
    public static void main(String[] args) {
        new Checker();
    }
}
