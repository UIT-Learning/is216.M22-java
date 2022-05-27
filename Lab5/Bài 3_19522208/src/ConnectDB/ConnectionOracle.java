/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConnectDB;

import java.sql.*;

public class ConnectionOracle {
    
    public static Connection getOracleConnection() throws ClassNotFoundException,
            SQLException {

        String hostname = "localhost";
        String db = "quanlydoibong";
        String port = "1433";
        String user = "sa";
        String password = "123123";
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectURL = "jdbc:sqlserver://" +hostname + ":"+port+";DatabaseName=" + db + ";encrypt=true;trustServerCertificate=true;";
        Connection conn = DriverManager.getConnection(connectURL, user, password);        
        return conn;
    }



}
