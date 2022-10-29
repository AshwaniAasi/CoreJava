package _2_controlStatement;

import java.util.Scanner;
/*
 * WAP to get a number from user and check Even Or Odd numbers?
 */
public class _2_EvenOddNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your number : ");
		int a =sc.nextInt();
		if (a %2!=0)
		{
			System.out.println("Your number "+a+" is odd number");
		}
		else
		{
			System.out.println("Your number "+a+" is even number");
		}
	}
}
