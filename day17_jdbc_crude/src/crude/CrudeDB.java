package crude;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CrudeDB {

	public static void main(String[] args) {
		String dbURL="jdbc:mysql://127.0.0.1:3306/simple";
		String dbUserName="root";
		String dbPassword="jai@HS20shri";
		try {
			Connection c=DriverManager.getConnection(dbURL,dbUserName,dbPassword);
			String sql = "INSERT INTO employee (user_id,user_name,password,email) VALUES (?, ?, ?, ?)";
			PreparedStatement p=c.prepareStatement(sql);
			p.setString(1, "102");
			p.setString(2, "john");
			p.setString(3, "abc@23");
			p.setString(4, "john@gmail.com");
			int row = p.executeUpdate();
		    if (row > 0) {
		        System.out.println("A new user was inserted successfully!");
		    }
			
				c.close();
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}

  }
}
