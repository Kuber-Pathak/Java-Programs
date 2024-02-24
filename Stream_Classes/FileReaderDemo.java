package Stream_Classes;

import java.io.*;

public class FileReaderDemo {
    public static void main(String[] args) throws Exception {
        FileWriter fw = new FileWriter("abc.txt");
        fw.write("hello world");
        fw.write("I am kuber");
        fw.close();

        FileReader fr = new FileReader("abc.txt");
        int data;
        while ((data = fr.read()) != -1) {
            System.out.print((char) data);
        }
        fr.close();
    }
}
