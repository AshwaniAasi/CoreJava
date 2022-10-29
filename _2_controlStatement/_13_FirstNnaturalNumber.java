package _2_controlStatement;

import java.util.Scanner;
/*
 	Display the first 10 natural numbers (using while loop)
 */
public class _13_FirstNnaturalNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the length of natural number : ");
		int n=sc.nextInt();
		sc.close();
//		for (int i=1; i<=n;i++)
//		{
//			System.out.print(i + ", ");
//		}
		int i=1;
		while (i<=n)
		{
			System.out.print(i);
			i++;
		}
		
	}

}
