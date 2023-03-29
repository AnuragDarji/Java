import java.io.*;
import java.net.*;

public class Client{
    public static void main(String[] args) throws Exception {
        // String ip = "localhost";
        // int port = 9999; // o-1023 to 65535
        Socket s = new Socket("localhost",9999);

        String str = "Anurag Darji";

        //Convert Data into a stream formet...
        OutputStreamWriter os = new OutputStreamWriter(s.getOutputStream());
        PrintWriter out = new PrintWriter(os); 
           
        out.println(str);
        os.flush();
    }
}