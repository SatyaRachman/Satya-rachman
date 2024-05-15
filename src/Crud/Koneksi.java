
package Crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author hp
 */
public class Koneksi {
    private static java.sql.Connection koneksi;
    
    public static java.sql.Connection getKoneksi() {
        if (koneksi == null) {
            try {            
      String url = "jdbc:mysql://localhost:3306/toko_buku";
      String user = "root";
      String password = "";
      DriverManager.registerDriver(new com.mysql.jdbc.Driver());
      koneksi = DriverManager.getConnection(url, user, password);
                System.out.println("KONEKSI BERHASIL");
          }catch(Exception e) {
                System.out.println("ERROR");
          }
        }
      return koneksi;
    }

public static void main(String args[]){
        getKoneksi();
    }
}