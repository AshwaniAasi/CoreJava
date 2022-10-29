package _3_array;
/*
 	WAP to find the maximum and minimum value of an array.
 */
public class _8_MaxMinValueInArray 
{
	public static void main(String[] args) 
	{
		int temp;
		int arr[]= {12, 15, 6, 300, 1, 256, 74};
		for(int p=0; p<arr.length; p++)
		{
			for(int tr=0; tr<arr.length-1; tr++)
			{
				if(arr[tr]>arr[tr+1])
				{
					temp=arr[tr];
					arr[tr]=arr[tr+1];
					arr[tr+1]=temp;	
				}
			}
		}
		System.out.println("After the sorting the array");
		for(int a=0; a<arr.length; a++)
		{
			System.out.print(arr[a]+", ");
		}
		System.out.println("\n====================================");
		System.out.println("Maximum value is : "+arr[arr.length-1]+" \n& Minimum value is : "+arr[0]);	
	}
}
