//Here we have two input box input box that takes input from user.
//Also we have messgae box that displays message to the user.
//QUESTION_MESSAGE is used to show questionmark on the box.
//INFORMATION_MESSAGE shows i on the box.

import javax.swing.*;

public class MessageInput_box {
    public static void main(String[] args) throws Exception {
        int num1 = Integer
                .parseInt(
                        JOptionPane.showInputDialog(null, "Enter First number", "num1", JOptionPane.QUESTION_MESSAGE));
        int num2 = Integer
                .parseInt(
                        JOptionPane.showInputDialog(null, "Enter Second number", "num2", JOptionPane.QUESTION_MESSAGE));
        int sum = num1 + num2;
        JOptionPane.showMessageDialog(null, "The sum is :" + sum, "Result", JOptionPane.INFORMATION_MESSAGE);
    }

}