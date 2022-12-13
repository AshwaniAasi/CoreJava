package LambdaExpression;

interface LambdaDemo3
{
	abstract void getNumber(String s, int n);
}

public class _3_MultipleParameters
{
	public static void main(String[] args) 
	{
	
		LambdaDemo3 ld3=(s1, n1)-> System.out.println( "Name of Student : "+s1+"\nNumber of Student :"+n1);;
		ld3.getNumber("Anuradha", 560);
		
	}

}
