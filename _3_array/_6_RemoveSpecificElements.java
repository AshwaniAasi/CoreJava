package _3_array;

import java.util.Scanner;

// WAP to remove the specific elements from an array.
public class _6_RemoveSpecificElements 
{
	public static void main(String[] args) 
{	
	int index=0;	
	boolean flag=false;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the length of array");
	int size=sc.nextInt();
	int arr[]=new int [size];
	
	System.out.println("Enter the elements of array : ");
	for (int a=0; a<arr.length;a++)
	{
		arr[a]=sc.nextInt();
	}

	System.out.println("Your array elements is :");
	for(int b=0; b<arr.length;b++)
	{
		System.out.print(arr[b]+", ");
	}
	System.out.println("\nEnter the deleting element : ");
	int del=sc.nextInt();
	sc.close();
	for (int c=0; c<arr.length;c++)
	{
		if(del==arr[c])
		{
			flag=true;
			index=c;
		}
	}
	if (flag)
	{
		for (int d=index; d<arr.length-1;d++)
		{
			arr[d]=arr[d+1];
		}
		System.out.println("After deleting element new array is : ");
		for (int e=0; e<arr.length-1; e++)
		{
			System.out.print(arr[e]+", ");
		}
	}
	else
		System.out.println("The element is not present.");
	
	
	
	
	
	}
}
