import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        String mail = "toto@gmail.com";
        Class.forName("com.mysql.jdbc.Driver");
        Connection connexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "toto", "bob");
        try (connexion) {
            String req = "SELECT * from User WHERE login=?;";
            try (PreparedStatement statement = connexion.prepareStatement(req)) {
                statement.setString(1, mail);
                try (ResultSet rs = statement.executeQuery()) {
                    while (rs.next()) {
                        String firstname = rs.getString("login");
                        System.out.println(firstname);
                    }
                }
            }
        }
    }
}
