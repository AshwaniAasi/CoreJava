package _3_array;
/*
 	WAP to sort a numeric array.
 */
public class _9_sortNumeric 
{
	public static void main(String[] args) 
	{
		boolean flag=false;
		int  temp=0;
		int [] arr= {11,23,45,433,5444,45,76,54,57,99, 8, 07,54,22,41};
		for(int a=0; a<arr.length; a++)
		{
			for (int b=a; b<arr.length; b++)
			{
				if( arr[a]>arr[b])
				{
					temp=arr[a];
					arr[a]=arr[b];
					arr[b]=temp;
				}
			}
			System.out.print(arr[a]+", ");
		}
		System.out.println("\n========================="); 

			System.out.println("Maximum array is : "+arr[arr.length-1]);	
			System.out.println("Minimum number of this array is : "+arr[0]);
		
	}
}
