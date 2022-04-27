package crude;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CrudeDB1 {

	public static void main(String[] args) {
		String dbURL="jdbc:mysql://127.0.0.1:3306/simple";
		String dbUserName="root";
		String dbPassword="jai@HS20shri";
		try
		{
			Connection c=DriverManager.getConnection(dbURL,dbUserName,dbPassword);
			String sql="select * from employee";
			Statement st=c.createStatement();
            ResultSet rs=st.executeQuery(sql);
			
			
			while(rs.next())
			{
				int id=rs.getInt(1);
				String name=rs.getString(2);
				String password=rs.getString(3);
				String email=rs.getString("email");
				String res="User: %d: %s - %s - %s";
				System.out.println(String.format(res,id, name, password, email));
			}
			c.close();
		
			/*PreparedStatement p1= c.prepareStatement(sql);
			p1.setString(1, "102");
			p1.setString(2, "john");
			p1.setString(3, "john123");
			p1.setString(4, "john@gmail.com");
			int row = p1.executeUpdate();
			if(row>0) {
				System.out.println("New user Added");
			}
			 c.close();
			*/	
				
				
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
			
}
}