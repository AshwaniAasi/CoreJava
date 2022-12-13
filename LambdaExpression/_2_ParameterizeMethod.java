package LambdaExpression;

interface LambdaDemo2
{
	abstract void getDisplay(String s);
}

public class _2_ParameterizeMethod
{
	public static void main(String[] args) 
	{

		LambdaDemo2 ld= (String s) ->System.out.println(s);
		ld.getDisplay("Ashwani");
		
	}
}
