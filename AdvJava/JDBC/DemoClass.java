import java.io.*;
import java.sql.*;
// Class.forName() --> use for load Driver.
public class DemoClass {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");

        // if you write above statement ignore next line.
        // DriverManager.registerDriver(new com.mysql.jdbc.Driver());
    }
}

class Pqr{
    //static block
    static{
        System.out.println("in static");
    }

    //instance block
    {
        System.out.println("in instance");
    }
}
// When run  this code nothing will be printed.
 