package Database;

import java.sql.*;

public class update {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/java_programs";
        String uname = "root";
        String pwd = "";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url, uname, pwd);

        String sql = "UPDATE details SET `Roll no` = ? WHERE `Name` = 'ram'";

        PreparedStatement psmt = conn.prepareStatement(sql);
        int input = 77;
        psmt.setInt(1, input);
        psmt.executeUpdate();
    }
}
