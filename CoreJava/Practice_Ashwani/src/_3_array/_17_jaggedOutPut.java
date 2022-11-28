package _3_array;
/*
WAP to print Jagged array output are:
 	0 1 2 
     3 4 
   5 6 7
  8 9 10 11 
 */
public class _17_jaggedOutPut 
{
	public static void main(String[] args) 
	{
		int arr[] [] = new int [4] [];
		
		//First row has 3 column
		arr[0]=new int [3];
		//Second row has 2 column
		arr[1]=new int [2];
		// Third row has 3 column
		arr[2]=new int [3];
		// Fourth row has 4 column
		arr[3]=new int [4];
		
		//initializing array
		int count =0;
		for(int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
			{
				arr[i] [j] = count ++;
			}
		}
		// Displaying the value of 2D jagged array
		
		System.out.println("Contents of 2D Jagged Array...");
		
		for(int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
			{
				System.out.print(arr[i] [j] +" ");
			}
			System.out.println();	
		}
	}
}
