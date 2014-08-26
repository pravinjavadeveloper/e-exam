package practice.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil 
{
	public Connection getConnection()
	{
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		}
			catch(ClassNotFoundException ex )
		{
			ex.printStackTrace();
		}
			Connection con=null;
		try
		{
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet","root","root");
			System.out.println("succefuly succeful");
		}
			catch (SQLException sql)
		{
			sql.printStackTrace();
		}
		return con;
	}
}
