package _3_array;

public class commanElementsInTwoArray 
{
	public static void main(String[] args) 
	{
		int arr1[]= {12, 45, 43, 23, 22, 21, 90};
		int arr2[]= {10, 9, 11, 20, 21, 22, 24, 25};
		for(int i=0; i<arr1.length; i++)
		{
			for (int j=0; j<arr2.length; j++)
			{
				if (arr1[i]==arr2[j])
					System.out.println(arr1[i]);
			}
		}
	}
	
}
