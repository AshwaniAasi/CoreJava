package _3_array;

import java.util.Scanner;

/*
 	WAP to insert an elements (specific position) into an array.
 */
public class _7_insertSpeEleWithPosition 
{
	public static void main(String[] args) 
	{
		int n, num, position, index=0;
		boolean found=false;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of elements in the array: ");
		n=s.nextInt();
		int my_arr[] = new int[n+1];
		
		System.out.println("Enter the elements of array: ");
		for(int i=0; i<n;i++)
		{
			my_arr[i]=s.nextInt();
		}
		System.out.println("Array elements are: ");
		for(int i=0; i<n; i++)
		{
			System.out.print(my_arr[i]+" ");
		}
		System.out.println("\nEnter the elements you want to insert: ");
		num=s.nextInt();
		
		System.out.println("\nEnter the position wherer you want to insert");
		position=s.nextInt();
		if(position<=my_arr.length)
		{
			for(int i=my_arr.length-1; i>=(position-1); i--)
			{
				my_arr[i]=my_arr[i-1];
			}
			my_arr[position-1]=num;
		}
		else
		{
			System.out.println("Please enter correct position");
		}
		System.out.println("Array after inserting the element");
		for(int i=0; i<my_arr.length; i++)
		{
			System.out.print(my_arr[i]+" ");
		}
	}
}
