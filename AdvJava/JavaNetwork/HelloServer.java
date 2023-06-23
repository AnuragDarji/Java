import java.io.*;
import java.net.*;

public class HelloServer {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(1234);
        Socket s = ss.accept();

        BufferedReader inp = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String str;
        str = inp.readLine();
        System.out.println(str);
    }
}
