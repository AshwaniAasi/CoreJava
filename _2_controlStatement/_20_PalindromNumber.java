package _2_controlStatement;

import java.util.Scanner;
/*
 WAP to check whether the number is Palindrom or not? ( a number that is same after reverse)
 */
public class _20_PalindromNumber 
{
	public static void main(String[] args) 
	{
		int rem, result=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num=sc.nextInt();
		sc.close();
		int orginalNum=num;
		while(num !=0)
		{
			rem=num%10;
			result=result*10+rem;
			num /=10;
		}
		if (orginalNum==result)
		{
			System.out.println(orginalNum+" is palindrom Number");
		}
		else
			System.out.println(orginalNum+" not palindrom Number");
			
	}
}
