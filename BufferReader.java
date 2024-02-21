import java.io.*;

public class BufferReader {
    public static void main(String[] args) throws Exception {
        FileReader fis = new FileReader("abc.txt");
        BufferedReader bfs = new BufferedReader(fis);
        String str = bfs.readLine();
        while (str != null) {
            if (str.contains("kathmandu")) {
                System.out.println(str);
            }
            str = bfs.readLine();
        }
        bfs.close();
        fis.close();
    }
}
