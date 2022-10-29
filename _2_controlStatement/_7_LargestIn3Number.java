package _2_controlStatement;

import java.util.Scanner;
/*
 * Program to find largest of three Numbers?
 */
public class _7_LargestIn3Number
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the First number : ");
		int a=sc.nextInt();
		System.out.println("Enter the Second number");
		int b=sc.nextInt();
		System.out.println("Enter the Third number");
		int c=sc.nextInt();
		if (a>b && a>c)
		{
			System.out.println("First number is grater then all");
		}
		else if (b>a && b>c)
		{
			System.out.println("Second number is greater then all");
		}
		else
		{
			System.out.println("Third number is greater than all");
		}
	}
}
