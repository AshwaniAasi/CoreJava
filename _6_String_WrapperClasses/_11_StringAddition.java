package _6_String_WrapperClasses;

import java.util.Scanner;

/*
 WAP to enter two numeric value in String variable from the user and perform addition.
 */
class Addition
{
	static void getAddition(int s1, int s2)
	{
		int add=s1+s2;
		System.out.println("The Addition of "+s1+ " and "+s2+" are : "+add);
	}
}
public class _11_StringAddition 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First number : ");
		String str1=sc.next();
		System.out.println("Enter the Second number : ");
		String str2=sc.next();
		sc.close();
		
		int a=Integer.parseInt(str1);
		int b=Integer.parseInt(str2);
		
		Addition.getAddition(a, b);
	}
}
