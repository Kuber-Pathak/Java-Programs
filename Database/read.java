package Database;

import java.sql.*;

public class read {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/java_programs";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url, "root", "");
        System.out.println("Connected");
        String sql = "SELECT * FROM details";
        Statement smt = conn.createStatement();
        ResultSet rset = smt.executeQuery(sql);
        while (rset.next()) {
            System.out.println(rset.getString(1) + " " + rset.getInt(2));
        }
        conn.close();
    }
}
