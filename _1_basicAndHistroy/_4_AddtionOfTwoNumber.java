package _1_basicAndHistroy;

import java.util.Scanner;

/*
 * Create a java program To Print Additon of Two Numbers. (take numbers using scanner)
 */
public class _4_AddtionOfTwoNumber 
{
	public static void main(String[] args) 
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number : ");
		a=sc.nextInt();
		System.out.println("Enter Second Number : ");
//		sc.nextInt(); //but there is no need for method calling first
		b=sc.nextInt();
		
		System.out.println("You Entered : "+a+ ", "+b+" and your result is : "+(a+b));
		
		
	}

}
