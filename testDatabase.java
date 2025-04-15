import java.sql.*;

public class test{
	public static void main(String[] args){
		String url = "jbdc:mysql://localhost:3306/www.indieonthemove.com/";
		String username = "JYod";
		String password = "12JYod";
		String query = "INSERT INTO students (id, name) VALUES (109, 'bahtt')";
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection(url, username, password);
			Statement st = c.createStatement();
			int count = st.executeUpdate(query);
			System.out.println("NUmber of rows affected by this query: " + count);
			st.close();
			c.close();
			System.out.println("Connection closed.");
		} catch (ClassNotFoundException r){
			System.err.println("JDBC Driver not found: " + e.getMessage());
		} catch(SQLException e){
			System.err.println("SQL Error: " + e.getMessage());
		}
	}
}

