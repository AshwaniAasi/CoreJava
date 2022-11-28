package _6_String_WrapperClasses;

import java.util.Scanner;

/*
 	WAP to check if the latter 'e' is present in the word entered by user.
 */
public class _2_CheckTheLatter 
{
	public static void main(String[] args) 
	{
		int count=0;
		boolean flag=true;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the latter");
		String latter=sc.nextLine();
		for(int i=0; i<latter.length(); i++)
		{
			if(latter.charAt(i)=='e')
			{
				count++;
				flag=true;
				break;
			}
			else
			{
				flag=false;
			}
		}
		
		if (flag)
		{
			System.out.println("latter 'e' is present in this latter by : "+ count +" times");
		}
		else
			System.out.println("latter 'e' is not found.");
	}
}
