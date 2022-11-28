package _3_array;

public class findDuplicateElements 
{
	public static void main(String[] args) 
	{
		int temp;
		int aa[]= {60,70,50,55,45,34,32,34,34,322,43,90,88};
		for (int p=0; p<aa.length; p++)
		{
			for (int tr=0; tr<aa.length-1; tr++ )
			{
				if(aa[tr]>aa[tr+1])
				{
					temp=aa[tr];
					aa[tr]=aa[tr+1];
					aa[tr+1]=temp;
				}	
			}
		}
		for (int i=0; i<aa.length; i++)
		{
			System.out.print(aa[i]+", ");
		}
	}
}
