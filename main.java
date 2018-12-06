import java.sql.*;

public class main {

	public static void main (String[] args) {
        
      	String url = "jdbc:msql://10.0.10.3:3306/pwcho";
	String username = "kfisz";
	String password = "password";
		
	System.out.println("Connecting to the database");
    
        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            System.out.println("Database conneted");
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot connect to the database!", e);
        }

    }
}
