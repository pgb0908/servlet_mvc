package conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnect {
    String driver = "org.mariadb.jdbc.Driver";
    Connection con;
    PreparedStatement pstmt;
    ResultSet rs;
    
    String jdbcUrl="jdbc:mariadb://localhost:3306/mydb";
    String userId="pgb0908";
    String userPass="123456";
    
    public DBConnect() {

        try {
            Class.forName(driver);
            con = DriverManager.getConnection(jdbcUrl, userId, userPass);
            
            if(con != null) { System.out.println("DB 연결 성공!!"); }
            
        } catch (ClassNotFoundException e) {
            System.out.println("드라이버 로드 실패");
        } catch (SQLException e) {
            System.out.println("DB 접속 실패");
        }
    }
    
    
    /*
     * public static void main(String[] args) { DBConnect dbcon = new DBConnect(); }
     */
}
