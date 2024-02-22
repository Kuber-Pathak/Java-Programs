//Here ServerSocket is used as a gateway so that client can connect to server
//Socket is used to accept the client using accept()

package Socket;

import java.net.*;
import java.io.*;

public class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(12345);
        Socket clientSocket = ss.accept();
        InputStream is = clientSocket.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        OutputStream os = clientSocket.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        int num = dis.readInt();
        dos.writeInt(num * num);
        dos.flush();
        dos.close();
        os.close();
        dis.close();
        is.close();
        clientSocket.close();
        ss.close();
    }
}