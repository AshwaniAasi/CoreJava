package Data_Structure;

import java.util.Arrays;

class ArrayDemo 
{
	public static void main(String[] args) 
	{
		//String []a= {"Ram","Shyam","Radha", "Ashwani", "Anuradha" };
		int []a= {2300,5433,5454,5345,6646,5367,346};
		Arrays.parallelSort(a);
		Arrays.sort(a);
		//for (String i:a)
		for (int i:a)
		{
			System.out.println(i+" ");
		}
	}
}
