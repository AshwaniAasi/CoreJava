package _2_controlStatement;

import java.util.Scanner;
/*
 * A company decided to give bonus of 5% to employee if his/her years of service is more then 5 years. Ask user for their 
 * Salary and year of service and print the net bonus amount.
 */
public class _6_SalaryBonusIncrement 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Salary of yours : ");
		double salary= sc.nextDouble();
		System.out.println("how many years you works? ");
		int year=sc.nextInt();
		
		if (year>5)
		{
			System.out.println("Cogratulation!"+'\n'+"Now your Salary will incremented by 5 % and your total salary is : "+(salary*1.05));
		}
		else
		{
			System.out.println("Sorry you need to work on "+(5-year)+" remaning year for increment");
		}
	}
}
