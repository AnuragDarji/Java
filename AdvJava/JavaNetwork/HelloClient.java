import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.*;

public class HelloClient {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost",1234);

        BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
        DataOutputStream out = new DataOutputStream(s.getOutputStream());
        String str;
        str = inp.readLine();
        out.writeBytes(str);
        s.close();
    }
}
