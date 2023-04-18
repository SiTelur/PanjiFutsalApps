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

    public void Eksekusi(String Query, String Pesan,int apakahAdaPesanTidak){
        getCon();
        try {
            statement=connection.createStatement();
            statement.execute(Query);
            statement.close();
            if (apakahAdaPesanTidak == 0){
                JOptionPane.showMessageDialog(null, Pesan);
            }else{
                System.out.println("Sukses");
            }
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
    
    public void autoNumber(javax.swing.JTextField textField,String query,String field,String kode){
        
        try{
           getCon();
            Statement s = connection.createStatement();
            
           
            System.out.println(query);
            ResultSet r = s.executeQuery(query);
            if (r.next()){
                String prefix = kode + dateNow() ;
                String NoFaktur = r.getString(field).substring(13);
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
                textField.setText(kode + dateNow() + "001");
            }
            r.close();
            s.close();  
        }catch (NumberFormatException | SQLException e){
            System.out.println(e.getMessage());
        }
    }
    
    public String primaryKey(String query,String kode){
        String primaryKey = null;
        try {
        getCon();
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        if (rs.next()) {
            int maxId = rs.getInt("max_id");
            primaryKey = kode + String.format("%02d", maxId + 1);
            return primaryKey;
        }else{
            return primaryKey = kode + "01";
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return primaryKey;
    }
    
    public String primaryKey2(String query,String defaultPrefix,String defaultNewPrimaryKey){
    getCon();
     String newPrimaryKey = null;
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            String lastPrimaryKey = null;
            while (resultSet.next()) {
                lastPrimaryKey = resultSet.getString(1);
            }

           
            if (lastPrimaryKey == null) {
              return  newPrimaryKey = defaultNewPrimaryKey;
            } else {
                String prefix = defaultPrefix;
                int number = Integer.parseInt(lastPrimaryKey.substring(1));
                number++;
              return  newPrimaryKey = prefix + String.format("%02d", number);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
         return newPrimaryKey;
        
}
}
