package Data_Structure;

class Test3DArray 
{
	public static void main(String[] args) 
	{
		int [ ]  [ ]  [ ] a= { { { 10, 20, 30 } , { 40, 50, 60 } } ,{ {70, 80, 90 } , {100 , 200 , 300 } } };
		
		System.out.println(a); //[[[=> 3D, I => integer @ 2c7b84de=> hexadecimal code
		System.out.println(a[1]); //[[=> 2D, I=> integer @ 3fee733d=> hexadecimal code
		System.out.println(a[0][0]); //[=> 1D,  I=>integer @ 5acf9800=> hexadecimal code
		System.out.println(a[0][0][0]); //index 0,0,0 => 10
		System.out.println(a.length); //2
		System.out.println(a[0][0][1]); //index 0,0,1 => 20
		System.out.println(a[0][0][2]); //index 0,0,2 => 30
	//	System.out.println(a[0][0][3]); //Exception :  java.lang.ArrayIndexOutOfBoundsException
		System.out.println(a[1][0][0]); // index 1,0,0 =>70
		System.out.println("============================================");
		for(int i=0; i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				for(int k=0; k<a[i][j].length; k++)
				{
					System.out.print(a[i][j][k]+"   ");
				}
				System.out.println();
			}
		}
		
		
	}
}
