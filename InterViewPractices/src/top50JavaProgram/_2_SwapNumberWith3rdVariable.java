package top50JavaProgram;
/*
 * It's a slightly tricky question. It's a three step process. It's better visualized in code.
 
 	int a=10;
	int b=20;
	b=b+a; // now b is sum of both the numbers i.e 30
	a=b-a; // now b-a => (b+a)-a => b ( a is swapped) i.e 20
	b=b-a; // (b+a)-b=a(b is swapped) i.e 10
	
	We can't return multiple variable in java. Since Java is Pass-by-value and these are primitive data type, their values won't 
	change. For example, below swap function will not change the input integer value.
 */

public class _2_SwapNumberWith3rdVariable 
{
	public static void swapNumber(int a , int b)
	{
		b=a+b;
			a=b-a;
			b=b-a;
			
		System.out.printf("a is %d, b is %d", a, b);
	}
	public static void main(String[] args) 
	{
		int a=10;
		int b=20;
		swapNumber(a, b);
		
	}
}
