package _7_Inner_Class;
/*
 WAP to create Static inner class with a static method....
 */
class Outer
{
	static class Inner
	{
		static void getAddition(int x, int y)
		{
			int z=x+y;
			System.out.println("Result of additon is : "+z);
		}
	}
}

public class _1_staticInnerWithStaticMethod 
{
	public static void main(String[] args) 
	{
		Outer.Inner.getAddition(65, 90);
	}
}
