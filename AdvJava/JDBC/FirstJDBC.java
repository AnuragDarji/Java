/*
1. import ---> java.sql
2. load and register the driver ---> com.mysql.jdbc.Driver
3. Create connection ---> Connection con = DriverManager.getConnection(url,uname,password)
4. Create statement ---> Statement st = con.createStatement();
5. execute the Query -->
6. process the results
7. close
 */

 import java.sql.*; //1.
 import java.io.*;

public class FirstJDBC {
    public static void main(String[] args) throws Exception {
        
        Class.forName("com.mysql.jdbc.Driver"); //2.
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/city_master","root",""); //3.

        Statement st = con.createStatement(); //4
        ResultSet rs = st.executeQuery("select * from student"); //5

        while(rs.next()){ //6
            // System.out.print(rs.getInt(1)+" ");
            // System.out.println(rs.getString(2));
            String userData = rs.getInt(1)+" : "+rs.getString(2);
            System.out.println(userData);
        }

        rs.close(); //7
        st.close();
        con.close();
    }
}
