package _3_array;

public class AnonymouseArray 
{
	public static void main(String[] args) 
	{
		AnonymouseArray.sum(new int [] {10,50,84,39});
	}
	static void sum(int [] a)
	{
		int sum=0;
		for (int i=0; i<a.length; i++)
		{
			sum+=a[i];
		}
		System.out.println(sum);
	}
}
