package _2_controlStatement;

import java.util.Scanner;
/*
 	WAP to check Prime Number using for Loops.
 */
public class _21_PrimeNumberbyLoop 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num=sc.nextInt();
		sc.close();
		boolean flag=false;
		for(int i=2; i<=num/2; i++)
		{
			if (num % i ==0)
			{
				flag=true;
				break;
			}
		}
		if(!flag)
		{
			System.out.println(num+ " is a prime number ");
		}
		else
			System.out.println(num+" is not a prime number");
	}
}
