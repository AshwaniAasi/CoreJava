package _2_controlStatement;
// WAP to print series: 1 3 6 10 15 
public class _30_series 
{
	public static void main(String[] args) 
	{
		int n=5;
		for (int i=1; i<=n;i++)
		{
			int num=(i*(i+1))/2;
			System.out.print(num+" ");
		}
	}
}
