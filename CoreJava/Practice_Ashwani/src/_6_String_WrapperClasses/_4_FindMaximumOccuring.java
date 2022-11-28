package _6_String_WrapperClasses;

import java.util.Scanner;

/*
 	How to find the maximum occurring character in a given String?
 */
public class _4_FindMaximumOccuring 
{
	public static void main(String[] args) 
	{
		// first Section for given character checking
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Word here : ");
		String str= sc.nextLine();
	
		int count=0;
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)=='a')
			{
				count++;
			}
		}
		System.out.println("Count of character 'a' on String : "+str+" using for loop " + count);
		
		// Second section to print count of 'a' character by for each loop
		
		count=0;
		for(char ch:str.toCharArray())
		{
			if(ch=='n')
			{
				count++;
			}
		}
		System.out.println("Count of character 'n' on String : "+str+" using for loop " + count);
		
		
		// third Section for whole latter checking maximum character
		
		
		
		
	}
}
