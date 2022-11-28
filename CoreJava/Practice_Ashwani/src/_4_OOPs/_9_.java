package _4_OOPs;

/*
 WAP to create interface A in this interface we have two method meth1 & meth2. Implements this interface in 
 another class named MyClass.
 */

interface A
{
	void meht1();
	void meth2();
}
class MyClass implements A
{
	public void meht1() 
	{
		System.out.println("I am meth1 inside MyClass");
	}

	public void meth2()
	{
		System.out.println("I am meth2 inside MyClass");
	}
	
}
public class _9_ 
{
	public static void main(String[] args) 
	{
		MyClass mc=new MyClass();
		mc.meht1();
		mc.meth2();
	}
}
