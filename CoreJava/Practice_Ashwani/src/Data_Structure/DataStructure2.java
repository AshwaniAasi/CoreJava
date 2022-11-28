package Data_Structure;

import java.util.Scanner;

public class DataStructure2 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter you Username");
		String username=s.next();
		System.out.println("Enter you Password");
		String password=s.next();
		if (username.equals("Aasi") && password.equals("Aasi123"))
		{
			String name="Ashwani"; //comes from database
			String dob="12-10-1994";
			String city="Azamgarh";
			String phone="+917007581106";
			int age=29;
			
			Client_Profile2 cp2=new Client_Profile2(name, dob, age, city, phone);
			cp2.details2();
			
		}
		else
		{
			System.out.println("invalid input");
		}
	}
}
