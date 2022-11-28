package MySQLConnection_Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JavaMySQLConnection 
{
	public static void main(String[] args) 
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sp_demo", "root", "12345");
			PreparedStatement ps1=con.prepareStatement("insert into register value('Ashwani','sonuc1994@gmail.com')");
			ps1.executeUpdate();
			PreparedStatement ps2=con.prepareStatement("insert into register value('Anuradha','anuradha@gmail.com')");
			ps2.executeUpdate();
			PreparedStatement ps=con.prepareStatement("insert into register value('ashwani','sonuc1994@gmail.com')");
			ps.clearParameters();
			PreparedStatement p3=con.prepareStatement("insert into register value('Abhijeet','abhijeet007@gmail.com')");
			ps.clearParameters();
		} 
		catch (Exception e)
		{			
			System.out.println(e);
		}
	}
}
