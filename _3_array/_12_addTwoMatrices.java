package _3_array;

import java.util.Scanner;

//WAP to add two matrices of the same size
public class _12_addTwoMatrices 
{
	public static void main(String[] args) 
	{
		int row, col;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of rows");
		row = sc.nextInt();
		
		System.out.println("Enter the size of columns ");
		col= sc.nextInt();
		
		int array1 [] [] =new int [row][col];
		int array2 [] [] =new int [row][col];
		int sum [] [] = new int [row] [col]; 
		
		System.out.println("Enter the elements in First matrix");
		for (int ro=0; ro<row; ro++)
		{
			for (int co=0; co<col; co++)
			{
				array1 [ro] [co] = sc.nextInt();
			}
		}
		
		System.out.println("Enter the elements in Second matrix");
		for (int ro=0; ro<row; ro++)
		{
			for (int co=0; co<col; co++)
			{
				array2 [ro] [co] = sc.nextInt();
			}
		}
		
		for (int ro=0; ro<row; ro++)
		{
			for (int co=0; co<col; co++)
			{
				sum [ro] [co] = array1[ro][co] + array2 [ro] [co];
			}
		}
		
		System.out.println("The sum of the matrix are : ");
		for (int ro=0; ro<row; ro++)
		{
			for (int co=0; co<col; co++)
			{
				System.out.print(sum[ro][co]+"\t");
			}
			System.out.println();
		}
	}
}
