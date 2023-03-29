import java.sql.*;

public class DemoJDBC2 {
    public static void main(String[] args) throws Exception {
        
        String url ="jdbc:mysql://localhost:3306/city_master";
        String uname = "root";
        String pass = "";
        String query = "select * from city";
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        
        String userData = "";
        while(rs.next()){
            userData = rs.getString(1)+" : "+rs.getString(2)+" : "+rs.getString(3)+" : "+rs.getString(4);
            System.out.println(userData);
        }
        st.close();
        con.close();
    }
}
