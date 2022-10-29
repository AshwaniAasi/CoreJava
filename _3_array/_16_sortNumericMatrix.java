package _3_array;

import java.util.Scanner;
//WAP to sort a numeric matix rows.
public class _16_sortNumericMatrix 
{
	public static void main(String[] args) 
	{
		int n, m;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows of matrix : ");
		m=sc.nextInt();
		System.out.println("Enter the number of Column of matrix : ");
		n=sc.nextInt();
		
		int arr [] [] =new int [m][n];
		
		System.out.println("Enter the elements of array : ");
		
		for ( int i=0; i<n; i++)
		{
			for (int j=0; j<m; j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		sc.close();
		
		System.out.println("Array Before sorting.....");
		for ( int i=0; i<n; i++)
		{
			for (int j=0; j<m; j++)
			{
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
		
		System.out.println("************************************************************");
		
		if (m==n)
		{
			for(int k=0; k<n; k++)
			{
				for ( int i=0; i<n; i++)
				{
					for (int j=i; j<m; ++j)
					{
						if(arr[k][i]>arr[k][j])
						{
							int swap=arr[k][j];
							arr[k][j]=arr[k][i];
							arr[k][i]=swap;
						}
					}
				}
			}
		}
		else
		{
			System.out.println("Matrix should be square matrix");
		}
		
		System.out.println("Array after sorting....");
		
		for ( int i=0; i<n; i++)
		{
			for (int j=0; j<m; j++)
			{
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
		
		
	}

}
