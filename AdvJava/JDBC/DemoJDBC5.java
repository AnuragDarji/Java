import java.sql.*;

public class DemoJDBC5 {
    public static void main(String[] args) throws Exception {
        
        String url ="jdbc:mysql://localhost:3306/city_master";
        String uname = "root";
        String pass = "";
        int id=7;
        int city_code=10;
        String city_name="Jamnagar";
        String city_state="gujarat";
        String query = "insert into city values(?,?,?,?)";

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        PreparedStatement st = con.prepareStatement(query); // Prepared statement.
        st.setInt(1, id);
        st.setInt(2,city_code);
        st.setString(3, city_name);
        st.setString(4,city_state);

        int count = st.executeUpdate(); // DDL,DML,DQL
        System.out.println(count+" row/s affected.");

        st.close();
        con.close();
    }
}