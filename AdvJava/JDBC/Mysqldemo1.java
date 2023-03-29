import java.sql.*;
public class Mysqldemo1 {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver is loaded");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/city_master","root","");

            System.out.println("Connection created");
            Statement s = c.createStatement();
            ResultSet rs = s.executeQuery("select * from city");

            System.out.println("ID\tCITY_CODE\tCITY_NAME\tCITY_STATE");

            while(rs.next()) // Retrieve data from resultset
            {
                System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));
            }
        }
        catch(Exception e)
        {
            System.out.println("Exception: "+e);
        }
    }
}
