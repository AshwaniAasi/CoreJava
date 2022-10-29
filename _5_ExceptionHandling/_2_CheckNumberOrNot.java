package _5_ExceptionHandling;

import java.util.Scanner;
//WAP to check whether User Input is number or not?
class Check
{
	static boolean numberOrNot(String in)
	{
		try 
		{
			Integer.parseInt(in);
		} 
		catch (NumberFormatException ex) 
		{
			return false;
		}
		return true;
	}
}

public class _2_CheckNumberOrNot 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the input");
		
		Scanner sc= new Scanner(System.in);
		
		String in=sc.next();
		sc.close();
		if(Check.numberOrNot(in)) 
		{
			System.out.println("Good !! Input is of Integer type");
		}
		else
		{
			System.out.println("Sorry !! The value should be of integer type. Try Again...");
		}
	}
}
