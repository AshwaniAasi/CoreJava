package _2_controlStatement;

import java.util.Scanner;
/*
 	WAP to Compute the sum of Digits in a Given integer.
 */
public class _18_SumOfDigits 
{
	public static void main(String[] args) 
	{
		int sum = 0, num=567;
		while (num>0)
		{
			int rem=num%10;
			sum = sum+rem;
			num=num/10;
		}
		System.out.println(sum + " "+ num);
	}

}
