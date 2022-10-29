package _2_controlStatement;

import java.util.Scanner;
/*
 * Take input of age of 3 people by user and determine oldest and youngest among them.
 */
public class _8_OldestAndYoungest 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st Person age");
		int a=sc.nextInt();
		System.out.println("Enter the 2nd Person age");
		int b=sc.nextInt();
		System.out.println("Enter the 3rd Person age");
		int c=sc.nextInt();
		System.out.println("===============================");
		//for oldest one
		if (a>b && a>c)
		{
			System.out.println("1st Person is oldest to all");
		}
		else if (b>a && b>c)
		{
			System.out.println("2nd Person is oldest to all");
		}
		else 
		{
			System.out.println("3rd Person is oldest to all");
		}
		//for youngest
		if (a<b && a<c)
		{
			System.out.println("1st Person is youngest to all");
		}
		else if (b<a && b<c)
		{
			System.out.println("2nd Person is youngest to all");
		}
		else 
		{
			System.out.println("3rd Person is youngest to all");
		}
	}
}
