package _3_array;

import java.util.Scanner;

// WAP to convert 2D array to 1D array.
public class _14_2DConvert1D 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row size of matrix");
		int row=sc.nextInt();
		System.out.println("Enter the column size of matrix");
		int col=sc.nextInt();
		
		int arr[] [] = new int [row] [col];
		
		System.out.println("Enter the elements of matrix : ");
		
		for (int a=0; a<row; a++)
		{
			for (int b=0; b<col; b++)
			{
				arr [a] [b] = sc.nextInt();
			}
		}
		
		
		
		System.out.println("Your 2D matrix are : ");
		for (int a=0; a<row; a++)
		{
			for (int b=0; b<col; b++)
			{
				System.out.print(arr[a] [b]+" ");
			}
			System.out.println();
		}
		
		int val [] = new int [row*col];
		int x=0;
		for (int a=0; a<row; a++)
		{
			for (int b=0; b<col; b++)
			{
				val[x]=arr[a] [b];
				x++;				
			}
		}
		System.out.println("\nAfter conversion 2D into 1D elements are : ");
		
		for (int a=0; a<val.length; a++)
		{
			System.out.print(val[a]+", ");
		}
		
		
		
		
		
		
	}
}
