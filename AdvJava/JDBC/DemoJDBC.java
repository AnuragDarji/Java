import java.sql.*;

public class DemoJDBC {
    public static void main(String[] args) throws Exception {
        
        String url ="jdbc:mysql://localhost:3306/city_master";
        String uname = "root";
        String pass = "";
        String query = "select city_name from city where id=3";
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        
        rs.next();
        String name = rs.getString("city_name");
        
        System.out.println(name);
        
        st.close();
        con.close();
        
    }
}
