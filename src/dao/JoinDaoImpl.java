package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import conn.DBConnect;
import model.Member;

public class JoinDaoImpl implements JoinDao {
    private DBConnect db;
    
    public JoinDaoImpl() {
        db = DBConnect.getInstance();
    }
    
    @Override
    public void insert(Member m) {
        Connection conn = null;
        
        String sql = "insert into member values(?,?,?,?)";
        PreparedStatement pstmt = null;
        
        try {
            conn = db.getConnection();
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, m.getId());
            pstmt.setString(2, m.getPwd());
            pstmt.setString(3, m.getName());
            pstmt.setString(4, m.getEmail());
            pstmt.executeUpdate();
            
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally {
            if(pstmt != null) try {pstmt.close();} catch(SQLException ex){System.out.println(ex.toString());}
            if(conn != null) try {conn.close();} catch(SQLException ex){System.out.println(ex.toString());}
        }
    }
}
