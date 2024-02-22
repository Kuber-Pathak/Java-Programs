package Database;

import java.sql.*;

public class insert {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/java_programs";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url, "root", "");

        String sql = "INSERT INTO details (`Name`,`Roll no`,`email`,`password`) VALUES ('zongli','18','password','email')";
        Statement sm = conn.createStatement();
        sm.executeUpdate(sql);

    }
}
