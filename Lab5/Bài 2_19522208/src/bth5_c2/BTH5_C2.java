/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bth5_c2;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author 84346
 */
public class BTH5_C2 {
    public static Connection getMyConnection() throws SQLException, ClassNotFoundException{
        return MySqlConnection.getMySqlConnection();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
