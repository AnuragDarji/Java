import java.net.*;

public class UDPServer {
    public static void main(String[] args) throws Exception {
        
        DatagramSocket ds = new DatagramSocket(9999);

        // recieve data
        byte[] b1 = new byte[1024];
        DatagramPacket dp = new DatagramPacket(b1, b1.length);
        ds.receive(dp);

        String str = new String(dp.getData()); // Convert data -> String
        int num = Integer.parseInt(str.trim());  // String -> int
           
        int result = num*num;
        byte[] b2 = String.valueOf(result).getBytes();
        InetAddress ia = InetAddress.getLocalHost();
        // Send result.
        DatagramPacket dp1 = new DatagramPacket(b2, b2.length,ia,dp.getPort());
        ds.send(dp1);

    }
}
