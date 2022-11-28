package Data_Structure;

import java.util.Scanner;

public class PremitiveDataStructure 
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
			Client_Profiles cp1=new Client_Profiles();
			cp1.details(name);
		}
		else
		{
			System.out.println("invalid input");			
		}
	}
}
