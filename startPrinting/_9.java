package startPrinting;
/*
 
 * * * * * 
 * * * * 
  * * * 
   * * 
    * 

 */
public class _9 
{
	public static void main(String[] args) 
	{
		for(int i=1; i<=5; i++)
		{
			for(int k=i;k<(i*2)-1 ;k++)
			{
				System.out.print(" ");
			}
			for(int j=i; j<=5; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
