package _5_ExceptionHandling;

import java.util.Scanner;
/*
 	Throw an exception if age is below 18 (print "Access Denied"). If age is 18 or older, Print "Access Granted".
 */
public class _6_AccessCase 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age.");
		int age=sc.nextInt();
		sc.close();
		
		if(age<18)
		{
			throw new ArithmeticException("Access Denied - You must be at lest 18 years old.");
			
		}
		else
		{
			System.out.println("Access Granted");
		}
		
	}
}
