import java.sql.*;

public class DemoJDBC4 {
    public static void main(String[] args) throws Exception {
        
        String url ="jdbc:mysql://localhost:3306/city_master";
        String uname = "root";
        String pass = "";
        int id=6;
        int city_code=2;
        String city_name="mehsana";
        String city_state="gujarat";
        String query = "insert into city values(" +id+ "," +city_code+ ",'" +city_name+ "','" +city_state+ "')";
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        Statement st = con.createStatement();
        int count = st.executeUpdate(query); // DDL,DML,DQL
        System.out.println(count+" row/s affected.");

        st.close();
        con.close();
    }
}