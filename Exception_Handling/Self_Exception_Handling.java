
//In this program when the divisor is 0.Result becomes Infity and hence throws a exception
//To resolve that we use 'try' block to identify the exception.'throw' block to throw the exception
//And 'catch' block to handle the exception.Here getMessage() function gives us information about the occured exception
package Exception_Handling;

import java.util.*;

class MyException extends Exception {
    public MyException(String str) {
        super(str);
    }
}

class Self_Exception_Handling {
    public static void main(String[] args) {
        int num1, num2;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number :");
        num1 = s.nextInt();
        System.out.println("Enter second number :");
        num2 = s.nextInt();
        s.close();
        try {
            if (num2 < 0 && num2 == 0) {
                throw new MyException("number must be greater than 0.");

            } else {
                System.out.println("Result is = " + num1 / num2);
            }
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }

    }
}