import java.io.*;
import java.net.*;

class Server{
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket(1234);
        byte b[] = new byte[1024];
        
        while(true){
            DatagramPacket dp = new DatagramPacket(b, b.length);
            ds.receive(dp);

            String str = new String(dp.getData());
            System.out.println(str);
        }
    }
}