package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DBConnect {

	public static void main(String[] args) {
		String dbDriver="com.mysql.cj.jdbc.Driver";
		String dbURL="jdbc:mysql://127.0.0.1:3306/Capgemini";
		String dbUserName="root";
		String dbPassword="jai@HS20shri";
		String query="select * from DegreeStudent";
		try {
			Class.forName(dbDriver);
		}
		catch(ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		try {
			Connection c=DriverManager.getConnection(dbURL,dbUserName,dbPassword);
			Statement st=c.createStatement();
            ResultSet rs=st.executeQuery(query);
			
			while(rs.next())
			{
				String Student_data=" ";
				for(int i=1;i<=2;i++)
				{
					Student_data=Student_data+" "+rs.getString(i);
				}
				System.out.println(Student_data);
			}
				
		}
		catch(SQLException e)
		{
			System.out.println("An error occured.Maybe password is invalid");
			e.printStackTrace();
			}
			
		}
		
		
	}


