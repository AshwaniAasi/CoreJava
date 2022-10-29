package _3_array;

//WAP to find the index and position of an array elements.
public class _5_findIndexPosition 
{
	public static void main(String[] args) 
	{
		int arr[]= {10,12,13,14,15,16,17,18,19,20};
		int index=0, num=15;
		boolean b=false;
		for (int i=0; i<=10-1;i++)
		{
			if(num==arr[i])
			{
				b=true;
				index=i;
			}
		}
		if(b)
		{
			System.out.println("index of "+num+" is "+index+" and position is : "+(index+1));
		}
		else
			System.out.println(num+" is not found !");
	}
}
