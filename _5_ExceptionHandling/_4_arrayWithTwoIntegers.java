package _5_ExceptionHandling;

import java.util.Scanner;

/*
 	Create a class that takes two integer from the user and one array.
 	Divide the two integers and store output in a variable named index.
 	Now get the element from the array at that index value (use the variable index here)
 	Perform the ArrayIndexOutOfBoundsException and Arithmetic Exception.
 */
public class _4_arrayWithTwoIntegers 
{
	public static void main(String[] args) 
	{
		int no1, no2, index=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of both variable:");
		no1=sc.nextInt(); no2=sc.nextInt();
		sc.close();
		
		int arr[] = {6, 5, 41, 85, 2, 63, 45};
		
		System.out.println("Your array elements are : ");
		for (int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+", ");
		}
		
		try
		{
			index=no1/no2;
			System.out.println("\narray [ "+index+" ] = "+arr[index]);
		} 
		catch (ArithmeticException e1 )
		{
			System.err.println("\nPlease Enter valid number for Division");
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.err.println("\nYour result for array size not match");
		}
	
		finally
		{
			System.out.println("\nEnd of program");
		}
	}
}
