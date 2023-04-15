import java.sql.*;

public class Transactionmanagement{
    public static void main(String[] args) throws Exception {
        Connection con = null;
        Class.forName("com.mysql.jdbc.Driver"); 
        con = DriverManager.getConnection("jdbc:mysql://localhost/city_master","root","");
        con.setAutoCommit(false);
        Statement stmt = con.createStatement();
        stmt.executeUpdate("INSERT INTO student VALUES(14,'Ram')");
        stmt.executeUpdate("INSERT INTO student VALUES(15,'Ravan')");
        con.commit();
        con.close();
    }
}
