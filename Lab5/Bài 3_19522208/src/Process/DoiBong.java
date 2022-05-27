/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Process;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;


public class DoiBong {
    String hostname = "localhost";
    String db = "quanlydoibong";
    String port = "1433";
    String user = "sa";
    String password = "123123";
    
    public int themDoiBong(String maDoi, String tenDoi, String quocGia) {      
        int i = 0;      
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectURL = "jdbc:sqlserver://" +hostname + ":"+port+";DatabaseName=" + db + ";encrypt=true;trustServerCertificate=true;";
            Connection conn = DriverManager.getConnection(connectURL, user, password);        
            String query = "INSERT INTO DOIBONG VALUES(?,?,?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, maDoi);
            ps.setString(2, tenDoi);
            ps.setString(3, quocGia);
            i = ps.executeUpdate();       
        }
        catch(Exception e){
            System.out.println(e);
        }
        return i;
    }  
    
    public HashMap<String,String> getListDoiBong() {
        HashMap<String,String> listDoiBong = new HashMap<>();
        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectURL = "jdbc:sqlserver://" +hostname + ":"+port+";DatabaseName=" + db + ";encrypt=true;trustServerCertificate=true;";
            Connection conn = DriverManager.getConnection(connectURL, user, password);    
            String SQL = "SELECT DISTINCT MAD,TENDOI FROM DOIBONG ORDER BY MAD";
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(SQL);
            while (rs.next()) {
                listDoiBong.put(rs.getString("MAD"),rs.getString("TENDOI"));
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return listDoiBong;
    }
    
}
