import java.sql.*;

class JdbcInsert1 { 
  
    public static void main (String[] args) { 
        try { 
            String url = "jdbc:msql://10.0.10.3"; 
            Connection conn = DriverManager.getConnection(url,"",""); 
            Statement st = conn.createStatement(); 
            st.executeUpdate("INSERT INTO Customers " + 
                "VALUES (1001, 'Simpson', 'Mr.', 'Springfield', 2001)"); 
            st.executeUpdate("INSERT INTO Customers " + 
                "VALUES (1002, 'McBeal', 'Ms.', 'Boston', 2004)"); 
            st.executeUpdate("INSERT INTO Customers " + 
                "VALUES (1003, 'Flinstone', 'Mr.', 'Bedrock', 2003)"); 
            st.executeUpdate("INSERT INTO Customers " + 
                "VALUES (1004, 'Cramden', 'Mr.', 'New York', 2001)");

            conn.close(); 
        } catch (Exception e) { 
            System.err.println("Got an exception! "); 
            System.err.println(e.getMessage()); 
        } 
  
    }
} 
