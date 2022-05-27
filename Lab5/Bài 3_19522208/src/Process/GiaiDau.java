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


public class GiaiDau {
    String hostname = "localhost";
    String db = "quanlydoibong";
    String port = "1433";
    String user = "sa";
    String password = "123123";
    
    public int themGiaiDau(String maGiai, String tenGiai, Date ngayBD, Date ngayKT)
    {
        int countResult = 0;
        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectURL = "jdbc:sqlserver://" +hostname + ":"+port+";DatabaseName=" + db + ";encrypt=true;trustServerCertificate=true;";
            Connection conn = DriverManager.getConnection(connectURL, user, password);   
            String query = "INSERT INTO GIAIDAU VALUES(?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, maGiai);
            ps.setString(2, tenGiai);
            ps.setDate(3, new java.sql.Date(ngayBD.getTime()));
            ps.setDate(4, new java.sql.Date(ngayKT.getTime()));
            countResult = ps.executeUpdate();   
        }
        catch(Exception e){
            System.out.println(e);
            return countResult;
        }
        
        return countResult;
    }
    
    public HashMap<String,String> getListGiaiDau() {
        HashMap<String,String> listGiaiDau = new HashMap<>();
        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectURL = "jdbc:sqlserver://" +hostname + ":"+port+";DatabaseName=" + db + ";encrypt=true;trustServerCertificate=true;";
            Connection conn = DriverManager.getConnection(connectURL, user, password);   
            String SQL = "SELECT DISTINCT MAG,TENGIAI FROM GIAIDAU ORDER BY MAG";
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(SQL);
            while (rs.next()) {
                listGiaiDau.put(rs.getString("MAG"),rs.getString("TENGIAI"));
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return listGiaiDau;
    }

}
