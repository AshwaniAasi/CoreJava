package _2_controlStatement;

import java.util.Scanner;
/*
 WAP to Reverse a Number using a while loop in java.
 */
public class _19_ReverseNumber 
{
	
	public static void main(String[] args) 
	{	
		int num, rem,result=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		num=sc.nextInt();
		sc.close();
		while (num!=0)
		{
			rem=num%10;
			result=result*10+rem;
			num/=10;	
		}
		System.out.println("Reversed Number : "+result);		
	}
}
