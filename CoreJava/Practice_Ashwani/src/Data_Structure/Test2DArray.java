package Data_Structure;

public class Test2DArray 
{
	public static void main(String[] args) 
	{
//		int [][]a=new int [3][];
//		a[0]=new int[34];
//		a[1]=new int[45];
//		a[2]=new int[574];
//		a[3]=new int[46];
//		a[0][0]=10;
		
		int[][]a= {{10 , 20 , 30, 40}, {50, 60, 70} , {80,90,100,200,300} };
		
		for (int i=0; i<=a.length;i++)
		{
			for(int j=0; j<a.length; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println(a);
		System.out.println(a[0]);
	}
}
