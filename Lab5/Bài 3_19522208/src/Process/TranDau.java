/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Process;

import ConnectDB.ConnectionOracle;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import java.util.HashMap;
import javax.swing.JTextField;
public class TranDau {
    String hostname = "localhost";
    String db = "quanlydoibong";
    String port = "1433";
    String user = "sa";
    String password = "123123";
    public int themTranDau(Date ngayDa, String diaDiem, String maGiai, String maDN, String maDK, String tiSo)
    {
        int countResult = 0;       
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectURL = "jdbc:sqlserver://" +hostname + ":"+port+";DatabaseName=" + db + ";encrypt=true;trustServerCertificate=true;";
            Connection conn = DriverManager.getConnection(connectURL, user, password);   
            String query = "INSERT INTO TRANDAU VALUES(?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setDate(1, new java.sql.Date(ngayDa.getTime()));
            ps.setString(2, diaDiem);
            ps.setString(3, maGiai);
            ps.setString(4, maDN);
            ps.setString(5, maDK);
            ps.setString(6, tiSo);           
            countResult = ps.executeUpdate();   
        }
        catch(Exception e){
            System.out.println(e);
            return countResult;
        }
        
        return countResult;
    }
}
