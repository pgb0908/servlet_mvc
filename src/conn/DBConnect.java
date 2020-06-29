package conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnect {
    
    private static DBConnect db = new DBConnect();
    private Connection con = null;
    
    String driver = "org.mariadb.jdbc.Driver";
    String jdbcUrl="jdbc:mariadb://localhost:3306/mydb";
    String userId="pgb0908";
    String userPass="123456";
    
    
    private DBConnect() {
    }
    
    public static DBConnect getInstance() {
        return db;
    }
    
    public Connection getConnection() {
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(jdbcUrl, userId, userPass);
            
            if(con != null) { System.out.println("DB ���� ����!!"); }
            
        } catch (ClassNotFoundException e) {
            System.out.println("����̹� �ε� ����");
        } catch (SQLException e) {
            System.out.println("DB ���� ����"); 
        }
        
        return con; 
    }
    
    

    
    /*
     * public static void main(String[] args) { DBConnect db = new DBConnect();
     * db.getConnection(); }
     */
     
}
