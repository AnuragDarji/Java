import java.sql.*;

public class DemoJDBC3 {
    public static void main(String[] args) throws Exception {
        
        String url ="jdbc:mysql://localhost:3306/city_master";
        String uname = "root";
        String pass = "";
        String query = "insert into city values(5,3,'rajkot','gujarat')";
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        Statement st = con.createStatement();
        int count = st.executeUpdate(query); // DDL,DML,DQL
        System.out.println(count+" row/s affected.");

        st.close();
        con.close();
    }
}