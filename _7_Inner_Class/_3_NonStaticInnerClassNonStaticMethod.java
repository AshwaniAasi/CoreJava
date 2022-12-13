package _7_Inner_Class;

import _7_Inner_Class.Outer2.Inner;

/*
 WAP to create a non-static inner class with a non-static method
 */

class Outer2
{
	class Inner
	{
		void getAdd(int a, int b)
		{
			int z=a+b;
			System.out.println(z);
		}
	}
}
public class _3_NonStaticInnerClassNonStaticMethod 
{
	public static void main(String[] args) 
	{
		int a=30, b=40;
		// creating object of outer class then call  inner class through object of inner class then able to call method.
		Outer2 ot=new Outer2();
		Inner in = ot.new Inner();
		in.getAdd(a, b);
		
	}
	
}
