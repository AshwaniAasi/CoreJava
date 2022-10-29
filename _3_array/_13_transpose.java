package _3_array;

import java.util.Scanner;

// WAP to do the transpose
public class _13_transpose 
{
	public static void main(String[] args) 
	{
		int row, col;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of rows");
		row = sc.nextInt();
		
		System.out.println("Enter the size of columns ");
		col= sc.nextInt();
		
		int array [] [] =new int [row][col];
		int trans [] [] = new int [row] [col];
		
		System.out.println("Enter the elements of array ");
		
		for ( int ro=0; ro<row; ro++)
		{
			for (int co=0; co<col; co++)
			{
				array [ro][co]=sc.nextInt();
			}
		}
	
		for ( int ro=0; ro<row; ro++)
		{
			for (int co=0; co<col; co++)
			{
				trans [ro] [co]= array [co][ro];
			}
		}
		
		System.out.println("Before transpose elements are : ");
		
		for ( int ro=0; ro<row; ro++)
		{
			for (int co=0; co<col; co++)
			{
				System.out.print(array[ro][co]+"\t");
			}
			System.out.println();
		}
		System.out.println("After transpose elements are : ");
		
		for ( int ro=0; ro<row; ro++)
		{
			for (int co=0; co<col; co++)
			{
				System.out.print(trans[ro][co]+"\t");
			}
			System.out.println();
		}
		
	}
}
