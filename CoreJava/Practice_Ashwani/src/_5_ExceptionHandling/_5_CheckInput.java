package _5_ExceptionHandling;

import java.util.Scanner;

/*
 WAP to check the input of user which entered whether it is string, char, float, or integer, 
 */
public class _5_CheckInput 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input");
		String s=sc.nextLine();
		
		try
		{
			int x = Integer.parseInt(s);
			System.err.println("Input is of Integer type");
			
		} 
		catch (Exception e1) 
		{
			try 
			{
				float x = Float.parseFloat(s);
				System.out.println("Input is of Float type");
			} 
			catch (Exception e2) 
			{
				if(s.length()==1)
				{
					System.out.println("Input is Char type");
				}
				else
				{
					System.out.println("Input is String type");
				}
			}
		}
		finally
		{
			System.out.println("End of Program");
		}
	}
}
