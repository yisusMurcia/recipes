package persistence;


import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionToBd {
    private static Connection connection = null;
    private static String UrlBD = "jdbc:mysql://localhost:1527/recipes";
    private static String user= "root";
    private static String password = "";

    public static Connection getConnection() {
        try{
            connection = DriverManager.getConnection(UrlBD, user, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return connection;
    }

    public static void closeConnection() {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            Logger.getLogger(ConnectionToBd.class.getName()).log(Level.SEVERE, null, e);
        }

        connection = null;
    }
}
