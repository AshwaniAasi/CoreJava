package _3_array;

//WAP to Test if an array contains a specific value.
class _4_testSpecificValue
{
	public static void main(String[] args) 
	{
		int find=20;
		boolean b=false;
		int arr[]= {10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		for (int i=0; i<=arr.length-1; i++)
		{
			if (find==arr[i])
			{
				b=true;
			}
		}
		if(b)
		{
			System.out.println("You Enter : "+find+" is found in the list ");
		}
		else
			System.out.println("You Enter : "+find+" isn't found in the list ");
	}
}