
package DAO;

import java.sql.*;
import java.sql.SQLException;


public class ConnectDB {
    public Connection getConnection() throws ClassNotFoundException, SQLException{
        Connection conn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=QLNhaHang";
            String user ="sa";
            String pass = "sa";
            conn = (Connection) DriverManager.getConnection(url,user,pass);
            if(conn != null)
                System.out.println("Kết nối thành công");
        } catch(Exception e){
            System.err.println(e.toString());
        }
        return conn;
    }
}
