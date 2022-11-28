package _2_controlStatement;

import java.util.Scanner;
/*
 * Take value of length and breadth of a rectangle from user and check if it is square or not?
 */
public class _3_SquareChecker 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Length : ");
		float l=sc.nextFloat();
		System.out.println("Enter the breadth : ");
		float b=sc.nextFloat();
		if (l==b)
		{
			System.out.println("It is square");
		}
		else 
		{
			System.out.println("It is rectangle");
		}
		
	}

}
