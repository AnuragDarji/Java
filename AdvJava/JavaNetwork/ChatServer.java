import java.net.*;
import java.io.*;

public class ChatServer {
    public static void main(String args[]) throws Exception {
        ServerSocket ss = new ServerSocket(2000);
        Socket sk = ss.accept();

        // echo("Enter message to send : ");
        BufferedReader cin = new BufferedReader(new InputStreamReader(sk.getInputStream()));
        PrintStream cout = new PrintStream(sk.getOutputStream());
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        String s;
        System.out.println("Request Accepted...");
        while (true) {
            s = cin.readLine();
            if (s.equalsIgnoreCase("BYE")) {
                cout.println("BYE");
                cout.print("Lets end talk");
                break;
            }
            System.out.print("Client : " + s + "\n");
            System.out.print("Server : ");
            s = stdin.readLine();
            cout.println(s);
        }

        ss.close();
        sk.close();
        cin.close();
        cout.close();
        stdin.close();
    }

    private static void echo(String enter_message_to_send__) {
        throw new UnsupportedOperationException("Not supported yet."); 
        // To change body of generated methods, choose
        // Tools | Templates.
    }
}