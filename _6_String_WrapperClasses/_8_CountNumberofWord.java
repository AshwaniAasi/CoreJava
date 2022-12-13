package _6_String_WrapperClasses;

import java.util.Scanner;

/*
 WAP to count the number of word in a String.....
 */
class Count
{
	static int countWord(String str)
	{
		int count=0;
		boolean flag=true;
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)==' ')
			{
				flag=true;
			}
			// for latter count
			else
				count++;
			
			// for words count
//			else if(flag)
//			{
//				flag=false;
//				count++;	
//			}	
		}
		return count;
	}
}

public class _8_CountNumberofWord 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Name : ");
		String a=sc.nextLine();
		sc.close();
		System.out.println("the number of Latter in your name are : " +Count.countWord(a));
//		System.out.println("the number of words in your name are : " +Count.countWord(a));
	}
}
