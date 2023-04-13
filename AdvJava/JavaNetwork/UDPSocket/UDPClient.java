import java.net.*;

public class UDPClient{
    public static void main(String[] args) throws Exception {

        DatagramSocket ds = new DatagramSocket();

        int i = 8;
        byte[] b = String.valueOf(i).getBytes(); // convert int -> String -> Bytes.
        InetAddress ia = InetAddress.getLocalHost();

        // Data Send
        DatagramPacket dp = new DatagramPacket(b, b.length,ia,9999);
        ds.send(dp);

        // Recieve Result.
        byte[] b1 = new byte[1024];
        DatagramPacket dp1 = new DatagramPacket(b1, b1.length);
        ds.receive(dp1);

        String str = new String(dp1.getData()); // convet data -> String 
        System.out.println("result is: "+str);
    }
}
