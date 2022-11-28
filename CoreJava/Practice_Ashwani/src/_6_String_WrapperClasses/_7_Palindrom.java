package _6_String_WrapperClasses;

import java.util.Scanner;

/*
 WAP to check String is Palindrome or not?
 */
class PalindromeChecker
{
	static String isPalindrome(String str)
	{
		StringBuilder sb=new StringBuilder(str);
		sb.reverse();
		
		String rev = sb.toString();
		
		if(str.equals(rev))
		{
			return "This is a palindrome number";
		}
		else
		{
			return  "This is not a palindrome number";
		}
	}
}

public class _7_Palindrom 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the word : ");
		String st1=sc.next();
		
		System.out.println(PalindromeChecker.isPalindrome(st1));
		
	}
}
