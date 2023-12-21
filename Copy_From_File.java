
//For just copy we read from one file and write it into another file
//Here we are using buffer insted of file becouse file takes a lot of time to copy large file.
//But buffer copies the file instantly.
import java.io.*;

public class Copy_From_File {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("vid.mp4");
        FileOutputStream fos = new FileOutputStream("vid_copy.mp4");
        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        int data;
        while ((data = bis.read()) != -1) {
            bos.write((char) data);
        }
        System.out.println("Copied sucess");
        fis.close();
        fos.close();
        bis.close();
        bos.close();
    }
}
