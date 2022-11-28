package _2_controlStatement;

import java.util.Scanner;
/*
 Write a program to print the n natural numbers (using loop)
 */
public class _14_nNaturalNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		sc.close();
		for (int i=1; i<=n; i++)
		{
			System.out.print(i+" ");
		}
	}
}
