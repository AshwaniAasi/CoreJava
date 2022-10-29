package jdbc_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test1 
{
 public static void main(String[] args) 
 {
	 try 
	 {
		 //for below class name need to add dependecies or jar file of mySql  connector
		Class.forName("com.mysql.cj.jdbc.Driver"); //this is use to load the driver class
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sp_demo", "root", "12345");
//		PreparedStatement ps1=con.prepareStatement("INSERT INTO register VALUE ('Radha','rahda12@gmail.com','Female','Naseerpur')"); 
//		ps1.executeUpdate();
		PreparedStatement ps=con.prepareStatement("select * from register");
		ResultSet rs=ps.executeQuery();
	

		while (rs.next())
		{
			String name1=rs.getString("name");
			String email1=rs.getString("email");
			String gender1=rs.getString("gender");
			String city1=rs.getString("city");
			
			System.out.println("Name : "+ name1);
			System.out.println("Email : "+ email1);
			System.out.println("Gender : "+ gender1);
			System.out.println("City : "+ city1);
			System.out.println("=================================");
			
		}
	 }
	 catch (Exception e) 
	 {
		e.printStackTrace();
	 } 
 }
}
