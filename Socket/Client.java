//The Socket is used as a gateway to connect to a server
//  DataInputStream and DataOutputStream are used as a gateway to transfer data
// Here client sends a numeber to server using writeInt() .
//client receives data using readInt().

package Socket;

import java.net.*;
import java.util.Scanner;
import java.io.*;

public class Client {
    public static void main(String[] args) throws Exception {
        Socket scc = new Socket("localhost", 12345);// 172.16.0.161
        InputStream is = scc.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        OutputStream os = scc.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        dos.writeInt(num);
        dos.flush();
        int result = dis.readInt();
        System.out.println("The result is :" + result);
        sc.close();
        dos.close();
        os.close();
        dis.close();
        is.close();
        scc.close();

    }
}