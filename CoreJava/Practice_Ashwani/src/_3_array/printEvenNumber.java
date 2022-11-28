package _3_array;

public class printEvenNumber 
{
	public static void main(String[] args) 
	{
		int even_count=0, odd_count=0;
		int arr[]= {60, 70, 50, 55, 45, 34, 32, 34, 34, 322, 43, 90, 55, 88};
		for (int i=0; i<arr.length; i++)
		{
			if(arr[i]%2==0)
				{
				even_count=even_count+1;
				}
			else
				odd_count=odd_count+1;
		}
		System.out.println("Even Numbers are : "+even_count);
		System.out.println("Odd Numbers are : "+odd_count);		
	}
}
