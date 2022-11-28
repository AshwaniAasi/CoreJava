package _2_controlStatement;

import java.util.Scanner;
/*
 * Take two int value from user and print greatest among them?
 */
public class _4_GreatestNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your first number : ");
		int a=sc.nextInt();
		System.out.println("Enter your second number");
		int b=sc.nextInt();
		if (a>b)
		{
			System.out.println("First number is greater then Second");
		}
		else 
		{
			System.out.println("Second number is greater then First");
		}
	}

}
