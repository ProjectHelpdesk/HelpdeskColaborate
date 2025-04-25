package ticketing_helpdesk.koneksi;
import java.sql.*;

public class koneksi {
    public Connection koneksi ; 
    public Statement stm ;
    
    public Connection connect (){
        try {
           Class.forName("com.mysql.jdbc.driver") ;
           System.out.println("berhasil terkoneksi"); 
        } catch (ClassNotFoundException ex) {
            System.out.println("gagal koneksi" + ex );
        }
       String url = "jdbc:mysql://localhost/db.koneksi";
       
       try {
        koneksi = DriverManager.getConnection(url,"root","");
        stm = koneksi.createStatement();
        System.out.print("berhasil masuk database");
       } catch (Exception e) {
           System.out.print("Gagal koneksi ke database");
       }
       return koneksi ;
    }
}
