package _5_ExceptionHandling;
//WAP to demonstrate the Arithmetic Exception Handling?
public class _1_Arithmetic 
{
	public static void main(String[] args) 
	{
		int a=10, b=0;
		
		try 
		{
			int c=a/b;
			System.out.println("output : "+c);
		} 
		catch (Exception e) 
		{
				System.out.println("Output : "+e);
		}
		finally
		{
			System.out.println("End of Program");
		}
	}
}
