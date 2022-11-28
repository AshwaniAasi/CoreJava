package _2_controlStatement;

import java.util.Scanner;
/*
 WAP to display the n terms of odd natural number and their sum.
 */
public class _17_OddNaturalNumberandSum 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int sum=0, a=sc.nextInt();
		sc.close();
		
		for (int i=1; i<=a; i++)
		{
			if (i%2 != 0)
			{
				System.out.print(i +", ");
				sum=sum+i;
			}
		}
		System.out.println('\n'+"The sum of odd number is : "+sum);
	}
}
