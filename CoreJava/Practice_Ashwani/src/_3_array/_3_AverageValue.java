package _3_array;

//WAP to calculate the average value of array elements.
public class _3_AverageValue 
{
	public static void main(String[] args) 
	{
		double sum=0;
		int arr[]= {11,12,13,14,15,16,17,18,19,20};
		for (int i:arr)
		{
			sum +=i;
		}
		double avg=sum/arr.length;
		System.out.println("The sum of array is : "+sum);
		System.out.println("The average value of this array is : "+avg);
	}
}
