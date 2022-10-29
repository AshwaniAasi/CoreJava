package _3_array;

import java.util.Scanner;
/*
 WAP to find Largest number in an array.
 */
public class _1_LargestNumber 
{
	public static void main(String[] args) 
	{
		int max;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int num=sc.nextInt();
		
		int [] a= new int[num];
		System.out.println("Enter elements of array : ");
		for (int i=0; i<num; i++)
		{
			a[i]=sc.nextInt();
		}
		sc.close();
		max=a[0];
		for (int i=0; i<num; i++)
		{
			if (max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println("maximum value : "+max);
	}
}
