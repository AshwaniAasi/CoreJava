package Array_Demo;

public class firstDublicateElement 
{
	public static void main(String[] args) 
	{
		boolean b=false;
		int arr[]= {60, 70, 50, 55, 45, 34, 32, 34, 322, 43, 90, 55, 88};
	//	String arr[]= {"ram","shyam","rahul","neeraj","amit"};
		for (int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[i]);
					b=true;
				}
			}
			if (b)
			{
				break;
			}
		}
	}
}
