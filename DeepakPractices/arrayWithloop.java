
public class arrayWithloop 
{
	public static void main(String[] args) 
	{
		int startingNumber=18;
		int lastNumber=20;		
		int arr[]=new int [lastNumber];
		for (int i=1; i<=lastNumber-1; i++)
		{
			arr[i]=i;			
		}
		for( int i=startingNumber; i<arr.length; i++ )
		{
			System.out.print(arr[i]+ " ");
		}
	}
}
