/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author LURY
 */
public class koneksiLury {
     private Connection connection;
    private Statement statement;
    private ResultSet resultSet;
    public Integer id;
    public Integer cekLogin;
    public boolean cekFormAdmin = false;

    public Integer getIdAdmin() {
        return id;
    }

    public void setIdAdmin(Integer id) {
        this.id = id;
    }
    
    
    
    public Connection getConnection() {
        return connection;
    }

    public void getCon() {
        
        try {
            String urlDatabase = "jdbc:mysql://localhost/database_lapangan"; //alamat database
            String user = "root"; //user yang dipakai utk akses database
            String password = ""; //password yang digunakan utk akses database
            connection = DriverManager.getConnection(urlDatabase, user, password);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Koneksi Gagal! " + ex.getMessage());
        }   
       
    }

    public void Eksekusi(String Query, String Pesan){
        getCon();
        try {
            statement=connection.createStatement();
            statement.execute(Query);
            statement.close();
            JOptionPane.showMessageDialog(null, Pesan);
        } catch (SQLException ex) {
            Logger.getLogger(koneksiLury.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void eksekusiFor(String Query){
          getCon();
        try {
            statement=connection.createStatement();
            statement.execute(Query);
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(koneksiLury.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   
    public void tampil(javax.swing.JTable table, String Query) {
        getCon();
        try {
     
            statement = connection.createStatement();
            resultSet = statement.executeQuery(Query);
            
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
            
            statement.close();
            resultSet.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    

    
    public void combo(String Query, String ID,String Nama, javax.swing.JComboBox cb) {
        getCon();
        try {

            String showDataQuery = Query;
            statement = connection.createStatement();
            resultSet = statement.executeQuery(showDataQuery);
          
            while (resultSet.next()) {
                cb.addItem(resultSet.getString(ID) + "-" + resultSet.getString(Nama));
            }

            statement.close();
            resultSet.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Gagal Menampilkan di combobox " + ex.getMessage());
        }
    }
    
    private String dateNow(){
         LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyy");
        String formattedDate = currentDate.format(formatter);
        System.out.println("Current date in ddMMyyyy format: " + formattedDate);
        return formattedDate;
    }
    
    public void autoNumber(javax.swing.JTextField textField){
        
        try{
           getCon();
            Statement s = connection.createStatement();
            String sql = "SELECT `nonota` FROM `transaksimakanan` WHERE nonota LIKE '%"+ dateNow() +"%' ORDER BY nonota DESC";
            System.out.println(sql);
            ResultSet r = s.executeQuery(sql);
            if (r.next()){
                String prefix = "TSC" + dateNow() ;
                String NoFaktur = r.getString("nonota").substring(13);
                String TR = "" + (Integer.parseInt(NoFaktur)+1);
                String No1 = "";
                
               switch (TR.length()) {
                   case 1:
                       No1 = "00";
                       break;
                   case 2:
                       No1 = "0";
                       break;
                   case 3:
                       No1 = "";
                       break;
                   default:
                       break;
               }
               
                textField.setText(prefix + No1 + TR);
            }else {
                textField.setText("TSC" + dateNow() + "001");
            }
            r.close();
            s.close();  
        }catch (NumberFormatException | SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
