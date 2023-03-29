# **Advance Java Programming**

## **| *Java Networking***
<br>

**1. LocalHost IP**
```java
import java.net.*;

public class GetIpAddress {
    public static void main(String[] args) {
        try{
            InetAddress ip = InetAddress.getLocalHost();
            System.out.println("LocalHost: "+ip);
        }
        catch(Exception e){
            System.out.println("Exception: "+e);
        }
        
    }
}
```
**2. Website IP**
```java
import java.net.*;

public class GetIpAdd2 {
    public static void main(String[] args) {
        try{
            InetAddress ip = InetAddress.getByName("www.google.com");
            System.out.println("ip: "+ip);
        }
        catch(Exception e){
            System.out.println("Exception: "+e);
        }
        
    }
}
```
**3. GetHost Name**
```java
import java.net.*;

public class GetHost {
    public static void main(String[] args) {
        try{
            InetAddress ip = InetAddress.getByName("192.168.73.94");
            System.out.println("HostAddress: "+ip.getHostName());
        }
        catch(Exception e){
            System.out.println("Exception: "+e);
        }
    }
}
```
**4. GetHost Name of Website**
```java
import java.net.*;

public class GetHost2 {
    public static void main(String[] args) {
        try{
            InetAddress ip = InetAddress.getByName("www.google.com");
            System.out.println("HostAddress: "+ip.getHostAddress());
        }
        catch(Exception e){
            System.out.println("Exception: "+e);
        }
    }
}
```
**5. GetHostName & GetHostIP**
```java
import java.util.Scanner;
import java.net.*; //required for InetAddress class.

public class InetDemo {
    public static void main(String[] args) {
        try{
            Scanner obj = new Scanner(System.in);
            System.out.print("Enter Website name: ");
            String name = obj.nextLine();
            InetAddress ip = InetAddress.getByName(name);
            
            System.out.println("Host Name: "+ip.getHostName());
            System.out.println("IP Address: "+ip.getHostAddress());
        }
        catch(Exception e){
            System.out.println("Exception: "+e);
        }
    }
}
```
---
## ***Port Number:***
- A port number identifies the endpoint of connection/Process on a machine.
---
## ***Socket:***
- The combination of an IP address and a port number.
- Two types
    - Stream socket: realiable two-way connected communication streams.
    - Datagram socket
---
<br>

**TCP Client Server Program.**
<br>

*Server.java*
```java
import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) throws Exception {
        System.out.println("Server is started.");
        ServerSocket ss = new ServerSocket(9999);
        System.out.println("Server is waiting for client request");
        Socket s = ss.accept();
        System.out.println("Client Connected");

        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String str = br.readLine();

        System.out.println("Client: " + str);
    }
}
```
<br>

 *Client.java*   

   ```java
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
   ```
*Output:*
<p>
<img src="https://user-images.githubusercontent.com/127482974/228489138-48f15716-4fd9-4a6d-933a-67310a189158.PNG" width="250" height="auto">
</p>
<br>

**Client-Server ChatApp**
- *ChatServer.java*
```java
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
```
- *ChatClient.java*
```java
import java.net.*;
import java.io.*;

public class ChatClient {
    public static void main(String args[]) throws Exception {
        Socket sk = new Socket("localhost", 2000);

        BufferedReader sin = new BufferedReader(new InputStreamReader(sk.getInputStream()));
        PrintStream sout = new PrintStream(sk.getOutputStream());

        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        String s;
        System.out.println("Connected Successfully...");
        while (true) {
            System.out.print("Client: ");
            s = stdin.readLine();
            sout.println(s);
            s = sin.readLine();
            System.out.print("Server: " + s + "\n");
            if (s.equalsIgnoreCase("BYE"))
                break;
        }
        sk.close();
        sin.close();
        sout.close();
        stdin.close();
    }
}
```
- *Output:*
<p align="center">
<img src="" width="300" height="auto">
</p>
