package _6_String_WrapperClasses;

import java.util.Scanner;

/*
 WAP to remove user input charecter within String.
 */
public class RemoveDuplicate
{
	public static void main(String[] args) 
	{
		String str="I am very Intelijent person";
		
		Scanner sc=new Scanner(System.in);
		
		char removeChar='e';
		
		char[] arr=str.toCharArray();
		
		char j = 0;
		int count = 0;
		
		for(int i=0; i<str.length(); i++)
		{
			if(arr[i] != removeChar)
			{
				arr[j]=arr[i];
				j++;
			}
			else
			{
				count++;
			}
		}
		System.out.println(arr);
		
//		while(count<0)
//		{
//			arr[j]=' ';
//			j++;
//			count--;
//		}
		
		
		
		
	}
}
