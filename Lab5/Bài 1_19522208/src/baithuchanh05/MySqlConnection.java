/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baithuchanh05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author 84346
 */
public class MySqlConnection {
    public static Connection getMySqlConnection() throws ClassNotFoundException, SQLException{
        String hostName = "localhost";
        String dataBaseName = "quanlysanpham";
        String userName = "root";
        String password = "";
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        String connectionURL = "jdbc:mysql://"+hostName+"/"+dataBaseName;
        
        Connection conn = DriverManager.getConnection(connectionURL, userName, password);
        return conn;
    }
    
    
}
