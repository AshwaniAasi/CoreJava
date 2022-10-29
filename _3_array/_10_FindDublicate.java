package _3_array;

//WAP to find the duplicate values of an array of integer values.
public class _10_FindDublicate 
{
	public static void main(String[] args) 
	{
		boolean flag=false;
		int [] arr= {11,23,45,433,5444,45,76,54,57,99, 8, 07,54,22,41};
		System.out.println("The dublicate elements are : ");
		for(int a=0; a<arr.length;a++)
		{
			for(int b=a+1; b<arr.length; b++)
			{
				if(arr[a]==arr[b])
				{
				//	System.out.print(arr[b]+", ");
					System.out.print(arr[a]+", ");
				}
			}
		}
	}
}
