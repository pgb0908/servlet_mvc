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
            
            if(con != null) { System.out.println("DB ���� ����!!"); }
            
        } catch (ClassNotFoundException e) {
            System.out.println("����̹� �ε� ����");
        } catch (SQLException e) {
            System.out.println("DB ���� ����"); 
        }
    }
    
    
    /*
     * public static void main(String[] args) { DBConnect dbcon = new DBConnect(); }
     */
}
