package _2_controlStatement;

import java.util.Scanner;
/*
 * WAP that takes a year from user and print whether that year is leap year or not.
 */
public class _10_FindLeapYear 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the year : ");
		int year=sc.nextInt();
		if ( year % 4==0)
		{
			System.out.println("This is leap year");
		}
		else
		{
			System.out.println("This is not a leap year");
		}
	}

}
