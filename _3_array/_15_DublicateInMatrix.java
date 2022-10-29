package _3_array;

import java.util.Scanner;

//WAP to find the duplicate values of an matrix array of integer value.
/*error
1 3 6 Exception in thread "main" 
9 2 1 
3 9 7 

Duplicate elements are : 
No dublicate Found
No dublicate Found
java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
	at _3_array._15_DublicateInMatrix.main(_15_DublicateInMatrix.java:53)
 */

public class _15_DublicateInMatrix 
{
	public static void main(String[] args) 
	{
	
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of row ");
		int row =sc.nextInt();
		System.out.println("Enter the size of column ");
		int col= sc.nextInt();
		
		int arr[] [] = new int [row][col];
		
		System.out.println("Enter the elements in matrix : ");
		
		for (int a=0; a<row; a++)
		{
			for (int b=0; b<col; b++)
			{
				arr[a][b]=sc.nextInt();
			}
		}
		for (int a=0; a<row; a++)
		{
			for (int b=0; b<col; b++)
			{
				System.out.print(arr[a][b]+ " ");
			}
			System.out.println();
		}
		
		int val[] = new int [row*col];
		int x=0;
		for (int a=0; a<row; a++)
		{
			for(int b=0; b<col; b++)
			{
				val[x]=arr[a][b];
				x++;
				
			}
		}
		System.out.println("\nDuplicate elements are : ");
		for (int a=0; a<val.length; a++)
		{
			for (int b=a+1; b<val.length;b++)
			{
				if (arr[a]==arr[b] && a !=b)
				{			
				System.out.println(val[a]);
				}
				else 
					System.out.println("No dublicate Found");
				}
			}
		}
	}
