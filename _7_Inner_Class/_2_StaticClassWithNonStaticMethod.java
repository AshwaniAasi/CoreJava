package _7_Inner_Class;
/*
 WAP to create a static inner class with a non-static method
 */

class Outer1
{
	static class inner
	{
		void getAdd(int a, int b)
		{
			int z=a+b;
			System.out.println(z);
		}
	}
	
}
public class _2_StaticClassWithNonStaticMethod 
{
	public static void main(String[] args) 
	{
		int no1=10, no2=40;
		Outer1.inner ob=new Outer1.inner();
		ob.getAdd(no1, no2);
		
	}
}
