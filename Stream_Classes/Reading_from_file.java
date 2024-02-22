package Stream_Classes;

//To read a data from file .First we open file in read mode using FileInputStream
//then we use read() fuction to read the data and at the end of the file it returns -1
import java.io.*;

public class Reading_from_file {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("abc.txt");
        int data;
        while ((data = fis.read()) != -1) {
            System.out.print((char) data);
        }
        System.out.print("\n");
        fis.close();
    }
}
