package _3_array;
//without swaping function
public class findDuplication2 
{
	public static void main(String[] args) 
	{
		int count=0;
		int arr[]= {60, 70, 50, 55, 45, 34, 32, 34, 34, 322, 43, 90, 55, 88};
		for (int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]==arr[j])
				{
					count=count+1;
					System.out.println(count+". "+arr[i]);
				}
			}
		}
	}
}
