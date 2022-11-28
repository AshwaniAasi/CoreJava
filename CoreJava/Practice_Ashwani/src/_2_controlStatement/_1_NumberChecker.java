package _2_controlStatement;

import java.util.Scanner;
/*
 * WAP to get a number from user and print whether it is positive or negative or Zero?
 */
public class _1_NumberChecker 
{
	public static void main(String[] args) 
	{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your number : ");
			int a=sc.nextInt();
			if (a>0)
			{
				System.out.println("You enter a positive number."); 
			}
			else if (a<0)
			{
				System.out.println("You enter a negative number.");
			}
			else
			{
				System.out.println("You enter Zero ");
			}
	}

}
