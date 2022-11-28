package _2_controlStatement;

import java.util.Scanner;
/*
 WAP in java to display the multiplication table of a given integer.
 */
public class _16_MultiplicationOfTable 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number for Table printing...");
		int i, mul=1, a=sc.nextInt();
		sc.close();
		mul=1;
		for (i=1; i<=10; i++)
		{
			mul=a*i;
			System.out.println( a+" * "+i+" = "+mul);
		}
		
				
	}
}
