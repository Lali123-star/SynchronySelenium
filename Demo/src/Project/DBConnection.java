package Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String dbURL ="jdbcmysql://localhost:3306/synechrondatabase";
		String username ="root";
		String password ="root";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection com = DriverManager.getConnection(dbURL, username, password);
		Statement st = com.createStatement();
		String selectquery ="select * from Persons";
		ResultSet r = st.executeQuery(selectquery);
		while(r.next()) {
			System.out.println("PersonID");
			System.out.println("FirstName");
			System.out.println("LastName");
			System.out.println("Addess");
			System.out.println("City");
			
			
			
		}
		
		

	}

}
