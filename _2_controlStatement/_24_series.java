package _2_controlStatement;
/*
 	Program to print Arithmetic Progression series: 2 5 8 11 14
 */
public class _24_series 
{
	public static void main(String[] args) 
	{
		int diff=3;
		int a=2;
		for (int i=0; i<=5; i++)
		{
			System.out.print(a+" ");
			
			a=a+diff;
		}
				
	}
	
}
