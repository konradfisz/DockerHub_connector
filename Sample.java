import java.sql.*;

public class Sample {

	public static void main (String[] args) {
        
      	String url = "jdbc:mysql://10.0.10.3:3306/pwcho?useUnicode=true&character_set_server=utf8mb4";
	String username = "kfisz";
	String password = "password";
	
	System.out.println("Loading driver...");

	try {
	    Class.forName("com.mysql.jdbc.Driver");
	    System.out.println("Driver loaded!");
	} catch (ClassNotFoundException e) {
	    throw new IllegalStateException("Cannot find the driver in the classpath!", e);
	}
		
	System.out.println("Connecting to the database");
    
        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            System.out.println("Database conneted");
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot connect to the database!", e);
        }

    }
}
