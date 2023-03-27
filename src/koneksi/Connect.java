/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author IRFAN MARZENDA
 */
public class Connect {
    private static Connection koneksi;
    public static Connection koneksi() throws SQLException {
        try {
            String url = "jdbc:mysql://localhost/database_lapangan";  // url database
            String user = "root";                                     //id user db_mysql
            String pass = "";                                         // password db_mysql
            DriverManager.getConnection(url, user, pass);             //driver 
            koneksi = DriverManager.getConnection(url, user, pass);   //koneksi driver ke mysql
        } catch (HeadlessException | SQLException e) {
            System.out.println("Koneksi Gagal" + e.getMessage());
        }
        return koneksi;
    }
}
