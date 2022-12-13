package _6_String_WrapperClasses;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 WAP to check email address is valid or not?
 */
class Logic
{
	static void getCheckEmail(String s)
	{
		String r="^[A-Za-z0-9+ .-]+@(.+)$";
		//Compile regular expression to get the pattern
		Pattern p = Pattern.compile(r);
		
		// create instance of matcher
		Matcher m = p.matcher(s);
		
		if(m.matches())
		{
			System.out.println("we can send email confirmation message on this email id\n");
		}
		else
			System.err.println("Please enter the correct email id");
	}
}

public class _10_CheckEmail 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your emild id here");
		String str=sc.nextLine();
		sc.close();
		Logic.getCheckEmail(str);
	}
}
