/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baithuchanh05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author 84346
 */
public class BaiThucHanh05 {
    /**
     * @param args the command line arguments
     */
    public static Connection getMyConnection() throws SQLException, ClassNotFoundException{
        return MySqlConnection.getMySqlConnection();
    }
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        try{
            Connection conn = BaiThucHanh05.getMyConnection();
            String strSQL = "Select * from SANPHAM";
            PreparedStatement ps = conn.prepareStatement(strSQL);
            ResultSet rs = ps.executeQuery();
            
            String row = rs.getString(1);
            System.out.print(row);
        }catch(SQLException e){
            System.out.print(e);
        }
    }
    
}
