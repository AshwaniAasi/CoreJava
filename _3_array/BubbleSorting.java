package _3_array;

public class BubbleSorting
{
// static void sortingAlgo(int [] a)
//	{
	public static void main(String[] args) 
	{
		int []arr= {40, 20, 55, 70, 80, 10, 90, 60};
	//	BubbleSorting.sortingAlgo(arr);

		for (int pass=0; pass<arr.length; pass++)
		{
			boolean b=false;
			int temp;
			
			for (int i=0; i<arr.length-1-pass; i++)
			{
				if ( arr[i]>arr[i+1])
				{
					temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
					b=true;
				}
			}
		}
		System.out.println("Final List : ");
		for (int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	}
