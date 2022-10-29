package top50JavaProgram;
/*
  	Fibonacci series using recursion:-
  	we can use a for loop to print Fibonacci series.
 
 	public static void printFibonacciSeries(int count)
	{
		int a=0;
		int b=1;
		int c=1;
		for (int i=1; i<=count;i++)
		{
			System.out.println(a+" ");
			a=b;
			b=c;
			c=a+b;
		}
	}
	
 * The fibonacci number is generated by adding the previous two number F(N)=F(N-1)+F(N-2). we can use recursion to 
 * print fibonacci series. 
 */
public class _5_FibonacciSeries 
{
	public static int fibonacci(int n)
	{
		if (n<=1)
		{
			return n;
		}
		return fibonacci(n-1)+ fibonacci(n-2);
	}
	public static void main(String[] args) 
	{
		int n=10;
		System.out.println(fibonacci(n));
	}
}