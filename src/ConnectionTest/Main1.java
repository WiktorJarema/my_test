package ConnectionTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main1 {

    public static void main(String[] args) {

        //Connection nazwa_połączenia = DriverManager.getConnection(url, user, password);


        try (Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/my_db?useSSL=false&characterEncoding=utf8",
                "root",
                "coderslab")) {
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
