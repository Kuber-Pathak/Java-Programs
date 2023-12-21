
//To write a data from file .First we open file in write mode using FileOutputStream.
//Take input from user then we use write() fuction to write the data in file.
import java.io.*;
import java.util.*;

public class Writing_to_file {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the data:");
        String str = sc.nextLine();
        sc.close();
        FileOutputStream fos = new FileOutputStream("abc.txt", true);
        fos.write(str.getBytes());
        fos.close();

    }
}
