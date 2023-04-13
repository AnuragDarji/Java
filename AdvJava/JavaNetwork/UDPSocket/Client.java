import java.io.*;
import java.net.*;

class Client{
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket();

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        InetAddress ip = InetAddress.getLocalHost();
        byte b[] = new byte[1024];
        String str = input.readLine();
        b = str.getBytes();

        DatagramPacket dp = new DatagramPacket(b, b.length,ip,1234);
        ds.send(dp);

        ds.close();

    }
}