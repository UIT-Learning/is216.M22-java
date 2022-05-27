/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Process;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Date;


public class ChiTietGiaiDau {
    String hostname = "localhost";
    String db = "quanlydoibong";
    String port = "1433";
    String user = "sa";
    String password = "123123";
    public int themChiTietGiaiDau(String maGiai, String maDoi)
    {
        int countResult = 0;
        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectURL = "jdbc:sqlserver://" +hostname + ":"+port+";DatabaseName=" + db + ";encrypt=true;trustServerCertificate=true;";
            Connection conn = DriverManager.getConnection(connectURL, user, password);   
            String query = "INSERT INTO CT_GD VALUES(?,?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, maGiai);
            ps.setString(2, maDoi);
            countResult = ps.executeUpdate();   
        }
        catch(Exception e){
            System.out.println(e);
            return countResult;
        }
        
        return countResult;
    }
}
