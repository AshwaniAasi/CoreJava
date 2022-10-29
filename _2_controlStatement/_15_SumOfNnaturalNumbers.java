package _2_controlStatement;

import java.util.Scanner;
/*
 	WAP to calculate the sum of n Natural numbers
 */
public class _15_SumOfNnaturalNumbers 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number who you want to find the sum of : ");
		int i,sum=0, a=sc.nextInt();
		sc.close();
		for ( i=1; i<=a; i++)
		{
			sum=sum+i;
		}
		System.out.println("The sum of "+a+" natural number is : "+sum);
	}

}
