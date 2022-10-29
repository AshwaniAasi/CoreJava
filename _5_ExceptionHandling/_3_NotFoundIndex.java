package _5_ExceptionHandling;

import java.util.Scanner;

/*
 	WAP to access array data from array on the basis of index and handle the exception if index not found. 
 */
public class _3_NotFoundIndex 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the input");
		Scanner s=new Scanner(System.in);
		int arr[] = {6,9,1,5,8};
		System.out.println("Array elements are : ");
		for (int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+", ");
		}
		System.out.println("\nEnter the index number");
		int index=s.nextInt();
		s.close();
		
		try 
		{
			System.out.println("arr[" + index + "] = " + arr[index]);
		} 
		catch (Exception e)
		{
			System.err.println("Exception occuring due to array length \nPlease put value in limit of array length.");
		}
		finally
		{
			System.out.println("End of the Program");
		}
	
	}
}
